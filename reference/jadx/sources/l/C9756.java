package l;

/* JADX INFO: renamed from: l.ۢᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9756 extends AbstractC12311 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4548 f32810;

    public C9756(AbstractC2720 abstractC2720) {
        super(0);
        this.f32810 = abstractC2720;
    }

    public C9756(InterfaceC4548 interfaceC4548, int i, int i2) {
        super(i, i2);
        this.f32810 = interfaceC4548;
    }

    @Override // l.AbstractC12311
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo24749() {
        return this.f32810.size();
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f32810.get(i);
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C9756(this.f32810, i, i2);
    }
}
