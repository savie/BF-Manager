package l;

import java.util.Arrays;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ܿܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7XP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18486 extends AbstractC0587 {
    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ */
    public final int mo18459() {
        return 57;
    }

    @Override // l.AbstractC0587
    /* JADX INFO: renamed from: ۫ */
    public final String mo2671() {
        return "ssh-ed448";
    }

    @Override // l.AbstractC0587
    /* JADX INFO: renamed from: ܳ */
    public final String mo2672() {
        return EdDSAParameterSpec.Ed448;
    }

    public C18486(C22962 c22962) {
        super(c22962, null, null);
    }

    public C18486(C22962 c22962, byte[] bArr) {
        super(c22962, bArr, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6554 m43078(C22962 c22962, C9866 c9866) throws C2079 {
        byte[][] bArrM25656 = c9866.m25656(4, "invalid key format");
        C18486 c18486 = new C18486(c22962, bArrM25656[1], Arrays.copyOf(bArrM25656[2], 57));
        c18486.f22003 = C9011.m24051(bArrM25656[3]);
        c18486.f22011 = 0;
        return c18486;
    }
}
