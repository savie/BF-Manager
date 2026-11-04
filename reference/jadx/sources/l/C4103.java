package l;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B02 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4103 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f13969;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f13970;

    public C4103(ArrayList arrayList, int i) {
        this.f13969 = i;
        this.f13970 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4103 m13197(byte[] bArr) throws IOException {
        int iMo18065;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        C13183 c13183 = null;
        if (byteBufferOrder == null || !byteBufferOrder.hasRemaining()) {
            arrayList = null;
        } else {
            if (byteBufferOrder.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int i = 0;
            try {
                if (byteBufferOrder.getInt() != 1) {
                    throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                }
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (byteBufferOrder.hasRemaining()) {
                    i++;
                    ByteBuffer byteBufferM45803 = C19896.m45803(byteBufferOrder);
                    ByteBuffer byteBufferM45804 = C19896.m45803(byteBufferM45803);
                    int i3 = byteBufferM45803.getInt();
                    int i4 = byteBufferM45803.getInt();
                    AbstractC24241 abstractC24241M54237 = AbstractC24241.m54237(i2);
                    byte[] bArrM45804 = C19896.m45804(byteBufferM45803);
                    if (c13183 != null) {
                        C17359.requireNonNull(abstractC24241M54237);
                        String strMo18068 = abstractC24241M54237.mo18068();
                        AlgorithmParameterSpec algorithmParameterSpecMo18066 = abstractC24241M54237.mo18066();
                        PublicKey publicKey = c13183.getPublicKey();
                        Signature signature = Signature.getInstance(strMo18068);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpecMo18066 != null) {
                            signature.setParameter(algorithmParameterSpecMo18066);
                        }
                        signature.update(byteBufferM45804);
                        if (!signature.verify(bArrM45804)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strMo18068 + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    byteBufferM45804.rewind();
                    byte[] bArrM45805 = C19896.m45804(byteBufferM45804);
                    int i5 = byteBufferM45804.getInt();
                    if (c13183 != null && i2 != i5) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferM45803 + " when verifying V3SigningCertificateLineage object");
                    }
                    C13183 c13184 = new C13183(C5726.m16793(bArrM45805), bArrM45805);
                    if (hashSet.contains(c13184)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(c13184);
                    arrayList.add(new C5946(c13184, AbstractC24241.m54237(i5), AbstractC24241.m54237(i4), bArrM45804, i3));
                    byteBufferOrder = byteBufferOrder;
                    c13183 = c13184;
                    i2 = i4;
                }
            } catch (BufferUnderflowException e) {
                e = e;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new SecurityException(C14442.m34864(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new SecurityException(C14442.m34864(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new SecurityException(C14442.m34864(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (SignatureException e5) {
                e = e5;
                throw new SecurityException(C14442.m34864(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (CertificateException e6) {
                throw new SecurityException(C14442.m34864(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e6);
            } catch (C22880 e7) {
                e = e7;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            }
        }
        if (arrayList == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator it = arrayList.iterator();
        int i6 = 28;
        while (it.hasNext()) {
            AbstractC24241 abstractC24241 = ((C5946) it.next()).f20364;
            if (abstractC24241 != null && (iMo18065 = abstractC24241.mo18065()) > i6) {
                i6 = iMo18065;
            }
        }
        return new C4103(arrayList, i6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13198() {
        return this.f13970.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4103 m13199(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13970;
            if (i < arrayList.size()) {
                if (((C5946) arrayList.get(i)).f20365.equals(x509Certificate)) {
                    return new C4103(new ArrayList(arrayList.subList(0, i + 1)), this.f13969);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4103 m13196(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size = ((C4103) list.get(i3)).f13970.size();
            if (size > i2) {
                i = i3;
                i2 = size;
            }
        }
        ArrayList arrayList = ((C4103) list.get(i)).f13970;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != i) {
                ArrayList arrayList2 = ((C4103) list.get(i4)).f13970;
                if (!arrayList2.equals(arrayList.subList(0, arrayList2.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return (C4103) list.get(i);
    }
}
