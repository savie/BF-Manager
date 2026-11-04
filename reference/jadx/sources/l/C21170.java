package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21170 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C21170 f67574 = new C21170(EnumC14456.COMPLETE, EnumC4016.NONE, null, "", 0, 0, 0, new byte[32], 1, false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16013 f67575;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67576;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f67577;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f67578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC14456 f67579;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f67580;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f67581;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f67582;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f67583;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4016 f67584;

    public C21170(EnumC14456 enumC14456, EnumC4016 enumC4016, C16013 c16013, String str, int i, long j, long j2, byte[] bArr, int i2, boolean z) {
        EnumC14456 enumC14457;
        C17359.requireNonNull(enumC14456);
        this.f67579 = enumC14456;
        C17359.requireNonNull(enumC4016);
        this.f67584 = enumC4016;
        C17359.requireNonNull(str);
        this.f67578 = str;
        if (j < 0 || j2 < 0 || bArr.length != 32 || i2 < 0 || i2 > 3 || str.length() > 80 || (enumC14456 == (enumC14457 = EnumC14456.COMPLETE) && (z || i2 == 0))) {
            throw new IllegalArgumentException("Invalid text load checkpoint");
        }
        if (c16013 == null) {
            if (enumC14456 != enumC14457 || enumC4016 != EnumC4016.NONE || !str.isEmpty() || i != 0 || j != 0 || j2 != 0 || i2 != 1 || !Arrays.equals(bArr, new byte[32])) {
                throw new IllegalArgumentException("Invalid empty load state");
            }
        } else if (str.isEmpty() || i < 1 || i > 32768 || (enumC14456 != enumC14457 && j % ((long) i) != 0)) {
            throw new IllegalArgumentException("Invalid text load source checkpoint");
        }
        boolean z2 = enumC14456 == EnumC14456.FAILED || enumC14456 == EnumC14456.LIMIT_EXCEEDED;
        boolean z3 = enumC4016 == EnumC4016.CACHE_LIMIT || enumC4016 == EnumC4016.COORDINATE_LIMIT;
        if (z2 == (enumC4016 != EnumC4016.NONE)) {
            if (z3 == (enumC14456 == EnumC14456.LIMIT_EXCEEDED)) {
                if (j == 0 && !Arrays.equals(bArr, new byte[32])) {
                    throw new IllegalArgumentException("Invalid empty text prefix hash");
                }
                this.f67575 = c16013;
                this.f67576 = i;
                this.f67577 = j;
                this.f67583 = j2;
                this.f67580 = (byte[]) bArr.clone();
                this.f67582 = i2;
                this.f67581 = z;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid text load failure state");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21170 m48293(EnumC14456 enumC14456, EnumC4016 enumC4016) {
        return new C21170(enumC14456, enumC4016, this.f67575, this.f67578, this.f67576, this.f67577, this.f67583, this.f67580, this.f67582, this.f67581);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21170 m48292(int i, long j, byte[] bArr, int i2, boolean z, boolean z2) {
        EnumC14456 enumC14456 = z2 ? EnumC14456.COMPLETE : EnumC14456.LOADING;
        EnumC4016 enumC4016 = EnumC4016.NONE;
        long j2 = i;
        long j3 = this.f67577;
        long j4 = j3 + j2;
        if (((j3 ^ j4) >= 0) || (((j2 ^ j3) > 0 ? 1 : ((j2 ^ j3) == 0 ? 0 : -1)) < 0)) {
            return new C21170(enumC14456, enumC4016, this.f67575, this.f67578, this.f67576, j4, Math.max(this.f67583, j), bArr, i2, z);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC14456 m48299() {
        return this.f67579;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4016 m48302() {
        return this.f67584;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48300() {
        return this.f67579 == EnumC14456.COMPLETE;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16013 m48303() {
        return this.f67575;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m48295() {
        return this.f67578;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48291() {
        return this.f67576;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48290() {
        return this.f67577;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m48301() {
        return this.f67583;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m48294() {
        return (byte[]) this.f67580.clone();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m48298() {
        return this.f67582;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48296() {
        int i = this.f67582;
        if (i != 2) {
            return i != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m48297() {
        return this.f67581;
    }
}
