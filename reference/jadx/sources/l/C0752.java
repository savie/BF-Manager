package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.֡᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0752 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C0099 f3054;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f3055;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16981 f3056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12748 f3057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f3058;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C0752(C12748 c12748, IInArchive iInArchive) {
        this.f3057 = c12748;
        this.f3055 = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        C12748 c12748 = this.f3057;
        if (c12748.f42499) {
            return null;
        }
        boolean zBooleanValue = ((Boolean) this.f3055.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f3058 = zBooleanValue;
        if (zBooleanValue || extractAskMode != ExtractAskMode.EXTRACT) {
            return null;
        }
        C16981 c16981 = (C16981) c12748.f42500.get(Integer.valueOf(i));
        this.f3056 = c16981;
        if (c16981 == null) {
            return null;
        }
        C0099 c0099 = new C0099(c16981.f54317);
        this.f3054 = c0099;
        return c0099;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        if (this.f3058) {
            return;
        }
        if (extractOperationResult == ExtractOperationResult.OK) {
            C3555 c3555 = new C3555(this.f3054.m1063());
            int i = this.f3056.f54319;
            if (i == 1 || i == 2) {
                C18225.m42373(this.f3056.f54316, C0690.f2920, true, new C16041(c3555));
            } else if (i == 3) {
                C18225.m42373(this.f3056.f54316, C0690.f2939, true, new C12686(3, c3555));
            } else {
                throw new RuntimeException();
            }
            synchronized (this.f3056) {
                this.f3056.notifyAll();
            }
            this.f3057.f42500.remove(Integer.valueOf(this.f3056.f54318));
            return;
        }
        C16981 c16981 = this.f3056;
        if (c16981 != null) {
            C18225.m42372(c16981.f54316);
            synchronized (this.f3056) {
                this.f3056.notifyAll();
            }
            this.f3057.f42500.remove(Integer.valueOf(this.f3056.f54318));
        }
    }
}
