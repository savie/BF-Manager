package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18581 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f60360;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f60361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60362;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60363;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f60364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60365;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18581 mo11910(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11911(int i, Object obj);

    public AbstractC18581(C19327 c19327) {
        this.f60364 = c19327;
        this.f60361 = 0;
        this.f60363 = c19327.f62435;
        this.f60362 = 0;
        this.f60360 = c19327.f62437;
        this.f60365 = false;
    }

    public AbstractC18581(C19327 c19327, int i, int i2, boolean z) {
        this.f60364 = c19327;
        this.f60362 = 0;
        this.f60361 = i;
        this.f60363 = i2;
        this.f60360 = z;
        this.f60365 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f60360;
        C19327 c19327 = this.f60364;
        if (z) {
            this.f60360 = false;
            this.f60362++;
            mo11911(c19327.f62435, obj);
            return true;
        }
        int[] iArr = c19327.f62429;
        while (true) {
            int i = this.f60361;
            if (i >= this.f60363) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f60362++;
                this.f60361 = i + 1;
                mo11911(i, obj);
                return true;
            }
            this.f60361 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f60360;
        C19327 c19327 = this.f60364;
        if (z) {
            this.f60360 = false;
            this.f60362++;
            mo11911(c19327.f62435, obj);
        }
        int[] iArr = c19327.f62429;
        while (true) {
            int i = this.f60361;
            if (i >= this.f60363) {
                return;
            }
            if (iArr[i] != 0) {
                mo11911(i, obj);
                this.f60362++;
            }
            this.f60361++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f60365;
        C19327 c19327 = this.f60364;
        if (!z) {
            return c19327.f62431 - this.f60362;
        }
        int i = c19327.f62431;
        long j = i - this.f60362;
        if (c19327.f62437) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c19327.f62435)) * ((double) (this.f60363 - this.f60361)))) + (this.f60360 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC18581 m43162trySplit() {
        int i;
        int i2 = this.f60361;
        int i3 = this.f60363;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC18581 abstractC18581Mo11910 = mo11910(i2, i4, this.f60360);
        this.f60361 = i4;
        this.f60360 = false;
        this.f60365 = true;
        return abstractC18581Mo11910;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8409 m43160trySplit() {
        return (InterfaceC8409) m43162trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) m43162trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m43161trySplit() {
        return (InterfaceC9154) m43162trySplit();
    }
}
