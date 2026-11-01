package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C18486 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13173 f58919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC9728 f58920;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C18486(EnumC9728 enumC9728, C13173 c13173) {
        this.f58920 = enumC9728;
        this.f58919 = c13173;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765(this.f58920.m24688().intValue());
        c23509.m51770(this.f58919.f43854);
    }
}
