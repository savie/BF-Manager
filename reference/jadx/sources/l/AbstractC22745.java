package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.᩸ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22745 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC2213 f73807;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f73808;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C13399 f73809;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f73810 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3353 f73811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13399 f73812;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicReferenceArray f73814;

    public AbstractC22745(ConcurrentMapC5942 concurrentMapC5942) {
        this.f73808 = concurrentMapC5942;
        this.f73813 = concurrentMapC5942.f20356.length - 1;
        m51283();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51283() {
        this.f73809 = null;
        if (m51285() || m51287()) {
            return;
        }
        while (true) {
            int i = this.f73813;
            if (i < 0) {
                return;
            }
            C3353[] c3353Arr = this.f73808.f20356;
            this.f73813 = i - 1;
            C3353 c3353 = c3353Arr[i];
            this.f73811 = c3353;
            if (c3353.f10953 != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f73811.f10942;
                this.f73814 = atomicReferenceArray;
                this.f73810 = atomicReferenceArray.length() - 1;
                if (m51287()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m51285() {
        InterfaceC2213 interfaceC2213 = this.f73807;
        if (interfaceC2213 == null) {
            return false;
        }
        while (true) {
            this.f73807 = interfaceC2213.getNext();
            InterfaceC2213 interfaceC2214 = this.f73807;
            if (interfaceC2214 == null) {
                return false;
            }
            if (m51284(interfaceC2214)) {
                return true;
            }
            interfaceC2213 = this.f73807;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m51287() {
        while (true) {
            int i = this.f73810;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f73814;
            this.f73810 = i - 1;
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(i);
            this.f73807 = interfaceC2213;
            if (interfaceC2213 != null && (m51284(interfaceC2213) || m51285())) {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51284(InterfaceC2213 interfaceC2213) {
        Object obj;
        C3353 c3353;
        ConcurrentMapC5942 concurrentMapC5942 = this.f73808;
        try {
            long jMo37347 = concurrentMapC5942.f20353.mo37347();
            Object key = interfaceC2213.getKey();
            Object obj2 = null;
            if (interfaceC2213.getKey() != null && (obj = interfaceC2213.mo7552().get()) != null && !concurrentMapC5942.m17296(interfaceC2213, jMo37347)) {
                obj2 = obj;
            }
            if (obj2 == null) {
                return false;
            }
            this.f73809 = new C13399(concurrentMapC5942, key, obj2);
            return true;
        } finally {
            this.f73811.m11028();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f73809 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13399 m51286() {
        C13399 c13399 = this.f73809;
        if (c13399 == null) {
            throw new NoSuchElementException();
        }
        this.f73812 = c13399;
        m51283();
        return this.f73812;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C12128.m30315(this.f73812 != null);
        this.f73808.remove(this.f73812.f42701);
        this.f73812 = null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m51286();
    }
}
