package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5813 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f19987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f19988;

    public RunnableC5813(C20729 c20729, ArrayList arrayList) {
        this.f19987 = c20729;
        this.f19988 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f19988;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C20729 c20729 = this.f19987;
            if (!zHasNext) {
                arrayList.clear();
                c20729.f66431.remove(arrayList);
                return;
            }
            C23713 c23713 = (C23713) it.next();
            ArrayList arrayList2 = c20729.f66424;
            AbstractC11800 abstractC11800 = c23713.f76846;
            View view = abstractC11800 == null ? null : abstractC11800.itemView;
            AbstractC11800 abstractC11801 = c23713.f76842;
            View view2 = abstractC11801 != null ? abstractC11801.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c20729.m10768());
                arrayList2.add(c23713.f76846);
                duration.translationX(c23713.f76844 - c23713.f76841);
                duration.translationY(c23713.f76843 - c23713.f76845);
                duration.alpha(0.0f).setListener(new C17745(c20729, c23713, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(c23713.f76842);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c20729.m10768()).alpha(1.0f).setListener(new C16253(c20729, c23713, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
