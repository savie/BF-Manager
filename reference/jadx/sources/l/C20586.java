package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20586 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7660 f65912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3359 f65913;

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C20586(C7660 c7660, InterfaceC5597 interfaceC5597) {
        this.f65912 = c7660;
        this.f65913 = interfaceC5597;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        this.f65912.mo1599(interfaceC9397);
        this.f65913.mo1599(interfaceC9397);
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return this.f65913.getLength() + 2;
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        C7660 c7660 = this.f65912;
        C13054.m32520(c7660, c15291);
        this.f65912 = c7660;
        this.f65913 = C13054.m32519(this.f65913, c15291);
        return this;
    }
}
