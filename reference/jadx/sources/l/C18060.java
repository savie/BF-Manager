package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59129 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f59130 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42083(View... viewArr) {
        ArrayList arrayList;
        View viewM48095;
        C18060 c18060 = new C18060();
        if (viewArr.length == 0) {
            return;
        }
        int length = viewArr.length;
        int i = 0;
        while (true) {
            arrayList = c18060.f59130;
            if (i >= length) {
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                arrayList.add(new C21044(view, new RunnableC8501(4, c18060)));
            }
            i++;
        }
        if (arrayList.isEmpty() || (viewM48095 = ((C21044) arrayList.get(0)).m48095()) == null) {
            return;
        }
        viewM48095.post(new RunnableC8501(4, c18060));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42082(C18060 c18060) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = c18060.f59130;
        if (c18060.f59129) {
            return;
        }
        c18060.f59129 = true;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C21044 c21044 = (C21044) it.next();
                if (!c21044.m48094()) {
                    c21044.m48093();
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int iM42081 = c18060.m42081();
            if (iM42081 > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View viewM48095 = ((C21044) it2.next()).m48095();
                    if (viewM48095 != null && (layoutParams = viewM48095.getLayoutParams()) != null && layoutParams.width != iM42081) {
                        layoutParams.width = iM42081;
                        viewM48095.setLayoutParams(layoutParams);
                    }
                }
            }
        } finally {
            c18060.f59129 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m42081() {
        ArrayList arrayList = this.f59130;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View viewM48095 = ((C21044) it.next()).m48095();
                if (viewM48095 != null) {
                    arrayList2.add(new C3890(viewM48095));
                    ViewGroup.LayoutParams layoutParams = viewM48095.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int iMax = 0;
            while (it2.hasNext()) {
                View viewM48096 = ((C21044) it2.next()).m48095();
                if (viewM48096 != null) {
                    viewM48096.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    iMax = Math.max(iMax, viewM48096.getMeasuredWidth());
                }
            }
            return iMax;
        } finally {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C3890) it3.next()).m12527();
            }
        }
    }
}
