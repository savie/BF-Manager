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

/* JADX INFO: renamed from: l.֡᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public final class C0729 extends AbstractC10796 implements RandomAccess, Serializable, Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f3020;

    public final Object clone() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC10796, java.util.List, l.InterfaceC14674
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC10796
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3173(InterfaceC10609 interfaceC10609) {
        throw null;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo3174(InterfaceC16481 interfaceC16481) {
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3178(InterfaceC16481 interfaceC16481) {
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C6850(this.f3020);
    }

    @Override // l.AbstractC10796, java.util.List
    public final InterfaceC21191 listIterator() {
        return new C15548(this.f3020);
    }

    public C0729(int i) {
        this.f3020 = i;
    }

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        if (i == 0) {
            return this.f3020;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo3182(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo3180(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.InterfaceC10131
    public final boolean contains(int i) {
        return i == this.f3020;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int indexOf(int i) {
        return i == this.f3020 ? 0 : -1;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] mo3181() {
        return new int[]{this.f3020};
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC21191 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        if (i > 1 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        InterfaceC21191 interfaceC21191ListIterator = listIterator();
        if (i == 1) {
            ((C15548) interfaceC21191ListIterator).nextInt();
        }
        return interfaceC21191ListIterator;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        m27091(i);
        m27091(i2);
        if (i <= i2) {
            return (i == 0 && i2 == 1) ? this : C17663.f56124;
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC15735, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    @Deprecated
    public final void forEach(Consumer consumer) {
        consumer.n(Integer.valueOf(this.f3020));
    }

    @Override // l.AbstractC10796, java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, java.util.List, l.InterfaceC14674
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3169(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        intConsumer.accept(this.f3020);
    }

    @Override // l.AbstractC10796
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3170(int i, InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.AbstractC15735
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3172(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo3176(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo3165(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3171(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final Object[] toArray() {
        return new Object[]{Integer.valueOf(this.f3020)};
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C2271.m6966(i2, "Offset (", ") is negative"));
        }
        int i4 = i2 + i3;
        if (i4 > iArr.length) {
            throw new ArrayIndexOutOfBoundsException(C12441.m30911(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i4, "End index (", ") is greater than array length (")));
        }
        int i5 = i + i3;
        if (i5 > 1) {
            throw new IndexOutOfBoundsException(C2271.m6966(i5, "End index (", ") is greater than list size (1)"));
        }
        if (i3 <= 0) {
            return;
        }
        iArr[i2] = this.f3020;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3166(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3177(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3179(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo3175(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3168(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10796, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }
}
