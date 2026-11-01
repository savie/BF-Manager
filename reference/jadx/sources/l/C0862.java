package l;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes2.dex */
public final class C0862 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6507 f3517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f3518;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f3519;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3520;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C0862(C6507 c6507, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3517 = c6507;
        this.f3520 = obj;
        this.f3519 = arrayList;
        this.f3516 = obj2;
        this.f3518 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C6507 c6507 = this.f3517;
        Object obj = this.f3520;
        if (obj != null) {
            c6507.m17709(obj, this.f3519, (ArrayList) null);
        }
        Object obj2 = this.f3516;
        if (obj2 != null) {
            c6507.m17709(obj2, this.f3518, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
