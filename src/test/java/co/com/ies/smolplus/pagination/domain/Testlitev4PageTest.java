package co.com.ies.smolplus.pagination.domain;

import static org.assertj.core.api.Assertions.*;
import static co.com.ies.smolplus.pagination.domain.Testlitev4PagesFixture.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.com.ies.smolplus.UnitTest;
import co.com.ies.smolplus.error.domain.MissingMandatoryValueException;

@UnitTest
class Testlitev4PageTest {

  @Test
  void shouldGetEmptySinglePageWithoutContent() {
    Testlitev4Page<String> page = Testlitev4Page.singlePage(null);

    assertEmptyPage(page);
  }

  @Test
  void shouldGetEmptySinglePageFromBuilderWithoutContent() {
    Testlitev4Page<?> page = Testlitev4Page.builder(null).build();

    assertEmptyPage(page);
  }

  private void assertEmptyPage(Testlitev4Page<?> page) {
    assertThat(page.content()).isEmpty();
    assertThat(page.currentPage()).isZero();
    assertThat(page.pageSize()).isZero();
    assertThat(page.totalElementsCount()).isZero();
  }

  @Test
  void shouldGetSinglePage() {
    Testlitev4Page<String> page = Testlitev4Page.singlePage(List.of("test", "dummy"));

    assertSinglePage(page);
  }

  @Test
  void shouldGetSinglePageFromBuilderWithContentOnly() {
    Testlitev4Page<String> page = Testlitev4Page.builder(List.of("test", "dummy")).build();

    assertSinglePage(page);
  }

  private void assertSinglePage(Testlitev4Page<String> page) {
    assertThat(page.content()).containsExactly("test", "dummy");
    assertThat(page.currentPage()).isZero();
    assertThat(page.pageSize()).isEqualTo(2);
    assertThat(page.totalElementsCount()).isEqualTo(2);
    assertThat(page.pageCount()).isEqualTo(1);
  }

  @Test
  void shouldGetFullPage() {
    Testlitev4Page<String> page = pageBuilder().build();

    assertThat(page.content()).containsExactly("test");
    assertThat(page.currentPage()).isEqualTo(2);
    assertThat(page.pageSize()).isEqualTo(10);
    assertThat(page.totalElementsCount()).isEqualTo(21);
    assertThat(page.pageCount()).isEqualTo(3);
  }

  @Test
  void shouldNotMapWithoutMapper() {
    assertThatThrownBy(() -> pageBuilder().build().map(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("mapper");
  }

  @Test
  void shouldMapPage() {
    Testlitev4Page<String> page = pageBuilder().build().map(entry -> "hey");

    assertThat(page.content()).containsExactly("hey");
    assertThat(page.currentPage()).isEqualTo(2);
    assertThat(page.pageSize()).isEqualTo(10);
    assertThat(page.totalElementsCount()).isEqualTo(21);
    assertThat(page.pageCount()).isEqualTo(3);
  }

  @Test
  void shouldNotBeLastForFirstPage() {
    assertThat(pageBuilder().currentPage(0).build().isNotLast()).isTrue();
  }

  @Test
  void shouldBeLastWithOnePage() {
    assertThat(Testlitev4Page.singlePage(List.of("d")).isNotLast()).isFalse();
  }

  @Test
  void shouldBeLastPageWithoutContent() {
    Testlitev4Page<Object> page = Testlitev4Page.builder(List.of()).currentPage(0).pageSize(1).totalElementsCount(0).build();
    assertThat(page.isNotLast()).isFalse();
  }

  @Test
  void shouldBeLastForLastPage() {
    assertThat(pageBuilder().currentPage(2).build().isNotLast()).isFalse();
  }

  @Test
  void shouldGetPageFromElements() {
    Testlitev4Page<String> page = Testlitev4Page.of(List.of("hello", "java", "world"), new Testlitev4Pageable(1, 1));

    assertThat(page.currentPage()).isEqualTo(1);
    assertThat(page.hasNext()).isTrue();
    assertThat(page.hasPrevious()).isTrue();
    assertThat(page.pageCount()).isEqualTo(3);
    assertThat(page.pageSize()).isEqualTo(1);
    assertThat(page.content()).containsExactly("java");
  }

  @Test
  void shouldGetEmptyPageFromOutOfBoundElements() {
    Testlitev4Page<String> page = Testlitev4Page.of(List.of("hello", "java", "world"), new Testlitev4Pageable(4, 1));

    assertThat(page.currentPage()).isEqualTo(4);
    assertThat(page.hasNext()).isFalse();
    assertThat(page.hasPrevious()).isTrue();
    assertThat(page.pageCount()).isEqualTo(3);
    assertThat(page.pageSize()).isEqualTo(1);
    assertThat(page.content()).isEmpty();
  }

  @Test
  void shouldGetPageWithLessThanExpectedElements() {
    Testlitev4Page<String> page = Testlitev4Page.of(List.of("hello", "java", "world"), new Testlitev4Pageable(0, 4));

    assertThat(page.currentPage()).isZero();
    assertThat(page.hasNext()).isFalse();
    assertThat(page.hasPrevious()).isFalse();
    assertThat(page.pageCount()).isEqualTo(1);
    assertThat(page.pageSize()).isEqualTo(4);
    assertThat(page.content()).hasSize(3);
  }
}
