package l;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14302 implements InterfaceC17123 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f46855 = C13488.m32997(C14302.class);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C15757 f46856 = new C15757("1.3.6.1.4.1.311.2.2.10");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC23474 f46857;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f46858;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0109 f46859;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Random f46860;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractSet f46861;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2453 f46862;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21356 f46863;

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ */
    public final C1385 mo5450(C12185 c12185, byte[] bArr, C13159 c13159) throws IOException {
        try {
            EnumC23474 enumC23474 = this.f46857;
            EnumC23474 enumC23475 = EnumC23474.COMPLETE;
            if (enumC23474 == enumC23475) {
                return null;
            }
            EnumC23474 enumC23476 = EnumC23474.NEGOTIATE;
            InterfaceC4314 interfaceC4314 = f46855;
            if (enumC23474 == enumC23476) {
                interfaceC4314.mo12126(c12185.m30291(), "Initialized Authentication of {} using NTLM");
                this.f46857 = EnumC23474.AUTHENTICATE;
                return m34530(c12185);
            }
            interfaceC4314.mo12126(C10216.m26000(bArr), "Received token: {}");
            C15651 c15651 = new C15651();
            c15651.m37325(bArr);
            C22210 c22210 = new C22210();
            try {
                c22210.m49328(new C5982(c15651.m37326()));
                interfaceC4314.mo12129(c22210, "Received NTLM challenge: {}");
                interfaceC4314.mo12126(c22210.m49326(), "Received NTLM challenge from: {}");
                final EnumSet enumSetM49327 = c22210.m49327();
                EnumC3864 enumC3864 = EnumC3864.NTLMSSP_NEGOTIATE_128;
                Boolean boolValueOf = Boolean.valueOf(enumSetM49327.contains(enumC3864));
                EnumC3864 enumC3865 = EnumC3864.NTLMSSP_NEGOTIATE_56;
                interfaceC4314.mo12139("Server NTLM negotiate flags: {}, supports128Bit={}, supports56Bit={}", enumSetM49327, boolValueOf, Boolean.valueOf(enumSetM49327.contains(enumC3865)));
                C9030.removeIf(this.f46861, new Predicate() { // from class: l.ۛۙᩳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return !enumSetM49327.contains((EnumC3864) obj);
                    }
                });
                if (this.f46861.contains(enumC3864)) {
                    interfaceC4314.mo12126(enumSetM49327, "Using NTLM 128-bit session security, serverFlags={}");
                } else {
                    AbstractSet abstractSet = this.f46861;
                    if (abstractSet.contains(enumC3864) || abstractSet.contains(enumC3865)) {
                        interfaceC4314.mo12115(enumSetM49327, "Falling back to NTLM 56-bit session security, serverFlags={}");
                    } else {
                        interfaceC4314.mo12115(enumSetM49327, "Falling back to legacy NTLM session security (<56-bit), serverFlags={}");
                    }
                }
                C1385 c1385M34528 = m34528(c12185, c13159, c22210, c15651.m37326());
                this.f46857 = enumC23475;
                return c1385M34528;
            } catch (C17271 e) {
                throw new IOException(e);
            }
        } catch (C0127 e2) {
            throw new C13865(e2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C1385 m34530(C12185 c12185) {
        C1385 c1385 = new C1385();
        this.f46861 = EnumSet.of(EnumC3864.NTLMSSP_NEGOTIATE_128, EnumC3864.NTLMSSP_NEGOTIATE_56, EnumC3864.NTLMSSP_REQUEST_TARGET, EnumC3864.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY);
        this.f46859.getClass();
        if (this.f46859.m1149() != null) {
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_VERSION);
        }
        if (!c12185.m30288()) {
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_SIGN);
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_ALWAYS_SIGN);
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else if (c12185.m30290()) {
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else {
            this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_ANONYMOUS);
        }
        if (!this.f46861.contains(EnumC3864.NTLMSSP_NEGOTIATE_VERSION)) {
            if (C12123.m30164(c12185.m30289())) {
                this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
            }
            this.f46859.getClass();
        }
        AbstractSet abstractSet = this.f46861;
        String strM30289 = c12185.m30289();
        this.f46859.getClass();
        C8099 c8099M1149 = this.f46859.m1149();
        this.f46859.getClass();
        C13038 c13038 = new C13038(abstractSet, strM30289, null, c8099M1149, false);
        f46855.mo12129(this.f46858, "Sending NTLM negotiate message: {}");
        C20589 c20589 = new C20589();
        c20589.m46449(f46856);
        C5982 c5982 = new C5982();
        c13038.m32251(c5982);
        byte[] bArrM27377 = c5982.m27377();
        this.f46858 = bArrM27377;
        c20589.m46453(bArrM27377);
        c1385.m4854(c20589);
        c1385.m4852(this.f46861);
        return c1385;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1385 m34528(C12185 c12185, C13159 c13159, C22210 c22210, byte[] bArr) {
        C22916 c22916M50693;
        byte[] bArrM28967;
        C1385 c1385 = new C1385();
        c1385.m4853(c22210.m49329());
        if (c22210.m49330() != null) {
            C22916 c22916M49330 = c22210.m49330();
            EnumC12105 enumC12105 = EnumC12105.MsvAvNbComputerName;
            if (c22916M49330.m50697(enumC12105)) {
            }
        }
        if (c12185.m30288() && !c13159.m32548().m11484().m46306()) {
            String strM30291 = c12185.m30291();
            String strM30289 = c12185.m30289();
            this.f46859.getClass();
            C5276 c5276 = new C5276(null, null, strM30291, strM30289, null, null, this.f46861, this.f46859.m1149());
            C15651 c15651 = new C15651();
            C5982 c5982 = new C5982();
            c5276.m14568(c5982);
            c15651.m37327(c5982.m27377());
            c1385.m4854(c15651);
            return c1385;
        }
        this.f46861.add(EnumC3864.NTLMSSP_NEGOTIATE_TARGET_INFO);
        if (c22210.m49330() == null) {
            c22916M50693 = null;
        } else {
            c22916M50693 = c22210.m49330().m50693();
            if (this.f46859.m1150() && c22210.m49330().m50697(EnumC12105.MsvAvTimestamp)) {
                EnumC12105 enumC12106 = EnumC12105.MsvAvFlags;
                c22916M50693.m50695(new C1520(enumC12106, Long.valueOf(c22916M50693.m50697(enumC12106) ? ((Long) c22916M50693.m50692(enumC12106).m39824()).longValue() | 2 : 2L)));
            }
            if (c22210.m49327().contains(EnumC3864.NTLMSSP_REQUEST_TARGET)) {
                C2931 c2931 = (C2931) c22916M50693.m50692(EnumC12105.MsvAvDnsComputerName);
                if (c2931 != null) {
                    c22916M50693.m50695(new C2931(EnumC12105.MsvAvTargetName, String.format("cifs/%s", c2931.m39824())));
                }
            } else {
                c22916M50693.m50695(new C2931(EnumC12105.MsvAvTargetName, ""));
            }
        }
        long jM5534 = new C1644((TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) / 100) + 116444736000000000L).m5534();
        if (c22916M50693 != null) {
            EnumC12105 enumC12107 = EnumC12105.MsvAvTimestamp;
            if (c22916M50693.m50697(enumC12107)) {
                jM5534 = ((C1644) ((C4570) c22916M50693.m50692(enumC12107)).m39824()).m5534();
            }
        }
        C13744 c13744M7438 = this.f46862.m7438(c12185.m30291(), c12185.m30289(), c12185.m30292(), c22210, jM5534, c22916M50693);
        byte[] bArrM33487 = c13744M7438.m33487();
        byte[] bArrM33486 = c13744M7438.m33486();
        byte[] bArr2 = new byte[0];
        this.f46862.getClass();
        EnumSet enumSetM49327 = c22210.m49327();
        if (enumSetM49327.contains(EnumC3864.NTLMSSP_NEGOTIATE_KEY_EXCH) && (enumSetM49327.contains(EnumC3864.NTLMSSP_NEGOTIATE_SEAL) || enumSetM49327.contains(EnumC3864.NTLMSSP_NEGOTIATE_SIGN) || enumSetM49327.contains(EnumC3864.NTLMSSP_NEGOTIATE_ALWAYS_SIGN))) {
            byte[] bArr3 = new byte[16];
            this.f46860.nextBytes(bArr3);
            bArrM28967 = C11627.m28967(this.f46863, bArrM33487, bArr3);
            bArrM33487 = bArr3;
        } else {
            bArrM28967 = bArrM33487;
        }
        String strM30292 = c12185.m30291();
        String strM302810 = c12185.m30289();
        this.f46859.getClass();
        C5276 c5277 = new C5276(bArr2, bArrM33486, strM30292, strM302810, null, bArrM28967, enumSetM49327, this.f46859.m1149());
        C1520 c1520 = c22916M50693 != null ? (C1520) c22916M50693.m50692(EnumC12105.MsvAvFlags) : null;
        if (c1520 != null && (((Long) c1520.m39824()).longValue() & 2) > 0) {
            c5277.m14569(new byte[16]);
            C5982 c5983 = new C5982();
            c5277.m14568(c5983);
            c5277.m14569(C11627.m28968(this.f46863, bArrM33487, this.f46858, bArr, c5983.m27377()));
        }
        c1385.m4855(bArrM33487);
        f46855.mo12129(c5277, "Sending NTLM authenticate message: {}");
        C15651 c15652 = new C15651();
        C5982 c5984 = new C5982();
        c5277.m14568(c5984);
        c15652.m37327(c5984.m27377());
        c1385.m4854(c15652);
        c1385.m4852(this.f46861);
        return c1385;
    }

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ */
    public final void mo5451(C16418 c16418) {
        this.f46863 = c16418.m38658();
        this.f46860 = c16418.m38659();
        this.f46859 = c16418.m38667();
        this.f46857 = EnumC23474.NEGOTIATE;
        this.f46861 = new HashSet();
        this.f46862 = new C2453(this.f46860, this.f46863);
    }

    @Override // l.InterfaceC17123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5452(C12185 c12185) {
        return c12185.getClass().equals(C12185.class);
    }
}
