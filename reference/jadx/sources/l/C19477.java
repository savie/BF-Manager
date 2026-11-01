package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19477 implements InterfaceC8188 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f62694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8894 f62695;

    public C19477(AbstractC8894 abstractC8894, int i) {
        this.f62695 = abstractC8894;
        this.f62694 = i;
    }

    @Override // l.InterfaceC8188
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8557(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC8894 abstractC8894 = this.f62695;
        ComponentCallbacksC22654 componentCallbacksC22654 = abstractC8894.f30508;
        int i = this.f62694;
        if (componentCallbacksC22654 == null || i >= 0 || !componentCallbacksC22654.getChildFragmentManager().m23110()) {
            return abstractC8894.m23100(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
