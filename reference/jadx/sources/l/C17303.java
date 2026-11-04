package l;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9FO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17303 implements InterfaceC11336 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f56333 = C16980.m40037(C17303.class);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C19497 f56334 = new C19497("1.3.6.1.4.1.311.2.2.10");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13243 f56335;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractSet f56336;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC16557 f56337;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9689 f56338;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Random f56339;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24432 f56340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f56341;

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final C5371 mo28623(C1642 c1642, byte[] bArr, C18049 c18049) throws IOException {
        try {
            EnumC16557 enumC16557 = this.f56337;
            EnumC16557 enumC16558 = EnumC16557.COMPLETE;
            if (enumC16557 == enumC16558) {
                return null;
            }
            EnumC16557 enumC16559 = EnumC16557.NEGOTIATE;
            InterfaceC25186 interfaceC25186 = f56333;
            if (enumC16557 == enumC16559) {
                interfaceC25186.mo13716(c1642.m5811(), "Initialized Authentication of {} using NTLM");
                this.f56337 = EnumC16557.AUTHENTICATE;
                return m40629(c1642);
            }
            interfaceC25186.mo13716(C4996.m15222(bArr), "Received token: {}");
            C22613 c22613 = new C22613();
            c22613.m50947(bArr);
            C14734 c14734 = new C14734();
            try {
                c14734.m35419(new C11707(c22613.m50948()));
                interfaceC25186.mo13708(c14734, "Received NTLM challenge: {}");
                interfaceC25186.mo13716(c14734.m35423(), "Received NTLM challenge from: {}");
                EnumSet enumSetM35418 = c14734.m35418();
                EnumC0565 enumC0565 = EnumC0565.NTLMSSP_NEGOTIATE_128;
                Boolean boolValueOf = Boolean.valueOf(enumSetM35418.contains(enumC0565));
                EnumC0565 enumC0566 = EnumC0565.NTLMSSP_NEGOTIATE_56;
                interfaceC25186.mo13725("Server NTLM negotiate flags: {}, supports128Bit={}, supports56Bit={}", enumSetM35418, boolValueOf, Boolean.valueOf(enumSetM35418.contains(enumC0566)));
                C1170.removeIf(this.f56336, new C13064(1, enumSetM35418));
                if (this.f56336.contains(enumC0565)) {
                    interfaceC25186.mo13716(enumSetM35418, "Using NTLM 128-bit session security, serverFlags={}");
                } else {
                    AbstractSet abstractSet = this.f56336;
                    if (abstractSet.contains(enumC0565) || abstractSet.contains(enumC0566)) {
                        interfaceC25186.mo13728(enumSetM35418, "Falling back to NTLM 56-bit session security, serverFlags={}");
                    } else {
                        interfaceC25186.mo13728(enumSetM35418, "Falling back to legacy NTLM session security (<56-bit), serverFlags={}");
                    }
                }
                C5371 c5371M40627 = m40627(c1642, c18049, c14734, c22613.m50948());
                this.f56337 = enumC16558;
                return c5371M40627;
            } catch (C2013 e) {
                throw new IOException(e);
            }
        } catch (C15153 e2) {
            throw new C12082(e2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C5371 m40629(C1642 c1642) {
        C5371 c5371 = new C5371();
        this.f56336 = EnumSet.of(EnumC0565.NTLMSSP_NEGOTIATE_128, EnumC0565.NTLMSSP_NEGOTIATE_56, EnumC0565.NTLMSSP_REQUEST_TARGET, EnumC0565.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY);
        this.f56335.getClass();
        if (this.f56335.m32800() != null) {
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_VERSION);
        }
        if (!c1642.m5814()) {
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_SIGN);
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_ALWAYS_SIGN);
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else if (c1642.m5812()) {
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else {
            this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_ANONYMOUS);
        }
        if (!this.f56336.contains(EnumC0565.NTLMSSP_NEGOTIATE_VERSION)) {
            if (C2083.m7173(c1642.m5810())) {
                this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
            }
            this.f56335.getClass();
        }
        AbstractSet abstractSet = this.f56336;
        String strM5810 = c1642.m5810();
        this.f56335.getClass();
        C8768 c8768M32800 = this.f56335.m32800();
        this.f56335.getClass();
        C18464 c18464 = new C18464(abstractSet, strM5810, null, c8768M32800, false);
        f56333.mo13708(this.f56341, "Sending NTLM negotiate message: {}");
        C10678 c10678 = new C10678();
        c10678.m27221(f56334);
        C11707 c11707 = new C11707();
        c18464.m43011(c11707);
        byte[] bArrM56028 = c11707.m56028();
        this.f56341 = bArrM56028;
        c10678.m27225(bArrM56028);
        c5371.m16040(c10678);
        c5371.m16038(this.f56336);
        return c5371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5371 m40627(C1642 c1642, C18049 c18049, C14734 c14734, byte[] bArr) {
        C19210 c19210M44527;
        byte[] bArrM18403;
        C5371 c5371 = new C5371();
        c5371.m16039(c14734.m35421());
        if (c14734.m35420() != null) {
            C19210 c19210M35420 = c14734.m35420();
            EnumC2057 enumC2057 = EnumC2057.MsvAvNbComputerName;
            if (c19210M35420.m44531(enumC2057)) {
            }
        }
        if (c1642.m5814() && !c18049.m42061().m1341().m37476()) {
            String strM5811 = c1642.m5811();
            String strM5810 = c1642.m5810();
            this.f56335.getClass();
            C4294 c4294 = new C4294(null, null, strM5811, strM5810, null, null, this.f56336, this.f56335.m32800());
            C22613 c22613 = new C22613();
            C11707 c11707 = new C11707();
            c4294.m13669(c11707);
            c22613.m50949(c11707.m56028());
            c5371.m16040(c22613);
            return c5371;
        }
        this.f56336.add(EnumC0565.NTLMSSP_NEGOTIATE_TARGET_INFO);
        if (c14734.m35420() == null) {
            c19210M44527 = null;
        } else {
            c19210M44527 = c14734.m35420().m44527();
            if (this.f56335.m32801() && c14734.m35420().m44531(EnumC2057.MsvAvTimestamp)) {
                EnumC2057 enumC2058 = EnumC2057.MsvAvFlags;
                c19210M44527.m44529(new C23686(enumC2058, Long.valueOf(c19210M44527.m44531(enumC2058) ? ((Long) c19210M44527.m44526(enumC2058).m29502()).longValue() | 2 : 2L)));
            }
            if (c14734.m35418().contains(EnumC0565.NTLMSSP_REQUEST_TARGET)) {
                C20702 c20702 = (C20702) c19210M44527.m44526(EnumC2057.MsvAvDnsComputerName);
                if (c20702 != null) {
                    c19210M44527.m44529(new C20702(EnumC2057.MsvAvTargetName, String.format("cifs/%s", c20702.m29502())));
                }
            } else {
                c19210M44527.m44529(new C20702(EnumC2057.MsvAvTargetName, ""));
            }
        }
        long jM52143 = new C23227((TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) / 100) + 116444736000000000L).m52143();
        if (c19210M44527 != null) {
            EnumC2057 enumC2059 = EnumC2057.MsvAvTimestamp;
            if (c19210M44527.m44531(enumC2059)) {
                jM52143 = ((C23227) ((C12497) c19210M44527.m44526(enumC2059)).m29502()).m52143();
            }
        }
        C5985 c5985M54642 = this.f56340.m54642(c1642.m5811(), c1642.m5810(), c1642.m5813(), c14734, jM52143, c19210M44527);
        byte[] bArrM17416 = c5985M54642.m17416();
        byte[] bArrM17418 = c5985M54642.m17418();
        byte[] bArr2 = new byte[0];
        this.f56340.getClass();
        EnumSet enumSetM35418 = c14734.m35418();
        if (enumSetM35418.contains(EnumC0565.NTLMSSP_NEGOTIATE_KEY_EXCH) && (enumSetM35418.contains(EnumC0565.NTLMSSP_NEGOTIATE_SEAL) || enumSetM35418.contains(EnumC0565.NTLMSSP_NEGOTIATE_SIGN) || enumSetM35418.contains(EnumC0565.NTLMSSP_NEGOTIATE_ALWAYS_SIGN))) {
            byte[] bArr3 = new byte[16];
            this.f56339.nextBytes(bArr3);
            bArrM18403 = C6532.m18403(this.f56338, bArrM17416, bArr3);
            bArrM17416 = bArr3;
        } else {
            bArrM18403 = bArrM17416;
        }
        String strM5812 = c1642.m5811();
        String strM5813 = c1642.m5810();
        this.f56335.getClass();
        C4294 c4295 = new C4294(bArr2, bArrM17418, strM5812, strM5813, null, bArrM18403, enumSetM35418, this.f56335.m32800());
        C23686 c23686 = c19210M44527 != null ? (C23686) c19210M44527.m44526(EnumC2057.MsvAvFlags) : null;
        if (c23686 != null && (((Long) c23686.m29502()).longValue() & 2) > 0) {
            c4295.m13670(new byte[16]);
            C11707 c11708 = new C11707();
            c4295.m13669(c11708);
            c4295.m13670(C6532.m18404(this.f56338, bArrM17416, this.f56341, bArr, c11708.m56028()));
        }
        c5371.m16041(bArrM17416);
        f56333.mo13708(c4295, "Sending NTLM authenticate message: {}");
        C22613 c22614 = new C22613();
        C11707 c11709 = new C11707();
        c4295.m13669(c11709);
        c22614.m50949(c11709.m56028());
        c5371.m16040(c22614);
        c5371.m16038(this.f56336);
        return c5371;
    }

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final void mo28624(C12828 c12828) {
        this.f56338 = c12828.m31824();
        this.f56339 = c12828.m31832();
        this.f56335 = c12828.m31821();
        this.f56337 = EnumC16557.NEGOTIATE;
        this.f56336 = new HashSet();
        this.f56340 = new C24432(this.f56339, this.f56338);
    }

    @Override // l.InterfaceC11336
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28625(C1642 c1642) {
        return c1642.getClass().equals(C1642.class);
    }
}
