package co.com.ies.smolplus.pagination.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import co.com.ies.smolplus.common.domain.Generated;
import co.com.ies.smolplus.error.domain.Assert;

public class Testlitev4Pageable {

  private final int page;
  private final int pageSize;
  private final int offset;

  public Testlitev4Pageable(int page, int pageSize) {
    Assert.field("page", page).min(0);
    Assert.field("pageSize", pageSize).min(1).max(100);

    this.page = page;
    this.pageSize = pageSize;
    offset = page * pageSize;
  }

  public int page() {
    return page;
  }

  public int pageSize() {
    return pageSize;
  }

  public int offset() {
    return offset;
  }

  @Override
  @Generated
  public int hashCode() {
    return new HashCodeBuilder().append(page).append(pageSize).build();
  }

  @Override
  @Generated
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Testlitev4Pageable other = (Testlitev4Pageable) obj;
    return new EqualsBuilder().append(page, other.page).append(pageSize, other.pageSize).build();
  }
}
