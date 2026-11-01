package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۨܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11850 extends AbstractC22433 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f39768;

    @Override // l.AbstractC22433, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC22433, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC22433, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public C11850(AbstractC22433 abstractC22433) {
        this.f39768 = abstractC22433;
    }

    @Override // l.AbstractC22433
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo29543() {
        return this.f39768;
    }

    @Override // l.AbstractC22433, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f39768.contains(obj);
    }

    @Override // l.AbstractC22433, java.util.List
    public final int indexOf(Object obj) {
        AbstractC22433 abstractC22433 = this.f39768;
        int iLastIndexOf = abstractC22433.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC22433.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // l.AbstractC22433, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC22433 abstractC22433 = this.f39768;
        int iIndexOf = abstractC22433.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC22433.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC22433 abstractC22433 = this.f39768;
        C18304.m42510(i, abstractC22433.size());
        return abstractC22433.get((abstractC22433.size() - 1) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39768.size();
    }

    @Override // l.AbstractC22433, java.util.List
    public final AbstractC22433 subList(int i, int i2) {
        AbstractC22433 abstractC22433 = this.f39768;
        C18304.m42511(i, i2, abstractC22433.size());
        return abstractC22433.subList(abstractC22433.size() - i2, abstractC22433.size() - i).mo29543();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return this.f39768.mo5042();
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
