package l;

import java.util.Arrays;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۜۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7XP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6601 extends AbstractC22830 {
    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ֨ */
    public final String mo11022() {
        return "ssh-ed448";
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final int mo7209() {
        return 57;
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩹ */
    public final String mo11023() {
        return EdDSAParameterSpec.Ed448;
    }

    public C6601(C19925 c19925) {
        super(c19925, null, null);
    }

    public C6601(C19925 c19925, byte[] bArr) {
        super(c19925, bArr, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m17904(C19925 c19925, C14904 c14904) throws C5813 {
        byte[][] bArrM35635 = c14904.m35635(4, "invalid key format");
        C6601 c6601 = new C6601(c19925, bArrM35635[1], Arrays.copyOf(bArrM35635[2], 57));
        c6601.f8368 = C8491.m22171(bArrM35635[3]);
        c6601.f8371 = 0;
        return c6601;
    }
}
