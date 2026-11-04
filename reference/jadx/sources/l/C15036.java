package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes4.dex */
public final class C15036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10561 f49081;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4769 f49082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f49084;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RunnableC24487 f49086;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f49085 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f49087 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f49088 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f49083 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36193() {
        this.f49085.clear();
        this.f49087.clear();
        this.f49088.clear();
        this.f49083.clear();
        this.f49081 = null;
        this.f49082 = null;
        this.f49084++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36194(Uri uri, C24907 c24907) {
        C4769 c4769 = this.f49082;
        if (c24907 != null && c4769 != null) {
            C15955 c15955Mo1870 = c4769.mo1870();
            if (c15955Mo1870 != null && c15955Mo1870.f51802.isEmpty()) {
                Iterator it = c15955Mo1870.f51801.iterator();
                while (it.hasNext()) {
                    if (((C17447) it.next()).f56744.equals(uri)) {
                        if (this.f49083.get(uri) == c24907) {
                            return;
                        }
                        this.f49083.put(uri, c24907);
                        if (this.f49081 != null) {
                            this.f49081 = null;
                            this.f49086.run();
                        }
                        m36191(c4769, c15955Mo1870);
                        this.f49084++;
                        return;
                    }
                }
                return;
            }
            m36192();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36195(C4769 c4769) {
        this.f49082 = c4769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36196(C25368 c25368) {
        Uri uri = c25368.f81907;
        long j = c25368.f81909;
        long j2 = c25368.f81910;
        if (j2 == -1) {
            j2 = -1;
        }
        C19512 c19512 = new C19512(uri, j, j2);
        if (this.f49088.contains(c19512)) {
            return;
        }
        if (this.f49087.contains(c19512)) {
            if (this.f49081 != null) {
                this.f49081 = null;
                this.f49086.run();
            }
            return;
        }
        C22496 c22496 = (C22496) this.f49085.get(c19512);
        C4769 c4769 = this.f49082;
        if (c22496 != null && c4769 != null) {
            C10561 c10561 = new C10561(c22496.f72788, this.f49084, c22496.f72786, c4769.mo1862(), c19512, c22496.f72787);
            C10561 c10562 = this.f49081;
            if (c10562 != null && (!c10562.f33555.equals(c10561.f33555) || this.f49081.f33552 != c10561.f33552)) {
                this.f49086.run();
            }
            this.f49081 = c10561;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C10561 m36197() {
        return this.f49081;
    }

    public C15036(RunnableC24487 runnableC24487) {
        this.f49086 = runnableC24487;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m36192() {
        HashMap map = this.f49085;
        boolean zIsEmpty = map.isEmpty();
        HashSet hashSet = this.f49088;
        HashSet hashSet2 = this.f49087;
        if (zIsEmpty && hashSet2.isEmpty() && hashSet.isEmpty() && this.f49081 == null) {
            return;
        }
        map.clear();
        hashSet2.clear();
        hashSet.clear();
        this.f49083.clear();
        this.f49081 = null;
        this.f49084++;
        this.f49086.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36191(C4769 c4769, C15955 c15955) {
        long j;
        HashMap map = this.f49085;
        map.clear();
        HashSet hashSet = this.f49087;
        hashSet.clear();
        HashSet hashSet2 = this.f49088;
        hashSet2.clear();
        HashMap map2 = this.f49083;
        map2.clear();
        Iterator it = c15955.f51801.iterator();
        while (it.hasNext()) {
            Uri uri = ((C17447) it.next()).f56744;
            C24907 c24907Mo1863 = c4769.mo1863(uri, false);
            if (c24907Mo1863 != null) {
                String str = c24907Mo1863.f75794;
                map2.put(uri, c24907Mo1863);
                for (C5515 c5515 : c24907Mo1863.f80607) {
                    C5515 c5516 = c5515.f6094;
                    if (c5516 != null) {
                        j = -1;
                        Uri uriM24651 = C9352.m24651(str, c5516.f6097);
                        long j2 = c5516.f6103;
                        long j3 = c5516.f6100;
                        hashSet2.add(new C19512(uriM24651, j2, j3 == -1 ? -1L : j3));
                    } else {
                        j = -1;
                    }
                    Uri uriM24652 = C9352.m24651(str, c5515.f6097);
                    long j4 = c5515.f6103;
                    String str2 = str;
                    long j5 = c5515.f6100;
                    C19512 c19512 = new C19512(uriM24652, j4, j5 == j ? j : j5);
                    if (((C22496) C11392.putIfAbsent(map, c19512, new C22496(uri, c24907Mo1863, c5515))) != null) {
                        map.remove(c19512);
                        hashSet.add(c19512);
                    }
                    str = str2;
                    map2 = map2;
                    it = it;
                }
            }
        }
    }
}
