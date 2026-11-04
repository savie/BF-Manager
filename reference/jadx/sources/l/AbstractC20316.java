package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65195;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f65196;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65197;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f65198;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f65199;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65200;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC20316 mo6002(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6003(int i, Object obj);

    public AbstractC20316(C24046 c24046) {
        this.f65199 = c24046;
        this.f65196 = 0;
        this.f65198 = c24046.f77774;
        this.f65197 = 0;
        this.f65195 = c24046.f77780;
        this.f65200 = false;
    }

    public AbstractC20316(C24046 c24046, int i, int i2, boolean z) {
        this.f65199 = c24046;
        this.f65197 = 0;
        this.f65196 = i;
        this.f65198 = i2;
        this.f65195 = z;
        this.f65200 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f65195;
        C24046 c24046 = this.f65199;
        if (z) {
            this.f65195 = false;
            this.f65197++;
            mo6003(c24046.f77774, obj);
            return true;
        }
        int[] iArr = c24046.f77781;
        while (true) {
            int i = this.f65196;
            if (i >= this.f65198) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f65197++;
                this.f65196 = i + 1;
                mo6003(i, obj);
                return true;
            }
            this.f65196 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f65195;
        C24046 c24046 = this.f65199;
        if (z) {
            this.f65195 = false;
            this.f65197++;
            mo6003(c24046.f77774, obj);
        }
        int[] iArr = c24046.f77781;
        while (true) {
            int i = this.f65196;
            if (i >= this.f65198) {
                return;
            }
            if (iArr[i] != 0) {
                mo6003(i, obj);
                this.f65197++;
            }
            this.f65196++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f65200;
        C24046 c24046 = this.f65199;
        if (!z) {
            return c24046.f77778 - this.f65197;
        }
        int i = c24046.f77778;
        long j = i - this.f65197;
        if (c24046.f77780) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c24046.f77774)) * ((double) (this.f65198 - this.f65196)))) + (this.f65195 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC20316 m46663trySplit() {
        int i;
        int i2 = this.f65196;
        int i3 = this.f65198;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC20316 abstractC20316Mo6002 = mo6002(i2, i4, this.f65195);
        this.f65196 = i4;
        this.f65195 = false;
        this.f65200 = true;
        return abstractC20316Mo6002;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8409 m46661trySplit() {
        return (InterfaceC8409) m46663trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) m46663trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m46662trySplit() {
        return (InterfaceC9154) m46663trySplit();
    }
}
