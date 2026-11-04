package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۫֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12740 extends AbstractC22437 {
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
        c9866.m25673("subsystem".getBytes(charset));
        c9866.m25651(m50588() ? (byte) 1 : (byte) 0);
        c9866.m25673("sftp".getBytes(charset));
        m50586(c14010);
    }
}
