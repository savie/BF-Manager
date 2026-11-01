package l;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۟۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f24390 = new AtomicLong(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f24391 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f24389 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8046());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C7340 f24388 = new C7340();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7340 m19608() {
        return f24388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19613(int i, String str) {
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return;
        }
        synchronized (c10163) {
            c10163.f34714 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19616(String str, AbstractC0656 abstractC0656, C18727 c18727) {
        boolean z;
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return;
        }
        synchronized (c10163) {
            c10163.f34710 = abstractC0656;
            c10163.f34700 = c18727;
            z = c10163.f34698;
        }
        if (z) {
            if (c18727 != null) {
                c18727.m43267((String) null);
            }
            abstractC0656.cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19614(String str, AbstractC0656 abstractC0656) {
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return;
        }
        synchronized (c10163) {
            if (c10163.f34720) {
                return;
            }
            c10163.f34706 = m19605(abstractC0656.m41586());
            c10163.f34715 = m19605(abstractC0656.m41576());
            c10163.f34704 = abstractC0656.m41564();
            c10163.f34717 = m19605((CharSequence) abstractC0656.mo2978());
            c10163.f34716 = abstractC0656.m2979();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19617(final String str, final String str2, String str3, C20321 c20321, C20321 c20322, C18727 c18727, boolean z) {
        C10163 c10163 = (C10163) this.f24391.get(str);
        boolean z2 = false;
        if (c10163 == null) {
            return false;
        }
        synchronized (c10163) {
            if (!c10163.f34720 && !c10163.f34698) {
                c10163.f34700 = c18727;
                m19609(c10163, true);
                c10163.f34694 = "waiting_conflict";
                c10163.f34705 = str2;
                c10163.f34719 = m19605((CharSequence) str3);
                c10163.f34696 = c20321;
                c10163.f34708 = c20322;
                c10163.f34695 = c18727.m43266();
                boolean z3 = C20370.m46024() && z;
                c10163.f34707 = z3;
                if (z3 && "replace".equals(c10163.f34695) && c18727.m43268()) {
                    z2 = true;
                }
                c10163.f34699 = z2;
                c10163.f34697 = f24389.schedule(new Callable() { // from class: l.᩵۠ۜ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.f62359.m19610(str, str2));
                    }
                }, 300000L, TimeUnit.MILLISECONDS);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19618(String str, String str2, String str3, boolean z, boolean z2) {
        C10163 c10163 = (C10163) this.f24391.get(str);
        boolean z3 = false;
        if (c10163 == null) {
            return false;
        }
        synchronized (c10163) {
            if (!c10163.f34720 && !TextUtils.isEmpty(c10163.f34705) && TextUtils.equals(c10163.f34705, str2) && c10163.f34700 != null && c10163.f34700.m43264(str2)) {
                C18727 c18727 = c10163.f34700;
                if (z2 && c10163.f34707) {
                    z3 = true;
                }
                m19609(c10163, true);
                c10163.f34694 = "running";
                return c18727.m43265(str2, str3, z, z3);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19615(String str, AbstractC0656 abstractC0656, C5202 c5202, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        String str2;
        List arrayList3;
        List arrayList4;
        List arrayList5;
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return;
        }
        synchronized (c10163) {
            m19609(c10163, false);
            c10163.f34720 = true;
            if (c5202.m14380()) {
                str2 = "success";
            } else {
                str2 = c5202.m14384() ? "cancelled" : "failure";
            }
            c10163.f34694 = str2;
            c10163.f34706 = m19605(abstractC0656.m41586());
            c10163.f34715 = m19605(abstractC0656.m41576());
            c10163.f34704 = abstractC0656.m41564();
            c10163.f34717 = m19605((CharSequence) abstractC0656.mo2978());
            c10163.f34716 = abstractC0656.m2979();
            c10163.f34709 = c5202.m14383() ? m19605((CharSequence) c5202.m14381()) : "";
            if (arrayList.isEmpty()) {
                arrayList3 = Collections.EMPTY_LIST;
            } else {
                arrayList3 = new ArrayList(arrayList);
            }
            c10163.f34701 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList4 = Collections.EMPTY_LIST;
            } else {
                arrayList4 = new ArrayList(arrayList2);
            }
            c10163.f34713 = arrayList4;
            c10163.f34703 = m19607(list);
            if (list2 == null || list2.isEmpty()) {
                arrayList5 = Collections.EMPTY_LIST;
            } else {
                arrayList5 = new ArrayList(list2);
            }
            c10163.f34702 = arrayList5;
            c10163.f34718 = SystemClock.elapsedRealtime();
            c10163.f34710 = null;
            c10163.f34700 = null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m19619(String str) {
        return m19610(str, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19610(String str, String str2) {
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return false;
        }
        synchronized (c10163) {
            if (c10163.f34720) {
                return true;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(c10163.f34705, str2)) {
                return true;
            }
            c10163.f34698 = true;
            AbstractC17902 abstractC17902 = c10163.f34710;
            int i = c10163.f34714;
            C18727 c18727 = c10163.f34700;
            m19609(c10163, true);
            c10163.f34694 = "running";
            if (c18727 != null) {
                c18727.m43267(str2);
            }
            if (abstractC17902 == null) {
                AbstractC17902 abstractC17902M46651 = C20725.m46651(i);
                if (abstractC17902M46651 != null) {
                    abstractC17902M46651.cancel();
                }
                return true;
            }
            abstractC17902.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19609(C10163 c10163, boolean z) {
        if (c10163.f34697 != null) {
            c10163.f34697.cancel(false);
            c10163.f34697 = null;
        }
        c10163.f34705 = "";
        c10163.f34719 = "";
        C20321 c20321 = C20321.f65801;
        c10163.f34696 = c20321;
        c10163.f34708 = c20321;
        c10163.f34695 = "";
        c10163.f34707 = false;
        c10163.f34699 = false;
        if (!c10163.f34720 && z && "waiting_conflict".equals(c10163.f34694)) {
            c10163.f34694 = "running";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19612(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ConcurrentMapC13783 concurrentMapC13783 = this.f24391;
        C9030.removeIf(concurrentMapC13783.entrySet(), new C8752(this, jElapsedRealtime));
        String str2 = "ft-" + this.f24390.getAndIncrement();
        concurrentMapC13783.put(str2, new C10163(str2, str));
        return str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m19620(String str) {
        LinkedHashMap linkedHashMapM25889;
        C9030.removeIf(this.f24391.entrySet(), new C8752(this, SystemClock.elapsedRealtime()));
        C10163 c10163 = (C10163) this.f24391.get(str);
        if (c10163 == null) {
            return null;
        }
        synchronized (c10163) {
            linkedHashMapM25889 = C10163.m25889(c10163);
        }
        return linkedHashMapM25889;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m19611(C7340 c7340, long j, Map.Entry entry) {
        boolean z;
        C10163 c10163 = (C10163) entry.getValue();
        synchronized (c10163) {
            z = c10163.f34720 && j - c10163.f34718 > 300000;
            if (z) {
                m19609(c10163, false);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19605(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19607(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map != null && !TextUtils.isEmpty((CharSequence) map.get("from")) && !TextUtils.isEmpty((CharSequence) map.get("to"))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", (String) map.get("from"));
                linkedHashMap.put("to", (String) map.get("to"));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList.isEmpty() ? Collections.EMPTY_LIST : arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m19606(C20321 c20321) {
        if (c20321 == null || !c20321.m45860()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c20321.m45858()));
        linkedHashMap.put("time", Long.valueOf(c20321.m45861()));
        return linkedHashMap;
    }
}
