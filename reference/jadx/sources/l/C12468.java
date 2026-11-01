package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57D5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12468 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final short f41576;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15187 f41577;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15187 f41578;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f41579;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public short f41580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC1177 f41581;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 10;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C12468(short s, short s2, C15187 c15187, C15187 c15188) {
        this.f41576 = s;
        this.f41580 = s2;
        this.f41577 = c15187;
        this.f41578 = c15188;
    }

    public C12468(short s, short s2, short s3, C15187 c15187, C15187 c15188) {
        this.f41580 = s;
        this.f41579 = s2;
        this.f41576 = s3;
        this.f41577 = c15187;
        this.f41578 = c15188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1177 m30972() {
        if (this.f41581 == null) {
            this.f41581 = EnumC1177.m4308(((String) this.f41578.f49578.f69953).charAt(0));
        }
        return this.f41581;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short m30974() {
        return this.f41576;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30973(int i) {
        this.f41579 = (short) (i - this.f41580);
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f41580);
        c23509.m51770(this.f41579);
        c23509.m51770(this.f41577.f43854);
        c23509.m51770(this.f41578.f43854);
        c23509.m51770(this.f41576);
    }
}
