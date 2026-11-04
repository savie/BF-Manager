package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5749 extends AbstractC4301 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2020 f19793;

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        C2020 c2020 = this.f19793;
        char[] cArr = c2020.f6732;
        int i = c2020.f6731;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] == c) {
                return true;
            }
            i = i2;
        }
    }

    public C5749(C2020 c2020) {
        this.f19793 = c2020;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C15443(this);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return new C15443(this);
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C13206(this, 0, this.f19793.f6731);
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
        C2020 c2020 = this.f19793;
        char[] cArr = c2020.f6732;
        int i = c2020.f6731;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC12089.mo10258(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19793.f6731;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f19793.f6731 = 0;
    }
}
