package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18034 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9829 f59051;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59052;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59053;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59054;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16464;
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C18034(C9829 c9829) {
        this(c9829, 0, c9829.f31644, false);
    }

    public C18034(C9829 c9829, int i, int i2, boolean z) {
        this.f59051 = c9829;
        this.f59053 = i;
        this.f59054 = i2;
        this.f59052 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f59052 ? this.f59054 : this.f59051.f31644) - this.f59053;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        boolean z = this.f59052;
        C9829 c9829 = this.f59051;
        int i = z ? this.f59054 : c9829.f31644;
        int i2 = this.f59053;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f59054 = i;
        int i4 = i3 + i2;
        this.f59053 = i4;
        this.f59052 = true;
        return new C18034(c9829, i2, i4, true);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f59053;
        boolean z = this.f59052;
        C9829 c9829 = this.f59051;
        if (i >= (z ? this.f59054 : c9829.f31644)) {
            return false;
        }
        Object[] objArr = c9829.f31642;
        this.f59053 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C9829 c9829 = this.f59051;
        Object[] objArr = c9829.f31642;
        int i = this.f59052 ? this.f59054 : c9829.f31644;
        while (true) {
            int i2 = this.f59053;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f59053++;
        }
    }
}
