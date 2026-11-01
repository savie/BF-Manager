package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: renamed from: l.۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9XD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7404 extends AbstractC20105 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ASN1ObjectIdentifier f24598 = new ASN1ObjectIdentifier("1.3.6.1.5.5.2");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier[] f24599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f24600;

    public C7404(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1InputStream.readObject();
            if (aSN1TaggedObject == null || aSN1TaggedObject.getTagClass() != 64 || !(aSN1TaggedObject.getBaseObject() instanceof ASN1Sequence)) {
                throw new IOException("Malformed SPNEGO token " + aSN1TaggedObject);
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1TaggedObject.getBaseObject();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
            if (!f24598.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new IOException("Malformed SPNEGO token, OID " + aSN1ObjectIdentifier);
            }
            ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            if (aSN1TaggedObject2.getTagNo() != 0) {
                throw new IOException("Malformed SPNEGO token: tag " + aSN1TaggedObject2.getTagNo() + " " + aSN1TaggedObject2);
            }
            Enumeration objects = ASN1Sequence.getInstance(aSN1TaggedObject2, true).getObjects();
            while (objects.hasMoreElements()) {
                ASN1TaggedObject aSN1TaggedObject3 = (ASN1TaggedObject) objects.nextElement();
                int tagNo = aSN1TaggedObject3.getTagNo();
                if (tagNo == 0) {
                    ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject3, true);
                    int size = aSN1Sequence2.size();
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            aSN1ObjectIdentifierArr[size] = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(size);
                        }
                    }
                    this.f24599 = aSN1ObjectIdentifierArr;
                } else if (tagNo == 1) {
                    this.f24600 = ASN1BitString.getInstance(aSN1TaggedObject3, true).getBytes()[0] & 255;
                } else if (tagNo == 2) {
                    m45472(ASN1OctetString.getInstance(aSN1TaggedObject3, true).getOctets());
                } else {
                    if (tagNo != 3) {
                        if (tagNo != 4) {
                            throw new IOException("Malformed token field.");
                        }
                    } else if (!(aSN1TaggedObject3.getBaseObject() instanceof DEROctetString)) {
                    }
                    m45470(ASN1OctetString.getInstance(aSN1TaggedObject3, true).getOctets());
                }
            }
            aSN1InputStream.close();
        } catch (Throwable th) {
            try {
                aSN1InputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C7404(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, int i, byte[] bArr) {
        this.f24599 = aSN1ObjectIdentifierArr;
        this.f24600 = i;
        m45472(bArr);
        m45470(null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ASN1ObjectIdentifier[] m19750() {
        return this.f24599;
    }

    public final String toString() {
        return String.format("NegTokenInit[flags=%d,mechs=%s,mic=%s]", Integer.valueOf(this.f24600), Arrays.toString(this.f24599), m45471() != null ? C5993.m16281(m45471(), 0, m45471().length) : null);
    }

    @Override // l.AbstractC20105
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] mo19751() {
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f24599;
            if (aSN1ObjectIdentifierArr != null) {
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier : aSN1ObjectIdentifierArr) {
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier);
                }
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector2)));
            }
            int i = this.f24600;
            if (i != 0) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) new DERBitString(i)));
            }
            byte[] bArrM45473 = m45473();
            if (bArrM45473 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(bArrM45473)));
            }
            byte[] bArrM45471 = m45471();
            if (bArrM45471 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) new DEROctetString(bArrM45471)));
            }
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            aSN1EncodableVector3.add(f24598);
            aSN1EncodableVector3.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER).writeObject((ASN1Primitive) new DERTaggedObject(false, 64, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector3)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
