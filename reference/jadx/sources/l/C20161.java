package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public class C20161 extends AbstractC15685 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f64763;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64764;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15685 f64765;

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15685, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15685, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C20161(AbstractC15685 abstractC15685, int i, int i2) {
        this.f64765 = abstractC15685;
        this.f64763 = i;
        this.f64764 = i2;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        this.f64765.add(this.f64764, i);
        this.f64764++;
        return true;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final void add(int i, int i2) {
        m37462(i);
        this.f64765.add(this.f64763 + i, i2);
        this.f64764++;
    }

    @Override // l.AbstractC15685, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m37462(i);
        this.f64764 = collection.size() + this.f64764;
        return this.f64765.addAll(this.f64763 + i, collection);
    }

    public int getInt(int i) {
        m37464(i);
        return this.f64765.getInt(this.f64763 + i);
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ܶ */
    public final int mo14697(int i) {
        m37464(i);
        this.f64764--;
        return this.f64765.mo14697(this.f64763 + i);
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int set(int i, int i2) {
        m37464(i);
        return this.f64765.set(this.f64763 + i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64764 - this.f64763;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        m37462(i);
        int i4 = i + i3;
        if (i4 <= size()) {
            this.f64765.mo14688(this.f64763 + i, i2, i3, iArr);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i4, "End index (", ") is greater than list size (");
            sbM12235.append(size());
            sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14687(int i, int i2) {
        m37462(i);
        m37462(i2);
        int i3 = this.f64763;
        this.f64765.mo14687(i3 + i, i3 + i2);
        this.f64764 -= i2 - i;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14698(int i, int i2, int[] iArr) {
        m37462(i);
        this.f64765.mo14698(this.f64763 + i, i2, iArr);
        this.f64764 += i2;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14689(int i, int i2, int[] iArr) {
        m37462(i);
        this.f64765.mo14689(this.f64763 + i, i2, iArr);
    }

    @Override // l.AbstractC15685, java.util.List
    public InterfaceC8273 listIterator(int i) {
        m37462(i);
        AbstractC15685 abstractC15685 = this.f64765;
        return abstractC15685 instanceof RandomAccess ? new C23145(this, i) : new C11210(this, abstractC15685.listIterator(i + this.f64763));
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15949 spliterator() {
        AbstractC15685 abstractC15685 = this.f64765;
        return abstractC15685 instanceof RandomAccess ? new C5245(abstractC15685, this.f64763, this.f64764) : super.spliterator();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        this.f64764--;
        this.f64765.mo14697(this.f64763 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC15685
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14691(int i, InterfaceC1340 interfaceC1340) {
        m37462(i);
        return super.mo14691(i, interfaceC1340);
    }
}
