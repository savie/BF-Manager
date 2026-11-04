package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۤ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11093 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12828 f34977;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18049 f34978;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20044 f34979;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22282 f34980;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21033 f34981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20044 f34982;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34971 = C2083.m7176("SMBC2SCipherKey");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f34976 = C2083.m7176("SMBS2CCipherKey");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34972 = C2083.m7176("SMB2AESCCM");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34973 = C2083.m7176("ServerIn ");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34968 = C2083.m7176("ServerOut");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f34975 = C2083.m7176("SmbSign");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34966 = C2083.m7176("SMB2AESCMAC");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f34974 = C2083.m7176("SMBSigningKey");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f34970 = C2083.m7176("SmbRpc");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34967 = C2083.m7176("SMB2APP");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f34965 = C2083.m7176("SMBAppKey");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f34969 = C16980.m40037(C11093.class);

    public C11093(C21033 c21033, C12828 c12828, InterfaceC22282 interfaceC22282) {
        this.f34981 = c21033;
        this.f34977 = c12828;
        this.f34978 = c21033.m48067();
        this.f34979 = c21033.m48072();
        this.f34982 = c21033.m48070();
        this.f34980 = interfaceC22282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10852 m28008(C1642 c1642) {
        try {
            InterfaceC11336 interfaceC11336M28007 = m28007(c1642);
            boolean z = interfaceC11336M28007 instanceof C17303;
            C12828 c12828 = this.f34977;
            if (z && c12828.m31821().m32801() && (!c1642.m5814() || c1642.m5812())) {
                interfaceC11336M28007 = new C15811((C17303) interfaceC11336M28007);
            }
            C5128 c5128 = new C5128();
            c5128.f17863 = interfaceC11336M28007;
            c5128.f17857 = c1642;
            interfaceC11336M28007.mo28624(c12828);
            m28005(c5128, this.f34978.m42063());
            C10852 c10852M28006 = m28006(c5128);
            f34969.mo13712("Successfully authenticated {} on {}, session is {}", c1642.m5811(), this.f34981.m48069(), Long.valueOf(c10852M28006.m27586()));
            this.f34979.m46101(Long.valueOf(c10852M28006.m27586()), c10852M28006);
            return c10852M28006;
        } catch (IOException | C15153 e) {
            throw new C12082(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10852 m28006(C5128 c5128) throws IOException {
        byte[] bArr = c5128.f17861;
        C18049 c18049 = this.f34978;
        C18442 c18442 = new C18442(c18049.m42061().m1341(), EnumSet.of(c18049.m42059() ? EnumC14712.SMB2_NEGOTIATE_SIGNING_REQUIRED : EnumC14712.SMB2_NEGOTIATE_SIGNING_ENABLED), c18049.m42058());
        c18442.m42966(bArr);
        ((C18684) c18442.mo3632()).m43460(c5128.f17860);
        c5128.f17864 = c18442;
        C21033 c21033 = this.f34981;
        c5128.f17862 = (C18442) c21033.m48061(c18442);
        C18442 c18443 = c5128.f17862;
        c5128.f17860 = ((C18684) c18443.mo3632()).m43461();
        EnumC15700 enumC15700M1341 = c18049.m42061().m1341();
        long jM43472 = ((C18684) c18443.mo3632()).m43472();
        long value = EnumC20243.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        C20044 c20044 = this.f34982;
        if (jM43472 == value) {
            if (enumC15700M1341 == EnumC15700.SMB_3_1_1) {
                C10852 c10852M46100 = c20044.m46100(Long.valueOf(c5128.f17860));
                if (c10852M46100 == null) {
                    c10852M46100 = m28003(c5128);
                    c20044.m46101(Long.valueOf(c5128.f17860), c10852M46100);
                }
                m28004(c5128, c10852M46100.m27589(), c5128.f17864);
                m28004(c5128, c10852M46100.m27589(), c5128.f17862);
            }
            f34969.mo13701("More processing required for authentication of {} using {}", c5128.f17857.m5811(), c5128.f17863);
            m28005(c5128, c18443.m42967());
            return m28006(c5128);
        }
        if (((C18684) c18443.mo3632()).m43472() != EnumC20243.STATUS_SUCCESS.getValue()) {
            throw new C22172((C18684) c18443.mo3632(), String.format("Authentication failed for '%s' using %s", c5128.f17857.m5811(), c5128.f17863));
        }
        C10852 c10852M46101 = c20044.m46100(Long.valueOf(c5128.f17860));
        EnumC15700 enumC15700 = EnumC15700.SMB_3_1_1;
        if (enumC15700M1341 == enumC15700 && c10852M46101 != null) {
            c20044.m46102(Long.valueOf(c10852M46101.m27586()));
        } else {
            c10852M46101 = m28003(c5128);
        }
        C22787 c22787M27589 = c10852M46101.m27589();
        m28005(c5128, c18443.m42967());
        if (c5128.f17858 != null) {
            c22787M27589.m51394(new SecretKeySpec(c5128.f17858, "HmacSHA256"));
        }
        if (enumC15700M1341 == enumC15700) {
            m28004(c5128, c22787M27589, c5128.f17864);
        }
        C12828 c12828 = this.f34977;
        c12828.getClass();
        c22787M27589.m51391(c21033.m48067().m42059());
        EnumSet enumSetM42965 = c5128.f17862.m42965();
        EnumC21426 enumC21426 = EnumC21426.SMB2_SESSION_FLAG_IS_NULL;
        if (enumSetM42965.contains(enumC21426)) {
            c22787M27589.m51391(false);
        }
        EnumSet enumSetM42966 = c5128.f17862.m42965();
        EnumC21426 enumC21427 = EnumC21426.SMB2_SESSION_FLAG_IS_GUEST;
        boolean zContains = enumSetM42966.contains(enumC21427);
        if (zContains && c22787M27589.m51396()) {
            if (zContains && c12828.m31830() && !c12828.m31823()) {
                c22787M27589.m51391(false);
            } else {
                throw new C4887("Cannot require message signing when authenticating with a guest account");
            }
        } else if (zContains) {
            c22787M27589.m51391(false);
        }
        if (c21033.m48065().m1341().m37476() && c21033.m48067().m42066() && c5128.f17862.m42965().contains(EnumC21426.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
            c22787M27589.m51393();
            c22787M27589.m51391(false);
        }
        if (enumC15700M1341.m37476() && !c18443.m42965().contains(enumC21426) && !c18443.m42965().contains(enumC21427)) {
            if (enumC15700M1341 == enumC15700) {
                c22787M27589.m51402(m28002(this.f34977, c22787M27589.m51401(), f34974, c22787M27589.m51395(), "AesCmac", 16));
            } else {
                c22787M27589.m51402(m28002(this.f34977, c22787M27589.m51401(), f34966, f34975, "AesCmac", 16));
            }
            if (c18049.m42066()) {
                String strM34491 = c18049.m42064().m34491();
                int iM34493 = c18049.m42064().m34493();
                if (enumC15700M1341 == enumC15700) {
                    c22787M27589.m51400(m28002(this.f34977, c22787M27589.m51401(), f34971, c22787M27589.m51395(), strM34491, iM34493));
                    c22787M27589.m51390(m28002(this.f34977, c22787M27589.m51401(), f34976, c22787M27589.m51395(), strM34491, iM34493));
                    m28002(this.f34977, c22787M27589.m51401(), f34965, c22787M27589.m51395(), strM34491, 16);
                    return c10852M46101;
                }
                SecretKeySpec secretKeySpecM51401 = c22787M27589.m51401();
                byte[] bArr2 = f34973;
                C12828 c12829 = this.f34977;
                byte[] bArr3 = f34972;
                c22787M27589.m51400(m28002(c12829, secretKeySpecM51401, bArr3, bArr2, strM34491, iM34493));
                c22787M27589.m51390(m28002(this.f34977, c22787M27589.m51401(), bArr3, f34968, strM34491, iM34493));
                m28002(this.f34977, c22787M27589.m51401(), f34967, f34970, strM34491, 16);
            }
        }
        return c10852M46101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10852 m28003(C5128 c5128) {
        C1642 c1642 = c5128.f17857;
        C24017 c24017 = (C24017) this.f34980;
        c24017.getClass();
        C21033 c21033 = c24017.f77672;
        C10852 c10852 = new C10852(c21033, c21033.f67209, c1642, c21033.f67222, c21033.f67211, c21033.f67223, c21033.f67221);
        c10852.m27590(c5128.f17860);
        c10852.m27589().m51392(this.f34978.m42057());
        return c10852;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28005(C5128 c5128, byte[] bArr) throws IOException {
        InterfaceC11336 interfaceC11336 = c5128.f17863;
        C1642 c1642 = c5128.f17857;
        C18049 c18049 = this.f34978;
        C5371 c5371Mo28623 = interfaceC11336.mo28623(c1642, bArr, c18049);
        if (c5371Mo28623 == null) {
            return;
        }
        c18049.getClass();
        c5128.f17858 = c5371Mo28623.m16042();
        AbstractC12916 abstractC12916M16037 = c5371Mo28623.m16037();
        C11707 c11707 = new C11707();
        try {
            abstractC12916M16037.mo27219(c11707);
            c5128.f17861 = c11707.m56028();
        } catch (C15153 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC11336 m28007(C1642 c1642) throws C15153 {
        ArrayList arrayList = new ArrayList(this.f34977.m31822());
        ArrayList arrayList2 = new ArrayList();
        C18049 c18049 = this.f34978;
        if (c18049.m42063().length > 0) {
            C21867 c21867 = new C21867();
            c21867.m27222(c18049.m42063());
            arrayList2 = c21867.m27218();
        }
        for (InterfaceC19912 interfaceC19912 : new ArrayList(arrayList)) {
            if (arrayList2.isEmpty() || arrayList2.contains(new C19497(interfaceC19912.getName()))) {
                InterfaceC11336 interfaceC11336 = (InterfaceC11336) interfaceC19912.create();
                if (interfaceC11336.mo28625(c1642)) {
                    return interfaceC11336;
                }
            }
        }
        throw new C12082("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c1642);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28004(C5128 c5128, C22787 c22787, C18442 c18442) {
        if (c5128.f17859 == null) {
            String strM15246 = this.f34981.m48067().m42060().m15246();
            try {
                this.f34977.m31824().getClass();
                c5128.f17859 = C9689.m25274(strM15246);
            } catch (C11181 e) {
                throw new C12082(C25272.m56409("Cannot get the message digest for ", strM15246), e);
            }
        }
        InterfaceC22370 interfaceC22370 = c5128.f17859;
        byte[] bArrM51395 = c22787.m51395();
        byte[] bArrM23907 = C8944.m23907(c18442);
        C1487 c1487 = (C1487) interfaceC22370;
        c1487.m5312();
        c1487.m5309(bArrM51395);
        c1487.m5309(bArrM23907);
        c22787.m51392(c1487.m5311());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SecretKeySpec m28002(C12828 c12828, SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        int i2 = i * 8;
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) (i2 >> 8), (byte) i2});
            try {
                c12828.m31824().getClass();
                InterfaceC13944 interfaceC13944M54938 = C24608.m54938();
                interfaceC13944M54938.mo18724(new C12479(secretKeySpec.getEncoded(), byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[i];
                interfaceC13944M54938.mo18723(i, bArr3);
                return new SecretKeySpec(bArr3, str);
            } catch (C11181 e) {
                throw new C12082(e);
            }
        } catch (IOException e2) {
            f34969.mo13724("Unable to format suffix, error occur : ", (Throwable) e2);
            return null;
        }
    }
}
