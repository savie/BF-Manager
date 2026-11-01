package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩳۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public class C17973 extends AbstractC8096 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57483;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f57484;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC8096 f57485;

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8096, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC8096, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C17973(AbstractC8096 abstractC8096, int i, int i2) {
        this.f57485 = abstractC8096;
        this.f57484 = i;
        this.f57483 = i2;
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2291(char c) {
        this.f57485.mo26241(c, this.f57483);
        this.f57483++;
        return true;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ܰ */
    public final void mo26241(char c, int i) {
        m21307(i);
        this.f57485.mo26241(c, this.f57484 + i);
        this.f57483++;
    }

    @Override // l.AbstractC8096, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m21307(i);
        this.f57483 = collection.size() + this.f57483;
        return this.f57485.addAll(this.f57484 + i, collection);
    }

    public char getChar(int i) {
        m21305(i);
        return this.f57485.getChar(this.f57484 + i);
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ᩵ */
    public final char mo26242(int i) {
        m21305(i);
        this.f57483--;
        return this.f57485.mo26242(this.f57484 + i);
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final char mo26237(char c, int i) {
        m21305(i);
        return this.f57485.mo26237(c, this.f57484 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57483 - this.f57484;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26239(int i, int i2, char[] cArr, int i3) {
        m21307(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f57485.mo26239(this.f57484 + i, i2, cArr, i3);
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26238(int i, int i2) {
        m21307(i);
        m21307(i2);
        int i3 = this.f57484;
        this.f57485.mo26238(i3 + i, i3 + i2);
        this.f57483 -= i2 - i;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26240(char[] cArr, int i, int i2) {
        m21307(i);
        this.f57485.mo26240(cArr, this.f57484 + i, i2);
    }

    @Override // l.AbstractC8096, java.util.List
    public InterfaceC20921 listIterator(int i) {
        m21307(i);
        AbstractC8096 abstractC8096 = this.f57485;
        return abstractC8096 instanceof RandomAccess ? new C21501(this, i) : new C15152(this, abstractC8096.listIterator(i + this.f57484));
    }

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11687 spliterator() {
        AbstractC8096 abstractC8096 = this.f57485;
        return abstractC8096 instanceof RandomAccess ? new C18679(abstractC8096, this.f57484, this.f57483) : super.spliterator();
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5455(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        this.f57483--;
        this.f57485.mo26242(this.f57484 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC8096
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21309(int i, InterfaceC23475 interfaceC23475) {
        m21307(i);
        return super.mo21309(i, interfaceC23475);
    }
}
