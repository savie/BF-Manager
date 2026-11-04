package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4IX4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8314 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27285 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f27286 = C16980.m40037(C8314.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15823 m22398(C24927 c24927) {
        C24927 c24928 = c24927;
        while (((C7729) c24928.mo17862((InterfaceC2157) C11457.f36020)) == null) {
            C24927 c24927M55574 = c24928.m55574();
            if (c24927M55574 == c24928) {
                return c24927.mo8527().m5681().m17700();
            }
            c24928 = c24927M55574;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22407(C2551 c2551) {
        return m22398(c2551.m8536()) == EnumC15823.SIMPLE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22409(C2551 c2551, C18959 c18959, C18959 c189510) {
        if (m22407(c2551)) {
            return c18959.m44009(new C9059(0, (C21922) c189510.mo17862((InterfaceC2157) C11457.f36015))) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22408(C2551 c2551, AbstractC15251 abstractC15251) {
        if (!m22407(c2551)) {
            return true;
        }
        C18959 c18959M22400 = m22400(c2551, (C18959) abstractC15251);
        if (c18959M22400 == null || !m22409(c2551, abstractC15251, c18959M22400)) {
            return false;
        }
        C6041 c6041M44027 = c18959M22400.m44027();
        if (c6041M44027 == null) {
            return c18959M22400 != abstractC15251;
        }
        if (c6041M44027.m17530().m41952() == 0) {
            return false;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(c6041M44027.m17530());
        while (!arrayDeque.isEmpty()) {
            C17973 c17973 = (C17973) arrayDeque.removeFirst();
            if (hashSet.add(c17973)) {
                Iterator it = c17973.m41946().iterator();
                while (it.hasNext()) {
                    C18959 c18959M39118 = ((C6041) it.next()).m39118();
                    C18959 c18959M22401 = c18959M39118 == null ? null : m22400(c2551, c18959M39118);
                    if (c18959M22401 == null || !m22409(c2551, abstractC15251, c18959M22401)) {
                        return false;
                    }
                    if (c18959M22401.m44027() != null) {
                        arrayDeque.add(c18959M22401.m44027().m17530());
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m22400(C2551 c2551, C18959 c18959) {
        if (!c18959.mo17865(EnumC1763.WRAPPED)) {
            return c18959;
        }
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            for (C18959 c189510 : (ArrayList) ((C21943) it.next()).mo1986()) {
                if (c189510.m44009(new C0856(0, c18959)) != null) {
                    return c189510;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22396(int i) {
        return i < 0 ? "?" : String.format("0x%04x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22397(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return "\"" + obj + '\"';
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22394(C1610 c1610, AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        if (abstractC16481 instanceof C23195) {
            return abstractC16481;
        }
        if (!(abstractC16481 instanceof C6041)) {
            if (abstractC16481 instanceof C17227) {
                return m22395(c1610, ((C17227) abstractC16481).m40461());
            }
            return null;
        }
        C18959 c18959M17529 = ((C6041) abstractC16481).m17529();
        if (c18959M17529 == null) {
            return null;
        }
        return c18959M17529.getType() == EnumC24203.MOVE ? m22394(c1610, c18959M17529.mo44035(0)) : m22395(c1610, c18959M17529);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22395(C1610 c1610, C18959 c18959) {
        int i = C2348.f7571[c18959.getType().ordinal()];
        if (i == 1) {
            return c18959.mo44035(0);
        }
        if (i == 2) {
            return ((C5557) c18959).getString();
        }
        if (i == 3) {
            return ((C13014) c18959).m32420();
        }
        if (i != 4) {
            return null;
        }
        C14022 c14022 = (C14022) ((C3319) c18959).m10937();
        C17467 c17467M5670 = c1610.m5670(c14022);
        if (c17467M5670 == null) {
            f27286.mo13728(c14022, "Field {} not found");
            return null;
        }
        C15580 c15580 = (C15580) c17467M5670.mo17862(C25278.f81643);
        if (c15580 != null) {
            return C6077.m17589(c15580);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m22401(C2551 c2551, EnumC24203 enumC24203, Predicate predicate) {
        if (c2551.m8524()) {
            return null;
        }
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((C21943) it.next()).mo1986()).iterator();
            while (it2.hasNext()) {
                C18959 c18959M22404 = m22404((C18959) it2.next(), enumC24203, predicate);
                if (c18959M22404 != null) {
                    return c18959M22404;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22405(C2551 c2551, C18959 c18959, C10690 c10690) {
        int iM44039 = c18959.m44039();
        for (int i = 0; i < iM44039; i++) {
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(i);
            abstractC16481Mo44035.getClass();
            if (abstractC16481Mo44035 instanceof C17227) {
                C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                m22405(c2551, c18959M40461, c10690);
                C18959 c189510 = (C18959) c10690.apply(c18959M40461);
                if (c189510 != null) {
                    C9804.m25533(c2551, abstractC16481Mo44035);
                    c18959.mo44012(i, AbstractC16481.m39110(c189510));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m22404(C18959 c18959, EnumC24203 enumC24203, Predicate predicate) {
        C18959 c18959M22404;
        if (c18959.getType() == enumC24203 && predicate.test(c18959)) {
            return c18959;
        }
        for (AbstractC16481 abstractC16481 : c18959.m44026()) {
            abstractC16481.getClass();
            if ((abstractC16481 instanceof C17227) && (c18959M22404 = m22404(((C17227) abstractC16481).m40461(), enumC24203, predicate)) != null) {
                return c18959M22404;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m22399(C18959 c18959) {
        if (c18959 == null || c18959.m44039() != 1) {
            return null;
        }
        return c18959.mo44035(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m22403(C18959 c18959, EnumC24203 enumC24203) {
        if (c18959 == null || c18959.getType() != enumC24203) {
            return null;
        }
        return c18959;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22411(C18959 c18959, EnumC24203 enumC24203) {
        return c18959 != null && c18959.getType() == enumC24203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m22402(AbstractC16481 abstractC16481) {
        if (abstractC16481 == null || !(abstractC16481 instanceof C17227)) {
            return null;
        }
        return ((C17227) abstractC16481).m40461();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22406(List list, C6041 c6041) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC16481 abstractC16481 = (AbstractC16481) it.next();
            if (abstractC16481 == c6041 || c6041.m17535(abstractC16481)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22410(AbstractC16481 abstractC16481, C6041 c6041) {
        C18959 c18959M40461;
        abstractC16481.getClass();
        if (abstractC16481 instanceof C6041) {
            return ((C6041) abstractC16481).m17535((AbstractC16481) c6041);
        }
        if (!(abstractC16481 instanceof C17227) || (c18959M40461 = ((C17227) abstractC16481).m40461()) == null) {
            return false;
        }
        C6041 c6041M44027 = c18959M40461.m44027();
        if (c6041M44027 != null && c6041M44027.m17535((AbstractC16481) c6041)) {
            return true;
        }
        if (c18959M40461.m44039() == 0) {
            return false;
        }
        Iterator it = c18959M40461.m44026().iterator();
        while (it.hasNext()) {
            if (m22410((AbstractC16481) it.next(), c6041)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22412(C24927 c24927) {
        return c24927.mo17867(C11457.f36004) && m22398(c24927).m37753();
    }
}
