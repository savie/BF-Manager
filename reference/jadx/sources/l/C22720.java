package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7CM */
/* JADX INFO: loaded from: classes2.dex */
public final class C22720 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f74016;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15187 f74017;

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return 2;
    }

    public C22720(C12738 c12738, String str) {
        super(c12738, EnumC16783.f53741);
        this.f74017 = null;
        this.f74016 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50363(C12738 c12738, Function function) {
        C15187 c15187M31656 = c12738.m31656(function);
        this.f74017 = c15187M31656;
        String str = this.f74016;
        if (c15187M31656 != null) {
            c15187M31656.f49578.f69953 = str;
        } else {
            this.f74017 = c12738.m31655(str);
        }
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        if (this.f74017 != null) {
            super.mo2341(interfaceC19275);
            ((C23509) interfaceC19275).m51770(this.f74017.f43854);
        }
    }
}
