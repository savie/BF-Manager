package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12738 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18111 f42485;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18569 f42486;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f42488;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18569 f42489;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20499 f42491 = new C20499("");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15187 f42487 = new C15187(-1, null);

    public C12738(C18111 c18111) {
        C15187 c15187 = new C15187(-1, new C0742(EnumC13776.f45436, null));
        ArrayList arrayList = new ArrayList(40);
        this.f42490 = arrayList;
        this.f42488 = new LinkedHashMap(40);
        this.f42489 = new C4976(this);
        this.f42486 = new C14150(this);
        this.f42485 = c18111;
        arrayList.add(c15187);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f42490.iterator();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31670(final C5682 c5682) {
        final C15187 c15187 = (C15187) c5682.f69953;
        if (m31646(c15187)) {
            this.f42485.m2152(new Supplier() { // from class: l.ᩴۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED ConstPool[");
                    sb.append(c15187.f43854);
                    sb.append("](");
                    C5682 c5683 = c5682;
                    sb.append(c5683.f69952.toString());
                    sb.append(") = ");
                    sb.append(c5683.f69953);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31672(final C21204 c21204) {
        final C13111 c13111 = (C13111) c21204.f69953;
        boolean zM31646 = m31646((C15187) c13111.f43679);
        C18111 c18111 = this.f42485;
        if (zM31646) {
            c18111.m2152(new Supplier() { // from class: l.۠ۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Left:ConstPool[");
                    C13111 c13112 = c13111;
                    sb.append(((C15187) c13112.f43679).f43854);
                    sb.append("](");
                    sb.append(c21204.f69952.toString());
                    sb.append(") = ");
                    sb.append(((C15187) c13112.f43679).f49578);
                    return sb.toString();
                }
            });
        }
        if (m31646((C15187) c13111.f43680)) {
            c18111.m2152(new Supplier() { // from class: l.᩵ۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Right:ConstPool[");
                    C13111 c13112 = c13111;
                    sb.append(((C15187) c13112.f43680).f43854);
                    sb.append("](");
                    sb.append(c21204.f69952.toString());
                    sb.append(") = ");
                    sb.append(((C15187) c13112.f43680).f49578);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m31646(C15187 c15187) {
        C15187 c15187M31667;
        if (c15187.f49578 != null || (c15187M31667 = m31667(c15187.f43854)) == null) {
            return false;
        }
        AbstractC21536 abstractC21536 = c15187M31667.f49578;
        if (abstractC21536 != null) {
            C14150 c14150 = (C14150) this.f42486;
            c14150.getClass();
            C21391.m47942(c14150, abstractC21536);
        }
        c15187.f49578 = c15187M31667.f49578;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31660(final C5682 c5682) {
        final C15187 c15187 = (C15187) c5682.f69953;
        if (m31640(c15187)) {
            this.f42485.m2152(new Supplier() { // from class: l.᩶ۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of ConstPool[");
                    sb.append(c15187.f43854);
                    sb.append("](");
                    C5682 c5683 = c5682;
                    sb.append(c5683.f69952.toString());
                    sb.append(") = ");
                    sb.append(c5683.f69953);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31662(final C21204 c21204) {
        final C13111 c13111 = (C13111) c21204.f69953;
        boolean zM31640 = m31640((C15187) c13111.f43679);
        C18111 c18111 = this.f42485;
        if (zM31640) {
            c18111.m2152(new Supplier() { // from class: l.ۡۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Left:ConstPool[");
                    C13111 c13112 = c13111;
                    sb.append(((C15187) c13112.f43679).f43854);
                    sb.append("](");
                    sb.append(c21204.f69952.toString());
                    sb.append(") = ");
                    sb.append(((C15187) c13112.f43679).f49578);
                    return sb.toString();
                }
            });
        }
        if (m31640((C15187) c13111.f43680)) {
            c18111.m2152(new Supplier() { // from class: l.ۤۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Right:ConstPool[");
                    C13111 c13112 = c13111;
                    sb.append(((C15187) c13112.f43680).f43854);
                    sb.append("](");
                    sb.append(c21204.f69952.toString());
                    sb.append(") = ");
                    sb.append(((C15187) c13112.f43680).f49578);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m31640(C15187 c15187) {
        if (c15187.f49578 == null || c15187.mo32563()) {
            return false;
        }
        C11521 c11521M31653 = m31653(c15187);
        if (!c11521M31653.isPresent()) {
            return false;
        }
        c15187.f43854 = ((C15187) c11521M31653.get()).f43854;
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31651() {
        ArrayList arrayList = this.f42490;
        this.f42485.m2146("fixRefsInPool: Fixing CP for %d explicit Constant Entries", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC21536 abstractC21536 = ((C15187) it.next()).f49578;
            if (abstractC21536 != null) {
                C14150 c14150 = (C14150) this.f42486;
                c14150.getClass();
                C21391.m47942(c14150, abstractC21536);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31665() {
        ArrayList arrayList = this.f42490;
        this.f42485.m2146("fixIndexesInPool: Fixing CP for %d explicit Constant Entries.", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC21536 abstractC21536 = ((C15187) it.next()).f49578;
            if (abstractC21536 != null) {
                C4976 c4976 = (C4976) this.f42489;
                c4976.getClass();
                C21391.m47942(c4976, abstractC21536);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31669() {
        C18111 c18111 = this.f42485;
        c18111.m2146("Checking Globals", new Object[0]);
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f42490;
            if (i >= arrayList.size()) {
                return;
            }
            C15187 c15187 = (C15187) arrayList.get(i);
            if (c15187 == this.f42487) {
                c15187 = new C15187(i, this.f42491);
                arrayList.set(i, c15187);
            }
            if (!c15187.mo32563()) {
                c18111.mo2150("Constant #{0} not declared", Integer.toString(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m31649() {
        Iterator it = this.f42490.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f42485.m2146(String.format(" const #%4d: %s", Integer.valueOf(i), (C15187) it.next()), new Object[0]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3937 m31663() {
        return new C3937(1, Integer.valueOf(this.f42490.size() - 1));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15187 m31667(int i) {
        ArrayList arrayList = this.f42490;
        if (i >= arrayList.size()) {
            return null;
        }
        return (C15187) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31642(final int i, final C15187 c15187, final int i2) {
        Supplier supplier = new Supplier() { // from class: l.ᩳۧۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set1: " + i + " " + c15187;
            }
        };
        C18111 c18111 = this.f42485;
        c18111.m2152(supplier);
        c18111.m2152(new Supplier() { // from class: l.֡ۧۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C8479.m22141(i2, "param_size: ");
            }
        });
        c18111.m2152(new Supplier() { // from class: l.ۛۧۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C12738.m31641(this.f20426);
            }
        });
        c15187.f43854 = i;
        int i3 = i + i2;
        ArrayList arrayList = this.f42490;
        if (i3 >= arrayList.size()) {
            c18111.m2152(new Supplier() { // from class: l.ۧۧۡ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "calling ensureCapacity( " + (i + i2 + 1) + " )";
                }
            });
            int size = arrayList.size();
            int i4 = i3 - size;
            if (i4 > i2) {
                int i5 = (i3 - i2) - 1;
                c18111.mo2157("Missing Constant Pool entry(ies) {0} might be auto-filled with Utf8[null] ", size == i5 ? String.format("#%d", Integer.valueOf(size)) : String.format("#%d-#%d", Integer.valueOf(size), Integer.valueOf(i5)));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(this.f42487);
            }
        }
        arrayList.set(i, c15187);
        if (i2 == 2) {
            int i7 = i + 1;
            arrayList.set(i7, new C15187(i7, this.f42491));
        }
        c18111.m2152(new Supplier() { // from class: l.᩻ۧۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set2: " + i + " " + c15187;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m31641(C12738 c12738) {
        return "pool_size : " + c12738.f42490.size();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m31645(final int i) {
        this.f42485.m2152(new Supplier() { // from class: l.۟ۧۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C2271.m6966(i, "delete cell(", MotionUtils.EASING_TYPE_FORMAT_END);
            }
        });
        C20831 c20831 = new C20831(this, i);
        int i2 = 1;
        while (true) {
            ArrayList arrayList = this.f42490;
            if (i2 >= arrayList.size()) {
                arrayList.remove(i);
                C0356.forEach(arrayList, new C15893());
                return;
            } else {
                if (i2 != i) {
                    m31644(m31650(i2), c20831);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31644(C15187 c15187, C20831 c20831) {
        if (c15187 != null) {
            c20831.n(c15187);
            AbstractC21536 abstractC21536 = c15187.f49578;
            if (abstractC21536 != null) {
                switch (C12033.f40296[abstractC21536.f69952.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        m31644((C15187) abstractC21536.f69953, c20831);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        C13111 c13111 = (C13111) abstractC21536.f69953;
                        m31644((C15187) c13111.f43679, c20831);
                        m31644((C15187) c13111.f43680, c20831);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15187 m31650(int i) {
        return (C15187) this.f42490.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m31654(int i) {
        C15187 c15187M31667 = m31667(i);
        return c15187M31667 != null ? c15187M31667 : new C15187(i, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31659(int i, C15187 c15187) {
        AbstractC21536 abstractC21536 = c15187.f49578;
        C18111 c18111 = this.f42485;
        if (abstractC21536 == null) {
            c18111.m42174("Constant Pool Cell {0} without value", Integer.valueOf(i));
            throw null;
        }
        int iMo5038 = abstractC21536.mo5038();
        if (i == 0) {
            c18111.mo2157("Re-declaration of Constant #0 cannot be written to the class file", new Object[0]);
        } else {
            if (m31667(i) != null || (iMo5038 == 2 && m31667(i + 1) != null)) {
                c18111.mo2150("Constant Pool entry {0} has been redeclared or overlaps with entry {1}", C8479.m22141(i, "#"), "#" + Math.max(i - 1, 0));
                return;
            }
            if (c15187.mo32563() && c15187.f43854 != i) {
                c15187 = new C15187(-1, abstractC21536);
                c18111.m2146("setCell: new ConstCell " + c15187, new Object[0]);
            }
        }
        m31642(i, c15187, iMo5038);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11521 m31653(C15187 c15187) {
        final AbstractC21536 abstractC21536 = c15187.f49578;
        if (abstractC21536 == null) {
            if (m31663().m11412(Integer.valueOf(c15187.f43854))) {
                return C11521.ofNullable(m31667(c15187.f43854));
            }
            boolean zMo32563 = c15187.mo32563();
            C18111 c18111 = this.f42485;
            if (zMo32563) {
                c18111.m42174("Constant Pool Cell {0} without value", Integer.valueOf(c15187.f43854));
                throw null;
            }
            c18111.m42174("Const Cell has undefined Constant pool index and null value", new Object[0]);
            throw null;
        }
        return C9030.stream(this.f42488.values()).filter(new Predicate() { // from class: l.ۢۧۡ
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
                C15187 c15188 = (C15187) obj;
                if (!c15188.mo32563()) {
                    return false;
                }
                EnumC13776 enumC13776M36398 = c15188.m36398();
                AbstractC21536 abstractC21537 = abstractC21536;
                return enumC13776M36398 == abstractC21537.f69952 && c15188.f49578.mo8626(abstractC21537);
            }
        }).findFirst();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C15187 m31648(C15187 c15187) {
        C11521 c11521M31653 = m31653(c15187);
        if (c11521M31653.isPresent()) {
            C15187 c15188 = (C15187) c11521M31653.get();
            EnumC16971 enumC16971 = c15188.f49577;
            EnumC16971 enumC16972 = c15187.f49577;
            if (enumC16971 != enumC16972 && enumC16971.f54307 > enumC16972.f54307) {
                c15188.f49577 = enumC16972;
            }
            return c15188;
        }
        int iMo5038 = c15187.f49578.mo5038();
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f42490;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = arrayList.get(i);
            C15187 c15189 = this.f42487;
            if (obj == c15189 && (iMo5038 == 1 || arrayList.get(i + 1) == c15189)) {
                break;
            }
            i++;
        }
        m31642(i, c15187, iMo5038);
        return m31650(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m31673() {
        this.f42485.m2146("itemizePool", new Object[0]);
        for (final EnumC16971 enumC16971 : EnumC16971.values()) {
            Iterator it = C9030.stream(this.f42488.values()).filter(new Predicate() { // from class: l.ܽۧۡ
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
                    C15187 c15187 = (C15187) obj;
                    if (c15187.mo32563()) {
                        return false;
                    }
                    return enumC16971.equals(c15187.f49577);
                }
            }).toList().iterator();
            while (it.hasNext()) {
                m31648((C15187) it.next());
            }
        }
        m31667(0).f43854 = 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15187 m31664(C15187 c15187) {
        this.f42485.m2146("itemizeCell", new Object[0]);
        return c15187.mo32563() ? c15187 : m31648(c15187);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m31658(AbstractC21536 abstractC21536) {
        C18111 c18111 = this.f42485;
        if (abstractC21536 == null) {
            c18111.m42174("ConstCell.value can''t be null", new Object[0]);
            throw null;
        }
        LinkedHashMap linkedHashMap = this.f42488;
        C15187 c15187 = (C15187) linkedHashMap.get(abstractC21536);
        if (c15187 == null) {
            C15187 c15188 = new C15187(-1, abstractC21536);
            linkedHashMap.put(abstractC21536, c15188);
            c18111.m2146("ConstantPoolHashByValue.put ('%s','%s')", abstractC21536, c15188);
            return c15188;
        }
        AbstractC21536 abstractC21537 = c15187.f49578;
        if (!abstractC21537.equals(abstractC21536)) {
            c18111.m42174("Seeking value {0} is not equal to found {1}", abstractC21536.toString(), abstractC21537.toString());
            throw null;
        }
        c18111.m2146(String.format("ConstantPoolHashByValue.got ('%s') for '%s'", c15187, abstractC21536), new Object[0]);
        return c15187;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15187 m31668(Integer num) {
        return m31658(new C23322(EnumC13776.f45432, num));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m31655(String str) {
        return m31658(new C20499(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m31656(final Function function) {
        return (C15187) C9030.stream(this.f42488.entrySet()).filter(new Predicate() { // from class: l.ۗۧۡ
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
                Map.Entry entry = (Map.Entry) obj;
                if (((AbstractC21536) entry.getKey()).f69952 == EnumC13776.f45415) {
                    return ((Boolean) function.apply((String) ((AbstractC21536) entry.getKey()).f69953)).booleanValue();
                }
                return false;
            }
        }).findFirst().map(new C19839(2)).orElse(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15187 m31657(EnumC13776 enumC13776, C9979 c9979) {
        boolean zM25243 = c9979.m25243();
        C18111 c18111 = this.f42485;
        if (zM25243) {
            c18111.m42174("{0} emptyInfo", "ConstantPool::FindCell");
            throw null;
        }
        if (c9979.m25242() <= 0) {
            return m31658((AbstractC21536) new C5682(enumC13776, m31655((String) c9979.f43680)));
        }
        C15187 c15187M31667 = m31667(c9979.m25242());
        if (c15187M31667 != null && c15187M31667.f49578.f69952 == enumC13776) {
            return c15187M31667;
        }
        c18111.m42174("Constant Pool index {0} is not found", Integer.valueOf(c9979.m25242()));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31661(InterfaceC19275 interfaceC19275) throws IOException {
        ArrayList arrayList = this.f42490;
        int size = arrayList.size();
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(size);
        C3213 c3213 = new C3213(size, 1);
        C18111 c18111 = this.f42485;
        c18111.m2152(c3213);
        int iMo5038 = 1;
        while (iMo5038 < size) {
            C15187 c15187 = (C15187) arrayList.get(iMo5038);
            AbstractC21536 abstractC21536 = c15187.f49578;
            if (c15187.f43854 != iMo5038) {
                c18111.m42174("Cell[{0}] has #{1}", Integer.toString(iMo5038), Integer.valueOf(c15187.f43854));
                throw null;
            }
            abstractC21536.mo3209((InterfaceC19275) c23509);
            iMo5038 += abstractC21536.mo5038();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31652(final EnumC13776... enumC13776Arr) {
        return (ArrayList) C9030.stream(this.f42490).filter(new Predicate() { // from class: l.ܿۧۡ
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
                return ((C15187) obj).m36398().m33537(enumC13776Arr);
            }
        }).collect(C1890.toCollection(new C1780()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31666(final EnumC13776... enumC13776Arr) {
        return (ArrayList) C9030.stream(this.f42490).filter(new Predicate() { // from class: l.ܳۧۡ
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
                C15187 c15187 = (C15187) obj;
                return c15187.f49578 != null && c15187.m36398().m33537(enumC13776Arr);
            }
        }).collect(C1890.toCollection(new C1780()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31671(C15187 c15187) {
        if (c15187 != null) {
            int i = 0;
            if (c15187.m36398() == EnumC13776.f45400) {
                AbstractC21536 abstractC21536 = c15187.f49578;
                if (abstractC21536 != null) {
                    C15187 c15188 = (C15187) ((C22616) abstractC21536).f69953;
                    Object obj = ((C20499) c15188.f49578).f69953;
                    if (obj != null) {
                        String str = (String) obj;
                        if (str.startsWith("java/") || str.startsWith("javax/")) {
                            return;
                        }
                    }
                    i = c15188.f43854;
                }
                int i2 = c15187.f43854;
                m31645(i2);
                if (i2 <= i) {
                    i--;
                }
                m31645(i);
                return;
            }
            this.f42485.mo2157("Cannot delete Constant Pool entry \"{0}\" because only class cells are accepted", c15187);
        }
    }
}
