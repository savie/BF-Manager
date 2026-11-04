package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13311 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f42483;

    public C13311(AbstractC20024 abstractC20024) {
        this.f42483 = abstractC20024;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f42483.m46067();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42483.mo17039(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f42483.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C21604(this.f42483);
    }
}
