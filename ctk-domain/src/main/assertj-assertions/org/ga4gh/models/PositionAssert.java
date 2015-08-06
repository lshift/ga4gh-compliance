package org.ga4gh.models;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Position} specific assertions - Generated by CustomAssertionGenerator.
 */
public class PositionAssert extends AbstractAssert<PositionAssert, Position> {

  /**
   * Creates a new <code>{@link PositionAssert}</code> to make assertions on actual Position.
   * @param actual the Position we want to make assertions on.
   */
  public PositionAssert(Position actual) {
    super(actual, PositionAssert.class);
  }

  /**
   * An entry point for PositionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myPosition)</code> and get specific assertion with code completion.
   * @param actual the Position we want to make assertions on.
   * @return a new <code>{@link PositionAssert}</code>
   */
  public static PositionAssert assertThat(Position actual) {
    return new PositionAssert(actual);
  }

  /**
   * Verifies that the actual Position's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual Position's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Position's classSchema is not equal to the given one.
   */
  public PositionAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual Position we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting classSchema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualClassSchema = actual.getClassSchema();
    if (!Objects.areEqual(actualClassSchema, classSchema)) {
      failWithMessage(assertjErrorMessage, actual, classSchema, actualClassSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Position's position is equal to the given one.
   * @param position the given position to compare the actual Position's position to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Position's position is not equal to the given one.
   */
  public PositionAssert hasPosition(Long position) {
    // check that actual Position we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting position of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualPosition = actual.getPosition();
    if (!Objects.areEqual(actualPosition, position)) {
      failWithMessage(assertjErrorMessage, actual, position, actualPosition);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Position's referenceName is equal to the given one.
   * @param referenceName the given referenceName to compare the actual Position's referenceName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Position's referenceName is not equal to the given one.
   */
  public PositionAssert hasReferenceName(String referenceName) {
    // check that actual Position we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting referenceName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualReferenceName = actual.getReferenceName();
    if (!Objects.areEqual(actualReferenceName, referenceName)) {
      failWithMessage(assertjErrorMessage, actual, referenceName, actualReferenceName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Position's schema is equal to the given one.
   * @param schema the given schema to compare the actual Position's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Position's schema is not equal to the given one.
   */
  public PositionAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual Position we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting schema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualSchema = actual.getSchema();
    if (!Objects.areEqual(actualSchema, schema)) {
      failWithMessage(assertjErrorMessage, actual, schema, actualSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Position's strand is equal to the given one.
   * @param strand the given strand to compare the actual Position's strand to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Position's strand is not equal to the given one.
   */
  public PositionAssert hasStrand(Strand strand) {
    // check that actual Position we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting strand of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Strand actualStrand = actual.getStrand();
    if (!Objects.areEqual(actualStrand, strand)) {
      failWithMessage(assertjErrorMessage, actual, strand, actualStrand);
    }

    // return the current assertion for method chaining
    return this;
  }




}
