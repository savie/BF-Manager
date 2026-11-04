package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֨ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1244 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f4505 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10192 m4496() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        C10192 c10192 = new C10192();
        do {
            atomicInteger = f4505;
            i = atomicInteger.get();
            if (i >= 128) {
                throw new IOException("Too many open hex file channels");
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return c10192;
    }
}
