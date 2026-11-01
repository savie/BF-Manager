package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.۬ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12891 extends AbstractC19385 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f42858;

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C12891(C7952 c7952) {
        this.f42858 = c7952;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return new C0895(this.f42858);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C3717(this.f42858);
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
        C7952 c7952 = this.f42858;
        char[] cArr = c7952.f26123;
        if (c7952.f26122) {
            interfaceC1164.mo4297(cArr[c7952.f26126]);
        }
        int i = c7952.f26126;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC1164.mo4297(c);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42858.f26121;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return this.f42858.mo15965(c);
    }

    @Override // l.AbstractC19385
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2289(char c) {
        C7952 c7952 = this.f42858;
        int i = c7952.f26121;
        c7952.mo7436(c);
        return c7952.f26121 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42858.clear();
    }
}
