package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import l.AbstractC11766;
import l.AbstractC14975;
import l.C0921;
import l.C1181;
import l.C15565;
import l.C18386;
import l.C19092;
import l.C21643;
import l.C21914;
import l.C23326;
import l.InterfaceC22089;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC14975 {
    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo34(Object obj) {
        return obj instanceof AbstractC11766;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo36(Object obj) {
        if (obj != null) {
            return ((AbstractC11766) obj).clone();
        }
        return null;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo35(Object obj) {
        if (obj == null) {
            return null;
        }
        C21643 c21643 = new C21643();
        c21643.m48354((AbstractC11766) obj);
        return c21643;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo38(Object obj, View view, ArrayList arrayList) {
        C21643 c21643 = (C21643) obj;
        List targets = c21643.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14975.m35952((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo31((Object) c21643, arrayList);
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo37(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC14975.m35951(rect, view);
            ((AbstractC11766) obj).setEpicenterCallback(new C23326(rect));
        }
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo31(Object obj, ArrayList arrayList) {
        AbstractC11766 abstractC11766 = (AbstractC11766) obj;
        if (abstractC11766 == null) {
            return;
        }
        int i = 0;
        if (abstractC11766 instanceof C21643) {
            C21643 c21643 = (C21643) abstractC11766;
            int size = c21643.f70174.size();
            while (i < size) {
                mo31((Object) ((i < 0 || i >= c21643.f70174.size()) ? null : (AbstractC11766) c21643.f70174.get(i)), arrayList);
                i++;
            }
            return;
        }
        if (m23(abstractC11766) || !AbstractC14975.m35953(abstractC11766.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC11766.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23(AbstractC11766 abstractC11766) {
        return (AbstractC14975.m35953(abstractC11766.getTargetIds()) && AbstractC14975.m35953(abstractC11766.getTargetNames()) && AbstractC14975.m35953(abstractC11766.getTargetTypes())) ? false : true;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24(Object obj, Object obj2) {
        C21643 c21643 = new C21643();
        if (obj != null) {
            c21643.m48354((AbstractC11766) obj);
        }
        c21643.m48354((AbstractC11766) obj2);
        return c21643;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29(Object obj, View view, ArrayList arrayList) {
        ((AbstractC11766) obj).addListener(new C15565(view, arrayList));
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25(Object obj, Object obj2, Object obj3) {
        AbstractC11766 abstractC11766 = (AbstractC11766) obj;
        AbstractC11766 abstractC11767 = (AbstractC11766) obj2;
        AbstractC11766 abstractC11768 = (AbstractC11766) obj3;
        if (abstractC11766 != null && abstractC11767 != null) {
            C21643 c21643 = new C21643();
            c21643.m48354(abstractC11766);
            c21643.m48354(abstractC11767);
            c21643.m48352(1);
            abstractC11766 = c21643;
        } else if (abstractC11766 == null) {
            abstractC11766 = abstractC11767 != null ? abstractC11767 : null;
        }
        if (abstractC11768 == null) {
            return abstractC11766;
        }
        C21643 c21644 = new C21643();
        if (abstractC11766 != null) {
            c21644.m48354(abstractC11766);
        }
        c21644.m48354(abstractC11768);
        return c21644;
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27(ViewGroup viewGroup, Object obj) {
        C1181.m4320(viewGroup, (AbstractC11766) obj);
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC11766) obj).addListener(new C21914(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33(Object obj, C0921 c0921, final Runnable runnable) {
        final AbstractC11766 abstractC11766 = (AbstractC11766) obj;
        c0921.m3652(new InterfaceC22089() { // from class: l.ۜ᩻ܰ
            @Override // l.InterfaceC22089
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo18972() {
                abstractC11766.cancel();
                runnable.run();
            }
        });
        abstractC11766.addListener(new C18386(runnable));
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C21643 c21643 = (C21643) obj;
        if (c21643 != null) {
            c21643.getTargets().clear();
            c21643.getTargets().addAll(arrayList2);
            m39(c21643, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList arrayList, @SuppressLint({"UnknownNullness"}) ArrayList arrayList2) {
        AbstractC11766 abstractC11766 = (AbstractC11766) obj;
        int i = 0;
        if (abstractC11766 instanceof C21643) {
            C21643 c21643 = (C21643) abstractC11766;
            int size = c21643.f70174.size();
            while (i < size) {
                m39((i < 0 || i >= c21643.f70174.size()) ? null : (AbstractC11766) c21643.f70174.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m23(abstractC11766)) {
            return;
        }
        List targets = abstractC11766.getTargets();
        if (targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC11766.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC11766.removeTarget((View) arrayList.get(size3));
            }
        }
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26(View view, Object obj) {
        ((AbstractC11766) obj).addTarget(view);
    }

    @Override // l.AbstractC14975
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28(Object obj, Rect rect) {
        ((AbstractC11766) obj).setEpicenterCallback(new C19092(rect));
    }
}
