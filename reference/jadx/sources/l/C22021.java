package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.᩷ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22021 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10832 f71050;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C22021(C10832 c10832) {
        this.f71050 = c10832;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C10832 c10832 = this.f71050;
        C12128.m30302(i, c10832.f34314);
        int i2 = i * 2;
        Object obj = c10832.f34312[c10832.f34313 + i2];
        C17359.requireNonNull(obj);
        Object obj2 = c10832.f34312[i2 + (c10832.f34313 ^ 1)];
        C17359.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71050.f34314;
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
