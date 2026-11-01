package l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B78Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10647 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C0219 f36319 = new C0219();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C16996 f36320 = new C16996();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Runnable f36323;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RunnableC12058 f36324 = new Runnable() { // from class: l.۫֡۬
        @Override // java.lang.Runnable
        public final void run() {
            C10647.m26832(this.f40340);
        }
    };

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36321 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f36325 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0219 f36322 = f36319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16996 f36326 = f36320;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۫֡۬] */
    public C10647(Runnable runnable) {
        this.f36323 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26834(int i) {
        if (i < 1 || i > 999) {
            throw new IllegalArgumentException("Minutes must be between 1 and 999");
        }
        this.f36322.getClass();
        this.f36325 = (((long) i) * 60000) + SystemClock.elapsedRealtime();
        long jM26837 = m26837();
        this.f36326.getClass();
        Handler handlerM39278 = C16737.m39278();
        RunnableC12058 runnableC12058 = this.f36324;
        handlerM39278.removeCallbacks(runnableC12058);
        C16737.m39278().postDelayed(runnableC12058, Math.max(jM26837, 0L));
        Iterator it = new ArrayList(this.f36321).iterator();
        while (it.hasNext()) {
            ((InterfaceC5707) it.next()).mo15742();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m26837() {
        long j = this.f36325;
        if (j == -1) {
            return 0L;
        }
        this.f36322.getClass();
        return Math.max(j - SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26836() {
        long jM26837 = m26837();
        if (jM26837 <= 0) {
            return 0;
        }
        return (int) ((jM26837 + 59999) / 60000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26835(InterfaceC5707 interfaceC5707) {
        ArrayList arrayList = this.f36321;
        if (arrayList.contains(interfaceC5707)) {
            return;
        }
        arrayList.add(interfaceC5707);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26838(InterfaceC5707 interfaceC5707) {
        this.f36321.remove(interfaceC5707);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26832(C10647 c10647) {
        RunnableC12058 runnableC12058 = c10647.f36324;
        C16996 c16996 = c10647.f36326;
        if (c10647.f36325 != -1) {
            long jM26837 = c10647.m26837();
            if (jM26837 <= 0) {
                c16996.getClass();
                C16737.m39278().removeCallbacks(runnableC12058);
                boolean z = c10647.f36325 != -1;
                c10647.f36325 = -1L;
                if (z) {
                    Iterator it = new ArrayList(c10647.f36321).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5707) it.next()).mo15742();
                    }
                }
                c10647.f36323.run();
                return;
            }
            c16996.getClass();
            C16737.m39278().removeCallbacks(runnableC12058);
            C16737.m39278().postDelayed(runnableC12058, Math.max(jM26837, 0L));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26833() {
        this.f36326.getClass();
        C16737.m39278().removeCallbacks(this.f36324);
        boolean z = this.f36325 != -1;
        this.f36325 = -1L;
        if (z) {
            Iterator it = new ArrayList(this.f36321).iterator();
            while (it.hasNext()) {
                ((InterfaceC5707) it.next()).mo15742();
            }
        }
    }
}
