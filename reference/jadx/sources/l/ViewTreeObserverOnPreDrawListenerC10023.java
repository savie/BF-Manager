package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC10023 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ViewGroup f32147;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0329 f32148;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f32147;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C1075.f3857.remove(viewGroup);
        ArrayList arrayList = (ArrayList) C1075.m4035().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0329) it.next()).resume(viewGroup);
            }
        }
        this.f32148.clearValues(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC0329 abstractC0329 = this.f32148;
        ViewGroup viewGroup = this.f32147;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!C1075.f3857.remove(viewGroup)) {
            return true;
        }
        C14307 c14307M4035 = C1075.m4035();
        ArrayList arrayList = (ArrayList) c14307M4035.get(viewGroup);
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c14307M4035.put(viewGroup, arrayList);
        } else if (arrayList.size() > 0) {
            arrayList2 = new ArrayList(arrayList);
        }
        arrayList.add(abstractC0329);
        abstractC0329.addListener(new C18974(this, c14307M4035));
        abstractC0329.captureValues(viewGroup, false);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0329) it.next()).resume(viewGroup);
            }
        }
        abstractC0329.playTransition(viewGroup);
        return true;
    }
}
