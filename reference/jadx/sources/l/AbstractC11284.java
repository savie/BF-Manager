package l;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V68I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11284 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo25(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo26(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27(View view, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo28(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo29(Object obj, Rect rect);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo30(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo31(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo32(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo33(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo35(Object obj);

    /* JADX INFO: renamed from: ۤ */
    public abstract Object mo36(Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo37(Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo38(View view, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo39(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28529(Rect rect, View view) {
        int i = C22666.f73603;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo34(Object obj, C24947 c24947, Runnable runnable) {
        ((RunnableC20628) runnable).run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28530(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        if (C22666.m51109(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            if (C22666.m51109(childAt) == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i4) == childAt) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28531(List list) {
        return list == null || list.isEmpty();
    }
}
