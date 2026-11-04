package l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۠ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C8464 extends AbstractList implements InterfaceC9274, RandomAccess {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1072 f27735;

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۬᩷ */
    public final InterfaceC9274 mo4030() {
        return this;
    }

    public C8464(C1072 c1072) {
        this.f27735 = c1072;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f27735.get(i);
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۗ */
    public final Object mo4025(int i) {
        return this.f27735.mo4025(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27735.size();
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۙ */
    public final void mo4028(AbstractC17084 abstractC17084) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C9209 c9209 = new C9209();
        c9209.f30027 = ((AbstractList) this.f27735).listIterator(i);
        return c9209;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C2498 c2498 = new C2498();
        c2498.f8005 = ((AbstractList) this.f27735).iterator();
        return c2498;
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۜ */
    public final List mo4029() {
        return this.f27735.mo4029();
    }
}
