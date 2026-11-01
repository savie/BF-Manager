package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9398 extends AbstractC6117 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f31835;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12925 f31836;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7156 f31837;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f31838;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14585 f31839;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18111 f31840;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f31841;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1739 f31842;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f31843;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6491 f31844;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C3564 f31845;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f31846;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8568 f31847;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7986 f31848;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20311 f31849;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1635 f31850;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C11762 f31851;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16701 f31852;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3564 f31853;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23509 f31854;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C4374 f31855;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24128(EnumC16783 enumC16783, long j) {
        if (m24130(enumC16783)) {
            this.f31840.m42172(j, "There may be at most one  \"{0}\" attribute in the attributes table of a \"{1}\" structure.", enumC16783.m39431(), this.f20885.name());
            throw null;
        }
    }

    public C9398(C18111 c18111, C20311 c20311) {
        super(new C12738(c18111), c18111, 0);
        this.f31838 = ".class";
        C1635 c1635 = new C1635();
        c1635.f6555 = new C13111(null, null);
        c1635.f6554 = new C13111(null, null);
        this.f31850 = c1635;
        this.f31841 = new ArrayList();
        this.f31835 = new ArrayList();
        this.f31853 = null;
        this.f31845 = null;
        this.f31847 = null;
        this.f20885 = EnumC12550.class_file;
        this.f31840 = c18111;
        this.f31854 = new C23509();
        this.f31849 = c20311;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24131() {
        if (this.f31845 != null) {
            EnumC13776[] enumC13776Arr = {EnumC13776.f45410, EnumC13776.f45418};
            C12738 c12738 = this.f20884;
            ArrayList arrayListM31666 = c12738.m31666(enumC13776Arr);
            Object[] objArr = {Integer.valueOf(arrayListM31666.size())};
            C18111 c18111 = this.f31840;
            c18111.m2146("relinkBSMs: %d items", objArr);
            Iterator it = arrayListM31666.iterator();
            while (it.hasNext()) {
                C2859 c2859 = (C2859) ((C15187) it.next()).f49578;
                C6574 c6574M8627 = c2859.m8627();
                boolean zM8624 = c2859.m8624();
                C15187 c15187 = (C15187) c2859.f69953;
                if (zM8624 & (c15187.f49578 == null)) {
                    c2859.f69953 = c12738.m31654(c15187.f43854);
                }
                if (c6574M8627 != null && c6574M8627.mo32563()) {
                    int i = c6574M8627.f43854;
                    if (i < 0 || i > this.f31845.size()) {
                        c18111.mo2157("Bad bootstrap method attribute index {0}", Integer.valueOf(i));
                        c6574M8627.f43854 = i;
                    } else {
                        c2859.m8625((C6574) this.f31845.get(i), i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24115(Collection collection, C6574 c6574) {
        if (collection.isEmpty()) {
            return -1;
        }
        C6574[] c6574Arr = (C6574[]) C9030.toArray(collection, new C7280());
        for (int i = 0; i < c6574Arr.length; i++) {
            if (c6574.m17814(c6574Arr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4374 m24120(long j) {
        if (m24130(EnumC16783.f53750)) {
            this.f31840.mo2164(j, "Record attribute repeated", new Object[0]);
        }
        C4374 c4374 = new C4374(this);
        this.f31855 = c4374;
        return c4374;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24118() {
        this.f31855 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22345 m24134(int i, C15187 c15187, C15187 c15188) {
        C22345 c22345;
        final C4270 c4270 = new C4270(c15187, c15188);
        Supplier supplier = new Supplier() { // from class: l.᩶ۛۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addFieldIfAbsent]:  #");
                C4270 c4271 = c4270;
                sb.append(((C15187) ((C13111) c4271.f69953).f43679).f43854);
                sb.append(":#");
                sb.append(((C15187) ((C13111) c4271.f69953).f43680).f43854);
                return sb.toString();
            }
        };
        C18111 c18111 = this.f31840;
        c18111.m2152(supplier);
        Iterator it = this.f31841.iterator();
        do {
            if (!it.hasNext()) {
                c22345 = null;
                break;
            }
            c22345 = (C22345) it.next();
        } while (!c22345.m49551().equals(c4270));
        if (c22345 != null) {
            return c22345;
        }
        c18111.m2146(" [ClassData.addFieldIfAbsent]:  new field.", new Object[0]);
        return m24122(i, c4270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22345 m24122(int i, final C4270 c4270) {
        this.f31840.m2152(new Supplier() { // from class: l.۫ۛۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addField]:  #");
                C4270 c4271 = c4270;
                sb.append(((C15187) ((C13111) c4271.f69953).f43679).f43854);
                sb.append(":#");
                sb.append(((C15187) ((C13111) c4271.f69953).f43680).f43854);
                return sb.toString();
            }
        });
        C22345 c22345 = new C22345(this, i, c4270);
        this.f31841.add(c22345);
        return c22345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14585 m24121(int i, final C15187 c15187, final C15187 c15188) {
        this.f31839 = null;
        this.f31840.m2152(new Supplier() { // from class: l.ۡۛۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return " [ClassData.StartMethod]:  #" + c15187.f43854 + ":#" + c15188.f43854;
            }
        });
        C14585 c14585 = new C14585(this.f20884, (C18111) m17095(), i);
        c14585.f47731 = null;
        c14585.f47726 = null;
        c14585.f47728 = null;
        c14585.f47727 = null;
        c14585.f47730 = null;
        c14585.f47729 = this;
        c14585.f20885 = EnumC12550.method_info;
        c14585.f47732 = c15187;
        c14585.f47725 = c15188;
        if (EnumC23839.m52521(i)) {
            c14585.m17091();
        }
        this.f31839 = c14585;
        this.f31835.add(c14585);
        return this.f31839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24123(int i, final C15187 c15187, final C15187 c15188, final C15187 c15189) {
        this.f31840.m2152(new Supplier() { // from class: l.ܽۛۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addInnerClass (with indexes: Name (" + c15187.toString() + "), Inner (" + c15188.toString() + "), Outer (" + c15189.toString() + ").";
            }
        });
        if (this.f31853 == null) {
            this.f31853 = new C3564(this.f20884, EnumC16783.f53720);
        }
        C3564 c3564 = this.f31853;
        C3999 c3999 = new C3999();
        c3999.f14839 = i;
        c3999.f14838 = c15187;
        c3999.f14841 = c15188;
        c3999.f14840 = c15189;
        c3564.m10556(c3999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24124(final C6574 c6574) {
        if (this.f31845 == null) {
            this.f31845 = new C3564(this.f20884, EnumC16783.f53724);
        }
        this.f31845.m10556(c6574);
        this.f31840.m2152(new Supplier() { // from class: l.֡ۛۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addBootstrapMethod: ".concat(c6574.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24136(C15187 c15187) {
        this.f31840.m2146("addNestHost", new Object[0]);
        this.f31848 = new C7986(this.f20884, EnumC16783.f53726, c15187);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24133(ArrayList arrayList) {
        this.f31840.m2146("addNestMembers", new Object[0]);
        this.f31837 = new C7156(this.f20884, EnumC16783.f53752, arrayList);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24119(ArrayList arrayList) {
        this.f31840.m2146("addPermittedSubclasses", new Object[0]);
        this.f31842 = new C1739(this.f20884, EnumC16783.f53740, arrayList);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24135(ArrayList arrayList) {
        this.f31840.m2146("addLoadableDescriptors", new Object[0]);
        this.f31852 = new C16701(this.f20884, EnumC16783.f53738, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24127(C15187 c15187, C15187 c15188) {
        this.f31840.m2146("addEnclosingMethod", new Object[0]);
        this.f31851 = new C11762(this.f20884, c15187, c15188);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24132() {
        C1635 c1635 = this.f31850;
        C15187 c15187M5532 = c1635.m5532();
        C13111 c13111 = c1635.f6555;
        C13111 c13112 = c1635.f6554;
        C12738 c12738 = this.f20884;
        if (c15187M5532 == null) {
            c12738.getClass();
            C15187 c15187M31658 = c12738.m31658((AbstractC21536) new C5682(EnumC13776.f45400, c12738.m31655("java/lang/Object")));
            if (c13112.f43680 != null) {
                c13112.f43680 = c15187M31658;
            } else {
                c13111.f43680 = c15187M31658;
            }
        }
        c12738.m31673();
        Object obj = c13111.f43679;
        if (obj != null) {
            c13111.f43679 = c12738.m31664((C15187) obj);
        }
        Object obj2 = c13111.f43680;
        if (obj2 != null) {
            c13111.f43680 = c12738.m31664((C15187) obj2);
        }
        Object obj3 = c13112.f43679;
        if (obj3 != null) {
            c13112.f43679 = c12738.m31664((C15187) obj3);
        }
        Object obj4 = c13112.f43680;
        if (obj4 != null) {
            c13112.f43680 = c12738.m31664((C15187) obj4);
        }
        c1635.m5529(c12738);
        c12738.m31669();
        c12738.m31665();
        C3564 c3564 = new C3564(c12738, EnumC16783.f53753);
        c3564.m10557(C9030.stream(this.f31841).map(new C20686()));
        int i = 1;
        m24116(c3564, this.f20892, this.f20890);
        C3564 c3565 = this.f31845;
        C18111 c18111 = this.f31840;
        if (c3565 != null) {
            List list = C9030.stream(c12738.m31652(EnumC13776.f45418, EnumC13776.f45410)).map(new C22014(i)).toList();
            if (C9030.stream(list).anyMatch(new C17158())) {
                c18111.m2146("numberBSM: %d items", Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    C6574 c6574 = (C6574) list.get(i3);
                    int iM24115 = m24115(arrayList, c6574);
                    if (iM24115 != -1) {
                        c6574.f43854 = iM24115;
                    } else {
                        if (m24115(this.f31845, c6574) == -1) {
                            c18111.mo2157("Invoke dynamic \"{0}\" has undefined method attribute index", c6574.toString());
                        } else {
                            c6574.f43854 = i2;
                            i2++;
                        }
                        arrayList.add(c6574);
                    }
                }
                this.f31845.m10555(arrayList);
            }
        }
        try {
            this.f31843 = c1635.m5528();
            if (c18111.m2158()) {
                c18111.m2146("ClassFileName = " + this.f31843, new Object[0]);
                c18111.m2146("this_class    = " + c1635.m5531(), new Object[0]);
                c18111.m2146("super_class   = " + c1635.m5532(), new Object[0]);
                c18111.m2146("-- Constant Pool ---", new Object[0]);
                c18111.m2146("--------------------", new Object[0]);
                c12738.m31649();
                c18111.m2146("--------------------", new Object[0]);
                c18111.m2146("-- Inner Classes ---", new Object[0]);
                c18111.m2146("--------------------", new Object[0]);
                m24117();
                c18111.m2146("--------------------", new Object[0]);
            }
        } catch (Throwable th) {
            c18111.m2152(new Supplier() { // from class: l.ܺۛۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "check name:" + th;
                }
            });
            c18111.mo2150("Class name isn't defined", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24125(C8568 c8568) {
        c8568.m22346();
        this.f31847 = c8568;
        this.f31843 = "module-info";
        C12738 c12738 = this.f20884;
        c12738.getClass();
        C15187 c15187M31658 = c12738.m31658((AbstractC21536) new C5682(EnumC13776.f45400, c12738.m31655("module-info")));
        C1635 c1635 = this.f31850;
        c1635.m5530(c15187M31658);
        c12738.m31673();
        c1635.m5530(c12738.m31664(c1635.m5531()));
        c12738.m31669();
        m24116((C12925[]) new C3564[]{this.f20892, this.f20890});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24116(C12925... c12925Arr) {
        for (C12925 c12925 : c12925Arr) {
            if (c12925 != null) {
                if (c12925 instanceof C3564) {
                    C9030.stream(((C3564) c12925).getElements()).map(new C5869()).forEach(new Consumer() { // from class: l.ۤۛۡ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            ((InterfaceC6387) obj).mo15810(this.f34492.f20884);
                        }
                    });
                } else {
                    c12925.mo15810(this.f20884);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m24117() {
        C3564<C3999> c3564 = this.f31853;
        C18111 c18111 = this.f31840;
        if (c3564 != null) {
            int i = 1;
            for (C3999 c3999 : c3564) {
                StringBuilder sb = new StringBuilder(" InnerClass[");
                sb.append(i);
                sb.append("]: (");
                sb.append(EnumC23839.m52538(c3999.f14839, EnumC0554.INNER_CLASS));
                sb.append("), ");
                c18111.m2160(sb.toString(), new Object[0]);
                c18111.m2160("Name:  " + c3999.f14838.toString() + " ", new Object[0]);
                c18111.m2160("InnerClass_info:  " + c3999.f14841.toString() + " ", new Object[0]);
                c18111.m2146("OuterClass_info:  " + c3999.f14840.toString() + " ", new Object[0]);
                i++;
            }
            return;
        }
        c18111.m2146("<< NO INNER CLASSES >>", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24129(InterfaceC19275 interfaceC19275) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        C24027 c24027;
        C23509 c23509;
        C23509 c235010 = (C23509) interfaceC19275;
        c235010.m51771(-889275714);
        C20311 c20311 = this.f31849;
        c235010.m51770(c20311.m45848());
        c235010.m51770(c20311.m45841());
        this.f20884.m31661(c235010);
        c235010.m51770(this.f20887);
        C1635 c1635 = this.f31850;
        c235010.m51770(c1635.m5531().f43854);
        c235010.m51770(c1635.m5532().f43854);
        ArrayList arrayList = this.f31846;
        if (arrayList != null) {
            c235010.m51770(arrayList.size());
            Iterator it = this.f31846.iterator();
            while (it.hasNext()) {
                c235010.m51770(((C13173) it.next()).f43854);
            }
        } else {
            c235010.m51770(0);
        }
        ArrayList arrayList2 = this.f31841;
        if (arrayList2 != null) {
            c235010.m51770(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C22345) it2.next()).m49552(c235010);
            }
        } else {
            c235010.m51770(0);
        }
        ArrayList<C14585> arrayList3 = this.f31835;
        if (arrayList3 != null) {
            c235010.m51770(arrayList3.size());
            for (C14585 c14585 : arrayList3) {
                c235010.m51770(c14585.f20887);
                c235010.m51770(c14585.f47732.f43854);
                c235010.m51770(c14585.f47725.f43854);
                C24027 c24027M17090 = c14585.m17090(c14585.f47731, c14585.f20886, c14585.f20888, c14585.f20891, c14585.f47726, c14585.f47733, c14585.f47730);
                C11057 c11057 = c14585.f47728;
                if (c11057 != null) {
                    c24027M17090.m52871(c11057);
                }
                C11057 c11058 = c14585.f47727;
                if (c11058 != null) {
                    c24027M17090.m52871(c11058);
                }
                c24027M17090.m52872(c235010);
            }
            c = 6;
            c2 = 5;
            c3 = 4;
            c4 = 2;
        } else {
            c = 6;
            c2 = 5;
            c3 = 4;
            c4 = 2;
            c235010.m51770(0);
        }
        C8568 c8568 = this.f31847;
        if (c8568 != null) {
            C3564 c3564 = this.f20890;
            C3564 c3565 = this.f20892;
            C12925[] c12925Arr = new C12925[3];
            c12925Arr[0] = c3564;
            c12925Arr[1] = c3565;
            c12925Arr[c4] = c8568;
            c24027 = new C24027();
            for (int i = 0; i < 3; i++) {
                C12925 c12925 = c12925Arr[i];
                if (c12925 != null) {
                    c24027.m52871(c12925);
                }
            }
            c23509 = c235010;
        } else {
            C12925 c12926 = this.f31836;
            C6491 c6491 = this.f31844;
            C4374 c4374 = this.f31855;
            C3564 c3566 = this.f31853;
            C12925 c12927 = this.f20886;
            C12925 c12928 = this.f20888;
            C7986 c7986 = this.f20891;
            C3564 c3567 = this.f20890;
            C3564 c3568 = this.f20892;
            C3564 c3569 = this.f20894;
            C3564 c35610 = this.f20889;
            C3564 c35611 = this.f31845;
            C7986 c7987 = this.f31848;
            C7156 c7156 = this.f31837;
            C1739 c1739 = this.f31842;
            C11762 c11762 = this.f31851;
            C16701 c16701 = this.f31852;
            C12925[] c12925Arr2 = new C12925[17];
            c12925Arr2[0] = c12926;
            c12925Arr2[1] = c6491;
            c12925Arr2[c4] = c4374;
            c12925Arr2[3] = c3566;
            c12925Arr2[c3] = c12927;
            c12925Arr2[c2] = c12928;
            c12925Arr2[c] = c7986;
            c12925Arr2[7] = c3567;
            c12925Arr2[8] = c3568;
            c12925Arr2[9] = c3569;
            c12925Arr2[10] = c35610;
            c12925Arr2[11] = c35611;
            c12925Arr2[12] = c7987;
            c12925Arr2[13] = c7156;
            c12925Arr2[14] = c1739;
            c12925Arr2[15] = c11762;
            c12925Arr2[16] = c16701;
            c24027 = new C24027();
            for (int i2 = 0; i2 < 17; i2++) {
                C12925 c12929 = c12925Arr2[i2];
                if (c12929 != null) {
                    c24027.m52871(c12929);
                }
            }
            c23509 = c235010;
        }
        c24027.m52872(c23509);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24126(InterfaceC10434 interfaceC10434) throws IOException {
        C23509 c23509 = this.f31854;
        try {
            DataOutputStream dataOutputStreamMo18523 = interfaceC10434.mo18523();
            try {
                c23509.m51768(dataOutputStreamMo18523);
                m24129(c23509);
                if (dataOutputStreamMo18523 != null) {
                    dataOutputStreamMo18523.close();
                }
            } catch (Throwable th) {
                if (dataOutputStreamMo18523 != null) {
                    try {
                        dataOutputStreamMo18523.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            boolean z = interfaceC10434 instanceof AbstractC18194;
            C18111 c18111 = this.f31840;
            if (z) {
                c18111.mo2150("Cannot write to {0}", ((AbstractC18194) interfaceC10434).mo18528());
            } else {
                c18111.mo2150("Cannot write to {0}", "output stream");
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24130(EnumC16783 enumC16783) {
        switch (C10809.f36823[enumC16783.ordinal()]) {
            case 1:
                return this.f20891 != null;
            case 2:
                return this.f31836 != null;
            case 3:
                return this.f31844 != null;
            case 4:
                return this.f31848 != null;
            case 5:
                C7156 c7156 = this.f31837;
                return (c7156 == null || c7156.f8275.size() == 0) ? false : true;
            case 6:
                C1739 c1739 = this.f31842;
                return (c1739 == null || c1739.f8275.size() == 0) ? false : true;
            case 7:
                C16701 c16701 = this.f31852;
                return (c16701 == null || c16701.f8275.size() == 0) ? false : true;
            case 8:
                return this.f31855 != null;
            case 9:
                return this.f31851 != null;
            default:
                throw new IllegalStateException(C7997.m21055("Unexpected attribute: ", enumC16783.m39431(), " in ", this.f20885.name()));
        }
    }
}
