package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩺۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes.dex */
public final class C24171 extends AbstractList implements List, RandomAccess {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14473 f78276;

    public C24171(C14473 c14473) {
        this.f78276 = c14473;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f78276.m34948();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f78276.m34951(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54142() {
        ((AbstractList) this).modCount++;
    }
}
