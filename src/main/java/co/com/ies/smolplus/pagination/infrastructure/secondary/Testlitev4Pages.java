package co.com.ies.smolplus.pagination.infrastructure.secondary;

import java.util.function.Function;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import co.com.ies.smolplus.error.domain.Assert;
import co.com.ies.smolplus.pagination.domain.Testlitev4Page;
import co.com.ies.smolplus.pagination.domain.Testlitev4Pageable;

public final class Testlitev4Pages {

  private Testlitev4Pages() {}

  public static Pageable from(Testlitev4Pageable pagination) {
    return from(pagination, Sort.unsorted());
  }

  public static Pageable from(Testlitev4Pageable pagination, Sort sort) {
    Assert.notNull("pagination", pagination);
    Assert.notNull("sort", sort);

    return PageRequest.of(pagination.page(), pagination.pageSize(), sort);
  }

  public static <S, T> Testlitev4Page<T> from(Page<S> springPage, Function<S, T> mapper) {
    Assert.notNull("springPage", springPage);
    Assert.notNull("mapper", mapper);

    return Testlitev4Page
      .builder(springPage.getContent().parallelStream().map(mapper).toList())
      .currentPage(springPage.getNumber())
      .pageSize(springPage.getSize())
      .totalElementsCount(springPage.getTotalElements())
      .build();
  }
}
