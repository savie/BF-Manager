package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes5.dex */
public class C15531 extends AbstractC13294 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50532;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC13294 f50534;

    @Override // l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC13294, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC13294, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC5574, l.InterfaceC3336
    public final InterfaceC12285 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC13294, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC13294, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C15531(AbstractC13294 abstractC13294, int i, int i2) {
        this.f50534 = abstractC13294;
        this.f50532 = i;
        this.f50533 = i2;
    }

    @Override // l.AbstractC13711, l.InterfaceC5574
    public final boolean add(long j) {
        this.f50534.mo37193(this.f50533, j);
        this.f50533++;
        return true;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37193(int i, long j) {
        m32831(i);
        this.f50534.mo37193(this.f50532 + i, j);
        this.f50533++;
    }

    @Override // l.AbstractC13294, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m32831(i);
        this.f50533 = collection.size() + this.f50533;
        return this.f50534.addAll(this.f50532 + i, collection);
    }

    public long getLong(int i) {
        m32838(i);
        return this.f50534.getLong(this.f50532 + i);
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long mo37196(int i) {
        m32838(i);
        this.f50533--;
        return this.f50534.mo37196(this.f50532 + i);
    }

    @Override // l.InterfaceC18252
    public final long set(int i, long j) {
        m32838(i);
        return this.f50534.set(this.f50532 + i, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50533 - this.f50532;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37194(long[] jArr, int i, int i2, int i3) {
        m32831(i);
        int i4 = i + i3;
        if (i4 <= size()) {
            this.f50534.mo37194(jArr, this.f50532 + i, i2, i3);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i4, "End index (", ") is greater than list size (");
            sbM12235.append(size());
            sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37191(int i, int i2) {
        m32831(i);
        m32831(i2);
        int i3 = this.f50532;
        this.f50534.mo37191(i3 + i, i3 + i2);
        this.f50533 -= i2 - i;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37192(int i, int i2, long[] jArr) {
        m32831(i);
        this.f50534.mo37192(this.f50532 + i, i2, jArr);
    }

    @Override // l.AbstractC13294, java.util.List
    public InterfaceC0353 listIterator(int i) {
        m32831(i);
        AbstractC13294 abstractC13294 = this.f50534;
        return abstractC13294 instanceof RandomAccess ? new C20007(this, i) : new C22991(this, abstractC13294.listIterator(i + this.f50532));
    }

    @Override // l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC9301 spliterator() {
        AbstractC13294 abstractC13294 = this.f50534;
        return abstractC13294 instanceof RandomAccess ? new C22245(abstractC13294, this.f50532, this.f50533) : super.spliterator();
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16517(long j) {
        int iMo32834 = mo32834(j);
        if (iMo32834 == -1) {
            return false;
        }
        this.f50533--;
        this.f50534.mo37196(this.f50532 + iMo32834);
        return true;
    }

    @Override // l.AbstractC13294
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32833(int i, InterfaceC5574 interfaceC5574) {
        m32831(i);
        return super.mo32833(i, interfaceC5574);
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo37195(int i, InterfaceC18252 interfaceC18252) {
        m32831(i);
        return mo32833(i, (InterfaceC5574) interfaceC18252);
    }
}
