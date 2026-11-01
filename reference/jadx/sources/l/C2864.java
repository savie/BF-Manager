package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.ۖ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2864 extends AbstractC22433 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5687 f10827;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

    public C2864(C5687 c5687) {
        this.f10827 = c5687;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C5687 c5687 = this.f10827;
        C18304.m42510(i, c5687.f19405);
        int i2 = i * 2;
        Object obj = c5687.f19407[c5687.f19406 + i2];
        C13638.requireNonNull(obj);
        Object obj2 = c5687.f19407[i2 + (c5687.f19406 ^ 1)];
        C13638.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10827.f19405;
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
