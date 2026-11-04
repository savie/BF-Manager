package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܺ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16841 {
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
    public static void m39751(C13791 c13791) {
        int i;
        boolean zEquals;
        C11620 c11620;
        C11620 c11621;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = c13791.f43754;
        ArrayList arrayList5 = c13791.f43751;
        if (arrayList4 == null || arrayList4.size() == 0) {
            return;
        }
        for (C11817 c11817 : c13791.f43754) {
            AbstractC12563 abstractC12563M31273 = c11817.m31273();
            if (abstractC12563M31273.f40344 == EnumC20768.LABEL && (arrayList3 = ((C11817) abstractC12563M31273).f38143) != null && arrayList3.size() > 0) {
                c13791.f43750.m54759(c11817, new C17038());
            }
        }
        new C1926(c13791).m47168();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((C4448) it.next()).f34924 = new C25047();
        }
        HashSet<AbstractC12563> hashSet = new HashSet();
        Iterator it2 = c13791.f43750.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC12563 abstractC12563 = (AbstractC12563) it2.next();
            EnumC20768 enumC20768 = abstractC12563.f40344;
            if ((enumC20768 == EnumC20768.ASSIGN || enumC20768 == EnumC20768.IDENTITY) && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                C4448 c4448 = (C4448) abstractC12563.mo11730();
                C25047 c25047 = (C25047) c4448.f34924;
                HashSet hashSet2 = new HashSet();
                C22874.m51593(abstractC12563, hashSet);
                for (AbstractC12563 abstractC12564 : hashSet) {
                    C11620[] c11620Arr = (C11620[]) abstractC12564.f40353;
                    if (c11620Arr != null) {
                        hashSet2.clear();
                        hashSet2.add(Integer.valueOf(c4448.f15916));
                        if (abstractC12564.f40344 == EnumC20768.LABEL && (arrayList = ((C11817) abstractC12564).f38143) != null) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                hashSet2.add(Integer.valueOf(((C4448) ((C20022) it3.next()).f12388).f15916));
                            }
                        }
                        for (int i2 = 0; i2 < c11620Arr.length; i2++) {
                            if (!hashSet2.contains(Integer.valueOf(i2)) && (c11621 = c11620Arr[i2]) != null && c11621.f36456) {
                                C25047 c25048 = (C25047) c11621.f36458.f34924;
                                c25047.f81020.add(c25048);
                                c25048.f81020.add(c25047);
                            }
                        }
                    }
                }
                hashSet.clear();
            } else if (abstractC12563.f40344 == EnumC20768.LABEL && (arrayList2 = ((C11817) abstractC12563).f38143) != null && abstractC12563.f40353 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C25047 c25049 = (C25047) ((C4448) ((C20022) it4.next()).f12388).f34924;
                    for (C11620 c11622 : (C11620[]) abstractC12563.f40353) {
                        if (c11622 != null && c11622.f36456) {
                            C25047 c250410 = (C25047) c11622.f36458.f34924;
                            c25049.f81020.add(c250410);
                            c250410.f81020.add(c25049);
                        }
                    }
                }
            }
        }
        for (C11817 c11818 : c13791.f43754) {
            for (C20022 c20022 : c11818.f38143) {
                C4448 c4449 = (C4448) c20022.f12388;
                C18618 c18618 = (C18618) c20022.f12387;
                C25047 c250411 = (C25047) c4449.f34924;
                for (AbstractC11071 abstractC11071 : c18618.f17809) {
                    if (c250411.f81020.contains((C25047) ((C4448) abstractC11071).f34924)) {
                        C4448 c44410 = (C4448) c4449.clone();
                        c20022.f12388 = c44410;
                        C25047 c250412 = new C25047();
                        c44410.f34924 = c250412;
                        arrayList5.add(c44410);
                        C20022 c20022M13864 = C4360.m13864(c4449, c44410);
                        AbstractC12563 abstractC12563M31274 = c11818.m31273();
                        if (abstractC12563M31274 != null && abstractC12563M31274.f40344 == EnumC20768.IDENTITY && abstractC12563M31274.mo11728().f34921 == EnumC22260.EXCEPTION_REF) {
                            c13791.f43750.m54759(abstractC12563M31274, c20022M13864);
                        } else {
                            c13791.f43750.m54759(c11818, c20022M13864);
                        }
                        C11620[] c11620Arr2 = (C11620[]) c11818.f40353;
                        c11620Arr2[c4449.f15916].f36458 = c44410;
                        for (C11620 c11623 : c11620Arr2) {
                            if (c11623 != null && c11623.f36456) {
                                C25047 c250413 = (C25047) c11623.f36458.f34924;
                                c250413.f81020.add(c250412);
                                c250412.f81020.add(c250413);
                            }
                        }
                        break;
                    }
                }
            }
        }
        ArrayList<C11817> arrayList6 = c13791.f43754;
        ArrayList<C20022> arrayList7 = new ArrayList();
        for (C11817 c11819 : arrayList6) {
            ArrayList arrayList8 = c11819.f38143;
            C11620[] c11620Arr3 = (C11620[]) c11819.f40353;
            for (AbstractC12563 abstractC12565 : c11819.f40345) {
                if (abstractC12565.f40348) {
                    Iterator it5 = arrayList8.iterator();
                    while (it5.hasNext()) {
                        C4448 c44411 = (C4448) ((C20022) it5.next()).f12388;
                        C4448 c44412 = (C4448) c11620Arr3[c44411.f15916].f36457.get(abstractC12565);
                        if (c44412 != c44411) {
                            arrayList7.add(C4360.m13864(c44411, c44412));
                        }
                    }
                    C24498 c24498 = c13791.f43750;
                    TreeSet treeSet = abstractC12565.f40347;
                    boolean z = true;
                    if (treeSet == null || !treeSet.contains(c11819)) {
                        int i3 = C13112.f41901[abstractC12565.f40344.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            zEquals = ((InterfaceC2123) abstractC12565).mo7315().equals(c11819);
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
                            c24498.m54765(abstractC12565, (C20022) it6.next());
                        }
                    } else {
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            c24498.m54759(abstractC12565, (C20022) it7.next());
                        }
                    }
                    C11620[] c11620Arr4 = (C11620[]) abstractC12565.f40353;
                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                    for (C20022 c20023 : arrayList7) {
                        C4448 c44413 = (C4448) c20023.f12388;
                        C11620 c11624 = new C11620(i);
                        c11624.f36458 = c44413;
                        c11624.f36456 = z;
                        arrayList9.add(c11624);
                        C25047 c250414 = (C25047) c44413.f34924;
                        int i4 = ((C4448) c20023.f12387).f15916;
                        for (int i5 = 0; i5 < c11620Arr4.length; i5++) {
                            if (i5 != i4 && (c11620 = c11620Arr4[i5]) != null && c11620.f36456) {
                                C25047 c250415 = (C25047) c11620.f36458.f34924;
                                c250415.f81020.add(c250414);
                                c250414.f81020.add(c250415);
                            }
                        }
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            C25047 c250416 = (C25047) ((C4448) ((C20022) it8.next()).f12388).f34924;
                            c250416.f81020.add(c250414);
                            c250414.f81020.add(c250416);
                        }
                        i = 0;
                        z = true;
                    }
                    C11620[] c11620Arr5 = new C11620[arrayList9.size() + c11620Arr4.length];
                    System.arraycopy(c11620Arr4, 0, c11620Arr5, 0, c11620Arr4.length);
                    for (int i6 = 0; i6 < arrayList9.size(); i6++) {
                        c11620Arr5[c11620Arr4.length + i6] = (C11620) arrayList9.get(i6);
                    }
                    arrayList7.clear();
                }
                i = 0;
            }
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            ((C4448) it9.next()).f34924 = null;
        }
        Iterator it10 = c13791.f43750.iterator();
        while (it10.hasNext()) {
            ((AbstractC12563) it10.next()).f40353 = null;
        }
        Iterator it11 = c13791.f43754.iterator();
        while (it11.hasNext()) {
            ((C11817) it11.next()).f38143 = null;
        }
        c13791.f43754 = null;
    }
}
