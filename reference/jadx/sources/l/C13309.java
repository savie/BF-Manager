package l;

/* JADX INFO: renamed from: l.۫ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94VR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13309 extends AbstractC16292 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11817 f42481;

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ */
    public final C11817 mo7315() {
        return this.f42481;
    }

    public C13309(C11817 c11817) {
        super(EnumC20768.GOTO);
        this.f42481 = c11817;
    }

    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo2797(C5194 c5194) {
        return new C13309(c5194.mo15614(this.f42481));
    }

    public final String toString() {
        return "GOTO ".concat(this.f42481.m29665());
    }
}
