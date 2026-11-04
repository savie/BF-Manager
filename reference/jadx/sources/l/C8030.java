package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۟ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes4.dex */
public class C8030 extends AbstractC10266 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f26648;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10266 f26650;

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10266, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10266, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C8030(AbstractC10266 abstractC10266, int i, int i2) {
        this.f26650 = abstractC10266;
        this.f26648 = i;
        this.f26649 = i2;
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5933(char c) {
        this.f26650.mo21904(c, this.f26649);
        this.f26649++;
        return true;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo21904(char c, int i) {
        m26472(i);
        this.f26650.mo21904(c, this.f26648 + i);
        this.f26649++;
    }

    @Override // l.AbstractC10266, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m26472(i);
        this.f26649 = collection.size() + this.f26649;
        return this.f26650.addAll(this.f26648 + i, collection);
    }

    public char getChar(int i) {
        m26473(i);
        return this.f26650.getChar(this.f26648 + i);
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final char mo21903(int i) {
        m26473(i);
        this.f26649--;
        return this.f26650.mo21903(this.f26648 + i);
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char mo21898(char c, int i) {
        m26473(i);
        return this.f26650.mo21898(c, this.f26648 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26649 - this.f26648;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21900(int i, int i2, char[] cArr, int i3) {
        m26472(i);
        int i4 = i + i3;
        if (i4 <= size()) {
            this.f26650.mo21900(this.f26648 + i, i2, cArr, i3);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i4, "End index (", ") is greater than list size (");
            sbM12235.append(size());
            sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21899(int i, int i2) {
        m26472(i);
        m26472(i2);
        int i3 = this.f26648;
        this.f26650.mo21899(i3 + i, i3 + i2);
        this.f26649 -= i2 - i;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21901(char[] cArr, int i, int i2) {
        m26472(i);
        this.f26650.mo21901(cArr, this.f26648 + i, i2);
    }

    @Override // l.AbstractC10266, java.util.List
    public InterfaceC8360 listIterator(int i) {
        m26472(i);
        AbstractC10266 abstractC10266 = this.f26650;
        return abstractC10266 instanceof RandomAccess ? new C0572(this, i) : new C18471(this, abstractC10266.listIterator(i + this.f26648));
    }

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC16321 spliterator() {
        AbstractC10266 abstractC10266 = this.f26650;
        return abstractC10266 instanceof RandomAccess ? new C19217(abstractC10266, this.f26648, this.f26649) : super.spliterator();
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4843(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        this.f26649--;
        this.f26650.mo21903(this.f26648 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC10266
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo21902(int i, InterfaceC12835 interfaceC12835) {
        m26472(i);
        return super.mo21902(i, interfaceC12835);
    }
}
