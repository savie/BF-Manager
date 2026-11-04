package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18493 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0594 f60176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60177;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60178;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60179;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    public C18493(C0594 c0594) {
        this(c0594, 0, c0594.f2379, false);
    }

    public C18493(C0594 c0594, int i, int i2, boolean z) {
        this.f60176 = c0594;
        this.f60178 = i;
        this.f60179 = i2;
        this.f60177 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f60177 ? this.f60179 : this.f60176.f2379) - this.f60178;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        boolean z = this.f60177;
        C0594 c0594 = this.f60176;
        int i = z ? this.f60179 : c0594.f2379;
        int i2 = this.f60178;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f60179 = i;
        int i4 = i3 + i2;
        this.f60178 = i4;
        this.f60177 = true;
        return new C18493(c0594, i2, i4, true);
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f60178;
        boolean z = this.f60177;
        C0594 c0594 = this.f60176;
        if (i >= (z ? this.f60179 : c0594.f2379)) {
            return false;
        }
        int[] iArr = c0594.f2378;
        this.f60178 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C0594 c0594 = this.f60176;
        int[] iArr = c0594.f2378;
        int i = this.f60177 ? this.f60179 : c0594.f2379;
        while (true) {
            int i2 = this.f60178;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f60178++;
        }
    }
}
