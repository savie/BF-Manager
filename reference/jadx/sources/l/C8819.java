package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8819 implements InterfaceC9301 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21982 f28824;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28825;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f28826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28827;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16720;
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

    public C8819(C21982 c21982) {
        this(c21982, 0, c21982.f70928, false);
    }

    public C8819(C21982 c21982, int i, int i2, boolean z) {
        this.f28824 = c21982;
        this.f28826 = i;
        this.f28827 = i2;
        this.f28825 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f28825 ? this.f28827 : this.f28824.f70928) - this.f28826;
    }

    @Override // l.InterfaceC9900, l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC9301 trySplit() {
        boolean z = this.f28825;
        C21982 c21982 = this.f28824;
        int i = z ? this.f28827 : c21982.f70928;
        int i2 = this.f28826;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f28827 = i;
        int i4 = i3 + i2;
        this.f28826 = i4;
        this.f28825 = true;
        return new C8819(c21982, i2, i4, true);
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f28826;
        boolean z = this.f28825;
        C21982 c21982 = this.f28824;
        if (i >= (z ? this.f28827 : c21982.f70928)) {
            return false;
        }
        long[] jArr = c21982.f70927;
        this.f28826 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        C21982 c21982 = this.f28824;
        long[] jArr = c21982.f70927;
        int i = this.f28825 ? this.f28827 : c21982.f70928;
        while (true) {
            int i2 = this.f28826;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f28826++;
        }
    }
}
