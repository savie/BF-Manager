package l;

/* JADX INFO: renamed from: l.۠ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBF1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7971 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20671[] f26178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20671[] f26179;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20671[] f26180;

    public C7971(C17661 c17661) {
        int iM36890 = c17661.m41141().m36890();
        this.f26179 = new C20671[iM36890];
        this.f26180 = new C20671[iM36890];
        this.f26178 = new C20671[iM36890];
        C5667 c5667M41141 = c17661.m41141();
        int size = c5667M41141.size();
        for (int i = 0; i < size; i++) {
            C12018 c12018M15271get = c5667M41141.m15271get(i);
            int iMo29913 = c12018M15271get.mo29913();
            this.f26179[iMo29913] = new C20671(c12018M15271get.m29911().m15274get(0).m37183(), false);
            C11312 c11312M37183 = c12018M15271get.m29914().m37183();
            this.f26180[iMo29913] = new C20671(c11312M37183, false);
            this.f26178[iMo29913] = new C20671(c11312M37183, false);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20671 m21029(C12018 c12018) {
        return this.f26179[c12018.mo29913()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20671 m21027(int i) {
        return this.f26179[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20671 m21030(C12018 c12018) {
        return this.f26180[c12018.mo29913()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20671 m21028(C12018 c12018) {
        return this.f26178[c12018.mo29913()];
    }
}
