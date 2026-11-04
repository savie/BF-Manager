package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۧܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: VB6Q */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11691 extends C20642 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37855;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f37856;

    public abstract ISequentialOutStream getStream(int i);

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final synchronized void setCompleted(long j) {
        this.f37856 = j;
        mo4533(j, this.f37855);
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final synchronized void setTotal(long j) {
        this.f37855 = j;
        mo4533(this.f37856, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract ISequentialOutStream mo4530(int i);

    /* JADX INFO: renamed from: ܿۙ */
    public abstract void mo4532();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo4533(long j, long j2);

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode == ExtractAskMode.TEST) {
            return mo4530(i);
        }
        if (extractAskMode != ExtractAskMode.EXTRACT) {
            mo4532();
            return null;
        }
        return getStream(i);
    }
}
