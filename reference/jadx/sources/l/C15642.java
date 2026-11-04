package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 57D5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15642 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short f50790;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C7660 f50791;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7660 f50792;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short f50793;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f50794;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC14545 f50795;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 10;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C15642(short s, short s2, C7660 c7660, C7660 c7661) {
        this.f50793 = s;
        this.f50794 = s2;
        this.f50791 = c7660;
        this.f50792 = c7661;
    }

    public C15642(short s, short s2, short s3, C7660 c7660, C7660 c7661) {
        this.f50794 = s;
        this.f50790 = s2;
        this.f50793 = s3;
        this.f50791 = c7660;
        this.f50792 = c7661;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC14545 m37392() {
        if (this.f50795 == null) {
            this.f50795 = EnumC14545.m35092(((String) this.f50792.f25232.f61224).charAt(0));
        }
        return this.f50795;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short m37394() {
        return this.f50793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37393(int i) {
        this.f50790 = (short) (i - this.f50794);
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f50794);
        c11388.m28740(this.f50790);
        c11388.m28740(this.f50791.f67820);
        c11388.m28740(this.f50792.f67820);
        c11388.m28740(this.f50793);
    }
}
