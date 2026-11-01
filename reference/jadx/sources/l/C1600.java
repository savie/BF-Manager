package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֫ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9H1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1600 implements InterfaceC17123 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f6470;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f6471 = C13488.m32997(C1600.class);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f6472;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f6473 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f6474;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f6475;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21356 f6476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f6477;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14302 f6478;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f6472 = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        f6470 = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C1600(C14302 c14302) {
        this.f6478 = c14302;
    }

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1385 mo5450(C12185 c12185, byte[] bArr, C13159 c13159) throws IOException {
        byte[] bArrCopyOf;
        C1385 c1385Mo5450 = this.f6478.mo5450(c12185, bArr, c13159);
        if (c1385Mo5450 == null) {
            return null;
        }
        byte[] bArrM4849 = c1385Mo5450.m4849();
        Set setM4859 = c1385Mo5450.m4859();
        InterfaceC4314 interfaceC4314 = f6471;
        if (bArrM4849 != null) {
            interfaceC4314.mo12135("Calculating signing and sealing keys for NTLM Extended Session Security");
            EnumC3864 enumC3864 = EnumC3864.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
            this.f6475 = setM4859.contains(enumC3864) ? C11627.m28969(this.f6476, bArrM4849, f6472) : null;
            C8099 c8099M4858 = c1385Mo5450.m4858();
            if (setM4859.contains(enumC3864)) {
                if (!setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_128)) {
                    if (setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_56)) {
                        bArrM4849 = Arrays.copyOf(bArrM4849, 7);
                    } else {
                        bArrM4849 = Arrays.copyOf(bArrM4849, 5);
                    }
                }
                bArrCopyOf = C11627.m28969(this.f6476, bArrM4849, f6470);
            } else if (setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_LM_KEY) || (setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_DATAGRAM) && c8099M4858.m21311().getValue() >= EnumC21504.NTLMSSP_REVISION_W2K3.getValue())) {
                bArrCopyOf = new byte[8];
                if (setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_56)) {
                    System.arraycopy(bArrM4849, 0, bArrCopyOf, 0, 7);
                    bArrCopyOf[7] = -96;
                } else {
                    System.arraycopy(bArrM4849, 0, bArrCopyOf, 0, 5);
                    bArrCopyOf[5] = -27;
                    bArrCopyOf[6] = 56;
                    bArrCopyOf[7] = -80;
                }
            } else {
                bArrCopyOf = Arrays.copyOf(bArrM4849, bArrM4849.length);
            }
            this.f6477 = bArrCopyOf;
        }
        if (c1385Mo5450.m4851() instanceof C20589) {
            this.f6474 = ((C20589) c1385Mo5450.m4851()).m46448();
        }
        if (this.f6475 == null || !(c1385Mo5450.m4851() instanceof C15651)) {
            return c1385Mo5450;
        }
        C15651 c15651 = (C15651) c1385Mo5450.m4851();
        interfaceC4314.mo12135("Signing with NTLM Extended Session Security");
        int andIncrement = this.f6473.getAndIncrement();
        byte[] bArr2 = this.f6475;
        byte[] bArr3 = {(byte) (andIncrement & 255), (byte) ((andIncrement >> 8) & 255), (byte) ((andIncrement >> 16) & 255), (byte) ((andIncrement >> 24) & 255)};
        C4466 c4466 = new C4466(new ArrayList(this.f6474));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15382 c15382 = new C15382(new C7343(), byteArrayOutputStream);
        try {
            c15382.m36819(c4466);
            c15382.close();
            byte[] bArrM28967 = new byte[8];
            System.arraycopy(C11627.m28968(this.f6476, bArr2, bArr3, byteArrayOutputStream.toByteArray()), 0, bArrM28967, 0, 8);
            if (setM4859.contains(EnumC3864.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                bArrM28967 = C11627.m28967(this.f6476, this.f6477, bArrM28967);
            }
            C19240 c19240 = new C19240();
            c19240.m27398(1L);
            c19240.m27383(8, bArrM28967);
            c19240.m27398(andIncrement);
            c15651.m37328(c19240.m27377());
            return c1385Mo5450;
        } catch (Throwable th) {
            try {
                c15382.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5451(C16418 c16418) {
        this.f6478.mo5451(c16418);
        this.f6476 = c16418.m38658();
    }

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5452(C12185 c12185) {
        return this.f6478.mo5452(c12185);
    }
}
