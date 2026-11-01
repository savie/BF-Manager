package l;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩹۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5DP */
/* JADX INFO: loaded from: classes.dex */
public final class C22291 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f72824;

    public C22291(Object[] objArr) {
        this.f72824 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f72824.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f72824[i];
    }
}
