package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8926 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f30608 = C13488.m32997(C8926.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19509 f30609 = new C19509();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16418 f30610;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13159 f30611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1163 f30612;

    public C8926(C1163 c1163, C16418 c16418, C13159 c13159) {
        this.f30612 = c1163;
        this.f30610 = c16418;
        this.f30611 = c13159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23216() {
        C1892 c1892M23215;
        C16418 c16418 = this.f30610;
        EnumSet enumSetM38676 = c16418.m38676();
        InterfaceC4314 interfaceC4314 = f30608;
        interfaceC4314.mo12126(enumSetM38676, "Negotiating dialects {}");
        boolean zM38666 = c16418.m38666();
        C1163 c1163 = this.f30612;
        C19509 c19509 = this.f30609;
        if (zM38666) {
            C8514 c8514 = new C8514(c16418.m38676());
            long j = c1163.f5208.m37963(1)[0];
            if (j != 0) {
                throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
            }
            C18803 c18803 = new C18803(c8514, j, UUID.randomUUID(), false);
            c1163.f5209.m18404(c18803);
            c19509.f62748 = c8514;
            c1163.f5210.m25283(c8514);
            C13557 c13557M43366 = c18803.m43366((InterfaceC4383) null);
            long jM38674 = c16418.m38674();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC11440 interfaceC11440 = C21317.f69360;
            C11771 c11771 = (C11771) C2266.m6947(jM38674, c13557M43366);
            if (!(c11771 instanceof C1892)) {
                throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + c11771);
            }
            c1892M23215 = (C1892) c11771;
            if (c1892M23215.m6151() == EnumC20508.SMB_2XX) {
                c1892M23215 = m23215();
            }
        } else {
            c1892M23215 = m23215();
        }
        c19509.f62745 = c1892M23215;
        if (!EnumC3055.m9152(((C1186) c1892M23215.mo25478()).m4349())) {
            throw new C10360((C1186) c1892M23215.mo25478(), "Failure during dialect negotiation");
        }
        EnumC20508 enumC20508M6151 = c19509.f62745.m6151();
        if (enumC20508M6151 == EnumC20508.SMB_3_1_1) {
            List<AbstractC9988> listM6158 = c19509.f62745.m6158();
            if (listM6158 == null) {
                throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AbstractC9988 abstractC9988 : listM6158) {
                int i = C8220.f28623[abstractC9988.m25245().ordinal()];
                if (i == 1) {
                    if (z) {
                        throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    C15633 c15633 = (C15633) abstractC9988;
                    if (c15633.m37313().size() != 1) {
                        throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
                    }
                    c19509.f62747 = (EnumC8949) c15633.m37313().get(0);
                    byte[] bArrM20981 = C7951.m20981(c19509.f62748);
                    byte[] bArrM20982 = C7951.m20981(c19509.f62745);
                    String strM23249 = c19509.f62747.m23249();
                    try {
                        c16418.m38658().getClass();
                        C15007 c15007M47885 = C21356.m47885(strM23249);
                        byte[] bArr = new byte[c15007M47885.m35988()];
                        c15007M47885.m35987();
                        c15007M47885.m35984(bArr);
                        c15007M47885.m35984(bArrM20981);
                        byte[] bArrM35986 = c15007M47885.m35986();
                        c15007M47885.m35987();
                        c15007M47885.m35984(bArrM35986);
                        c15007M47885.m35984(bArrM20982);
                        c19509.f62750 = c15007M47885.m35986();
                        z = true;
                    } catch (C7206 e) {
                        throw new C13865(C0252.m1693("Cannot get the message digest for ", strM23249), e);
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("unknown negotiate context type");
                    }
                    if (z3) {
                        throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    ArrayList arrayListM20769 = ((C7871) abstractC9988).m20769();
                    if (arrayListM20769.size() == 0) {
                        throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
                    }
                    if (arrayListM20769.size() == 1 && arrayListM20769.get(0) == EnumC18120.NONE) {
                        interfaceC4314.mo12130("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
                    } else {
                        c19509.f62749 = EnumSet.copyOf((Collection) arrayListM20769);
                    }
                    z3 = true;
                } else {
                    if (z2) {
                        throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    List listM43969 = ((C19160) abstractC9988).m43969();
                    if (listM43969.size() != 1) {
                        throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
                    }
                    c19509.f62746 = (EnumC19532) listM43969.get(0);
                    z2 = true;
                }
            }
        } else if (enumC20508M6151.m46306() && c19509.f62745.m6154().contains(EnumC24036.SMB2_GLOBAL_CAP_ENCRYPTION)) {
            c19509.f62746 = EnumC19532.AES_128_CCM;
        }
        C13159 c13159 = this.f30611;
        C19447 c19447M32539 = c13159.m32539();
        C1892 c1892 = c19509.f62745;
        c19447M32539.m44497(c1892.m6157(), c1892.m6151(), c1892.m6156(), c1892.m6154());
        C19447 c19447M23003 = c1163.f5205.m23003(c19447M32539.m44499());
        if (c19447M23003 == null) {
            c1163.f5205.m23004(c19447M32539);
            c19509.f62744 = c19447M32539;
        } else {
            if (!c19447M32539.m44498(c19447M23003)) {
                throw new C21317(C16523.m38890("Different server found for same hostname '", c19447M32539.m44499(), "', disconnecting..."));
            }
            c19509.f62744 = c19447M23003;
        }
        c13159.m32540(c19509);
        interfaceC4314.mo12126(c13159, "Negotiated the following connection settings: {}");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C1892 m23215() {
        byte[] bArr = new byte[32];
        C16418 c16418 = this.f30610;
        c16418.m38659().nextBytes(bArr);
        C14594 c14594 = new C14594(c16418.m38676(), this.f30611.m32538(), false, c16418.m38661(), bArr);
        this.f30609.f62748 = c14594;
        return (C1892) this.f30612.m4283(c14594);
    }
}
