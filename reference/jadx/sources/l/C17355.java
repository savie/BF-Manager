package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17355 extends AbstractC5948 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7439 f56470;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23628 f56471;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10201 f56472;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C25340 f56473;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23497 f56474;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayList f56475;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f56476;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14618 f56477;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12439 f56478;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5114 f56479;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1122 f56480;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f56481;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22824 f56482;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23497 f56483;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11388 f56484;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f56485;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1195 f56486;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C12308 f56487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20118 f56488;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16609 f56489;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f56490;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40765(EnumC13127 enumC13127, long j) {
        if (m40768(enumC13127)) {
            this.f56480.m4162(j, "There may be at most one  \"{0}\" attribute in the attributes table of a \"{1}\" structure.", enumC13127.m32610(), this.f20380.name());
            throw null;
        }
    }

    public C17355(C1122 c1122, C22824 c22824) {
        super(new C15291(c1122), c1122, 0);
        this.f56490 = ".class";
        C16609 c16609 = new C16609();
        c16609.f53716 = new C18941(null, null);
        c16609.f53715 = new C18941(null, null);
        this.f56489 = c16609;
        this.f56475 = new ArrayList();
        this.f56485 = new ArrayList();
        this.f56474 = null;
        this.f56483 = null;
        this.f56470 = null;
        this.f20380 = EnumC5670.class_file;
        this.f56480 = c1122;
        this.f56484 = new C11388();
        this.f56482 = c22824;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40771() {
        if (this.f56483 != null) {
            EnumC3185[] enumC3185Arr = {EnumC3185.f10339, EnumC3185.f10342};
            C15291 c15291 = this.f20376;
            ArrayList arrayListM36718 = c15291.m36718(enumC3185Arr);
            Object[] objArr = {Integer.valueOf(arrayListM36718.size())};
            C1122 c1122 = this.f56480;
            c1122.m32315("relinkBSMs: %d items", objArr);
            Iterator it = arrayListM36718.iterator();
            while (it.hasNext()) {
                C12637 c12637 = (C12637) ((C7660) it.next()).f25232;
                C21332 c21332M31417 = c12637.m31417();
                boolean zM31418 = c12637.m31418();
                C7660 c7660 = (C7660) c12637.f61224;
                if (zM31418 & (c7660.f25232 == null)) {
                    c12637.f61224 = c15291.m36703(c7660.f67820);
                }
                if (c21332M31417 != null && c21332M31417.mo20871()) {
                    int i = c21332M31417.f67820;
                    if (i < 0 || i > this.f56483.size()) {
                        c1122.mo4165("Bad bootstrap method attribute index {0}", Integer.valueOf(i));
                        c21332M31417.f67820 = i;
                    } else {
                        c12637.m31416((C21332) this.f56483.get(i), i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40755(Collection collection, C21332 c21332) {
        if (collection.isEmpty()) {
            return -1;
        }
        C21332[] c21332Arr = (C21332[]) C1170.toArray(collection, new C7161());
        for (int i = 0; i < c21332Arr.length; i++) {
            if (c21332.m48559(c21332Arr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12439 m40759(long j) {
        if (m40768(EnumC13127.f41966)) {
            this.f56480.mo4166(j, "Record attribute repeated", new Object[0]);
        }
        C12439 c12439 = new C12439(this);
        this.f56478 = c12439;
        return c12439;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40775() {
        this.f56478 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4105 m40772(int i, C7660 c7660, C7660 c7661) {
        C4105 c4105;
        final C21588 c21588 = new C21588(c7660, c7661);
        Supplier supplier = new Supplier() { // from class: l.᩷ۙ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addFieldIfAbsent]:  #");
                C21588 c21589 = c21588;
                sb.append(((C7660) ((C18941) c21589.f61224).f61428).f67820);
                sb.append(":#");
                sb.append(((C7660) ((C18941) c21589.f61224).f61429).f67820);
                return sb.toString();
            }
        };
        C1122 c1122 = this.f56480;
        c1122.m32299(supplier);
        Iterator it = this.f56475.iterator();
        do {
            if (!it.hasNext()) {
                c4105 = null;
                break;
            }
            c4105 = (C4105) it.next();
        } while (!c4105.m13203().equals(c21588));
        if (c4105 != null) {
            return c4105;
        }
        c1122.m32315(" [ClassData.addFieldIfAbsent]:  new field.", new Object[0]);
        return m40758(i, c21588);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4105 m40758(int i, final C21588 c21588) {
        this.f56480.m32299(new Supplier() { // from class: l.ᩴۙ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addField]:  #");
                C21588 c21589 = c21588;
                sb.append(((C7660) ((C18941) c21589.f61224).f61428).f67820);
                sb.append(":#");
                sb.append(((C7660) ((C18941) c21589.f61224).f61429).f67820);
                return sb.toString();
            }
        });
        C4105 c4105 = new C4105(this, i, c21588);
        this.f56475.add(c4105);
        return c4105;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25340 m40760(int i, final C7660 c7660, final C7660 c7661) {
        this.f56473 = null;
        this.f56480.m32299(new Supplier() { // from class: l.ۖ۬ۛ
            @Override // java.util.function.Supplier
            public final Object get() {
                return " [ClassData.StartMethod]:  #" + c7660.f67820 + ":#" + c7661.f67820;
            }
        });
        C25340 c25340 = new C25340(this.f20376, (C1122) m17326(), i);
        c25340.f81816 = null;
        c25340.f81809 = null;
        c25340.f81810 = null;
        c25340.f81811 = null;
        c25340.f81812 = null;
        c25340.f81813 = this;
        c25340.f20380 = EnumC5670.method_info;
        c25340.f81815 = c7660;
        c25340.f81817 = c7661;
        if (EnumC16856.m39778(i)) {
            c25340.m17322();
        }
        this.f56473 = c25340;
        this.f56485.add(c25340);
        return this.f56473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40761(int i, final C7660 c7660, final C7660 c7661, final C7660 c7662) {
        this.f56480.m32299(new Supplier() { // from class: l.᩸ۙ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addInnerClass (with indexes: Name (" + c7660.toString() + "), Inner (" + c7661.toString() + "), Outer (" + c7662.toString() + ").";
            }
        });
        if (this.f56474 == null) {
            this.f56474 = new C23497(this.f20376, EnumC13127.f41961);
        }
        C23497 c23497 = this.f56474;
        C18275 c18275 = new C18275();
        c18275.f59621 = i;
        c18275.f59622 = c7660;
        c18275.f59623 = c7661;
        c18275.f59620 = c7662;
        c23497.m52689(c18275);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40767(final C21332 c21332) {
        if (this.f56483 == null) {
            this.f56483 = new C23497(this.f20376, EnumC13127.f41955);
        }
        this.f56483.m52689(c21332);
        this.f56480.m32299(new Supplier() { // from class: l.ۤۙ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addBootstrapMethod: ".concat(c21332.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40774(C7660 c7660) {
        this.f56480.m32315("addNestHost", new Object[0]);
        this.f56486 = new C1195(this.f20376, EnumC13127.f41958, c7660);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40770(ArrayList arrayList) {
        this.f56480.m32315("addNestMembers", new Object[0]);
        this.f56479 = new C5114(this.f20376, EnumC13127.f41977, arrayList);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40776(ArrayList arrayList) {
        this.f56480.m32315("addPermittedSubclasses", new Object[0]);
        this.f56471 = new C23628(this.f20376, EnumC13127.f41965, arrayList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40773(ArrayList arrayList) {
        this.f56480.m32315("addLoadableDescriptors", new Object[0]);
        this.f56488 = new C20118(this.f20376, EnumC13127.f41973, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40763(C7660 c7660, C7660 c7661) {
        this.f56480.m32315("addEnclosingMethod", new Object[0]);
        this.f56487 = new C12308(this.f20376, c7660, c7661);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40769() {
        C16609 c16609 = this.f56489;
        C7660 c7660M39298 = c16609.m39298();
        C18941 c18941 = c16609.f53716;
        C18941 c18942 = c16609.f53715;
        C15291 c15291 = this.f20376;
        if (c7660M39298 == null) {
            c15291.getClass();
            C7660 c7660M36707 = c15291.m36707((AbstractC18847) new C6672(EnumC3185.f10346, c15291.m36704("java/lang/Object")));
            if (c18942.f61429 != null) {
                c18942.f61429 = c7660M36707;
            } else {
                c18941.f61429 = c7660M36707;
            }
        }
        c15291.m36716();
        Object obj = c18941.f61428;
        if (obj != null) {
            c18941.f61428 = c15291.m36713((C7660) obj);
        }
        Object obj2 = c18941.f61429;
        if (obj2 != null) {
            c18941.f61429 = c15291.m36713((C7660) obj2);
        }
        Object obj3 = c18942.f61428;
        if (obj3 != null) {
            c18942.f61428 = c15291.m36713((C7660) obj3);
        }
        Object obj4 = c18942.f61429;
        if (obj4 != null) {
            c18942.f61429 = c15291.m36713((C7660) obj4);
        }
        c16609.m39296(c15291);
        c15291.m36721();
        c15291.m36714();
        C23497 c23497 = new C23497(c15291, EnumC13127.f41953);
        c23497.m52690(C1170.stream(this.f56475).map(new C13872()));
        m40756(c23497, this.f20379, this.f20374);
        C23497 c23498 = this.f56483;
        C1122 c1122 = this.f56480;
        if (c23498 != null) {
            List list = C1170.stream(c15291.m36702(EnumC3185.f10342, EnumC3185.f10339)).map(new C15117()).toList();
            if (C1170.stream(list).anyMatch(new C12880())) {
                c1122.m32315("numberBSM: %d items", Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C21332 c21332 = (C21332) list.get(i2);
                    int iM40755 = m40755(arrayList, c21332);
                    if (iM40755 != -1) {
                        c21332.f67820 = iM40755;
                    } else {
                        if (m40755(this.f56483, c21332) == -1) {
                            c1122.mo4165("Invoke dynamic \"{0}\" has undefined method attribute index", c21332.toString());
                        } else {
                            c21332.f67820 = i;
                            i++;
                        }
                        arrayList.add(c21332);
                    }
                }
                this.f56483.m52688(arrayList);
            }
        }
        try {
            this.f56476 = c16609.m39294();
            if (c1122.m32305()) {
                c1122.m32315("ClassFileName = " + this.f56476, new Object[0]);
                c1122.m32315("this_class    = " + c16609.m39297(), new Object[0]);
                c1122.m32315("super_class   = " + c16609.m39298(), new Object[0]);
                c1122.m32315("-- Constant Pool ---", new Object[0]);
                c1122.m32315("--------------------", new Object[0]);
                c15291.m36715();
                c1122.m32315("--------------------", new Object[0]);
                c1122.m32315("-- Inner Classes ---", new Object[0]);
                c1122.m32315("--------------------", new Object[0]);
                m40757();
                c1122.m32315("--------------------", new Object[0]);
            }
        } catch (Throwable th) {
            c1122.m32299(new Supplier() { // from class: l.ۙۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "check name:" + th;
                }
            });
            c1122.mo4160("Class name isn't defined", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40762(C7439 c7439) {
        c7439.m20391();
        this.f56470 = c7439;
        this.f56476 = "module-info";
        C15291 c15291 = this.f20376;
        c15291.getClass();
        C7660 c7660M36707 = c15291.m36707((AbstractC18847) new C6672(EnumC3185.f10346, c15291.m36704("module-info")));
        C16609 c16609 = this.f56489;
        c16609.m39295(c7660M36707);
        c15291.m36716();
        c16609.m39295(c15291.m36713(c16609.m39297()));
        c15291.m36721();
        m40756((C14618[]) new C23497[]{this.f20379, this.f20374});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40756(C14618... c14618Arr) {
        for (C14618 c14618 : c14618Arr) {
            if (c14618 != null) {
                if (c14618 instanceof C23497) {
                    C1170.stream(((C23497) c14618).getElements()).map(new C5423()).forEach(new Consumer() { // from class: l.۠۬ۛ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            ((InterfaceC5597) obj).mo7367(this.f28250.f20376);
                        }
                    });
                } else {
                    c14618.mo7367(this.f20376);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m40757() {
        C23497<C18275> c23497 = this.f56474;
        C1122 c1122 = this.f56480;
        if (c23497 != null) {
            int i = 1;
            for (C18275 c18275 : c23497) {
                StringBuilder sb = new StringBuilder(" InnerClass[");
                sb.append(i);
                sb.append("]: (");
                sb.append(EnumC16856.m39803(c18275.f59621, EnumC19840.INNER_CLASS));
                sb.append("), ");
                c1122.m32304(sb.toString(), new Object[0]);
                c1122.m32304("Name:  " + c18275.f59622.toString() + " ", new Object[0]);
                c1122.m32304("InnerClass_info:  " + c18275.f59623.toString() + " ", new Object[0]);
                c1122.m32315("OuterClass_info:  " + c18275.f59620.toString() + " ", new Object[0]);
                i++;
            }
            return;
        }
        c1122.m32315("<< NO INNER CLASSES >>", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40764(InterfaceC9397 interfaceC9397) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        C11562 c11562;
        C11388 c11388;
        C11388 c11389 = (C11388) interfaceC9397;
        c11389.m28741(-889275714);
        C22824 c22824 = this.f56482;
        c11389.m28740(c22824.m51465());
        c11389.m28740(c22824.m51467());
        this.f20376.m36712(c11389);
        c11389.m28740(this.f20372);
        C16609 c16609 = this.f56489;
        c11389.m28740(c16609.m39297().f67820);
        c11389.m28740(c16609.m39298().f67820);
        ArrayList arrayList = this.f56481;
        if (arrayList != null) {
            c11389.m28740(arrayList.size());
            Iterator it = this.f56481.iterator();
            while (it.hasNext()) {
                c11389.m28740(((C21259) it.next()).f67820);
            }
        } else {
            c11389.m28740(0);
        }
        ArrayList arrayList2 = this.f56475;
        if (arrayList2 != null) {
            c11389.m28740(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C4105) it2.next()).m13200(c11389);
            }
        } else {
            c11389.m28740(0);
        }
        ArrayList<C25340> arrayList3 = this.f56485;
        if (arrayList3 != null) {
            c11389.m28740(arrayList3.size());
            for (C25340 c25340 : arrayList3) {
                c11389.m28740(c25340.f20372);
                c11389.m28740(c25340.f81815.f67820);
                c11389.m28740(c25340.f81817.f67820);
                C11562 c11562M17321 = c25340.m17321(c25340.f81816, c25340.f20371, c25340.f20378, c25340.f20373, c25340.f81809, c25340.f81814, c25340.f81812);
                C2219 c2219 = c25340.f81810;
                if (c2219 != null) {
                    c11562M17321.m29081(c2219);
                }
                C2219 c22110 = c25340.f81811;
                if (c22110 != null) {
                    c11562M17321.m29081(c22110);
                }
                c11562M17321.m29082(c11389);
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
            c11389.m28740(0);
        }
        C7439 c7439 = this.f56470;
        if (c7439 != null) {
            C23497 c23497 = this.f20374;
            C23497 c23498 = this.f20379;
            C14618[] c14618Arr = new C14618[3];
            c14618Arr[0] = c23497;
            c14618Arr[1] = c23498;
            c14618Arr[c4] = c7439;
            c11562 = new C11562();
            for (int i = 0; i < 3; i++) {
                C14618 c14618 = c14618Arr[i];
                if (c14618 != null) {
                    c11562.m29081(c14618);
                }
            }
            c11388 = c11389;
        } else {
            C14618 c14619 = this.f56477;
            C10201 c10201 = this.f56472;
            C12439 c12439 = this.f56478;
            C23497 c23499 = this.f56474;
            C14618 c146110 = this.f20371;
            C14618 c146111 = this.f20378;
            C1195 c1195 = this.f20373;
            C23497 c234910 = this.f20374;
            C23497 c234911 = this.f20379;
            C23497 c234912 = this.f20381;
            C23497 c234913 = this.f20375;
            C23497 c234914 = this.f56483;
            C1195 c1196 = this.f56486;
            C5114 c5114 = this.f56479;
            C23628 c23628 = this.f56471;
            C12308 c12308 = this.f56487;
            C20118 c20118 = this.f56488;
            C14618[] c14618Arr2 = new C14618[17];
            c14618Arr2[0] = c14619;
            c14618Arr2[1] = c10201;
            c14618Arr2[c4] = c12439;
            c14618Arr2[3] = c23499;
            c14618Arr2[c3] = c146110;
            c14618Arr2[c2] = c146111;
            c14618Arr2[c] = c1195;
            c14618Arr2[7] = c234910;
            c14618Arr2[8] = c234911;
            c14618Arr2[9] = c234912;
            c14618Arr2[10] = c234913;
            c14618Arr2[11] = c234914;
            c14618Arr2[12] = c1196;
            c14618Arr2[13] = c5114;
            c14618Arr2[14] = c23628;
            c14618Arr2[15] = c12308;
            c14618Arr2[16] = c20118;
            c11562 = new C11562();
            for (int i2 = 0; i2 < 17; i2++) {
                C14618 c146112 = c14618Arr2[i2];
                if (c146112 != null) {
                    c11562.m29081(c146112);
                }
            }
            c11388 = c11389;
        }
        c11562.m29082(c11388);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40766(InterfaceC13676 interfaceC13676) throws IOException {
        C11388 c11388 = this.f56484;
        try {
            DataOutputStream dataOutputStreamMo3876 = interfaceC13676.mo3876();
            try {
                c11388.m28738(dataOutputStreamMo3876);
                m40764(c11388);
                if (dataOutputStreamMo3876 != null) {
                    dataOutputStreamMo3876.close();
                }
            } catch (Throwable th) {
                if (dataOutputStreamMo3876 != null) {
                    try {
                        dataOutputStreamMo3876.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            boolean z = interfaceC13676 instanceof AbstractC9201;
            C1122 c1122 = this.f56480;
            if (z) {
                c1122.mo4160("Cannot write to {0}", ((AbstractC9201) interfaceC13676).mo3882());
            } else {
                c1122.mo4160("Cannot write to {0}", "output stream");
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40768(EnumC13127 enumC13127) {
        switch (C1694.f5809[enumC13127.ordinal()]) {
            case 1:
                return this.f20373 != null;
            case 2:
                return this.f56477 != null;
            case 3:
                return this.f56472 != null;
            case 4:
                return this.f56486 != null;
            case 5:
                C5114 c5114 = this.f56479;
                return (c5114 == null || c5114.f21636.size() == 0) ? false : true;
            case 6:
                C23628 c23628 = this.f56471;
                return (c23628 == null || c23628.f21636.size() == 0) ? false : true;
            case 7:
                C20118 c20118 = this.f56488;
                return (c20118 == null || c20118.f21636.size() == 0) ? false : true;
            case 8:
                return this.f56478 != null;
            case 9:
                return this.f56487 != null;
            default:
                throw new IllegalStateException(ExternalValue$$ExternalSyntheticOutline0.m("Unexpected attribute: ", enumC13127.m32610(), " in ", this.f20380.name()));
        }
    }
}
