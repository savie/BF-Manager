package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20342 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f65266;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f65267;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f65268;

    public C20342(String str, byte[] bArr, String str2) {
        this.f65267 = str;
        this.f65266 = str2;
        this.f65268 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20342)) {
            return false;
        }
        C20342 c20342 = (C20342) obj;
        return C17359.equals(this.f65267, c20342.f65267) && C17359.equals(this.f65266, c20342.f65266) && C17359.equals(this.f65268, c20342.f65268);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f65268) + C24966.m55771(C17359.hashCode(this.f65267) * 31, 31, this.f65266);
    }

    public final String toString() {
        Object[] objArr = {this.f65267, this.f65266, this.f65268};
        String[] strArrSplit = "title;author;image".length() == 0 ? new String[0] : "title;author;image".split(l.b);
        StringBuilder sb = new StringBuilder("WavID3Info[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46734() {
        return this.f65266;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m46735() {
        return this.f65267;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m46736() {
        return this.f65268;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20342 m46733(C13961 c13961) {
        try {
            return m46732(new C15866(c13961), c13961.length(), new C23326(0));
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x013d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0172 A[PHI: r2 r3 r5
      0x0172: PHI (r2v9 java.lang.String) = 
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
      (r2v11 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
     binds: [B:79:0x013f, B:81:0x014a, B:83:0x0152, B:85:0x015a, B:87:0x015e, B:88:0x0160, B:73:0x0124, B:77:0x0136, B:76:0x012f, B:75:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r3v7 java.lang.String) = 
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v5 java.lang.String)
      (r3v9 java.lang.String)
      (r3v5 java.lang.String)
     binds: [B:79:0x013f, B:81:0x014a, B:83:0x0152, B:85:0x015a, B:87:0x015e, B:88:0x0160, B:73:0x0124, B:77:0x0136, B:76:0x012f, B:75:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r5v5 java.lang.String) = 
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v7 java.lang.String)
     binds: [B:79:0x013f, B:81:0x014a, B:83:0x0152, B:85:0x015a, B:87:0x015e, B:88:0x0160, B:73:0x0124, B:77:0x0136, B:76:0x012f, B:75:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20342 m46732(InterfaceC12227 interfaceC12227, long j, Predicate predicate) {
        C19378 c19378M17907;
        byte[] bArr;
        if (j >= 12) {
            byte[] bArr2 = new byte[12];
            C6262.m17908(interfaceC12227, 0L, bArr2, 0, 12);
            if (C6262.m17909("RIFF", 0, bArr2) && C6262.m17909("WAVE", 8, bArr2)) {
                int i = 4;
                long j2 = 4294967295L;
                long jM19208 = ((long) C6929.m19208(4, bArr2)) & 4294967295L;
                if (jM19208 < 4 || jM19208 > j - 8) {
                    throw new IOException("Invalid WAV RIFF size");
                }
                long j3 = jM19208 + 8;
                long j4 = 12;
                int i2 = 0;
                while (j4 < j3) {
                    if (i2 >= 1024 || j3 - j4 < 8) {
                        throw new IOException("Invalid WAV chunk list");
                    }
                    C6262.m17908(interfaceC12227, j4, bArr2, 0, 8);
                    long jM19209 = C6929.m19208(i, bArr2);
                    String str = null;
                    long j5 = jM19209 & j2;
                    long j6 = j4 + 8;
                    if (j5 > j3 - j6) {
                        throw new IOException("Truncated WAV chunk");
                    }
                    if (C6262.m17909("id3 ", 0, bArr2) || C6262.m17909("ID3 ", 0, bArr2)) {
                        C3278 c3278M17906 = C6262.m17906(interfaceC12227, j6, j5);
                        if (c3278M17906 == null || (c19378M17907 = C6262.m17907(interfaceC12227, c3278M17906, new C3188())) == null) {
                            return null;
                        }
                        String str2 = null;
                        byte[] bArr3 = null;
                        String str3 = null;
                        boolean z = false;
                        for (int i3 = 0; i3 < c19378M17907.m44819(); i3++) {
                            InterfaceC8191 interfaceC8191M44820 = c19378M17907.m44820(i3);
                            if (interfaceC8191M44820 instanceof C8993) {
                                C8993 c8993 = (C8993) interfaceC8191M44820;
                                AbstractC1928 abstractC1928 = c8993.f29298;
                                if (!abstractC1928.isEmpty()) {
                                    switch (c8993.f62806) {
                                        case "TP1":
                                        case "TPE1":
                                            str = (String) abstractC1928.get(0);
                                            break;
                                        case "TP2":
                                        case "TPE2":
                                            str2 = (String) abstractC1928.get(0);
                                            break;
                                        case "TT2":
                                        case "TIT2":
                                            str3 = (String) abstractC1928.get(0);
                                            break;
                                    }
                                } else if (interfaceC8191M44820 instanceof C12722) {
                                    C12722 c12722 = (C12722) interfaceC8191M44820;
                                    int i4 = c12722.f40737;
                                    String str4 = c12722.f40736;
                                    bArr = c12722.f40739;
                                    if (bArr.length <= 0 && !"-->".equals(str4) && !"image/-->".equals(str4) && (bArr3 == null || (!z && i4 == 3))) {
                                        if (predicate.test(bArr)) {
                                            z = i4 == 3;
                                            bArr3 = bArr;
                                        }
                                    }
                                }
                            } else if (interfaceC8191M44820 instanceof C12722) {
                                C12722 c12723 = (C12722) interfaceC8191M44820;
                                int i5 = c12723.f40737;
                                String str5 = c12723.f40736;
                                bArr = c12723.f40739;
                                if (bArr.length <= 0) {
                                }
                            }
                        }
                        if (str == null) {
                            str = str2;
                        }
                        return new C20342(str3, bArr3, str);
                    }
                    j4 = j6 + j5 + (jM19209 & 1);
                    if (j4 > j3) {
                        throw new IOException("Truncated WAV chunk padding");
                    }
                    i2++;
                    i = 4;
                    j2 = 4294967295L;
                }
            }
        }
        return null;
    }
}
