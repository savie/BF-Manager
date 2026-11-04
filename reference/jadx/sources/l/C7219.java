package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final class C7219 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21259 f23814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC23570 f23815;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C7219(EnumC23570 enumC23570, C21259 c21259) {
        this.f23815 = enumC23570;
        this.f23814 = c21259;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735(this.f23815.m52767().intValue());
        c11388.m28740(this.f23814.f67820);
    }
}
