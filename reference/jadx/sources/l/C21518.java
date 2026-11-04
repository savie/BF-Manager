package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VIV1 */
/* JADX INFO: loaded from: classes.dex */
public final class C21518 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68755 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f68756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3618 f68757;

    static {
        C16980.m40037(C21518.class);
    }

    public C21518(C2551 c2551, C3618 c3618) {
        this.f68756 = c2551;
        this.f68757 = c3618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m48923(C12050 c12050, C21943 c21943, C18959 c18959, C12567 c12567) {
        C2551 c2551;
        C21001 c21001 = new C21001(c12050, c18959);
        ((ArrayList) c21001.mo19035()).add(c21943);
        ((ArrayList) c12050.mo19035()).add(c21001);
        LinkedHashSet<C21943> linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        m48922(c21001, c18959.mo44035(0), c21943, linkedHashSet, hashSet);
        Iterator it = c21001.m48017().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2551 = this.f68756;
            if (!zHasNext) {
                break;
            }
            C18959 c189510 = (C18959) it.next();
            C21943 c21943M52162 = C23231.m52162(c2551, c189510);
            if (c21943M52162 != null) {
                c21943M52162.mo17866(EnumC1763.DONT_GENERATE);
            }
            c189510.mo44028(0);
            c189510.mo17866(EnumC1763.DONT_GENERATE);
        }
        C21943 c21943M52207 = C23231.m52207(c21943);
        C21943 c21943M48921 = null;
        if (c21943M52207 == null) {
            c2551.m31136("Unexpected end of synchronized block");
            return null;
        }
        if (linkedHashSet.size() == 1) {
            c21943M48921 = C23231.m52207((C21943) linkedHashSet.iterator().next());
        } else if (linkedHashSet.size() > 1) {
            hashSet.clear();
            c21943M48921 = m48921(c21943M52207, linkedHashSet, hashSet);
        }
        c12567.m31276(c21001);
        if (c21943M48921 != null) {
            c12567.m31277(c21943M48921);
        } else {
            for (C21943 c21944 : linkedHashSet) {
                List listM52152 = C23231.m52152(c21944);
                if (listM52152.isEmpty() || !C23231.m52180((C21943) C4123.m13231(listM52152), c2551)) {
                    c12567.m31277(c21944);
                    c21943M48921 = c21944;
                }
            }
        }
        ((ArrayList) c21001.mo19035()).add(this.f68757.m11737(c21943M52207));
        c12567.m31282();
        return c21943M48921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48922(C21001 c21001, AbstractC16481 abstractC16481, C21943 c21943, LinkedHashSet linkedHashSet, HashSet hashSet) {
        hashSet.add(c21943);
        for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
            if (c18959.getType() == EnumC24203.MONITOR_EXIT && c18959.m44039() > 0 && c18959.mo44035(0).equals(abstractC16481)) {
                linkedHashSet.add(c21943);
                c21001.m48017().add(c18959);
                return;
            }
        }
        for (C21943 c21944 : c21943.m49646()) {
            if (!hashSet.contains(c21944)) {
                m48922(c21001, abstractC16481, c21944, linkedHashSet, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m48921(C21943 c21943, LinkedHashSet linkedHashSet, HashSet hashSet) {
        hashSet.add(c21943);
        loop0: for (C21943 c21943M48921 : c21943.m49639()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (!C23231.m52193((C21943) it.next(), c21943M48921)) {
                    if (!hashSet.contains(c21943M48921) && (c21943M48921 = m48921(c21943M48921, linkedHashSet, hashSet)) != null) {
                        break loop0;
                    }
                }
            }
            return c21943M48921;
        }
        return null;
    }
}
