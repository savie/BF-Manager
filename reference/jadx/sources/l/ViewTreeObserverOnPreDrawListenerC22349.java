package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC22349 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ViewGroup f73018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC11766 f73019;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f73018;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C1181.f5252.remove(viewGroup);
        ArrayList arrayList = (ArrayList) C1181.m4319().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC11766) it.next()).resume(viewGroup);
            }
        }
        this.f73019.clearValues(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC11766 abstractC11766 = this.f73019;
        ViewGroup viewGroup = this.f73018;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!C1181.f5252.remove(viewGroup)) {
            return true;
        }
        C21445 c21445M4319 = C1181.m4319();
        ArrayList arrayList = null;
        ArrayList arrayList2 = (ArrayList) c21445M4319.getOrDefault(viewGroup, null);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c21445M4319.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
        }
        arrayList2.add(abstractC11766);
        abstractC11766.addListener(new C5415(this, c21445M4319));
        abstractC11766.captureValues(viewGroup, false);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC11766) it.next()).resume(viewGroup);
            }
        }
        abstractC11766.playTransition(viewGroup);
        return true;
    }
}
