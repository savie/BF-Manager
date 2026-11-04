package l;

import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11156 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f35136;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f35137;

    public C11156(EnumC22345... enumC22345Arr) {
        this.f35136 = new BitSet(8);
        this.f35137 = 1;
        if (enumC22345Arr != null) {
            for (EnumC22345 enumC22345 : enumC22345Arr) {
                this.f35136.set(enumC22345.f72335);
            }
        }
        m28104();
    }

    public C11156(byte b, int i) {
        this.f35136 = BitSet.valueOf(new byte[]{b});
        this.f35137 = i;
        m28104();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11156 m28103(byte b) {
        byte b2 = (byte) (b & 192);
        return new C11156((byte) (b ^ b2), b2 >>> 6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m28105() {
        return (byte) (this.f35136.toByteArray()[0] | ((this.f35137 & 3) << 6));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28104() {
        int i = EnumC22345.RESERVED_0.f72335;
        BitSet bitSet = this.f35136;
        if (bitSet.get(i)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        if (bitSet.get(EnumC22345.RESERVED_1.f72335)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        if (!bitSet.get(EnumC22345.BLOCK_INDEPENDENCE.f72335)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        int i2 = this.f35137;
        if (i2 == 1) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new RuntimeException(C14442.m34864(i2, "Version ", " is unsupported"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28106(EnumC22345 enumC22345) {
        return this.f35136.get(enumC22345.f72335);
    }
}
