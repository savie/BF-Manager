package l;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۡܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8963 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19546[] f30699;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f30701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f30702;

    public C8963(InterfaceC20957[] interfaceC20957Arr) {
        this(Arrays.asList(interfaceC20957Arr));
    }

    public C8963(List list) {
        this.f30700 = new AtomicInteger();
        int i = 0;
        this.f30702 = false;
        this.f30699 = new C19546[list.size()];
        this.f30701 = new CountDownLatch(list.size());
        while (true) {
            C19546[] c19546Arr = this.f30699;
            if (i < c19546Arr.length) {
                c19546Arr[i] = new C19546(this, (InterfaceC20957) list.get(i));
                i++;
            } else {
                try {
                    this.f30701.await();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23259(ByteBuffer byteBuffer) {
        m23258(new C8257(byteBuffer), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23258(InputStream inputStream, C8516 c8516) {
        AtomicInteger atomicInteger;
        C18840 c18840 = new C18840();
        C18840 c18841 = new C18840();
        while (c18840.m43473(inputStream)) {
            do {
                atomicInteger = this.f30700;
                if (atomicInteger.get() == 0 || !c18840.m43471()) {
                    break;
                }
            } while (c18840.m43469(inputStream));
            if (c8516 != null) {
                c8516.m22242(c18840.m43472());
            }
            m23260(c18840);
            if (!c18841.m43473(inputStream)) {
                return;
            }
            while (atomicInteger.get() != 0 && c18841.m43471() && c18841.m43469(inputStream)) {
            }
            if (c8516 != null) {
                c8516.m22242(c18841.m43472());
            }
            m23260(c18841);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23260(C18840 c18840) {
        while (this.f30700.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f30700.set(this.f30699.length);
        for (C19546 c19546 : this.f30699) {
            c19546.f62820 = c18840;
            LockSupport.unpark(c19546);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (this.f30700.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f30702 = true;
        for (C19546 c19546 : this.f30699) {
            c19546.interrupt();
        }
    }
}
