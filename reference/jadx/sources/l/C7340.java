package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۜᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f24157;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24159 = new ArrayDeque();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24158 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24160 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ExecutorService m20146() {
        if (this.f24157 == null) {
            this.f24157 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C19822.m45599("OkHttp Dispatcher", false));
        }
        return this.f24157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20147(C18395 c18395) {
        this.f24160.add(c18395);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m20149() {
        return this.f24158.size() + this.f24160.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20148(C21379 c21379) {
        synchronized (this) {
            this.f24159.add(c21379);
        }
        m20145();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m20145() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f24159.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C21379 c21379 = (C21379) it.next();
                if (this.f24158.size() >= 64) {
                    break;
                }
                Iterator it2 = this.f24158.iterator();
                while (it2.hasNext()) {
                    if (((C21379) it2.next()).f68077.f59912.f26430.f55276.equals(c21379.f68077.f59912.f26430.f55276)) {
                        i++;
                    }
                }
                if (i < 5) {
                    it.remove();
                    arrayList.add(c21379);
                    this.f24158.add(c21379);
                }
            }
            m20149();
        }
        int size = arrayList.size();
        while (i < size) {
            ((C21379) arrayList.get(i)).m48613(m20146());
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20151(C21379 c21379) {
        m20144(this.f24158, c21379);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20150(C18395 c18395) {
        m20144(this.f24160, c18395);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20144(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m20145();
    }
}
