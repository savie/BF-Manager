package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܽ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes5.dex */
public class C16958 extends C15776 implements InterfaceC10609, InterfaceC14674 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC10609 f54251;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ */
    public final void mo3175(int[] iArr) {
        throw null;
    }

    @Override // l.InterfaceC10609
    @Deprecated
    /* JADX INFO: renamed from: ܰ */
    public final Integer mo26776(int i, Integer num) {
        throw null;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3178(InterfaceC16481 interfaceC16481) {
        throw null;
    }

    @Override // l.InterfaceC10131
    public final boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3182(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final int size() {
        return this.f51096.size();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f51096.isEmpty();
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f51096.contains(i);
    }

    @Override // l.C15776, l.InterfaceC10131, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return this.f51096.spliterator();
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public final InterfaceC5046 stream() {
        return this.f51096.stream();
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public final InterfaceC5046 parallelStream() {
        return this.f51096.parallelStream();
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        return this.f51096.toArray(objArr);
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f51096.toArray();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        return this.f51096.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3171(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C15776, l.InterfaceC10131
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.f51096.contains(obj);
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo3181() {
        return this.f51096.mo3181();
    }

    public final String toString() {
        return this.f51096.toString();
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo26775(i, (Integer) obj);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f54251.compareTo((List) obj);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public C16958(InterfaceC10609 interfaceC10609) {
        super(interfaceC10609);
        this.f54251 = interfaceC10609;
    }

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        return this.f54251.getInt(i);
    }

    @Override // l.InterfaceC10609
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3180(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    public final int indexOf(int i) {
        return this.f54251.indexOf(i);
    }

    @Override // l.InterfaceC10609
    public final int lastIndexOf(int i) {
        return this.f54251.lastIndexOf(i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        this.f54251.mo3167(i, i2, i3, iArr);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3166(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3177(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3179(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3168(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final InterfaceC21191 listIterator() {
        return new C21897(this.f54251.listIterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC10131, java.util.Collection, java.lang.Iterable, l.InterfaceC22603
    public final InterfaceC13431 iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC10131, java.util.Collection, java.lang.Iterable, l.InterfaceC22603
    public final InterfaceC21191 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final InterfaceC21191 listIterator(int i) {
        return new C21897(this.f54251.listIterator(i));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.f51096.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f51096.hashCode();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3169(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final Integer get(int i) {
        return this.f54251.get(i);
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        return this.f54251.get(i);
    }

    @Override // l.InterfaceC10609
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo26775(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return this.f54251.indexOf(obj);
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return this.f54251.lastIndexOf(obj);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ */
    public final void mo3174(InterfaceC16481 interfaceC16481) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    @Deprecated
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
