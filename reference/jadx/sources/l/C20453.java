package l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20453 extends AbstractC12153 {
    /* JADX WARN: Code duplicated, block: B:211:0x0651  */
    /* JADX WARN: Code duplicated, block: B:224:0x068e  */
    /* JADX WARN: Code duplicated, block: B:228:0x069d  */
    /* JADX WARN: Code duplicated, block: B:229:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:231:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:243:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x070f  */
    /* JADX WARN: Code duplicated, block: B:253:0x072c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0733  */
    /* JADX WARN: Code duplicated, block: B:256:0x074d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0767 A[LOOP:7: B:259:0x0761->B:261:0x0767, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x0785  */
    /* JADX WARN: Code duplicated, block: B:299:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x065d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x066f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC12153
    /* JADX INFO: renamed from: ۙ */
    public final void mo30228(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        HashMap map;
        ArrayList<C16386> arrayList3;
        C16386 c16386;
        C16386 c16387;
        C16386 c16388;
        C16386 c16389;
        Object obj;
        View view;
        Object objMo24;
        C21445 c21445;
        Object objMo25;
        HashMap map2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj2;
        ArrayList arrayList6;
        View view2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        HashMap map3;
        int i;
        Object obj3;
        View view3;
        boolean zContainsValue;
        ViewGroup viewGroupM30231;
        Context context;
        ArrayList<C7753> arrayList11;
        Iterator it;
        boolean z2;
        C16386 c16386M47612;
        ComponentCallbacksC22654 componentCallbacksC22654M38571;
        View view4;
        Animation animation;
        C7753 c7753;
        C8543 c8543M20399;
        Animator animator;
        C16386 c16386M47613;
        ComponentCallbacksC22654 componentCallbacksC22654M38572;
        boolean z3;
        Iterator it2 = arrayList.iterator();
        C16386 c163810 = null;
        C16386 c163811 = null;
        while (it2.hasNext()) {
            C16386 c163812 = (C16386) it2.next();
            EnumC0157 enumC0157M1254 = EnumC0157.m1254(c163812.m38571().mView);
            int i2 = C4224.f15310[c163812.m38577().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (enumC0157M1254 == EnumC0157.VISIBLE && c163810 == null) {
                    c163810 = c163812;
                }
            } else if (i2 == 4 && enumC0157M1254 != EnumC0157.VISIBLE) {
                c163811 = c163812;
            }
        }
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c163810);
            C13638.toString(c163811);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList<C16220> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(arrayList);
        ComponentCallbacksC22654 componentCallbacksC22654M38573 = ((C16386) C19084.m43861(arrayList, 1)).m38571();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C16386 c163813 = (C16386) it3.next();
            c163813.m38571().mAnimationInfo.f71205 = componentCallbacksC22654M38573.mAnimationInfo.f71205;
            c163813.m38571().mAnimationInfo.f71213 = componentCallbacksC22654M38573.mAnimationInfo.f71213;
            c163813.m38571().mAnimationInfo.f71214 = componentCallbacksC22654M38573.mAnimationInfo.f71214;
            c163813.m38571().mAnimationInfo.f71208 = componentCallbacksC22654M38573.mAnimationInfo.f71208;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C16386 c163814 = (C16386) it4.next();
            C0921 c0921 = new C0921();
            c163814.m38580(c0921);
            arrayList12.add(new C7753(c163814, c0921, z));
            C0921 c0922 = new C0921();
            c163814.m38580(c0922);
            arrayList13.add(new C16220(c163814, c0922, z, !z ? c163814 != c163811 : c163814 != c163810));
            c163814.m38573(new RunnableC7047(this, arrayList14, c163814));
        }
        HashMap map4 = new HashMap();
        AbstractC14975 abstractC14975 = null;
        for (C16220 c16220 : arrayList13) {
            if (!c16220.m47609()) {
                AbstractC14975 abstractC14975M38333 = c16220.m38333();
                if (abstractC14975 == null) {
                    abstractC14975 = abstractC14975M38333;
                } else if (abstractC14975M38333 != null && abstractC14975 != abstractC14975M38333) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c16220.m47612().m38571() + " returned Transition " + c16220.m38331() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC14975 != null) {
            View view5 = new View(m30231().getContext());
            Rect rect = new Rect();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            C21445 c21446 = new C21445();
            Object obj4 = null;
            View view6 = null;
            boolean z4 = false;
            for (C16220 c16221 : arrayList13) {
                if (!c16221.m38334() || c163810 == null || c163811 == null) {
                    arrayList7 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    arrayList10 = arrayList16;
                    map3 = map4;
                } else {
                    Object objMo35 = abstractC14975.mo35(abstractC14975.mo36(c16221.m38335()));
                    ArrayList<String> sharedElementSourceNames = c163811.m38571().getSharedElementSourceNames();
                    ArrayList sharedElementSourceNames2 = c163810.m38571().getSharedElementSourceNames();
                    arrayList7 = arrayList12;
                    ArrayList sharedElementTargetNames = c163810.m38571().getSharedElementTargetNames();
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    int i3 = 0;
                    while (i3 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                        ArrayList arrayList17 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, (String) sharedElementSourceNames2.get(i3));
                        }
                        i3++;
                        sharedElementTargetNames = arrayList17;
                    }
                    ArrayList<String> sharedElementTargetNames2 = c163811.m38571().getSharedElementTargetNames();
                    if (z) {
                        c163810.m38571().getEnterTransitionCallback();
                        c163811.m38571().getExitTransitionCallback();
                    } else {
                        c163810.m38571().getExitTransitionCallback();
                        c163811.m38571().getEnterTransitionCallback();
                    }
                    int i4 = 0;
                    for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                        c21446.put((String) sharedElementSourceNames.get(i4), (String) sharedElementTargetNames2.get(i4));
                        i4++;
                    }
                    if (AbstractC8894.m23060(2)) {
                        for (String str : sharedElementTargetNames2) {
                        }
                        for (String str2 : sharedElementSourceNames) {
                        }
                    }
                    C21445 c21447 = new C21445();
                    m46254(c21447, c163810.m38571().mView);
                    c21447.m48073((Collection) sharedElementSourceNames);
                    c21446.m48073((Collection) c21447.keySet());
                    C21445 c21448 = new C21445();
                    m46254(c21448, c163811.m38571().mView);
                    c21448.m48073((Collection) sharedElementTargetNames2);
                    c21448.m48073(c21446.values());
                    AbstractC14975 abstractC14976 = C2273.f8120;
                    int size2 = c21446.size() - 1;
                    while (size2 >= 0) {
                        HashMap map5 = map4;
                        if (!c21448.containsKey((String) c21446.m30513(size2))) {
                            c21446.m30509(size2);
                        }
                        size2--;
                        map4 = map5;
                    }
                    HashMap map6 = map4;
                    m46255(c21447, c21446.keySet());
                    m46255(c21448, c21446.values());
                    if (c21446.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        obj4 = null;
                        arrayList10 = arrayList16;
                        map3 = map6;
                    } else {
                        ComponentCallbacksC22654 componentCallbacksC22654M38574 = c163811.m38571();
                        ComponentCallbacksC22654 componentCallbacksC22654M38575 = c163810.m38571();
                        if (z) {
                            componentCallbacksC22654M38575.getEnterTransitionCallback();
                        } else {
                            componentCallbacksC22654M38574.getEnterTransitionCallback();
                        }
                        ViewTreeObserverOnPreDrawListenerC22337.m49503(m30231(), new RunnableC8459(c163811, c163810, z, c21448));
                        arrayList15.addAll(c21447.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i = 0;
                            obj3 = null;
                        } else {
                            i = 0;
                            obj3 = null;
                            View view7 = (View) c21447.getOrDefault((String) sharedElementSourceNames.get(0), null);
                            abstractC14975.mo37(view7, objMo35);
                            view6 = view7;
                        }
                        arrayList16.addAll(c21448.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) c21448.getOrDefault((String) sharedElementTargetNames2.get(i), obj3)) != null) {
                            ViewTreeObserverOnPreDrawListenerC22337.m49503(m30231(), new RunnableC19748(abstractC14975, view3, rect));
                            z4 = true;
                        }
                        abstractC14975.mo38(objMo35, view5, arrayList15);
                        arrayList10 = arrayList16;
                        abstractC14975.mo30(objMo35, null, null, objMo35, arrayList10);
                        Boolean bool = Boolean.TRUE;
                        map3 = map6;
                        map3.put(c163810, bool);
                        map3.put(c163811, bool);
                        obj4 = objMo35;
                    }
                }
                arrayList15 = arrayList15;
                rect = rect;
                c21446 = c21446;
                arrayList16 = arrayList10;
                map4 = map3;
                arrayList13 = arrayList8;
                arrayList12 = arrayList7;
                arrayList14 = arrayList9;
                view5 = view5;
            }
            arrayList2 = arrayList12;
            ArrayList<C16220> arrayList18 = arrayList13;
            ArrayList arrayList19 = arrayList14;
            C21445 c21449 = c21446;
            ArrayList<View> arrayList20 = arrayList16;
            Rect rect2 = rect;
            View view8 = view5;
            HashMap map7 = map4;
            ArrayList arrayList21 = arrayList15;
            ArrayList arrayList22 = new ArrayList();
            Iterator it5 = arrayList18.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it5.hasNext()) {
                C16220 c16222 = (C16220) it5.next();
                if (c16222.m47609()) {
                    map7.put(c16222.m47612(), Boolean.FALSE);
                    c16222.m47610();
                } else {
                    Object objMo36 = abstractC14975.mo36(c16222.m38331());
                    C16386 c16386M47614 = c16222.m47612();
                    boolean z5 = obj4 != null && (c16386M47614 == c163810 || c16386M47614 == c163811);
                    if (objMo36 == null) {
                        if (!z5) {
                            map7.put(c16386M47614, Boolean.FALSE);
                            c16222.m47610();
                        }
                        arrayList4 = arrayList21;
                        c21445 = c21449;
                        view = view8;
                        obj = obj4;
                        map2 = map7;
                        view2 = view6;
                        arrayList6 = arrayList19;
                    } else {
                        HashMap map8 = map7;
                        ArrayList arrayList23 = new ArrayList();
                        m46253(c16386M47614.m38571().mView, arrayList23);
                        if (z5) {
                            if (c16386M47614 == c163810) {
                                arrayList23.removeAll(arrayList21);
                            } else {
                                arrayList23.removeAll(arrayList20);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC14975.mo26(view8, objMo36);
                            c21445 = c21449;
                            view = view8;
                            obj = obj4;
                            objMo24 = obj6;
                            objMo25 = obj5;
                            arrayList6 = arrayList19;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            obj2 = objMo36;
                            arrayList5 = arrayList23;
                        } else {
                            abstractC14975.mo31(objMo36, arrayList23);
                            obj = obj4;
                            view = view8;
                            objMo24 = obj6;
                            c21445 = c21449;
                            objMo25 = obj5;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            arrayList5 = arrayList23;
                            abstractC14975.mo30(objMo36, objMo36, arrayList23, null, null);
                            if (c16386M47614.m38577() == EnumC0157.GONE) {
                                c16386M47614 = c16386M47614;
                                arrayList6 = arrayList19;
                                arrayList6.remove(c16386M47614);
                                ArrayList arrayList24 = new ArrayList(arrayList5);
                                arrayList24.remove(c16386M47614.m38571().mView);
                                obj2 = objMo36;
                                abstractC14975.mo29(obj2, c16386M47614.m38571().mView, arrayList24);
                                ViewTreeObserverOnPreDrawListenerC22337.m49503(m30231(), new RunnableC9165(arrayList5));
                            } else {
                                c16386M47614 = c16386M47614;
                                obj2 = objMo36;
                                arrayList6 = arrayList19;
                            }
                        }
                        if (c16386M47614.m38577() == EnumC0157.VISIBLE) {
                            arrayList22.addAll(arrayList5);
                            if (z4) {
                                abstractC14975.mo28(obj2, rect2);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            abstractC14975.mo37(view2, obj2);
                        }
                        map2.put(c16386M47614, Boolean.TRUE);
                        if (c16222.m38332()) {
                            objMo25 = abstractC14975.mo24(objMo25, obj2);
                        } else {
                            objMo24 = abstractC14975.mo24(objMo24, obj2);
                        }
                        obj5 = objMo25;
                        obj6 = objMo24;
                    }
                    view6 = view2;
                    map7 = map2;
                    arrayList19 = arrayList6;
                    arrayList21 = arrayList4;
                    obj4 = obj;
                    view8 = view;
                    c21449 = c21445;
                    it5 = it5;
                }
            }
            ArrayList<View> arrayList25 = arrayList21;
            C12274 c12274 = c21449;
            Object obj7 = obj4;
            map = map7;
            arrayList3 = arrayList19;
            Object objMo26 = abstractC14975.mo25(obj5, obj6, obj7);
            if (objMo26 != null) {
                for (C16220 c16223 : arrayList18) {
                    if (!c16223.m47609()) {
                        Object objM38331 = c16223.m38331();
                        C16386 c16386M47615 = c16223.m47612();
                        boolean z6 = obj7 != null && (c16386M47615 == c163810 || c16386M47615 == c163811);
                        if (objM38331 != null || z6) {
                            ViewGroup viewGroupM30232 = m30231();
                            int i5 = C5031.f17539;
                            if (viewGroupM30232.isLaidOut()) {
                                c16223.m47612().getClass();
                                abstractC14975.mo33(objMo26, c16223.m47611(), (Runnable) new RunnableC10576(c16223, c16386M47615));
                            } else {
                                if (AbstractC8894.m23060(2)) {
                                    C13638.toString(m30231());
                                    C13638.toString(c16386M47615);
                                }
                                c16223.m47610();
                            }
                        }
                    }
                }
                ViewGroup viewGroupM30233 = m30231();
                int i6 = C5031.f17539;
                if (viewGroupM30233.isLaidOut()) {
                    C2273.m6972(arrayList22, 4);
                    ArrayList arrayList26 = new ArrayList();
                    int size3 = arrayList20.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        View view9 = (View) arrayList20.get(i7);
                        arrayList26.add(C5031.m14001(view9));
                        C5031.m13987(view9, (String) null);
                    }
                    if (AbstractC8894.m23060(2)) {
                        for (View view10 : arrayList25) {
                            C13638.toString(view10);
                            C5031.m14001(view10);
                        }
                        for (View view11 : arrayList20) {
                            C13638.toString(view11);
                            C5031.m14001(view11);
                        }
                    }
                    abstractC14975.mo27(m30231(), objMo26);
                    ViewGroup viewGroupM30234 = m30231();
                    int size4 = arrayList20.size();
                    ArrayList arrayList27 = new ArrayList();
                    int i8 = 0;
                    while (i8 < size4) {
                        ArrayList arrayList28 = arrayList25;
                        View view12 = (View) arrayList28.get(i8);
                        String strM14001 = C5031.m14001(view12);
                        arrayList27.add(strM14001);
                        if (strM14001 == null) {
                            c16389 = c163810;
                            c16388 = c163811;
                        } else {
                            c16388 = c163811;
                            C5031.m13987(view12, (String) null);
                            String str3 = (String) c12274.getOrDefault(strM14001, null);
                            int i9 = 0;
                            while (true) {
                                c16389 = c163810;
                                if (i9 >= size4) {
                                    break;
                                }
                                if (str3.equals(arrayList26.get(i9))) {
                                    C5031.m13987((View) arrayList20.get(i9), strM14001);
                                    break;
                                } else {
                                    i9++;
                                    c163810 = c16389;
                                }
                            }
                        }
                        i8++;
                        arrayList25 = arrayList28;
                        c163811 = c16388;
                        c163810 = c16389;
                    }
                    c16386 = c163810;
                    c16387 = c163811;
                    ArrayList arrayList29 = arrayList25;
                    ViewTreeObserverOnPreDrawListenerC22337.m49503(viewGroupM30234, new RunnableC22736(size4, arrayList20, arrayList26, arrayList29, arrayList27));
                    C2273.m6972(arrayList22, 0);
                    abstractC14975.mo32(obj7, arrayList29, arrayList20);
                }
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            viewGroupM30231 = m30231();
            context = viewGroupM30231.getContext();
            arrayList11 = new ArrayList();
            it = arrayList2.iterator();
            z2 = false;
            while (it.hasNext()) {
                c7753 = (C7753) it.next();
                if (c7753.m47609()) {
                    c7753.m47610();
                } else {
                    c8543M20399 = c7753.m20399(context);
                    if (c8543M20399 == null) {
                        c7753.m47610();
                    } else {
                        animator = c8543M20399.f29569;
                        if (animator == null) {
                            arrayList11.add(c7753);
                        } else {
                            c16386M47613 = c7753.m47612();
                            componentCallbacksC22654M38572 = c16386M47613.m38571();
                            if (Boolean.TRUE.equals(map.get(c16386M47613))) {
                                if (AbstractC8894.m23060(2)) {
                                    C13638.toString(componentCallbacksC22654M38572);
                                }
                                c7753.m47610();
                            } else {
                                if (c16386M47613.m38577() == EnumC0157.GONE) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    arrayList3.remove(c16386M47613);
                                }
                                View view13 = componentCallbacksC22654M38572.mView;
                                viewGroupM30231.startViewTransition(view13);
                                Iterator it6 = it;
                                animator.addListener(new C23276(viewGroupM30231, view13, z3, c16386M47613, c7753));
                                animator.setTarget(view13);
                                animator.start();
                                if (AbstractC8894.m23060(2)) {
                                    c16386M47613.toString();
                                }
                                c7753.m47611().m3652(new C15515(animator, c16386M47613));
                                z2 = true;
                                it = it6;
                            }
                        }
                    }
                }
            }
            for (C7753 c7754 : arrayList11) {
                c16386M47612 = c7754.m47612();
                componentCallbacksC22654M38571 = c16386M47612.m38571();
                if (zContainsValue) {
                    if (AbstractC8894.m23060(2)) {
                        C13638.toString(componentCallbacksC22654M38571);
                    }
                    c7754.m47610();
                } else if (z2) {
                    if (AbstractC8894.m23060(2)) {
                        C13638.toString(componentCallbacksC22654M38571);
                    }
                    c7754.m47610();
                } else {
                    view4 = componentCallbacksC22654M38571.mView;
                    C8543 c8543M203910 = c7754.m20399(context);
                    c8543M203910.getClass();
                    animation = c8543M203910.f29568;
                    animation.getClass();
                    if (c16386M47612.m38577() != EnumC0157.REMOVED) {
                        view4.startAnimation(animation);
                        c7754.m47610();
                    } else {
                        viewGroupM30231.startViewTransition(view4);
                        RunnableC9954 runnableC9954 = new RunnableC9954(animation, viewGroupM30231, view4);
                        runnableC9954.setAnimationListener(new AnimationAnimationListenerC18336(view4, viewGroupM30231, c7754, c16386M47612));
                        view4.startAnimation(runnableC9954);
                        if (AbstractC8894.m23060(2)) {
                            c16386M47612.toString();
                        }
                    }
                    c7754.m47611().m3652(new C19042(view4, viewGroupM30231, c7754, c16386M47612));
                }
            }
            for (C16386 c163815 : arrayList3) {
                c163815.m38577().m1255(c163815.m38571().mView);
            }
            arrayList3.clear();
            if (AbstractC8894.m23060(2)) {
                C13638.toString(c16386);
                C13638.toString(c16387);
            }
        }
        for (C16220 c16224 : arrayList13) {
            map4.put(c16224.m47612(), Boolean.FALSE);
            c16224.m47610();
        }
        map = map4;
        arrayList2 = arrayList12;
        arrayList3 = arrayList14;
        c16386 = c163810;
        c16387 = c163811;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroupM30231 = m30231();
        context = viewGroupM30231.getContext();
        arrayList11 = new ArrayList();
        it = arrayList2.iterator();
        z2 = false;
        while (it.hasNext()) {
            c7753 = (C7753) it.next();
            if (c7753.m47609()) {
                c7753.m47610();
            } else {
                c8543M20399 = c7753.m20399(context);
                if (c8543M20399 == null) {
                    c7753.m47610();
                } else {
                    animator = c8543M20399.f29569;
                    if (animator == null) {
                        arrayList11.add(c7753);
                    } else {
                        c16386M47613 = c7753.m47612();
                        componentCallbacksC22654M38572 = c16386M47613.m38571();
                        if (Boolean.TRUE.equals(map.get(c16386M47613))) {
                            if (AbstractC8894.m23060(2)) {
                                C13638.toString(componentCallbacksC22654M38572);
                            }
                            c7753.m47610();
                        } else {
                            if (c16386M47613.m38577() == EnumC0157.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList3.remove(c16386M47613);
                            }
                            View view14 = componentCallbacksC22654M38572.mView;
                            viewGroupM30231.startViewTransition(view14);
                            Iterator it7 = it;
                            animator.addListener(new C23276(viewGroupM30231, view14, z3, c16386M47613, c7753));
                            animator.setTarget(view14);
                            animator.start();
                            if (AbstractC8894.m23060(2)) {
                                c16386M47613.toString();
                            }
                            c7753.m47611().m3652(new C15515(animator, c16386M47613));
                            z2 = true;
                            it = it7;
                        }
                    }
                }
            }
        }
        while (r3.hasNext()) {
            c16386M47612 = c7754.m47612();
            componentCallbacksC22654M38571 = c16386M47612.m38571();
            if (zContainsValue) {
                if (AbstractC8894.m23060(2)) {
                    C13638.toString(componentCallbacksC22654M38571);
                }
                c7754.m47610();
            } else if (z2) {
                if (AbstractC8894.m23060(2)) {
                    C13638.toString(componentCallbacksC22654M38571);
                }
                c7754.m47610();
            } else {
                view4 = componentCallbacksC22654M38571.mView;
                C8543 c8543M203911 = c7754.m20399(context);
                c8543M203911.getClass();
                animation = c8543M203911.f29568;
                animation.getClass();
                if (c16386M47612.m38577() != EnumC0157.REMOVED) {
                    view4.startAnimation(animation);
                    c7754.m47610();
                } else {
                    viewGroupM30231.startViewTransition(view4);
                    RunnableC9954 runnableC9955 = new RunnableC9954(animation, viewGroupM30231, view4);
                    runnableC9955.setAnimationListener(new AnimationAnimationListenerC18336(view4, viewGroupM30231, c7754, c16386M47612));
                    view4.startAnimation(runnableC9955);
                    if (AbstractC8894.m23060(2)) {
                        c16386M47612.toString();
                    }
                }
                c7754.m47611().m3652(new C19042(view4, viewGroupM30231, c7754, c16386M47612));
            }
        }
        while (r0.hasNext()) {
            c163815.m38577().m1255(c163815.m38571().mView);
        }
        arrayList3.clear();
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c16386);
            C13638.toString(c16387);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46255(C21445 c21445, Collection collection) {
        Iterator it = c21445.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C5031.m14001((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46253(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C22671.m50205(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m46253(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46254(C21445 c21445, View view) {
        String strM14001 = C5031.m14001(view);
        if (strM14001 != null) {
            c21445.put(strM14001, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m46254(c21445, childAt);
                }
            }
        }
    }
}
