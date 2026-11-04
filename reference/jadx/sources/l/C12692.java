package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۨ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12692 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40653;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicLong[] f40654 = new AtomicLong[100];

    public C12692() {
        for (int i = 0; i < 100; i++) {
            this.f40654[i] = new AtomicLong(-1L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31489(C18257 c18257) {
        long millis = c18257.toMillis();
        synchronized (this) {
            this.f40654[this.f40653].set(millis);
            int i = this.f40653 + 1;
            this.f40653 = i;
            if (i == 100) {
                this.f40653 = 0;
            }
        }
    }

    public final String toString() {
        List list;
        StringBuilder sb = new StringBuilder("StatsStore [");
        synchronized (this) {
            list = (List) C13847.stream(this.f40654, 0, this.f40653).collect(C2025.toList());
        }
        sb.append(list);
        sb.append("], size=100, index=");
        return C12669.m31437(this.f40653, "]", sb);
    }
}
