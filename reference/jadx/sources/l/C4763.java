package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۙ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public final class C4763 extends AbstractC15685 implements RandomAccess, Serializable, Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16719;

    public final Object clone() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC15685, java.util.List, l.InterfaceC5427
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC15685
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14693(InterfaceC9018 interfaceC9018) {
        throw null;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14694(InterfaceC4544 interfaceC4544) {
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14699(InterfaceC4544 interfaceC4544) {
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C4017(this.f16719);
    }

    @Override // l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator() {
        return new C20952(this.f16719);
    }

    public C4763(int i) {
        this.f16719 = i;
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        if (i == 0) {
            return this.f16719;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo14697(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.InterfaceC1340
    public final boolean contains(int i) {
        return i == this.f16719;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int indexOf(int i) {
        return i == this.f16719 ? 0 : -1;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo2687() {
        return new int[]{this.f16719};
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC8273 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        if (i > 1 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        InterfaceC8273 interfaceC8273ListIterator = listIterator();
        if (i == 1) {
            ((C20952) interfaceC8273ListIterator).nextInt();
        }
        return interfaceC8273ListIterator;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        m37462(i);
        m37462(i2);
        if (i <= i2) {
            return (i == 0 && i2 == 1) ? this : C22663.f73589;
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC6957, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    @Deprecated
    public final void forEach(Consumer consumer) {
        consumer.n(Integer.valueOf(this.f16719));
    }

    @Override // l.AbstractC15685, java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.Collection, l.InterfaceC9372
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, java.util.List, l.InterfaceC5427
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14690(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        intConsumer.accept(this.f16719);
    }

    @Override // l.AbstractC15685
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14691(int i, InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.AbstractC6957
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14692(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo14696(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo14701(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4932(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final Object[] toArray() {
        return new Object[]{Integer.valueOf(this.f16719)};
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C14442.m34864(i2, "Offset (", ") is negative"));
        }
        int i4 = i2 + i3;
        if (i4 > iArr.length) {
            throw new ArrayIndexOutOfBoundsException(C12669.m31437(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i4, "End index (", ") is greater than array length (")));
        }
        int i5 = i + i3;
        if (i5 > 1) {
            throw new IndexOutOfBoundsException(C14442.m34864(i5, "End index (", ") is greater than list size (1)"));
        }
        if (i3 <= 0) {
            return;
        }
        iArr[i2] = this.f16719;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14687(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14698(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14700(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14695(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14689(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15685, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }
}
