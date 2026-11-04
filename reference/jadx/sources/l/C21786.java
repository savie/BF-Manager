package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes2.dex */
public final class C21786 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10597 f69474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69475;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69476;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69477;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17813.m41657(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17813.m41658(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        C10597 c10597 = this.f69474;
        char[] cArr = c10597.f33648;
        int i = this.f69475 ? this.f69477 : c10597.f33649;
        while (true) {
            int i2 = this.f69476;
            if (i2 >= i) {
                return;
            }
            interfaceC12089.mo10258(cArr[i2]);
            this.f69476++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        int i = this.f69476;
        boolean z = this.f69475;
        C10597 c10597 = this.f69474;
        if (i >= (z ? this.f69477 : c10597.f33649)) {
            return false;
        }
        char[] cArr = c10597.f33648;
        this.f69476 = i + 1;
        interfaceC12089.mo10258(cArr[i]);
        return true;
    }

    public C21786(C10597 c10597) {
        this(c10597, 0, c10597.f33649, false);
    }

    public C21786(C10597 c10597, int i, int i2, boolean z) {
        this.f69474 = c10597;
        this.f69476 = i;
        this.f69477 = i2;
        this.f69475 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f69475 ? this.f69477 : this.f69474.f33649) - this.f69476;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC16321 trySplit() {
        boolean z = this.f69475;
        C10597 c10597 = this.f69474;
        int i = z ? this.f69477 : c10597.f33649;
        int i2 = this.f69476;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f69477 = i;
        int i4 = i3 + i2;
        this.f69476 = i4;
        this.f69475 = true;
        return new C21786(c10597, i2, i4, true);
    }
}
