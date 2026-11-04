package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܳ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14977 extends AbstractC22437 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f48894 = "vt100";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48898 = 80;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48895 = 24;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48893 = 640;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48896 = 480;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f48897 = C9011.f29358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36039(String str) {
        this.f48894 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36038(int i, int i2, int i3, int i4) {
        this.f48898 = i;
        this.f48895 = i2;
        this.f48893 = i3;
        this.f48896 = i4;
    }

    @Override // l.AbstractC22437
    /* JADX INFO: renamed from: ۙ */
    public final void mo15880(C15723 c15723, AbstractC8375 abstractC8375) {
        super.mo15880(c15723, abstractC8375);
        C9866 c9866 = new C9866();
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 98);
        c9866.m25669(abstractC8375.f27478);
        byte[] bArr = C9011.f29358;
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673("pty-req".getBytes(charset));
        c9866.m25651(m50588() ? (byte) 1 : (byte) 0);
        c9866.m25673(C9011.m24055(this.f48894, charset));
        c9866.m25669(this.f48898);
        c9866.m25669(this.f48895);
        c9866.m25669(this.f48893);
        c9866.m25669(this.f48896);
        c9866.m25673(this.f48897);
        m50586(c14010);
    }
}
