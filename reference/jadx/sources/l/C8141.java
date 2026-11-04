package l;

/* JADX INFO: renamed from: l.۟᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public final class C8141 extends C10377 implements InterfaceC8344 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f26854;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26855;

    @Override // l.C10377, l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 15;
    }

    @Override // l.C10377
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C8141 mo22021() {
        return this;
    }

    public C8141(AbstractC11781 abstractC11781, boolean z) {
        super(abstractC11781.f38071, abstractC11781.f38072, abstractC11781.f38067, abstractC11781.f38069);
        this.f26854 = abstractC11781;
        this.f26855 = z;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m22020() {
        AbstractC11781 abstractC11781 = this.f26854;
        if (abstractC11781.f38066 == EnumC13603.f43205) {
            if (this.f26855) {
                return abstractC11781.mo7874() ? 2 : 1;
            }
            return abstractC11781.mo7874() ? 4 : 3;
        }
        if (abstractC11781.m29570()) {
            return 8;
        }
        if (abstractC11781.mo7874()) {
            return 6;
        }
        if ((abstractC11781.mo29591() & 2) != 0) {
            AbstractC11781 abstractC11782 = this;
            while (abstractC11782 != null && !(abstractC11782 instanceof C11035)) {
                abstractC11782 = abstractC11782.f38069;
            }
            if (abstractC11782 == null || !((C11035) abstractC11782).f34838) {
                return 7;
            }
        }
        return abstractC11781.m29558().m29587() ? 9 : 5;
    }

    @Override // l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2971(C24705 c24705) {
        return new C5558(this.f26854, Integer.valueOf(m22020()));
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11781 mo10410() {
        return this.f26854;
    }
}
