package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۡ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public class C9608 extends AbstractC8863 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31088;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31089;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC8863 f31090;

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC9367 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8863, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8863, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C9608(AbstractC8863 abstractC8863, int i, int i2) {
        this.f31090 = abstractC8863;
        this.f31088 = i;
        this.f31089 = i2;
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    public final boolean add(float f) {
        this.f31090.mo25096(f, this.f31089);
        this.f31089++;
        return true;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25096(float f, int i) {
        m23741(i);
        this.f31090.mo25096(f, this.f31088 + i);
        this.f31089++;
    }

    @Override // l.AbstractC8863, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m23741(i);
        this.f31089 = collection.size() + this.f31089;
        return this.f31090.addAll(this.f31088 + i, collection);
    }

    @Override // l.InterfaceC21874
    public float getFloat(int i) {
        m23746(i);
        return this.f31090.getFloat(this.f31088 + i);
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float mo25095(int i) {
        m23746(i);
        this.f31089--;
        return this.f31090.mo25095(this.f31088 + i);
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo25091(float f, int i) {
        m23746(i);
        return this.f31090.mo25091(f, this.f31088 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31089 - this.f31088;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25093(int i, int i2, int i3, float[] fArr) {
        m23741(i);
        int i4 = i + i3;
        if (i4 <= size()) {
            this.f31090.mo25093(this.f31088 + i, i2, i3, fArr);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i4, "End index (", ") is greater than list size (");
            sbM12235.append(size());
            sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25092(int i, int i2) {
        m23741(i);
        m23741(i2);
        int i3 = this.f31088;
        this.f31090.mo25092(i3 + i, i3 + i2);
        this.f31089 -= i2 - i;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25094(int i, int i2, float[] fArr) {
        m23741(i);
        this.f31090.mo25094(this.f31088 + i, i2, fArr);
    }

    @Override // l.AbstractC8863, java.util.List
    public InterfaceC10685 listIterator(int i) {
        m23741(i);
        AbstractC8863 abstractC8863 = this.f31090;
        return abstractC8863 instanceof RandomAccess ? new C1406(this, i) : new C10354(this, abstractC8863.listIterator(i + this.f31088));
    }

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15906 spliterator() {
        AbstractC8863 abstractC8863 = this.f31090;
        return abstractC8863 instanceof RandomAccess ? new C2897(abstractC8863, this.f31088, this.f31089) : super.spliterator();
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2883(float f) {
        int iMo23745 = mo23745(f);
        if (iMo23745 == -1) {
            return false;
        }
        this.f31089--;
        this.f31090.mo25095(this.f31088 + iMo23745);
        return true;
    }

    @Override // l.AbstractC8863
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23742(int i, InterfaceC17572 interfaceC17572) {
        m23741(i);
        return super.mo23742(i, interfaceC17572);
    }
}
