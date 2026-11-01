package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1181 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14486 f5250 = new C14486();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f5251 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList f5252 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21445 m4319() {
        C21445 c21445;
        ThreadLocal threadLocal = f5251;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c21445 = (C21445) weakReference.get()) != null) {
            return c21445;
        }
        C21445 c21446 = new C21445();
        threadLocal.set(new WeakReference(c21446));
        return c21446;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4320(ViewGroup viewGroup, AbstractC11766 abstractC11766) {
        ArrayList arrayList = f5252;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC11766 == null) {
            abstractC11766 = f5250;
        }
        AbstractC11766 abstractC11766Clone = abstractC11766.clone();
        ArrayList arrayList2 = (ArrayList) m4319().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC11766) it.next()).pause(viewGroup);
            }
        }
        if (abstractC11766Clone != null) {
            abstractC11766Clone.captureValues(viewGroup, true);
        }
        if (((C7803) viewGroup.getTag(R.id.MT_Protector)) == null) {
            viewGroup.setTag(R.id.MT_Protector, null);
            if (abstractC11766Clone != null) {
                ViewTreeObserverOnPreDrawListenerC22349 viewTreeObserverOnPreDrawListenerC22349 = new ViewTreeObserverOnPreDrawListenerC22349();
                viewTreeObserverOnPreDrawListenerC22349.f73019 = abstractC11766Clone;
                viewTreeObserverOnPreDrawListenerC22349.f73018 = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC22349);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC22349);
                return;
            }
            return;
        }
        throw null;
    }
}
