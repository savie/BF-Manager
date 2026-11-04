package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܳ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15351 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f50106;

    @Override // l.AbstractC1928, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC1928, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC1928, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public C15351(AbstractC1928 abstractC1928) {
        this.f50106 = abstractC1928;
    }

    @Override // l.AbstractC1928
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC1928 mo6620() {
        return this.f50106;
    }

    @Override // l.AbstractC1928, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f50106.contains(obj);
    }

    @Override // l.AbstractC1928, java.util.List
    public final int indexOf(Object obj) {
        AbstractC1928 abstractC1928 = this.f50106;
        int iLastIndexOf = abstractC1928.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC1928.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // l.AbstractC1928, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC1928 abstractC1928 = this.f50106;
        int iIndexOf = abstractC1928.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC1928.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1928 abstractC1928 = this.f50106;
        C12128.m30302(i, abstractC1928.size());
        return abstractC1928.get((abstractC1928.size() - 1) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50106.size();
    }

    @Override // l.AbstractC1928, java.util.List
    public final AbstractC1928 subList(int i, int i2) {
        AbstractC1928 abstractC1928 = this.f50106;
        C12128.m30303(i, i2, abstractC1928.size());
        return abstractC1928.subList(abstractC1928.size() - i2, abstractC1928.size() - i).mo6620();
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return this.f50106.mo14905();
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
