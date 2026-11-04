package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩵ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20334 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Byte f65237;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f65238;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f65239;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f65240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65241;

    public C20334(boolean z, boolean z2, String str, String str2, Byte b) {
        this.f65239 = z;
        this.f65241 = z2;
        this.f65238 = str;
        this.f65240 = str2;
        this.f65237 = b;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m46721(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM46715 = m46715(i, bArr, i2, i3);
        int iM19208 = C6929.m19208(i + 2, bArr);
        int iMin = iM19208 > 150000 ? 0 : Math.min(iM19208, 50000);
        int iM19209 = C6929.m19208(iM46715, bArr);
        return iMin + (iM19209 <= 150000 ? Math.min(iM19209, 50000) : 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20334 m46720(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM46715 = m46715(i, bArr, i2, i3);
        int iM19208 = C6929.m19208(i + 2, bArr);
        int iM19209 = C6929.m19208(iM46715, bArr);
        int i4 = iM46715 + 4;
        int i5 = i4 + iM19209;
        return new C20334(bArr[i] != 0, bArr[i + 1] != 0, m46716(i + 6, iM19208, bArr), m46716(i4, iM19209, bArr), i5 == i + i2 ? null : Byte.valueOf(bArr[i5 + 2]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46716(int i, int i2, byte[] bArr) {
        if (i2 > 150000) {
            return "";
        }
        String str = new String(bArr, i, i2, StandardCharsets.UTF_8);
        return str.length() <= 50000 ? str : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46717(C16475 c16475, int i) throws IOException {
        int i2 = c16475.readInt();
        if (i2 >= 0 && i2 <= i) {
            long j = i2;
            if (j <= c16475.m39101()) {
                if (i2 > 150000) {
                    c16475.m39103(j);
                    return "";
                }
                String strM39094 = c16475.m39094(i2, i);
                return strM39094.length() <= 50000 ? strM39094 : "";
            }
        }
        throw new IOException("Invalid legacy search text length");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m46722(C20348 c20348) {
        int i = c20348.readInt();
        if (i < 0 || i > c20348.available()) {
            throw new IllegalArgumentException("Invalid legacy search text length");
        }
        int iM46744 = c20348.m46744();
        c20348.skipBytes(i);
        return m46716(iM46744, i, c20348.f65270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m46723() {
        C6178 c6178 = new C6178();
        c6178.m17789(this.f65239);
        c6178.m17789(this.f65241);
        c6178.m17786((CharSequence) this.f65238);
        c6178.m17786((CharSequence) this.f65240);
        Byte b = this.f65237;
        if (b != null) {
            c6178.mo17812(29298);
            c6178.writeByte(b.byteValue());
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46715(int i, byte[] bArr, int i2, int i3) throws IOException {
        if (i3 < 0 || i2 > i3 || i2 < 10 || i < 0 || i > bArr.length - i2) {
            throw new IOException("Invalid legacy search field length");
        }
        int i4 = i + i2;
        int iM19208 = C6929.m19208(i + 2, bArr);
        if (iM19208 < 0 || iM19208 > i2 - 10) {
            throw new IOException("Invalid legacy search text length");
        }
        int i5 = i + 6 + iM19208;
        int iM19209 = C6929.m19208(i5, bArr);
        if (iM19209 < 0 || iM19209 > (i4 - i5) - 4) {
            throw new IOException("Invalid legacy replacement text length");
        }
        int i6 = i5 + 4 + iM19209;
        if (i6 == i4 || (i4 - i6 == 3 && C6929.m19212(i6, bArr) == 29298)) {
            return i5;
        }
        throw new IOException("Invalid legacy search parameter trailer");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20334 m46718(int i, long j, InputStream inputStream) throws IOException {
        Byte bValueOf;
        C16475 c16475M39088 = C16475.m39088(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy search exceeds app state limit");
            }
            boolean zM39096 = c16475M39088.m39096();
            boolean zM39097 = c16475M39088.m39096();
            String strM46717 = m46717(c16475M39088, i);
            String strM46718 = m46717(c16475M39088, i);
            if (c16475M39088.m39101() == 0) {
                bValueOf = null;
            } else {
                if (c16475M39088.m39101() != 3 || c16475M39088.m39097() != 29298) {
                    throw new IOException("Invalid legacy search parameter trailer");
                }
                bValueOf = Byte.valueOf((byte) c16475M39088.readByte());
            }
            c16475M39088.m39099();
            C20334 c20334 = new C20334(zM39096, zM39097, strM46717, strM46718, bValueOf);
            c16475M39088.close();
            return c20334;
        } catch (Throwable th) {
            try {
                c16475M39088.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20334 m46719(C20348 c20348) {
        Byte bValueOf;
        boolean zM46753 = c20348.m46753();
        boolean zM46754 = c20348.m46753();
        String strM46722 = m46722(c20348);
        String strM46723 = m46722(c20348);
        if (c20348.available() < 3 || c20348.m46750() != 29298) {
            bValueOf = null;
        } else {
            c20348.skipBytes(2);
            bValueOf = Byte.valueOf(c20348.readByte());
        }
        return new C20334(zM46753, zM46754, strM46722, strM46723, bValueOf);
    }
}
