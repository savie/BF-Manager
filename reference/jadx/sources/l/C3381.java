package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.ۗܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3381 extends AbstractC22433 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4462 f12504;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

    public C3381(C4462 c4462) {
        this.f12504 = c4462;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C2345 c2345 = this.f12504.f15875;
        return new AbstractMap.SimpleImmutableEntry(c2345.f8284.f23786.get(i), c2345.f8282.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12504.f15875.size();
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
