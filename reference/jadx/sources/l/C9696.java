package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9696 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14171 f31306;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31307;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31308;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31309;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16720;
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
        C14171 c14171 = this.f31306;
        char[] cArr = c14171.f44819;
        int i = this.f31307 ? this.f31309 : c14171.f44820;
        while (true) {
            int i2 = this.f31308;
            if (i2 >= i) {
                return;
            }
            interfaceC12089.mo10258(cArr[i2]);
            this.f31308++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        int i = this.f31308;
        boolean z = this.f31307;
        C14171 c14171 = this.f31306;
        if (i >= (z ? this.f31309 : c14171.f44820)) {
            return false;
        }
        char[] cArr = c14171.f44819;
        this.f31308 = i + 1;
        interfaceC12089.mo10258(cArr[i]);
        return true;
    }

    public C9696(C14171 c14171) {
        this(c14171, 0, c14171.f44820, false);
    }

    public C9696(C14171 c14171, int i, int i2, boolean z) {
        this.f31306 = c14171;
        this.f31308 = i;
        this.f31309 = i2;
        this.f31307 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f31307 ? this.f31309 : this.f31306.f44820) - this.f31308;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC16321 trySplit() {
        boolean z = this.f31307;
        C14171 c14171 = this.f31306;
        int i = z ? this.f31309 : c14171.f44820;
        int i2 = this.f31308;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f31309 = i;
        int i4 = i3 + i2;
        this.f31308 = i4;
        this.f31307 = true;
        return new C9696(c14171, i2, i4, true);
    }
}
