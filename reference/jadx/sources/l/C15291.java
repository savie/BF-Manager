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

/* JADX INFO: renamed from: l.ܳۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15291 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10143 f49993;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10143 f49995;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f49996;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1122 f49997;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49998;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10816 f49999 = new C10816("");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7660 f49994 = new C7660(-1, null);

    public C15291(C1122 c1122) {
        C7660 c7660 = new C7660(-1, new C22751(EnumC3185.f10348, null));
        ArrayList arrayList = new ArrayList(40);
        this.f49998 = arrayList;
        this.f49996 = new LinkedHashMap(40);
        this.f49993 = new C23826(this);
        this.f49995 = new C3688(this);
        this.f49997 = c1122;
        arrayList.add(c7660);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f49998.iterator();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36723(final C6672 c6672) {
        final C7660 c7660 = (C7660) c6672.f61224;
        if (m36699(c7660)) {
            this.f49997.m32299(new Supplier() { // from class: l.ۡۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED ConstPool[");
                    sb.append(c7660.f67820);
                    sb.append("](");
                    C6672 c6673 = c6672;
                    sb.append(c6673.f61223.toString());
                    sb.append(") = ");
                    sb.append(c6673.f61224);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36722(final C4851 c4851) {
        final C18941 c18941 = (C18941) c4851.f61224;
        boolean zM36699 = m36699((C7660) c18941.f61428);
        C1122 c1122 = this.f49997;
        if (zM36699) {
            c1122.m32299(new Supplier() { // from class: l.ۖۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Left:ConstPool[");
                    C18941 c18942 = c18941;
                    sb.append(((C7660) c18942.f61428).f67820);
                    sb.append("](");
                    sb.append(c4851.f61223.toString());
                    sb.append(") = ");
                    sb.append(((C7660) c18942.f61428).f25232);
                    return sb.toString();
                }
            });
        }
        if (m36699((C7660) c18941.f61429)) {
            c1122.m32299(new Supplier() { // from class: l.۠ۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Right:ConstPool[");
                    C18941 c18942 = c18941;
                    sb.append(((C7660) c18942.f61429).f67820);
                    sb.append("](");
                    sb.append(c4851.f61223.toString());
                    sb.append(") = ");
                    sb.append(((C7660) c18942.f61429).f25232);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m36699(C7660 c7660) {
        C7660 c7660M36719;
        if (c7660.f25232 != null || (c7660M36719 = m36719(c7660.f67820)) == null) {
            return false;
        }
        AbstractC18847 abstractC18847 = c7660M36719.f25232;
        if (abstractC18847 != null) {
            C3688 c3688 = (C3688) this.f49995;
            c3688.getClass();
            C7907.m21446(c3688, abstractC18847);
        }
        c7660.f25232 = c7660M36719.f25232;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36711(final C6672 c6672) {
        final C7660 c7660 = (C7660) c6672.f61224;
        if (m36701(c7660)) {
            this.f49997.m32299(new Supplier() { // from class: l.᩸᩷᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of ConstPool[");
                    sb.append(c7660.f67820);
                    sb.append("](");
                    C6672 c6673 = c6672;
                    sb.append(c6673.f61223.toString());
                    sb.append(") = ");
                    sb.append(c6673.f61224);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36710(final C4851 c4851) {
        final C18941 c18941 = (C18941) c4851.f61224;
        boolean zM36701 = m36701((C7660) c18941.f61428);
        C1122 c1122 = this.f49997;
        if (zM36701) {
            c1122.m32299(new Supplier() { // from class: l.ۜۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Left:ConstPool[");
                    C18941 c18942 = c18941;
                    sb.append(((C7660) c18942.f61428).f67820);
                    sb.append("](");
                    sb.append(c4851.f61223.toString());
                    sb.append(") = ");
                    sb.append(((C7660) c18942.f61428).f25232);
                    return sb.toString();
                }
            });
        }
        if (m36701((C7660) c18941.f61429)) {
            c1122.m32299(new Supplier() { // from class: l.۬ۙ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Right:ConstPool[");
                    C18941 c18942 = c18941;
                    sb.append(((C7660) c18942.f61429).f67820);
                    sb.append("](");
                    sb.append(c4851.f61223.toString());
                    sb.append(") = ");
                    sb.append(((C7660) c18942.f61429).f25232);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m36701(C7660 c7660) {
        if (c7660.f25232 == null || c7660.mo20871()) {
            return false;
        }
        C15867 c15867M36708 = m36708(c7660);
        if (!c15867M36708.isPresent()) {
            return false;
        }
        c7660.f67820 = ((C7660) c15867M36708.get()).f67820;
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36726() {
        ArrayList arrayList = this.f49998;
        this.f49997.m32315("fixRefsInPool: Fixing CP for %d explicit Constant Entries", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC18847 abstractC18847 = ((C7660) it.next()).f25232;
            if (abstractC18847 != null) {
                C3688 c3688 = (C3688) this.f49995;
                c3688.getClass();
                C7907.m21446(c3688, abstractC18847);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36714() {
        ArrayList arrayList = this.f49998;
        this.f49997.m32315("fixIndexesInPool: Fixing CP for %d explicit Constant Entries.", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC18847 abstractC18847 = ((C7660) it.next()).f25232;
            if (abstractC18847 != null) {
                C23826 c23826 = (C23826) this.f49993;
                c23826.getClass();
                C7907.m21446(c23826, abstractC18847);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36721() {
        C1122 c1122 = this.f49997;
        c1122.m32315("Checking Globals", new Object[0]);
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f49998;
            if (i >= arrayList.size()) {
                return;
            }
            C7660 c7660 = (C7660) arrayList.get(i);
            if (c7660 == this.f49994) {
                c7660 = new C7660(i, this.f49999);
                arrayList.set(i, c7660);
            }
            if (!c7660.mo20871()) {
                c1122.mo4160("Constant #{0} not declared", Integer.toString(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36715() {
        Iterator it = this.f49998.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f49997.m32315(String.format(" const #%4d: %s", Integer.valueOf(i), (C7660) it.next()), new Object[0]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9990 m36717() {
        return new C9990(1, Integer.valueOf(this.f49998.size() - 1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7660 m36719(int i) {
        ArrayList arrayList = this.f49998;
        if (i >= arrayList.size()) {
            return null;
        }
        return (C7660) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36694(final int i, final C7660 c7660, final int i2) {
        Supplier supplier = new Supplier() { // from class: l.ۢۙ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set1: " + i + " " + c7660;
            }
        };
        C1122 c1122 = this.f49997;
        c1122.m32299(supplier);
        c1122.m32299(new Supplier() { // from class: l.ᩴ᩷᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return C13645.m33382(i2, "param_size: ");
            }
        });
        c1122.m32299(new Supplier() { // from class: l.ۚ᩷᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return C15291.m36693(this.f20272);
            }
        });
        c7660.f67820 = i;
        int i3 = i + i2;
        ArrayList arrayList = this.f49998;
        if (i3 >= arrayList.size()) {
            c1122.m32299(new Supplier() { // from class: l.֫᩷᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "calling ensureCapacity( " + (i + i2 + 1) + " )";
                }
            });
            int size = arrayList.size();
            int i4 = i3 - size;
            if (i4 > i2) {
                int i5 = (i3 - i2) - 1;
                c1122.mo4165("Missing Constant Pool entry(ies) {0} might be auto-filled with Utf8[null] ", size == i5 ? String.format("#%d", Integer.valueOf(size)) : String.format("#%d-#%d", Integer.valueOf(size), Integer.valueOf(i5)));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(this.f49994);
            }
        }
        arrayList.set(i, c7660);
        if (i2 == 2) {
            int i7 = i + 1;
            arrayList.set(i7, new C7660(i7, this.f49999));
        }
        c1122.m32299(new Supplier() { // from class: l.ۧ᩷᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set2: " + i + " " + c7660;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m36693(C15291 c15291) {
        return "pool_size : " + c15291.f49998.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m36698(final int i) {
        this.f49997.m32299(new Supplier() { // from class: l.ۙ᩷᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return C14442.m34864(i, "delete cell(", MotionUtils.EASING_TYPE_FORMAT_END);
            }
        });
        C22334 c22334 = new C22334(this, i);
        int i2 = 1;
        while (true) {
            ArrayList arrayList = this.f49998;
            if (i2 >= arrayList.size()) {
                arrayList.remove(i);
                C4937.forEach(arrayList, new C11145(0));
                return;
            } else {
                if (i2 != i) {
                    m36696(m36725(i2), c22334);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36696(C7660 c7660, C22334 c22334) {
        if (c7660 != null) {
            c22334.n(c7660);
            AbstractC18847 abstractC18847 = c7660.f25232;
            if (abstractC18847 != null) {
                switch (C20842.f66734[abstractC18847.f61223.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        m36696((C7660) abstractC18847.f61224, c22334);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        C18941 c18941 = (C18941) abstractC18847.f61224;
                        m36696((C7660) c18941.f61428, c22334);
                        m36696((C7660) c18941.f61429, c22334);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7660 m36725(int i) {
        return (C7660) this.f49998.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m36703(int i) {
        C7660 c7660M36719 = m36719(i);
        return c7660M36719 != null ? c7660M36719 : new C7660(i, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36709(int i, C7660 c7660) {
        AbstractC18847 abstractC18847 = c7660.f25232;
        C1122 c1122 = this.f49997;
        if (abstractC18847 == null) {
            c1122.m4163("Constant Pool Cell {0} without value", Integer.valueOf(i));
            throw null;
        }
        int iMo14099 = abstractC18847.mo14099();
        if (i == 0) {
            c1122.mo4165("Re-declaration of Constant #0 cannot be written to the class file", new Object[0]);
        } else {
            if (m36719(i) != null || (iMo14099 == 2 && m36719(i + 1) != null)) {
                c1122.mo4160("Constant Pool entry {0} has been redeclared or overlaps with entry {1}", C13645.m33382(i, "#"), "#" + Math.max(i - 1, 0));
                return;
            }
            if (c7660.mo20871() && c7660.f67820 != i) {
                c7660 = new C7660(-1, abstractC18847);
                c1122.m32315("setCell: new ConstCell " + c7660, new Object[0]);
            }
        }
        m36694(i, c7660, iMo14099);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 m36708(C7660 c7660) {
        final AbstractC18847 abstractC18847 = c7660.f25232;
        if (abstractC18847 == null) {
            if (m36717().m25835(Integer.valueOf(c7660.f67820))) {
                return C15867.ofNullable(m36719(c7660.f67820));
            }
            boolean zMo20871 = c7660.mo20871();
            C1122 c1122 = this.f49997;
            if (zMo20871) {
                c1122.m4163("Constant Pool Cell {0} without value", Integer.valueOf(c7660.f67820));
                throw null;
            }
            c1122.m4163("Const Cell has undefined Constant pool index and null value", new Object[0]);
            throw null;
        }
        return C1170.stream(this.f49996.values()).filter(new Predicate() { // from class: l.ܽ᩷᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C7660 c7661 = (C7660) obj;
                if (!c7661.mo20871()) {
                    return false;
                }
                EnumC3185 enumC3185M20873 = c7661.m20873();
                AbstractC18847 abstractC18848 = abstractC18847;
                return enumC3185M20873 == abstractC18848.f61223 && c7661.f25232.mo5226(abstractC18848);
            }
        }).findFirst();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C7660 m36697(C7660 c7660) {
        C15867 c15867M36708 = m36708(c7660);
        if (c15867M36708.isPresent()) {
            C7660 c7661 = (C7660) c15867M36708.get();
            EnumC19767 enumC19767 = c7661.f25233;
            EnumC19767 enumC19768 = c7660.f25233;
            if (enumC19767 != enumC19768 && enumC19767.f63617 > enumC19768.f63617) {
                c7661.f25233 = enumC19768;
            }
            return c7661;
        }
        int iMo14099 = c7660.f25232.mo14099();
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f49998;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = arrayList.get(i);
            C7660 c7662 = this.f49994;
            if (obj == c7662 && (iMo14099 == 1 || arrayList.get(i + 1) == c7662)) {
                break;
            }
            i++;
        }
        m36694(i, c7660, iMo14099);
        return m36725(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36716() {
        this.f49997.m32315("itemizePool", new Object[0]);
        for (final EnumC19767 enumC19767 : EnumC19767.values()) {
            Iterator it = C1170.stream(this.f49996.values()).filter(new Predicate() { // from class: l.ܳ᩷᩺
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C7660 c7660 = (C7660) obj;
                    if (c7660.mo20871()) {
                        return false;
                    }
                    return enumC19767.equals(c7660.f25233);
                }
            }).toList().iterator();
            while (it.hasNext()) {
                m36697((C7660) it.next());
            }
        }
        m36719(0).f67820 = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7660 m36713(C7660 c7660) {
        this.f49997.m32315("itemizeCell", new Object[0]);
        return c7660.mo20871() ? c7660 : m36697(c7660);
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
    public final C7660 m36707(AbstractC18847 abstractC18847) {
        C1122 c1122 = this.f49997;
        if (abstractC18847 == null) {
            c1122.m4163("ConstCell.value can''t be null", new Object[0]);
            throw null;
        }
        LinkedHashMap linkedHashMap = this.f49996;
        C7660 c7660 = (C7660) linkedHashMap.get(abstractC18847);
        if (c7660 == null) {
            C7660 c7661 = new C7660(-1, abstractC18847);
            linkedHashMap.put(abstractC18847, c7661);
            c1122.m32315("ConstantPoolHashByValue.put ('%s','%s')", abstractC18847, c7661);
            return c7661;
        }
        AbstractC18847 abstractC18848 = c7660.f25232;
        if (!abstractC18848.equals(abstractC18847)) {
            c1122.m4163("Seeking value {0} is not equal to found {1}", abstractC18847.toString(), abstractC18848.toString());
            throw null;
        }
        c1122.m32315(String.format("ConstantPoolHashByValue.got ('%s') for '%s'", c7660, abstractC18847), new Object[0]);
        return c7660;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7660 m36720(Integer num) {
        return m36707(new C0705(EnumC3185.f10360, num));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m36704(String str) {
        return m36707(new C10816(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m36705(final Function function) {
        return (C7660) C1170.stream(this.f49996.entrySet()).filter(new Predicate() { // from class: l.ܶ᩷᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                if (((AbstractC18847) entry.getKey()).f61223 == EnumC3185.f10335) {
                    return ((Boolean) function.apply((String) ((AbstractC18847) entry.getKey()).f61224)).booleanValue();
                }
                return false;
            }
        }).findFirst().map(new C0948(0)).orElse(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7660 m36706(EnumC3185 enumC3185, C14150 c14150) {
        boolean zM34371 = c14150.m34371();
        C1122 c1122 = this.f49997;
        if (zM34371) {
            c1122.m4163("{0} emptyInfo", "ConstantPool::FindCell");
            throw null;
        }
        if (c14150.m34370() <= 0) {
            return m36707((AbstractC18847) new C6672(enumC3185, m36704((String) c14150.f61429)));
        }
        C7660 c7660M36719 = m36719(c14150.m34370());
        if (c7660M36719 != null && c7660M36719.f25232.f61223 == enumC3185) {
            return c7660M36719;
        }
        c1122.m4163("Constant Pool index {0} is not found", Integer.valueOf(c14150.m34370()));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36712(InterfaceC9397 interfaceC9397) throws IOException {
        ArrayList arrayList = this.f49998;
        final int size = arrayList.size();
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(size);
        Supplier supplier = new Supplier() { // from class: l.᩻᩷᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return C13645.m33382(size, "wr.pool:size=");
            }
        };
        C1122 c1122 = this.f49997;
        c1122.m32299(supplier);
        int iMo14099 = 1;
        while (iMo14099 < size) {
            C7660 c7660 = (C7660) arrayList.get(iMo14099);
            AbstractC18847 abstractC18847 = c7660.f25232;
            if (c7660.f67820 != iMo14099) {
                c1122.m4163("Cell[{0}] has #{1}", Integer.toString(iMo14099), Integer.valueOf(c7660.f67820));
                throw null;
            }
            abstractC18847.mo3026((InterfaceC9397) c11388);
            iMo14099 += abstractC18847.mo14099();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m36702(EnumC3185... enumC3185Arr) {
        return (ArrayList) C1170.stream(this.f49998).filter(new C13064(2, enumC3185Arr)).collect(C2025.toCollection(new C20503(2)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m36718(final EnumC3185... enumC3185Arr) {
        return (ArrayList) C1170.stream(this.f49998).filter(new Predicate() { // from class: l.ܺ᩷᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C7660 c7660 = (C7660) obj;
                return c7660.f25232 != null && c7660.m20873().m10398(enumC3185Arr);
            }
        }).collect(C2025.toCollection(new C20503(2)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36724(C7660 c7660) {
        if (c7660 != null) {
            int i = 0;
            if (c7660.m20873() == EnumC3185.f10346) {
                AbstractC18847 abstractC18847 = c7660.f25232;
                if (abstractC18847 != null) {
                    C7660 c7661 = (C7660) ((C24572) abstractC18847).f61224;
                    Object obj = ((C10816) c7661.f25232).f61224;
                    if (obj != null) {
                        String str = (String) obj;
                        if (str.startsWith("java/") || str.startsWith("javax/")) {
                            return;
                        }
                    }
                    i = c7661.f67820;
                }
                int i2 = c7660.f67820;
                m36698(i2);
                if (i2 <= i) {
                    i--;
                }
                m36698(i);
                return;
            }
            this.f49997.mo4165("Cannot delete Constant Pool entry \"{0}\" because only class cells are accepted", c7660);
        }
    }
}
