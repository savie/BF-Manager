package l;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19489 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5319 f62915;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f62916;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f62917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62918;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62919;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C19489(C5319 c5319, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f62915 = c5319;
        this.f62918 = obj;
        this.f62916 = arrayList;
        this.f62919 = obj2;
        this.f62917 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C5319 c5319 = this.f62915;
        Object obj = this.f62918;
        if (obj != null) {
            c5319.m15969(obj, this.f62916, (ArrayList) null);
        }
        Object obj2 = this.f62919;
        if (obj2 != null) {
            c5319.m15969(obj2, this.f62917, (ArrayList) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
