package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֫֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1554 extends AbstractC22437 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f5359 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5485(C15723 c15723, C4206 c4206, String str, boolean z) {
        m50587(z);
        this.f5359 = str;
        super.mo15880(c15723, c4206);
        C9866 c9866 = new C9866();
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 98);
        c9866.m25669(c4206.f27478);
        byte[] bArr = C9011.f29358;
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673("subsystem".getBytes(charset));
        c9866.m25651(m50588() ? (byte) 1 : (byte) 0);
        c9866.m25673(C9011.m24055(this.f5359, charset));
        m50586(c14010);
    }
}
