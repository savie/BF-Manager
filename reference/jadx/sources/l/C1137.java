package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֨ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1137 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f4216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f4218;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f4219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f4220;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f4221;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f4222;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f4223;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f4224;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f4225;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f4226;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f4227;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4228;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f4229;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f4230;

    public C1137(long j, byte[] bArr) throws IOException {
        this.f4216 = j;
        if (!C7103.m19446(bArr)) {
            throw new IOException("Invalid TGA header");
        }
        this.f4219 = bArr;
        this.f4226 = bArr[0] & 255;
        this.f4224 = bArr[2] & 255;
        this.f4218 = C8594.m23096(3, bArr);
        this.f4221 = bArr[1] != 0 ? C8594.m23096(5, bArr) : 0;
        this.f4222 = bArr[7] & 255;
        short sM23096 = (short) C8594.m23096(8, bArr);
        this.f4223 = sM23096;
        short sM23097 = (short) C8594.m23096(10, bArr);
        this.f4229 = sM23097;
        int iM23096 = C8594.m23096(12, bArr);
        this.f4230 = iM23096;
        int iM23097 = C8594.m23096(14, bArr);
        this.f4220 = iM23097;
        int i = sM23096 + iM23096;
        this.f4225 = i;
        int i2 = sM23097 + iM23097;
        this.f4228 = i2;
        this.f4217 = bArr[16] & 255;
        this.f4227 = bArr[17] & 255;
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid TGA canvas dimensions");
        }
        if (((long) i) * ((long) i2) > j || ((long) iM23096) * ((long) iM23097) > j) {
            throw new C9339("TGA dimensions exceed decode limits");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m4212(boolean z) {
        return (((long) this.f4221) * 4) + X931RNG.BLOCK64_RESEED_MAX + ((!z || this.f4224 < 9) ? 0L : ((long) this.f4220) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4213(C1137 c1137) throws IOException {
        if (!Arrays.equals(this.f4219, c1137.f4219)) {
            throw new IOException("TGA header changed during decoding");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m4205(C1137 c1137) {
        return c1137.f4224 >= 9;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m4203(C1137 c1137) {
        int i = c1137.f4224;
        return i == 2 || i == 10;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m4204(C1137 c1137) {
        return (c1137.f4217 + 7) / 8;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m4211(C1137 c1137) {
        return (c1137.f4227 & 15) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m4196(C1137 c1137, int i) {
        return (c1137.f4227 & 16) == 0 ? i - c1137.f4223 : (c1137.f4230 - 1) - i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m4208(C1137 c1137, int i) {
        return (c1137.f4227 & 32) != 0 ? i - c1137.f4229 : (c1137.f4220 - 1) - i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m4199(C1137 c1137, int i) {
        return (c1137.f4227 & 16) == 0 ? i + c1137.f4223 : (c1137.f4230 - 1) - i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m4210(C1137 c1137, int i) {
        return (c1137.f4227 & 32) != 0 ? i + c1137.f4229 : (c1137.f4220 - 1) - i;
    }
}
