package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܺۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16547 {
    public final InterfaceC8409 a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public abstract InterfaceC8409 b(InterfaceC8409 interfaceC8409);

    public AbstractC16547(InterfaceC8409 interfaceC8409, long j, long j2) {
        this.a = interfaceC8409;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public AbstractC16547(InterfaceC8409 interfaceC8409, AbstractC16547 abstractC16547) {
        this.a = interfaceC8409;
        this.b = abstractC16547.b;
        this.e = abstractC16547.e;
        this.d = abstractC16547.d;
        this.c = abstractC16547.c;
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long jMin;
        do {
            j2 = this.e.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.e.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public final EnumC4615 e() {
        if (this.e.get() > 0) {
            return EnumC4615.MAYBE_MORE;
        }
        return this.b ? EnumC4615.UNLIMITED : EnumC4615.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC8409 m39189trySplit() {
        InterfaceC8409 interfaceC8409TrySplit;
        if (this.e.get() == 0 || (interfaceC8409TrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(interfaceC8409TrySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m39190trySplit() {
        return (InterfaceC9154) m39189trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC7664 m39188trySplit() {
        return (InterfaceC7664) m39189trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9900 m39191trySplit() {
        return (InterfaceC9900) m39189trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC3012 trySplit() {
        return (InterfaceC3012) m39189trySplit();
    }
}
