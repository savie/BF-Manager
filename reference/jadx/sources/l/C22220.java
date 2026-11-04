package l;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.᩷ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZP */
/* JADX INFO: loaded from: classes.dex */
public final class C22220 implements InterfaceC16998 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static ASN1ObjectIdentifier f71573;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f71574 = C16980.m40037(C22220.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f71575;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f71576;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19982 f71577;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Cipher f71578;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f71582;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Cipher f71583;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f71584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f71587;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f71588;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f71590;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f71591;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f71592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f71589 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f71580 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f71579 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f71585 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f71581 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f71586 = 1;

    static {
        try {
            f71573 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            f71574.mo13724("Failed to parse OID", (Throwable) e);
        }
    }

    public C22220(InterfaceC23032 interfaceC23032, C19982 c19982, boolean z) {
        this.f71591 = interfaceC23032;
        this.f71577 = c19982;
        this.f71590 |= 537395204;
        if (!c19982.mo45913()) {
            this.f71590 |= 1073774608;
        } else if (c19982.mo45914()) {
            this.f71590 |= 1073741824;
        } else {
            this.f71590 |= 2048;
        }
        this.f71587 = z;
        interfaceC23032.mo2875().getClass();
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("NtlmContext[auth=");
        sb.append(this.f71577);
        sb.append(",ntlmsspFlags=0x");
        C8008.m21876(this.f71590, 8, ",workstation=null,isEstablished=", sb);
        sb.append(this.f71589);
        sb.append(",state=");
        String strM31437 = C12669.m31437(this.f71586, ",serverChallenge=", sb);
        if (this.f71580 == null) {
            string = C14483.m34972(strM31437, "null");
        } else {
            StringBuilder sbM27333 = C10732.m27333(strM31437);
            byte[] bArr = this.f71580;
            sbM27333.append(C6033.m17504(bArr, 0, bArr.length));
            string = sbM27333.toString();
        }
        String strM34972 = C14483.m34972(string, ",signingKey=");
        if (this.f71579 == null) {
            string2 = C14483.m34972(strM34972, "null");
        } else {
            StringBuilder sbM27334 = C10732.m27333(strM34972);
            byte[] bArr2 = this.f71579;
            sbM27334.append(C6033.m17504(bArr2, 0, bArr2.length));
            string2 = sbM27334.toString();
        }
        return C14483.m34972(string2, "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50256(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f71577.getClass();
        return f71573.equals((ASN1Primitive) aSN1ObjectIdentifier);
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5496() {
        return this.f71589;
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo5498() {
        return this.f71579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50254(String str) {
        this.f71584 = str;
    }

    @Override // l.InterfaceC16998
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5497(int i, byte[] bArr) {
        int i2 = this.f71586;
        InterfaceC23032 interfaceC23032 = this.f71591;
        InterfaceC25186 interfaceC25186 = f71574;
        if (i2 == 1) {
            C2171 c2171 = new C2171(interfaceC23032, this.f71590, this.f71577.mo45915());
            byte[] bArrM7470 = c2171.m7470();
            this.f71576 = bArrM7470;
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(c2171.toString());
                interfaceC25186.mo13717(C6033.m17504(bArrM7470, 0, bArrM7470.length));
            }
            this.f71586++;
            return bArrM7470;
        }
        if (i2 != 2) {
            throw new C20728("Invalid state");
        }
        try {
            C11865 c11865 = new C11865(bArr);
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(c11865.toString());
                interfaceC25186.mo13717(C6033.m17504(bArr, 0, bArr.length));
            }
            this.f71580 = c11865.m29730();
            if (this.f71587) {
                if (((C14826) interfaceC23032.mo2875()).m35722() && (!c11865.m17133(1073741824) || !c11865.m17133(524288))) {
                    throw new C5287("Server does not support extended NTLMv2 key exchange");
                }
                if (!c11865.m17133(536870912)) {
                    throw new C5287("Server does not support 128-bit keys");
                }
            }
            this.f71590 &= c11865.m17132();
            C25292 c25292M50253 = m50253(c11865);
            c25292M50253.m56473(this.f71576, bArr);
            byte[] bArrM56475 = c25292M50253.m56475();
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(c25292M50253.toString());
                interfaceC25186.mo13717(C6033.m17504(bArr, 0, bArr.length));
            }
            byte[] bArrM56474 = c25292M50253.m56474();
            this.f71579 = bArrM56474;
            if (bArrM56474 != null && (this.f71590 & 524288) != 0) {
                m50259(c25292M50253.m56474());
            }
            this.f71589 = true;
            this.f71586++;
            return bArrM56475;
        } catch (C20728 e) {
            throw e;
        } catch (Exception e2) {
            throw new C20728(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25292 m50253(C11865 c11865) {
        String str = this.f71584;
        C19982 c19982 = this.f71577;
        boolean zMo45914 = c19982.mo45914();
        InterfaceC23032 interfaceC23032 = this.f71591;
        return new C25292(interfaceC23032, c11865, str, zMo45914 ? ((C14826) interfaceC23032.mo2875()).m35708() : c19982.getPassword(), c19982.mo45914() ? null : c19982.mo45915(), c19982.mo45914() ? ((C14826) interfaceC23032.mo2875()).m35700() : c19982.m45909(), this.f71590, c19982.mo45914() || !c19982.mo45913());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50259(byte[] bArr) {
        this.f71592 = m50252("session key to client-to-server signing key magic constant", bArr);
        this.f71588 = m50252("session key to server-to-client signing key magic constant", bArr);
        InterfaceC25186 interfaceC25186 = f71574;
        if (interfaceC25186.mo13707()) {
            byte[] bArr2 = this.f71592;
            interfaceC25186.mo13721("Sign key is ".concat(C6033.m17504(bArr2, 0, bArr2.length)));
            byte[] bArr3 = this.f71588;
            interfaceC25186.mo13721("Verify key is ".concat(C6033.m17504(bArr3, 0, bArr3.length)));
        }
        byte[] bArrM50252 = m50252("session key to client-to-server sealing key magic constant", bArr);
        this.f71582 = bArrM50252;
        this.f71583 = C3049.m9904(bArrM50252);
        if (interfaceC25186.mo13707()) {
            byte[] bArr4 = this.f71582;
            interfaceC25186.mo13721("Seal key is ".concat(C6033.m17504(bArr4, 0, bArr4.length)));
        }
        byte[] bArrM50253 = m50252("session key to server-to-client sealing key magic constant", bArr);
        this.f71575 = bArrM50253;
        this.f71578 = C3049.m9904(bArrM50253);
        if (interfaceC25186.mo13707()) {
            byte[] bArr5 = this.f71575;
            interfaceC25186.mo13721("Server seal key is ".concat(C6033.m17504(bArr5, 0, bArr5.length)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m50252(String str, byte[] bArr) {
        MessageDigest messageDigestM9907 = C3049.m9907();
        messageDigestM9907.update(bArr);
        messageDigestM9907.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestM9907.update((byte) 0);
        return messageDigestM9907.digest();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50258() {
        return (this.f71577.mo45914() || this.f71592 == null || this.f71588 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m50257(byte[] bArr) {
        byte[] bArr2 = this.f71592;
        if (bArr2 == null) {
            throw new C20048("Signing is not initialized");
        }
        byte[] bArr3 = new byte[4];
        long andIncrement = this.f71585.getAndIncrement();
        C0481.m2323(andIncrement, 0, bArr3);
        MessageDigest messageDigestM9905 = C3049.m9905(bArr2);
        messageDigestM9905.update(bArr3);
        messageDigestM9905.update(bArr);
        byte[] bArrDigest = messageDigestM9905.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        InterfaceC25186 interfaceC25186 = f71574;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Digest ".concat(C6033.m17504(bArrDigest, 0, bArrDigest.length)));
            interfaceC25186.mo13721("Truncated ".concat(C6033.m17504(bArrDoFinal, 0, 8)));
        }
        if ((this.f71590 & 1073741824) != 0) {
            try {
                bArrDoFinal = this.f71583.doFinal(bArrDoFinal);
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Encrypted ".concat(C6033.m17504(bArrDoFinal, 0, bArrDoFinal.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C20048("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        C0481.m2323(1L, 0, bArr4);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        C0481.m2323(andIncrement, 12, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50255(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f71588;
        if (bArr3 == null) {
            throw new C20048("Signing is not initialized");
        }
        int iM2322 = C0481.m2322(0, bArr2);
        if (iM2322 != 1) {
            throw new C5287("Invalid signature version");
        }
        MessageDigest messageDigestM9905 = C3049.m9905(bArr3);
        int iM2323 = C0481.m2322(12, bArr2);
        messageDigestM9905.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestM9905.digest(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 8);
        InterfaceC25186 interfaceC25186 = f71574;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Digest ".concat(C6033.m17504(bArrDigest, 0, bArrDigest.length)));
            interfaceC25186.mo13721("Truncated ".concat(C6033.m17504(bArrCopyOf, 0, bArrCopyOf.length)));
        }
        boolean z = (this.f71590 & 1073741824) != 0;
        if (z) {
            try {
                bArrCopyOf = this.f71578.doFinal(bArrCopyOf);
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Decrypted ".concat(C6033.m17504(bArrCopyOf, 0, bArrCopyOf.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C20048("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.f71581.getAndIncrement();
        if (andIncrement != iM2323) {
            throw new C20048(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iM2323)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (MessageDigest.isEqual(bArrCopyOf, bArr4)) {
            return;
        }
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iM2323), Integer.valueOf(iM2322), Boolean.valueOf(z)));
            interfaceC25186.mo13721("Expected MIC " + C6033.m17504(bArrCopyOf, 0, bArrCopyOf.length) + " != " + C6033.m17504(bArr4, 0, 8));
        }
        throw new C20048("Invalid MIC");
    }
}
