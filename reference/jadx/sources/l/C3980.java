package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3980 extends AbstractC14504 {

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f14752 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C0910 f14753;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f14754;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public boolean f14755;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public int f14756;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C20311 f14757;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public C10707 f14758;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public int[] f14759;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public C3275 f14760;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C17056 f14761;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public int f14762;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public C22784 f14763;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C3275 f14764;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public String f14765;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public String f14766;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public C6555 f14767;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public C14318 f14768;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C3275 f14769;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C3275 f14770;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public C7447 f14771;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C2321 f14772;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public C23407 f14773;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public C2507 f14774;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC3800 f14775;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public int f14776;

    public C3980(AbstractC0410 abstractC0410) {
        super(abstractC0410);
        this.f14754 = false;
        this.f14755 = false;
        this.f14757 = new C20311();
        this.f14765 = "";
        this.f14766 = "";
        this.f14776 = 0;
        this.f14768 = null;
        this.f14775 = null;
        this.f47507 = "ClassData";
        this.f47519 = abstractC0410;
        abstractC0410.m2146("printOptions=".concat(C13612.m33282()), new Object[0]);
        C11038 c11038 = new C11038(this);
        this.f47511 = this;
        this.f47512 = c11038;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11479(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47519.m2146(C8479.m22141(unsignedShort, "fields=#"), new Object[0]);
        this.f14769 = new C3275(this, C13092.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            final C13092 c13092 = new C13092(this);
            c13092.f43599 = -1;
            c13092.f47507 = "FieldData";
            this.f47519.m2146(C8479.m22141(i, "  FieldData: #"), new Object[0]);
            c13092.f47516 = dataInputStream.readUnsignedShort();
            c13092.f43598 = dataInputStream.readUnsignedShort();
            c13092.f43600 = dataInputStream.readUnsignedShort();
            c13092.m34917(dataInputStream);
            c13092.f47519.m2152(new Supplier() { // from class: l.᩹ۨۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    C13092 c13093 = c13092;
                    Integer numValueOf = Integer.valueOf(c13093.f43598);
                    String strM27826 = ((C3980) c13093.f47511).f47512.m27826(c13093.f43598, new C19929(6));
                    Integer numValueOf2 = Integer.valueOf(c13093.f43600);
                    String strM27827 = ((C3980) c13093.f47511).f47512.m27826(c13093.f43600, new C5008(8));
                    Object obj = c13093.f47505;
                    if (obj == null) {
                        obj = "";
                    }
                    return String.format("FieldData: name[%d]=%s type[%d]=%s%s", numValueOf, strM27826, numValueOf2, strM27827, obj);
                }
            });
            this.f14769.m9755((AbstractC6741) c13092);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11474(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47519.m2146(C8479.m22141(unsignedShort, "methods=#"), new Object[0]);
        this.f14760 = new C3275(this, C5061.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            C5061 c5061 = new C5061(this);
            this.f47519.m2146(C8479.m22141(i, "MethodData: #"), new Object[0]);
            c5061.f47516 = dataInputStream.readUnsignedShort();
            c5061.f17658 = dataInputStream.readUnsignedShort();
            c5061.f17652 = dataInputStream.readUnsignedShort();
            c5061.f47519.m2152(new C9565(c5061, 0));
            c5061.m34917(dataInputStream);
            this.f14760.m9755((AbstractC6741) c5061);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11478(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47519.m2146(C8479.m22141(unsignedShort, "interfaces=#"), new Object[0]);
        this.f14759 = new int[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            short s = dataInputStream.readShort();
            this.f47519.m2146(C2271.m6967("  InterfaceCpx[", i, s, "]="), new Object[0]);
            this.f14759[i] = s;
        }
    }

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11477(DataInputStream dataInputStream, EnumC16783 enumC16783, int i) throws IOException {
        this.f14776++;
        switch (C1158.f5182[enumC16783.ordinal()]) {
            case 1:
                if (this.f47505 != null) {
                    this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "ClassFile");
                }
                C12906 c12906 = new C12906(this);
                c12906.m31978(i, dataInputStream);
                this.f47505 = c12906;
                return true;
            case 2:
                if (this.f14763 != null) {
                    this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "SourceFile", "ClassFile");
                }
                C22784 c22784 = new C22784(this, EnumC10020.SOURCE_FILE);
                c22784.m34526(i, dataInputStream);
                this.f14763 = c22784;
                return true;
            case 3:
                if (this.f14774 != null) {
                    this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "EnclosingMethod", "ClassFile");
                }
                C2507 c2507 = new C2507(this, EnumC10020.ENCLOSING_METHOD);
                c2507.m34526(i, dataInputStream);
                this.f14774 = c2507;
                return true;
            case 4:
                C6555 c6555 = new C6555(this.f22710);
                c6555.f22094 = C18755.m43309(i, 76 - c6555.m18233(), dataInputStream);
                this.f14767 = c6555;
                return true;
            case 5:
                int unsignedShort = dataInputStream.readUnsignedShort();
                if ((unsignedShort * 8) + 2 != i) {
                    if (!this.f22711) {
                        throw new C16639(this.f47519.m2163(), "{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                    }
                    this.f47519.m2163().mo24457("{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                }
                C3275 c3275 = new C3275(this, C22970.class, unsignedShort);
                if (!mo18231()) {
                    boolean z = this.f22704;
                }
                this.f14770 = c3275;
                c3275.f22686 = this.f22686;
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    C22970 c22970 = new C22970(this, this.f14770);
                    c22970.f74650 = dataInputStream.readUnsignedShort();
                    c22970.f74648 = dataInputStream.readUnsignedShort();
                    c22970.f74653 = dataInputStream.readUnsignedShort();
                    c22970.f74652 = dataInputStream.readUnsignedShort();
                    this.f14770.m9755(c22970);
                }
                return true;
            case 6:
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                C3275 c3276 = new C3275(this, C9358.class, unsignedShort2);
                this.f14764 = c3276;
                c3276.f22686 = this.f22686;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    C9358 c9358 = new C9358(this, this.f14764);
                    c9358.f22696 = EnumC10020.BOOTSTRAP_METHOD;
                    c9358.f31713 = this.f22695 ? 7 : 7 - c9358.m18205();
                    c9358.f31712 = dataInputStream.readUnsignedShort();
                    c9358.f31715 = dataInputStream.readUnsignedShort();
                    c9358.f31714 = new ArrayList(c9358.f31715);
                    for (int i4 = 0; i4 < c9358.f31715; i4++) {
                        c9358.f31714.add(Integer.valueOf(dataInputStream.readUnsignedShort()));
                    }
                    this.f14764.m9755(c9358);
                }
                return true;
            case 7:
                C17056 c17056 = new C17056(this);
                this.f14761 = c17056;
                c17056.m39834(dataInputStream);
                return true;
            case 8:
                C10707 c10707 = new C10707(this, EnumC10020.NEST_HOST);
                c10707.m34526(i, dataInputStream);
                this.f14758 = c10707;
                return true;
            case 9:
                EnumC20934 enumC20934 = EnumC20934.f68169;
                C23407 c23407 = new C23407(this);
                c23407.f11255 = enumC20934;
                c23407.f22696 = EnumC10020.NEST_MEMBERS;
                c23407.m8966(i, dataInputStream);
                this.f14773 = c23407;
                return true;
            case 10:
                C0910 c0910 = new C0910(this);
                c0910.f22696 = EnumC10020.RECORD_DATA;
                c0910.m3629(dataInputStream);
                this.f14753 = c0910;
                return true;
            case 11:
                EnumC20934 enumC20935 = EnumC20934.f68219;
                C2321 c2321 = new C2321(this);
                c2321.f11255 = enumC20935;
                c2321.m8966(i, dataInputStream);
                this.f14772 = c2321;
                return true;
            case 12:
                EnumC20934 enumC20936 = EnumC20934.f68125;
                C7447 c7447 = new C7447(this);
                c7447.f11255 = enumC20936;
                c7447.m8966(i, dataInputStream);
                this.f14771 = c7447;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11475(DataInputStream dataInputStream, InterfaceC3800 interfaceC3800) throws IOException {
        C20311 c20311 = this.f14757;
        this.f14775 = interfaceC3800;
        try {
            int i = dataInputStream.readInt();
            if (i != -889275714) {
                this.f47519.mo2157("The magic number identifying the class file format is expected to be {0}. The invalid magic number {1} will be ignored.", C1115.m4131(-889275714), C1115.m4131(i));
            }
            c20311.m45850(dataInputStream.readUnsignedShort());
            c20311.m45844(dataInputStream.readUnsignedShort());
            C11038 c11038 = this.f47512;
            c11038.m27818(dataInputStream);
            c11038.m27824();
            this.f47516 = dataInputStream.readUnsignedShort();
            this.f14762 = dataInputStream.readUnsignedShort();
            this.f14756 = dataInputStream.readUnsignedShort();
            AbstractC0410 abstractC0410 = this.f47519;
            Integer numValueOf = Integer.valueOf(this.f47516);
            int i2 = this.f47516;
            abstractC0410.m2146("0x%04X [ %s] this_cpx=%d super_cpx=%d", numValueOf, EnumC23839.m52538(i2, EnumC23839.m52549(i2) ? EnumC0554.CLASS : EnumC0554.MODULE), Integer.valueOf(this.f14762), Integer.valueOf(this.f14756));
            m11478(dataInputStream);
            m11479(dataInputStream);
            m11474(dataInputStream);
            m34917(dataInputStream);
            m11473(this.f14762);
            this.f47519.m2146("\n<< Reading is done >>", new Object[0]);
            if (c20311.m45851()) {
                EnumC23839.m52520(EnumC0554.VALUE_OBJECTS);
            }
        } catch (EOFException unused) {
            this.f47519.mo2150("The end of the file was unexpectedly reached while reading class data", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m11473(int i) {
        String strM27822 = this.f47512.m27822(i);
        this.f14765 = strM27822;
        int iLastIndexOf = strM27822.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            this.f14766 = this.f14765.substring(0, iLastIndexOf);
            this.f14765.substring(iLastIndexOf + 1);
        }
        C22784 c22784 = this.f14763;
        if (c22784 != null) {
            c22784.f46833 = c22784.f46834.m27826(c22784.f46838, new C19929(7));
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m11481(int i) {
        C14318 c14318 = this.f14768;
        if (c14318 == null) {
            return null;
        }
        try {
            InterfaceC3800 interfaceC3800 = c14318.f46900;
            List list = c14318.f46901;
            if (list != null) {
                if (i >= 1 && i < list.size()) {
                    return (String) list.get(i - 1);
                }
                return String.format("Line number %d is out of range in \"%s\"", Integer.valueOf(i), interfaceC3800);
            }
            return String.format("\"%s\" not found", interfaceC3800);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return String.format("Line number %d is out of bounds", Integer.valueOf(i));
        }
    }

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11476(List... listArr) {
        for (List<C12885> list : listArr) {
            if (list != null) {
                for (C12885 c12885 : list) {
                    c12885.m18232();
                    c12885.mo3628();
                    m18221();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m11480() {
        if (!this.f14754 && this.f14755) {
            try {
                mo3628();
            } catch (Exception unused) {
            }
        }
        try {
            this.f47519.m2144().mo18529(this.f14765);
        } catch (IOException unused2) {
        }
        this.f47519.m2159().flush();
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        int i;
        char c;
        C22784 c22784;
        String strMo7640;
        String strM5594;
        Date dateFrom;
        byte[] bArrDigest;
        EnumC13154 enumC13154M32524 = EnumC13154.m32524(this.f14765, this.f47516);
        EnumC13154 enumC13154 = EnumC13154.MODULE_INFO;
        boolean z = this.f22702;
        String str = "{";
        C20311 c20311 = this.f14757;
        if (enumC13154M32524 == enumC13154) {
            mo11476(this.f47508, this.f47515);
            if (this.f14761 == null) {
                this.f14761 = new C17056(this);
            }
            m18228(this.f14761.m39833("version ".concat(c20311.m45843())));
            m18221();
            m18219("{");
            if (z) {
                this.f47512.mo3628();
            }
            this.f14755 = true;
            this.f14761.mo3628();
            m18228("} // end of module " + this.f14761.m39836());
            if (this.f14761.m39835() != null) {
                m18228("@" + this.f14761.m39835());
            }
            m18221();
            mo11476(this.f47508, this.f47515);
            mo11476(this.f47518, this.f47504);
            if (!this.f14766.isEmpty()) {
                m18219(C0242.m1617("package ", this.f14766, " version ", c20311.m45843(), l.b));
            }
        } else {
            if (this.f22708) {
                InterfaceC1260 interfaceC1260M2168 = this.f47519.m2168();
                String strM27830 = this.f47512.m27830(this.f14762, "<invalid this_cpx #%d>");
                boolean zM52527 = EnumC23839.m52527(this.f47516);
                m18219("/**");
                if (interfaceC1260M2168 instanceof C11845) {
                    m18219(" *  Classfile " + this.f14775.toAbsolutePath());
                    dateFrom = new Date(this.f14775.toFile().lastModified());
                } else {
                    String string = this.f14775.toString();
                    m18219(" *  Classfile " + string.substring(string.lastIndexOf(47) + 1));
                    dateFrom = C16790.from(C18991.now().atStartOfDay(AbstractC9114.systemDefault()).toInstant());
                }
                DateFormat dateInstance = DateFormat.getDateInstance();
                int size = interfaceC1260M2168.getSize();
                String str2 = AbstractC6741.f22685;
                if (size > 0) {
                    m18210(C16523.m38890(" *  ", str2, "Last modified %s; size %d bytes"), dateInstance.format(dateFrom), Integer.valueOf(size));
                } else {
                    m18210(C16523.m38890(" *  ", str2, "Last modified %s"), dateInstance.format(dateFrom));
                }
                MessageDigest messageDigestMo4572 = interfaceC1260M2168.mo4572();
                if (messageDigestMo4572 != null && (bArrDigest = messageDigestMo4572.digest()) != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        sb.append(String.format("%02x", Byte.valueOf(bArrDigest[i2])));
                        i2++;
                        length = length;
                        bArrDigest = bArrDigest;
                    }
                    m18219(" *  " + str2 + messageDigestMo4572.getAlgorithm() + " checksum " + ((Object) sb));
                }
                if (zM52527) {
                    m18228(" *  " + EnumC23839.m52517(this.f47516 & (~EnumC23839.f77073.m52558()) & (~EnumC23839.f77082.m52558()), EnumC0554.CLASS) + "interface " + strM27830);
                } else {
                    m18228(" *  " + EnumC23839.m52517(this.f47516 & (~EnumC23839.f77082.m52558()), EnumC0554.CLASS) + "class " + strM27830);
                }
                C12906 c12906 = this.f47505;
                if (c12906 == null) {
                    if (!zM52527 && this.f14756 != 0) {
                        String strM27831 = this.f47512.m27830(this.f14762, "<invalid super_cpx #%d>");
                        if (!strM27831.equals("java.lang.Object")) {
                            m18228(" extends ".concat(strM27831));
                        }
                    }
                    for (int i3 = 0; i3 < this.f14759.length; i3++) {
                        m18228(i3 == 0 ? !zM52527 ? " implements " : " extends " : ",");
                        m18228(this.f47512.m27830(this.f14759[i3], "<invalid interface_cpx #%d>"));
                    }
                    m18221();
                } else {
                    AbstractC23282 abstractC23282M31980 = c12906.m31980();
                    String strM31982 = this.f47505.m31982();
                    if (abstractC23282M31980 instanceof C2819) {
                        m18228(strM31982);
                    } else if (!abstractC23282M31980.mo15528()) {
                        m18228(" extends " + strM31982);
                    }
                    m18221();
                }
                StringBuilder sbM30914 = C12441.m30914(" *  ", str2, "minor version: ");
                sbM30914.append(c20311.m45848());
                m18219(sbM30914.toString());
                m18219(" *  " + str2 + "major version: " + c20311.m45841());
                StringBuilder sb2 = new StringBuilder(" *  ");
                sb2.append(str2);
                sb2.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f47516), EnumC23839.m52538(this.f47516, EnumC0554.CLASS)));
                m18219(sb2.toString());
                StringBuilder sb3 = new StringBuilder(" *  ");
                sb3.append(str2);
                int i4 = 0;
                sb3.append("this_class:  " + this.f47512.m27815(this.f14762, new C4686(i4)));
                m18219(sb3.toString());
                StringBuilder sb4 = new StringBuilder(" *  ");
                sb4.append(str2);
                sb4.append("super_class: " + this.f47512.m27815(this.f14756, new C4686(i4)));
                m18219(sb4.toString());
                String strM50267 = C22697.m50267(new StringBuilder(" *  "), str2, "interfaces: %d, fields: %d, methods: %d, attributes: %d");
                i = 1;
                m18210(strM50267, Integer.valueOf(this.f14759.length), Integer.valueOf(this.f14769.f12145.size()), Integer.valueOf(this.f14760.f12145.size()), Integer.valueOf(this.f14776));
                m18219(" */");
            } else {
                str = "{";
                i = 1;
            }
            if (this.f14766.isEmpty()) {
                c = 0;
            } else {
                Object[] objArr = new Object[i];
                c = 0;
                objArr[0] = this.f14766;
                m18219(String.format("package %s;%n", objArr));
            }
            ArrayList arrayList = this.f47508;
            ArrayList arrayList2 = this.f47515;
            List[] listArr = new List[2];
            listArr[c] = arrayList;
            listArr[i] = arrayList2;
            mo11476(listArr);
            ArrayList arrayList3 = this.f47518;
            ArrayList arrayList4 = this.f47504;
            List[] listArr2 = new List[2];
            listArr2[c] = arrayList3;
            listArr2[i] = arrayList4;
            mo11476(listArr2);
            String strM27808 = this.f47512.m27814(this.f14762) ? C11038.m27808(C9754.m24743(this.f47512.m27822(this.f14762)), this.f14766) : "?? invalid index";
            C12906 c12907 = this.f47505;
            C13111 c13111M31977 = c12907 != null ? c12907.m31977(new C2569(this, 0)) : new C13111("", "");
            boolean zM52528 = EnumC23839.m52527(this.f47516);
            boolean z2 = this.f22704;
            boolean z3 = this.f22692;
            if (zM52528) {
                m18228(EnumC23839.m52517(this.f47516 & (~EnumC23839.f77073.m52558()), EnumC0554.CLASS));
                m18228(z3 ? z2 ? String.format("interface #%d%s", Integer.valueOf(this.f14762), c13111M31977.f43679) : String.format("interface #%d%s /* %s%s */", Integer.valueOf(this.f14762), c13111M31977.f43679, strM27808, c13111M31977.f43680) : C0252.m1693("interface ", strM27808));
            } else {
                m18228(EnumC23839.m52517(this.f47516, EnumC0554.CLASS) + m34922());
                m18228(z3 ? z2 ? String.format("class #%d%s", Integer.valueOf(this.f14762), c13111M31977.f43679) : String.format("class #%d%s /* %s%s */", Integer.valueOf(this.f14762), c13111M31977.f43679, strM27808, c13111M31977.f43680) : String.format("class %s%s", strM27808, c13111M31977.f43680));
                if (this.f14762 >= this.f47512.size() || this.f14762 <= 0) {
                    m18228(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f14756)) : String.format(" extends #%d /* ?? invalid index */", Integer.valueOf(this.f14756)) : " extends ??");
                } else if (!this.f47512.m27822(this.f14756).equals("java/lang/Object")) {
                    m18228(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f14756)) : String.format(" extends #%d /* %s */", Integer.valueOf(this.f14756), C11038.m27808(C9754.m24743(this.f47512.m27822(this.f14756)), this.f14766)) : C0252.m1693(" extends ", C11038.m27808(C9754.m24743(this.f47512.m27822(this.f14756)), this.f14766)));
                }
            }
            int[] iArr = this.f14759;
            int length2 = iArr.length;
            if (length2 > 0) {
                String str3 = (String) C20318.stream(iArr).mapToObj(new IntFunction() { // from class: l.ۚܰۤ
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i5) {
                        C3980 c3980 = this.f18617;
                        C11038 c11038 = c3980.f47512;
                        return C11038.m27808(C9754.m24743(c11038.m27822(i5)), c3980.f14766);
                    }
                }).collect(C1890.joining(", "));
                if (z3) {
                    String str4 = (String) C20318.stream(this.f14759).mapToObj(new C22326()).collect(C1890.joining(", "));
                    if (z2) {
                        strM5594 = C1679.m5594(length2 > 1 ? "\n" + m18225() : " ", "implements ", str4);
                    } else {
                        strM5594 = (length2 > 1 ? "\n" + m18225() : " ") + "implements " + str4 + " /* " + str3 + " */";
                    }
                } else {
                    strM5594 = C1679.m5594(length2 > 1 ? "\n" + m18225() : " ", "implements ", str3);
                }
                m18228(strM5594);
            }
            m18210("%sversion %s", length2 > 1 ? "\n" + m18225() : " ", c20311.m45843());
            m18219(str);
            C11038 c11038 = this.f47512;
            int i5 = c11038.f22686;
            if (z) {
                c11038.mo3628();
                this.f22686 = i5;
            }
            if (this.f22698 && !this.f22700) {
                if (!z3) {
                    int i6 = 0;
                    m18209("this_class:  " + this.f47512.m27815(this.f14762, new C4686(i6)) + l.b);
                    m18209("super_class: " + this.f47512.m27815(this.f14756, new C4686(i6)) + l.b);
                } else if (z2) {
                    m18224(String.format("this_class:  #%d;", Integer.valueOf(this.f14762)), Integer.valueOf(i5));
                    m18224(String.format("super_class: #%d;", Integer.valueOf(this.f14756)), Integer.valueOf(i5));
                } else {
                    int i7 = 0;
                    int iM18233 = i5 - m18233();
                    m18223(m18222(iM18233, String.format("this_class:  #%d;", Integer.valueOf(this.f14762))));
                    m18219(" // " + this.f47512.m27815(this.f14762, new C4686(i7)));
                    m18223(m18222(iM18233, String.format("super_class: #%d;", Integer.valueOf(this.f14756))));
                    m18219(" // " + this.f47512.m27815(this.f14756, new C4686(i7)));
                }
                m18221();
            }
            this.f14755 = true;
            if (this.f22714 && (c22784 = this.f14763) != null && (strMo7640 = c22784.mo7640()) != null) {
                this.f14768 = new C14318(strMo7640, this.f14775.getParent());
            }
            List list = C20318.stream(new AbstractC6741[]{this.f47505, this.f14763, this.f14774, this.f14767, this.f14753, this.f14758, this.f14770, this.f14773, this.f14772, this.f14771, this.f14764}).filter(new C13860(this)).toList();
            int i8 = this.f22686;
            C3275 c3275 = this.f14769;
            if (c3275 != null && c3275.f12145.size() > 0) {
                c3275.f22686 = i8;
                c3275.mo3628();
                if (C20318.stream(new C3275[]{this.f14760}).anyMatch(new C11743()) && !list.isEmpty()) {
                    m18221();
                }
            }
            int iM18234 = i8 - m18233();
            this.f22686 = iM18234;
            C3275 c3276 = this.f14760;
            if (c3276 != null && c3276.f12145.size() > 0) {
                c3276.f22686 = iM18234;
                c3276.mo3628();
                if (!list.isEmpty()) {
                    m18221();
                }
            }
            int size2 = list.size();
            boolean z4 = false;
            for (int i9 = 0; i9 < size2; i9++) {
                InterfaceC5144 interfaceC5144 = (InterfaceC5144) list.get(i9);
                if (C20318.stream(new InterfaceC5144[]{interfaceC5144}).anyMatch(new C11743())) {
                    if (AbstractC6741.class.isAssignableFrom(interfaceC5144.getClass())) {
                        ((AbstractC6741) interfaceC5144).f22686 = iM18234;
                    }
                    interfaceC5144.mo3628();
                    z4 = true;
                }
                if (z4 && i9 + 1 < size2) {
                    m18221();
                    z4 = false;
                }
            }
            if (z2) {
                m18219(l.d);
            } else {
                m18219("} // end Class " + this.f14765);
            }
            this.f14754 = true;
        }
        List listM27821 = this.f47512.m27821();
        if (listM27821.isEmpty()) {
            return;
        }
        Iterator it = listM27821.iterator();
        while (it.hasNext()) {
            this.f47519.m2151((IOException) it.next());
        }
        throw new C6055();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11472(InterfaceC5144 interfaceC5144) {
        return C20318.stream(new InterfaceC5144[]{interfaceC5144}).anyMatch(new C11743());
    }
}
