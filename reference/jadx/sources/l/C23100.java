package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 31A6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23100 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m52008(C11911 c11911, byte[] bArr) throws EOFException {
        if (!c11911.m29858()) {
            return null;
        }
        c11911.m29852(c11911.m29855());
        long jM29863 = c11911.m29863() - 24;
        while (jM29863 > 0 && jM29863 >= 12) {
            long jM29864 = c11911.m29863();
            if (jM29864 < 4 || jM29864 > jM29863 - 8) {
                return null;
            }
            long jM29850 = c11911.m29850() + jM29864;
            if (c11911.m29856() == 1896449818) {
                try {
                    return m52007(c11911, jM29850, bArr);
                } catch (RuntimeException | C22880 unused) {
                    return null;
                }
            }
            jM29863 -= jM29864 + 8;
            c11911.m29852(jM29850);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m52007(C11911 c11911, long j, byte[] bArr) throws C22880, EOFException {
        long jM52004 = m52004(c11911, m52004(c11911, j));
        long jM52005 = m52004(c11911, jM52004);
        c11911.m29852(m52004(c11911, jM52005));
        byte[] bArrM52009 = m52009(c11911, m52004(c11911, jM52005), bArr);
        if (bArrM52009 == null) {
            return null;
        }
        m52004(c11911, jM52005);
        c11911.m29852(jM52005);
        if (jM52004 - c11911.m29850() < 8) {
            throw new C22880("V2 signer is missing signatures or public key");
        }
        c11911.m29852(m52004(c11911, jM52004));
        c11911.m29852(m52004(c11911, jM52004));
        return bArrM52009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m52004(C11911 c11911, long j) throws C22880, EOFException {
        if (j - c11911.m29850() < 4) {
            throw new C22880("Length-prefixed field is missing its length");
        }
        int iM29856 = c11911.m29856();
        long jM29850 = j - c11911.m29850();
        if (iM29856 >= 0) {
            long j2 = iM29856;
            if (j2 <= jM29850) {
                return c11911.m29850() + j2;
            }
        }
        throw new C22880("Length-prefixed field exceeds its container");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m52009(C11911 c11911, long j, byte[] bArr) {
        try {
            if (j - c11911.m29850() > 4194304) {
                throw new C22880("Signing certificate sequence exceeds safety limit");
            }
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            while (c11911.m29850() < j) {
                long jM52004 = m52004(c11911, j);
                int iM29850 = (int) (jM52004 - c11911.m29850());
                if (iM29850 == 0) {
                    throw new C22880("Signing certificate is empty");
                }
                if (iM29850 > 1048576) {
                    throw new C22880("Signing certificate exceeds safety limit");
                }
                if (bArr3 == null || (bArr != null && bArr.length == iM29850)) {
                    byte[] bArrM29853 = c11911.m29853(iM29850);
                    if (bArr3 == null) {
                        bArr3 = bArrM29853;
                    }
                    if (bArr != null && Arrays.equals(bArr, bArrM29853)) {
                        bArr2 = bArrM29853;
                    }
                } else {
                    c11911.m29852(jM52004);
                }
            }
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            c11911.m29852(j);
            return bArr2;
        } catch (Throwable th) {
            c11911.m29852(j);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52005(C11911 c11911, InterfaceC7509 interfaceC7509) throws EOFException {
        if (!c11911.m29858()) {
            return false;
        }
        c11911.m29852(c11911.m29855());
        long jM29863 = c11911.m29863() - 24;
        while (jM29863 > 0 && jM29863 >= 12) {
            long jM29864 = c11911.m29863();
            if (jM29864 < 4 || jM29864 > jM29863 - 8) {
                return false;
            }
            long jM29850 = c11911.m29850() + jM29864;
            if (c11911.m29856() != 1896449818) {
                jM29863 -= jM29864 + 8;
                c11911.m29852(jM29850);
            } else {
                try {
                    int iM52004 = (int) (m52004(c11911, jM29850) - c11911.m29850());
                    if (iM52004 <= 16777216) {
                        return m52006(c11911.m29853(iM52004), c11911.m29859(), c11911, interfaceC7509);
                    }
                    throw new C22880("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C22880 | Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52006(byte[] bArr, InterfaceC17713 interfaceC17713, C11911 c11911, InterfaceC7509 interfaceC7509) throws C22880, IOException, CertificateException {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM45803 = C19896.m45803(byteBufferOrder);
            byte[] bArrM45804 = C19896.m45804(byteBufferM45803);
            ByteBuffer byteBufferM45804 = C19896.m45803(byteBufferM45803);
            byte[] bArrM45805 = C19896.m45804(byteBufferM45803);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArrM45804).order(ByteOrder.LITTLE_ENDIAN);
            ByteBuffer byteBufferM45805 = C19896.m45803(byteBufferOrder2);
            while (byteBufferM45805.hasRemaining()) {
                ByteBuffer byteBufferM45806 = C19896.m45803(byteBufferM45805);
                if (map.put(Integer.valueOf(byteBufferM45806.getInt()), C19896.m45804(byteBufferM45806)) != null) {
                    return false;
                }
            }
            ByteBuffer byteBufferM45807 = C19896.m45803(byteBufferOrder2);
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            while (byteBufferM45807.hasRemaining()) {
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(C19896.m45804(byteBufferM45807))));
            }
            C19896.m45803(byteBufferOrder2);
            ArrayList<C11165> arrayList2 = new ArrayList();
            while (byteBufferM45804.hasRemaining()) {
                ByteBuffer byteBufferM45808 = C19896.m45803(byteBufferM45804);
                int i = byteBufferM45808.getInt();
                byte[] bArrM45806 = C19896.m45804(byteBufferM45808);
                if (AbstractC24241.f78515.containsKey(Integer.valueOf(i))) {
                    arrayList2.add(new C11165(i, bArrM45806));
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C11165 c11165 : arrayList2) {
                    AbstractC24241 abstractC24241M54239 = AbstractC24241.m54239(c11165.f35161);
                    try {
                        if (abstractC24241M54239.m54241(KeyFactory.getInstance(abstractC24241M54239.mo18067()).generatePublic(new X509EncodedKeySpec(bArrM45805)), bArrM45804, c11165.f35162) && Arrays.equals(bArrM45805, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
                        }
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }
                C16298 c16298M41639 = C17790.m41639(interfaceC17713, 0L, c11911.m29855());
                C16298 c16298M416310 = C17790.m41639(interfaceC17713, c11911.m29851(), c11911.m29860());
                long jM29862 = c11911.m29862();
                C15552 c15552M7328 = C2129.m7328(C17790.m41639(interfaceC17713, jM29862, c11911.m29854() - jM29862));
                int iM29851 = (int) (c11911.m29851() - c11911.m29855());
                byte[] bArrM37265 = c15552M7328.m37265();
                int iM37264 = c15552M7328.m37264() + 16;
                C2940.m9620(C2940.m9616(iM37264, bArrM37265) - ((long) iM29851), iM37264, bArrM37265);
                boolean z = false;
                for (C11165 c11166 : arrayList2) {
                    AbstractC24241 abstractC24241M542310 = AbstractC24241.m54239(c11166.f35161);
                    if (z) {
                        InterfaceC17044[] interfaceC17044Arr = {c16298M41639, c16298M416310, c15552M7328};
                        for (int i2 = 0; i2 < 3; i2++) {
                            interfaceC17044Arr[i2].reset();
                        }
                    }
                    abstractC24241M542310.mo18064(c16298M41639, c16298M416310, c15552M7328, interfaceC7509);
                    if (!interfaceC7509.mo924() && Arrays.equals(abstractC24241M542310.f78516, (byte[]) map.get(Integer.valueOf(c11166.f35161)))) {
                        z = true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
