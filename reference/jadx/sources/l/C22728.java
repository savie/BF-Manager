package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes2.dex */
public final class C22728 implements InterfaceC9301 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19744 f73767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73768;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73769;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73770;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

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

    public C22728(C19744 c19744) {
        this(c19744, 0, c19744.f63567, false);
    }

    public C22728(C19744 c19744, int i, int i2, boolean z) {
        this.f73767 = c19744;
        this.f73769 = i;
        this.f73770 = i2;
        this.f73768 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f73768 ? this.f73770 : this.f73767.f63567) - this.f73769;
    }

    @Override // l.InterfaceC9900, l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC9301 trySplit() {
        boolean z = this.f73768;
        C19744 c19744 = this.f73767;
        int i = z ? this.f73770 : c19744.f63567;
        int i2 = this.f73769;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f73770 = i;
        int i4 = i3 + i2;
        this.f73769 = i4;
        this.f73768 = true;
        return new C22728(c19744, i2, i4, true);
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f73769;
        boolean z = this.f73768;
        C19744 c19744 = this.f73767;
        if (i >= (z ? this.f73770 : c19744.f63567)) {
            return false;
        }
        long[] jArr = c19744.f63566;
        this.f73769 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        C19744 c19744 = this.f73767;
        long[] jArr = c19744.f63566;
        int i = this.f73768 ? this.f73770 : c19744.f63567;
        while (true) {
            int i2 = this.f73769;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f73769++;
        }
    }
}
