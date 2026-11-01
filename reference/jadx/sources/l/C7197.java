package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7197 extends C11514 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC2300 f24004;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9315 f24005;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4417 f24006;

    public C7197(C15187 c15187, boolean z) {
        super(c15187, z);
        this.f24006 = new C4417();
    }

    @Override // l.C11514, l.InterfaceC4705
    public final int getLength() {
        return this.f24006.getLength() + super.getLength() + 1 + this.f24005.getLength();
    }

    @Override // l.C11514, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765(this.f24004.f8210);
        this.f24005.mo2341(c23509);
        this.f24006.mo2341(c23509);
        super.mo2341(c23509);
    }

    public final String toString() {
        return this.f24004.toString() + " " + this.f24005.toString() + " " + this.f24006.toString();
    }
}
