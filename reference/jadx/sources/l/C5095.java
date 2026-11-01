package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17758 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17759 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14188(View... viewArr) {
        ArrayList arrayList;
        View viewM6971;
        C5095 c5095 = new C5095();
        if (viewArr.length == 0) {
            return;
        }
        int length = viewArr.length;
        int i = 0;
        while (true) {
            arrayList = c5095.f17759;
            if (i >= length) {
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                arrayList.add(new C2272(view, new RunnableC21384(2, c5095)));
            }
            i++;
        }
        if (arrayList.isEmpty() || (viewM6971 = ((C2272) arrayList.get(0)).m6971()) == null) {
            return;
        }
        viewM6971.post(new RunnableC21384(2, c5095));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14187(C5095 c5095) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = c5095.f17759;
        if (c5095.f17758) {
            return;
        }
        c5095.f17758 = true;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2272 c2272 = (C2272) it.next();
                if (!c2272.m6970()) {
                    c2272.m6969();
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int iM14186 = c5095.m14186();
            if (iM14186 > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View viewM6971 = ((C2272) it2.next()).m6971();
                    if (viewM6971 != null && (layoutParams = viewM6971.getLayoutParams()) != null && layoutParams.width != iM14186) {
                        layoutParams.width = iM14186;
                        viewM6971.setLayoutParams(layoutParams);
                    }
                }
            }
        } finally {
            c5095.f17758 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m14186() {
        ArrayList arrayList = this.f17759;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View viewM6971 = ((C2272) it.next()).m6971();
                if (viewM6971 != null) {
                    arrayList2.add(new C13563(viewM6971));
                    ViewGroup.LayoutParams layoutParams = viewM6971.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int iMax = 0;
            while (it2.hasNext()) {
                View viewM6972 = ((C2272) it2.next()).m6971();
                if (viewM6972 != null) {
                    viewM6972.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    iMax = Math.max(iMax, viewM6972.getMeasuredWidth());
                }
            }
            return iMax;
        } finally {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C13563) it3.next()).m33157();
            }
        }
    }
}
