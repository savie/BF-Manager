package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes5.dex */
public final class C14510 implements InterfaceC11501 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f47536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f47537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1808 f47538;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f47539;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13618.m33299(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13618.m33300(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        C1808 c1808 = this.f47538;
        float[] fArr = c1808.f6964;
        int i = this.f47537 ? this.f47539 : c1808.f6965;
        while (true) {
            int i2 = this.f47536;
            if (i2 >= i) {
                return;
            }
            interfaceC17767.mo35707(fArr[i2]);
            this.f47536++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        int i = this.f47536;
        boolean z = this.f47537;
        C1808 c1808 = this.f47538;
        if (i >= (z ? this.f47539 : c1808.f6965)) {
            return false;
        }
        float[] fArr = c1808.f6964;
        this.f47536 = i + 1;
        interfaceC17767.mo35707(fArr[i]);
        return true;
    }

    public C14510(C1808 c1808) {
        this(c1808, 0, c1808.f6965, false);
    }

    public C14510(C1808 c1808, int i, int i2, boolean z) {
        this.f47538 = c1808;
        this.f47536 = i;
        this.f47539 = i2;
        this.f47537 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f47537 ? this.f47539 : this.f47538.f6965) - this.f47536;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11501 trySplit() {
        boolean z = this.f47537;
        C1808 c1808 = this.f47538;
        int i = z ? this.f47539 : c1808.f6965;
        int i2 = this.f47536;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f47539 = i;
        int i4 = i3 + i2;
        this.f47536 = i4;
        this.f47537 = true;
        return new C14510(c1808, i2, i4, true);
    }
}
