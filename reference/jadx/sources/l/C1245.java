package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20528 f4506;

    public C1245() {
        super(2);
        this.f4506 = new C20528();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4497(ArrayList arrayList, HashMap map, HashSet hashSet) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (C20022 c20022 : ((C11817) it.next()).f38143) {
                    for (AbstractC11071 abstractC11071 : c20022.f12387.mo15448()) {
                        AbstractC11071 abstractC11072 = (AbstractC11071) map.get(abstractC11071);
                        if (abstractC11072 != null) {
                            hashSet.add(abstractC11072);
                        } else {
                            hashSet.add(abstractC11071);
                        }
                    }
                    hashSet.remove(c20022.f12388);
                    c20022.f12387.mo15446((AbstractC11071[]) hashSet.toArray(new AbstractC11071[0]));
                    hashSet.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4498(Map map) {
        boolean z;
        Object obj;
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C7957());
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (Map.Entry entry : arrayList) {
                Object value = entry.getValue();
                if ((value instanceof C4448) && (obj = map.get(value)) != null && value != obj) {
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
    public final boolean m4499(C13791 c13791) {
        boolean z;
        boolean z2;
        boolean z3;
        C10193 c10193;
        ArrayList<C20022> arrayList = new ArrayList();
        ArrayList arrayList2 = c13791.f43754;
        for (AbstractC12563 first = c13791.f43750.getFirst(); first != null; first = first.m31273()) {
            if (first.f40344 == EnumC20768.ASSIGN) {
                C20022 c20022 = (C20022) first;
                EnumC22260 enumC22260 = c20022.f12388.f34921;
                EnumC22260 enumC22261 = EnumC22260.LOCAL;
                if (enumC22260 == enumC22261 && c20022.f12387.f34921 == enumC22261) {
                    arrayList.add(c20022);
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
                C20528 c20528 = this.f4506;
                Map map2 = (Map) c20528.m47061();
                if (map2 == null) {
                    map2 = new HashMap();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    for (C20022 c20023 : ((C11817) it.next()).f38143) {
                        C4448 c4448 = (C4448) c20023.f12388;
                        C10193 c10194 = (C10193) map2.get(c4448);
                        if (c10194 == null) {
                            c10194 = new C10193();
                            c10194.f32614 = c4448;
                            map2.put(c4448, c10194);
                        }
                        c10194.f32615 = z4;
                        AbstractC11071[] abstractC11071ArrMo15448 = c20023.f12387.mo15448();
                        int length = abstractC11071ArrMo15448.length;
                        boolean z7 = z6;
                        int i = 0;
                        while (i < length) {
                            AbstractC11071 abstractC11071 = abstractC11071ArrMo15448[i];
                            if (abstractC11071 == c4448) {
                                abstractC11071ArrMo15448 = abstractC11071ArrMo15448;
                            } else {
                                C4448 c4449 = (C4448) abstractC11071;
                                C10193 c10195 = (C10193) map2.get(c4449);
                                if (c10195 == null) {
                                    c10193 = new C10193();
                                    c10193.f32614 = c4449;
                                    map2.put(c4449, c10193);
                                } else {
                                    c10193 = c10195;
                                }
                                c10193.f32613.add(c10194);
                                c10194.f32616.add(c10193);
                            }
                            i++;
                            abstractC11071ArrMo15448 = abstractC11071ArrMo15448;
                        }
                        z4 = true;
                        z6 = z7;
                    }
                }
                z = z6;
                C17587 c17587 = new C17587();
                c17587.addAll(map2.values());
                while (!c17587.isEmpty()) {
                    C10193 c10196 = (C10193) c17587.poll();
                    for (C10193 c10197 : c10196.f32613) {
                        if (c10197.f32615 && c10197.f32616.addAll(c10196.f32616)) {
                            c17587.add(c10197);
                        }
                    }
                }
                z2 = false;
                for (C10193 c10198 : map2.values()) {
                    if (c10198.f32615) {
                        C4448 c44410 = null;
                        for (C10193 c10199 : c10198.f32616) {
                            if (!c10199.f32615) {
                                if (c44410 != null) {
                                    c44410 = null;
                                    break;
                                }
                                c44410 = c10199.f32614;
                            }
                        }
                        if (c44410 != null) {
                            map.put(c10198.f32614, c44410);
                            hashSet2.add(c10198.f32614);
                            z2 = true;
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C11817 c11817 = (C11817) it2.next();
                    Iterator it3 = c11817.f38143.iterator();
                    while (it3.hasNext()) {
                        if (hashSet2.contains(((C20022) it3.next()).f12388)) {
                            it3.remove();
                        }
                    }
                    if (c11817.f38143.size() == 0) {
                        c11817.f38143 = null;
                        it2.remove();
                    }
                }
                map2.clear();
                c20528.m47060(map2);
            } else {
                z = z6;
                z2 = false;
            }
            if (z2) {
                m4498(map);
                m4497(arrayList2, map, hashSet);
            }
            while (true) {
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    z3 = false;
                    while (it4.hasNext()) {
                        C11817 c11818 = (C11817) it4.next();
                        Iterator it5 = c11818.f38143.iterator();
                        while (it5.hasNext()) {
                            C20022 c20024 = (C20022) it5.next();
                            hashSet.addAll(Arrays.asList(c20024.f12387.mo15448()));
                            hashSet.remove(c20024.f12388);
                            if (hashSet.size() == 1) {
                                it5.remove();
                                map.put((C4448) c20024.f12388, (C4448) hashSet.iterator().next());
                                z3 = true;
                            }
                            hashSet.clear();
                        }
                        if (c11818.f38143.size() == 0) {
                            c11818.f38143 = null;
                            it4.remove();
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                m4498(map);
                m4497(arrayList2, map, hashSet);
            }
            z6 = z;
            z5 = false;
            while (true) {
                C24498 c24498 = c13791.f43750;
                HashSet hashSet3 = new HashSet();
                if (arrayList2 != null) {
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = ((C11817) it6.next()).f38143.iterator();
                        while (it7.hasNext()) {
                            hashSet3.addAll(Arrays.asList(((C20022) it7.next()).f12387.mo15448()));
                        }
                    }
                }
                Iterator it8 = arrayList.iterator();
                boolean z8 = false;
                while (it8.hasNext()) {
                    C20022 c20025 = (C20022) it8.next();
                    if (!hashSet3.contains(c20025.f12388)) {
                        it8.remove();
                        c24498.m54761(c20025);
                        map.put((C4448) c20025.f12388, (C4448) c20025.f12387);
                        z8 = true;
                    }
                }
                if (z8) {
                    m4498(map);
                    for (C20022 c20026 : arrayList) {
                        AbstractC11071 abstractC11072 = (AbstractC11071) map.get(c20026.f12387);
                        if (abstractC11072 != null) {
                            c20026.f12387 = abstractC11072;
                        }
                    }
                    z5 = true;
                    z6 = true;
                }
            }
            m4497(arrayList2, map, hashSet);
            z4 = true;
        }
        Iterator it9 = map.keySet().iterator();
        while (it9.hasNext()) {
            c13791.f43751.remove((C4448) it9.next());
            z6 = true;
        }
        if (map.size() > 0) {
            C24498 c24499 = c13791.f43750;
            C19144 c19144 = new C19144(map);
            for (AbstractC12563 first2 = c24499.getFirst(); first2 != null; first2 = first2.m31273()) {
                C22874.m51602(first2, c19144, true);
            }
        }
        return z6;
    }
}
