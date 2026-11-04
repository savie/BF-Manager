package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.۠۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8655 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10628 f28257;

    public C8655(C10628 c10628) {
        this.f28257 = c10628;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        C10628 c10628 = this.f28257;
        if (c10628.f33710) {
            c10628.m27103();
        }
        return ((C9400) c10628.f33712.get(i)).f30510;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C10628 c10628 = this.f28257;
        if (c10628.f33710) {
            c10628.m27103();
        }
        return c10628.f33712.size() - 1;
    }
}
