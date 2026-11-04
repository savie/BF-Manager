package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes.dex */
public final class C23329 implements InterfaceC15869 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75561;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3191 f75562;

    public C23329(AbstractC3191 abstractC3191, int i) {
        this.f75562 = abstractC3191;
        this.f75561 = i;
    }

    @Override // l.InterfaceC15869
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37837(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC3191 abstractC3191 = this.f75562;
        ComponentCallbacksC11612 componentCallbacksC11612 = abstractC3191.f10388;
        int i = this.f75561;
        if (componentCallbacksC11612 == null || i >= 0 || !componentCallbacksC11612.getChildFragmentManager().m10433()) {
            return abstractC3191.m10463(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
