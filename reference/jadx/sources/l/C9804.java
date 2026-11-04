package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f31589;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31590 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2551 f31591;

    public C9804(C21943 c21943, C2551 c2551) {
        this.f31591 = c2551;
        if (c21943 != null) {
            this.f31589 = c21943.mo1986();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25548(C21943 c21943) {
        this.f31589 = c21943.mo1986();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25544(C18959 c18959) {
        this.f31590.add(c18959);
        m25538(this.f31591, c18959);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25547(C18959 c18959) {
        this.f31590.add(c18959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25543() {
        ArrayList arrayList = this.f31590;
        if (arrayList.isEmpty()) {
            return;
        }
        List list = this.f31589;
        C2551 c2551 = this.f31591;
        if (list == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m25534(c2551, (C18959) it.next());
            }
        } else {
            m25539(c2551, arrayList);
            m25530(this.f31589, arrayList);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25546() {
        ArrayList arrayList = this.f31590;
        if (arrayList.isEmpty()) {
            return;
        }
        m25532(this.f31591, arrayList);
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25545(C21943 c21943) {
        ArrayList arrayList = this.f31590;
        if (arrayList.isEmpty()) {
            return;
        }
        List listMo1986 = c21943.mo1986();
        C17359.requireNonNull(listMo1986);
        this.f31589 = listMo1986;
        m25539(this.f31591, arrayList);
        m25530(this.f31589, arrayList);
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m25538(C2551 c2551, C18959 c18959) {
        m25540(c2551, c18959);
        m25542(c2551, c18959);
        c18959.mo17866(EnumC1763.DONT_GENERATE);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25539(C2551 c2551, List list) {
        C4937.forEach(list, new C17390(2, c2551));
        C4937.forEach(list, new C18755(0, c2551));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25540(C2551 c2551, C18959 c18959) {
        Iterator it = c18959.m44026().iterator();
        while (it.hasNext()) {
            m25533(c2551, (AbstractC16481) it.next());
        }
        if (c18959.getType() == EnumC24203.PHI) {
            for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                if (abstractC16481 instanceof C6041) {
                    ((C6041) abstractC16481).m17530().m41937();
                }
            }
        }
        c18959.mo17866(EnumC1763.REMOVE);
        c18959.mo17866(EnumC1763.DONT_GENERATE);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m25542(C2551 c2551, C18959 c18959) {
        C17973 c17973M17530;
        C6041 c6041M44027 = c18959.m44027();
        if (c6041M44027 == null) {
            return;
        }
        if (c2551 != null && (c17973M17530 = c6041M44027.m17530()) != null && c17973M17530.m41951() == c18959) {
            int iM41952 = c17973M17530.m41952();
            if (iM41952 == 0) {
                c2551.m8504(c17973M17530);
            } else if (C6823.m19005((List) c17973M17530.m41946(), (Predicate) new C0110(0))) {
                for (C6041 c6041 : new ArrayList(c17973M17530.m41946())) {
                    C18959 c18959M39118 = c6041.m39118();
                    if (c18959M39118 != null) {
                        ((C18981) c18959M39118).m44089(c6041);
                    }
                }
                c2551.m8504(c17973M17530);
            } else if (C6823.m19005((List) c17973M17530.m41946(), (Predicate) new C7568(0))) {
                Iterator it = c17973M17530.m41946().iterator();
                while (it.hasNext()) {
                    ((C6041) it.next()).m17522();
                }
                c2551.m8504(c17973M17530);
            } else {
                throw new C8597("Can't remove SSA var: " + c17973M17530 + ", still in use, count: " + iM41952 + ", list:\n  " + ((String) C1170.stream(c17973M17530.m41946()).map(new C7873(7)).collect(C2025.joining("\n  "))));
            }
        }
        c18959.m44031((C6041) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25533(C2551 c2551, AbstractC16481 abstractC16481) {
        if (abstractC16481 instanceof C6041) {
            C6041 c6041 = (C6041) abstractC16481;
            C17973 c17973M17530 = c6041.m17530();
            if (c17973M17530 != null) {
                c17973M17530.m41933(c6041);
                return;
            }
            return;
        }
        if (abstractC16481 instanceof C17227) {
            m25538(c2551, ((C17227) abstractC16481).m40461());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25530(List list, List list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C18959 c18959 = (C18959) it.next();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i) == c18959) {
                    list.remove(i);
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25534(C2551 c2551, C18959 c18959) {
        if (c18959 == null) {
            return;
        }
        if (c18959.mo17865(EnumC1763.WRAPPED)) {
            m25538(c2551, c18959);
            return;
        }
        C21943 c21943M52162 = C23231.m52162(c2551, c18959);
        if (c21943M52162 != null) {
            m25537(c2551, c21943M52162, c18959);
            return;
        }
        c18959.mo17866(EnumC1763.DONT_GENERATE);
        c2551.m31138("Not found block with instruction: " + c18959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25537(C2551 c2551, C21943 c21943, C18959 c18959) {
        if (c21943.mo17865(EnumC1763.DUPLICATED)) {
            c2551.m31138("Instruction removed from duplicated block: " + c21943 + ", please report this as an issue");
        }
        m25538(c2551, c18959);
        m25541(c2551, c21943, c18959);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m25541(C2551 c2551, C21943 c21943, C18959 c18959) {
        Iterator it = ((ArrayList) c21943.mo1986()).iterator();
        while (it.hasNext()) {
            if (((C18959) it.next()) == c18959) {
                it.remove();
                return true;
            }
        }
        if (c18959.mo17865(EnumC1763.WRAPPED)) {
            return false;
        }
        c2551.m31138("Failed to remove instruction: " + c18959 + " from block: " + c21943);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25536(C2551 c2551, C21943 c21943, ArrayList arrayList) {
        m25539(c2551, arrayList);
        m25530(c21943.mo1986(), arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25532(C2551 c2551, List list) {
        m25539(c2551, list);
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            m25530(((C21943) it.next()).mo1986(), list);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25531(C2551 c2551) {
        C9804 c9804 = new C9804(null, c2551);
        for (C21943 c21943 : c2551.m8508()) {
            for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                if (c18959.mo17865(EnumC1763.REMOVE)) {
                    c9804.m25547(c18959);
                }
            }
            c9804.f31589 = c21943.mo1986();
            c9804.m25543();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25535(C2551 c2551, C18981 c18981) {
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            C6566 c6566 = (C6566) ((C21943) it.next()).mo17862((InterfaceC2157) C11457.f36001);
            if (c6566 != null) {
                C1170.removeIf((ArrayList) c6566.m18484(), new C18009(0, c18981));
            }
        }
    }
}
