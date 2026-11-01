package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۚۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22190 f18227;

    public C5256(C22190 c22190) {
        this.f18227 = c22190;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18227.m49252();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f18227.m49244(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14527() {
        ((AbstractList) this).modCount++;
    }
}
