package l;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4804 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FragmentTransitionSupport f16821;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f16822;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f16823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16824;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16825;

    public C4804(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f16821 = fragmentTransitionSupport;
        this.f16824 = obj;
        this.f16822 = arrayList;
        this.f16825 = obj2;
        this.f16823 = arrayList2;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        FragmentTransitionSupport fragmentTransitionSupport = this.f16821;
        Object obj = this.f16824;
        if (obj != null) {
            fragmentTransitionSupport.m40(obj, this.f16822, (ArrayList) null);
        }
        Object obj2 = this.f16825;
        if (obj2 != null) {
            fragmentTransitionSupport.m40(obj2, this.f16823, (ArrayList) null);
        }
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        abstractC0329.removeListener(this);
    }
}
