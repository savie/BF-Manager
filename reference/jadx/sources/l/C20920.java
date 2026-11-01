package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩷ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20920 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20215 f67972;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16418 f67973;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7514 f67974;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13159 f67975;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1163 f67976;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20215 f67977;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67967 = C12123.m30169("SMBC2SCipherKey");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f67971 = C12123.m30169("SMBS2CCipherKey");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67966 = C12123.m30169("SMB2AESCCM");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f67970 = C12123.m30169("ServerIn ");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67962 = C12123.m30169("ServerOut");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67968 = C12123.m30169("SmbSign");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f67963 = C12123.m30169("SMB2AESCMAC");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f67969 = C12123.m30169("SMBSigningKey");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f67960 = C12123.m30169("SmbRpc");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f67965 = C12123.m30169("SMB2APP");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67961 = C12123.m30169("SMBAppKey");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f67964 = C13488.m32997(C20920.class);

    public C20920(C1163 c1163, C16418 c16418, InterfaceC7514 interfaceC7514) {
        this.f67976 = c1163;
        this.f67973 = c16418;
        this.f67975 = c1163.m4281();
        this.f67977 = c1163.m4293();
        this.f67972 = c1163.m4294();
        this.f67974 = interfaceC7514;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20858 m47036(C12185 c12185) {
        try {
            InterfaceC17123 interfaceC17123M47034 = m47034(c12185);
            boolean z = interfaceC17123M47034 instanceof C14302;
            C16418 c16418 = this.f67973;
            if (z && c16418.m38667().m1150() && (!c12185.m30288() || c12185.m30290())) {
                interfaceC17123M47034 = new C1600((C14302) interfaceC17123M47034);
            }
            C10337 c10337 = new C10337();
            c10337.f35448 = interfaceC17123M47034;
            c10337.f35444 = c12185;
            interfaceC17123M47034.mo5451(c16418);
            m47033(c10337, this.f67975.m32542());
            C20858 c20858M47035 = m47035(c10337);
            f67964.mo12124(c12185.m30291(), this.f67976.m4292(), Long.valueOf(c20858M47035.m46886()));
            this.f67977.m45674(Long.valueOf(c20858M47035.m46886()), c20858M47035);
            return c20858M47035;
        } catch (IOException | C0127 e) {
            throw new C13865(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C20858 m47035(C10337 c10337) throws IOException {
        byte[] bArr = c10337.f35449;
        C13159 c13159 = this.f67975;
        C0814 c0814 = new C0814(c13159.m32548().m11484(), EnumSet.of(c13159.m32543() ? EnumC5048.SMB2_NEGOTIATE_SIGNING_REQUIRED : EnumC5048.SMB2_NEGOTIATE_SIGNING_ENABLED), c13159.m32544());
        c0814.m3386(bArr);
        ((C1186) c0814.mo25478()).m4340(c10337.f35442);
        c10337.f35443 = c0814;
        C1163 c1163 = this.f67976;
        c10337.f35445 = (C0814) c1163.m4283(c0814);
        C0814 c0815 = c10337.f35445;
        c10337.f35442 = ((C1186) c0815.mo25478()).m4337();
        EnumC20508 enumC20508M11484 = c13159.m32548().m11484();
        long jM4349 = ((C1186) c0815.mo25478()).m4349();
        long value = EnumC3055.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        C20215 c20215 = this.f67972;
        if (jM4349 == value) {
            if (enumC20508M11484 == EnumC20508.SMB_3_1_1) {
                C20858 c20858M45673 = c20215.m45673(Long.valueOf(c10337.f35442));
                if (c20858M45673 == null) {
                    c20858M45673 = m47031(c10337);
                    c20215.m45674(Long.valueOf(c10337.f35442), c20858M45673);
                }
                m47032(c10337, c20858M45673.m46892(), c10337.f35443);
                m47032(c10337, c20858M45673.m46892(), c10337.f35445);
            }
            f67964.mo12121("More processing required for authentication of {} using {}", c10337.f35444.m30291(), c10337.f35448);
            m47033(c10337, c0815.m3387());
            return m47035(c10337);
        }
        if (((C1186) c0815.mo25478()).m4349() != EnumC3055.STATUS_SUCCESS.getValue()) {
            throw new C10360((C1186) c0815.mo25478(), String.format("Authentication failed for '%s' using %s", c10337.f35444.m30291(), c10337.f35448));
        }
        C20858 c20858M45674 = c20215.m45673(Long.valueOf(c10337.f35442));
        EnumC20508 enumC20508 = EnumC20508.SMB_3_1_1;
        if (enumC20508M11484 == enumC20508 && c20858M45674 != null) {
            c20215.m45675(Long.valueOf(c20858M45674.m46886()));
        } else {
            c20858M45674 = m47031(c10337);
        }
        C15920 c15920M46892 = c20858M45674.m46892();
        m47033(c10337, c0815.m3387());
        if (c10337.f35447 != null) {
            c15920M46892.m37879(new SecretKeySpec(c10337.f35447, "HmacSHA256"));
        }
        if (enumC20508M11484 == enumC20508) {
            m47032(c10337, c15920M46892, c10337.f35443);
        }
        C16418 c16418 = this.f67973;
        c16418.getClass();
        c15920M46892.m37876(c1163.m4281().m32543());
        EnumSet enumSetM3385 = c10337.f35445.m3385();
        EnumC21982 enumC21982 = EnumC21982.SMB2_SESSION_FLAG_IS_NULL;
        if (enumSetM3385.contains(enumC21982)) {
            c15920M46892.m37876(false);
        }
        EnumSet enumSetM3386 = c10337.f35445.m3385();
        EnumC21982 enumC21983 = EnumC21982.SMB2_SESSION_FLAG_IS_GUEST;
        boolean zContains = enumSetM3386.contains(enumC21983);
        if (zContains && c15920M46892.m37871()) {
            if (zContains && c16418.m38673() && !c16418.m38665()) {
                c15920M46892.m37876(false);
            } else {
                throw new C10275("Cannot require message signing when authenticating with a guest account");
            }
        } else if (zContains) {
            c15920M46892.m37876(false);
        }
        if (c1163.m4290().m11484().m46306() && c1163.m4281().m32549() && c10337.f35445.m3385().contains(EnumC21982.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
            c15920M46892.m37881();
            c15920M46892.m37876(false);
        }
        if (enumC20508M11484.m46306() && !c0815.m3385().contains(enumC21982) && !c0815.m3385().contains(enumC21983)) {
            if (enumC20508M11484 == enumC20508) {
                c15920M46892.m37873(m47030(this.f67973, c15920M46892.m37872(), f67969, c15920M46892.m37880(), "AesCmac", 16));
            } else {
                c15920M46892.m37873(m47030(this.f67973, c15920M46892.m37872(), f67963, f67968, "AesCmac", 16));
            }
            if (c13159.m32549()) {
                String strM44612 = c13159.m32546().m44612();
                int iM44614 = c13159.m32546().m44614();
                if (enumC20508M11484 == enumC20508) {
                    c15920M46892.m37883(m47030(this.f67973, c15920M46892.m37872(), f67967, c15920M46892.m37880(), strM44612, iM44614));
                    c15920M46892.m37875(m47030(this.f67973, c15920M46892.m37872(), f67971, c15920M46892.m37880(), strM44612, iM44614));
                    m47030(this.f67973, c15920M46892.m37872(), f67961, c15920M46892.m37880(), strM44612, 16);
                    return c20858M45674;
                }
                SecretKeySpec secretKeySpecM37872 = c15920M46892.m37872();
                byte[] bArr2 = f67970;
                C16418 c16419 = this.f67973;
                byte[] bArr3 = f67966;
                c15920M46892.m37883(m47030(c16419, secretKeySpecM37872, bArr3, bArr2, strM44612, iM44614));
                c15920M46892.m37875(m47030(this.f67973, c15920M46892.m37872(), bArr3, f67962, strM44612, iM44614));
                m47030(this.f67973, c15920M46892.m37872(), f67965, f67960, strM44612, 16);
            }
        }
        return c20858M45674;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20858 m47031(C10337 c10337) {
        C12185 c12185 = c10337.f35444;
        C2574 c2574 = (C2574) this.f67974;
        c2574.getClass();
        C1163 c1163 = c2574.f10144;
        C20858 c20858 = new C20858(c1163, c1163.f5214, c12185, c1163.f5216, c1163.f5213, c1163.f5212, c1163.f5215);
        c20858.m46893(c10337.f35442);
        c20858.m46892().m37877(this.f67975.m32545());
        return c20858;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47033(C10337 c10337, byte[] bArr) throws IOException {
        InterfaceC17123 interfaceC17123 = c10337.f35448;
        C12185 c12185 = c10337.f35444;
        C13159 c13159 = this.f67975;
        C1385 c1385Mo5450 = interfaceC17123.mo5450(c12185, bArr, c13159);
        if (c1385Mo5450 == null) {
            return;
        }
        c13159.getClass();
        c10337.f35447 = c1385Mo5450.m4849();
        AbstractC16356 abstractC16356M4851 = c1385Mo5450.m4851();
        C5982 c5982 = new C5982();
        try {
            abstractC16356M4851.mo37323(c5982);
            c10337.f35449 = c5982.m27377();
        } catch (C0127 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private InterfaceC17123 m47034(C12185 c12185) throws C0127 {
        ArrayList arrayList = new ArrayList(this.f67973.m38663());
        ArrayList arrayList2 = new ArrayList();
        C13159 c13159 = this.f67975;
        if (c13159.m32542().length > 0) {
            C7183 c7183 = new C7183();
            c7183.m46450(c13159.m32542());
            arrayList2 = c7183.m46448();
        }
        for (InterfaceC20094 interfaceC20094 : new ArrayList(arrayList)) {
            if (arrayList2.isEmpty() || arrayList2.contains(new C15757(interfaceC20094.getName()))) {
                InterfaceC17123 interfaceC17123 = (InterfaceC17123) interfaceC20094.create();
                if (interfaceC17123.mo5452(c12185)) {
                    return interfaceC17123;
                }
            }
        }
        throw new C13865("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c12185);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47032(C10337 c10337, C15920 c15920, C0814 c0814) {
        if (c10337.f35446 == null) {
            String strM23249 = this.f67976.m4281().m32537().m23249();
            try {
                this.f67973.m38658().getClass();
                c10337.f35446 = C21356.m47885(strM23249);
            } catch (C7206 e) {
                throw new C13865(C0252.m1693("Cannot get the message digest for ", strM23249), e);
            }
        }
        InterfaceC10029 interfaceC10029 = c10337.f35446;
        byte[] bArrM37880 = c15920.m37880();
        byte[] bArrM20981 = C7951.m20981(c0814);
        C15007 c15007 = (C15007) interfaceC10029;
        c15007.m35987();
        c15007.m35984(bArrM37880);
        c15007.m35984(bArrM20981);
        c15920.m37877(c15007.m35986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SecretKeySpec m47030(C16418 c16418, SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        int i2 = i * 8;
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) (i2 >> 8), (byte) i2});
            try {
                c16418.m38658().getClass();
                InterfaceC19201 interfaceC19201M28667 = C11479.m28667();
                interfaceC19201M28667.mo33217(new C17828(secretKeySpec.getEncoded(), byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[i];
                interfaceC19201M28667.mo33216(i, bArr3);
                return new SecretKeySpec(bArr3, str);
            } catch (C7206 e) {
                throw new C13865(e);
            }
        } catch (IOException e2) {
            f67964.mo12138("Unable to format suffix, error occur : ", (Throwable) e2);
            return null;
        }
    }
}
