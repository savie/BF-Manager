package l;

import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۟ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f25022;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25023;

    public C7527(EnumC10350... enumC10350Arr) {
        this.f25022 = new BitSet(8);
        this.f25023 = 1;
        if (enumC10350Arr != null) {
            for (EnumC10350 enumC10350 : enumC10350Arr) {
                this.f25022.set(enumC10350.f35491);
            }
        }
        m20051();
    }

    public C7527(byte b, int i) {
        this.f25022 = BitSet.valueOf(new byte[]{b});
        this.f25023 = i;
        m20051();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7527 m20050(byte b) {
        byte b2 = (byte) (b & 192);
        return new C7527((byte) (b ^ b2), b2 >>> 6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m20052() {
        return (byte) (this.f25022.toByteArray()[0] | ((this.f25023 & 3) << 6));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20051() {
        int i = EnumC10350.RESERVED_0.f35491;
        BitSet bitSet = this.f25022;
        if (bitSet.get(i)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        if (bitSet.get(EnumC10350.RESERVED_1.f35491)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        if (!bitSet.get(EnumC10350.BLOCK_INDEPENDENCE.f35491)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        int i2 = this.f25023;
        if (i2 == 1) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new RuntimeException(C2271.m6966(i2, "Version ", " is unsupported"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20053(EnumC10350 enumC10350) {
        return this.f25022.get(enumC10350.f35491);
    }
}
