package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15237 extends AbstractC10872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19805 f49691 = new C19805();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36504(ArrayList arrayList, HashMap map, HashSet hashSet) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (C15592 c15592 : ((C17002) it.next()).f54351) {
                    for (AbstractC7124 abstractC7124 : c15592.f31401.mo19023()) {
                        AbstractC7124 abstractC7125 = (AbstractC7124) map.get(abstractC7124);
                        if (abstractC7125 != null) {
                            hashSet.add(abstractC7125);
                        } else {
                            hashSet.add(abstractC7124);
                        }
                    }
                    hashSet.remove(c15592.f31402);
                    c15592.f31401.mo19022((AbstractC7124[]) hashSet.toArray(new AbstractC7124[0]));
                    hashSet.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36505(Map map) {
        boolean z;
        Object obj;
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C3946());
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (Map.Entry entry : arrayList) {
                Object value = entry.getValue();
                if ((value instanceof C2184) && (obj = map.get(value)) != null && value != obj) {
                    entry.setValue(obj);
                    z = true;
                }
            }
        }
    }

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
    public final boolean m36506(C9116 c9116) {
        boolean z;
        boolean z2;
        boolean z3;
        C22998 c22998;
        ArrayList<C15592> arrayList = new ArrayList();
        ArrayList arrayList2 = c9116.f31047;
        for (AbstractC4777 first = c9116.f31045.getFirst(); first != null; first = first.m13247()) {
            if (first.f16795 == EnumC2890.ASSIGN) {
                C15592 c15592 = (C15592) first;
                EnumC9947 enumC9947 = c15592.f31402.f23823;
                EnumC9947 enumC9948 = EnumC9947.LOCAL;
                if (enumC9947 == enumC9948 && c15592.f31401.f23823 == enumC9948) {
                    arrayList.add(c15592);
                }
            }
        }
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            if (arrayList2 != null) {
                HashSet hashSet2 = new HashSet();
                C19805 c19805 = this.f49691;
                Map map2 = (Map) c19805.m45009();
                if (map2 == null) {
                    map2 = new HashMap();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    for (C15592 c15593 : ((C17002) it.next()).f54351) {
                        C2184 c2184 = (C2184) c15593.f31402;
                        C22998 c22999 = (C22998) map2.get(c2184);
                        if (c22999 == null) {
                            c22999 = new C22998();
                            c22999.f74741 = c2184;
                            map2.put(c2184, c22999);
                        }
                        c22999.f74742 = z4;
                        AbstractC7124[] abstractC7124ArrMo19023 = c15593.f31401.mo19023();
                        int length = abstractC7124ArrMo19023.length;
                        boolean z7 = z6;
                        int i = 0;
                        while (i < length) {
                            AbstractC7124 abstractC7124 = abstractC7124ArrMo19023[i];
                            if (abstractC7124 == c2184) {
                                abstractC7124ArrMo19023 = abstractC7124ArrMo19023;
                            } else {
                                C2184 c2185 = (C2184) abstractC7124;
                                C22998 c229910 = (C22998) map2.get(c2185);
                                if (c229910 == null) {
                                    c22998 = new C22998();
                                    c22998.f74741 = c2185;
                                    map2.put(c2185, c22998);
                                } else {
                                    c22998 = c229910;
                                }
                                c22998.f74740.add(c22999);
                                c22999.f74739.add(c22998);
                            }
                            i++;
                            abstractC7124ArrMo19023 = abstractC7124ArrMo19023;
                        }
                        z4 = true;
                        z6 = z7;
                    }
                }
                z = z6;
                C23704 c23704 = new C23704();
                c23704.addAll(map2.values());
                while (!c23704.isEmpty()) {
                    C22998 c229911 = (C22998) c23704.poll();
                    for (C22998 c229912 : c229911.f74740) {
                        if (c229912.f74742 && c229912.f74739.addAll(c229911.f74739)) {
                            c23704.add(c229912);
                        }
                    }
                }
                z2 = false;
                for (C22998 c229913 : map2.values()) {
                    if (c229913.f74742) {
                        C2184 c2186 = null;
                        for (C22998 c229914 : c229913.f74739) {
                            if (!c229914.f74742) {
                                if (c2186 != null) {
                                    c2186 = null;
                                    break;
                                }
                                c2186 = c229914.f74741;
                            }
                        }
                        if (c2186 != null) {
                            map.put(c229913.f74741, c2186);
                            hashSet2.add(c229913.f74741);
                            z2 = true;
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C17002 c17002 = (C17002) it2.next();
                    Iterator it3 = c17002.f54351.iterator();
                    while (it3.hasNext()) {
                        if (hashSet2.contains(((C15592) it3.next()).f31402)) {
                            it3.remove();
                        }
                    }
                    if (c17002.f54351.size() == 0) {
                        c17002.f54351 = null;
                        it2.remove();
                    }
                }
                map2.clear();
                c19805.m45011(map2);
            } else {
                z = z6;
                z2 = false;
            }
            if (z2) {
                m36505(map);
                m36504(arrayList2, map, hashSet);
            }
            while (true) {
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    z3 = false;
                    while (it4.hasNext()) {
                        C17002 c17003 = (C17002) it4.next();
                        Iterator it5 = c17003.f54351.iterator();
                        while (it5.hasNext()) {
                            C15592 c15594 = (C15592) it5.next();
                            hashSet.addAll(Arrays.asList(c15594.f31401.mo19023()));
                            hashSet.remove(c15594.f31402);
                            if (hashSet.size() == 1) {
                                it5.remove();
                                map.put((C2184) c15594.f31402, (C2184) hashSet.iterator().next());
                                z3 = true;
                            }
                            hashSet.clear();
                        }
                        if (c17003.f54351.size() == 0) {
                            c17003.f54351 = null;
                            it4.remove();
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                m36505(map);
                m36504(arrayList2, map, hashSet);
            }
            z6 = z;
            z5 = false;
            while (true) {
                C11834 c11834 = c9116.f31045;
                HashSet hashSet3 = new HashSet();
                if (arrayList2 != null) {
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = ((C17002) it6.next()).f54351.iterator();
                        while (it7.hasNext()) {
                            hashSet3.addAll(Arrays.asList(((C15592) it7.next()).f31401.mo19023()));
                        }
                    }
                }
                Iterator it8 = arrayList.iterator();
                boolean z8 = false;
                while (it8.hasNext()) {
                    C15592 c15595 = (C15592) it8.next();
                    if (!hashSet3.contains(c15595.f31402)) {
                        it8.remove();
                        c11834.m29522(c15595);
                        map.put((C2184) c15595.f31402, (C2184) c15595.f31401);
                        z8 = true;
                    }
                }
                if (z8) {
                    m36505(map);
                    for (C15592 c15596 : arrayList) {
                        AbstractC7124 abstractC7125 = (AbstractC7124) map.get(c15596.f31401);
                        if (abstractC7125 != null) {
                            c15596.f31401 = abstractC7125;
                        }
                    }
                    z5 = true;
                    z6 = true;
                }
            }
            m36504(arrayList2, map, hashSet);
            z4 = true;
        }
        Iterator it9 = map.keySet().iterator();
        while (it9.hasNext()) {
            c9116.f31044.remove((C2184) it9.next());
            z6 = true;
        }
        if (map.size() > 0) {
            C11834 c11835 = c9116.f31045;
            C6769 c6769 = new C6769(map);
            for (AbstractC4777 first2 = c11835.getFirst(); first2 != null; first2 = first2.m13247()) {
                C21005.m47175(first2, c6769, true);
            }
        }
        return z6;
    }
}
