package jio.System.Windows.Forms;

public enum SortOrder {
  None(0L),
  Ascending(1L),
  Descending(2L),
  ;
  private long numVal;

  SortOrder(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
