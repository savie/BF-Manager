package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۤܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C10358 extends C18824 implements List, InterfaceC14674 {
    public static final long serialVersionUID = -283967356065247728L;
    public final List b;

    public C10358(List list) {
        super(list);
        this.b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C19530(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C19530(this, i);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C10358(this.b.subList(i, i2));
    }

    private Object readResolve() {
        List list = this.b;
        return list instanceof RandomAccess ? new C21162(list) : this;
    }
}
