package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21336 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f69441;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f69442;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f69443;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f69444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69445;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21336 mo10864(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10865(int i, Object obj);

    public AbstractC21336(C7931 c7931) {
        this.f69444 = c7931;
        this.f69441 = 0;
        this.f69440 = c7931.f26057;
        this.f69442 = 0;
        this.f69443 = c7931.f26053;
        this.f69445 = false;
    }

    public AbstractC21336(C7931 c7931, int i, int i2, boolean z) {
        this.f69444 = c7931;
        this.f69442 = 0;
        this.f69441 = i;
        this.f69440 = i2;
        this.f69443 = z;
        this.f69445 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f69443;
        C7931 c7931 = this.f69444;
        if (z) {
            this.f69443 = false;
            this.f69442++;
            mo10865(c7931.f26057, obj);
            return true;
        }
        int[] iArr = c7931.f26054;
        while (true) {
            int i = this.f69441;
            if (i >= this.f69440) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f69442++;
                this.f69441 = i + 1;
                mo10865(i, obj);
                return true;
            }
            this.f69441 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f69443;
        C7931 c7931 = this.f69444;
        if (z) {
            this.f69443 = false;
            this.f69442++;
            mo10865(c7931.f26057, obj);
        }
        int[] iArr = c7931.f26054;
        while (true) {
            int i = this.f69441;
            if (i >= this.f69440) {
                return;
            }
            if (iArr[i] != 0) {
                mo10865(i, obj);
                this.f69442++;
            }
            this.f69441++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f69445;
        C7931 c7931 = this.f69444;
        if (!z) {
            return c7931.f26052 - this.f69442;
        }
        int i = c7931.f26052;
        long j = i - this.f69442;
        if (c7931.f26053) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c7931.f26057)) * ((double) (this.f69440 - this.f69441)))) + (this.f69443 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC21336 m47869trySplit() {
        int i;
        int i2 = this.f69441;
        int i3 = this.f69440;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC21336 abstractC21336Mo10864 = mo10864(i2, i4, this.f69443);
        this.f69441 = i4;
        this.f69443 = false;
        this.f69445 = true;
        return abstractC21336Mo10864;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m47868trySplit() {
        return (InterfaceC20693) m47869trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) m47869trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m47867trySplit() {
        return (InterfaceC18576) m47869trySplit();
    }
}
