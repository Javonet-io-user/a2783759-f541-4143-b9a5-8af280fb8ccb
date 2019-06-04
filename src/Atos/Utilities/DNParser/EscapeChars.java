package Atos.Utilities.DNParser;

public enum EscapeChars {
  None(0L),
  ControlChars(1L),
  SpecialChars(2L),
  MultibyteChars(4L),
  ;
  private long numVal;

  EscapeChars(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
