package l;

/* JADX INFO: renamed from: l.ܺۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W6EG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16779 extends AbstractC1118 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0701 f54151;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19017 f54152;

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4145() {
        return false;
    }

    public C16779(C7830 c7830, C0701 c0701, C19017 c19017) {
        super(c7830);
        this.f54151 = c0701;
        this.f54152 = c19017;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11902 mo4151() {
        return new C22747(m4149());
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC10066 mo4155() {
        return EnumC10066.READY_TO_COMPARE;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۚ */
    public final C0701 mo4148() {
        return this.f54151;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۫ */
    public final C19017 mo4150() {
        return this.f54152;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1118 mo4154(C7830 c7830) {
        return new C16779(c7830, this.f54151.m3005(), this.f54152.m44101());
    }
}
