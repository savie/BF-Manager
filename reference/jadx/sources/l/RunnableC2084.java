package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2084 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f6917;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f6918;

    public RunnableC2084(C20729 c20729, ArrayList arrayList) {
        this.f6917 = c20729;
        this.f6918 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f6918;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C20729 c20729 = this.f6917;
            if (zHasNext) {
                AbstractC11800 abstractC11800 = (AbstractC11800) it.next();
                c20729.getClass();
                View view = abstractC11800.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c20729.f66423.add(abstractC11800);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c20729.m10760()).setListener(new C25205(view, viewPropertyAnimatorAnimate, c20729, abstractC11800)).start();
            } else {
                arrayList.clear();
                c20729.f66421.remove(arrayList);
                return;
            }
        }
    }
}
