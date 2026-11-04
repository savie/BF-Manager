package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.᩶ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes.dex */
public final class C21512 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0629 f68745;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f68746;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18528 f68747;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15543 f68748;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f68749;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C21512(C0629 c0629, IInArchive iInArchive) {
        this.f68745 = c0629;
        this.f68746 = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        C0629 c0629 = this.f68745;
        if (c0629.f2472) {
            return null;
        }
        boolean zBooleanValue = ((Boolean) this.f68746.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f68749 = zBooleanValue;
        if (zBooleanValue || extractAskMode != ExtractAskMode.EXTRACT) {
            return null;
        }
        C18528 c18528 = (C18528) c0629.f2471.get(Integer.valueOf(i));
        this.f68747 = c18528;
        if (c18528 == null) {
            return null;
        }
        C15543 c15543 = new C15543(c18528.f60225);
        this.f68748 = c15543;
        return c15543;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        if (this.f68749) {
            return;
        }
        if (extractOperationResult == ExtractOperationResult.OK) {
            C18716 c18716 = new C18716(this.f68748.m37226());
            int i = this.f68747.f60226;
            if (i == 1 || i == 2) {
                C2166.m7448(this.f68747.f60223, C20613.f66070, true, new C19301(c18716));
            } else if (i == 3) {
                C2166.m7448(this.f68747.f60223, C20613.f66051, true, new C10350(3, c18716));
            } else {
                throw new RuntimeException();
            }
            synchronized (this.f68747) {
                this.f68747.notifyAll();
            }
            this.f68745.f2471.remove(Integer.valueOf(this.f68747.f60224));
            return;
        }
        C18528 c18528 = this.f68747;
        if (c18528 != null) {
            C2166.m7454(c18528.f60223);
            synchronized (this.f68747) {
                this.f68747.notifyAll();
            }
            this.f68745.f2471.remove(Integer.valueOf(this.f68747.f60224));
        }
    }
}
