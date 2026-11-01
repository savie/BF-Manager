package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C17193 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f54817;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16881 f54818;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f54819;

    public C17193(C20409 c20409, ActivityC11632 activityC11632, C16881 c16881) {
        this.f54819 = c20409;
        this.f54817 = activityC11632;
        this.f54818 = c16881;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f54817, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C2063 c2063 = new C2063(0, C22037.f71424, false, 0, null, null, null);
        synchronized (this.f54819.f66154) {
            C23232 c23232M46060 = C20409.m46060(this.f54819, c2063);
            try {
                c23232M46060.f75392.m49637(this.f54818);
                c23232M46060.close();
            } catch (Throwable th) {
                if (c23232M46060 != null) {
                    try {
                        c23232M46060.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f54819.m46062(exc, this.f54817);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
