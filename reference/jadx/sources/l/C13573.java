package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۬ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13573 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f43085 = C16980.m40037(C13573.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12828 f43086;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18049 f43087;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21033 f43088;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6862 f43089 = new C6862();

    public C13573(C21033 c21033, C12828 c12828, C18049 c18049) {
        this.f43088 = c21033;
        this.f43086 = c12828;
        this.f43087 = c18049;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33279() {
        C23664 c23664M33278;
        C12828 c12828 = this.f43086;
        EnumSet enumSetM31834 = c12828.m31834();
        InterfaceC25186 interfaceC25186 = f43085;
        interfaceC25186.mo13716(enumSetM31834, "Negotiating dialects {}");
        boolean zM31820 = c12828.m31820();
        C21033 c21033 = this.f43088;
        C6862 c6862 = this.f43089;
        if (zM31820) {
            C7102 c7102 = new C7102(c12828.m31834());
            long j = c21033.f67213.m51929(1)[0];
            if (j != 0) {
                throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
            }
            C2387 c2387 = new C2387(c7102, j, UUID.randomUUID(), false);
            c21033.f67210.m20809(c2387);
            c6862.f22785 = c7102;
            c21033.f67218.m14605(c7102);
            C12453 c12453M8118 = c2387.m8118((InterfaceC20658) null);
            long jM31828 = c12828.m31828();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC6488 interfaceC6488 = C9469.f30684;
            C24652 c24652 = (C24652) C24388.m54498(jM31828, c12453M8118);
            if (!(c24652 instanceof C23664)) {
                throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + c24652);
            }
            c23664M33278 = (C23664) c24652;
            if (c23664M33278.m52893() == EnumC15700.SMB_2XX) {
                c23664M33278 = m33278();
            }
        } else {
            c23664M33278 = m33278();
        }
        c6862.f22790 = c23664M33278;
        if (!EnumC20243.m46514(((C18684) c23664M33278.mo3632()).m43472())) {
            throw new C22172((C18684) c23664M33278.mo3632(), "Failure during dialect negotiation");
        }
        EnumC15700 enumC15700M52893 = c6862.f22790.m52893();
        if (enumC15700M52893 == EnumC15700.SMB_3_1_1) {
            List<AbstractC22194> listM52899 = c6862.f22790.m52899();
            if (listM52899 == null) {
                throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AbstractC22194 abstractC22194 : listM52899) {
                int i = C8353.f27400[abstractC22194.m50202().ordinal()];
                if (i == 1) {
                    if (z) {
                        throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    C19956 c19956 = (C19956) abstractC22194;
                    if (c19956.m45881().size() != 1) {
                        throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
                    }
                    c6862.f22788 = (EnumC5018) c19956.m45881().get(0);
                    byte[] bArrM23907 = C8944.m23907(c6862.f22785);
                    byte[] bArrM23908 = C8944.m23907(c6862.f22790);
                    String strM15246 = c6862.f22788.m15246();
                    try {
                        c12828.m31824().getClass();
                        C1487 c1487M25274 = C9689.m25274(strM15246);
                        byte[] bArr = new byte[c1487M25274.m5313()];
                        c1487M25274.m5312();
                        c1487M25274.m5309(bArr);
                        c1487M25274.m5309(bArrM23907);
                        byte[] bArrM5311 = c1487M25274.m5311();
                        c1487M25274.m5312();
                        c1487M25274.m5309(bArrM5311);
                        c1487M25274.m5309(bArrM23908);
                        c6862.f22787 = c1487M25274.m5311();
                        z = true;
                    } catch (C11181 e) {
                        throw new C12082(C25272.m56409("Cannot get the message digest for ", strM15246), e);
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("unknown negotiate context type");
                    }
                    if (z3) {
                        throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    ArrayList arrayListM19895 = ((C7255) abstractC22194).m19895();
                    if (arrayListM19895.size() == 0) {
                        throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
                    }
                    if (arrayListM19895.size() == 1 && arrayListM19895.get(0) == EnumC3022.NONE) {
                        interfaceC25186.mo13709("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
                    } else {
                        c6862.f22789 = EnumSet.copyOf((Collection) arrayListM19895);
                    }
                    z3 = true;
                } else {
                    if (z2) {
                        throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    List listM34039 = ((C13966) abstractC22194).m34039();
                    if (listM34039.size() != 1) {
                        throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
                    }
                    c6862.f22784 = (EnumC14208) listM34039.get(0);
                    z2 = true;
                }
            }
        } else if (enumC15700M52893.m37476() && c6862.f22790.m52895().contains(EnumC17938.SMB2_GLOBAL_CAP_ENCRYPTION)) {
            c6862.f22784 = EnumC14208.AES_128_CCM;
        }
        C18049 c18049 = this.f43087;
        C7365 c7365M42054 = c18049.m42054();
        C23664 c23664 = c6862.f22790;
        c7365M42054.m20221(c23664.m52900(), c23664.m52893(), c23664.m52897(), c23664.m52895());
        C7365 c7365M34243 = c21033.f67219.m34243(c7365M42054.m20224());
        if (c7365M34243 == null) {
            c21033.f67219.m34244(c7365M42054);
            c6862.f22786 = c7365M42054;
        } else {
            if (!c7365M42054.m20222(c7365M34243)) {
                throw new C9469(C14442.m34865("Different server found for same hostname '", c7365M42054.m20224(), "', disconnecting..."));
            }
            c6862.f22786 = c7365M34243;
        }
        c18049.m42055(c6862);
        interfaceC25186.mo13716(c18049, "Negotiated the following connection settings: {}");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C23664 m33278() {
        byte[] bArr = new byte[32];
        C12828 c12828 = this.f43086;
        c12828.m31832().nextBytes(bArr);
        C16204 c16204 = new C16204(c12828.m31834(), this.f43087.m42065(), false, c12828.m31818(), bArr);
        this.f43089.f22785 = c16204;
        return (C23664) this.f43088.m48061(c16204);
    }
}
