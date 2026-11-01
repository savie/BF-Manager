package l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.۫֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes4.dex */
public final class C12101 extends AbstractList implements RandomAccess, Serializable, InterfaceC14674 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40472;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f40473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40474;

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public /* synthetic */ void forEach(Consumer consumer) {
        C20113.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C19613.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, l.InterfaceC14674
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C11146.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC14674
    public /* synthetic */ void sort(Comparator comparator) {
        C11146.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C18304.m42510(i, size());
        int i2 = this.f40472 + i;
        int[] iArr = this.f40473;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public C12101(int i, int i2, int[] iArr) {
        this.f40473 = iArr;
        this.f40472 = i;
        this.f40474 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40474 - this.f40472;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C18304.m42510(i, size());
        return Integer.valueOf(this.f40473[this.f40472 + i]);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, l.InterfaceC14674, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return C19988.spliterator(this.f40473, this.f40472, this.f40474, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && C17039.m39817(((Integer) obj).intValue(), this.f40472, this.f40474, this.f40473) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f40474;
        int i2 = this.f40472;
        int iM39817 = C17039.m39817(iIntValue, i2, i, this.f40473);
        if (iM39817 >= 0) {
            return iM39817 - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f40474;
            do {
                i2--;
                i = this.f40472;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f40473[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C18304.m42511(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f40472;
        return new C12101(i + i3, i3 + i2, this.f40473);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12101) {
            C12101 c12101 = (C12101) obj;
            int size = size();
            if (c12101.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f40473[this.f40472 + i] != c12101.f40473[c12101.f40472 + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f40472; i2 < this.f40474; i2++) {
            i = (i * 31) + this.f40473[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f40473;
        int i = this.f40472;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.f40474) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
