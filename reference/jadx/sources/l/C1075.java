package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1075 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6056 f3855 = new C6056();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f3856 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList f3857 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14307 m4035() {
        C14307 c14307;
        ThreadLocal threadLocal = f3856;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c14307 = (C14307) weakReference.get()) != null) {
            return c14307;
        }
        C14307 c14308 = new C14307();
        threadLocal.set(new WeakReference(c14308));
        return c14308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4036(ViewGroup viewGroup, AbstractC0329 abstractC0329) {
        ArrayList arrayList = f3857;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0329 == null) {
            abstractC0329 = f3855;
        }
        AbstractC0329 abstractC0329Clone = abstractC0329.clone();
        ArrayList arrayList2 = (ArrayList) m4035().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0329) it.next()).pause(viewGroup);
            }
        }
        if (abstractC0329Clone != null) {
            abstractC0329Clone.captureValues(viewGroup, true);
        }
        if (((C5550) viewGroup.getTag(R.id.MT_Protector)) == null) {
            viewGroup.setTag(R.id.MT_Protector, null);
            if (abstractC0329Clone != null) {
                ViewTreeObserverOnPreDrawListenerC10023 viewTreeObserverOnPreDrawListenerC10023 = new ViewTreeObserverOnPreDrawListenerC10023();
                viewTreeObserverOnPreDrawListenerC10023.f32148 = abstractC0329Clone;
                viewTreeObserverOnPreDrawListenerC10023.f32147 = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC10023);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10023);
                return;
            }
            return;
        }
        throw null;
    }
}
