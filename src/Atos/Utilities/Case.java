package Atos.Utilities;

public enum Case {
  UPPER(0L),
  LOWER(1L),
  CAPITALIZE(2L),
  ;
  private long numVal;

  Case(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
