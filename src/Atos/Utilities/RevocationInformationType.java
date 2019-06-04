package Atos.Utilities;

public enum RevocationInformationType {
  NONE(0L),
  CRL(1L),
  OCSP(2L),
  CRL_THEN_OCSP(3L),
  OCSP_THEN_CRL(4L),
  ;
  private long numVal;

  RevocationInformationType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
