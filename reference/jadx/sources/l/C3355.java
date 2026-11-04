package l;

/* JADX INFO: renamed from: l.ۗۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6CN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355 extends AbstractC1118 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0701 f10960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19017 f10961;

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4145() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14124 m11053(C0701 c0701, C19017 c19017) {
        return new C23493(c0701, c19017);
    }

    public C3355(C7830 c7830, C0701 c0701, C19017 c19017) {
        super(c7830);
        this.f10960 = c0701;
        this.f10961 = c19017;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC10066 mo4155() {
        return EnumC10066.NOT_READY;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11902 mo4151() {
        return new C10812(this);
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۚ */
    public final C0701 mo4148() {
        return this.f10960;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ۫ */
    public final C19017 mo4150() {
        return this.f10961;
    }

    @Override // l.AbstractC1118
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1118 mo4154(C7830 c7830) {
        return new C3355(c7830, this.f10960.m3005(), this.f10961.m44101());
    }
}
