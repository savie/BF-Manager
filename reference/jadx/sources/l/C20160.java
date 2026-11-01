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

/* JADX INFO: renamed from: l.᩶۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20160 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15927 m45582(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C23846.sort(arrayList, C7618.comparing(new C7459(0)));
        C23846.sort(arrayList2, new C20865());
        C11018 c11018 = new C11018(256);
        c11018.writeInt(1095784516);
        c11018.writeInt(1);
        c11018.writeInt(2);
        c11018.m27786(str);
        c11018.m27786(str2);
        c11018.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21601 c21601 = (C21601) it.next();
            c11018.m27786(c21601.f70066);
            c11018.m27786(c21601.f70063);
        }
        c11018.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c11018.m27786((String) it2.next());
        }
        return new C15927(str, c11018.m27785(C22253.m49421()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m45585(AbstractC20745 abstractC20745, C15927 c15927) {
        String str = c15927.f51607;
        MessageDigest messageDigestM49421 = C22253.m49421();
        Charset charset = StandardCharsets.UTF_8;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(C22253.m49424(messageDigestM49421.digest(str.getBytes(charset))).concat(".bin"));
        if (!abstractC20745M46690.mo33971()) {
            return null;
        }
        int length = str.getBytes(charset).length + 45;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC20745M46690.mo33970());
            try {
                long jMo33964 = abstractC20745M46690.mo33964();
                byte[] bArr = new byte[length];
                dataInputStream.readFully(bArr);
                C17367 c17367 = new C17367(bArr);
                if (c17367.readInt() == 1095784516 && c17367.readInt() == 1) {
                    String strM40458 = c17367.m40458();
                    byte[] bArr2 = new byte[32];
                    c17367.m40446(32, bArr2);
                    int i = c17367.readInt();
                    if (str.equals(strM40458) && Arrays.equals(c15927.f51608, bArr2) && i >= 0 && i == (jMo33964 - ((long) length)) - 4) {
                        byte[] bArr3 = new byte[i];
                        dataInputStream.readFully(bArr3);
                        byte[] bArr4 = new byte[4];
                        dataInputStream.readFully(bArr4);
                        int i2 = new C17367(bArr4).readInt();
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
        if (!abstractC20745M46690.mo33975()) {
            return null;
        }
        abstractC20745M46690.mo24647();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45584(AbstractC20745 abstractC20745, C15927 c15927, byte[] bArr) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(C22253.m49424(C22253.m49421().digest(c15927.f51607.getBytes(StandardCharsets.UTF_8))).concat(".bin"));
        abstractC20745M46690.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745M46690.m46733(".dex_build");
        try {
            OutputStream outputStreamMo33976 = abstractC20745M46733.mo33976(false);
            try {
                m45583(outputStreamMo33976, c15927, bArr);
                outputStreamMo33976.close();
                abstractC20745M46733.m46702(abstractC20745M46690, false, true, null);
                if (abstractC20745M46733.mo33975()) {
                    abstractC20745M46733.mo24647();
                }
            } catch (Throwable th) {
                if (outputStreamMo33976 != null) {
                    try {
                        outputStreamMo33976.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC20745M46733.mo33975()) {
                abstractC20745M46733.mo24647();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45583(OutputStream outputStream, C15927 c15927, byte[] bArr) throws IOException {
        C11018 c11018 = new C11018(96);
        c11018.writeInt(1095784516);
        c11018.writeInt(1);
        c11018.m27786(c15927.f51607);
        c11018.write(c15927.f51608);
        c11018.writeInt(bArr.length);
        c11018.m27780(outputStream);
        outputStream.write(bArr);
        c11018.m27774();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        c11018.writeInt((int) crc32.getValue());
        c11018.m27780(outputStream);
    }
}
