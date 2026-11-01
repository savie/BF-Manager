package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12862;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong[] f12863 = new AtomicLong[100];

    public C3510() {
        for (int i = 0; i < 100; i++) {
            this.f12863[i] = new AtomicLong(-1L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10337(C21813 c21813) {
        long millis = c21813.toMillis();
        synchronized (this) {
            this.f12863[this.f12862].set(millis);
            int i = this.f12862 + 1;
            this.f12862 = i;
            if (i == 100) {
                this.f12862 = 0;
            }
        }
    }

    public final String toString() {
        List list;
        StringBuilder sb = new StringBuilder("StatsStore [");
        synchronized (this) {
            list = (List) C20318.stream(this.f12863, 0, this.f12862).collect(C1890.toList());
        }
        sb.append(list);
        sb.append("], size=100, index=");
        return C12441.m30911(this.f12862, "]", sb);
    }
}
