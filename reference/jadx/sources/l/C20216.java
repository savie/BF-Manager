package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20216 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65595;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65596;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f65597;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f65598;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0459 f65599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65600;

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
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        C0459 c0459 = this.f65599;
        char[] cArr = c0459.f2072;
        if (this.f65598) {
            this.f65598 = false;
            interfaceC1164.mo4297(cArr[c0459.f2073]);
            this.f65597++;
        }
        while (true) {
            int i = this.f65596;
            if (i >= this.f65595) {
                return;
            }
            char c = cArr[i];
            if (c != 0) {
                interfaceC1164.mo4297(c);
                this.f65597++;
            }
            this.f65596++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        boolean z = this.f65598;
        C0459 c0459 = this.f65599;
        if (z) {
            this.f65598 = false;
            this.f65597++;
            interfaceC1164.mo4297(c0459.f2072[c0459.f2073]);
            return true;
        }
        char[] cArr = c0459.f2072;
        while (true) {
            int i = this.f65596;
            if (i >= this.f65595) {
                return false;
            }
            char c = cArr[i];
            if (c != 0) {
                this.f65597++;
                this.f65596 = i + 1;
                interfaceC1164.mo4297(c);
                return true;
            }
            this.f65596 = i + 1;
        }
    }

    public C20216(C0459 c0459) {
        this.f65599 = c0459;
        this.f65596 = 0;
        this.f65595 = c0459.f2073;
        this.f65597 = 0;
        this.f65598 = c0459.f2076;
        this.f65600 = false;
    }

    public C20216(C0459 c0459, int i, int i2, boolean z) {
        this.f65599 = c0459;
        this.f65597 = 0;
        this.f65596 = i;
        this.f65595 = i2;
        this.f65598 = z;
        this.f65600 = true;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f65600 ? 257 : 321;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        boolean z = this.f65600;
        C0459 c0459 = this.f65599;
        if (!z) {
            return c0459.f2074 - this.f65597;
        }
        int i = c0459.f2074;
        long j = i - this.f65597;
        if (c0459.f2076) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c0459.f2073)) * ((double) (this.f65595 - this.f65596)))) + (this.f65598 ? 1L : 0L));
    }

    @Override // l.InterfaceC20693
    public final C20216 trySplit() {
        int i;
        int i2 = this.f65596;
        int i3 = this.f65595;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C20216 c20216 = new C20216(this.f65599, i2, i4, this.f65598);
        this.f65596 = i4;
        this.f65598 = false;
        this.f65600 = true;
        return c20216;
    }
}
