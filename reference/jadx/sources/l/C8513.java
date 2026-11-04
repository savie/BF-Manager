package l;

/* JADX INFO: renamed from: l.۠۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8513 extends C3036 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16327 f27824;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4742 f27826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18499 f27827;

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(final C11018 c11018) {
        this.f9840 = c11018;
        boolean z = this.f27825;
        C18499 c18499 = this.f27827;
        C4742 c4742 = this.f27826;
        if (z) {
            if (c11018.f34795 != null) {
                final C13891 c13891M37569 = c4742.f16674.m37569(C14769.of((Object) c11018));
                this.f9840 = c13891M37569;
                final C16327 c16327 = this.f27824;
                c18499.m43089(new Runnable(this) { // from class: l.ۡ۠᩺
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2547 c2547 = new C2547(c13891M37569, c11018);
                        C16327 c16328 = c16327;
                        c16328.f53001 = c2547.mo8479(c16328.f53001);
                    }
                });
                return;
            }
            return;
        }
        if (c11018.f34795 == null) {
            C13891 c13891M37568 = c4742.f16674.m37568();
            c13891M37568.f26659 = c4742.f16676.f48263;
            c11018.f34795 = c13891M37568;
            c18499.m43089(new RunnableC9168(3, c11018));
        }
    }

    public C8513(C4742 c4742, boolean z, C18499 c18499, C16327 c16327) {
        this.f27826 = c4742;
        this.f27825 = z;
        this.f27827 = c18499;
        this.f27824 = c16327;
    }
}
