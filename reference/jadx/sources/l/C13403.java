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

/* JADX INFO: renamed from: l.۫᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13403 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2310 m33043(C11911 c11911, boolean z, byte[] bArr) throws EOFException {
        if (!c11911.m29858()) {
            return null;
        }
        c11911.m29852(c11911.m29855());
        long jM29863 = c11911.m29863() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM29863 > 0 && jM29863 >= 12) {
            long jM29864 = c11911.m29863();
            if (jM29864 < 4 || jM29864 > jM29863 - 8) {
                return null;
            }
            long jM29850 = c11911.m29850() + jM29864;
            if (c11911.m29856() == i) {
                try {
                    return m33042(c11911, jM29850, bArr);
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
    public static C2310 m33042(C11911 c11911, long j, byte[] bArr) throws C22880, EOFException {
        long jM52004 = C23100.m52004(c11911, C23100.m52004(c11911, j));
        long jM52005 = C23100.m52004(c11911, jM52004);
        c11911.m29852(C23100.m52004(c11911, jM52005));
        byte[] bArrM52009 = C23100.m52009(c11911, C23100.m52004(c11911, jM52005), bArr);
        if (bArrM52009 == null) {
            return null;
        }
        if (jM52005 - c11911.m29850() < 12) {
            throw new C22880("V3 signed data is missing SDK range or attributes");
        }
        int iM29856 = c11911.m29856();
        int iM29857 = c11911.m29856();
        long jM52006 = C23100.m52004(c11911, jM52005);
        long jM29850 = c11911.m29850();
        long j2 = 0;
        while (true) {
            byte[] bArr2 = bArrM52009;
            int i = iM29857;
            if (c11911.m29850() >= jM52006) {
                c11911.m29852(jM29850);
                C4103 c4103M13196 = null;
                while (c11911.m29850() < jM52006) {
                    long jM52007 = C23100.m52004(c11911, jM52006);
                    if (jM52007 - c11911.m29850() < 4) {
                        throw new C22880("V3 signing attribute is missing its ID");
                    }
                    if (c11911.m29856() != 1000370060) {
                        c11911.m29852(jM52007);
                    } else {
                        try {
                            C4103 c4103M13197 = C4103.m13197(c11911.m29853((int) (jM52007 - c11911.m29850())));
                            c4103M13196 = c4103M13196 == null ? c4103M13197 : C4103.m13196(Arrays.asList(c4103M13196, c4103M13197));
                        } catch (Exception e) {
                            throw new C22880("Failed to parse V3 signing certificate lineage", e);
                        }
                    }
                }
                c11911.m29852(jM52005);
                if (jM52004 - c11911.m29850() < 16) {
                    throw new C22880("V3 signer is missing SDK range, signatures, or public key");
                }
                int iM29858 = c11911.m29856();
                int iM29859 = c11911.m29856();
                if (iM29856 != iM29858 || i != iM29859) {
                    throw new C22880("V3 signer SDK range does not match signed data");
                }
                c11911.m29852(C23100.m52004(c11911, jM52004));
                c11911.m29852(C23100.m52004(c11911, jM52004));
                return new C2310(bArr2, c4103M13196);
            }
            long jM52008 = C23100.m52004(c11911, jM52006);
            if (jM52008 - c11911.m29850() < 4) {
                throw new C22880("V3 signing attribute is missing its ID");
            }
            if (c11911.m29856() == 1000370060) {
                long jM29851 = (jM52008 - c11911.m29850()) + j2;
                if (jM29851 > 4194304) {
                    throw new C22880("V3 proof-of-rotation data exceeds safety limit");
                }
                j2 = jM29851;
            }
            c11911.m29852(jM52008);
            bArrM52009 = bArr2;
            iM29857 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33044(C11911 c11911, boolean z, InterfaceC7509 interfaceC7509) throws EOFException {
        if (!c11911.m29858()) {
            return false;
        }
        c11911.m29852(c11911.m29855());
        long jM29863 = c11911.m29863() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM29863 > 0 && jM29863 >= 12) {
            long jM29864 = c11911.m29863();
            if (jM29864 < 4 || jM29864 > jM29863 - 8) {
                return false;
            }
            long jM29850 = c11911.m29850() + jM29864;
            if (c11911.m29856() == i) {
                try {
                    int iM52004 = (int) (C23100.m52004(c11911, jM29850) - c11911.m29850());
                    if (iM52004 <= 16777216) {
                        return m33045(c11911.m29853(iM52004), c11911.m29859(), c11911, interfaceC7509);
                    }
                    throw new C22880("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C22880 | Exception unused) {
                    return false;
                }
            }
            jM29863 -= jM29864 + 8;
            c11911.m29852(jM29850);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33045(byte[] bArr, InterfaceC17713 interfaceC17713, C11911 c11911, InterfaceC7509 interfaceC7509) throws C22880, IOException, CertificateException {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM45803 = C19896.m45803(byteBufferOrder);
            byte[] bArrM45804 = C19896.m45804(byteBufferM45803);
            int i = byteBufferM45803.getInt();
            int i2 = byteBufferM45803.getInt();
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
            int i3 = byteBufferOrder2.getInt();
            int i4 = byteBufferOrder2.getInt();
            C19896.m45803(byteBufferOrder2);
            if (i3 == i && i4 == i2) {
                ArrayList<C15640> arrayList2 = new ArrayList();
                while (byteBufferM45804.hasRemaining()) {
                    ByteBuffer byteBufferM45808 = C19896.m45803(byteBufferM45804);
                    int i5 = byteBufferM45808.getInt();
                    byte[] bArrM45806 = C19896.m45804(byteBufferM45808);
                    if (AbstractC24241.f78515.containsKey(Integer.valueOf(i5))) {
                        arrayList2.add(new C15640(i5, bArrM45806));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    for (C15640 c15640 : arrayList2) {
                        AbstractC24241 abstractC24241M54239 = AbstractC24241.m54239(c15640.f50784);
                        try {
                            if (abstractC24241M54239.m54241(KeyFactory.getInstance(abstractC24241M54239.mo18067()).generatePublic(new X509EncodedKeySpec(bArrM45805)), bArrM45804, c15640.f50785) && Arrays.equals(bArrM45805, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
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
                    for (C15640 c15641 : arrayList2) {
                        AbstractC24241 abstractC24241M542310 = AbstractC24241.m54239(c15641.f50784);
                        if (z) {
                            InterfaceC17044[] interfaceC17044Arr = {c16298M41639, c16298M416310, c15552M7328};
                            for (int i6 = 0; i6 < 3; i6++) {
                                interfaceC17044Arr[i6].reset();
                            }
                        }
                        abstractC24241M542310.mo18064(c16298M41639, c16298M416310, c15552M7328, interfaceC7509);
                        if (!interfaceC7509.mo924() && Arrays.equals(abstractC24241M542310.f78516, (byte[]) map.get(Integer.valueOf(c15641.f50784)))) {
                            z = true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
