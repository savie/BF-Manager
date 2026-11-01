package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16292 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f52487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f52488;

    public RunnableC16292(C2885 c2885, ArrayList arrayList) {
        this.f52487 = c2885;
        this.f52488 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f52488;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C2885 c2885 = this.f52487;
            if (!zHasNext) {
                arrayList.clear();
                c2885.f10883.remove(arrayList);
                return;
            }
            C1474 c1474 = (C1474) it.next();
            ArrayList arrayList2 = c2885.f10874;
            AbstractC12554 abstractC12554 = c1474.f5998;
            View view = abstractC12554 == null ? null : abstractC12554.itemView;
            AbstractC12554 abstractC12555 = c1474.f6001;
            View view2 = abstractC12555 != null ? abstractC12555.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c2885.m5951());
                arrayList2.add(c1474.f5998);
                duration.translationX(c1474.f6000 - c1474.f5999);
                duration.translationY(c1474.f6003 - c1474.f6002);
                duration.alpha(0.0f).setListener(new C23348(c2885, c1474, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(c1474.f6001);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c2885.m5951()).alpha(1.0f).setListener(new C14176(c2885, c1474, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
