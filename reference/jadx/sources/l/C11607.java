package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۨۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes3.dex */
public final class C11607 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22190 f39007;

    public C11607(C22190 c22190) {
        this.f39007 = c22190;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39007.m49252();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f39007.m49239(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28939() {
        ((AbstractList) this).modCount++;
    }
}
