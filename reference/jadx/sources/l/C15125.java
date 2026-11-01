package l;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ܶۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15125 implements InterfaceC20769 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f49400 = C13488.m32997(C15125.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ASN1ObjectIdentifier f49401;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f49402;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f49403;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f49404;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18652 f49405;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f49406;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f49408;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Cipher f49411;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f49414;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f49415;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f49416;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Cipher f49418;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f49419;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49412 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f49407 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f49410 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f49413 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f49409 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49417 = 1;

    static {
        try {
            f49401 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            f49400.mo12138("Failed to parse OID", (Throwable) e);
        }
    }

    public C15125(InterfaceC19067 interfaceC19067, C18652 c18652, boolean z) {
        this.f49415 = interfaceC19067;
        this.f49405 = c18652;
        this.f49403 |= 537395204;
        if (!c18652.mo43144()) {
            this.f49403 |= 1073774608;
        } else if (c18652.mo43145()) {
            this.f49403 |= 1073741824;
        } else {
            this.f49403 |= 2048;
        }
        this.f49406 = z;
        interfaceC19067.mo29449().getClass();
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("NtlmContext[auth=");
        sb.append(this.f49405);
        sb.append(",ntlmsspFlags=0x");
        C18855.m43491(this.f49403, 8, ",workstation=null,isEstablished=", sb);
        sb.append(this.f49412);
        sb.append(",state=");
        String strM30911 = C12441.m30911(this.f49417, ",serverChallenge=", sb);
        if (this.f49407 == null) {
            string = C15489.m37076(strM30911, "null");
        } else {
            StringBuilder sbM23356 = C9023.m23356(strM30911);
            byte[] bArr = this.f49407;
            sbM23356.append(C5993.m16281(bArr, 0, bArr.length));
            string = sbM23356.toString();
        }
        String strM37076 = C15489.m37076(string, ",signingKey=");
        if (this.f49410 == null) {
            string2 = C15489.m37076(strM37076, "null");
        } else {
            StringBuilder sbM23357 = C9023.m23356(strM37076);
            byte[] bArr2 = this.f49410;
            sbM23357.append(C5993.m16281(bArr2, 0, bArr2.length));
            string2 = sbM23357.toString();
        }
        return C15489.m37076(string2, "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36252(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f49405.getClass();
        return f49401.equals((ASN1Primitive) aSN1ObjectIdentifier);
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22943() {
        return this.f49412;
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo22945() {
        return this.f49410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36250(String str) {
        this.f49414 = str;
    }

    @Override // l.InterfaceC20769
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo22944(int i, byte[] bArr) {
        int i2 = this.f49417;
        InterfaceC19067 interfaceC19067 = this.f49415;
        InterfaceC4314 interfaceC4314 = f49400;
        if (i2 == 1) {
            C10496 c10496 = new C10496(interfaceC19067, this.f49403, this.f49405.mo43139());
            byte[] bArrM26633 = c10496.m26633();
            this.f49408 = bArrM26633;
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(c10496.toString());
                interfaceC4314.mo12127(C5993.m16281(bArrM26633, 0, bArrM26633.length));
            }
            this.f49417++;
            return bArrM26633;
        }
        if (i2 != 2) {
            throw new C12303("Invalid state");
        }
        try {
            C7673 c7673 = new C7673(bArr);
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(c7673.toString());
                interfaceC4314.mo12127(C5993.m16281(bArr, 0, bArr.length));
            }
            this.f49407 = c7673.m20266();
            if (this.f49406) {
                if (((C9895) interfaceC19067.mo29449()).m25041() && (!c7673.m23422(1073741824) || !c7673.m23422(524288))) {
                    throw new C19399("Server does not support extended NTLMv2 key exchange");
                }
                if (!c7673.m23422(536870912)) {
                    throw new C19399("Server does not support 128-bit keys");
                }
            }
            this.f49403 &= c7673.m23421();
            C21078 c21078M36249 = m36249(c7673);
            c21078M36249.m47489(this.f49408, bArr);
            byte[] bArrM47488 = c21078M36249.m47488();
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(c21078M36249.toString());
                interfaceC4314.mo12127(C5993.m16281(bArr, 0, bArr.length));
            }
            byte[] bArrM47490 = c21078M36249.m47490();
            this.f49410 = bArrM47490;
            if (bArrM47490 != null && (this.f49403 & 524288) != 0) {
                m36255(c21078M36249.m47490());
            }
            this.f49412 = true;
            this.f49417++;
            return bArrM47488;
        } catch (C12303 e) {
            throw e;
        } catch (Exception e2) {
            throw new C12303(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21078 m36249(C7673 c7673) {
        String str = this.f49414;
        C18652 c18652 = this.f49405;
        boolean zMo43145 = c18652.mo43145();
        InterfaceC19067 interfaceC19067 = this.f49415;
        return new C21078(interfaceC19067, c7673, str, zMo43145 ? ((C9895) interfaceC19067.mo29449()).m25065() : c18652.getPassword(), c18652.mo43145() ? null : c18652.mo43139(), c18652.mo43145() ? ((C9895) interfaceC19067.mo29449()).m25046() : c18652.m43140(), this.f49403, c18652.mo43145() || !c18652.mo43144());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36255(byte[] bArr) {
        this.f49419 = m36248("session key to client-to-server signing key magic constant", bArr);
        this.f49416 = m36248("session key to server-to-client signing key magic constant", bArr);
        InterfaceC4314 interfaceC4314 = f49400;
        if (interfaceC4314.mo12125()) {
            byte[] bArr2 = this.f49419;
            interfaceC4314.mo12135("Sign key is ".concat(C5993.m16281(bArr2, 0, bArr2.length)));
            byte[] bArr3 = this.f49416;
            interfaceC4314.mo12135("Verify key is ".concat(C5993.m16281(bArr3, 0, bArr3.length)));
        }
        byte[] bArrM36248 = m36248("session key to client-to-server sealing key magic constant", bArr);
        this.f49402 = bArrM36248;
        this.f49418 = C16577.m38989(bArrM36248);
        if (interfaceC4314.mo12125()) {
            byte[] bArr4 = this.f49402;
            interfaceC4314.mo12135("Seal key is ".concat(C5993.m16281(bArr4, 0, bArr4.length)));
        }
        byte[] bArrM36249 = m36248("session key to server-to-client sealing key magic constant", bArr);
        this.f49404 = bArrM36249;
        this.f49411 = C16577.m38989(bArrM36249);
        if (interfaceC4314.mo12125()) {
            byte[] bArr5 = this.f49404;
            interfaceC4314.mo12135("Server seal key is ".concat(C5993.m16281(bArr5, 0, bArr5.length)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m36248(String str, byte[] bArr) {
        MessageDigest messageDigestM38992 = C16577.m38992();
        messageDigestM38992.update(bArr);
        messageDigestM38992.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestM38992.update((byte) 0);
        return messageDigestM38992.digest();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36254() {
        return (this.f49405.mo43145() || this.f49419 == null || this.f49416 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36253(byte[] bArr) {
        byte[] bArr2 = this.f49419;
        if (bArr2 == null) {
            throw new C8484("Signing is not initialized");
        }
        byte[] bArr3 = new byte[4];
        long andIncrement = this.f49413.getAndIncrement();
        C4850.m13550(andIncrement, 0, bArr3);
        MessageDigest messageDigestM38990 = C16577.m38990(bArr2);
        messageDigestM38990.update(bArr3);
        messageDigestM38990.update(bArr);
        byte[] bArrDigest = messageDigestM38990.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        InterfaceC4314 interfaceC4314 = f49400;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Digest ".concat(C5993.m16281(bArrDigest, 0, bArrDigest.length)));
            interfaceC4314.mo12135("Truncated ".concat(C5993.m16281(bArrDoFinal, 0, 8)));
        }
        if ((this.f49403 & 1073741824) != 0) {
            try {
                bArrDoFinal = this.f49418.doFinal(bArrDoFinal);
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Encrypted ".concat(C5993.m16281(bArrDoFinal, 0, bArrDoFinal.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C8484("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        C4850.m13550(1L, 0, bArr4);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        C4850.m13550(andIncrement, 12, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36251(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f49416;
        if (bArr3 == null) {
            throw new C8484("Signing is not initialized");
        }
        int iM13549 = C4850.m13549(0, bArr2);
        if (iM13549 != 1) {
            throw new C19399("Invalid signature version");
        }
        MessageDigest messageDigestM38990 = C16577.m38990(bArr3);
        int iM135410 = C4850.m13549(12, bArr2);
        messageDigestM38990.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestM38990.digest(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 8);
        InterfaceC4314 interfaceC4314 = f49400;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Digest ".concat(C5993.m16281(bArrDigest, 0, bArrDigest.length)));
            interfaceC4314.mo12135("Truncated ".concat(C5993.m16281(bArrCopyOf, 0, bArrCopyOf.length)));
        }
        boolean z = (this.f49403 & 1073741824) != 0;
        if (z) {
            try {
                bArrCopyOf = this.f49411.doFinal(bArrCopyOf);
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Decrypted ".concat(C5993.m16281(bArrCopyOf, 0, bArrCopyOf.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C8484("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.f49409.getAndIncrement();
        if (andIncrement != iM135410) {
            throw new C8484(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iM135410)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (MessageDigest.isEqual(bArrCopyOf, bArr4)) {
            return;
        }
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iM135410), Integer.valueOf(iM13549), Boolean.valueOf(z)));
            interfaceC4314.mo12135("Expected MIC " + C5993.m16281(bArrCopyOf, 0, bArrCopyOf.length) + " != " + C5993.m16281(bArr4, 0, 8));
        }
        throw new C8484("Invalid MIC");
    }
}
