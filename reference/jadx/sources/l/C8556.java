package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8556 implements InterfaceC9301 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f27938;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f27939;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f27940;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f27942;

    @Override // l.InterfaceC9900, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1099.m4100(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC9900, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C1099.m4101(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C8556(long[] jArr, int i, int i2, int i3) {
        this.f27940 = jArr;
        this.f27939 = i;
        this.f27938 = i2;
        this.f27942 = i3 | 16720;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f27941 >= this.f27938) {
            return false;
        }
        C17359.requireNonNull(longConsumer);
        int i = this.f27941;
        this.f27941 = i + 1;
        longConsumer.accept(this.f27940[this.f27939 + i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f27938 - this.f27941;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f27942;
    }

    @Override // l.InterfaceC9900, l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC9301 trySplit() {
        int i = this.f27941;
        int i2 = (this.f27938 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f27939 + i;
        this.f27941 = i + i2;
        return new C8556(this.f27940, i3, i2, this.f27942);
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        C17359.requireNonNull(longConsumer);
        while (true) {
            int i = this.f27941;
            if (i >= this.f27938) {
                return;
            }
            longConsumer.accept(this.f27940[this.f27939 + i]);
            this.f27941++;
        }
    }
}
