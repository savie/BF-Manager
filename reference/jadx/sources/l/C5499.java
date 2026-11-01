package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۚܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5499 extends AbstractC22433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f18900;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient int f18901;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22433 f18902;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

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

    public C5499(AbstractC22433 abstractC22433, int i, int i2) {
        this.f18902 = abstractC22433;
        this.f18900 = i;
        this.f18901 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18901;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۨ */
    public final Object[] mo5970() {
        return this.f18902.mo5970();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۚ */
    public final int mo5969() {
        return this.f18902.mo5969() + this.f18900;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۖ */
    public final int mo5967() {
        return this.f18902.mo5969() + this.f18900 + this.f18901;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C18304.m42510(i, this.f18901);
        return this.f18902.get(i + this.f18900);
    }

    @Override // l.AbstractC22433, java.util.List
    public final AbstractC22433 subList(int i, int i2) {
        C18304.m42511(i, i2, this.f18901);
        int i3 = this.f18900;
        return this.f18902.subList(i + i3, i2 + i3);
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
