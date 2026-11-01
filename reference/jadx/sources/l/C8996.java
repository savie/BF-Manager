package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8996 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C8996 f30769 = new C8996(EnumC19579.COMPLETE, EnumC8290.NONE, null, "", 0, 0, 0, new byte[32], 1, false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f30770;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC8290 f30771;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13250 f30772;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30773;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f30774;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC19579 f30775;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f30776;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f30777;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f30778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f30779;

    public C8996(EnumC19579 enumC19579, EnumC8290 enumC8290, C13250 c13250, String str, int i, long j, long j2, byte[] bArr, int i2, boolean z) {
        EnumC19579 enumC195710;
        C13638.requireNonNull(enumC19579);
        this.f30775 = enumC19579;
        C13638.requireNonNull(enumC8290);
        this.f30771 = enumC8290;
        C13638.requireNonNull(str);
        this.f30776 = str;
        if (j < 0 || j2 < 0 || bArr.length != 32 || i2 < 0 || i2 > 3 || str.length() > 80 || (enumC19579 == (enumC195710 = EnumC19579.COMPLETE) && (z || i2 == 0))) {
            throw new IllegalArgumentException("Invalid text load checkpoint");
        }
        if (c13250 == null) {
            if (enumC19579 != enumC195710 || enumC8290 != EnumC8290.NONE || !str.isEmpty() || i != 0 || j != 0 || j2 != 0 || i2 != 1 || !Arrays.equals(bArr, new byte[32])) {
                throw new IllegalArgumentException("Invalid empty load state");
            }
        } else if (str.isEmpty() || i < 1 || i > 32768 || (enumC19579 != enumC195710 && j % ((long) i) != 0)) {
            throw new IllegalArgumentException("Invalid text load source checkpoint");
        }
        boolean z2 = enumC19579 == EnumC19579.FAILED || enumC19579 == EnumC19579.LIMIT_EXCEEDED;
        boolean z3 = enumC8290 == EnumC8290.CACHE_LIMIT || enumC8290 == EnumC8290.COORDINATE_LIMIT;
        if (z2 == (enumC8290 != EnumC8290.NONE)) {
            if (z3 == (enumC19579 == EnumC19579.LIMIT_EXCEEDED)) {
                if (j == 0 && !Arrays.equals(bArr, new byte[32])) {
                    throw new IllegalArgumentException("Invalid empty text prefix hash");
                }
                this.f30772 = c13250;
                this.f30773 = i;
                this.f30777 = j;
                this.f30778 = j2;
                this.f30770 = (byte[]) bArr.clone();
                this.f30774 = i2;
                this.f30779 = z;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid text load failure state");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8996 m23299(EnumC19579 enumC19579, EnumC8290 enumC8290) {
        return new C8996(enumC19579, enumC8290, this.f30772, this.f30776, this.f30773, this.f30777, this.f30778, this.f30770, this.f30774, this.f30779);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8996 m23298(int i, long j, byte[] bArr, int i2, boolean z, boolean z2) {
        EnumC19579 enumC19579 = z2 ? EnumC19579.COMPLETE : EnumC19579.LOADING;
        EnumC8290 enumC8290 = EnumC8290.NONE;
        long j2 = i;
        long j3 = this.f30777;
        long j4 = j3 + j2;
        if (((j3 ^ j4) >= 0) || (((j2 ^ j3) > 0 ? 1 : ((j2 ^ j3) == 0 ? 0 : -1)) < 0)) {
            return new C8996(enumC19579, enumC8290, this.f30772, this.f30776, this.f30773, j4, Math.max(this.f30778, j), bArr, i2, z);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC19579 m23305() {
        return this.f30775;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC8290 m23295() {
        return this.f30771;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m23300() {
        return this.f30775 == EnumC19579.COMPLETE;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C13250 m23307() {
        return this.f30772;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m23302() {
        return this.f30776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23297() {
        return this.f30773;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m23296() {
        return this.f30777;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m23304() {
        return this.f30778;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m23303() {
        return (byte[]) this.f30770.clone();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m23306() {
        return this.f30774;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m23301() {
        int i = this.f30774;
        if (i != 2) {
            return i != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23294() {
        return this.f30779;
    }
}
