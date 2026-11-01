package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5150 implements InterfaceC11501 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f17887;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f17888;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float[] f17889;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f17891;

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
        C13638.requireNonNull(interfaceC17767);
        while (true) {
            int i = this.f17887;
            if (i >= this.f17890) {
                return;
            }
            interfaceC17767.mo35707(this.f17889[this.f17888 + i]);
            this.f17887++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        if (this.f17887 >= this.f17890) {
            return false;
        }
        C13638.requireNonNull(interfaceC17767);
        int i = this.f17887;
        this.f17887 = i + 1;
        interfaceC17767.mo35707(this.f17889[this.f17888 + i]);
        return true;
    }

    public C5150(int i, int i2, int i3, float[] fArr) {
        this.f17889 = fArr;
        this.f17888 = i;
        this.f17890 = i2;
        this.f17891 = i3 | 16720;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f17890 - this.f17887;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f17891;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11501 trySplit() {
        int i = this.f17887;
        int i2 = (this.f17890 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f17888 + i;
        this.f17887 = i + i2;
        return new C5150(i3, i2, this.f17891, this.f17889);
    }
}
