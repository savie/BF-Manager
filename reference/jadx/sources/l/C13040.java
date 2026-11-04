package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.۫ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13040 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24975 f41728;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C24975 c24975 = this.f41728;
            if (i < c24975.f80881) {
                if (c24975.f80882) {
                    return c24975.f80870.m35793(c24975, i);
                }
                return new C1985(c24975, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C13040(C24975 c24975) {
        this.f41728 = c24975;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41728.f80881;
    }
}
