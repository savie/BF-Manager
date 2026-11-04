package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.᩷ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C21847 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10658 f69609;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C21847(C10658 c10658) {
        this.f69609 = c10658;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19609 c19609 = this.f69609.f33783;
        return new AbstractMap.SimpleImmutableEntry(c19609.f63201.f19445.get(i), c19609.f63200.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69609.f33783.size();
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
