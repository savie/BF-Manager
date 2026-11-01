package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes.dex */
public final class C23757 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15187 f76862;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 4;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C23757(int i, C15187 c15187) {
        this.f76861 = i;
        this.f76862 = c15187;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C15187 c15187 = this.f76862;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(c15187 == null ? 0 : c15187.f43854);
        c23509.m51770(this.f76861);
    }
}
