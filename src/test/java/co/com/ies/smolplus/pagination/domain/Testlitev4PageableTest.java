package co.com.ies.smolplus.pagination.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.com.ies.smolplus.UnitTest;
import co.com.ies.smolplus.error.domain.NumberValueTooHighException;
import co.com.ies.smolplus.error.domain.NumberValueTooLowException;

@UnitTest
class Testlitev4PageableTest {

  @Test
  void shouldNotBuildWithNegativePage() {
    assertThatThrownBy(() -> new Testlitev4Pageable(-1, 10))
      .isExactlyInstanceOf(NumberValueTooLowException.class)
      .hasMessageContaining("page");
  }

  @Test
  void shouldNotBuildWithPageSizeAtZero() {
    assertThatThrownBy(() -> new Testlitev4Pageable(0, 0))
      .isExactlyInstanceOf(NumberValueTooLowException.class)
      .hasMessageContaining("pageSize");
  }

  @Test
  void shouldNotBuildWithPageSizeOverHundred() {
    assertThatThrownBy(() -> new Testlitev4Pageable(0, 101))
      .isExactlyInstanceOf(NumberValueTooHighException.class)
      .hasMessageContaining("pageSize");
  }

  @Test
  void shouldGetFirstPageInformation() {
    Testlitev4Pageable pageable = new Testlitev4Pageable(0, 15);

    assertThat(pageable.page()).isZero();
    assertThat(pageable.pageSize()).isEqualTo(15);
    assertThat(pageable.offset()).isZero();
  }

  @Test
  void shouldGetPageableInformation() {
    Testlitev4Pageable pageable = new Testlitev4Pageable(2, 15);

    assertThat(pageable.page()).isEqualTo(2);
    assertThat(pageable.pageSize()).isEqualTo(15);
    assertThat(pageable.offset()).isEqualTo(30);
  }
}
