package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11913 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7660 f38389;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 4;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C11913(int i, C7660 c7660) {
        this.f38388 = i;
        this.f38389 = c7660;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C7660 c7660 = this.f38389;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(c7660 == null ? 0 : c7660.f67820);
        c11388.m28740(this.f38388);
    }
}
