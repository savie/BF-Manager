package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۤۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public class C10276 extends AbstractC20859 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f35020;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f35021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC20859 f35022;

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC10007 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC20859, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC20859, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C10276(AbstractC20859 abstractC20859, int i, int i2) {
        this.f35022 = abstractC20859;
        this.f35021 = i;
        this.f35020 = i2;
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    public final boolean add(float f) {
        this.f35022.mo26069(f, this.f35020);
        this.f35020++;
        return true;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo26069(float f, int i) {
        m46896(i);
        this.f35022.mo26069(f, this.f35021 + i);
        this.f35020++;
    }

    @Override // l.AbstractC20859, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m46896(i);
        this.f35020 = collection.size() + this.f35020;
        return this.f35022.addAll(this.f35021 + i, collection);
    }

    public float getFloat(int i) {
        m46895(i);
        return this.f35022.getFloat(this.f35021 + i);
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float mo26070(int i) {
        m46895(i);
        this.f35020--;
        return this.f35022.mo26070(this.f35021 + i);
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo26064(float f, int i) {
        m46895(i);
        return this.f35022.mo26064(f, this.f35021 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35020 - this.f35021;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26066(int i, int i2, int i3, float[] fArr) {
        m46896(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f35022.mo26066(this.f35021 + i, i2, i3, fArr);
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26065(int i, int i2) {
        m46896(i);
        m46896(i2);
        int i3 = this.f35021;
        this.f35022.mo26065(i3 + i, i3 + i2);
        this.f35020 -= i2 - i;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26067(int i, int i2, float[] fArr) {
        m46896(i);
        this.f35022.mo26067(this.f35021 + i, i2, fArr);
    }

    @Override // l.AbstractC20859, java.util.List
    public InterfaceC12124 listIterator(int i) {
        m46896(i);
        AbstractC20859 abstractC20859 = this.f35022;
        return abstractC20859 instanceof RandomAccess ? new C8865(this, i) : new C19448(this, abstractC20859.listIterator(i + this.f35021));
    }

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11501 spliterator() {
        AbstractC20859 abstractC20859 = this.f35022;
        return abstractC20859 instanceof RandomAccess ? new C7453(abstractC20859, this.f35021, this.f35020) : super.spliterator();
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6889(float f) {
        int iMo27734 = mo27734(f);
        if (iMo27734 == -1) {
            return false;
        }
        this.f35020--;
        this.f35022.mo26070(this.f35021 + iMo27734);
        return true;
    }

    @Override // l.AbstractC20859
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26068(int i, InterfaceC13535 interfaceC13535) {
        m46896(i);
        return super.mo26068(i, interfaceC13535);
    }
}
