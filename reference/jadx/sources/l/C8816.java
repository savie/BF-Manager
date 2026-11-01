package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: renamed from: l.ۡۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8816 implements InterfaceC20769 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f30314 = C13488.m32997(C8816.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier[] f30315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f30317;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15125 f30318;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier f30320;

    static {
        try {
            new ASN1ObjectIdentifier("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f30314.mo12138("Failed to initialize OID", (Throwable) e);
        }
    }

    public C8816(InterfaceC10601 interfaceC10601, C15125 c15125) {
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {C15125.f49401};
        this.f30319 = true;
        this.f30318 = c15125;
        this.f30315 = aSN1ObjectIdentifierArr;
        C9895 c9895 = (C9895) interfaceC10601;
        c9895.getClass();
        this.f30317 = c9895.m25041();
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo22945() {
        return this.f30318.mo22945();
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo22944(int i, byte[] bArr) throws C8484 {
        Object c20810;
        byte[] bArrM45473;
        byte[] bArrM22942;
        AbstractC20105 c20811;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (this.f30316) {
            throw new C8484("Already complete");
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f30315;
        C15125 c15125 = this.f30318;
        if (i == 0) {
            c20811 = new C7404(aSN1ObjectIdentifierArr, 0, c15125.mo22944(0, new byte[0]));
        } else {
            byte[] bArr2 = new byte[i];
            if (bArr.length != i) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
                bArr = bArr2;
            }
            try {
                byte b = bArr[0];
                if (b == -95) {
                    c20810 = new C20810(bArr);
                } else if (b == 96) {
                    c20810 = new C7404(bArr);
                } else {
                    throw new C15872("Invalid token type");
                }
                if (c20810 instanceof C7404) {
                    C7404 c7404 = (C7404) c20810;
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArrM19750 = c7404.m19750();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifierArrM19750[0];
                    c15125.getClass();
                    if (C15125.f49401.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        bArrM45473 = c7404.m45473();
                    } else {
                        int length = aSN1ObjectIdentifierArrM19750.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aSN1ObjectIdentifier = null;
                                break;
                            }
                            aSN1ObjectIdentifier = aSN1ObjectIdentifierArrM19750[i2];
                            if (C15125.f49401.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                                break;
                            }
                            i2++;
                        }
                        if (aSN1ObjectIdentifier == null) {
                            throw new C12303("Server does advertise any supported mechanism");
                        }
                        bArrM45473 = null;
                    }
                } else if (c20810 instanceof C20810) {
                    C20810 c20812 = (C20810) c20810;
                    if (this.f30319) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifierM46799 = c20812.m46799();
                        c15125.getClass();
                        if (!C15125.f49401.equals((ASN1Primitive) aSN1ObjectIdentifierM46799)) {
                            throw new C12303("Server chose an unsupported mechanism " + c20812.m46799());
                        }
                        this.f30320 = c20812.m46799();
                        if (c20812.m46800() == 3) {
                            this.f30317 = true;
                        }
                        this.f30319 = false;
                    } else if (c20812.m46799() != null && !c20812.m46799().equals((ASN1Primitive) this.f30320)) {
                        throw new C12303("Server switched mechanism");
                    }
                    bArrM45473 = c20812.m45473();
                } else {
                    throw new C12303("Invalid token");
                }
                boolean z = c20810 instanceof C20810;
                if (z && c15125.mo22943()) {
                    C20810 c20813 = (C20810) c20810;
                    if (c20813.m46800() == 1 && c20813.m45473() == null && c20813.m45471() != null) {
                        m22940(c20813.m45471());
                        c20811 = new C20810(null, m22942());
                    } else {
                        if (c20813.m46800() != 0) {
                            throw new C12303("SPNEGO negotiation did not complete");
                        }
                        m22940(c20813.m45471());
                        this.f30316 = true;
                        c20811 = null;
                    }
                } else if (bArrM45473 != null) {
                    byte[] bArrMo22944 = c15125.mo22944(bArrM45473.length, bArrM45473);
                    if (z) {
                        C20810 c20814 = (C20810) c20810;
                        if (c20814.m46800() == 0 && c15125.mo22943()) {
                            m22940(c20814.m45471());
                            bArrM22942 = m22942();
                            this.f30316 = true;
                        } else if (c15125.m36254()) {
                            bArrM22942 = m22942();
                        } else {
                            if (c20814.m46800() == 2) {
                                throw new C12303("SPNEGO mechanism was rejected");
                            }
                            bArrM22942 = null;
                        }
                    } else {
                        bArrM22942 = null;
                    }
                    c20811 = new C20810(bArrMo22944, bArrM22942);
                } else {
                    c20811 = new C7404(aSN1ObjectIdentifierArr, 0, c15125.mo22944(0, new byte[0]));
                }
            } catch (IOException unused) {
                throw new C15872("Invalid token");
            }
        }
        if (c20811 == null) {
            return null;
        }
        return c20811.mo19751();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m22942() throws C8484 {
        C15125 c15125 = this.f30318;
        if (!c15125.m36254()) {
            return null;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f30315;
        byte[] bArrM22941 = m22941(aSN1ObjectIdentifierArr);
        byte[] bArrM36253 = c15125.m36253(bArrM22941);
        InterfaceC4314 interfaceC4314 = f30314;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Out Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
            interfaceC4314.mo12135("Out Mech list encoded ".concat(C5993.m16281(bArrM22941, 0, bArrM22941.length)));
            interfaceC4314.mo12135("Out Mech list MIC ".concat(C5993.m16281(bArrM36253, 0, 16)));
        }
        return bArrM36253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22940(byte[] bArr) throws C8484 {
        C15125 c15125 = this.f30318;
        if (bArr != null) {
            c15125.getClass();
        } else if (this.f30317 && !c15125.m36252(this.f30320)) {
            throw new C8484("SPNEGO integrity is required but not available");
        }
        if (!c15125.m36254() || bArr == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f30315;
            byte[] bArrM22941 = m22941(aSN1ObjectIdentifierArr);
            InterfaceC4314 interfaceC4314 = f30314;
            if (interfaceC4314.mo12141()) {
                interfaceC4314.mo12135("In Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
                interfaceC4314.mo12135("In Mech list encoded ".concat(C5993.m16281(bArrM22941, 0, bArrM22941.length)));
                interfaceC4314.mo12135("In Mech list MIC ".concat(C5993.m16281(bArr, 0, bArr.length)));
            }
            c15125.m36251(bArrM22941, bArr);
        } catch (C8484 e) {
            throw new C8484("Failed to verify mechanismListMIC", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22941(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr) throws C8484 {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERSequence(aSN1ObjectIdentifierArr));
            aSN1OutputStreamCreate.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C8484("Failed to encode mechList", e);
        }
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22943() {
        return this.f30316 && this.f30318.mo22943();
    }

    public final String toString() {
        return "SPNEGO[" + this.f30318 + "]";
    }
}
