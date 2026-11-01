package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12083 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40435;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f40436;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40437;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f40439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40440;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12083 mo15784(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15785(int i, Object obj);

    public AbstractC12083(C10672 c10672) {
        this.f40439 = c10672;
        this.f40436 = 0;
        this.f40435 = c10672.f36416;
        this.f40437 = 0;
        this.f40438 = c10672.f36419;
        this.f40440 = false;
    }

    public AbstractC12083(C10672 c10672, int i, int i2, boolean z) {
        this.f40439 = c10672;
        this.f40437 = 0;
        this.f40436 = i;
        this.f40435 = i2;
        this.f40438 = z;
        this.f40440 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f40438;
        C10672 c10672 = this.f40439;
        if (z) {
            this.f40438 = false;
            this.f40437++;
            mo15785(c10672.f36416, obj);
            return true;
        }
        int[] iArr = c10672.f36415;
        while (true) {
            int i = this.f40436;
            if (i >= this.f40435) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f40437++;
                this.f40436 = i + 1;
                mo15785(i, obj);
                return true;
            }
            this.f40436 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f40438;
        C10672 c10672 = this.f40439;
        if (z) {
            this.f40438 = false;
            this.f40437++;
            mo15785(c10672.f36416, obj);
        }
        int[] iArr = c10672.f36415;
        while (true) {
            int i = this.f40436;
            if (i >= this.f40435) {
                return;
            }
            if (iArr[i] != 0) {
                mo15785(i, obj);
                this.f40437++;
            }
            this.f40436++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f40440;
        C10672 c10672 = this.f40439;
        if (!z) {
            return c10672.f36410 - this.f40437;
        }
        int i = c10672.f36410;
        long j = i - this.f40437;
        if (c10672.f36419) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c10672.f36416)) * ((double) (this.f40435 - this.f40436)))) + (this.f40438 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC12083 m30071trySplit() {
        int i;
        int i2 = this.f40436;
        int i3 = this.f40435;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC12083 abstractC12083Mo15784 = mo15784(i2, i4, this.f40438);
        this.f40436 = i4;
        this.f40438 = false;
        this.f40440 = true;
        return abstractC12083Mo15784;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m30073trySplit() {
        return (InterfaceC20693) m30071trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) m30071trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m30072trySplit() {
        return (InterfaceC18576) m30071trySplit();
    }
}
