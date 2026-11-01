package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public class C5856 extends AbstractC10796 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19999;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f20000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10796 f20001;

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10796, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10796, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C5856(AbstractC10796 abstractC10796, int i, int i2) {
        this.f20001 = abstractC10796;
        this.f20000 = i;
        this.f19999 = i2;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        this.f20001.add(this.f19999, i);
        this.f19999++;
        return true;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final void add(int i, int i2) {
        m27091(i);
        this.f20001.add(this.f20000 + i, i2);
        this.f19999++;
    }

    @Override // l.AbstractC10796, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m27091(i);
        this.f19999 = collection.size() + this.f19999;
        return this.f20001.addAll(this.f20000 + i, collection);
    }

    @Override // l.InterfaceC10609
    public int getInt(int i) {
        m27090(i);
        return this.f20001.getInt(this.f20000 + i);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3180(int i) {
        m27090(i);
        this.f19999--;
        return this.f20001.mo3180(this.f20000 + i);
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int set(int i, int i2) {
        m27090(i);
        return this.f20001.set(this.f20000 + i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19999 - this.f20000;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        m27091(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f20001.mo3167(this.f20000 + i, i2, i3, iArr);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3166(int i, int i2) {
        m27091(i);
        m27091(i2);
        int i3 = this.f20000;
        this.f20001.mo3166(i3 + i, i3 + i2);
        this.f19999 -= i2 - i;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3177(int i, int i2, int[] iArr) {
        m27091(i);
        this.f20001.mo3177(this.f20000 + i, i2, iArr);
        this.f19999 += i2;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3168(int i, int i2, int[] iArr) {
        m27091(i);
        this.f20001.mo3168(this.f20000 + i, i2, iArr);
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public InterfaceC21191 listIterator(int i) {
        m27091(i);
        AbstractC10796 abstractC10796 = this.f20001;
        return abstractC10796 instanceof RandomAccess ? new C17145(this, i) : new C12207(this, abstractC10796.listIterator(i + this.f20000));
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11790 spliterator() {
        AbstractC10796 abstractC10796 = this.f20001;
        return abstractC10796 instanceof RandomAccess ? new C0211(abstractC10796, this.f20000, this.f19999) : super.spliterator();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3182(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        this.f19999--;
        this.f20001.mo3180(this.f20000 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC10796
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3170(int i, InterfaceC10131 interfaceC10131) {
        m27091(i);
        return super.mo3170(i, interfaceC10131);
    }
}
