package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16626 implements InterfaceC11501 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53341;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53342;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10982 f53343;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53344;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16720;
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
        C10982 c10982 = this.f53343;
        float[] fArr = c10982.f37398;
        int i = this.f53342 ? this.f53344 : c10982.f37399;
        while (true) {
            int i2 = this.f53341;
            if (i2 >= i) {
                return;
            }
            interfaceC17767.mo35707(fArr[i2]);
            this.f53341++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        int i = this.f53341;
        boolean z = this.f53342;
        C10982 c10982 = this.f53343;
        if (i >= (z ? this.f53344 : c10982.f37399)) {
            return false;
        }
        float[] fArr = c10982.f37398;
        this.f53341 = i + 1;
        interfaceC17767.mo35707(fArr[i]);
        return true;
    }

    public C16626(C10982 c10982) {
        this(c10982, 0, c10982.f37399, false);
    }

    public C16626(C10982 c10982, int i, int i2, boolean z) {
        this.f53343 = c10982;
        this.f53341 = i;
        this.f53344 = i2;
        this.f53342 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f53342 ? this.f53344 : this.f53343.f37399) - this.f53341;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11501 trySplit() {
        boolean z = this.f53342;
        C10982 c10982 = this.f53343;
        int i = z ? this.f53344 : c10982.f37399;
        int i2 = this.f53341;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f53344 = i;
        int i4 = i3 + i2;
        this.f53341 = i4;
        this.f53342 = true;
        return new C16626(c10982, i2, i4, true);
    }
}
