package co.com.ies.smolplus.pagination.domain;

import java.util.List;

import co.com.ies.smolplus.pagination.domain.Testlitev4Page.Testlitev4PageBuilder;

public final class Testlitev4PagesFixture {

  private Testlitev4PagesFixture() {}

  public static Testlitev4Page<String> page() {
    return pageBuilder().build();
  }

  public static Testlitev4PageBuilder<String> pageBuilder() {
    return Testlitev4Page.builder(List.of("test")).currentPage(2).pageSize(10).totalElementsCount(21);
  }
}
