package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6SK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3180 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10311;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f10312;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f10314;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f10315;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f10316;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f10317;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f10318;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f10319;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f10320;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f10321;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f10322;

    public C3180(float f, float f2, int i, int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f10316 = str;
        this.f10311 = i;
        this.f10315 = f;
        this.f10317 = i2;
        this.f10319 = f2;
        this.f10321 = z;
        this.f10312 = z2;
        this.f10322 = z3;
        this.f10320 = z4;
        this.f10313 = i3;
        this.f10314 = str2;
        this.f10318 = z5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3180 m10382(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        C16475 c16475M39088 = C16475.m39088(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy preferences exceed app state limit");
            }
            int i2 = c16475M39088.readInt();
            int i3 = (i2 < 388441878 || i2 > 388441883) ? 0 : i2;
            String strM39094 = i3 == 0 ? c16475M39088.m39094(i2, i) : c16475M39088.m39098(i);
            int i4 = c16475M39088.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c16475M39088.readInt());
            int i5 = c16475M39088.readInt();
            boolean zM39096 = c16475M39088.m39096();
            boolean z = i3 >= 388441879 && c16475M39088.m39096();
            boolean zM39097 = c16475M39088.m39096();
            if (i3 >= 388441878) {
                c16475M39088.readInt();
            }
            int i6 = c16475M39088.readInt();
            String strM39102 = i3 >= 388441880 ? c16475M39088.m39102(i) : "";
            boolean z2 = i3 < 388441881 || c16475M39088.m39096();
            boolean z3 = i3 < 388441882 || c16475M39088.m39096();
            float fIntBitsToFloat2 = i3 >= 388441883 ? Float.intBitsToFloat(c16475M39088.readInt()) : 1.0f;
            if (i3 >= 388441883 && (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f)) {
                throw new IOException("Invalid line spacing");
            }
            c16475M39088.m39099();
            C3180 c3180 = new C3180(fIntBitsToFloat, fIntBitsToFloat2, i4, i5, i6, strM39094, strM39102, zM39096, z, z3, zM39097, z2);
            c16475M39088.close();
            return c3180;
        } catch (Throwable th) {
            try {
                c16475M39088.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
