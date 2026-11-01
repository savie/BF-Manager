package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15187 f14838;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f14839;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15187 f14840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15187 f14841;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 8;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C15187 c15187 = this.f14838;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f14841.f43854);
        C15187 c15188 = this.f14840;
        if (c15188.mo32563()) {
            c23509.m51770(c15188.f43854);
        } else {
            c23509.m51770(0);
        }
        if (c15187.mo32563()) {
            c23509.m51770(c15187.f43854);
        } else {
            c23509.m51770(0);
        }
        c23509.m51770(this.f14839);
    }
}
