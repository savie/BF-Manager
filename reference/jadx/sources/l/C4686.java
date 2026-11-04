package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۙۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4686 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8632 f16549;

    public C4686(C8632 c8632) {
        this.f16549 = c8632;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C8632 c8632 = this.f16549;
        if (i >= c8632.size()) {
            return C13645.m33382(i, i < 10 ? "type0" : "type");
        }
        return c8632.m15441(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16549.size();
    }
}
