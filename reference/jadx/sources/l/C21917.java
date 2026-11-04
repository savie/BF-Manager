package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩷۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes2.dex */
public class C21917 extends C8797 implements InterfaceC9018, InterfaceC5427 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC9018 f70781;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(parallelStream());
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(stream());
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ */
    public final void mo14695(int[] iArr) {
        throw null;
    }

    @Override // l.InterfaceC9018
    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    public final Integer mo18912(int i, Integer num) {
        throw null;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14699(InterfaceC4544 interfaceC4544) {
        throw null;
    }

    @Override // l.InterfaceC1340
    public final boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final int size() {
        return this.f28669.size();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f28669.isEmpty();
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f28669.contains(i);
    }

    @Override // l.C8797, l.InterfaceC1340, java.util.Collection, java.lang.Iterable
    public final InterfaceC15949 spliterator() {
        return this.f28669.spliterator();
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public final InterfaceC20670 stream() {
        return this.f28669.stream();
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public final InterfaceC20670 parallelStream() {
        return this.f28669.parallelStream();
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        return this.f28669.toArray(objArr);
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f28669.toArray();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        return this.f28669.containsAll(collection);
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

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4932(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C8797, l.InterfaceC1340
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4931(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.f28669.contains(obj);
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo2687() {
        return this.f28669.mo2687();
    }

    public final String toString() {
        return this.f28669.toString();
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo18911(i, (Integer) obj);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f70781.compareTo((List) obj);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public C21917(InterfaceC9018 interfaceC9018) {
        super(interfaceC9018);
        this.f70781 = interfaceC9018;
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        return this.f70781.getInt(i);
    }

    @Override // l.InterfaceC9018
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ܶ */
    public final int mo14697(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    public final int indexOf(int i) {
        return this.f70781.indexOf(i);
    }

    @Override // l.InterfaceC9018
    public final int lastIndexOf(int i) {
        return this.f70781.lastIndexOf(i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC5427
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        this.f70781.mo14688(i, i2, i3, iArr);
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14687(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14698(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14700(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14689(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final InterfaceC8273 listIterator() {
        return new C17968(this.f70781.listIterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC1340, java.util.Collection, java.lang.Iterable, l.InterfaceC20206
    public final InterfaceC6036 iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC1340, java.util.Collection, java.lang.Iterable, l.InterfaceC20206
    public final InterfaceC8273 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final InterfaceC8273 listIterator(int i) {
        return new C17968(this.f70781.listIterator(i));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.f28669.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f28669.hashCode();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14690(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final Integer get(int i) {
        return this.f70781.get(i);
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        return this.f70781.get(i);
    }

    @Override // l.InterfaceC9018
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo18911(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return this.f70781.indexOf(obj);
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return this.f70781.lastIndexOf(obj);
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ */
    public final void mo14694(InterfaceC4544 interfaceC4544) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC5427
    @Deprecated
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
