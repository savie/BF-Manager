package l;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21914 extends C2592 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71101;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FragmentTransitionSupport f71102;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f71103;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f71104;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71105;

    public C21914(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f71102 = fragmentTransitionSupport;
        this.f71105 = obj;
        this.f71104 = arrayList;
        this.f71101 = obj2;
        this.f71103 = arrayList2;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        FragmentTransitionSupport fragmentTransitionSupport = this.f71102;
        Object obj = this.f71105;
        if (obj != null) {
            fragmentTransitionSupport.m39(obj, this.f71104, (ArrayList) null);
        }
        Object obj2 = this.f71101;
        if (obj2 != null) {
            fragmentTransitionSupport.m39(obj2, this.f71103, (ArrayList) null);
        }
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        abstractC11766.removeListener(this);
    }
}
