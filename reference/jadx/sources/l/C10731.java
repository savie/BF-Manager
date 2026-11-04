package l;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10731 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f34079 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34080 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f34082 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SparseArray f34081 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f34083 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27330(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f34082;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f34079;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f34082 == null) {
                        this.f34082 = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f34079;
                        View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view2 == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f34082.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f34082.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewM27328 = m27328(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM27328 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f34081 == null) {
                    this.f34081 = new SparseArray();
                }
                this.f34081.put(keyCode, new WeakReference(viewM27328));
            }
        }
        return viewM27328 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private View m27328(View view, KeyEvent keyEvent) {
        View viewM27328;
        WeakHashMap weakHashMap = this.f34082;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    viewM27328 = m27328(viewGroup.getChildAt(childCount), keyEvent);
                }
            } while (viewM27328 == null);
            return viewM27328;
        }
        if (m27327(view, keyEvent)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27329(KeyEvent keyEvent) {
        WeakReference weakReference;
        int iIndexOfKey;
        WeakReference weakReference2 = this.f34083;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        this.f34083 = new WeakReference(keyEvent);
        if (this.f34081 == null) {
            this.f34081 = new SparseArray();
        }
        SparseArray sparseArray = this.f34081;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view = (View) weakReference.get();
        if (view != null && view.isAttachedToWindow()) {
            m27327(view, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m27327(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((InterfaceC21920) arrayList.get(size)).m49612()) {
                return true;
            }
        }
        return false;
    }
}
