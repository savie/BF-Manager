package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: renamed from: l.֫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1558 implements InterfaceC16998 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f5381 = C16980.m40037(C1558.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5382;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22220 f5383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier f5384;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f5385;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f5386;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier[] f5387;

    static {
        try {
            new ASN1ObjectIdentifier("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f5381.mo13724("Failed to initialize OID", (Throwable) e);
        }
    }

    public C1558(InterfaceC5878 interfaceC5878, C22220 c22220) {
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {C22220.f71573};
        this.f5386 = true;
        this.f5383 = c22220;
        this.f5387 = aSN1ObjectIdentifierArr;
        C14826 c14826 = (C14826) interfaceC5878;
        c14826.getClass();
        this.f5385 = c14826.m35722();
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] mo5498() {
        return this.f5383.mo5498();
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo5497(int i, byte[] bArr) throws C20048 {
        AbstractC15727 c16473;
        byte[] bArrM37640;
        byte[] bArrM5495;
        AbstractC15727 c16474;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (this.f5382) {
            throw new C20048("Already complete");
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f5387;
        C22220 c22220 = this.f5383;
        if (i == 0) {
            c16474 = new C24679(aSN1ObjectIdentifierArr, 0, c22220.mo5497(0, new byte[0]));
        } else {
            byte[] bArr2 = new byte[i];
            if (bArr.length != i) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
                bArr = bArr2;
            }
            try {
                byte b = bArr[0];
                if (b == -95) {
                    c16473 = new C16473(bArr);
                } else if (b == 96) {
                    c16473 = new C24679(bArr);
                } else {
                    throw new C17219("Invalid token type");
                }
                if (c16473 instanceof C24679) {
                    C24679 c24679 = (C24679) c16473;
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArrM55026 = c24679.m55026();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifierArrM55026[0];
                    c22220.getClass();
                    if (C22220.f71573.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        bArrM37640 = c24679.m37640();
                    } else {
                        int length = aSN1ObjectIdentifierArrM55026.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aSN1ObjectIdentifier = null;
                                break;
                            }
                            aSN1ObjectIdentifier = aSN1ObjectIdentifierArrM55026[i2];
                            if (C22220.f71573.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                                break;
                            }
                            i2++;
                        }
                        if (aSN1ObjectIdentifier == null) {
                            throw new C20728("Server does advertise any supported mechanism");
                        }
                        bArrM37640 = null;
                    }
                } else if (c16473 instanceof C16473) {
                    C16473 c16475 = (C16473) c16473;
                    if (this.f5386) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifierM39081 = c16475.m39081();
                        c22220.getClass();
                        if (!C22220.f71573.equals((ASN1Primitive) aSN1ObjectIdentifierM39081)) {
                            throw new C20728("Server chose an unsupported mechanism " + c16475.m39081());
                        }
                        this.f5384 = c16475.m39081();
                        if (c16475.m39080() == 3) {
                            this.f5385 = true;
                        }
                        this.f5386 = false;
                    } else if (c16475.m39081() != null && !c16475.m39081().equals((ASN1Primitive) this.f5384)) {
                        throw new C20728("Server switched mechanism");
                    }
                    bArrM37640 = c16475.m37640();
                } else {
                    throw new C20728("Invalid token");
                }
                boolean z = c16473 instanceof C16473;
                if (z && c22220.mo5496()) {
                    C16473 c16476 = (C16473) c16473;
                    if (c16476.m39080() == 1 && c16476.m37640() == null && c16476.m37637() != null) {
                        m5493(c16476.m37637());
                        c16474 = new C16473(null, m5495());
                    } else {
                        if (c16476.m39080() != 0) {
                            throw new C20728("SPNEGO negotiation did not complete");
                        }
                        m5493(c16476.m37637());
                        this.f5382 = true;
                        c16474 = null;
                    }
                } else if (bArrM37640 != null) {
                    byte[] bArrMo5497 = c22220.mo5497(bArrM37640.length, bArrM37640);
                    if (z) {
                        C16473 c16477 = (C16473) c16473;
                        if (c16477.m39080() == 0 && c22220.mo5496()) {
                            m5493(c16477.m37637());
                            bArrM5495 = m5495();
                            this.f5382 = true;
                        } else if (c22220.m50258()) {
                            bArrM5495 = m5495();
                        } else {
                            if (c16477.m39080() == 2) {
                                throw new C20728("SPNEGO mechanism was rejected");
                            }
                            bArrM5495 = null;
                        }
                    } else {
                        bArrM5495 = null;
                    }
                    c16474 = new C16473(bArrMo5497, bArrM5495);
                } else {
                    c16474 = new C24679(aSN1ObjectIdentifierArr, 0, c22220.mo5497(0, new byte[0]));
                }
            } catch (IOException unused) {
                throw new C17219("Invalid token");
            }
        }
        if (c16474 == null) {
            return null;
        }
        return c16474.mo37638();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private byte[] m5495() throws C20048 {
        C22220 c22220 = this.f5383;
        if (!c22220.m50258()) {
            return null;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f5387;
        byte[] bArrM5494 = m5494(aSN1ObjectIdentifierArr);
        byte[] bArrM50257 = c22220.m50257(bArrM5494);
        InterfaceC25186 interfaceC25186 = f5381;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Out Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
            interfaceC25186.mo13721("Out Mech list encoded ".concat(C6033.m17504(bArrM5494, 0, bArrM5494.length)));
            interfaceC25186.mo13721("Out Mech list MIC ".concat(C6033.m17504(bArrM50257, 0, 16)));
        }
        return bArrM50257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5493(byte[] bArr) throws C20048 {
        C22220 c22220 = this.f5383;
        if (bArr != null) {
            c22220.getClass();
        } else if (this.f5385 && !c22220.m50256(this.f5384)) {
            throw new C20048("SPNEGO integrity is required but not available");
        }
        if (!c22220.m50258() || bArr == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f5387;
            byte[] bArrM5494 = m5494(aSN1ObjectIdentifierArr);
            InterfaceC25186 interfaceC25186 = f5381;
            if (interfaceC25186.mo13726()) {
                interfaceC25186.mo13721("In Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
                interfaceC25186.mo13721("In Mech list encoded ".concat(C6033.m17504(bArrM5494, 0, bArrM5494.length)));
                interfaceC25186.mo13721("In Mech list MIC ".concat(C6033.m17504(bArr, 0, bArr.length)));
            }
            c22220.m50255(bArrM5494, bArr);
        } catch (C20048 e) {
            throw new C20048("Failed to verify mechanismListMIC", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m5494(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr) throws C20048 {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERSequence(aSN1ObjectIdentifierArr));
            aSN1OutputStreamCreate.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C20048("Failed to encode mechList", e);
        }
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5496() {
        return this.f5382 && this.f5383.mo5496();
    }

    public final String toString() {
        return "SPNEGO[" + this.f5383 + "]";
    }
}
