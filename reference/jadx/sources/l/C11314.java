package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11314 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38179;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38180;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38181;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38182;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24014 f38183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38184;

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13907.m33739(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13907.m33740(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    public C11314(C24014 c24014) {
        this.f38183 = c24014;
        this.f38180 = 0;
        this.f38179 = c24014.f77812;
        this.f38181 = 0;
        this.f38182 = c24014.f77815;
        this.f38184 = false;
    }

    public C11314(C24014 c24014, int i, int i2, boolean z) {
        this.f38183 = c24014;
        this.f38181 = 0;
        this.f38180 = i;
        this.f38179 = i2;
        this.f38182 = z;
        this.f38184 = true;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z = this.f38182;
        C24014 c24014 = this.f38183;
        if (z) {
            this.f38182 = false;
            this.f38181++;
            intConsumer.accept(c24014.f77811[c24014.f77812]);
            return true;
        }
        int[] iArr = c24014.f77811;
        while (true) {
            int i = this.f38180;
            if (i >= this.f38179) {
                return false;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                this.f38181++;
                this.f38180 = i + 1;
                intConsumer.accept(i2);
                return true;
            }
            this.f38180 = i + 1;
        }
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C24014 c24014 = this.f38183;
        int[] iArr = c24014.f77811;
        if (this.f38182) {
            this.f38182 = false;
            intConsumer.accept(iArr[c24014.f77812]);
            this.f38181++;
        }
        while (true) {
            int i = this.f38180;
            if (i >= this.f38179) {
                return;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                intConsumer.accept(i2);
                this.f38181++;
            }
            this.f38180++;
        }
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f38184 ? 257 : 321;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        boolean z = this.f38184;
        C24014 c24014 = this.f38183;
        if (!z) {
            return c24014.f77813 - this.f38181;
        }
        int i = c24014.f77813;
        long j = i - this.f38181;
        if (c24014.f77815) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c24014.f77812)) * ((double) (this.f38179 - this.f38180)))) + (this.f38182 ? 1L : 0L));
    }

    @Override // l.InterfaceC20693
    public final C11314 trySplit() {
        int i;
        int i2 = this.f38180;
        int i3 = this.f38179;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C11314 c11314 = new C11314(this.f38183, i2, i4, this.f38182);
        this.f38180 = i4;
        this.f38182 = false;
        this.f38184 = true;
        return c11314;
    }
}
