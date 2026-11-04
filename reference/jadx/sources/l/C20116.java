package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.p.d;
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

/* JADX INFO: renamed from: l.ᩴ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20116 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46243(AbstractC22044 abstractC22044, AbstractC14806 abstractC14806, boolean z, boolean z2, InterfaceC8161 interfaceC8161) throws InvalidKeyException {
        List<AbstractC24241> listSingletonList;
        InterfaceC17044 interfaceC17044M36689;
        InterfaceC17044 interfaceC17044M366810;
        char c;
        char c2;
        byte[] bArrM46248;
        byte[] bArrM46249;
        byte[] bArr;
        int length;
        int i;
        if (!z && !z2) {
            throw new RuntimeException();
        }
        if (interfaceC8161 != null) {
            interfaceC8161.mo1553(z, z2);
        }
        PublicKey publicKey = abstractC14806.m35652().getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm)) {
            if (((RSAKey) publicKey).getModulus().bitLength() <= 3072) {
                HashMap map = AbstractC24241.f78515;
                listSingletonList = Collections.singletonList(new C12306(259, XMSSKeyParameters.SHA_256, d.a, "SHA256withRSA", null));
            } else {
                HashMap map2 = AbstractC24241.f78515;
                listSingletonList = Collections.singletonList(new C12306(260, XMSSKeyParameters.SHA_512, d.a, "SHA512withRSA", null));
            }
        } else if ("DSA".equalsIgnoreCase(algorithm)) {
            HashMap map3 = AbstractC24241.f78515;
            listSingletonList = Collections.singletonList(new C12306(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null));
        } else {
            if (!"EC".equalsIgnoreCase(algorithm)) {
                throw new InvalidKeyException(C25272.m56409("Unsupported key algorithm: ", algorithm));
            }
            HashMap map4 = AbstractC24241.f78515;
            listSingletonList = Collections.singletonList(new C12306(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null));
        }
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        try {
            C11911 c11911 = new C11911(c13961M49855);
            if (c11911.m29857()) {
                throw new C4866(R.string.MT_Protector);
            }
            InterfaceC17044 interfaceC17044M7329 = C2129.m7329((InterfaceC17044) C17790.m41639(c13961M49855, 0L, c11911.m29855()));
            InterfaceC17044 interfaceC17044M7332 = C2129.m7332(C17790.m41639(c13961M49855, c11911.m29851(), c11911.m29860()));
            long jM29862 = c11911.m29862();
            C15552 c15552M7328 = C2129.m7328(C17790.m41639(c13961M49855, jM29862, c11911.m29854() - jM29862));
            int iM29851 = (int) (c11911.m29851() - interfaceC17044M7329.size());
            if (iM29851 != 0) {
                byte[] bArrM37265 = c15552M7328.m37265();
                int iM37264 = c15552M7328.m37264() + 16;
                C2940.m9620(C2940.m9616(iM37264, bArrM37265) - ((long) iM29851), iM37264, bArrM37265);
            }
            if (interfaceC8161 == null) {
                interfaceC17044M36689 = interfaceC17044M7332;
                interfaceC17044M366810 = c15552M7328;
            } else {
                C15289 c15289 = new C15289((interfaceC17044M7329.size() + interfaceC17044M7332.size() + c15552M7328.size()) * ((long) listSingletonList.size()), interfaceC8161);
                interfaceC17044M7329 = c15289.m36689(interfaceC17044M7329);
                interfaceC17044M36689 = c15289.m36689(interfaceC17044M7332);
                interfaceC17044M366810 = c15289.m36689(c15552M7328);
            }
            InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC8161);
            boolean z3 = false;
            for (AbstractC24241 abstractC24241 : listSingletonList) {
                if (z3) {
                    InterfaceC17044[] interfaceC17044Arr = {interfaceC17044M7329, interfaceC17044M36689, interfaceC17044M366810};
                    int i2 = 0;
                    for (int i3 = 3; i2 < i3; i3 = 3) {
                        interfaceC17044Arr[i2].reset();
                        i2++;
                    }
                }
                abstractC24241.mo18064(interfaceC17044M7329, interfaceC17044M36689, interfaceC17044M366810, interfaceC7509M41888);
                if (interfaceC8161 != null && interfaceC8161.mo924()) {
                    c13961M49855.close();
                    return;
                }
                z3 = true;
            }
            if (z) {
                byte[] bArrM462410 = m46248(m46246(listSingletonList), m46247(abstractC14806.m35652()), new byte[4], new byte[4]);
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    ((AbstractC24241) it.next()).m54240(abstractC14806.m35653(), publicKey, bArrM462410);
                    if (interfaceC8161 != null && interfaceC8161.mo924()) {
                        c13961M49855.close();
                        return;
                    }
                }
                byte[] bArrM462411 = m46249(listSingletonList);
                byte[] bArrM46245 = m46245(publicKey);
                int length2 = bArrM462410.length + bArrM462411.length + bArrM46245.length;
                bArrM46248 = m46248(C2940.m9619(length2 + 16), C2940.m9619(length2 + 12), C2940.m9619(bArrM462410.length), bArrM462410, C2940.m9619(bArrM462411.length), bArrM462411, C2940.m9619(bArrM46245.length), bArrM46245);
                c = 7;
                c2 = 6;
            } else {
                c = 7;
                c2 = 6;
                bArrM46248 = null;
            }
            if (z2) {
                byte[] bArrM462412 = m46248(m46246(listSingletonList), m46247(abstractC14806.m35652()), C2940.m9619(28), C2940.m9619(Integer.MAX_VALUE), new byte[4]);
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC24241) it2.next()).m54240(abstractC14806.m35653(), publicKey, bArrM462412);
                    if (interfaceC8161 != null && interfaceC8161.mo924()) {
                        c13961M49855.close();
                        return;
                    }
                }
                byte[] bArrM462413 = m46249(listSingletonList);
                byte[] bArrM46246 = m46245(publicKey);
                int length3 = bArrM462412.length + bArrM462413.length + bArrM46246.length;
                int i4 = length3 + 20;
                byte[] bArrM9619 = C2940.m9619(length3 + 24);
                byte[] bArrM96110 = C2940.m9619(i4);
                byte[] bArrM96111 = C2940.m9619(bArrM462412.length);
                byte[] bArrM96112 = C2940.m9619(28);
                byte[] bArrM96113 = C2940.m9619(Integer.MAX_VALUE);
                byte[] bArrM96114 = C2940.m9619(bArrM462413.length);
                byte[] bArrM96115 = C2940.m9619(bArrM46246.length);
                byte[][] bArr2 = new byte[10][];
                bArr2[0] = bArrM9619;
                bArr2[1] = bArrM96110;
                bArr2[2] = bArrM96111;
                bArr2[3] = bArrM462412;
                bArr2[4] = bArrM96112;
                bArr2[5] = bArrM96113;
                bArr2[c2] = bArrM96114;
                bArr2[c] = bArrM462413;
                bArr2[8] = bArrM96115;
                bArr2[9] = bArrM46246;
                bArrM46249 = m46248(bArr2);
            } else {
                bArrM46249 = null;
            }
            if (interfaceC8161 != null && interfaceC8161.mo924()) {
                c13961M49855.close();
                return;
            }
            int iM54897 = C24579.m54897(!z ? 0 : bArrM46248.length + 12, 8, !z2 ? 0 : bArrM46249.length + 12, 24);
            if (iM54897 % 4096 != 0) {
                int i5 = iM54897 % 4096;
                int i6 = 4096 - i5;
                if (i6 < 12) {
                    i6 = 8192 - i5;
                }
                bArr = new byte[i6];
                C2940.m9618(i6 - 8, 0, bArr);
                C2940.m9617(1114793335, 8, bArr);
                iM54897 += i6;
            } else {
                bArr = null;
            }
            byte[] bArr3 = new byte[iM54897];
            long j = ((long) iM54897) - 8;
            C2940.m9618(j, 0, bArr3);
            if (z) {
                C2940.m9618(bArrM46248.length + 4, 8, bArr3);
                C2940.m9617(1896449818, 16, bArr3);
                System.arraycopy(bArrM46248, 0, bArr3, 20, bArrM46248.length);
                length = bArrM46248.length + 20;
            } else {
                length = 8;
            }
            if (z2) {
                C2940.m9618(bArrM46249.length + 4, length, bArr3);
                C2940.m9617(-262969152, length + 8, bArr3);
                int i7 = length + 12;
                System.arraycopy(bArrM46249, 0, bArr3, i7, bArrM46249.length);
                length = i7 + bArrM46249.length;
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, length, bArr.length);
                length += bArr.length;
            }
            C2940.m9618(j, length, bArr3);
            C2940.m9618(2334950737559900225L, length + 8, bArr3);
            C2940.m9618(3617552046287187010L, length + 16, bArr3);
            if (length + 24 != iM54897) {
                throw new IllegalStateException();
            }
            if (interfaceC8161 != null && interfaceC8161.mo924()) {
                c13961M49855.close();
                return;
            }
            int iM29855 = (int) (c11911.m29855() % ((long) 4096));
            int i8 = iM29855 == 0 ? 0 : 4096 - iM29855;
            c13961M49855.setLength(c11911.m29855());
            c13961M49855.seek(c11911.m29855());
            if (i8 != 0) {
                i = 0;
                c13961M49855.write(new byte[i8], 0, i8);
            } else {
                i = 0;
            }
            c13961M49855.write(bArr3, i, iM54897);
            long filePointer = c13961M49855.getFilePointer();
            interfaceC17044M7332.reset();
            interfaceC17044M7332.mo32878(interfaceC17044M7332.size(), c13961M49855);
            C2940.m9620(filePointer, c15552M7328.m37264() + 16, c15552M7328.m37265());
            c15552M7328.reset();
            C2129.m7331(c15552M7328, c13961M49855, c15552M7328.size());
            c13961M49855.close();
        } catch (Throwable th) {
            try {
                c13961M49855.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m46248(byte[]... bArr) {
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
    public static byte[] m46246(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 4;
        int length2 = 4;
        while (it.hasNext()) {
            AbstractC24241 abstractC24241 = (AbstractC24241) it.next();
            byte[] bArrM46244 = m46244(abstractC24241.mo18063(), abstractC24241.f78516);
            length2 += bArrM46244.length;
            arrayList.add(bArrM46244);
        }
        byte[] bArr = new byte[length2];
        C2940.m9617(length2 - 4, 0, bArr);
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m46247(X509Certificate... x509CertificateArr) throws CertificateEncodingException {
        ArrayList<byte[]> arrayList = new ArrayList(x509CertificateArr.length);
        int length = 4;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            byte[] encoded = x509Certificate.getEncoded();
            length += encoded.length + 4;
            arrayList.add(encoded);
        }
        byte[] bArr = new byte[length];
        C2940.m9617(length - 4, 0, bArr);
        int length2 = 4;
        for (byte[] bArr2 : arrayList) {
            C2940.m9617(bArr2.length, length2, bArr);
            int i = length2 + 4;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            length2 = i + bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m46249(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            AbstractC24241 abstractC24241 = (AbstractC24241) it.next();
            byte[] bArrM46244 = m46244(abstractC24241.mo18063(), abstractC24241.f78517);
            length += bArrM46244.length;
            arrayList.add(bArrM46244);
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
    public static byte[] m46244(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        C2940.m9617(bArr.length + 8, 0, bArr2);
        C2940.m9617(i, 4, bArr2);
        C2940.m9617(bArr.length, 8, bArr2);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m46245(PublicKey publicKey) throws InvalidKeyException {
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
