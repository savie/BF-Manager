package net.sf.sevenzipjbinding;

/* JADX INFO: loaded from: classes2.dex */
public interface IArchiveExtractCallback extends IProgress {
    ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode);

    void prepareOperation(ExtractAskMode extractAskMode);

    void setOperationResult(ExtractOperationResult extractOperationResult);
}
