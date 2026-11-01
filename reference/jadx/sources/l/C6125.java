package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۛܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6125 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1891 f20909;

    public C6125(C1891 c1891) {
        this.f20909 = c1891;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C1891 c1891 = this.f20909;
            if (i < c1891.f7134) {
                if (c1891.f7135.f32459) {
                    return new C23765(c1891, (i * c1891.f7137) + c1891.f7136);
                }
                return new C11065(c1891, (i * c1891.f7137) + c1891.f7136);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20909.f7134;
    }
}
