package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.p.d;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۜۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6464 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17660(AbstractC20745 abstractC20745, AbstractC17131 abstractC17131, boolean z, boolean z2, InterfaceC17379 interfaceC17379) throws IOException, InvalidKeyException {
        List<AbstractC20845> listSingletonList;
        InterfaceC19248 interfaceC19248M4088;
        InterfaceC19248 interfaceC19248M4089;
        char c;
        char c2;
        byte[] bArrM17665;
        byte[] bArrM17666;
        byte[] bArr;
        int length;
        int i;
        if (!z && !z2) {
            throw new RuntimeException();
        }
        if (interfaceC17379 != null) {
            interfaceC17379.mo2647(z, z2);
        }
        PublicKey publicKey = abstractC17131.m40009().getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm)) {
            if (((RSAKey) publicKey).getModulus().bitLength() <= 3072) {
                HashMap map = AbstractC20845.f67728;
                listSingletonList = Collections.singletonList(new C10262(259, XMSSKeyParameters.SHA_256, d.a, "SHA256withRSA", null));
            } else {
                HashMap map2 = AbstractC20845.f67728;
                listSingletonList = Collections.singletonList(new C10262(260, XMSSKeyParameters.SHA_512, d.a, "SHA512withRSA", null));
            }
        } else if ("DSA".equalsIgnoreCase(algorithm)) {
            HashMap map3 = AbstractC20845.f67728;
            listSingletonList = Collections.singletonList(new C10262(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null));
        } else {
            if (!"EC".equalsIgnoreCase(algorithm)) {
                throw new InvalidKeyException(C0252.m1693("Unsupported key algorithm: ", algorithm));
            }
            HashMap map4 = AbstractC20845.f67728;
            listSingletonList = Collections.singletonList(new C10262(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null));
        }
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        try {
            C18459 c18459 = new C18459(c1388M46710);
            if (c18459.m42806()) {
                throw new C4987(R.string.MT_Protector);
            }
            InterfaceC19248 interfaceC19248M41421 = C17836.m41421((InterfaceC19248) C8665.m22462(c1388M46710, 0L, c18459.m42814()));
            InterfaceC19248 interfaceC19248M41425 = C17836.m41425(C8665.m22462(c1388M46710, c18459.m42809(), c18459.m42816()));
            long jM42807 = c18459.m42807();
            C22776 c22776M41422 = C17836.m41422(C8665.m22462(c1388M46710, jM42807, c18459.m42815() - jM42807));
            int iM42809 = (int) (c18459.m42809() - interfaceC19248M41421.size());
            if (iM42809 != 0) {
                byte[] bArrM50429 = c22776M41422.m50429();
                int iM50430 = c22776M41422.m50430() + 16;
                C1856.m6059(C1856.m6055(iM50430, bArrM50429) - ((long) iM42809), iM50430, bArrM50429);
            }
            if (interfaceC17379 == null) {
                interfaceC19248M4088 = interfaceC19248M41425;
                interfaceC19248M4089 = c22776M41422;
            } else {
                C1088 c1088 = new C1088((interfaceC19248M41421.size() + interfaceC19248M41425.size() + c22776M41422.size()) * ((long) listSingletonList.size()), interfaceC17379);
                interfaceC19248M41421 = c1088.m4088(interfaceC19248M41421);
                interfaceC19248M4088 = c1088.m4088(interfaceC19248M41425);
                interfaceC19248M4089 = c1088.m4088(c22776M41422);
            }
            InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC17379);
            boolean z3 = false;
            for (AbstractC20845 abstractC20845 : listSingletonList) {
                if (z3) {
                    InterfaceC19248[] interfaceC19248Arr = {interfaceC19248M41421, interfaceC19248M4088, interfaceC19248M4089};
                    int i2 = 0;
                    for (int i3 = 3; i2 < i3; i3 = 3) {
                        interfaceC19248Arr[i2].reset();
                        i2++;
                    }
                }
                abstractC20845.mo19924(interfaceC19248M41421, interfaceC19248M4088, interfaceC19248M4089, interfaceC5614M29777);
                if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                    c1388M46710.close();
                    return;
                }
                z3 = true;
            }
            if (z) {
                byte[] bArrM17667 = m17665(m17663(listSingletonList), m17664(abstractC17131.m40009()), new byte[4], new byte[4]);
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    ((AbstractC20845) it.next()).m46870(abstractC17131.m40013(), publicKey, bArrM17667);
                    if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                        c1388M46710.close();
                        return;
                    }
                }
                byte[] bArrM17668 = m17666(listSingletonList);
                byte[] bArrM17662 = m17662(publicKey);
                int length2 = bArrM17667.length + bArrM17668.length + bArrM17662.length;
                bArrM17665 = m17665(C1856.m6058(length2 + 16), C1856.m6058(length2 + 12), C1856.m6058(bArrM17667.length), bArrM17667, C1856.m6058(bArrM17668.length), bArrM17668, C1856.m6058(bArrM17662.length), bArrM17662);
                c = 7;
                c2 = 6;
            } else {
                c = 7;
                c2 = 6;
                bArrM17665 = null;
            }
            if (z2) {
                byte[] bArrM17669 = m17665(m17663(listSingletonList), m17664(abstractC17131.m40009()), C1856.m6058(28), C1856.m6058(Integer.MAX_VALUE), new byte[4]);
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC20845) it2.next()).m46870(abstractC17131.m40013(), publicKey, bArrM17669);
                    if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                        c1388M46710.close();
                        return;
                    }
                }
                byte[] bArrM176610 = m17666(listSingletonList);
                byte[] bArrM17663 = m17662(publicKey);
                int length3 = bArrM17669.length + bArrM176610.length + bArrM17663.length;
                int i4 = length3 + 20;
                byte[] bArrM6058 = C1856.m6058(length3 + 24);
                byte[] bArrM6059 = C1856.m6058(i4);
                byte[] bArrM60510 = C1856.m6058(bArrM17669.length);
                byte[] bArrM60511 = C1856.m6058(28);
                byte[] bArrM60512 = C1856.m6058(Integer.MAX_VALUE);
                byte[] bArrM60513 = C1856.m6058(bArrM176610.length);
                byte[] bArrM60514 = C1856.m6058(bArrM17663.length);
                byte[][] bArr2 = new byte[10][];
                bArr2[0] = bArrM6058;
                bArr2[1] = bArrM6059;
                bArr2[2] = bArrM60510;
                bArr2[3] = bArrM17669;
                bArr2[4] = bArrM60511;
                bArr2[5] = bArrM60512;
                bArr2[c2] = bArrM60513;
                bArr2[c] = bArrM176610;
                bArr2[8] = bArrM60514;
                bArr2[9] = bArrM17663;
                bArrM17666 = m17665(bArr2);
            } else {
                bArrM17666 = null;
            }
            if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                c1388M46710.close();
                return;
            }
            int iM21118 = C8015.m21118(!z ? 0 : bArrM17665.length + 12, 8, !z2 ? 0 : bArrM17666.length + 12, 24);
            if (iM21118 % 4096 != 0) {
                int i5 = iM21118 % 4096;
                int i6 = 4096 - i5;
                if (i6 < 12) {
                    i6 = 8192 - i5;
                }
                bArr = new byte[i6];
                C1856.m6057(i6 - 8, 0, bArr);
                C1856.m6056(1114793335, 8, bArr);
                iM21118 += i6;
            } else {
                bArr = null;
            }
            byte[] bArr3 = new byte[iM21118];
            long j = ((long) iM21118) - 8;
            C1856.m6057(j, 0, bArr3);
            if (z) {
                C1856.m6057(bArrM17665.length + 4, 8, bArr3);
                C1856.m6056(1896449818, 16, bArr3);
                System.arraycopy(bArrM17665, 0, bArr3, 20, bArrM17665.length);
                length = bArrM17665.length + 20;
            } else {
                length = 8;
            }
            if (z2) {
                C1856.m6057(bArrM17666.length + 4, length, bArr3);
                C1856.m6056(-262969152, length + 8, bArr3);
                int i7 = length + 12;
                System.arraycopy(bArrM17666, 0, bArr3, i7, bArrM17666.length);
                length = i7 + bArrM17666.length;
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, length, bArr.length);
                length += bArr.length;
            }
            C1856.m6057(j, length, bArr3);
            C1856.m6057(2334950737559900225L, length + 8, bArr3);
            C1856.m6057(3617552046287187010L, length + 16, bArr3);
            if (length + 24 != iM21118) {
                throw new IllegalStateException();
            }
            if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                c1388M46710.close();
                return;
            }
            int iM42814 = (int) (c18459.m42814() % ((long) 4096));
            int i8 = iM42814 == 0 ? 0 : 4096 - iM42814;
            c1388M46710.setLength(c18459.m42814());
            c1388M46710.seek(c18459.m42814());
            if (i8 != 0) {
                i = 0;
                c1388M46710.write(new byte[i8], 0, i8);
            } else {
                i = 0;
            }
            c1388M46710.write(bArr3, i, iM21118);
            long filePointer = c1388M46710.getFilePointer();
            interfaceC19248M41425.reset();
            interfaceC19248M41425.mo25491(interfaceC19248M41425.size(), c1388M46710);
            C1856.m6059(filePointer, c22776M41422.m50430() + 16, c22776M41422.m50429());
            c22776M41422.reset();
            C17836.m41424(c22776M41422, c1388M46710, c22776M41422.size());
            c1388M46710.close();
        } catch (Throwable th) {
            try {
                c1388M46710.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17665(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17663(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 4;
        int length2 = 4;
        while (it.hasNext()) {
            AbstractC20845 abstractC20845 = (AbstractC20845) it.next();
            byte[] bArrM17661 = m17661(abstractC20845.mo19923(), abstractC20845.f67729);
            length2 += bArrM17661.length;
            arrayList.add(bArrM17661);
        }
        byte[] bArr = new byte[length2];
        C1856.m6056(length2 - 4, 0, bArr);
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17664(X509Certificate... x509CertificateArr) throws CertificateEncodingException {
        ArrayList<byte[]> arrayList = new ArrayList(x509CertificateArr.length);
        int length = 4;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            byte[] encoded = x509Certificate.getEncoded();
            length += encoded.length + 4;
            arrayList.add(encoded);
        }
        byte[] bArr = new byte[length];
        C1856.m6056(length - 4, 0, bArr);
        int length2 = 4;
        for (byte[] bArr2 : arrayList) {
            C1856.m6056(bArr2.length, length2, bArr);
            int i = length2 + 4;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            length2 = i + bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m17666(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            AbstractC20845 abstractC20845 = (AbstractC20845) it.next();
            byte[] bArrM17661 = m17661(abstractC20845.mo19923(), abstractC20845.f67730);
            length += bArrM17661.length;
            arrayList.add(bArrM17661);
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17661(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        C1856.m6056(bArr.length + 8, 0, bArr2);
        C1856.m6056(i, 4, bArr2);
        C1856.m6056(bArr.length, 8, bArr2);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17662(PublicKey publicKey) throws InvalidKeyException {
        try {
            byte[] encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            if (encoded != null && encoded.length != 0) {
                return encoded;
            }
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e);
        }
    }
}
