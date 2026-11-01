package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ܺ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16274 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17684 f52437;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C17684 c17684 = this.f52437;
            if (i < c17684.f56165) {
                return new C5981(c17684, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C16274(C17684 c17684) {
        this.f52437 = c17684;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52437.f56165;
    }
}
