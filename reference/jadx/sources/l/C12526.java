package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12526 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14763 f40211;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40214;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16720;
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

    public C12526(C14763 c14763) {
        this(c14763, 0, c14763.f48234, false);
    }

    public C12526(C14763 c14763, int i, int i2, boolean z) {
        this.f40211 = c14763;
        this.f40213 = i;
        this.f40214 = i2;
        this.f40212 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f40212 ? this.f40214 : this.f40211.f48234) - this.f40213;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        boolean z = this.f40212;
        C14763 c14763 = this.f40211;
        int i = z ? this.f40214 : c14763.f48234;
        int i2 = this.f40213;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f40214 = i;
        int i4 = i3 + i2;
        this.f40213 = i4;
        this.f40212 = true;
        return new C12526(c14763, i2, i4, true);
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f40213;
        boolean z = this.f40212;
        C14763 c14763 = this.f40211;
        if (i >= (z ? this.f40214 : c14763.f48234)) {
            return false;
        }
        int[] iArr = c14763.f48233;
        this.f40213 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C14763 c14763 = this.f40211;
        int[] iArr = c14763.f48233;
        int i = this.f40212 ? this.f40214 : c14763.f48234;
        while (true) {
            int i2 = this.f40213;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f40213++;
        }
    }
}
