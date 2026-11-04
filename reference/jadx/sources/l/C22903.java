package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩸ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22903 extends AbstractC1318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2020 f74391;

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C22903(C2020 c2020) {
        this.f74391 = c2020;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return this.f74391.m6941(c) != -1;
    }

    @Override // l.AbstractC1318
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4844(char c) {
        C2020 c2020 = this.f74391;
        int iM6941 = c2020.m6941(c);
        if (iM6941 == -1) {
            return false;
        }
        int i = (c2020.f6731 - iM6941) - 1;
        char[] cArr = c2020.f6736;
        int i2 = iM6941 + 1;
        System.arraycopy(cArr, i2, cArr, iM6941, i);
        char[] cArr2 = c2020.f6732;
        System.arraycopy(cArr2, i2, cArr2, iM6941, i);
        c2020.f6731--;
        return true;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C22157(this);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return new C22157(this);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C10968(this, 0, this.f74391.f6731);
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
        C2020 c2020 = this.f74391;
        char[] cArr = c2020.f6736;
        int i = c2020.f6731;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC12089.mo10258(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f74391.f6731;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f74391.f6731 = 0;
    }
}
