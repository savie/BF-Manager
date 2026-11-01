package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6SK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16551 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f53145;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f53146;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f53147;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53148;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f53149;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f53150;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f53151;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f53152;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f53153;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f53154;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f53155;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f53156;

    public C16551(float f, float f2, int i, int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f53145 = str;
        this.f53147 = i;
        this.f53150 = f;
        this.f53155 = i2;
        this.f53149 = f2;
        this.f53146 = z;
        this.f53148 = z2;
        this.f53156 = z3;
        this.f53153 = z4;
        this.f53152 = i3;
        this.f53151 = str2;
        this.f53154 = z5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16551 m38952(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        C0757 c0757M3260 = C0757.m3260(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy preferences exceed app state limit");
            }
            int i2 = c0757M3260.readInt();
            int i3 = (i2 < 388441878 || i2 > 388441883) ? 0 : i2;
            String strM3265 = i3 == 0 ? c0757M3260.m3265(i2, i) : c0757M3260.m3269(i);
            int i4 = c0757M3260.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c0757M3260.readInt());
            int i5 = c0757M3260.readInt();
            boolean zM3267 = c0757M3260.m3267();
            boolean z = i3 >= 388441879 && c0757M3260.m3267();
            boolean zM3268 = c0757M3260.m3267();
            if (i3 >= 388441878) {
                c0757M3260.readInt();
            }
            int i6 = c0757M3260.readInt();
            String strM3270 = i3 >= 388441880 ? c0757M3260.m3270(i) : "";
            boolean z2 = i3 < 388441881 || c0757M3260.m3267();
            boolean z3 = i3 < 388441882 || c0757M3260.m3267();
            float fIntBitsToFloat2 = i3 >= 388441883 ? Float.intBitsToFloat(c0757M3260.readInt()) : 1.0f;
            if (i3 >= 388441883 && (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f)) {
                throw new IOException("Invalid line spacing");
            }
            c0757M3260.m3263();
            C16551 c16551 = new C16551(fIntBitsToFloat, fIntBitsToFloat2, i4, i5, i6, strM3265, strM3270, zM3267, z, z3, zM3268, z2);
            c0757M3260.close();
            return c16551;
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
}
