package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۧ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11004 {
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27752(C9116 c9116) {
        int i;
        boolean zEquals;
        C17353 c17353;
        C17353 c17354;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = c9116.f31047;
        ArrayList arrayList5 = c9116.f31044;
        if (arrayList4 == null || arrayList4.size() == 0) {
            return;
        }
        for (C17002 c17002 : c9116.f31047) {
            AbstractC4777 abstractC4777M13247 = c17002.m13247();
            if (abstractC4777M13247.f16795 == EnumC2890.LABEL && (arrayList3 = ((C17002) abstractC4777M13247).f54351) != null && arrayList3.size() > 0) {
                c9116.f31045.m29520(c17002, new C10653());
            }
        }
        new C12415(c9116).m9697();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((C2184) it.next()).f23824 = new C6064();
        }
        HashSet<AbstractC4777> hashSet = new HashSet();
        Iterator it2 = c9116.f31045.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC4777 abstractC4777 = (AbstractC4777) it2.next();
            EnumC2890 enumC2890 = abstractC4777.f16795;
            if ((enumC2890 == EnumC2890.ASSIGN || enumC2890 == EnumC2890.IDENTITY) && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                C2184 c2184 = (C2184) abstractC4777.mo13244();
                C6064 c6064 = (C6064) c2184.f23824;
                HashSet hashSet2 = new HashSet();
                C21005.m47165(abstractC4777, hashSet);
                for (AbstractC4777 abstractC4778 : hashSet) {
                    C17353[] c17353Arr = (C17353[]) abstractC4778.f16794;
                    if (c17353Arr != null) {
                        hashSet2.clear();
                        hashSet2.add(Integer.valueOf(c2184.f7921));
                        if (abstractC4778.f16795 == EnumC2890.LABEL && (arrayList = ((C17002) abstractC4778).f54351) != null) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                hashSet2.add(Integer.valueOf(((C2184) ((C15592) it3.next()).f31402).f7921));
                            }
                        }
                        for (int i2 = 0; i2 < c17353Arr.length; i2++) {
                            if (!hashSet2.contains(Integer.valueOf(i2)) && (c17354 = c17353Arr[i2]) != null && c17354.f55217) {
                                C6064 c6065 = (C6064) c17354.f55216.f23824;
                                c6064.f20567.add(c6065);
                                c6065.f20567.add(c6064);
                            }
                        }
                    }
                }
                hashSet.clear();
            } else if (abstractC4777.f16795 == EnumC2890.LABEL && (arrayList2 = ((C17002) abstractC4777).f54351) != null && abstractC4777.f16794 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C6064 c6066 = (C6064) ((C2184) ((C15592) it4.next()).f31402).f23824;
                    for (C17353 c17355 : (C17353[]) abstractC4777.f16794) {
                        if (c17355 != null && c17355.f55217) {
                            C6064 c6067 = (C6064) c17355.f55216.f23824;
                            c6066.f20567.add(c6067);
                            c6067.f20567.add(c6066);
                        }
                    }
                }
            }
        }
        for (C17002 c17003 : c9116.f31047) {
            for (C15592 c15592 : c17003.f54351) {
                C2184 c2185 = (C2184) c15592.f31402;
                C0773 c0773 = (C0773) c15592.f31401;
                C6064 c6068 = (C6064) c2185.f23824;
                for (AbstractC7124 abstractC7124 : c0773.f29544) {
                    if (c6068.f20567.contains((C6064) ((C2184) abstractC7124).f23824)) {
                        C2184 c2186 = (C2184) c2185.clone();
                        c15592.f31402 = c2186;
                        C6064 c6069 = new C6064();
                        c2186.f23824 = c6069;
                        arrayList5.add(c2186);
                        C15592 c15592M8188 = C2660.m8188(c2185, c2186);
                        AbstractC4777 abstractC4777M13248 = c17003.m13247();
                        if (abstractC4777M13248 != null && abstractC4777M13248.f16795 == EnumC2890.IDENTITY && abstractC4777M13248.mo13245().f23823 == EnumC9947.EXCEPTION_REF) {
                            c9116.f31045.m29520(abstractC4777M13248, c15592M8188);
                        } else {
                            c9116.f31045.m29520(c17003, c15592M8188);
                        }
                        C17353[] c17353Arr2 = (C17353[]) c17003.f16794;
                        c17353Arr2[c2185.f7921].f55216 = c2186;
                        for (C17353 c17356 : c17353Arr2) {
                            if (c17356 != null && c17356.f55217) {
                                C6064 c60610 = (C6064) c17356.f55216.f23824;
                                c60610.f20567.add(c6069);
                                c6069.f20567.add(c60610);
                            }
                        }
                        break;
                    }
                }
            }
        }
        ArrayList<C17002> arrayList6 = c9116.f31047;
        ArrayList<C15592> arrayList7 = new ArrayList();
        for (C17002 c17004 : arrayList6) {
            ArrayList arrayList8 = c17004.f54351;
            C17353[] c17353Arr3 = (C17353[]) c17004.f16794;
            for (AbstractC4777 abstractC4779 : c17004.f16796) {
                if (abstractC4779.f16798) {
                    Iterator it5 = arrayList8.iterator();
                    while (it5.hasNext()) {
                        C2184 c2187 = (C2184) ((C15592) it5.next()).f31402;
                        C2184 c2188 = (C2184) c17353Arr3[c2187.f7921].f55214.get(abstractC4779);
                        if (c2188 != c2187) {
                            arrayList7.add(C2660.m8188(c2187, c2188));
                        }
                    }
                    C11834 c11834 = c9116.f31045;
                    TreeSet treeSet = abstractC4779.f16799;
                    boolean z = true;
                    if (treeSet == null || !treeSet.contains(c17004)) {
                        int i3 = C0419.f1911[abstractC4779.f16795.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            zEquals = ((InterfaceC12064) abstractC4779).mo986().equals(c17004);
                        } else if (i3 == 3 || i3 == 4) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else {
                        zEquals = true;
                    }
                    if (zEquals) {
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            c11834.m29526(abstractC4779, (C15592) it6.next());
                        }
                    } else {
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            c11834.m29520(abstractC4779, (C15592) it7.next());
                        }
                    }
                    C17353[] c17353Arr4 = (C17353[]) abstractC4779.f16794;
                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                    for (C15592 c15593 : arrayList7) {
                        C2184 c2189 = (C2184) c15593.f31402;
                        C17353 c17357 = new C17353(i);
                        c17357.f55216 = c2189;
                        c17357.f55217 = z;
                        arrayList9.add(c17357);
                        C6064 c60611 = (C6064) c2189.f23824;
                        int i4 = ((C2184) c15593.f31401).f7921;
                        for (int i5 = 0; i5 < c17353Arr4.length; i5++) {
                            if (i5 != i4 && (c17353 = c17353Arr4[i5]) != null && c17353.f55217) {
                                C6064 c60612 = (C6064) c17353.f55216.f23824;
                                c60612.f20567.add(c60611);
                                c60611.f20567.add(c60612);
                            }
                        }
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            C6064 c60613 = (C6064) ((C2184) ((C15592) it8.next()).f31402).f23824;
                            c60613.f20567.add(c60611);
                            c60611.f20567.add(c60613);
                        }
                        i = 0;
                        z = true;
                    }
                    C17353[] c17353Arr5 = new C17353[arrayList9.size() + c17353Arr4.length];
                    System.arraycopy(c17353Arr4, 0, c17353Arr5, 0, c17353Arr4.length);
                    for (int i6 = 0; i6 < arrayList9.size(); i6++) {
                        c17353Arr5[c17353Arr4.length + i6] = (C17353) arrayList9.get(i6);
                    }
                    arrayList7.clear();
                }
                i = 0;
            }
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            ((C2184) it9.next()).f23824 = null;
        }
        Iterator it10 = c9116.f31045.iterator();
        while (it10.hasNext()) {
            ((AbstractC4777) it10.next()).f16794 = null;
        }
        Iterator it11 = c9116.f31047.iterator();
        while (it11.hasNext()) {
            ((C17002) it11.next()).f54351 = null;
        }
        c9116.f31047 = null;
    }
}
