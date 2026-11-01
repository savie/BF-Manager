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

/* JADX INFO: renamed from: l.ܺۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B02 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51508;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51509;

    public C15907(ArrayList arrayList, int i) {
        this.f51508 = i;
        this.f51509 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15907 m37815(byte[] bArr) throws IOException {
        int iMo19926;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        C15513 c15513 = null;
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
                    ByteBuffer byteBufferM18897 = C7045.m18897(byteBufferOrder);
                    ByteBuffer byteBufferM18898 = C7045.m18897(byteBufferM18897);
                    int i3 = byteBufferM18897.getInt();
                    int i4 = byteBufferM18897.getInt();
                    AbstractC20845 abstractC20845M46867 = AbstractC20845.m46867(i2);
                    byte[] bArrM18898 = C7045.m18898(byteBufferM18897);
                    if (c15513 != null) {
                        C13638.requireNonNull(abstractC20845M46867);
                        String strMo19922 = abstractC20845M46867.mo19922();
                        AlgorithmParameterSpec algorithmParameterSpecMo19925 = abstractC20845M46867.mo19925();
                        PublicKey publicKey = c15513.getPublicKey();
                        Signature signature = Signature.getInstance(strMo19922);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpecMo19925 != null) {
                            signature.setParameter(algorithmParameterSpecMo19925);
                        }
                        signature.update(byteBufferM18898);
                        if (!signature.verify(bArrM18898)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + strMo19922 + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    byteBufferM18898.rewind();
                    byte[] bArrM18899 = C7045.m18898(byteBufferM18898);
                    int i5 = byteBufferM18898.getInt();
                    if (c15513 != null && i2 != i5) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferM18897 + " when verifying V3SigningCertificateLineage object");
                    }
                    C15513 c15514 = new C15513(C21862.m48643(bArrM18899), bArrM18899);
                    if (hashSet.contains(c15514)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i + ".  All signing certificates should be unique");
                    }
                    hashSet.add(c15514);
                    arrayList.add(new C21281(c15514, AbstractC20845.m46867(i5), AbstractC20845.m46867(i4), bArrM18898, i3));
                    byteBufferOrder = byteBufferOrder;
                    c15513 = c15514;
                    i2 = i4;
                }
            } catch (BufferUnderflowException e) {
                e = e;
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new SecurityException(C2271.m6966(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new SecurityException(C2271.m6966(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new SecurityException(C2271.m6966(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (SignatureException e5) {
                e = e5;
                throw new SecurityException(C2271.m6966(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
            } catch (CertificateException e6) {
                throw new SecurityException(C2271.m6966(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e6);
            } catch (C4222 e7) {
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
            AbstractC20845 abstractC20845 = ((C21281) it.next()).f69277;
            if (abstractC20845 != null && (iMo19926 = abstractC20845.mo19926()) > i6) {
                i6 = iMo19926;
            }
        }
        return new C15907(arrayList, i6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37816() {
        return this.f51509.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15907 m37817(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51509;
            if (i < arrayList.size()) {
                if (((C21281) arrayList.get(i)).f69276.equals(x509Certificate)) {
                    return new C15907(new ArrayList(arrayList.subList(0, i + 1)), this.f51508);
                }
                i++;
            } else {
                throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15907 m37814(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size = ((C15907) list.get(i3)).f51509.size();
            if (size > i2) {
                i = i3;
                i2 = size;
            }
        }
        ArrayList arrayList = ((C15907) list.get(i)).f51509;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != i) {
                ArrayList arrayList2 = ((C15907) list.get(i4)).f51509;
                if (!arrayList2.equals(arrayList.subList(0, arrayList2.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return (C15907) list.get(i);
    }
}
