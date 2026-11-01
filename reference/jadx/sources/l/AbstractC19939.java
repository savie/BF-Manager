package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩶ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19939 {
    public final InterfaceC20693 a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public abstract InterfaceC20693 b(InterfaceC20693 interfaceC20693);

    public AbstractC19939(InterfaceC20693 interfaceC20693, long j, long j2) {
        this.a = interfaceC20693;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public AbstractC19939(InterfaceC20693 interfaceC20693, AbstractC19939 abstractC19939) {
        this.a = interfaceC20693;
        this.b = abstractC19939.b;
        this.e = abstractC19939.e;
        this.d = abstractC19939.d;
        this.c = abstractC19939.c;
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

    public final EnumC15000 e() {
        if (this.e.get() > 0) {
            return EnumC15000.MAYBE_MORE;
        }
        return this.b ? EnumC15000.UNLIMITED : EnumC15000.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC20693 m45237trySplit() {
        InterfaceC20693 interfaceC20693TrySplit;
        if (this.e.get() == 0 || (interfaceC20693TrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(interfaceC20693TrySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10110 m45234trySplit() {
        return (InterfaceC10110) m45237trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m45235trySplit() {
        return (InterfaceC18576) m45237trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19282 m45236trySplit() {
        return (InterfaceC19282) m45237trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC7535 trySplit() {
        return (InterfaceC7535) m45237trySplit();
    }
}
