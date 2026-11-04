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

/* JADX INFO: renamed from: l.᩶ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes2.dex */
public final class C21428 extends AbstractList implements RandomAccess, Serializable, InterfaceC5427 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f68265;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f68266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68267;

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public /* synthetic */ void forEach(Consumer consumer) {
        C13689.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10118.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, l.InterfaceC5427
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C15121.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC5427
    public /* synthetic */ void sort(Comparator comparator) {
        C15121.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(mo52749stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C12128.m30302(i, size());
        int i2 = this.f68266 + i;
        int[] iArr = this.f68265;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public C21428(int i, int i2, int[] iArr) {
        this.f68265 = iArr;
        this.f68266 = i;
        this.f68267 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68267 - this.f68266;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C12128.m30302(i, size());
        return Integer.valueOf(this.f68265[this.f68266 + i]);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, l.InterfaceC5427, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C13629.spliterator(this.f68265, this.f68266, this.f68267, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && C18444.m42969(((Integer) obj).intValue(), this.f68266, this.f68267, this.f68265) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f68267;
        int i2 = this.f68266;
        int iM42969 = C18444.m42969(iIntValue, i2, i, this.f68265);
        if (iM42969 >= 0) {
            return iM42969 - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f68267;
            do {
                i2--;
                i = this.f68266;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f68265[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C12128.m30303(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f68266;
        return new C21428(i + i3, i3 + i2, this.f68265);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21428) {
            C21428 c21428 = (C21428) obj;
            int size = size();
            if (c21428.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f68265[this.f68266 + i] != c21428.f68265[c21428.f68266 + i]) {
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
        for (int i2 = this.f68266; i2 < this.f68267; i2++) {
            i = (i * 31) + this.f68265[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f68265;
        int i = this.f68266;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.f68267) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
