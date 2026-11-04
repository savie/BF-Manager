package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩻᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C25326 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23834 f81787;

    public C25326(C23834 c23834) {
        this.f81787 = c23834;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C23834 c23834 = this.f81787;
            if (i < c23834.f77186) {
                if (c23834.f77188.f12703) {
                    return new C17866(c23834, (i * c23834.f77189) + c23834.f77187);
                }
                return new C17120(c23834, (i * c23834.f77189) + c23834.f77187);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81787.f77186;
    }
}
