package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0999 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f4669;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4670;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4671;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f4672;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f4673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4674;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0999 mo3825(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo3826(int i, Object obj);

    public AbstractC0999(C6644 c6644) {
        this.f4673 = c6644;
        this.f4670 = 0;
        this.f4669 = c6644.f22445;
        this.f4671 = 0;
        this.f4672 = c6644.f22441;
        this.f4674 = false;
    }

    public AbstractC0999(C6644 c6644, int i, int i2, boolean z) {
        this.f4673 = c6644;
        this.f4671 = 0;
        this.f4670 = i;
        this.f4669 = i2;
        this.f4672 = z;
        this.f4674 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f4672;
        C6644 c6644 = this.f4673;
        if (z) {
            this.f4672 = false;
            this.f4671++;
            mo3826(c6644.f22445, obj);
            return true;
        }
        Object[] objArr = c6644.f22442;
        while (true) {
            int i = this.f4670;
            if (i >= this.f4669) {
                return false;
            }
            if (objArr[i] != null) {
                this.f4671++;
                this.f4670 = i + 1;
                mo3826(i, obj);
                return true;
            }
            this.f4670 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f4672;
        C6644 c6644 = this.f4673;
        if (z) {
            this.f4672 = false;
            this.f4671++;
            mo3826(c6644.f22445, obj);
        }
        Object[] objArr = c6644.f22442;
        while (true) {
            int i = this.f4670;
            if (i >= this.f4669) {
                return;
            }
            if (objArr[i] != null) {
                mo3826(i, obj);
                this.f4671++;
            }
            this.f4670++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f4674;
        C6644 c6644 = this.f4673;
        if (!z) {
            return c6644.f22440 - this.f4671;
        }
        int i = c6644.f22440;
        long j = i - this.f4671;
        if (c6644.f22441) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c6644.f22445)) * ((double) (this.f4669 - this.f4670)))) + (this.f4672 ? 1L : 0L));
    }

    public final AbstractC0999 trySplit() {
        int i;
        int i2 = this.f4670;
        int i3 = this.f4669;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC0999 abstractC0999Mo3825 = mo3825(i2, i4, this.f4672);
        this.f4670 = i4;
        this.f4672 = false;
        this.f4674 = true;
        return abstractC0999Mo3825;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m3829trySplit() {
        return (InterfaceC20693) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10110 m3827trySplit() {
        return (InterfaceC10110) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m3828trySplit() {
        return (InterfaceC18576) trySplit();
    }
}
