package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۚ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5657 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient int f19538;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f19539;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1928 f19540;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

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

    public C5657(AbstractC1928 abstractC1928, int i, int i2) {
        this.f19540 = abstractC1928;
        this.f19539 = i;
        this.f19538 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19538;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۤ */
    public final Object[] mo14904() {
        return this.f19540.mo14904();
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩴ */
    public final int mo14906() {
        return this.f19540.mo14906() + this.f19539;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩸ */
    public final int mo14907() {
        return this.f19540.mo14906() + this.f19539 + this.f19538;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C12128.m30302(i, this.f19538);
        return this.f19540.get(i + this.f19539);
    }

    @Override // l.AbstractC1928, java.util.List
    public final AbstractC1928 subList(int i, int i2) {
        C12128.m30303(i, i2, this.f19538);
        int i3 = this.f19539;
        return this.f19540.subList(i + i3, i2 + i3);
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
