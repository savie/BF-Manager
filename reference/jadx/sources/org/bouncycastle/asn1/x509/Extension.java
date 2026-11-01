package org.bouncycastle.asn1.x509;

import java.io.IOException;
import l.C15489;
import l.C1679;
import l.C8550;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Extension extends ASN1Object {
    public boolean critical;
    public ASN1ObjectIdentifier extnId;
    public ASN1OctetString value;
    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = C1679.m5596("2.5.29.9");
    public static final ASN1ObjectIdentifier subjectKeyIdentifier = C1679.m5596("2.5.29.14");
    public static final ASN1ObjectIdentifier keyUsage = C1679.m5596("2.5.29.15");
    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = C1679.m5596("2.5.29.16");
    public static final ASN1ObjectIdentifier subjectAlternativeName = C1679.m5596("2.5.29.17");
    public static final ASN1ObjectIdentifier issuerAlternativeName = C1679.m5596("2.5.29.18");
    public static final ASN1ObjectIdentifier basicConstraints = C1679.m5596("2.5.29.19");
    public static final ASN1ObjectIdentifier cRLNumber = C1679.m5596("2.5.29.20");
    public static final ASN1ObjectIdentifier reasonCode = C1679.m5596("2.5.29.21");
    public static final ASN1ObjectIdentifier instructionCode = C1679.m5596("2.5.29.23");
    public static final ASN1ObjectIdentifier invalidityDate = C1679.m5596("2.5.29.24");
    public static final ASN1ObjectIdentifier deltaCRLIndicator = C1679.m5596("2.5.29.27");
    public static final ASN1ObjectIdentifier issuingDistributionPoint = C1679.m5596("2.5.29.28");
    public static final ASN1ObjectIdentifier certificateIssuer = C1679.m5596("2.5.29.29");
    public static final ASN1ObjectIdentifier nameConstraints = C1679.m5596("2.5.29.30");
    public static final ASN1ObjectIdentifier cRLDistributionPoints = C1679.m5596("2.5.29.31");
    public static final ASN1ObjectIdentifier certificatePolicies = C1679.m5596("2.5.29.32");
    public static final ASN1ObjectIdentifier policyMappings = C1679.m5596("2.5.29.33");
    public static final ASN1ObjectIdentifier authorityKeyIdentifier = C1679.m5596("2.5.29.35");
    public static final ASN1ObjectIdentifier policyConstraints = C1679.m5596("2.5.29.36");
    public static final ASN1ObjectIdentifier extendedKeyUsage = C1679.m5596("2.5.29.37");
    public static final ASN1ObjectIdentifier freshestCRL = C1679.m5596("2.5.29.46");
    public static final ASN1ObjectIdentifier inhibitAnyPolicy = C1679.m5596("2.5.29.54");
    public static final ASN1ObjectIdentifier authorityInfoAccess = C1679.m5596("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier subjectInfoAccess = C1679.m5596("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier logoType = C1679.m5596("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier biometricInfo = C1679.m5596("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier qCStatements = C1679.m5596("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier auditIdentity = C1679.m5596("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier noRevAvail = C1679.m5596("2.5.29.56");
    public static final ASN1ObjectIdentifier targetInformation = C1679.m5596("2.5.29.55");
    public static final ASN1ObjectIdentifier expiredCertsOnCRL = C1679.m5596("2.5.29.60");
    public static final ASN1ObjectIdentifier subjectAltPublicKeyInfo = C1679.m5596("2.5.29.72");
    public static final ASN1ObjectIdentifier altSignatureAlgorithm = C1679.m5596("2.5.29.73");
    public static final ASN1ObjectIdentifier altSignatureValue = C1679.m5596("2.5.29.74");
    public static final ASN1ObjectIdentifier deltaCertificateDescriptor = new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.1");

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Boolean aSN1Boolean, ASN1OctetString aSN1OctetString) {
        this(aSN1ObjectIdentifier, aSN1Boolean.isTrue(), aSN1OctetString);
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, ASN1OctetString aSN1OctetString) {
        this.extnId = aSN1ObjectIdentifier;
        this.critical = z;
        this.value = aSN1OctetString;
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this(aSN1ObjectIdentifier, z, new DEROctetString(Arrays.clone(bArr)));
    }

    public Extension(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 2) {
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = false;
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(C8550.m22297(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.value = ASN1OctetString.getInstance(objectAt);
    }

    public static Extension create(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, ASN1Encodable aSN1Encodable) {
        return new Extension(aSN1ObjectIdentifier, z, new DEROctetString(aSN1Encodable.toASN1Primitive().getEncoded()));
    }

    public static Extension getInstance(Object obj) {
        if (obj instanceof Extension) {
            return (Extension) obj;
        }
        if (obj != null) {
            return new Extension(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return extension.getExtnId().equals((ASN1Primitive) getExtnId()) && extension.getExtnValue().equals((ASN1Primitive) getExtnValue()) && extension.isCritical() == isCritical();
    }

    public ASN1ObjectIdentifier getExtnId() {
        return this.extnId;
    }

    public ASN1OctetString getExtnValue() {
        return this.value;
    }

    public ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isCritical() ? getExtnValue().hashCode() ^ getExtnId().hashCode() : ~(getExtnValue().hashCode() ^ getExtnId().hashCode());
    }

    public boolean isCritical() {
        return this.critical;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.extnId);
        if (this.critical) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(true));
        }
        aSN1EncodableVector.add(this.value);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ASN1Primitive convertValueToObject(Extension extension) {
        try {
            return ASN1Primitive.fromByteArray(extension.getExtnValue().getOctets());
        } catch (IOException e) {
            throw new IllegalArgumentException(C15489.m37075("can't convert extension: ", e));
        }
    }
}
