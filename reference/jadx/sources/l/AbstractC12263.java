package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12263 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39435;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f39436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39437;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f39438;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f39439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39440;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12263 mo28977(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo28978(int i, Object obj);

    public AbstractC12263(C4060 c4060) {
        this.f39439 = c4060;
        this.f39436 = 0;
        this.f39438 = c4060.f13855;
        this.f39437 = 0;
        this.f39435 = c4060.f13857;
        this.f39440 = false;
    }

    public AbstractC12263(C4060 c4060, int i, int i2, boolean z) {
        this.f39439 = c4060;
        this.f39437 = 0;
        this.f39436 = i;
        this.f39438 = i2;
        this.f39435 = z;
        this.f39440 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f39435;
        C4060 c4060 = this.f39439;
        if (z) {
            this.f39435 = false;
            this.f39437++;
            mo28978(c4060.f13855, obj);
            return true;
        }
        Object[] objArr = c4060.f13849;
        while (true) {
            int i = this.f39436;
            if (i >= this.f39438) {
                return false;
            }
            if (objArr[i] != null) {
                this.f39437++;
                this.f39436 = i + 1;
                mo28978(i, obj);
                return true;
            }
            this.f39436 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f39435;
        C4060 c4060 = this.f39439;
        if (z) {
            this.f39435 = false;
            this.f39437++;
            mo28978(c4060.f13855, obj);
        }
        Object[] objArr = c4060.f13849;
        while (true) {
            int i = this.f39436;
            if (i >= this.f39438) {
                return;
            }
            if (objArr[i] != null) {
                mo28978(i, obj);
                this.f39437++;
            }
            this.f39436++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f39440;
        C4060 c4060 = this.f39439;
        if (!z) {
            return c4060.f13851 - this.f39437;
        }
        int i = c4060.f13851;
        long j = i - this.f39437;
        if (c4060.f13857) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c4060.f13855)) * ((double) (this.f39438 - this.f39436)))) + (this.f39435 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC12263 m30634trySplit() {
        int i;
        int i2 = this.f39436;
        int i3 = this.f39438;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC12263 abstractC12263Mo28977 = mo28977(i2, i4, this.f39435);
        this.f39436 = i4;
        this.f39435 = false;
        this.f39440 = true;
        return abstractC12263Mo28977;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8409 m30632trySplit() {
        return (InterfaceC8409) m30634trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) m30634trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m30633trySplit() {
        return (InterfaceC9154) m30634trySplit();
    }
}
