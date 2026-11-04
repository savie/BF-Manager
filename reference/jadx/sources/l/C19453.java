package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩴ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97YR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19453 extends AbstractC22437 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f62836;

    public C19453(byte[] bArr) {
        this.f62836 = bArr;
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
        c9866.m25673("exec".getBytes(StandardCharsets.UTF_8));
        c9866.m25651(m50588() ? (byte) 1 : (byte) 0);
        c9866.m25652(this.f62836.length + 4);
        c9866.m25673(this.f62836);
        m50586(c14010);
    }
}
