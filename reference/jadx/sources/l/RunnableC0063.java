package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0063 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f962;

    public RunnableC0063(C2885 c2885, ArrayList arrayList) {
        this.f961 = c2885;
        this.f962 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f962;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C2885 c2885 = this.f961;
            if (zHasNext) {
                C9237 c9237 = (C9237) it.next();
                AbstractC12554 abstractC12554 = c9237.f31395;
                int i = c9237.f31393;
                int i2 = c9237.f31396;
                int i3 = c9237.f31392;
                int i4 = c9237.f31394;
                c2885.getClass();
                View view = abstractC12554.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c2885.f10878.add(abstractC12554);
                viewPropertyAnimatorAnimate.setDuration(c2885.m5959()).setListener(new C10648(c2885, abstractC12554, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            } else {
                arrayList.clear();
                c2885.f10882.remove(arrayList);
                return;
            }
        }
    }
}
