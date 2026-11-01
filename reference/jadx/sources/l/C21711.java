package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21711 extends AbstractC10872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23123 f70399 = new C23123();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23123 f70400 = new C23123();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48450(C9116 c9116) {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = c9116.f31044;
        if (arrayList.size() == 0) {
            z = false;
        } else {
            int[] iArr = new int[C21005.m47173(c9116)];
            C11834 c11834 = c9116.f31045;
            C18183 c18183 = new C18183(iArr);
            for (AbstractC4777 first = c11834.getFirst(); first != null; first = first.m13247()) {
                C21005.m47166(first, c18183, true);
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = c9116.f31047;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ArrayList<C15592> arrayList3 = ((C17002) it.next()).f54351;
                    if (arrayList3 != null) {
                        for (C15592 c15592 : arrayList3) {
                            hashSet2.add((C2184) c15592.f31402);
                            for (AbstractC7124 abstractC7124 : c15592.f31401.mo19023()) {
                                hashSet2.add((C2184) abstractC7124);
                            }
                        }
                    }
                }
            }
            HashMap map = new HashMap();
            Iterator it2 = c9116.f31045.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                AbstractC4777 abstractC4777 = (AbstractC4777) it2.next();
                if (abstractC4777.f16795 == EnumC2890.ASSIGN && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                    C2184 c2184 = (C2184) abstractC4777.mo13244();
                    if (!hashSet2.contains(c2184) && iArr[c2184.f7921] < 2) {
                        AbstractC7124 abstractC7124Mo13245 = abstractC4777.mo13245();
                        if (m48448(abstractC7124Mo13245)) {
                            arrayList.remove(c2184);
                            map.put(c2184, abstractC7124Mo13245);
                            it2.remove();
                            z2 = true;
                        } else {
                            hashSet.add(abstractC4777);
                        }
                    }
                }
            }
            C4071 c4071 = new C4071(map);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC7124 abstractC7125 = (AbstractC7124) entry.getValue();
                if (abstractC7125.f23823 == EnumC9947.LOCAL) {
                    while (true) {
                        AbstractC7124 abstractC7126 = (AbstractC7124) map.get(abstractC7125);
                        if (abstractC7126 == null) {
                            break;
                        }
                        if (abstractC7126.f23823 != EnumC9947.LOCAL) {
                            abstractC7125 = abstractC7126;
                            break;
                        }
                        abstractC7125 = abstractC7126;
                    }
                    entry.setValue(abstractC7125);
                } else {
                    C21005.m47174(abstractC7125, c4071);
                }
            }
            for (AbstractC4777 first2 = c9116.f31045.getFirst(); first2 != null; first2 = first2.m13247()) {
                C21005.m47175(first2, c4071, false);
            }
            z = z2;
        }
        if (hashSet.size() != 0) {
            C15362 c15362 = new C15362();
            C23704 c23704 = new C23704();
            c23704.addAll(hashSet);
            while (!c23704.isEmpty()) {
                AbstractC4777 abstractC4778 = (AbstractC4777) c23704.poll();
                C2184 c2185 = (C2184) abstractC4778.mo13244();
                AbstractC4777 abstractC4777M13247 = abstractC4778.m13247();
                switch (C6894.f23201[abstractC4777M13247.f16795.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        try {
                            m48446(c2185, abstractC4777M13247);
                            throw null;
                        } catch (C23123 e) {
                            if (e == f70400) {
                                c15362.f50037 = c2185;
                                c15362.f50038 = abstractC4778.mo13245();
                                arrayList.remove(c2185);
                                c9116.f31045.m29522(abstractC4778);
                                C21005.m47175(abstractC4777M13247, c15362, false);
                                AbstractC4777 abstractC4777M13249 = abstractC4777M13247.m13249();
                                if (abstractC4777M13249 != null && hashSet.contains(abstractC4777M13249)) {
                                    c23704.add(abstractC4777M13249);
                                }
                            }
                        }
                        break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48446(C2184 c2184, AbstractC4777 abstractC4777) throws C23123 {
        int i = C6894.f23200[abstractC4777.f16801.ordinal()];
        C23123 c23123 = f70399;
        if (i == 1 || i == 2) {
            throw c23123;
        }
        if (i == 3) {
            m48447(c2184, abstractC4777.mo5126());
            throw c23123;
        }
        if (i == 4) {
            C15592 c15592 = (C15592) abstractC4777;
            AbstractC7124 abstractC7124 = c15592.f31402;
            AbstractC7124 abstractC7125 = c15592.f31401;
            int i2 = C6894.f23202[abstractC7124.f23823.ordinal()];
            if (i2 == 1) {
                m48447(c2184, abstractC7125);
                throw c23123;
            }
            if (i2 == 2) {
                m48447(c2184, abstractC7124.mo19020());
            } else if (i2 != 3) {
                if (i2 == 4) {
                    m48447(c2184, abstractC7124.mo19024());
                    m48447(c2184, abstractC7124.mo19019());
                    m48447(c2184, abstractC7125);
                    throw c23123;
                }
                throw c23123;
            }
            m48447(c2184, abstractC7125);
            throw c23123;
        }
        throw c23123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48447(C2184 c2184, AbstractC7124 abstractC7124) throws C23123 {
        int[] iArr = C6894.f23200;
        EnumC19699 enumC19699 = abstractC7124.f23822;
        EnumC9947 enumC9947 = abstractC7124.f23823;
        int i = iArr[enumC19699.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
                    m48447(c2184, abstractC7125);
                }
            } else if (i == 3) {
                m48447(c2184, abstractC7124.mo19020());
            } else if (i == 4) {
                m48447(c2184, abstractC7124.mo19024());
                m48447(c2184, abstractC7124.mo19019());
            }
        } else if (c2184.f23823 == EnumC9947.LOCAL && abstractC7124 == c2184) {
            throw f70400;
        }
        if (enumC9947 == EnumC9947.INVOKE_STATIC) {
            C3097 c3097 = ((C13475) abstractC7124).f44541;
            if (c3097.m9295().equals("valueOf") && c3097.m9294().startsWith("Ljava/lang/") && c3097.m9291().length == 1 && c3097.m9291()[0].length() == 1) {
                z = true;
            }
        }
        if (!m48449(enumC9947) && !z) {
            throw f70399;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48449(EnumC9947 enumC9947) {
        int i = C6894.f23202[enumC9947.ordinal()];
        if (i != 1) {
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48448(AbstractC7124 abstractC7124) {
        int[] iArr = C6894.f23200;
        EnumC19699 enumC19699 = abstractC7124.f23822;
        EnumC9947 enumC9947 = abstractC7124.f23823;
        int i = iArr[enumC19699.ordinal()];
        if (i == 1) {
            return m48449(enumC9947);
        }
        if (i != 2) {
            return i == 3 ? m48449(enumC9947) && m48448(abstractC7124.mo19020()) : i == 4 && m48449(enumC9947) && m48448(abstractC7124.mo19024()) && m48448(abstractC7124.mo19019());
        }
        if (enumC9947 != EnumC9947.INVOKE_STATIC) {
            if (m48449(enumC9947)) {
                for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
                    if (m48448(abstractC7125)) {
                    }
                }
            }
        }
        C3097 c3097 = ((C13475) abstractC7124).f44541;
        if (c3097.m9295().equals("valueOf") && c3097.m9294().startsWith("Ljava/lang/") && c3097.m9291().length == 1 && c3097.m9291()[0].length() == 1) {
            for (AbstractC7124 abstractC7126 : abstractC7124.mo19023()) {
                if (m48448(abstractC7126)) {
                }
            }
        }
    }
}
