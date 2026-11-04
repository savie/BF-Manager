package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15554 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12381 f50598;

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735((int) EnumC15863.AE_ANNOTATION.m37827());
        this.f50598.mo1599(c11388);
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return this.f50598.getLength() + 1;
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        this.f50598 = (C12381) C13054.m32519(this.f50598, c15291);
        return this;
    }
}
