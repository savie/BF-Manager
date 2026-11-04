package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10924 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f34579;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f34580;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34581;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34582;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f34583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f34584;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC10924 mo3732(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3733(int i, Object obj);

    public AbstractC10924(C15399 c15399) {
        this.f34583 = c15399;
        this.f34580 = 0;
        this.f34582 = c15399.f50194;
        this.f34581 = 0;
        this.f34579 = c15399.f50203;
        this.f34584 = false;
    }

    public AbstractC10924(C15399 c15399, int i, int i2, boolean z) {
        this.f34583 = c15399;
        this.f34581 = 0;
        this.f34580 = i;
        this.f34582 = i2;
        this.f34579 = z;
        this.f34584 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f34579;
        C15399 c15399 = this.f34583;
        if (z) {
            this.f34579 = false;
            this.f34581++;
            mo3733(c15399.f50194, obj);
            return true;
        }
        int[] iArr = c15399.f50196;
        while (true) {
            int i = this.f34580;
            if (i >= this.f34582) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f34581++;
                this.f34580 = i + 1;
                mo3733(i, obj);
                return true;
            }
            this.f34580 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f34579;
        C15399 c15399 = this.f34583;
        if (z) {
            this.f34579 = false;
            this.f34581++;
            mo3733(c15399.f50194, obj);
        }
        int[] iArr = c15399.f50196;
        while (true) {
            int i = this.f34580;
            if (i >= this.f34582) {
                return;
            }
            if (iArr[i] != 0) {
                mo3733(i, obj);
                this.f34581++;
            }
            this.f34580++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f34584;
        C15399 c15399 = this.f34583;
        if (!z) {
            return c15399.f50197 - this.f34581;
        }
        int i = c15399.f50197;
        long j = i - this.f34581;
        if (c15399.f50203) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c15399.f50194)) * ((double) (this.f34582 - this.f34580)))) + (this.f34579 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC10924 m27725trySplit() {
        int i;
        int i2 = this.f34580;
        int i3 = this.f34582;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC10924 abstractC10924Mo3732 = mo3732(i2, i4, this.f34579);
        this.f34580 = i4;
        this.f34579 = false;
        this.f34584 = true;
        return abstractC10924Mo3732;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8409 m27723trySplit() {
        return (InterfaceC8409) m27725trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) m27725trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m27724trySplit() {
        return (InterfaceC9154) m27725trySplit();
    }
}
