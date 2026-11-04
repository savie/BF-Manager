package l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B78Q */
/* JADX INFO: loaded from: classes.dex */
public final class C21986 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Runnable f70939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C13921 f70935 = new C13921(1);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C14109 f70934 = new C14109();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RunnableC7398 f70937 = new Runnable() { // from class: l.ۜ᩷֫
        @Override // java.lang.Runnable
        public final void run() {
            C21986.m49719(this.f24379);
        }
    };

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f70941 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f70940 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13921 f70936 = f70935;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14109 f70938 = f70934;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۜ᩷֫] */
    public C21986(Runnable runnable) {
        this.f70939 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49721(int i) {
        if (i < 1 || i > 999) {
            throw new IllegalArgumentException("Minutes must be between 1 and 999");
        }
        this.f70936.getClass();
        this.f70940 = (((long) i) * 60000) + SystemClock.elapsedRealtime();
        long jM49724 = m49724();
        this.f70938.getClass();
        Handler handlerM49077 = C21576.m49077();
        RunnableC7398 runnableC7398 = this.f70937;
        handlerM49077.removeCallbacks(runnableC7398);
        C21576.m49077().postDelayed(runnableC7398, Math.max(jM49724, 0L));
        Iterator it = new ArrayList(this.f70941).iterator();
        while (it.hasNext()) {
            ((InterfaceC4832) it.next()).mo8856();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m49724() {
        long j = this.f70940;
        if (j == -1) {
            return 0L;
        }
        this.f70936.getClass();
        return Math.max(j - SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49723() {
        long jM49724 = m49724();
        if (jM49724 <= 0) {
            return 0;
        }
        return (int) ((jM49724 + 59999) / 60000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49722(InterfaceC4832 interfaceC4832) {
        ArrayList arrayList = this.f70941;
        if (arrayList.contains(interfaceC4832)) {
            return;
        }
        arrayList.add(interfaceC4832);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49725(InterfaceC4832 interfaceC4832) {
        this.f70941.remove(interfaceC4832);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49719(C21986 c21986) {
        RunnableC7398 runnableC7398 = c21986.f70937;
        C14109 c14109 = c21986.f70938;
        if (c21986.f70940 != -1) {
            long jM49724 = c21986.m49724();
            if (jM49724 <= 0) {
                c14109.getClass();
                C21576.m49077().removeCallbacks(runnableC7398);
                boolean z = c21986.f70940 != -1;
                c21986.f70940 = -1L;
                if (z) {
                    Iterator it = new ArrayList(c21986.f70941).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4832) it.next()).mo8856();
                    }
                }
                c21986.f70939.run();
                return;
            }
            c14109.getClass();
            C21576.m49077().removeCallbacks(runnableC7398);
            C21576.m49077().postDelayed(runnableC7398, Math.max(jM49724, 0L));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49720() {
        this.f70938.getClass();
        C21576.m49077().removeCallbacks(this.f70937);
        boolean z = this.f70940 != -1;
        this.f70940 = -1L;
        if (z) {
            Iterator it = new ArrayList(this.f70941).iterator();
            while (it.hasNext()) {
                ((InterfaceC4832) it.next()).mo8856();
            }
        }
    }
}
