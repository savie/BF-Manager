package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13270 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f42390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f42391;

    public RunnableC13270(C20729 c20729, ArrayList arrayList) {
        this.f42390 = c20729;
        this.f42391 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f42391;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C20729 c20729 = this.f42390;
            if (zHasNext) {
                C3575 c3575 = (C3575) it.next();
                AbstractC11800 abstractC11800 = c3575.f12239;
                int i = c3575.f12238;
                int i2 = c3575.f12241;
                int i3 = c3575.f12242;
                int i4 = c3575.f12240;
                c20729.getClass();
                View view = abstractC11800.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c20729.f66427.add(abstractC11800);
                viewPropertyAnimatorAnimate.setDuration(c20729.m10764()).setListener(new C16999(c20729, abstractC11800, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            } else {
                arrayList.clear();
                c20729.f66428.remove(arrayList);
                return;
            }
        }
    }
}
