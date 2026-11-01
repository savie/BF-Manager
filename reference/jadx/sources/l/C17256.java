package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17256 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Integer f54970;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54971;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f54972;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f54973;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f54974;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f54975;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Integer f54976;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f54977;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f54978;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f54979;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f54980;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f54981;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f54982;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f54983;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f54984;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float f54985;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f54986;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f54987;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f54988;

    public C17256(String str, String str2, int i, int i2, int i3, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Integer num, Integer num2) {
        this.f54980 = str;
        this.f54983 = str2;
        this.f54971 = i;
        this.f54984 = i2;
        this.f54978 = i3;
        this.f54985 = f;
        this.f54972 = z;
        this.f54975 = f2;
        this.f54986 = f3;
        this.f54979 = z2;
        this.f54974 = z3;
        this.f54988 = z4;
        this.f54982 = z5;
        this.f54987 = z6;
        this.f54981 = z7;
        this.f54977 = z8;
        this.f54973 = z9;
        this.f54976 = num;
        this.f54970 = num2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17256 m40217(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Integer num;
        Integer num2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        C0757 c0757M3260 = C0757.m3260(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy text config exceeds app state limit");
            }
            String strM3269 = c0757M3260.m3269(i);
            boolean zM3267 = c0757M3260.m3267();
            byte b = (byte) c0757M3260.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c0757M3260.readInt());
            int iM3272 = c0757M3260.m3272();
            boolean zM3268 = c0757M3260.m3267();
            boolean zM3269 = c0757M3260.m3267();
            boolean zM32610 = c0757M3260.m3267();
            boolean zM32611 = c0757M3260.m3267();
            boolean zM32612 = c0757M3260.m3267();
            Integer numValueOf = null;
            String strM32610 = zM32612 ? c0757M3260.m3269(i) : null;
            int i2 = c0757M3260.m3268() == 0 ? 0 : c0757M3260.readInt();
            if (i2 < 591749667) {
                c0757M3260.m3271();
                num = null;
                num2 = null;
                f = 1.0f;
                f2 = 0.0f;
                z = false;
                z2 = false;
                z3 = false;
            } else {
                if (i2 > 591749672) {
                    throw new IOException("Unsupported legacy text config version");
                }
                boolean zM32613 = c0757M3260.m3267();
                boolean zM32614 = i2 >= 591749669 ? c0757M3260.m3267() : false;
                boolean zM32615 = i2 >= 591749668 ? c0757M3260.m3267() : false;
                Integer numValueOf2 = (i2 < 591749670 || !c0757M3260.m3267()) ? null : Integer.valueOf(c0757M3260.readInt());
                if (i2 >= 591749671 && c0757M3260.m3267()) {
                    numValueOf = Integer.valueOf(c0757M3260.readInt());
                }
                if (i2 >= 591749672) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat(c0757M3260.readInt());
                    float fIntBitsToFloat3 = Float.intBitsToFloat(c0757M3260.readInt());
                    if (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f || fIntBitsToFloat3 < 0.0f || fIntBitsToFloat3 >= Float.POSITIVE_INFINITY) {
                        throw new IOException("Invalid line metrics");
                    }
                    num2 = numValueOf;
                    z3 = zM32615;
                    z = zM32613;
                    z2 = zM32614;
                    num = numValueOf2;
                    f2 = fIntBitsToFloat3;
                    f = fIntBitsToFloat2;
                } else {
                    num2 = numValueOf;
                    z3 = zM32615;
                    z = zM32613;
                    z2 = zM32614;
                    num = numValueOf2;
                    f = 1.0f;
                    f2 = 0.0f;
                }
            }
            c0757M3260.m3263();
            C17256 c17256 = new C17256(strM3269, strM32610, b, iM3272, i2, fIntBitsToFloat, f, f2, zM3267, zM3268, zM3269, zM32610, zM32611, zM32612, z, z2, z3, num, num2);
            c0757M3260.close();
            return c17256;
        } catch (Throwable th) {
            try {
                c0757M3260.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40218(C1590 c1590) {
        c1590.f6419 = this.f54980;
        c1590.f6388 = this.f54972;
        c1590.m5424(this.f54985, this.f54971);
        c1590.m17861(this.f54984);
        c1590.mo5423(this.f54975);
        c1590.m17862(this.f54979);
        c1590.m17874(this.f54974);
        c1590.f6429 = this.f54988;
        c1590.f6433 = this.f54982;
        boolean z = this.f54987;
        c1590.f6398 = z;
        if (z) {
            c1590.f6374 = this.f54983;
        }
        int i = this.f54978;
        if (i < 591749667) {
            return;
        }
        c1590.m17869(this.f54981);
        if (i >= 591749669) {
            c1590.m17853(this.f54977);
        }
        if (i >= 591749668) {
            c1590.f6415 = this.f54973;
        }
        c1590.m5430(this.f54976);
        c1590.m5425(this.f54970);
    }
}
