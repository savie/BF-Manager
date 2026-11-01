package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ܶ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes5.dex */
public class C14917 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ExtractOperationResult f48695;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ISequentialOutStream f48696;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C14917(ISequentialOutStream iSequentialOutStream) {
        this.f48696 = iSequentialOutStream;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        this.f48695 = extractOperationResult;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode.equals(ExtractAskMode.EXTRACT)) {
            return this.f48696;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult m35659() {
        return this.f48695;
    }
}
