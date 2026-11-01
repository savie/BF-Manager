package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12059 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f40341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f40342;

    public RunnableC12059(C2885 c2885, ArrayList arrayList) {
        this.f40341 = c2885;
        this.f40342 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f40342;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C2885 c2885 = this.f40341;
            if (zHasNext) {
                AbstractC12554 abstractC12554 = (AbstractC12554) it.next();
                c2885.getClass();
                View view = abstractC12554.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c2885.f10877.add(abstractC12554);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c2885.m5960()).setListener(new C5708(view, viewPropertyAnimatorAnimate, c2885, abstractC12554)).start();
            } else {
                arrayList.clear();
                c2885.f10873.remove(arrayList);
                return;
            }
        }
    }
}
