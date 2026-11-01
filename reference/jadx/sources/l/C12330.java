package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12330 extends AbstractC19385 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14447 f41219;

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C12330(C14447 c14447) {
        this.f41219 = c14447;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return this.f41219.m34848(c) != -1;
    }

    @Override // l.AbstractC19385
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2289(char c) {
        C14447 c14447 = this.f41219;
        int iM34848 = c14447.m34848(c);
        if (iM34848 == -1) {
            return false;
        }
        int i = (c14447.f47387 - iM34848) - 1;
        char[] cArr = c14447.f47389;
        int i2 = iM34848 + 1;
        System.arraycopy(cArr, i2, cArr, iM34848, i);
        char[] cArr2 = c14447.f47385;
        System.arraycopy(cArr2, i2, cArr2, iM34848, i);
        c14447.f47387--;
        return true;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0334(this);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return new C0334(this);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C16563(this, 0, this.f41219.f47387);
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f41219;
        char[] cArr = c14447.f47389;
        int i = c14447.f47387;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC1164.mo4297(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41219.f47387;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41219.f47387 = 0;
    }
}
