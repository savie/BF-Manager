package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13785 extends AbstractC13894 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f43732;

    public C13785(C3696 c3696) {
        this.f43732 = c3696;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43732.f12704.m37377();
    }

    @Override // l.AbstractC13894, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C22342(this.f43732);
    }
}
