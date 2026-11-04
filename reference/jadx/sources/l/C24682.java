package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24682 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16476 f79867;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79868;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17744;
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

    public C24682(C16476 c16476) {
        this(c16476, 0, c16476.f53438.length);
    }

    public C24682(C16476 c16476, int i, int i2) {
        this.f79867 = c16476;
        this.f79868 = i;
        this.f79866 = i2;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f79866 - this.f79868;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f79868 >= this.f79866) {
            return false;
        }
        int[] iArr = this.f79867.f53438;
        int i = this.f79868;
        this.f79868 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f79867.f53438;
        while (true) {
            int i = this.f79868;
            if (i >= this.f79866) {
                return;
            }
            intConsumer.accept(iArr[i]);
            this.f79868++;
        }
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        int i = this.f79868;
        int i2 = (this.f79866 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = i2 + i;
        this.f79868 = i3;
        return new C24682(this.f79867, i, i3);
    }
}
