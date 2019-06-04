package jio.System.Net;

public enum WebExceptionStatus {
  Success(0L),
  NameResolutionFailure(1L),
  ConnectFailure(2L),
  ReceiveFailure(3L),
  SendFailure(4L),
  PipelineFailure(5L),
  RequestCanceled(6L),
  ProtocolError(7L),
  ConnectionClosed(8L),
  TrustFailure(9L),
  SecureChannelFailure(10L),
  ServerProtocolViolation(11L),
  KeepAliveFailure(12L),
  Pending(13L),
  Timeout(14L),
  ProxyNameResolutionFailure(15L),
  UnknownError(16L),
  MessageLengthLimitExceeded(17L),
  CacheEntryNotFound(18L),
  RequestProhibitedByCachePolicy(19L),
  RequestProhibitedByProxy(20L),
  ;
  private long numVal;

  WebExceptionStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
