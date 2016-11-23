package com.company.myapp.lib;

/**
 * Visual elements in Dropsource, such as Elements, Pages, and Page Components,
 * have what are known as "variants" and "states". Variants are intended to be
 * used as runtime skins/styles/themes. As a variant is changed, the visual
 * entity must update its current styles using the
 * {@link DropsourceVaried#synchronizeStyle()} method.
 */
public interface DropsourceVaried {
  /**
   * Synchronizes this visual entity's style. The actual implementation is up to to
   * the subclass; however, generally the subclass will provide private "state"
   * and "variant" variables to keep track of which styles should be applied.
   */
  void synchronizeStyle();

  /**
   * Sets the variant of this visual entity to the given name.
   */
  void setVariant(String name);

  /**
   * Sets the state of this visual entity to the given name.
   */
  void setState(String name);

  /**
   * Returns the currently active variant.
   *
   * @return The String name of the variant
   */
  String getVariant();

  /**
   * Returns the currently active state.
   *
   * @return The String name of the state
   */
  String getState();
}