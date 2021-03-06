/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class HostOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HostOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HostOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_HostOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFontFamily(String value) {
    AdaptiveCardObjectModelJNI.HostOptions_fontFamily_set(swigCPtr, this, value);
  }

  public String getFontFamily() {
    return AdaptiveCardObjectModelJNI.HostOptions_fontFamily_get(swigCPtr, this);
  }

  public void setFontSizes(FontSizeOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_fontSizes_set(swigCPtr, this, FontSizeOptions.getCPtr(value), value);
  }

  public FontSizeOptions getFontSizes() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_fontSizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontSizeOptions(cPtr, false);
  }

  public void setSupportsInteractivity(boolean value) {
    AdaptiveCardObjectModelJNI.HostOptions_supportsInteractivity_set(swigCPtr, this, value);
  }

  public boolean getSupportsInteractivity() {
    return AdaptiveCardObjectModelJNI.HostOptions_supportsInteractivity_get(swigCPtr, this);
  }

  public void setColors(ColorOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_colors_set(swigCPtr, this, ColorOptions.getCPtr(value), value);
  }

  public ColorOptions getColors() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_colors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ColorOptions(cPtr, false);
  }

  public void setImageSizes(ImageSizeOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_imageSizes_set(swigCPtr, this, ImageSizeOptions.getCPtr(value), value);
  }

  public ImageSizeOptions getImageSizes() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_imageSizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageSizeOptions(cPtr, false);
  }

  public void setMaxActions(long value) {
    AdaptiveCardObjectModelJNI.HostOptions_maxActions_set(swigCPtr, this, value);
  }

  public long getMaxActions() {
    return AdaptiveCardObjectModelJNI.HostOptions_maxActions_get(swigCPtr, this);
  }

  public void setStrongSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_strongSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getStrongSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_strongSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public void setAdaptiveCard(AdaptiveCardOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_adaptiveCard_set(swigCPtr, this, AdaptiveCardOptions.getCPtr(value), value);
  }

  public AdaptiveCardOptions getAdaptiveCard() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_adaptiveCard_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AdaptiveCardOptions(cPtr, false);
  }

  public void setImageSet(ImageSetOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_imageSet_set(swigCPtr, this, ImageSetOptions.getCPtr(value), value);
  }

  public ImageSetOptions getImageSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_imageSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageSetOptions(cPtr, false);
  }

  public void setImage(ImageOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_image_set(swigCPtr, this, ImageOptions.getCPtr(value), value);
  }

  public ImageOptions getImage() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_image_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageOptions(cPtr, false);
  }

  public void setFactSet(FactSetOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_factSet_set(swigCPtr, this, FactSetOptions.getCPtr(value), value);
  }

  public FactSetOptions getFactSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_factSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FactSetOptions(cPtr, false);
  }

  public void setColumn(ColumnOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_column_set(swigCPtr, this, ColumnOptions.getCPtr(value), value);
  }

  public ColumnOptions getColumn() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_column_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ColumnOptions(cPtr, false);
  }

  public void setContainer(ContainerOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_container_set(swigCPtr, this, ContainerOptions.getCPtr(value), value);
  }

  public ContainerOptions getContainer() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_container_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerOptions(cPtr, false);
  }

  public void setColumnSet(ColumnSetOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_columnSet_set(swigCPtr, this, ColumnSetOptions.getCPtr(value), value);
  }

  public ColumnSetOptions getColumnSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_columnSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ColumnSetOptions(cPtr, false);
  }

  public void setTextBlock(TextBlockOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_textBlock_set(swigCPtr, this, TextBlockOptions.getCPtr(value), value);
  }

  public TextBlockOptions getTextBlock() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_textBlock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TextBlockOptions(cPtr, false);
  }

  public void setDateInput(DateInputOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_dateInput_set(swigCPtr, this, DateInputOptions.getCPtr(value), value);
  }

  public DateInputOptions getDateInput() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_dateInput_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DateInputOptions(cPtr, false);
  }

  public void setTimeInput(TimeInputOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_timeInput_set(swigCPtr, this, TimeInputOptions.getCPtr(value), value);
  }

  public TimeInputOptions getTimeInput() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_timeInput_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeInputOptions(cPtr, false);
  }

  public void setNumberInput(NumberInputOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_numberInput_set(swigCPtr, this, NumberInputOptions.getCPtr(value), value);
  }

  public NumberInputOptions getNumberInput() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_numberInput_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NumberInputOptions(cPtr, false);
  }

  public void setToggleInput(ToggleInputOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_toggleInput_set(swigCPtr, this, ToggleInputOptions.getCPtr(value), value);
  }

  public ToggleInputOptions getToggleInput() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_toggleInput_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ToggleInputOptions(cPtr, false);
  }

  public void setTextInput(TextInputOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_textInput_set(swigCPtr, this, TextInputOptions.getCPtr(value), value);
  }

  public TextInputOptions getTextInput() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_textInput_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TextInputOptions(cPtr, false);
  }

  public void setChoiceSet(ChoiceSetOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_choiceSet_set(swigCPtr, this, ChoiceSetOptions.getCPtr(value), value);
  }

  public ChoiceSetOptions getChoiceSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_choiceSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ChoiceSetOptions(cPtr, false);
  }

  public void setActions(ActionOptions value) {
    AdaptiveCardObjectModelJNI.HostOptions_actions_set(swigCPtr, this, ActionOptions.getCPtr(value), value);
  }

  public ActionOptions getActions() {
    long cPtr = AdaptiveCardObjectModelJNI.HostOptions_actions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ActionOptions(cPtr, false);
  }

  public HostOptions() {
    this(AdaptiveCardObjectModelJNI.new_HostOptions(), true);
  }

}
