package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۧ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11338 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f38249;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f38250;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f38251;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38252;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f38253;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f38254;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f38255;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f38256;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38257;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f38258;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38259;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38260;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38261;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f38262;

    public C11338(byte[] bArr) throws IOException {
        if (!C9927.m25129(bArr)) {
            throw new IOException("Invalid TGA header");
        }
        this.f38255 = bArr;
        this.f38253 = bArr[0] & 255;
        this.f38262 = bArr[2] & 255;
        this.f38256 = C2164.m6731(3, bArr);
        this.f38249 = bArr[1] != 0 ? C2164.m6731(5, bArr) : 0;
        this.f38261 = bArr[7] & 255;
        short sM6731 = (short) C2164.m6731(8, bArr);
        this.f38260 = sM6731;
        short sM6732 = (short) C2164.m6731(10, bArr);
        this.f38259 = sM6732;
        int iM6731 = C2164.m6731(12, bArr);
        this.f38254 = iM6731;
        int iM6732 = C2164.m6731(14, bArr);
        this.f38251 = iM6732;
        int i = sM6731 + iM6731;
        this.f38258 = i;
        int i2 = sM6732 + iM6732;
        this.f38250 = i2;
        this.f38252 = bArr[16] & 255;
        this.f38257 = bArr[17] & 255;
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid TGA canvas dimensions");
        }
        if (((long) i) * ((long) i2) > 268435456 || ((long) iM6731) * ((long) iM6732) > 268435456) {
            throw new C24038("TGA dimensions exceed decode limits");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m28419(boolean z) {
        return (((long) this.f38249) * 4) + X931RNG.BLOCK64_RESEED_MAX + ((!z || this.f38262 < 9) ? 0L : ((long) this.f38251) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28420(C11338 c11338) throws IOException {
        if (!Arrays.equals(this.f38255, c11338.f38255)) {
            throw new IOException("TGA header changed during decoding");
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m28415(C11338 c11338) {
        return c11338.f38262 >= 9;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m28416(C11338 c11338) {
        int i = c11338.f38262;
        return i == 2 || i == 10;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int m28418(C11338 c11338) {
        return (c11338.f38252 + 7) / 8;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m28409(C11338 c11338) {
        return (c11338.f38257 & 15) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28407(C11338 c11338, int i) {
        return (c11338.f38257 & 16) == 0 ? i - c11338.f38260 : (c11338.f38254 - 1) - i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m28414(C11338 c11338, int i) {
        return (c11338.f38257 & 32) != 0 ? i - c11338.f38259 : (c11338.f38251 - 1) - i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m28411(C11338 c11338, int i) {
        return (c11338.f38257 & 16) == 0 ? i + c11338.f38260 : (c11338.f38254 - 1) - i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m28405(C11338 c11338, int i) {
        return (c11338.f38257 & 32) != 0 ? i + c11338.f38259 : (c11338.f38251 - 1) - i;
    }
}
