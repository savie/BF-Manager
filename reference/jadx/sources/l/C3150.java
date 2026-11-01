package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3150 extends AbstractC6117 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C9398 f11882;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22345 f11883;

    public C3150(C9398 c9398, C22345 c22345) {
        super(c9398.f20884, c9398.m17095(), 0);
        this.f20885 = EnumC12550.record_component_info;
        this.f11882 = c9398;
        this.f11883 = c22345;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C24027 m9546() {
        return this.f11882.m17090((InterfaceC4705[]) new C12925[]{this.f20891});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9545(InterfaceC19275 interfaceC19275) throws IOException {
        C22345 c22345 = this.f11883;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(((C15187) ((C13111) c22345.m49551().f69953).f43679).f43854);
        c23509.m51770(((C15187) ((C13111) c22345.m49551().f69953).f43680).f43854);
        m9546().m52872(c23509);
    }
}
