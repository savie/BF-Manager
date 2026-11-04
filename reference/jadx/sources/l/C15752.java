package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܶ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes5.dex */
public class C15752 extends AbstractC23212 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51221;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51222;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC23212 f51223;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC23212, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23212, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23212, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23212, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C15752(AbstractC23212 abstractC23212, int i, int i2) {
        this.f51223 = abstractC23212;
        this.f51221 = i;
        this.f51222 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f51223.add(this.f51222, obj);
        this.f51222++;
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m52129(i);
        this.f51223.add(this.f51221 + i, obj);
        this.f51222++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m52129(i);
        this.f51222 = collection.size() + this.f51222;
        return this.f51223.addAll(this.f51221 + i, collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        m52131(i);
        return this.f51223.get(this.f51221 + i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m52131(i);
        this.f51222--;
        return this.f51223.remove(this.f51221 + i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m52131(i);
        return this.f51223.set(this.f51221 + i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51222 - this.f51221;
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ */
    public final void mo25605(int i, int i2, int i3, Object[] objArr) {
        m52129(i);
        int i4 = i + i3;
        if (i4 <= size()) {
            this.f51223.mo25605(this.f51221 + i, i2, i3, objArr);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i4, "End index (", ") is greater than list size (");
            sbM12235.append(size());
            sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ */
    public final void mo25604(int i, int i2) {
        m52129(i);
        m52129(i2);
        int i3 = this.f51221;
        this.f51223.mo25604(i3 + i, i3 + i2);
        this.f51222 -= i2 - i;
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ */
    public final void mo25606(int i, int i2, Object[] objArr) {
        m52129(i);
        this.f51223.mo25606(this.f51221 + i, i2, objArr);
    }

    @Override // l.AbstractC23212, l.InterfaceC17462, java.util.List
    public InterfaceC15970 listIterator(int i) {
        m52129(i);
        AbstractC23212 abstractC23212 = this.f51223;
        return abstractC23212 instanceof RandomAccess ? new C17244(this, i) : new C16498(this, abstractC23212.listIterator(i + this.f51221));
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC2546 spliterator() {
        AbstractC23212 abstractC23212 = this.f51223;
        return abstractC23212 instanceof RandomAccess ? new C11277(abstractC23212, this.f51221, this.f51222) : super.spliterator();
    }
}
