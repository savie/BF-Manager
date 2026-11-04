package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8228 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f27080;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f27081;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f27082;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27083;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f27084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27085;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC8228 mo22133(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22134(int i, Object obj);

    public AbstractC8228(C1516 c1516) {
        this.f27084 = c1516;
        this.f27081 = 0;
        this.f27083 = c1516.f5288;
        this.f27082 = 0;
        this.f27080 = c1516.f5294;
        this.f27085 = false;
    }

    public AbstractC8228(C1516 c1516, int i, int i2, boolean z) {
        this.f27084 = c1516;
        this.f27082 = 0;
        this.f27081 = i;
        this.f27083 = i2;
        this.f27080 = z;
        this.f27085 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f27080;
        C1516 c1516 = this.f27084;
        if (z) {
            this.f27080 = false;
            this.f27082++;
            mo22134(c1516.f5288, obj);
            return true;
        }
        int[] iArr = c1516.f5295;
        while (true) {
            int i = this.f27081;
            if (i >= this.f27083) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f27082++;
                this.f27081 = i + 1;
                mo22134(i, obj);
                return true;
            }
            this.f27081 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f27080;
        C1516 c1516 = this.f27084;
        if (z) {
            this.f27080 = false;
            this.f27082++;
            mo22134(c1516.f5288, obj);
        }
        int[] iArr = c1516.f5295;
        while (true) {
            int i = this.f27081;
            if (i >= this.f27083) {
                return;
            }
            if (iArr[i] != 0) {
                mo22134(i, obj);
                this.f27082++;
            }
            this.f27081++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f27085;
        C1516 c1516 = this.f27084;
        if (!z) {
            return c1516.f5292 - this.f27082;
        }
        int i = c1516.f5292;
        long j = i - this.f27082;
        if (c1516.f5294) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c1516.f5288)) * ((double) (this.f27083 - this.f27081)))) + (this.f27080 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC8228 m22135trySplit() {
        int i;
        int i2 = this.f27081;
        int i3 = this.f27083;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC8228 abstractC8228Mo22133 = mo22133(i2, i4, this.f27080);
        this.f27081 = i4;
        this.f27080 = false;
        this.f27085 = true;
        return abstractC8228Mo22133;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8409 m22136trySplit() {
        return (InterfaceC8409) m22135trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) m22135trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m22137trySplit() {
        return (InterfaceC9154) m22135trySplit();
    }
}
