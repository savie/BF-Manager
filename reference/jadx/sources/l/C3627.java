package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3627 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15187 f13322;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f13323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15187 f13324;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 6;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C3627(C7178 c7178, C5039 c5039, C11390 c11390) {
        this.f13324 = (C15187) c5039.apply(c7178);
        this.f13322 = c7178.m38522() == null ? null : (C15187) c11390.apply(c7178.m38522());
        this.f13323 = c7178.m25267();
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f13324.f43854);
        c23509.m51770(this.f13323);
        C15187 c15187 = this.f13322;
        c23509.m51770(c15187 == null ? 0 : c15187.f43854);
    }
}
