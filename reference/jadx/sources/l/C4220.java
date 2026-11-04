package l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4220 extends AbstractC17997 {
    /* JADX WARN: Code duplicated, block: B:212:0x065f  */
    /* JADX WARN: Code duplicated, block: B:225:0x069d  */
    /* JADX WARN: Code duplicated, block: B:229:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:230:0x06af  */
    /* JADX WARN: Code duplicated, block: B:232:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:235:0x06db  */
    /* JADX WARN: Code duplicated, block: B:240:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x0712  */
    /* JADX WARN: Code duplicated, block: B:250:0x0722  */
    /* JADX WARN: Code duplicated, block: B:254:0x073f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0746  */
    /* JADX WARN: Code duplicated, block: B:257:0x0760  */
    /* JADX WARN: Code duplicated, block: B:262:0x077a A[LOOP:7: B:260:0x0774->B:262:0x077a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0798  */
    /* JADX WARN: Code duplicated, block: B:300:0x0670 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x067a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x067e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0696 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0719 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x070b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x071c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC17997
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13483(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        HashMap map;
        ArrayList<C20981> arrayList3;
        C20981 c20981;
        C20981 c20982;
        C20981 c20983;
        C20981 c20984;
        Object obj;
        View view;
        View view2;
        Object objMo25;
        C14307 c14307;
        Object objMo26;
        HashMap map2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj2;
        ArrayList arrayList6;
        View view3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        View view4;
        ArrayList arrayList10;
        HashMap map3;
        int i;
        View view5;
        boolean zContainsValue;
        ViewGroup viewGroupM41965;
        Context context;
        ArrayList<C12423> arrayList11;
        Iterator it;
        boolean z2;
        C20981 c20981M18240;
        ComponentCallbacksC11612 componentCallbacksC11612M47964;
        View view6;
        Animation animation;
        C12423 c12423;
        C20563 c20563M30889;
        Animator animator;
        C20981 c20981M18241;
        ComponentCallbacksC11612 componentCallbacksC11612M47965;
        boolean z3;
        Iterator it2 = arrayList.iterator();
        C20981 c20985 = null;
        C20981 c20986 = null;
        while (it2.hasNext()) {
            C20981 c20987 = (C20981) it2.next();
            EnumC14267 enumC14267M34600 = EnumC14267.m34600(c20987.m47964().mView);
            int i2 = C13169.f42094[c20987.m47959().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (enumC14267M34600 == EnumC14267.VISIBLE && c20985 == null) {
                    c20985 = c20987;
                }
            } else if (i2 == 4 && enumC14267M34600 != EnumC14267.VISIBLE) {
                c20986 = c20987;
            }
        }
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c20985);
            C17359.toString(c20986);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList<C24358> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(arrayList);
        ComponentCallbacksC11612 componentCallbacksC11612M47966 = ((C20981) j$$ExternalSyntheticOutline0.m(arrayList, 1)).m47964();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C20981 c20988 = (C20981) it3.next();
            c20988.m47964().mAnimationInfo.f63692 = componentCallbacksC11612M47966.mAnimationInfo.f63692;
            c20988.m47964().mAnimationInfo.f63696 = componentCallbacksC11612M47966.mAnimationInfo.f63696;
            c20988.m47964().mAnimationInfo.f63705 = componentCallbacksC11612M47966.mAnimationInfo.f63705;
            c20988.m47964().mAnimationInfo.f63698 = componentCallbacksC11612M47966.mAnimationInfo.f63698;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C20981 c20989 = (C20981) it4.next();
            C24947 c24947 = new C24947();
            c20989.m47963(c24947);
            arrayList12.add(new C12423(c20989, c24947, z));
            C24947 c24948 = new C24947();
            c20989.m47963(c24948);
            arrayList13.add(new C24358(c20989, c24948, z, !z ? c20989 != c20986 : c20989 != c20985));
            c20989.m47956(new RunnableC5712(this, arrayList14, c20989));
        }
        HashMap map4 = new HashMap();
        AbstractC11284 abstractC11284 = null;
        for (C24358 c24358 : arrayList13) {
            if (!c24358.m18241()) {
                AbstractC11284 abstractC11284M54432 = c24358.m54432();
                if (abstractC11284 == null) {
                    abstractC11284 = abstractC11284M54432;
                } else if (abstractC11284M54432 != null && abstractC11284 != abstractC11284M54432) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c24358.m18240().m47964() + " returned Transition " + c24358.m54430() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC11284 != null) {
            View view7 = new View(m41965().getContext());
            Rect rect = new Rect();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            C14307 c14308 = new C14307();
            View view8 = null;
            boolean z4 = false;
            Object obj3 = null;
            for (C24358 c24359 : arrayList13) {
                if (!c24359.m54429() || c20985 == null || c20986 == null) {
                    arrayList7 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    view4 = view8;
                    arrayList10 = arrayList16;
                    map3 = map4;
                } else {
                    Object objMo36 = abstractC11284.mo36(abstractC11284.mo37(c24359.m54431()));
                    ArrayList<String> sharedElementSourceNames = c20986.m47964().getSharedElementSourceNames();
                    view4 = view8;
                    ArrayList sharedElementSourceNames2 = c20985.m47964().getSharedElementSourceNames();
                    arrayList7 = arrayList12;
                    ArrayList sharedElementTargetNames = c20985.m47964().getSharedElementTargetNames();
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
                    ArrayList<String> sharedElementTargetNames2 = c20986.m47964().getSharedElementTargetNames();
                    if (z) {
                        c20985.m47964().getEnterTransitionCallback();
                        c20986.m47964().getExitTransitionCallback();
                    } else {
                        c20985.m47964().getExitTransitionCallback();
                        c20986.m47964().getEnterTransitionCallback();
                    }
                    int i4 = 0;
                    for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                        c14308.put((String) sharedElementSourceNames.get(i4), (String) sharedElementTargetNames2.get(i4));
                        i4++;
                    }
                    if (AbstractC3191.m10427(2)) {
                        for (String str : sharedElementTargetNames2) {
                        }
                        for (String str2 : sharedElementSourceNames) {
                        }
                    }
                    C14307 c14309 = new C14307();
                    m13481(c14309, c20985.m47964().mView);
                    c14309.m34745(sharedElementSourceNames);
                    c14308.m34745(c14309.keySet());
                    C14307 c143010 = new C14307();
                    m13481(c143010, c20986.m47964().mView);
                    c143010.m34745(sharedElementTargetNames2);
                    c143010.m34745(c14308.values());
                    AbstractC11284 abstractC11285 = C21727.f69327;
                    int size2 = c14308.size() - 1;
                    while (size2 >= 0) {
                        HashMap map5 = map4;
                        if (!c143010.containsKey((String) c14308.m24221(size2))) {
                            c14308.m24222(size2);
                        }
                        size2--;
                        map4 = map5;
                    }
                    HashMap map6 = map4;
                    m13482(c14309, c14308.keySet());
                    m13482(c143010, c14308.values());
                    if (c14308.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        obj3 = null;
                        c14308 = c14308;
                        arrayList10 = arrayList16;
                        arrayList15 = arrayList15;
                        rect = rect;
                        view7 = view7;
                        view8 = view4;
                        map3 = map6;
                    } else {
                        ComponentCallbacksC11612 componentCallbacksC11612M47967 = c20986.m47964();
                        ComponentCallbacksC11612 componentCallbacksC11612M47968 = c20985.m47964();
                        if (z) {
                            componentCallbacksC11612M47968.getEnterTransitionCallback();
                        } else {
                            componentCallbacksC11612M47967.getEnterTransitionCallback();
                        }
                        ViewTreeObserverOnPreDrawListenerC12794.m31683(m41965(), new RunnableC16152(c20986, c20985, z, c143010));
                        arrayList15.addAll(c14309.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            View view9 = (View) c14309.get((String) sharedElementSourceNames.get(0));
                            abstractC11284.mo38(view9, objMo36);
                            view4 = view9;
                        }
                        arrayList16.addAll(c143010.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) c143010.get((String) sharedElementTargetNames2.get(i))) != null) {
                            ViewTreeObserverOnPreDrawListenerC12794.m31683(m41965(), new RunnableC23612(abstractC11284, view5, rect));
                            z4 = true;
                        }
                        abstractC11284.mo39(objMo36, view7, arrayList15);
                        arrayList10 = arrayList16;
                        abstractC11284.mo31(objMo36, null, null, objMo36, arrayList10);
                        Boolean bool = Boolean.TRUE;
                        map3 = map6;
                        map3.put(c20985, bool);
                        map3.put(c20986, bool);
                        obj3 = objMo36;
                    }
                    arrayList15 = arrayList15;
                    rect = rect;
                    c14308 = c14308;
                    arrayList16 = arrayList10;
                    map4 = map3;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList7;
                    arrayList14 = arrayList9;
                    view7 = view7;
                }
                view8 = view4;
                arrayList15 = arrayList15;
                rect = rect;
                c14308 = c14308;
                arrayList16 = arrayList10;
                map4 = map3;
                arrayList13 = arrayList8;
                arrayList12 = arrayList7;
                arrayList14 = arrayList9;
                view7 = view7;
            }
            arrayList2 = arrayList12;
            ArrayList<C24358> arrayList18 = arrayList13;
            ArrayList arrayList19 = arrayList14;
            View view10 = view8;
            C14307 c143011 = c14308;
            ArrayList<View> arrayList20 = arrayList16;
            Rect rect2 = rect;
            View view11 = view7;
            HashMap map7 = map4;
            ArrayList arrayList21 = arrayList15;
            ArrayList arrayList22 = new ArrayList();
            Iterator it5 = arrayList18.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it5.hasNext()) {
                C24358 c243510 = (C24358) it5.next();
                if (c243510.m18241()) {
                    map7.put(c243510.m18240(), Boolean.FALSE);
                    c243510.m18238();
                } else {
                    Object objMo37 = abstractC11284.mo37(c243510.m54430());
                    C20981 c20981M18242 = c243510.m18240();
                    Object obj6 = obj3;
                    boolean z5 = obj6 != null && (c20981M18242 == c20985 || c20981M18242 == c20986);
                    if (objMo37 == null) {
                        if (!z5) {
                            map7.put(c20981M18242, Boolean.FALSE);
                            c243510.m18238();
                        }
                        arrayList4 = arrayList21;
                        c14307 = c143011;
                        view2 = view11;
                        obj = obj6;
                        map2 = map7;
                        view3 = view10;
                        arrayList6 = arrayList19;
                    } else {
                        HashMap map8 = map7;
                        ArrayList arrayList23 = new ArrayList();
                        m13480(c20981M18242.m47964().mView, arrayList23);
                        if (z5) {
                            if (c20981M18242 == c20985) {
                                arrayList23.removeAll(arrayList21);
                            } else {
                                arrayList23.removeAll(arrayList20);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC11284.mo27(view11, objMo37);
                            c14307 = c143011;
                            view2 = view11;
                            obj = obj6;
                            objMo25 = obj5;
                            objMo26 = obj4;
                            view = view10;
                            arrayList6 = arrayList19;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            obj2 = objMo37;
                            arrayList5 = arrayList23;
                        } else {
                            abstractC11284.mo32(objMo37, arrayList23);
                            obj = obj6;
                            view = view10;
                            view2 = view11;
                            objMo25 = obj5;
                            c14307 = c143011;
                            objMo26 = obj4;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            arrayList5 = arrayList23;
                            abstractC11284.mo31(objMo37, objMo37, arrayList23, null, null);
                            if (c20981M18242.m47959() == EnumC14267.GONE) {
                                c20981M18242 = c20981M18242;
                                arrayList6 = arrayList19;
                                arrayList6.remove(c20981M18242);
                                ArrayList arrayList24 = new ArrayList(arrayList5);
                                arrayList24.remove(c20981M18242.m47964().mView);
                                obj2 = objMo37;
                                abstractC11284.mo30(obj2, c20981M18242.m47964().mView, arrayList24);
                                ViewTreeObserverOnPreDrawListenerC12794.m31683(m41965(), new RunnableC3474(arrayList5));
                            } else {
                                c20981M18242 = c20981M18242;
                                obj2 = objMo37;
                                arrayList6 = arrayList19;
                            }
                        }
                        if (c20981M18242.m47959() == EnumC14267.VISIBLE) {
                            arrayList22.addAll(arrayList5);
                            if (z4) {
                                abstractC11284.mo29(obj2, rect2);
                            }
                            view3 = view;
                        } else {
                            view3 = view;
                            abstractC11284.mo38(view3, obj2);
                        }
                        map2.put(c20981M18242, Boolean.TRUE);
                        if (c243510.m54428()) {
                            objMo26 = abstractC11284.mo25(objMo26, obj2);
                        } else {
                            objMo25 = abstractC11284.mo25(objMo25, obj2);
                        }
                        obj4 = objMo26;
                        obj5 = objMo25;
                    }
                    view10 = view3;
                    map7 = map2;
                    arrayList19 = arrayList6;
                    view11 = view2;
                    arrayList21 = arrayList4;
                    obj3 = obj;
                    c143011 = c14307;
                    it5 = it5;
                }
            }
            ArrayList<View> arrayList25 = arrayList21;
            C9086 c9086 = c143011;
            map = map7;
            Object obj7 = obj3;
            arrayList3 = arrayList19;
            Object objMo27 = abstractC11284.mo26(obj4, obj5, obj7);
            if (objMo27 != null) {
                for (C24358 c243511 : arrayList18) {
                    if (!c243511.m18241()) {
                        Object objM54430 = c243511.m54430();
                        C20981 c20981M18243 = c243511.m18240();
                        boolean z6 = obj7 != null && (c20981M18243 == c20985 || c20981M18243 == c20986);
                        if (objM54430 != null || z6) {
                            ViewGroup viewGroupM41966 = m41965();
                            int i5 = C22666.f73603;
                            if (viewGroupM41966.isLaidOut()) {
                                c243511.m18240().getClass();
                                abstractC11284.mo34(objMo27, c243511.m18239(), (Runnable) new RunnableC20628(c243511, c20981M18243));
                            } else {
                                if (AbstractC3191.m10427(2)) {
                                    C17359.toString(m41965());
                                    C17359.toString(c20981M18243);
                                }
                                c243511.m18238();
                            }
                        }
                    }
                }
                ViewGroup viewGroupM41967 = m41965();
                int i6 = C22666.f73603;
                if (viewGroupM41967.isLaidOut()) {
                    C21727.m49295(arrayList22, 4);
                    ArrayList arrayList26 = new ArrayList();
                    int size3 = arrayList20.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        View view12 = (View) arrayList20.get(i7);
                        arrayList26.add(C22666.m51109(view12));
                        C22666.m51092(view12, (String) null);
                    }
                    if (AbstractC3191.m10427(2)) {
                        for (View view13 : arrayList25) {
                            C17359.toString(view13);
                            C22666.m51109(view13);
                        }
                        for (View view14 : arrayList20) {
                            C17359.toString(view14);
                            C22666.m51109(view14);
                        }
                    }
                    abstractC11284.mo28(m41965(), objMo27);
                    ViewGroup viewGroupM41968 = m41965();
                    int size4 = arrayList20.size();
                    ArrayList arrayList27 = new ArrayList();
                    int i8 = 0;
                    while (i8 < size4) {
                        ArrayList arrayList28 = arrayList25;
                        View view15 = (View) arrayList28.get(i8);
                        String strM51109 = C22666.m51109(view15);
                        arrayList27.add(strM51109);
                        if (strM51109 == null) {
                            c20984 = c20985;
                            c20983 = c20986;
                        } else {
                            c20983 = c20986;
                            C22666.m51092(view15, (String) null);
                            String str3 = (String) c9086.get(strM51109);
                            int i9 = 0;
                            while (true) {
                                c20984 = c20985;
                                if (i9 >= size4) {
                                    break;
                                }
                                if (str3.equals(arrayList26.get(i9))) {
                                    C22666.m51092((View) arrayList20.get(i9), strM51109);
                                    break;
                                } else {
                                    i9++;
                                    c20985 = c20984;
                                }
                            }
                        }
                        i8++;
                        arrayList25 = arrayList28;
                        c20986 = c20983;
                        c20985 = c20984;
                    }
                    c20981 = c20985;
                    c20982 = c20986;
                    ArrayList arrayList29 = arrayList25;
                    ViewTreeObserverOnPreDrawListenerC12794.m31683(viewGroupM41968, new RunnableC1590(size4, arrayList20, arrayList26, arrayList29, arrayList27));
                    C21727.m49295(arrayList22, 0);
                    abstractC11284.mo33(obj7, arrayList29, arrayList20);
                }
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            viewGroupM41965 = m41965();
            context = viewGroupM41965.getContext();
            arrayList11 = new ArrayList();
            it = arrayList2.iterator();
            z2 = false;
            while (it.hasNext()) {
                c12423 = (C12423) it.next();
                if (c12423.m18241()) {
                    c12423.m18238();
                } else {
                    c20563M30889 = c12423.m30889(context);
                    if (c20563M30889 == null) {
                        c12423.m18238();
                    } else {
                        animator = c20563M30889.f65847;
                        if (animator == null) {
                            arrayList11.add(c12423);
                        } else {
                            c20981M18241 = c12423.m18240();
                            componentCallbacksC11612M47965 = c20981M18241.m47964();
                            if (Boolean.TRUE.equals(map.get(c20981M18241))) {
                                if (AbstractC3191.m10427(2)) {
                                    C17359.toString(componentCallbacksC11612M47965);
                                }
                                c12423.m18238();
                            } else {
                                if (c20981M18241.m47959() == EnumC14267.GONE) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    arrayList3.remove(c20981M18241);
                                }
                                View view16 = componentCallbacksC11612M47965.mView;
                                viewGroupM41965.startViewTransition(view16);
                                HashMap map9 = map;
                                Iterator it6 = it;
                                animator.addListener(new C1983(viewGroupM41965, view16, z3, c20981M18241, c12423));
                                animator.setTarget(view16);
                                animator.start();
                                if (AbstractC3191.m10427(2)) {
                                    c20981M18241.toString();
                                }
                                c12423.m18239().m55704(new C11677(animator, c20981M18241));
                                z2 = true;
                                it = it6;
                                map = map9;
                            }
                        }
                    }
                }
            }
            for (C12423 c12424 : arrayList11) {
                c20981M18240 = c12424.m18240();
                componentCallbacksC11612M47964 = c20981M18240.m47964();
                if (zContainsValue) {
                    if (AbstractC3191.m10427(2)) {
                        C17359.toString(componentCallbacksC11612M47964);
                    }
                    c12424.m18238();
                } else if (z2) {
                    if (AbstractC3191.m10427(2)) {
                        C17359.toString(componentCallbacksC11612M47964);
                    }
                    c12424.m18238();
                } else {
                    view6 = componentCallbacksC11612M47964.mView;
                    C20563 c20563M308810 = c12424.m30889(context);
                    c20563M308810.getClass();
                    animation = c20563M308810.f65846;
                    animation.getClass();
                    if (c20981M18240.m47959() != EnumC14267.REMOVED) {
                        view6.startAnimation(animation);
                        c12424.m18238();
                    } else {
                        viewGroupM41965.startViewTransition(view6);
                        RunnableC12358 runnableC12358 = new RunnableC12358(animation, viewGroupM41965, view6);
                        runnableC12358.setAnimationListener(new AnimationAnimationListenerC16898(view6, viewGroupM41965, c12424, c20981M18240));
                        view6.startAnimation(runnableC12358);
                        if (AbstractC3191.m10427(2)) {
                            c20981M18240.toString();
                        }
                    }
                    c12424.m18239().m55704(new C17644(view6, viewGroupM41965, c12424, c20981M18240));
                }
            }
            for (C20981 c209810 : arrayList3) {
                c209810.m47959().m34601(c209810.m47964().mView);
            }
            arrayList3.clear();
            if (AbstractC3191.m10427(2)) {
                C17359.toString(c20981);
                C17359.toString(c20982);
            }
        }
        for (C24358 c243512 : arrayList13) {
            map4.put(c243512.m18240(), Boolean.FALSE);
            c243512.m18238();
        }
        map = map4;
        arrayList2 = arrayList12;
        arrayList3 = arrayList14;
        c20981 = c20985;
        c20982 = c20986;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroupM41965 = m41965();
        context = viewGroupM41965.getContext();
        arrayList11 = new ArrayList();
        it = arrayList2.iterator();
        z2 = false;
        while (it.hasNext()) {
            c12423 = (C12423) it.next();
            if (c12423.m18241()) {
                c12423.m18238();
            } else {
                c20563M30889 = c12423.m30889(context);
                if (c20563M30889 == null) {
                    c12423.m18238();
                } else {
                    animator = c20563M30889.f65847;
                    if (animator == null) {
                        arrayList11.add(c12423);
                    } else {
                        c20981M18241 = c12423.m18240();
                        componentCallbacksC11612M47965 = c20981M18241.m47964();
                        if (Boolean.TRUE.equals(map.get(c20981M18241))) {
                            if (AbstractC3191.m10427(2)) {
                                C17359.toString(componentCallbacksC11612M47965);
                            }
                            c12423.m18238();
                        } else {
                            if (c20981M18241.m47959() == EnumC14267.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList3.remove(c20981M18241);
                            }
                            View view17 = componentCallbacksC11612M47965.mView;
                            viewGroupM41965.startViewTransition(view17);
                            HashMap map10 = map;
                            Iterator it7 = it;
                            animator.addListener(new C1983(viewGroupM41965, view17, z3, c20981M18241, c12423));
                            animator.setTarget(view17);
                            animator.start();
                            if (AbstractC3191.m10427(2)) {
                                c20981M18241.toString();
                            }
                            c12423.m18239().m55704(new C11677(animator, c20981M18241));
                            z2 = true;
                            it = it7;
                            map = map10;
                        }
                    }
                }
            }
        }
        while (r2.hasNext()) {
            c20981M18240 = c12424.m18240();
            componentCallbacksC11612M47964 = c20981M18240.m47964();
            if (zContainsValue) {
                if (AbstractC3191.m10427(2)) {
                    C17359.toString(componentCallbacksC11612M47964);
                }
                c12424.m18238();
            } else if (z2) {
                if (AbstractC3191.m10427(2)) {
                    C17359.toString(componentCallbacksC11612M47964);
                }
                c12424.m18238();
            } else {
                view6 = componentCallbacksC11612M47964.mView;
                C20563 c20563M308811 = c12424.m30889(context);
                c20563M308811.getClass();
                animation = c20563M308811.f65846;
                animation.getClass();
                if (c20981M18240.m47959() != EnumC14267.REMOVED) {
                    view6.startAnimation(animation);
                    c12424.m18238();
                } else {
                    viewGroupM41965.startViewTransition(view6);
                    RunnableC12358 runnableC12359 = new RunnableC12358(animation, viewGroupM41965, view6);
                    runnableC12359.setAnimationListener(new AnimationAnimationListenerC16898(view6, viewGroupM41965, c12424, c20981M18240));
                    view6.startAnimation(runnableC12359);
                    if (AbstractC3191.m10427(2)) {
                        c20981M18240.toString();
                    }
                }
                c12424.m18239().m55704(new C17644(view6, viewGroupM41965, c12424, c20981M18240));
            }
        }
        while (r0.hasNext()) {
            c209810.m47959().m34601(c209810.m47964().mView);
        }
        arrayList3.clear();
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c20981);
            C17359.toString(c20982);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13482(C14307 c14307, Collection collection) {
        Iterator it = c14307.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C22666.m51109((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13480(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C11477.m28850(viewGroup)) {
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
                    m13480(childAt, arrayList);
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
    public static void m13481(C14307 c14307, View view) {
        String strM51109 = C22666.m51109(view);
        if (strM51109 != null) {
            c14307.put(strM51109, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m13481(c14307, childAt);
                }
            }
        }
    }
}
