package l;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֡۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0299 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f1627;

    public C0299(Object[] objArr) {
        this.f1627 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1627.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f1627[i];
    }
}
