package l;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩻ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes.dex */
public final class C25151 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f81289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f81290;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11724[] f81291;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f81292;

    public C25151(InterfaceC16199[] interfaceC16199Arr) {
        this(Arrays.asList(interfaceC16199Arr));
    }

    public C25151(List list) {
        this.f81290 = new AtomicInteger();
        int i = 0;
        this.f81292 = false;
        this.f81291 = new C11724[list.size()];
        this.f81289 = new CountDownLatch(list.size());
        while (true) {
            C11724[] c11724Arr = this.f81291;
            if (i < c11724Arr.length) {
                c11724Arr[i] = new C11724(this, (InterfaceC16199) list.get(i));
                i++;
            } else {
                try {
                    this.f81289.await();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56055(ByteBuffer byteBuffer) {
        m56054(new C2030(byteBuffer), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56054(InputStream inputStream, C3374 c3374) {
        AtomicInteger atomicInteger;
        C5759 c5759 = new C5759();
        C5759 c57510 = new C5759();
        while (c5759.m16834(inputStream)) {
            do {
                atomicInteger = this.f81290;
                if (atomicInteger.get() == 0 || !c5759.m16832()) {
                    break;
                }
            } while (c5759.m16830(inputStream));
            if (c3374 != null) {
                c3374.m11079(c5759.m16833());
            }
            m56056(c5759);
            if (!c57510.m16834(inputStream)) {
                return;
            }
            while (atomicInteger.get() != 0 && c57510.m16832() && c57510.m16830(inputStream)) {
            }
            if (c3374 != null) {
                c3374.m11079(c57510.m16833());
            }
            m56056(c57510);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56056(C5759 c5759) {
        while (this.f81290.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f81290.set(this.f81291.length);
        for (C11724 c11724 : this.f81291) {
            c11724.f37931 = c5759;
            LockSupport.unpark(c11724);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (this.f81290.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f81292 = true;
        for (C11724 c11724 : this.f81291) {
            c11724.interrupt();
        }
    }
}
