package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܶۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15811 implements InterfaceC11336 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f51439 = C16980.m40037(C15811.class);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f51440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f51441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f51442;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9689 f51443;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17303 f51444;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f51445;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f51446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicInteger f51447 = new AtomicInteger(0);

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f51440 = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        f51441 = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C15811(C17303 c17303) {
        this.f51444 = c17303;
    }

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final C5371 mo28623(C1642 c1642, byte[] bArr, C18049 c18049) throws IOException {
        byte[] bArrCopyOf;
        C5371 c5371Mo28623 = this.f51444.mo28623(c1642, bArr, c18049);
        if (c5371Mo28623 == null) {
            return null;
        }
        byte[] bArrM16042 = c5371Mo28623.m16042();
        Set setM16043 = c5371Mo28623.m16043();
        InterfaceC25186 interfaceC25186 = f51439;
        if (bArrM16042 != null) {
            interfaceC25186.mo13721("Calculating signing and sealing keys for NTLM Extended Session Security");
            EnumC0565 enumC0565 = EnumC0565.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
            this.f51445 = setM16043.contains(enumC0565) ? C6532.m18405(this.f51443, bArrM16042, f51440) : null;
            C8768 c8768M16044 = c5371Mo28623.m16044();
            if (setM16043.contains(enumC0565)) {
                if (!setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_128)) {
                    if (setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_56)) {
                        bArrM16042 = Arrays.copyOf(bArrM16042, 7);
                    } else {
                        bArrM16042 = Arrays.copyOf(bArrM16042, 5);
                    }
                }
                bArrCopyOf = C6532.m18405(this.f51443, bArrM16042, f51441);
            } else if (setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_LM_KEY) || (setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_DATAGRAM) && c8768M16044.m23463().getValue() >= EnumC1311.NTLMSSP_REVISION_W2K3.getValue())) {
                bArrCopyOf = new byte[8];
                if (setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_56)) {
                    System.arraycopy(bArrM16042, 0, bArrCopyOf, 0, 7);
                    bArrCopyOf[7] = -96;
                } else {
                    System.arraycopy(bArrM16042, 0, bArrCopyOf, 0, 5);
                    bArrCopyOf[5] = -27;
                    bArrCopyOf[6] = 56;
                    bArrCopyOf[7] = -80;
                }
            } else {
                bArrCopyOf = Arrays.copyOf(bArrM16042, bArrM16042.length);
            }
            this.f51446 = bArrCopyOf;
        }
        if (c5371Mo28623.m16037() instanceof C10678) {
            this.f51442 = ((C10678) c5371Mo28623.m16037()).m27218();
        }
        if (this.f51445 == null || !(c5371Mo28623.m16037() instanceof C22613)) {
            return c5371Mo28623;
        }
        C22613 c22613 = (C22613) c5371Mo28623.m16037();
        interfaceC25186.mo13721("Signing with NTLM Extended Session Security");
        int andIncrement = this.f51447.getAndIncrement();
        byte[] bArr2 = this.f51445;
        byte[] bArr3 = {(byte) (andIncrement & 255), (byte) ((andIncrement >> 8) & 255), (byte) ((andIncrement >> 16) & 255), (byte) ((andIncrement >> 24) & 255)};
        C12148 c12148 = new C12148(new ArrayList(this.f51442));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1180 c1180 = new C1180(new C2083(), byteArrayOutputStream);
        try {
            c1180.m4354(c12148);
            c1180.close();
            byte[] bArrM18403 = new byte[8];
            System.arraycopy(C6532.m18404(this.f51443, bArr2, bArr3, byteArrayOutputStream.toByteArray()), 0, bArrM18403, 0, 8);
            if (setM16043.contains(EnumC0565.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                bArrM18403 = C6532.m18403(this.f51443, this.f51446, bArrM18403);
            }
            C7453 c7453 = new C7453();
            c7453.m56025(1L);
            c7453.m56007(8, bArrM18403);
            c7453.m56025(andIncrement);
            c22613.m50950(c7453.m56028());
            return c5371Mo28623;
        } catch (Throwable th) {
            try {
                c1180.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final void mo28624(C12828 c12828) {
        this.f51444.mo28624(c12828);
        this.f51443 = c12828.m31824();
    }

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28625(C1642 c1642) {
        return this.f51444.mo28625(c1642);
    }
}
