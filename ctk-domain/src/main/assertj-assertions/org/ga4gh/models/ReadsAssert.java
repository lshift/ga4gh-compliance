package org.ga4gh.models;

import org.assertj.core.api.AbstractAssert;

/**
 * {@link Reads} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ReadsAssert extends AbstractAssert<ReadsAssert, Reads> {

  /**
   * Creates a new <code>{@link ReadsAssert}</code> to make assertions on actual Reads.
   * @param actual the Reads we want to make assertions on.
   */
  public ReadsAssert(Reads actual) {
    super(actual, ReadsAssert.class);
  }

  /**
   * An entry point for ReadsAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myReads)</code> and get specific assertion with code completion.
   * @param actual the Reads we want to make assertions on.
   * @return a new <code>{@link ReadsAssert}</code>
   */
  public static ReadsAssert assertThat(Reads actual) {
    return new ReadsAssert(actual);
  }

}
