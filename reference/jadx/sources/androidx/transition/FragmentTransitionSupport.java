package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import l.AbstractC0329;
import l.AbstractC11284;
import l.C1075;
import l.C10769;
import l.C13513;
import l.C21958;
import l.C24947;
import l.C4608;
import l.C4804;
import l.C6802;
import l.InterfaceC11520;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC11284 {
    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo35(Object obj) {
        return obj instanceof AbstractC0329;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo37(Object obj) {
        if (obj != null) {
            return ((AbstractC0329) obj).clone();
        }
        return null;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object mo36(Object obj) {
        if (obj == null) {
            return null;
        }
        C4608 c4608 = new C4608();
        c4608.m14411((AbstractC0329) obj);
        return c4608;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo39(Object obj, View view, ArrayList arrayList) {
        C4608 c4608 = (C4608) obj;
        List targets = c4608.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC11284.m28530((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo32((Object) c4608, arrayList);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo38(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC11284.m28529(rect, view);
            ((AbstractC0329) obj).setEpicenterCallback(new C6802(rect));
        }
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32(Object obj, ArrayList arrayList) {
        AbstractC0329 abstractC0329 = (AbstractC0329) obj;
        if (abstractC0329 == null) {
            return;
        }
        int i = 0;
        if (abstractC0329 instanceof C4608) {
            C4608 c4608 = (C4608) abstractC0329;
            int size = c4608.f16339.size();
            while (i < size) {
                mo32((Object) ((i < 0 || i >= c4608.f16339.size()) ? null : (AbstractC0329) c4608.f16339.get(i)), arrayList);
                i++;
            }
            return;
        }
        if (m24(abstractC0329) || !AbstractC11284.m28531(abstractC0329.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC0329.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24(AbstractC0329 abstractC0329) {
        return (AbstractC11284.m28531(abstractC0329.getTargetIds()) && AbstractC11284.m28531(abstractC0329.getTargetNames()) && AbstractC11284.m28531(abstractC0329.getTargetTypes())) ? false : true;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25(Object obj, Object obj2) {
        C4608 c4608 = new C4608();
        if (obj != null) {
            c4608.m14411((AbstractC0329) obj);
        }
        c4608.m14411((AbstractC0329) obj2);
        return c4608;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0329) obj).addListener(new C13513(view, arrayList));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo26(Object obj, Object obj2, Object obj3) {
        AbstractC0329 abstractC0329 = (AbstractC0329) obj;
        AbstractC0329 abstractC03210 = (AbstractC0329) obj2;
        AbstractC0329 abstractC03211 = (AbstractC0329) obj3;
        if (abstractC0329 != null && abstractC03210 != null) {
            C4608 c4608 = new C4608();
            c4608.m14411(abstractC0329);
            c4608.m14411(abstractC03210);
            c4608.m14409(1);
            abstractC0329 = c4608;
        } else if (abstractC0329 == null) {
            abstractC0329 = abstractC03210 != null ? abstractC03210 : null;
        }
        if (abstractC03211 == null) {
            return abstractC0329;
        }
        C4608 c4609 = new C4608();
        if (abstractC0329 != null) {
            c4609.m14411(abstractC0329);
        }
        c4609.m14411(abstractC03211);
        return c4609;
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28(ViewGroup viewGroup, Object obj) {
        C1075.m4036(viewGroup, (AbstractC0329) obj);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo31(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC0329) obj).addListener(new C4804(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34(Object obj, C24947 c24947, final Runnable runnable) {
        final AbstractC0329 abstractC0329 = (AbstractC0329) obj;
        c24947.m55704(new InterfaceC11520() { // from class: l.۠֨᩷
            @Override // l.InterfaceC11520
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo22385() {
                abstractC0329.cancel();
                runnable.run();
            }
        });
        abstractC0329.addListener(new C21958(runnable));
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C4608 c4608 = (C4608) obj;
        if (c4608 != null) {
            c4608.getTargets().clear();
            c4608.getTargets().addAll(arrayList2);
            m40(c4608, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList arrayList, @SuppressLint({"UnknownNullness"}) ArrayList arrayList2) {
        AbstractC0329 abstractC0329 = (AbstractC0329) obj;
        int i = 0;
        if (abstractC0329 instanceof C4608) {
            C4608 c4608 = (C4608) abstractC0329;
            int size = c4608.f16339.size();
            while (i < size) {
                m40((i < 0 || i >= c4608.f16339.size()) ? null : (AbstractC0329) c4608.f16339.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m24(abstractC0329)) {
            return;
        }
        List targets = abstractC0329.getTargets();
        if (targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC0329.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC0329.removeTarget((View) arrayList.get(size3));
            }
        }
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27(View view, Object obj) {
        ((AbstractC0329) obj).addTarget(view);
    }

    @Override // l.AbstractC11284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29(Object obj, Rect rect) {
        ((AbstractC0329) obj).setEpicenterCallback(new C10769(rect));
    }
}
