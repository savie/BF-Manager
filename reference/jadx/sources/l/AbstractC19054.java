package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19054 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f61612;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61613;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61614;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f61615;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f61616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61617;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC19054 mo4946(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4947(int i, Object obj);

    public AbstractC19054(C9177 c9177) {
        this.f61616 = c9177;
        this.f61613 = 0;
        this.f61612 = c9177.f31231;
        this.f61614 = 0;
        this.f61615 = c9177.f31234;
        this.f61617 = false;
    }

    public AbstractC19054(C9177 c9177, int i, int i2, boolean z) {
        this.f61616 = c9177;
        this.f61614 = 0;
        this.f61613 = i;
        this.f61612 = i2;
        this.f61615 = z;
        this.f61617 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f61615;
        C9177 c9177 = this.f61616;
        if (z) {
            this.f61615 = false;
            this.f61614++;
            mo4947(c9177.f31231, obj);
            return true;
        }
        int[] iArr = c9177.f31228;
        while (true) {
            int i = this.f61613;
            if (i >= this.f61612) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f61614++;
                this.f61613 = i + 1;
                mo4947(i, obj);
                return true;
            }
            this.f61613 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f61615;
        C9177 c9177 = this.f61616;
        if (z) {
            this.f61615 = false;
            this.f61614++;
            mo4947(c9177.f31231, obj);
        }
        int[] iArr = c9177.f31228;
        while (true) {
            int i = this.f61613;
            if (i >= this.f61612) {
                return;
            }
            if (iArr[i] != 0) {
                mo4947(i, obj);
                this.f61614++;
            }
            this.f61613++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f61617;
        C9177 c9177 = this.f61616;
        if (!z) {
            return c9177.f31238 - this.f61614;
        }
        int i = c9177.f31238;
        long j = i - this.f61614;
        if (c9177.f31234) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c9177.f31231)) * ((double) (this.f61612 - this.f61613)))) + (this.f61615 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC19054 m43798trySplit() {
        int i;
        int i2 = this.f61613;
        int i3 = this.f61612;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC19054 abstractC19054Mo4946 = mo4946(i2, i4, this.f61615);
        this.f61613 = i4;
        this.f61615 = false;
        this.f61617 = true;
        return abstractC19054Mo4946;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m43799trySplit() {
        return (InterfaceC20693) m43798trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) m43798trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m43797trySplit() {
        return (InterfaceC18576) m43798trySplit();
    }
}
