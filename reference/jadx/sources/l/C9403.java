package l;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۢۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9403 extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f31884;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC11955 f31885;

    public C9403(List list, InterfaceC11955 interfaceC11955) {
        list.getClass();
        this.f31884 = list;
        interfaceC11955.getClass();
        this.f31885 = interfaceC11955;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f31884.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31884.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31884.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1640(this, this.f31884.listIterator(i));
    }
}
