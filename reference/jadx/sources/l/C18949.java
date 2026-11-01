package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18949 extends AbstractC5543 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7660 f61363;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C18949(C7660 c7660) {
        this.f61363 = c7660;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f61363.m20219(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C7660 c7660 = this.f61363;
        int iM20219 = c7660.m20219(obj);
        if (iM20219 == -1) {
            return false;
        }
        int i = (c7660.f25321 - iM20219) - 1;
        Object[] objArr = c7660.f25323;
        int i2 = iM20219 + 1;
        System.arraycopy(objArr, i2, objArr, iM20219, i);
        int[] iArr = c7660.f25319;
        System.arraycopy(iArr, i2, iArr, iM20219, i);
        int i3 = c7660.f25321 - 1;
        c7660.f25321 = i3;
        c7660.f25323[i3] = null;
        return true;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C21771(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C21771(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C18243(this, 0, this.f61363.f25321);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C7660 c7660 = this.f61363;
        Object[] objArr = c7660.f25323;
        int i = c7660.f25321;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f61363.f25321;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f61363.clear();
    }
}
