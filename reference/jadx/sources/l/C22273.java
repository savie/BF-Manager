package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩹ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes.dex */
public final class C22273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f72788 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5339 m49439() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        C5339 c5339 = new C5339();
        do {
            atomicInteger = f72788;
            i = atomicInteger.get();
            if (i >= 128) {
                throw new IOException("Too many open hex file channels");
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return c5339;
    }
}
