package l;

/* JADX INFO: renamed from: l.᩵۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19462 extends C1052 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19003 f62667;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f62668;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22489 f62669;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7467 f62670;

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(final C11200 c11200) {
        this.f4871 = c11200;
        boolean z = this.f62668;
        C19003 c19003 = this.f62667;
        C7467 c7467 = this.f62670;
        if (z) {
            if (c11200.f37914 != null) {
                final C12281 c12281M14645 = c7467.f24871.m14645(C21825.of((Object) c11200));
                this.f4871 = c12281M14645;
                final C22489 c22489 = this.f62669;
                c19003.m43723(new Runnable(this) { // from class: l.ᩳ۫ۤ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8173 c8173 = new C8173(c12281M14645, c11200);
                        C22489 c224810 = c22489;
                        c224810.f73408 = c8173.mo3964(c224810.f73408);
                    }
                });
                return;
            }
            return;
        }
        if (c11200.f37914 == null) {
            C12281 c12281M14644 = c7467.f24871.m14644();
            c12281M14644.f30190 = c7467.f24870.f14261;
            c11200.f37914 = c12281M14644;
            c19003.m43723(new Runnable() { // from class: l.ᩴ۫ۤ
                @Override // java.lang.Runnable
                public final void run() {
                    c11200.f37914 = null;
                }
            });
        }
    }

    public C19462(C7467 c7467, boolean z, C19003 c19003, C22489 c22489) {
        this.f62670 = c7467;
        this.f62668 = z;
        this.f62667 = c19003;
        this.f62669 = c22489;
    }
}
