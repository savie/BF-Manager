package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩶᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20507 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17684 f66474;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C17684 c17684 = this.f66474;
            if (i < c17684.f56171) {
                if (c17684.f56155) {
                    return c17684.f56154.m8633(c17684, i);
                }
                return new C12332(c17684, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C20507(C17684 c17684) {
        this.f66474 = c17684;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f66474.f56171;
    }
}
