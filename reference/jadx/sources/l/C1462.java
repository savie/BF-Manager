package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.֨᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes3.dex */
public class C1462 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ExtractOperationResult f5099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ISequentialOutStream f5100;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C1462(ISequentialOutStream iSequentialOutStream) {
        this.f5100 = iSequentialOutStream;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        this.f5099 = extractOperationResult;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode.equals(ExtractAskMode.EXTRACT)) {
            return this.f5100;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult m5235() {
        return this.f5099;
    }
}
