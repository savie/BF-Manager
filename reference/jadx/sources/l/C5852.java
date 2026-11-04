package l;

/* JADX INFO: renamed from: l.ۚᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 159C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5852 extends AbstractC23752 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11817 f20087;

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ */
    public final C11817 mo7315() {
        return this.f20087;
    }

    public C5852(EnumC20768 enumC20768, AbstractC11071 abstractC11071, C11817 c11817) {
        super(enumC20768, abstractC11071);
        this.f20087 = c11817;
    }

    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo2797(C5194 c5194) {
        C11817 c11817Mo15614 = c5194.mo15614(this.f20087);
        return new C5852(this.f40344, this.f76980.mo5237(c5194), c11817Mo15614);
    }

    public final String toString() {
        return "if " + this.f76980 + " GOTO " + this.f20087.m29665();
    }
}
