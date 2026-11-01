package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩻ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23619 extends AbstractC3861 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14447 f76526;

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        C14447 c14447 = this.f76526;
        char[] cArr = c14447.f47385;
        int i = c14447.f47387;
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

    public C23619(C14447 c14447) {
        this.f76526 = c14447;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5979(this);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return new C5979(this);
    }

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C10919(this, 0, this.f76526.f47387);
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f76526;
        char[] cArr = c14447.f47385;
        int i = c14447.f47387;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC1164.mo4297(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f76526.f47387;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f76526.f47387 = 0;
    }
}
