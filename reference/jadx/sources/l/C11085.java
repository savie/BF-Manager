package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۧܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes4.dex */
public class C11085 extends AbstractC23785 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f37625;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f37626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC23785 f37627;

    @Override // l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC23785, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23785, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC14800, l.InterfaceC5522
    public final InterfaceC1288 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23785, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC23785, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C11085(AbstractC23785 abstractC23785, int i, int i2) {
        this.f37627 = abstractC23785;
        this.f37626 = i;
        this.f37625 = i2;
    }

    @Override // l.AbstractC20257, l.InterfaceC14800
    public final boolean add(long j) {
        this.f37627.mo27937(this.f37625, j);
        this.f37625++;
        return true;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27937(int i, long j) {
        m52322(i);
        this.f37627.mo27937(this.f37626 + i, j);
        this.f37625++;
    }

    @Override // l.AbstractC23785, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m52322(i);
        this.f37625 = collection.size() + this.f37625;
        return this.f37627.addAll(this.f37626 + i, collection);
    }

    public long getLong(int i) {
        m52321(i);
        return this.f37627.getLong(this.f37626 + i);
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo27941(int i) {
        m52321(i);
        this.f37625--;
        return this.f37627.mo27941(this.f37626 + i);
    }

    @Override // l.InterfaceC21750
    public final long set(int i, long j) {
        m52321(i);
        return this.f37627.set(this.f37626 + i, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37625 - this.f37626;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27938(long[] jArr, int i, int i2, int i3) {
        m52322(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f37627.mo27938(jArr, this.f37626 + i, i2, i3);
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27935(int i, int i2) {
        m52322(i);
        m52322(i2);
        int i3 = this.f37626;
        this.f37627.mo27935(i3 + i, i3 + i2);
        this.f37625 -= i2 - i;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27936(int i, int i2, long[] jArr) {
        m52322(i);
        this.f37627.mo27936(this.f37626 + i, i2, jArr);
    }

    @Override // l.AbstractC23785, java.util.List
    public InterfaceC18222 listIterator(int i) {
        m52322(i);
        AbstractC23785 abstractC23785 = this.f37627;
        return abstractC23785 instanceof RandomAccess ? new C6145(this, i) : new C17434(this, abstractC23785.listIterator(i + this.f37626));
    }

    @Override // l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC10462 spliterator() {
        AbstractC23785 abstractC23785 = this.f37627;
        return abstractC23785 instanceof RandomAccess ? new C16729(abstractC23785, this.f37626, this.f37625) : super.spliterator();
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo21796(long j) {
        int iMo39601 = mo39601(j);
        if (iMo39601 == -1) {
            return false;
        }
        this.f37625--;
        this.f37627.mo27941(this.f37626 + iMo39601);
        return true;
    }

    @Override // l.AbstractC23785
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27939(int i, InterfaceC14800 interfaceC14800) {
        m52322(i);
        return super.mo27939(i, interfaceC14800);
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27940(int i, InterfaceC21750 interfaceC21750) {
        m52322(i);
        return mo27939(i, (InterfaceC14800) interfaceC21750);
    }
}
