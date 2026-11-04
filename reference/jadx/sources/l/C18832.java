package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩳۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18832 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7645 m43687(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C12884.sort(arrayList, C2661.comparing(new C20299(1)));
        C12884.sort(arrayList2, new C0187(0));
        C6178 c6178 = new C6178(256);
        c6178.writeInt(1095784516);
        c6178.writeInt(1);
        c6178.writeInt(2);
        c6178.m17800(str);
        c6178.m17800(str2);
        c6178.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1723 c1723 = (C1723) it.next();
            c6178.m17800(c1723.f5880);
            c6178.m17800(c1723.f5881);
        }
        c6178.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c6178.m17800((String) it2.next());
        }
        return new C7645(str, c6178.m17791(C15022.m36179()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43690(AbstractC22044 abstractC22044, C7645 c7645) {
        String str = c7645.f25208;
        MessageDigest messageDigestM36179 = C15022.m36179();
        Charset charset = StandardCharsets.UTF_8;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(C15022.m36182(messageDigestM36179.digest(str.getBytes(charset))).concat(".bin"));
        if (!abstractC22044M49876.mo4304()) {
            return null;
        }
        int length = str.getBytes(charset).length + 45;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC22044M49876.mo4290());
            try {
                long jMo4285 = abstractC22044M49876.mo4285();
                byte[] bArr = new byte[length];
                dataInputStream.readFully(bArr);
                C20348 c20348 = new C20348(bArr);
                if (c20348.readInt() == 1095784516 && c20348.readInt() == 1) {
                    String strM46758 = c20348.m46758();
                    byte[] bArr2 = new byte[32];
                    c20348.m46745(32, bArr2);
                    int i = c20348.readInt();
                    if (str.equals(strM46758) && Arrays.equals(c7645.f25209, bArr2) && i >= 0 && i == (jMo4285 - ((long) length)) - 4) {
                        byte[] bArr3 = new byte[i];
                        dataInputStream.readFully(bArr3);
                        byte[] bArr4 = new byte[4];
                        dataInputStream.readFully(bArr4);
                        int i2 = new C20348(bArr4).readInt();
                        if (dataInputStream.read() == -1) {
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == i2) {
                                dataInputStream.close();
                                return bArr3;
                            }
                        }
                    }
                }
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        if (!abstractC22044M49876.mo2934()) {
            return null;
        }
        abstractC22044M49876.mo4296();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43689(AbstractC22044 abstractC22044, C7645 c7645, byte[] bArr) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(C15022.m36182(C15022.m36179().digest(c7645.f25208.getBytes(StandardCharsets.UTF_8))).concat(".bin"));
        abstractC22044M49876.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044M49876.m49862(".dex_build");
        try {
            OutputStream outputStreamMo4289 = abstractC22044M49862.mo4289(false);
            try {
                m43688(outputStreamMo4289, c7645, bArr);
                outputStreamMo4289.close();
                abstractC22044M49862.m49848(abstractC22044M49876, false, true, null);
                if (abstractC22044M49862.mo2934()) {
                    abstractC22044M49862.mo4296();
                }
            } catch (Throwable th) {
                if (outputStreamMo4289 != null) {
                    try {
                        outputStreamMo4289.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC22044M49862.mo2934()) {
                abstractC22044M49862.mo4296();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43688(OutputStream outputStream, C7645 c7645, byte[] bArr) throws IOException {
        C6178 c6178 = new C6178(96);
        c6178.writeInt(1095784516);
        c6178.writeInt(1);
        c6178.m17800(c7645.f25208);
        c6178.write(c7645.f25209);
        c6178.writeInt(bArr.length);
        c6178.m17784(outputStream);
        outputStream.write(bArr);
        c6178.m17793();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        c6178.writeInt((int) crc32.getValue());
        c6178.m17784(outputStream);
    }
}
