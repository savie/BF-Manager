package l;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.۬ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13641 extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f43304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5417 f43305;

    public C13641(List list, InterfaceC5417 interfaceC5417) {
        list.getClass();
        this.f43304 = list;
        interfaceC5417.getClass();
        this.f43305 = interfaceC5417;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f43304.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43304.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f43304.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C6930(this, this.f43304.listIterator(i));
    }
}
