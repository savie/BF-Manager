package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16329 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11514 f52606;

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765((int) EnumC3046.AE_ANNOTATION.m9142());
        this.f52606.mo2341(c23509);
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return this.f52606.getLength() + 1;
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        this.f52606 = (C11514) C17676.m41156(this.f52606, c12738);
        return this;
    }
}
