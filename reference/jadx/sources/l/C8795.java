package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f30267;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f30269 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f30268 = new ArrayDeque();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f30266 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ExecutorService m22915() {
        if (this.f30267 == null) {
            this.f30267 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C0140.m1229("OkHttp Dispatcher", false));
        }
        return this.f30267;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22916(C3667 c3667) {
        this.f30266.add(c3667);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized int m22918() {
        return this.f30268.size() + this.f30266.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22917(C12841 c12841) {
        synchronized (this) {
            this.f30269.add(c12841);
        }
        m22914();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22914() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f30269.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C12841 c12841 = (C12841) it.next();
                if (this.f30268.size() >= 64) {
                    break;
                }
                Iterator it2 = this.f30268.iterator();
                while (it2.hasNext()) {
                    if (((C12841) it2.next()).f42714.f13419.f74015.f47339.equals(c12841.f42714.f13419.f74015.f47339)) {
                        i++;
                    }
                }
                if (i < 5) {
                    it.remove();
                    arrayList.add(c12841);
                    this.f30268.add(c12841);
                }
            }
            m22918();
        }
        int size = arrayList.size();
        while (i < size) {
            ((C12841) arrayList.get(i)).m31834(m22915());
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22920(C12841 c12841) {
        m22913(this.f30268, c12841);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22919(C3667 c3667) {
        m22913(this.f30266, c3667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22913(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m22914();
    }
}
