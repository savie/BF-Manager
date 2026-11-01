package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9D4 */
/* JADX INFO: loaded from: classes3.dex */
public class C9363 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31720 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9363 m24010() {
        if (this.f31720.getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24011() {
        return this.f31720.decrementAndGet() <= 0;
    }
}
