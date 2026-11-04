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

/* JADX INFO: renamed from: l.᩷ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes.dex */
public final class C21949 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f70851 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8607(1));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C21949 f70852 = new C21949();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f70853 = new AtomicLong(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f70854 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21949 m49661() {
        return f70852;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49666(int i, String str) {
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return;
        }
        synchronized (c4795) {
            c4795.f16816 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49669(String str, AbstractC15118 abstractC15118, C25154 c25154) {
        boolean z;
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return;
        }
        synchronized (c4795) {
            c4795.f16804 = abstractC15118;
            c4795.f16801 = c25154;
            z = c4795.f16796;
        }
        if (z) {
            if (c25154 != null) {
                c25154.m56067((String) null);
            }
            abstractC15118.cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49667(String str, AbstractC15118 abstractC15118) {
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return;
        }
        synchronized (c4795) {
            if (c4795.f16818) {
                return;
            }
            c4795.f16799 = m49658(abstractC15118.m43866());
            c4795.f16812 = m49658(abstractC15118.m43839());
            c4795.f16798 = abstractC15118.m43849();
            c4795.f16795 = m49658((CharSequence) abstractC15118.mo29448());
            c4795.f16813 = abstractC15118.m36390();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49670(final String str, final String str2, String str3, C21578 c21578, C21578 c21579, C25154 c25154, boolean z) {
        C4795 c4795 = (C4795) this.f70854.get(str);
        boolean z2 = false;
        if (c4795 == null) {
            return false;
        }
        synchronized (c4795) {
            if (!c4795.f16818 && !c4795.f16796) {
                c4795.f16801 = c25154;
                m49662(c4795, true);
                c4795.f16809 = "waiting_conflict";
                c4795.f16800 = str2;
                c4795.f16805 = m49658((CharSequence) str3);
                c4795.f16815 = c21578;
                c4795.f16814 = c21579;
                c4795.f16803 = c25154.m56068();
                boolean z3 = C19632.m45281() && z;
                c4795.f16797 = z3;
                if (z3 && "replace".equals(c4795.f16803) && c25154.m56069()) {
                    z2 = true;
                }
                c4795.f16811 = z2;
                c4795.f16793 = f70851.schedule(new Callable() { // from class: l.ۜ֨ۧ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.f22651.m49663(str, str2));
                    }
                }, 300000L, TimeUnit.MILLISECONDS);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49671(String str, String str2, String str3, boolean z, boolean z2) {
        C4795 c4795 = (C4795) this.f70854.get(str);
        boolean z3 = false;
        if (c4795 == null) {
            return false;
        }
        synchronized (c4795) {
            if (!c4795.f16818 && !TextUtils.isEmpty(c4795.f16800) && TextUtils.equals(c4795.f16800, str2) && c4795.f16801 != null && c4795.f16801.m56065(str2)) {
                C25154 c25154 = c4795.f16801;
                if (z2 && c4795.f16797) {
                    z3 = true;
                }
                m49662(c4795, true);
                c4795.f16809 = "running";
                return c25154.m56066(str2, str3, z, z3);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49668(String str, AbstractC15118 abstractC15118, C12187 c12187, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        String str2;
        List arrayList3;
        List arrayList4;
        List arrayList5;
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return;
        }
        synchronized (c4795) {
            m49662(c4795, false);
            c4795.f16818 = true;
            if (c12187.m30474()) {
                str2 = "success";
            } else {
                str2 = c12187.m30473() ? "cancelled" : "failure";
            }
            c4795.f16809 = str2;
            c4795.f16799 = m49658(abstractC15118.m43866());
            c4795.f16812 = m49658(abstractC15118.m43839());
            c4795.f16798 = abstractC15118.m43849();
            c4795.f16795 = m49658((CharSequence) abstractC15118.mo29448());
            c4795.f16813 = abstractC15118.m36390();
            c4795.f16807 = c12187.m30472() ? m49658((CharSequence) c12187.m30470()) : "";
            if (arrayList.isEmpty()) {
                arrayList3 = Collections.EMPTY_LIST;
            } else {
                arrayList3 = new ArrayList(arrayList);
            }
            c4795.f16817 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList4 = Collections.EMPTY_LIST;
            } else {
                arrayList4 = new ArrayList(arrayList2);
            }
            c4795.f16806 = arrayList4;
            c4795.f16802 = m49660(list);
            if (list2 == null || list2.isEmpty()) {
                arrayList5 = Collections.EMPTY_LIST;
            } else {
                arrayList5 = new ArrayList(list2);
            }
            c4795.f16794 = arrayList5;
            c4795.f16808 = SystemClock.elapsedRealtime();
            c4795.f16804 = null;
            c4795.f16801 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m49672(String str) {
        return m49663(str, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49663(String str, String str2) {
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return false;
        }
        synchronized (c4795) {
            if (c4795.f16818) {
                return true;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(c4795.f16800, str2)) {
                return true;
            }
            c4795.f16796 = true;
            AbstractC18900 abstractC18900 = c4795.f16804;
            int i = c4795.f16816;
            C25154 c25154 = c4795.f16801;
            m49662(c4795, true);
            c4795.f16809 = "running";
            if (c25154 != null) {
                c25154.m56067(str2);
            }
            if (abstractC18900 == null) {
                AbstractC18900 abstractC18900M33457 = C13678.m33457(i);
                if (abstractC18900M33457 != null) {
                    abstractC18900M33457.cancel();
                }
                return true;
            }
            abstractC18900.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49662(C4795 c4795, boolean z) {
        if (c4795.f16793 != null) {
            c4795.f16793.cancel(false);
            c4795.f16793 = null;
        }
        c4795.f16800 = "";
        c4795.f16805 = "";
        C21578 c21578 = C21578.f68936;
        c4795.f16815 = c21578;
        c4795.f16814 = c21578;
        c4795.f16803 = "";
        c4795.f16797 = false;
        c4795.f16811 = false;
        if (!c4795.f16818 && z && "waiting_conflict".equals(c4795.f16809)) {
            c4795.f16809 = "running";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49665(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ConcurrentMapC17249 concurrentMapC17249 = this.f70854;
        C1170.removeIf(concurrentMapC17249.entrySet(), new C13504(this, jElapsedRealtime));
        String str2 = "ft-" + this.f70853.getAndIncrement();
        concurrentMapC17249.put(str2, new C4795(str2, str));
        return str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m49673(String str) {
        LinkedHashMap linkedHashMapM14796;
        C1170.removeIf(this.f70854.entrySet(), new C13504(this, SystemClock.elapsedRealtime()));
        C4795 c4795 = (C4795) this.f70854.get(str);
        if (c4795 == null) {
            return null;
        }
        synchronized (c4795) {
            linkedHashMapM14796 = C4795.m14796(c4795);
        }
        return linkedHashMapM14796;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49664(C21949 c21949, long j, Map.Entry entry) {
        boolean z;
        C4795 c4795 = (C4795) entry.getValue();
        synchronized (c4795) {
            z = c4795.f16818 && j - c4795.f16808 > 300000;
            if (z) {
                m49662(c4795, false);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49658(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m49660(List list) {
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
    public static LinkedHashMap m49659(C21578 c21578) {
        if (c21578 == null || !c21578.m49098()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c21578.m49097()));
        linkedHashMap.put("time", Long.valueOf(c21578.m49100()));
        return linkedHashMap;
    }
}
