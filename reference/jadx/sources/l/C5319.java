package l;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes3.dex */
public final class C5319 extends AbstractC11284 {
    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo35(Object obj) {
        return obj instanceof Transition;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo37(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۤ */
    public final Object mo36(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷ */
    public final void mo39(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC11284.m28530((View) arrayList.get(i), (List) targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo32((Object) transitionSet, arrayList);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷ */
    public final void mo38(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC11284.m28529(rect, view);
            ((Transition) obj).setEpicenterCallback(new C10538(rect));
        }
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo32(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo32((Object) transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m15968(transition) || !AbstractC11284.m28531((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15968(Transition transition) {
        return (AbstractC11284.m28531((List) transition.getTargetIds()) && AbstractC11284.m28531((List) transition.getTargetNames()) && AbstractC11284.m28531((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final Object mo25(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo30(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C22473(view, arrayList));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final Object mo26(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo28(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo31(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C19489(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo34(Object obj, C24947 c24947, Runnable runnable) {
        ((Transition) obj).addListener(new C15013(runnable));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo33(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m15969(transitionSet, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15969(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m15969(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m15968(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo27(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ */
    public final void mo29(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C12776(rect));
    }
}
