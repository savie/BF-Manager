package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes.dex */
public final class C25252 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7660 f81578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7660 f81579;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 5;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C25252(C7660 c7660, C7660 c7661) {
        this.f81579 = c7660;
        this.f81578 = c7661;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735((int) EnumC15863.AE_ENUM.m37827());
        this.f81579.mo1599((InterfaceC9397) c11388);
        this.f81578.mo1599((InterfaceC9397) c11388);
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        C7660 c7660 = this.f81579;
        C13054.m32520(c7660, c15291);
        this.f81579 = c7660;
        C7660 c7661 = this.f81578;
        C13054.m32520(c7661, c15291);
        this.f81578 = c7661;
        return this;
    }
}
