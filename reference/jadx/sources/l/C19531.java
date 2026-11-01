package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19531 extends AbstractC19338 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f62795;

    public C19531(C9654 c9654) {
        this.f62795 = c9654;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f62795.f32458.m45741();
    }

    @Override // l.AbstractC19338, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C10359(this.f62795);
    }
}
