package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes4.dex */
public final class C9579 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10325 f31010 = new C10325();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10325 f31009 = new C10325();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25022(C13791 c13791) {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = c13791.f43751;
        if (arrayList.size() == 0) {
            z = false;
        } else {
            int[] iArr = new int[C22874.m51600(c13791)];
            C24498 c24498 = c13791.f43750;
            C2868 c2868 = new C2868(iArr);
            for (AbstractC12563 first = c24498.getFirst(); first != null; first = first.m31273()) {
                C22874.m51594(first, c2868, true);
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = c13791.f43754;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ArrayList<C20022> arrayList3 = ((C11817) it.next()).f38143;
                    if (arrayList3 != null) {
                        for (C20022 c20022 : arrayList3) {
                            hashSet2.add((C4448) c20022.f12388);
                            for (AbstractC11071 abstractC11071 : c20022.f12387.mo15448()) {
                                hashSet2.add((C4448) abstractC11071);
                            }
                        }
                    }
                }
            }
            HashMap map = new HashMap();
            Iterator it2 = c13791.f43750.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                AbstractC12563 abstractC12563 = (AbstractC12563) it2.next();
                if (abstractC12563.f40344 == EnumC20768.ASSIGN && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                    C4448 c4448 = (C4448) abstractC12563.mo11730();
                    if (!hashSet2.contains(c4448) && iArr[c4448.f15916] < 2) {
                        AbstractC11071 abstractC11071Mo11728 = abstractC12563.mo11728();
                        if (m25020(abstractC11071Mo11728)) {
                            arrayList.remove(c4448);
                            map.put(c4448, abstractC11071Mo11728);
                            it2.remove();
                            z2 = true;
                        } else {
                            hashSet.add(abstractC12563);
                        }
                    }
                }
            }
            C8089 c8089 = new C8089(map);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC11071 abstractC11072 = (AbstractC11071) entry.getValue();
                if (abstractC11072.f34921 == EnumC22260.LOCAL) {
                    while (true) {
                        AbstractC11071 abstractC11073 = (AbstractC11071) map.get(abstractC11072);
                        if (abstractC11073 == null) {
                            break;
                        }
                        if (abstractC11073.f34921 != EnumC22260.LOCAL) {
                            abstractC11072 = abstractC11073;
                            break;
                        }
                        abstractC11072 = abstractC11073;
                    }
                    entry.setValue(abstractC11072);
                } else {
                    C22874.m51601(abstractC11072, c8089);
                }
            }
            for (AbstractC12563 first2 = c13791.f43750.getFirst(); first2 != null; first2 = first2.m31273()) {
                C22874.m51602(first2, c8089, false);
            }
            z = z2;
        }
        if (hashSet.size() != 0) {
            C1377 c1377 = new C1377();
            C17587 c17587 = new C17587();
            c17587.addAll(hashSet);
            while (!c17587.isEmpty()) {
                AbstractC12563 abstractC12564 = (AbstractC12563) c17587.poll();
                C4448 c4449 = (C4448) abstractC12564.mo11730();
                AbstractC12563 abstractC12563M31273 = abstractC12564.m31273();
                switch (C19276.f62330[abstractC12563M31273.f40344.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        try {
                            m25019(c4449, abstractC12563M31273);
                            throw null;
                        } catch (C10325 e) {
                            if (e == f31009) {
                                c1377.f4911 = c4449;
                                c1377.f4912 = abstractC12564.mo11728();
                                arrayList.remove(c4449);
                                c13791.f43750.m54761(abstractC12564);
                                C22874.m51602(abstractC12563M31273, c1377, false);
                                AbstractC12563 abstractC12563M31272 = abstractC12563M31273.m31272();
                                if (abstractC12563M31272 != null && hashSet.contains(abstractC12563M31272)) {
                                    c17587.add(abstractC12563M31272);
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
    public static void m25019(C4448 c4448, AbstractC12563 abstractC12563) throws C10325 {
        int i = C19276.f62329[abstractC12563.f40352.ordinal()];
        C10325 c10325 = f31010;
        if (i == 1 || i == 2) {
            throw c10325;
        }
        if (i == 3) {
            m25018(c4448, abstractC12563.mo31271());
            throw c10325;
        }
        if (i == 4) {
            C20022 c20022 = (C20022) abstractC12563;
            AbstractC11071 abstractC11071 = c20022.f12388;
            AbstractC11071 abstractC11072 = c20022.f12387;
            int i2 = C19276.f62331[abstractC11071.f34921.ordinal()];
            if (i2 == 1) {
                m25018(c4448, abstractC11072);
                throw c10325;
            }
            if (i2 == 2) {
                m25018(c4448, abstractC11071.mo20366());
            } else if (i2 != 3) {
                if (i2 == 4) {
                    m25018(c4448, abstractC11071.mo27979());
                    m25018(c4448, abstractC11071.mo27977());
                    m25018(c4448, abstractC11072);
                    throw c10325;
                }
                throw c10325;
            }
            m25018(c4448, abstractC11072);
            throw c10325;
        }
        throw c10325;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25018(C4448 c4448, AbstractC11071 abstractC11071) throws C10325 {
        int[] iArr = C19276.f62329;
        EnumC7080 enumC7080 = abstractC11071.f34922;
        EnumC22260 enumC22260 = abstractC11071.f34921;
        int i = iArr[enumC7080.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
                    m25018(c4448, abstractC11072);
                }
            } else if (i == 3) {
                m25018(c4448, abstractC11071.mo20366());
            } else if (i == 4) {
                m25018(c4448, abstractC11071.mo27979());
                m25018(c4448, abstractC11071.mo27977());
            }
        } else if (c4448.f34921 == EnumC22260.LOCAL && abstractC11071 == c4448) {
            throw f31009;
        }
        if (enumC22260 == EnumC22260.INVOKE_STATIC) {
            C3177 c3177 = ((C6686) abstractC11071).f22277;
            if (c3177.m10374().equals("valueOf") && c3177.m10371().startsWith("Ljava/lang/") && c3177.m10375().length == 1 && c3177.m10375()[0].length() == 1) {
                z = true;
            }
        }
        if (!m25021(enumC22260) && !z) {
            throw f31010;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25021(EnumC22260 enumC22260) {
        int i = C19276.f62331[enumC22260.ordinal()];
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
    public static boolean m25020(AbstractC11071 abstractC11071) {
        int[] iArr = C19276.f62329;
        EnumC7080 enumC7080 = abstractC11071.f34922;
        EnumC22260 enumC22260 = abstractC11071.f34921;
        int i = iArr[enumC7080.ordinal()];
        if (i == 1) {
            return m25021(enumC22260);
        }
        if (i != 2) {
            return i == 3 ? m25021(enumC22260) && m25020(abstractC11071.mo20366()) : i == 4 && m25021(enumC22260) && m25020(abstractC11071.mo27979()) && m25020(abstractC11071.mo27977());
        }
        if (enumC22260 != EnumC22260.INVOKE_STATIC) {
            if (m25021(enumC22260)) {
                for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
                    if (m25020(abstractC11072)) {
                    }
                }
            }
        }
        C3177 c3177 = ((C6686) abstractC11071).f22277;
        if (c3177.m10374().equals("valueOf") && c3177.m10371().startsWith("Ljava/lang/") && c3177.m10375().length == 1 && c3177.m10375()[0].length() == 1) {
            for (AbstractC11071 abstractC11073 : abstractC11071.mo15448()) {
                if (m25020(abstractC11073)) {
                }
            }
        }
    }
}
