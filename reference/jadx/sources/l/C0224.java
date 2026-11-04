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
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C0224 extends AbstractC1890 {

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1435 = 0;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public C6760 f1436;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public int f1437;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public boolean f1438;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public int[] f1439;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C15708 f1440;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C16521 f1441;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public C11233 f1442;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public C24660 f1443;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public int f1444;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public int f1445;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C22824 f1446;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public C16521 f1447;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f1448;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public String f1449;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C16521 f1450;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public String f1451;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C3097 f1452;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C3776 f1453;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public C15466 f1454;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public C2352 f1455;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public C17946 f1456;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C16521 f1457;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public C20184 f1458;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24329 f1459;

    public C0224(AbstractC12931 abstractC12931) {
        super(abstractC12931);
        this.f1448 = false;
        this.f1438 = false;
        this.f1446 = new C22824();
        this.f1451 = "";
        this.f1449 = "";
        this.f1444 = 0;
        this.f1454 = null;
        this.f1459 = null;
        this.f6365 = "ClassData";
        this.f6369 = abstractC12931;
        abstractC12931.m32315("printOptions=".concat(C25406.m56766()), new Object[0]);
        C1606 c1606 = new C1606(this);
        this.f6363 = this;
        this.f6371 = c1606;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1689(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6369.m32315(C13645.m33382(unsignedShort, "fields=#"), new Object[0]);
        this.f1450 = new C16521(this, C3843.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            final C3843 c3843 = new C3843(this);
            c3843.f13099 = -1;
            c3843.f6365 = "FieldData";
            this.f6369.m32315(C13645.m33382(i, "  FieldData: #"), new Object[0]);
            c3843.f6362 = dataInputStream.readUnsignedShort();
            c3843.f13101 = dataInputStream.readUnsignedShort();
            c3843.f13100 = dataInputStream.readUnsignedShort();
            c3843.m6500(dataInputStream);
            c3843.f6369.m32299(new Supplier() { // from class: l.ۨ֫᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    C3843 c3844 = c3843;
                    Integer numValueOf = Integer.valueOf(c3844.f13101);
                    String strM5640 = ((C0224) c3844.f6363).f6371.m5640(c3844.f13101, new C6081(0));
                    Integer numValueOf2 = Integer.valueOf(c3844.f13100);
                    String strM5641 = ((C0224) c3844.f6363).f6371.m5640(c3844.f13100, new C15431(7));
                    Object obj = c3844.f6377;
                    if (obj == null) {
                        obj = "";
                    }
                    return String.format("FieldData: name[%d]=%s type[%d]=%s%s", numValueOf, strM5640, numValueOf2, strM5641, obj);
                }
            });
            this.f1450.m39148((AbstractC20997) c3843);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m1690(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6369.m32315(C13645.m33382(unsignedShort, "methods=#"), new Object[0]);
        this.f1447 = new C16521(this, C3381.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            final C3381 c3381 = new C3381(this);
            this.f6369.m32315(C13645.m33382(i, "MethodData: #"), new Object[0]);
            c3381.f6362 = dataInputStream.readUnsignedShort();
            c3381.f11017 = dataInputStream.readUnsignedShort();
            c3381.f11011 = dataInputStream.readUnsignedShort();
            c3381.f6369.m32299(new Supplier() { // from class: l.᩻ۧ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    C3381 c3382 = c3381;
                    Integer numValueOf = Integer.valueOf(c3382.f6362);
                    int i2 = c3382.f6362;
                    EnumC19840 enumC19840 = EnumC19840.METHOD;
                    return String.format("MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s", numValueOf, EnumC16856.m39803(i2, enumC19840).isEmpty() ? "<none>" : Boolean.valueOf(EnumC16856.m39803(c3382.f6362, enumC19840).isEmpty()), Integer.valueOf(c3382.f11017), ((C0224) c3382.f6363).f6371.m5640(c3382.f11017, new C18061(9)), Integer.valueOf(c3382.f11011), ((C0224) c3382.f6363).f6371.m5640(c3382.f11011, new C18061(9)));
                }
            });
            c3381.m6500(dataInputStream);
            this.f1447.m39148((AbstractC20997) c3381);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1686(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6369.m32315(C13645.m33382(unsignedShort, "interfaces=#"), new Object[0]);
        this.f1439 = new int[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            short s = dataInputStream.readShort();
            this.f6369.m32315(C6934.m19217("  InterfaceCpx[", i, s, "]="), new Object[0]);
            this.f1439[i] = s;
        }
    }

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1685(DataInputStream dataInputStream, EnumC13127 enumC13127, int i) throws IOException {
        this.f1444++;
        switch (C21107.f67409[enumC13127.ordinal()]) {
            case 1:
                if (this.f6377 != null) {
                    this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "ClassFile");
                }
                C20930 c20930 = new C20930(this);
                c20930.m47838(i, dataInputStream);
                this.f6377 = c20930;
                return true;
            case 2:
                if (this.f1443 != null) {
                    this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "SourceFile", "ClassFile");
                }
                C24660 c24660 = new C24660(this, EnumC10882.SOURCE_FILE);
                c24660.m52512(i, dataInputStream);
                this.f1443 = c24660;
                return true;
            case 3:
                if (this.f1452 != null) {
                    this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "EnclosingMethod", "ClassFile");
                }
                C3097 c3097 = new C3097(this, EnumC10882.ENCLOSING_METHOD);
                c3097.m52512(i, dataInputStream);
                this.f1452 = c3097;
                return true;
            case 4:
                C6760 c6760 = new C6760(this.f67151);
                c6760.f22559 = C8499.m22815(i, 76 - c6760.m48002(), dataInputStream);
                this.f1436 = c6760;
                return true;
            case 5:
                int unsignedShort = dataInputStream.readUnsignedShort();
                if ((unsignedShort * 8) + 2 != i) {
                    if (!this.f67152) {
                        throw new C5474(this.f6369.m32312(), "{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                    }
                    this.f6369.m32312().mo10582("{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                }
                C16521 c16521 = new C16521(this, C18013.class, unsignedShort);
                if (!mo5637()) {
                    boolean z = this.f67146;
                }
                this.f1457 = c16521;
                c16521.f67148 = this.f67148;
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    C18013 c18013 = new C18013(this, this.f1457);
                    c18013.f58970 = dataInputStream.readUnsignedShort();
                    c18013.f58972 = dataInputStream.readUnsignedShort();
                    c18013.f58973 = dataInputStream.readUnsignedShort();
                    c18013.f58975 = dataInputStream.readUnsignedShort();
                    this.f1457.m39148(c18013);
                }
                return true;
            case 6:
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                C16521 c16522 = new C16521(this, C20361.class, unsignedShort2);
                this.f1441 = c16522;
                c16522.f67148 = this.f67148;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    C20361 c20361 = new C20361(this, this.f1441);
                    c20361.f67131 = EnumC10882.BOOTSTRAP_METHOD;
                    c20361.f65309 = this.f67140 ? 7 : 7 - c20361.m48000();
                    c20361.f65311 = dataInputStream.readUnsignedShort();
                    c20361.f65310 = dataInputStream.readUnsignedShort();
                    c20361.f65312 = new ArrayList(c20361.f65310);
                    for (int i4 = 0; i4 < c20361.f65310; i4++) {
                        c20361.f65312.add(Integer.valueOf(dataInputStream.readUnsignedShort()));
                    }
                    this.f1441.m39148(c20361);
                }
                return true;
            case 7:
                C11233 c11233 = new C11233(this);
                this.f1442 = c11233;
                c11233.m28297(dataInputStream);
                return true;
            case 8:
                C20184 c20184 = new C20184(this, EnumC10882.NEST_HOST);
                c20184.m52512(i, dataInputStream);
                this.f1458 = c20184;
                return true;
            case 9:
                EnumC5202 enumC5202 = EnumC5202.f18146;
                C15708 c15708 = new C15708(this);
                c15708.f39081 = enumC5202;
                c15708.f67131 = EnumC10882.NEST_MEMBERS;
                c15708.m30363(i, dataInputStream);
                this.f1440 = c15708;
                return true;
            case 10:
                C3776 c3776 = new C3776(this);
                c3776.f67131 = EnumC10882.RECORD_DATA;
                c3776.m12253(dataInputStream);
                this.f1453 = c3776;
                return true;
            case 11:
                EnumC5202 enumC5203 = EnumC5202.f18272;
                C17946 c17946 = new C17946(this);
                c17946.f39081 = enumC5203;
                c17946.m30363(i, dataInputStream);
                this.f1456 = c17946;
                return true;
            case 12:
                EnumC5202 enumC5204 = EnumC5202.f18237;
                C2352 c2352 = new C2352(this);
                c2352.f39081 = enumC5204;
                c2352.m30363(i, dataInputStream);
                this.f1455 = c2352;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1683(DataInputStream dataInputStream, InterfaceC24329 interfaceC24329) throws IOException {
        C22824 c22824 = this.f1446;
        this.f1459 = interfaceC24329;
        try {
            int i = dataInputStream.readInt();
            if (i != -889275714) {
                this.f6369.mo4165("The magic number identifying the class file format is expected to be {0}. The invalid magic number {1} will be ignored.", C7754.m21094(-889275714), C7754.m21094(i));
            }
            c22824.m51471(dataInputStream.readUnsignedShort());
            c22824.m51463(dataInputStream.readUnsignedShort());
            C1606 c1606 = this.f6371;
            c1606.m5628(dataInputStream);
            c1606.m5632();
            this.f6362 = dataInputStream.readUnsignedShort();
            this.f1437 = dataInputStream.readUnsignedShort();
            this.f1445 = dataInputStream.readUnsignedShort();
            AbstractC12931 abstractC12931 = this.f6369;
            Integer numValueOf = Integer.valueOf(this.f6362);
            int i2 = this.f6362;
            abstractC12931.m32315("0x%04X [ %s] this_cpx=%d super_cpx=%d", numValueOf, EnumC16856.m39803(i2, EnumC16856.m39796(i2) ? EnumC19840.CLASS : EnumC19840.MODULE), Integer.valueOf(this.f1437), Integer.valueOf(this.f1445));
            m1686(dataInputStream);
            m1689(dataInputStream);
            m1690(dataInputStream);
            m6500(dataInputStream);
            m1682(this.f1437);
            this.f6369.m32315("\n<< Reading is done >>", new Object[0]);
            if (c22824.m51468()) {
                EnumC16856.m39777(EnumC19840.VALUE_OBJECTS);
            }
        } catch (EOFException unused) {
            this.f6369.mo4160("The end of the file was unexpectedly reached while reading class data", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m1682(int i) {
        String strM5633 = this.f6371.m5633(i);
        this.f1451 = strM5633;
        int iLastIndexOf = strM5633.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            this.f1449 = this.f1451.substring(0, iLastIndexOf);
            this.f1451.substring(iLastIndexOf + 1);
        }
        C24660 c24660 = this.f1443;
        if (c24660 != null) {
            c24660.f75624 = c24660.f75627.m5640(c24660.f75623, new C6376(6));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m1691(int i) {
        C15466 c15466 = this.f1454;
        if (c15466 == null) {
            return null;
        }
        try {
            InterfaceC24329 interfaceC24329 = c15466.f50375;
            List list = c15466.f50376;
            if (list != null) {
                if (i >= 1 && i < list.size()) {
                    return (String) list.get(i - 1);
                }
                return String.format("Line number %d is out of range in \"%s\"", Integer.valueOf(i), interfaceC24329);
            }
            return String.format("\"%s\" not found", interfaceC24329);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return String.format("Line number %d is out of bounds", Integer.valueOf(i));
        }
    }

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1684(List... listArr) {
        for (List<C0442> list : listArr) {
            if (list != null) {
                for (C0442 c0442 : list) {
                    c0442.m48003();
                    c0442.mo1688();
                    m47989();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m1687() {
        if (!this.f1448 && this.f1438) {
            try {
                mo1688();
            } catch (Exception unused) {
            }
        }
        try {
            this.f6369.m32306().mo3883(this.f1451);
        } catch (IOException unused2) {
        }
        this.f6369.m32303().flush();
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1688() {
        int i;
        String str;
        String str2;
        C24660 c24660;
        String strMo10080;
        String strM46451;
        Date dateFrom;
        byte[] bArrDigest;
        EnumC18123 enumC18123M42244 = EnumC18123.m42244(this.f1451, this.f6362);
        EnumC18123 enumC18123 = EnumC18123.MODULE_INFO;
        boolean z = this.f67153;
        C22824 c22824 = this.f1446;
        if (enumC18123M42244 == enumC18123) {
            mo1684(this.f6375, this.f6364);
            if (this.f1442 == null) {
                this.f1442 = new C11233(this);
            }
            m48009(this.f1442.m28295("version ".concat(c22824.m51462())));
            m47989();
            m48006("{");
            if (z) {
                this.f6371.mo1688();
            }
            this.f1438 = true;
            this.f1442.mo1688();
            m48009("} // end of module " + this.f1442.m28296());
            if (this.f1442.m28294() != null) {
                m48009("@" + this.f1442.m28294());
            }
            m47989();
            mo1684(this.f6375, this.f6364);
            mo1684(this.f6373, this.f6368);
            if (!this.f1449.isEmpty()) {
                m48006(C3188.m10404("package ", this.f1449, " version ", c22824.m51462(), l.b));
            }
        } else {
            if (this.f67145) {
                InterfaceC18152 interfaceC18152M32307 = this.f6369.m32307();
                String strM5636 = this.f6371.m5636(this.f1437, "<invalid this_cpx #%d>");
                boolean zM39788 = EnumC16856.m39788(this.f6362);
                m48006("/**");
                if (interfaceC18152M32307 instanceof C24120) {
                    m48006(" *  Classfile " + this.f1459.toAbsolutePath());
                    dateFrom = new Date(this.f1459.toFile().lastModified());
                } else {
                    String string = this.f1459.toString();
                    m48006(" *  Classfile " + string.substring(string.lastIndexOf(47) + 1));
                    dateFrom = C21835.from(C7816.now().atStartOfDay(AbstractC22338.systemDefault()).toInstant());
                }
                DateFormat dateInstance = DateFormat.getDateInstance();
                int size = interfaceC18152M32307.getSize();
                String str3 = AbstractC20997.f67120;
                if (size > 0) {
                    m48014(C14442.m34865(" *  ", str3, "Last modified %s; size %d bytes"), dateInstance.format(dateFrom), Integer.valueOf(size));
                } else {
                    m48014(C14442.m34865(" *  ", str3, "Last modified %s"), dateInstance.format(dateFrom));
                }
                MessageDigest messageDigestMo30464 = interfaceC18152M32307.mo30464();
                if (messageDigestMo30464 != null && (bArrDigest = messageDigestMo30464.digest()) != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        sb.append(String.format("%02x", Byte.valueOf(bArrDigest[i2])));
                        i2++;
                        length = length;
                        bArrDigest = bArrDigest;
                    }
                    m48006(" *  " + str3 + messageDigestMo30464.getAlgorithm() + " checksum " + ((Object) sb));
                }
                if (zM39788) {
                    m48009(" *  " + EnumC16856.m39774(this.f6362 & (~EnumC16856.f54376.m39816()) & (~EnumC16856.f54387.m39816()), EnumC19840.CLASS) + "interface " + strM5636);
                } else {
                    m48009(" *  " + EnumC16856.m39774(this.f6362 & (~EnumC16856.f54387.m39816()), EnumC19840.CLASS) + "class " + strM5636);
                }
                C20930 c20930 = this.f6377;
                if (c20930 == null) {
                    if (!zM39788 && this.f1445 != 0) {
                        String strM5637 = this.f6371.m5636(this.f1437, "<invalid super_cpx #%d>");
                        if (!strM5637.equals("java.lang.Object")) {
                            m48009(" extends ".concat(strM5637));
                        }
                    }
                    for (int i3 = 0; i3 < this.f1439.length; i3++) {
                        m48009(i3 == 0 ? !zM39788 ? " implements " : " extends " : ",");
                        m48009(this.f6371.m5636(this.f1439[i3], "<invalid interface_cpx #%d>"));
                    }
                    m47989();
                } else {
                    AbstractC4280 abstractC4280M47840 = c20930.m47840();
                    String strM47841 = this.f6377.m47841();
                    if (abstractC4280M47840 instanceof C16212) {
                        m48009(strM47841);
                    } else if (!abstractC4280M47840.mo13643()) {
                        m48009(" extends " + strM47841);
                    }
                    m47989();
                }
                StringBuilder sbM51387 = C22783.m51387(" *  ", str3, "minor version: ");
                sbM51387.append(c22824.m51465());
                m48006(sbM51387.toString());
                m48006(" *  " + str3 + "major version: " + c22824.m51467());
                StringBuilder sb2 = new StringBuilder(" *  ");
                sb2.append(str3);
                sb2.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f6362), EnumC16856.m39803(this.f6362, EnumC19840.CLASS)));
                m48006(sb2.toString());
                StringBuilder sb3 = new StringBuilder(" *  ");
                sb3.append(str3);
                int i4 = 6;
                sb3.append("this_class:  " + this.f6371.m5625(this.f1437, new C6360(i4)));
                m48006(sb3.toString());
                StringBuilder sb4 = new StringBuilder(" *  ");
                sb4.append(str3);
                sb4.append("super_class: " + this.f6371.m5625(this.f1445, new C6360(i4)));
                m48006(sb4.toString());
                i = 1;
                m48014(C8947.m23910(new StringBuilder(" *  "), str3, "interfaces: %d, fields: %d, methods: %d, attributes: %d"), Integer.valueOf(this.f1439.length), Integer.valueOf(this.f1450.f53488.size()), Integer.valueOf(this.f1447.f53488.size()), Integer.valueOf(this.f1444));
                m48006(" */");
            } else {
                z = z;
                i = 1;
            }
            if (!this.f1449.isEmpty()) {
                Object[] objArr = new Object[i];
                objArr[0] = this.f1449;
                m48006(String.format("package %s;%n", objArr));
            }
            ArrayList arrayList = this.f6375;
            ArrayList arrayList2 = this.f6364;
            List[] listArr = new List[2];
            listArr[0] = arrayList;
            listArr[i] = arrayList2;
            mo1684(listArr);
            ArrayList arrayList3 = this.f6373;
            ArrayList arrayList4 = this.f6368;
            List[] listArr2 = new List[2];
            listArr2[0] = arrayList3;
            listArr2[i] = arrayList4;
            mo1684(listArr2);
            String strM5618 = this.f6371.m5638(this.f1437) ? C1606.m5618(C11109.m28061(this.f6371.m5633(this.f1437)), this.f1449) : "?? invalid index";
            C20930 c20931 = this.f6377;
            C18941 c18941M47837 = c20931 != null ? c20931.m47837(new Function() { // from class: l.ۘۚ᩺
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(this.f13498.f6371.m5638(((Integer) obj).intValue()));
                }
            }) : new C18941("", "");
            boolean zM39789 = EnumC16856.m39788(this.f6362);
            boolean z2 = this.f67146;
            boolean z3 = this.f67132;
            if (zM39789) {
                m48009(EnumC16856.m39774(this.f6362 & (~EnumC16856.f54376.m39816()), EnumC19840.CLASS));
                m48009(z3 ? z2 ? String.format("interface #%d%s", Integer.valueOf(this.f1437), c18941M47837.f61428) : String.format("interface #%d%s /* %s%s */", Integer.valueOf(this.f1437), c18941M47837.f61428, strM5618, c18941M47837.f61429) : C25272.m56409("interface ", strM5618));
            } else {
                m48009(EnumC16856.m39774(this.f6362, EnumC19840.CLASS) + m6505());
                m48009(z3 ? z2 ? String.format("class #%d%s", Integer.valueOf(this.f1437), c18941M47837.f61428) : String.format("class #%d%s /* %s%s */", Integer.valueOf(this.f1437), c18941M47837.f61428, strM5618, c18941M47837.f61429) : String.format("class %s%s", strM5618, c18941M47837.f61429));
                if (this.f1437 >= this.f6371.size() || this.f1437 <= 0) {
                    m48009(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f1445)) : String.format(" extends #%d /* ?? invalid index */", Integer.valueOf(this.f1445)) : " extends ??");
                } else if (!this.f6371.m5633(this.f1445).equals("java/lang/Object")) {
                    m48009(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f1445)) : String.format(" extends #%d /* %s */", Integer.valueOf(this.f1445), C1606.m5618(C11109.m28061(this.f6371.m5633(this.f1445)), this.f1449)) : C25272.m56409(" extends ", C1606.m5618(C11109.m28061(this.f6371.m5633(this.f1445)), this.f1449)));
                }
            }
            int[] iArr = this.f1439;
            int length2 = iArr.length;
            if (length2 > 0) {
                String str4 = (String) C13847.stream(iArr).mapToObj(new IntFunction() { // from class: l.ܰۚ᩺
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i5) {
                        C0224 c0224 = this.f45349;
                        C1606 c1606 = c0224.f6371;
                        return C1606.m5618(C11109.m28061(c1606.m5633(i5)), c0224.f1449);
                    }
                }).collect(C2025.joining(", "));
                if (z3) {
                    str2 = " ";
                    str = "super_class: ";
                    String str5 = (String) C13847.stream(this.f1439).mapToObj(new C21437(1)).collect(C2025.joining(", "));
                    if (z2) {
                        strM46451 = C20196.m46451(length2 > 1 ? "\n" + m47995() : str2, "implements ", str5);
                    } else {
                        strM46451 = (length2 > 1 ? "\n" + m47995() : str2) + "implements " + str5 + " /* " + str4 + " */";
                    }
                } else {
                    str = "super_class: ";
                    str2 = " ";
                    strM46451 = C20196.m46451(length2 > 1 ? "\n" + m47995() : str2, "implements ", str4);
                }
                m48009(strM46451);
            } else {
                str = "super_class: ";
                str2 = " ";
            }
            m48014("%sversion %s", length2 > 1 ? "\n" + m47995() : str2, c22824.m51462());
            m48006("{");
            C1606 c1606 = this.f6371;
            int i5 = c1606.f67148;
            if (z) {
                c1606.mo1688();
                this.f67148 = i5;
            }
            if (this.f67128 && !this.f67135) {
                if (!z3) {
                    int i6 = 6;
                    m48013("this_class:  " + this.f6371.m5625(this.f1437, new C6360(i6)) + l.b);
                    m48013(str + this.f6371.m5625(this.f1445, new C6360(i6)) + l.b);
                } else if (z2) {
                    m47998(String.format("this_class:  #%d;", Integer.valueOf(this.f1437)), Integer.valueOf(i5));
                    m47998(String.format("super_class: #%d;", Integer.valueOf(this.f1445)), Integer.valueOf(i5));
                } else {
                    int iM48002 = i5 - m48002();
                    m47997(m47996(iM48002, String.format("this_class:  #%d;", Integer.valueOf(this.f1437))));
                    m48006(" // " + this.f6371.m5625(this.f1437, new C6360(6)));
                    m47997(m47996(iM48002, String.format("super_class: #%d;", Integer.valueOf(this.f1445))));
                    m48006(" // " + this.f6371.m5625(this.f1445, new C6360(6)));
                }
                m47989();
            }
            this.f1438 = true;
            if (this.f67156 && (c24660 = this.f1443) != null && (strMo10080 = c24660.mo10080()) != null) {
                this.f1454 = new C15466(strMo10080, this.f1459.getParent());
            }
            List list = C13847.stream(new AbstractC20997[]{this.f6377, this.f1443, this.f1452, this.f1436, this.f1453, this.f1458, this.f1457, this.f1440, this.f1456, this.f1455, this.f1441}).filter(new C6191(this)).toList();
            int i7 = this.f67148;
            C16521 c16521 = this.f1450;
            if (c16521 != null && c16521.f53488.size() > 0) {
                c16521.f67148 = i7;
                c16521.mo1688();
                if (C13847.stream(new C16521[]{this.f1447}).anyMatch(new C24091(0)) && !list.isEmpty()) {
                    m47989();
                }
            }
            int iM48003 = i7 - m48002();
            this.f67148 = iM48003;
            C16521 c16522 = this.f1447;
            if (c16522 != null && c16522.f53488.size() > 0) {
                c16522.f67148 = iM48003;
                c16522.mo1688();
                if (!list.isEmpty()) {
                    m47989();
                }
            }
            int size2 = list.size();
            boolean z4 = false;
            for (int i8 = 0; i8 < size2; i8++) {
                InterfaceC16454 interfaceC16454 = (InterfaceC16454) list.get(i8);
                if (C13847.stream(new InterfaceC16454[]{interfaceC16454}).anyMatch(new C24091(0))) {
                    if (AbstractC20997.class.isAssignableFrom(interfaceC16454.getClass())) {
                        ((AbstractC20997) interfaceC16454).f67148 = iM48003;
                    }
                    interfaceC16454.mo1688();
                    z4 = true;
                }
                if (z4 && i8 + 1 < size2) {
                    m47989();
                    z4 = false;
                }
            }
            if (z2) {
                m48006(l.d);
            } else {
                m48006("} // end Class " + this.f1451);
            }
            this.f1448 = true;
        }
        List listM5643 = this.f6371.m5643();
        if (listM5643.isEmpty()) {
            return;
        }
        Iterator it = listM5643.iterator();
        while (it.hasNext()) {
            this.f6369.m32298((IOException) it.next());
        }
        throw new C24866();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1681(InterfaceC16454 interfaceC16454) {
        return C13847.stream(new InterfaceC16454[]{interfaceC16454}).anyMatch(new C24091(0));
    }
}
