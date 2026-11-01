package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۨᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public class C11894 extends AbstractC2720 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39904;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f39905;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC2720 f39906;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC2720, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC2720, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC2720, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC2720, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C11894(AbstractC2720 abstractC2720, int i, int i2) {
        this.f39906 = abstractC2720;
        this.f39905 = i;
        this.f39904 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f39906.add(this.f39904, obj);
        this.f39904++;
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m8301(i);
        this.f39906.add(this.f39905 + i, obj);
        this.f39904++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m8301(i);
        this.f39904 = collection.size() + this.f39904;
        return this.f39906.addAll(this.f39905 + i, collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        m8299(i);
        return this.f39906.get(this.f39905 + i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m8299(i);
        this.f39904--;
        return this.f39906.remove(this.f39905 + i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m8299(i);
        return this.f39906.set(this.f39905 + i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39904 - this.f39905;
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12693(int i, int i2, int i3, Object[] objArr) {
        m8301(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f39906.mo12693(this.f39905 + i, i2, i3, objArr);
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12692(int i, int i2) {
        m8301(i);
        m8301(i2);
        int i3 = this.f39905;
        this.f39906.mo12692(i3 + i, i3 + i2);
        this.f39904 -= i2 - i;
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12694(int i, int i2, Object[] objArr) {
        m8301(i);
        this.f39906.mo12694(this.f39905 + i, i2, objArr);
    }

    @Override // l.AbstractC2720, java.util.List
    public InterfaceC13722 listIterator(int i) {
        m8301(i);
        AbstractC2720 abstractC2720 = this.f39906;
        return abstractC2720 instanceof RandomAccess ? new C14011(this, i) : new C4837(this, abstractC2720.listIterator(i + this.f39905));
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC7371 spliterator() {
        AbstractC2720 abstractC2720 = this.f39906;
        return abstractC2720 instanceof RandomAccess ? new C9756(abstractC2720, this.f39905, this.f39904) : super.spliterator();
    }
}
