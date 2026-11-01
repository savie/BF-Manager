package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public class C5336 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18405;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f18406;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f18407;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18409;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13804.m33553(this, consumer);
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
        return C13804.m33554(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        C13638.requireNonNull(interfaceC1164);
        while (true) {
            int i = this.f18405;
            if (i >= this.f18408) {
                return;
            }
            interfaceC1164.mo4297(this.f18407[this.f18406 + i]);
            this.f18405++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        if (this.f18405 >= this.f18408) {
            return false;
        }
        C13638.requireNonNull(interfaceC1164);
        int i = this.f18405;
        this.f18405 = i + 1;
        interfaceC1164.mo4297(this.f18407[this.f18406 + i]);
        return true;
    }

    public C5336(int i, int i2, char[] cArr, int i3) {
        this.f18407 = cArr;
        this.f18406 = i;
        this.f18408 = i2;
        this.f18409 = i3 | 16720;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f18408 - this.f18405;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f18409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5336 mo14814(int i, int i2) {
        return new C5336(i, i2, this.f18407, this.f18409);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11687 trySplit() {
        int i = this.f18405;
        int i2 = (this.f18408 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f18406 + i;
        this.f18405 = i + i2;
        return mo14814(i3, i2);
    }
}
