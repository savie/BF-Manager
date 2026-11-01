package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12318 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f41150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Byte f41151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f41152;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f41153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f41154;

    public C12318(boolean z, boolean z2, String str, String str2, Byte b) {
        this.f41152 = z;
        this.f41150 = z2;
        this.f41153 = str;
        this.f41154 = str2;
        this.f41151 = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12318 m30578(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Byte bValueOf;
        C0757 c0757M3260 = C0757.m3260(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy search exceeds app state limit");
            }
            boolean zM3267 = c0757M3260.m3267();
            boolean zM3268 = c0757M3260.m3267();
            String strM3269 = c0757M3260.m3269(i);
            String strM32610 = c0757M3260.m3269(i);
            if (c0757M3260.m3268() == 0) {
                bValueOf = null;
            } else {
                if (c0757M3260.m3268() != 3 || c0757M3260.m3272() != 29298) {
                    throw new IOException("Invalid legacy search parameter trailer");
                }
                bValueOf = Byte.valueOf((byte) c0757M3260.readByte());
            }
            c0757M3260.m3263();
            C12318 c12318 = new C12318(zM3267, zM3268, strM3269, strM32610, bValueOf);
            c0757M3260.close();
            return c12318;
        } catch (Throwable th) {
            try {
                c0757M3260.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12318 m30579(C17367 c17367) {
        Byte bValueOf;
        boolean zM40461 = c17367.m40461();
        boolean zM40462 = c17367.m40461();
        String strM40442 = c17367.m40442();
        String strM40443 = c17367.m40442();
        if (c17367.available() < 3 || c17367.m40444() != 29298) {
            bValueOf = null;
        } else {
            c17367.skipBytes(2);
            bValueOf = Byte.valueOf(c17367.readByte());
        }
        return new C12318(zM40461, zM40462, strM40442, strM40443, bValueOf);
    }
}
