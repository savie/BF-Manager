package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4956 extends AbstractList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C4956 f17303 = new C4956(AbstractC22433.of());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17304 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f17305;

    public C4956(AbstractC22433 abstractC22433) {
        this.f17305 = abstractC22433;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (C1428) this.f17305.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17305.size();
    }
}
