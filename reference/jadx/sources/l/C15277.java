package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ܳۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15277 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24975 f49928;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C24975 c24975 = this.f49928;
            if (i < c24975.f80877) {
                return new C25106(c24975, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C15277(C24975 c24975) {
        this.f49928 = c24975;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49928.f80877;
    }
}
