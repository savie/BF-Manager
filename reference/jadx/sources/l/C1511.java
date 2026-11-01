package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511 extends C4561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C14213 f6162 = new C14213();

    public C1511(C14441 c14441) {
        this.f16198 = c14441.f16198;
        C12842 c12842 = c14441.f16199;
        this.f16199 = c12842;
        this.f16200 = c14441;
        f6162.m34308(c12842);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m5217() {
        C7197 c7197;
        C12842 c12842;
        EnumC20934 enumC20934;
        C5123 c5123;
        ArrayList arrayList = new ArrayList();
        while (true) {
            C12842 c12843 = this.f16199;
            if (c12843.f42721 != EnumC20934.f68105) {
                if (arrayList.size() > 0) {
                    return arrayList;
                }
                return null;
            }
            if (EnumC18817.m43426(c12843.f42724)) {
                arrayList.add(m5216());
            } else {
                if (!EnumC18817.m43422(this.f16199.f42724)) {
                    return null;
                }
                boolean zM43425 = EnumC18817.m43425(this.f16199.f42724);
                this.f16199.m31840();
                C12842 c12844 = this.f16199;
                if (c12844.f42721 == EnumC20934.f68161) {
                    int i = c12844.f42726;
                    c12844.m31841(String.format("     [ParserAnnotation.parseTypeAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
                    c7197 = new C7197(this.f16200.f47348.m31654(i), zM43425);
                } else {
                    String str = c12844.f42724;
                    c12844.m31841(C0252.m1693("     [ParserAnnotation.parseTypeAnnotation]: value = ", str));
                    c7197 = new C7197(this.f16200.f47348.m31655(str), zM43425);
                }
                this.f16199.m31840();
                C12842 c12845 = this.f16199;
                EnumC20934 enumC20935 = EnumC20934.f68039;
                c12845.m31848(enumC20935);
                m5215(c7197);
                this.f16199.m31841("     [ParserAnnotation._scanTypeTarget]: Begin ");
                this.f16199.m31848(enumC20935);
                this.f16199.m31848(EnumC20934.f68096);
                this.f16199.m31841("     [ParserAnnotation._scanTypeTarget]: TargetType: " + this.f16199.f42720);
                EnumC2300 enumC2300M7036 = EnumC2300.m7036(this.f16199.f42720);
                if (enumC2300M7036 == null) {
                    C18111 c18111 = this.f16198;
                    C12842 c12846 = this.f16199;
                    throw C7997.m21056(c18111, c12846.f42728, "Incorrect TypeAnnotation target \"{0}\"", new Object[]{c12846.f42720});
                }
                this.f16199.m31841("     [ParserAnnotation._scanTypeTarget]: Got TargetType: " + enumC2300M7036);
                C14213 c14213 = f6162;
                if (c14213.f46603 == null) {
                    c14213.f46603 = this.f16199;
                }
                c14213.m34310(enumC2300M7036);
                c7197.f24005 = c14213.m34309();
                c7197.f24004 = enumC2300M7036;
                this.f16199.m31841("     [ParserAnnotation._scanTypeTarget]: Got TargetInfo: " + c7197.f24005);
                C12842 c12847 = this.f16199;
                EnumC20934 enumC20936 = EnumC20934.f68195;
                c12847.m31848(enumC20936);
                C12842 c12848 = this.f16199;
                if (c12848.f42721 != enumC20936) {
                    c12848.m31848(enumC20935);
                    while (true) {
                        c12842 = this.f16199;
                        EnumC20934 enumC20937 = c12842.f42721;
                        EnumC20934 enumC20938 = EnumC20934.f68179;
                        if (enumC20937 == enumC20938 || enumC20937 == (enumC20934 = EnumC20934.f68195)) {
                            break;
                        }
                        if (enumC20937 == enumC20938 || !enumC20937.m47089()) {
                            C18111 c18112 = this.f16198;
                            C12842 c12849 = this.f16199;
                            throw C7997.m21056(c18112, c12849.f42728, "Incorrect TypeAnnotation TargetPath PathEntry \"{0}\"", new Object[]{c12849.f42721});
                        }
                        EnumC13591 enumC13591M33211 = EnumC13591.m33211(this.f16199.f42724);
                        if (enumC13591M33211 == EnumC13591.TYPE_ARGUMENT) {
                            this.f16199.m31840();
                            this.f16199.m31848(EnumC20934.f68039);
                            C12842 c128410 = this.f16199;
                            EnumC20934 enumC20939 = c128410.f42721;
                            if (enumC20939 == enumC20938 || enumC20939 != EnumC20934.f68154) {
                                throw C7997.m21056(this.f16198, c128410.f42728, "Incorrect TypeAnnotation TargetPath PathEntry ArgIndex (expected Integer),  \"{0}\"", new Object[]{enumC20939});
                            }
                            int i2 = c128410.f42726;
                            c128410.m31840();
                            c5123 = new C5123(enumC13591M33211, i2);
                            this.f16199.m31848(enumC20934);
                        } else {
                            c5123 = new C5123(enumC13591M33211, 0);
                            this.f16199.m31840();
                        }
                        c7197.f24006.m12344(c5123);
                        C12842 c128411 = this.f16199;
                        if (c128411.f42721 == EnumC20934.f68072) {
                            c128411.m31840();
                        }
                    }
                    c12842.m31848(EnumC20934.f68195);
                }
                this.f16199.m31848(EnumC20934.f68195);
                arrayList.add(c7197);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13879 m5218() {
        this.f16199.m31840();
        this.f16199.m31848(EnumC20934.f68039);
        EnumC20934 enumC20934 = this.f16199.f42721;
        InterfaceC6387 interfaceC6387M5214 = (enumC20934 == EnumC20934.f68179 || enumC20934 == EnumC20934.f68195) ? null : m5214("default");
        this.f16199.m31848(EnumC20934.f68195);
        C13879 c13879 = new C13879(this.f16200.f47348, EnumC16783.f53743);
        c13879.f45733 = interfaceC6387M5214;
        return c13879;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C11514 m5216() {
        C11514 c11514;
        boolean zM43425 = EnumC18817.m43425(this.f16199.f42724);
        this.f16199.m31841(" - - - > [ParserAnnotation.parseAnnotation]: Begin ");
        this.f16199.m31840();
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68161) {
            int i = c12842.f42726;
            c12842.m31841(String.format("     [ParserAnnotation.parseAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
            c11514 = new C11514(this.f16200.f47348.m31654(i), zM43425);
        } else {
            String str = c12842.f42724;
            c12842.m31841(C0252.m1693("     [ParserAnnotation.parseAnnotation]: value = ", str));
            c11514 = new C11514(this.f16200.f47348.m31655(str), zM43425);
        }
        this.f16199.m31840();
        m5215(c11514);
        return c11514;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5215(C11514 c11514) {
        C12842 c12842;
        this.f16199.m31841(" - - - > [ParserAnnotation._scanAnnotation]: Begin");
        this.f16199.m31848(EnumC20934.f68039);
        while (true) {
            c12842 = this.f16199;
            EnumC20934 enumC20934 = c12842.f42721;
            if (enumC20934 == EnumC20934.f68179 || enumC20934 == EnumC20934.f68195) {
                break;
            }
            C15187 c15187M34802 = this.f16200.m34802();
            this.f16199.m31848(EnumC20934.f68094);
            if (c15187M34802.mo32563()) {
                AbstractC21536 abstractC21536 = c15187M34802.f49578;
                if (abstractC21536.f69952 != EnumC13776.f45415) {
                    throw new C6055();
                }
                String strMo46300 = abstractC21536.mo46300();
                this.f16199.m31841(C0252.m1693("     [ParserAnnotation._scanAnnotation]: Annot - Field Name: ", strMo46300));
                c11514.m28699(new C13631(c15187M34802, m5214(strMo46300)));
            } else if (this.f16199.f42721 == EnumC20934.f68161) {
                C15187 c15187M34803 = this.f16200.m34802();
                this.f16199.m31841("     [ParserAnnotation._scanAnnotation]: " + c15187M34802.f43854 + " = " + c15187M34803.f43854);
                c11514.m28699(new C13631(c15187M34802, c15187M34803));
            } else {
                c11514.m28699(new C13631(c15187M34802, m5214("unknown")));
            }
            C12842 c12843 = this.f16199;
            if (c12843.f42721 == EnumC20934.f68072) {
                c12843.m31840();
            }
        }
        c12842.m31848(EnumC20934.f68195);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC6387 m5214(String str) {
        C12842 c12842;
        int[] iArr = C0100.f1040;
        int i = 1;
        switch (iArr[this.f16199.f42721.ordinal()]) {
            case 1:
                C18111 c18111 = this.f16198;
                StringBuilder sbM30914 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: JASM Keyword: (annotation field name: ", str, ") keyword: ");
                sbM30914.append(this.f16199.f42724);
                c18111.m2146(sbM30914.toString(), new Object[0]);
                String str2 = this.f16199.f42724;
                int i2 = C0100.f1039[C2485.m7620(str2).ordinal()];
                if (i2 == 1) {
                    this.f16199.m31840();
                    int i3 = iArr[this.f16199.f42721.ordinal()];
                    if (i3 == 1) {
                        String str3 = this.f16199.f42724;
                        str3.getClass();
                        if (!str3.equals("true")) {
                            if (!str3.equals("false")) {
                                throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC3046.AE_BOOLEAN.m9140(), EnumC20934.f68154.m47084() + ", " + EnumC20934.f68161.m47084() + ", " + EnumC20934.f68210.m47084() + ", " + EnumC20934.f68128.m47084(), this.f16199.f42724});
                            }
                            i = 0;
                        }
                        C18111 c18112 = this.f16198;
                        StringBuilder sbM30915 = C12441.m30914("Boolean Field: ", str, " = ");
                        sbM30915.append(this.f16199.f42724);
                        c18112.m2146(sbM30915.toString(), new Object[0]);
                        C10685 c10685 = new C10685(EnumC3046.AE_BOOLEAN.m9142(), this.f16200.f47348.m31668(Integer.valueOf(i)));
                        this.f16199.m31840();
                        return c10685;
                    }
                    if (i3 == 3) {
                        C10685 c10686 = new C10685(EnumC3046.AE_BOOLEAN.m9142(), this.f16200.f47348.m31654(Integer.parseInt(this.f16199.f42724)));
                        this.f16199.m31840();
                        return c10686;
                    }
                    if (i3 != 4) {
                        throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC3046.AE_BOOLEAN.m9140(), EnumC20934.f68154.m47084() + ", " + EnumC20934.f68161.m47084(), this.f16199.f42724});
                    }
                    C18111 c18113 = this.f16198;
                    StringBuilder sbM30916 = C12441.m30914("Boolean Field: ", str, " = ");
                    sbM30916.append(this.f16199.f42726);
                    c18113.m2146(sbM30916.toString(), new Object[0]);
                    int i4 = this.f16199.f42726;
                    if (i4 > 1 || i4 < 0) {
                        C18111 c18114 = this.f16198;
                        StringBuilder sbM30917 = C12441.m30914("Warning: Boolean Field: ", str, " value is not 0 or 1, value = ");
                        sbM30917.append(this.f16199.f42726);
                        c18114.m2146(sbM30917.toString(), new Object[0]);
                    }
                    C10685 c10687 = new C10685(EnumC3046.AE_BOOLEAN.m9142(), this.f16200.f47348.m31668(Integer.valueOf(i4)));
                    this.f16199.m31840();
                    return c10687;
                }
                if (i2 == 2) {
                    this.f16199.m31840();
                    int i5 = iArr[this.f16199.f42721.ordinal()];
                    if (i5 == 3) {
                        C10685 c10688 = new C10685(EnumC3046.AE_BYTE.m9142(), this.f16200.f47348.m31654(Integer.parseInt(this.f16199.f42724)));
                        this.f16199.m31840();
                        return c10688;
                    }
                    if (i5 != 4) {
                        throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC3046.AE_BYTE.m9140(), EnumC20934.f68154.m47084() + ", " + EnumC20934.f68161.m47084(), this.f16199.f42724});
                    }
                    C18111 c18115 = this.f16198;
                    StringBuilder sbM30918 = C12441.m30914("Byte Field: ", str, " = ");
                    sbM30918.append(this.f16199.f42726);
                    c18115.m2146(sbM30918.toString(), new Object[0]);
                    int i6 = this.f16199.f42726;
                    if (i6 > 255) {
                        C18111 c18116 = this.f16198;
                        StringBuilder sbM30919 = C12441.m30914("Warning: Byte Field: ", str, " value is greater than 0xFF, value = ");
                        sbM30919.append(this.f16199.f42726);
                        c18116.m2146(sbM30919.toString(), new Object[0]);
                    }
                    C10685 c10689 = new C10685(EnumC3046.AE_BYTE.m9142(), this.f16200.f47348.m31668(Integer.valueOf(i6)));
                    this.f16199.m31840();
                    return c10689;
                }
                if (i2 == 3) {
                    this.f16199.m31840();
                    int i7 = iArr[this.f16199.f42721.ordinal()];
                    if (i7 == 3) {
                        C10685 c106810 = new C10685(EnumC3046.AE_CHAR.m9142(), this.f16200.f47348.m31654(Integer.parseInt(this.f16199.f42724)));
                        this.f16199.m31840();
                        return c106810;
                    }
                    if (i7 == 4) {
                        C18111 c18117 = this.f16198;
                        StringBuilder sbM309110 = C12441.m30914("Char Field: ", str, " = ");
                        sbM309110.append(this.f16199.f42726);
                        c18117.m2146(sbM309110.toString(), new Object[0]);
                        C10685 c106811 = new C10685(EnumC3046.AE_CHAR.m9142(), this.f16200.f47348.m31668(Integer.valueOf(this.f16199.f42726)));
                        this.f16199.m31840();
                        return c106811;
                    }
                    throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC3046.AE_CHAR.m9140(), EnumC20934.f68154.m47084() + ", " + EnumC20934.f68161.m47084(), this.f16199.f42724});
                }
                if (i2 != 4) {
                    throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation keyword \"{0}\"", new Object[]{str2});
                }
                this.f16199.m31840();
                int i8 = iArr[this.f16199.f42721.ordinal()];
                if (i8 == 3) {
                    C10685 c106812 = new C10685(EnumC3046.AE_SHORT.m9142(), this.f16200.f47348.m31654(Integer.parseInt(this.f16199.f42724)));
                    this.f16199.m31840();
                    return c106812;
                }
                if (i8 != 4) {
                    throw C7997.m21056(this.f16198, this.f16199.f42728, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC3046.AE_SHORT.m9140(), EnumC20934.f68154.m47084() + ", " + EnumC20934.f68161.m47084(), this.f16199.f42724});
                }
                C18111 c18118 = this.f16198;
                StringBuilder sbM309111 = C12441.m30914("Short Field: ", str, " = ");
                sbM309111.append(this.f16199.f42726);
                c18118.m2146(sbM309111.toString(), new Object[0]);
                int i9 = this.f16199.f42726;
                if (i9 > 65535) {
                    C18111 c18119 = this.f16198;
                    StringBuilder sbM309112 = C12441.m30914("Warning: Short Field: ", str, " value is greater than 0xFFFF, value = ");
                    sbM309112.append(this.f16199.f42726);
                    c18119.m2146(sbM309112.toString(), new Object[0]);
                }
                C10685 c106813 = new C10685(EnumC3046.AE_SHORT.m9142(), this.f16200.f47348.m31668(Integer.valueOf(i9)));
                this.f16199.m31840();
                return c106813;
            case 2:
                C18111 c181110 = this.f16198;
                StringBuilder sbM309113 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: String Field: ", str, " = ");
                sbM309113.append(this.f16199.f42724);
                c181110.m2146(sbM309113.toString(), new Object[0]);
                C10685 c106814 = new C10685(EnumC13776.f45415.m33534(), this.f16200.f47348.m31655(this.f16199.f42724));
                this.f16199.m31840();
                return c106814;
            case 3:
                C18111 c181111 = this.f16198;
                StringBuilder sbM309114 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Constant Field by index: ", str, " = #");
                sbM309114.append(this.f16199.f42724);
                c181111.m2146(sbM309114.toString(), new Object[0]);
                int i10 = Integer.parseInt(this.f16199.f42724);
                C15187 c15187M31654 = this.f16200.f47348.m31654(i10);
                EnumC13776 enumC13776M36398 = c15187M31654.m36398();
                InterfaceC6387 c106815 = enumC13776M36398.m33537(EnumC13776.f45407, EnumC13776.f45432, EnumC13776.f45434, EnumC13776.f45429, EnumC13776.f45399, EnumC13776.f45415) ? new C10685(enumC13776M36398.m33534(), c15187M31654) : new C5745(this.f16200.f47348.m31654(i10));
                this.f16199.m31840();
                return c106815;
            case 4:
                C18111 c181112 = this.f16198;
                StringBuilder sbM309115 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Integer Field: ", str, " = ");
                sbM309115.append(this.f16199.f42726);
                c181112.m2146(sbM309115.toString(), new Object[0]);
                C10685 c106816 = new C10685(EnumC13776.f45432.m33534(), this.f16200.f47348.m31668(Integer.valueOf(this.f16199.f42726)));
                this.f16199.m31840();
                return c106816;
            case 5:
                C18111 c181113 = this.f16198;
                StringBuilder sbM309116 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Double Field: ", str, " = ");
                sbM309116.append(this.f16199.f42716);
                c181113.m2146(sbM309116.toString(), new Object[0]);
                Long lValueOf = Long.valueOf(Double.doubleToLongBits(this.f16199.f42716));
                char cM33534 = EnumC13776.f45399.m33534();
                C12738 c12738 = this.f16200.f47348;
                c12738.getClass();
                C10685 c106817 = new C10685(cM33534, c12738.m31658(new C1448(lValueOf)));
                this.f16199.m31840();
                return c106817;
            case 6:
                C18111 c181114 = this.f16198;
                StringBuilder sbM309117 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Float Field: ", str, " = ");
                sbM309117.append(this.f16199.f42718);
                c181114.m2146(sbM309117.toString(), new Object[0]);
                Integer numValueOf = Integer.valueOf(Float.floatToIntBits(this.f16199.f42718));
                char cM33535 = EnumC13776.f45434.m33534();
                C12738 c12739 = this.f16200.f47348;
                c12739.getClass();
                C10685 c106818 = new C10685(cM33535, c12739.m31658(new C7093(numValueOf)));
                this.f16199.m31840();
                return c106818;
            case 7:
                C18111 c181115 = this.f16198;
                StringBuilder sbM309118 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Long Field: ", str, " = ");
                sbM309118.append(this.f16199.f42731);
                c181115.m2146(sbM309118.toString(), new Object[0]);
                char cM33536 = EnumC13776.f45429.m33534();
                C12738 c127310 = this.f16200.f47348;
                Long lValueOf2 = Long.valueOf(this.f16199.f42731);
                c127310.getClass();
                C10685 c106819 = new C10685(cM33536, c127310.m31658(new C18382(lValueOf2)));
                this.f16199.m31840();
                return c106819;
            case 8:
                this.f16198.m2146("[ParserAnnotation.scanAnnotationData]:: Class) keyword: " + this.f16199.f42724, new Object[0]);
                this.f16199.m31840();
                int i11 = iArr[this.f16199.f42721.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    C18111 c181116 = this.f16198;
                    StringBuilder sbM309119 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                    sbM309119.append(this.f16199.f42724);
                    c181116.m2146(sbM309119.toString(), new Object[0]);
                    C10685 c106820 = new C10685(EnumC3046.AE_CLASS.m9142(), this.f16200.f47348.m31655(this.f16199.f42724));
                    this.f16199.m31840();
                    return c106820;
                }
                if (i11 != 3) {
                    C18111 c181117 = this.f16198;
                    C12842 c12843 = this.f16199;
                    throw C7997.m21056(c181117, c12843.f42728, "Incorrect Annotation (class), expected class name or CP index, got \"{0}\"", new Object[]{c12843.f42724});
                }
                C18111 c181118 = this.f16198;
                StringBuilder sbM309120 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                sbM309120.append(this.f16199.f42724);
                c181118.m2146(sbM309120.toString(), new Object[0]);
                C5745 c5745 = new C5745(this.f16200.f47348.m31654(Integer.valueOf(this.f16199.f42724).intValue()));
                this.f16199.m31840();
                return c5745;
            case 9:
                this.f16198.m2146("[ParserAnnotation.scanAnnotationData]:: Enum) keyword: " + this.f16199.f42724, new Object[0]);
                this.f16199.m31840();
                int i12 = iArr[this.f16199.f42721.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    String str4 = this.f16199.f42724;
                    EnumC3046 enumC3046 = EnumC3046.AE_STRING;
                    enumC3046.m9142();
                    C15187 c15187M31655 = this.f16200.f47348.m31655(str4);
                    this.f16199.m31840();
                    this.f16199.m31848(EnumC20934.f68045);
                    int i13 = iArr[this.f16199.f42721.ordinal()];
                    if (i13 == 1 || i13 == 2) {
                        String str5 = this.f16199.f42724;
                        enumC3046.m9142();
                        C23385 c23385 = new C23385(c15187M31655, this.f16200.f47348.m31655(str5));
                        this.f16199.m31840();
                        return c23385;
                    }
                    if (i13 == 3) {
                        C23385 c23386 = new C23385(c15187M31655, this.f16200.f47348.m31654(this.f16199.f42726));
                        this.f16199.m31840();
                        return c23386;
                    }
                    C18111 c181119 = this.f16198;
                    C12842 c12844 = this.f16199;
                    throw C7997.m21056(c181119, c12844.f42728, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c12844.f42724});
                }
                if (i12 != 3) {
                    C18111 c181120 = this.f16198;
                    C12842 c12845 = this.f16199;
                    throw C7997.m21056(c181120, c12845.f42728, "Incorrect Annotation (enum), expected type_name or CP index, got \"{0}\"", new Object[]{c12845.f42724});
                }
                C12842 c12846 = this.f16199;
                int i14 = c12846.f42726;
                c12846.m31840();
                C12842 c12847 = this.f16199;
                if (c12847.f42721 == EnumC20934.f68045) {
                    c12847.m31840();
                }
                int i15 = iArr[this.f16199.f42721.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    String str6 = this.f16199.f42724;
                    EnumC3046.AE_STRING.m9142();
                    C23385 c23387 = new C23385(this.f16200.f47348.m31654(i14), this.f16200.f47348.m31655(str6));
                    this.f16199.m31840();
                    return c23387;
                }
                if (i15 == 3) {
                    C23385 c23388 = new C23385(this.f16200.f47348.m31654(i14), this.f16200.f47348.m31654(this.f16199.f42726));
                    this.f16199.m31840();
                    return c23388;
                }
                C18111 c181121 = this.f16198;
                C12842 c12848 = this.f16199;
                throw C7997.m21056(c181121, c12848.f42728, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c12848.f42724});
            case 10:
                C18111 c181122 = this.f16198;
                StringBuilder sbM309121 = C12441.m30914("[ParserAnnotation.scanAnnotationData]:: Annotation Field: ", str, " = ");
                sbM309121.append(this.f16199.f42724);
                c181122.m2146(sbM309121.toString(), new Object[0]);
                C11514 c11514M5216 = m5216();
                C16329 c16329 = new C16329();
                c16329.f52606 = c11514M5216;
                return c16329;
            case 11:
                this.f16198.m2146(C0252.m1693("[ParserAnnotation.scanAnnotationData]:: Annotation Array Field: ", str), new Object[0]);
                this.f16199.m31840();
                C17034 c17034 = new C17034();
                c17034.f54417 = new ArrayList();
                while (true) {
                    c12842 = this.f16199;
                    EnumC20934 enumC20934 = c12842.f42721;
                    if (enumC20934 != EnumC20934.f68179 && enumC20934 != EnumC20934.f68195) {
                        c17034.f54417.add(m5214(C15489.m37076(str, " {}")));
                        C12842 c12849 = this.f16199;
                        if (c12849.f42721 == EnumC20934.f68072) {
                            c12849.m31840();
                        }
                    }
                }
                c12842.m31848(EnumC20934.f68195);
                return c17034;
            default:
                C18111 c181123 = this.f16198;
                C12842 c128410 = this.f16199;
                throw C7997.m21056(c181123, c128410.f42728, "Incorrect Annotation, unrecognized token: \"{0}\"", new Object[]{c128410.f42721});
        }
    }
}
