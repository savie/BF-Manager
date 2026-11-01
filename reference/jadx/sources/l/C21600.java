package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩸۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21600 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6783 f70062;

    public C21600(C6783 c6783) {
        this.f70062 = c6783;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C6783 c6783 = this.f70062;
        if (i >= c6783.size()) {
            return C8479.m22141(i, i < 10 ? "type0" : "type");
        }
        return c6783.m10939(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70062.size();
    }
}
