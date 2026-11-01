package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public class C15839 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f51263;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f51264;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51266;

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public C15839(int i, int i2, int i3, Object[] objArr) {
        this.f51264 = objArr;
        this.f51263 = i;
        this.f51265 = i2;
        this.f51266 = i3 | 16464;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f51262 >= this.f51265) {
            return false;
        }
        C13638.requireNonNull(consumer);
        int i = this.f51262;
        this.f51262 = i + 1;
        consumer.accept(this.f51264[this.f51263 + i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f51265 - this.f51262;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f51266;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15839 mo37649(int i, int i2) {
        return new C15839(i, i2, this.f51266, this.f51264);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC7371 trySplit() {
        int i = this.f51262;
        int i2 = (this.f51265 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f51263 + i;
        this.f51262 = i + i2;
        return mo37649(i3, i2);
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13638.requireNonNull(consumer);
        while (true) {
            int i = this.f51262;
            if (i >= this.f51265) {
                return;
            }
            consumer.accept(this.f51264[this.f51263 + i]);
            this.f51262++;
        }
    }
}
