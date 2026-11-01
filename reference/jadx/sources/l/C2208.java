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

/* JADX INFO: renamed from: l.ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2208 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7955 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f7956 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f7958 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SparseArray f7957 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f7959 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6821(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f7958;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f7956;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f7958 == null) {
                        this.f7958 = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f7956;
                        View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view2 == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f7958.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f7958.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewM6819 = m6819(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM6819 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f7957 == null) {
                    this.f7957 = new SparseArray();
                }
                this.f7957.put(keyCode, new WeakReference(viewM6819));
            }
        }
        return viewM6819 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private View m6819(View view, KeyEvent keyEvent) {
        View viewM6819;
        WeakHashMap weakHashMap = this.f7958;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    viewM6819 = m6819(viewGroup.getChildAt(childCount), keyEvent);
                }
            } while (viewM6819 == null);
            return viewM6819;
        }
        if (m6818(view, keyEvent)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6820(KeyEvent keyEvent) {
        WeakReference weakReference;
        int iIndexOfKey;
        WeakReference weakReference2 = this.f7959;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        this.f7959 = new WeakReference(keyEvent);
        if (this.f7957 == null) {
            this.f7957 = new SparseArray();
        }
        SparseArray sparseArray = this.f7957;
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
            m6818(view, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6818(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((InterfaceC11382) arrayList.get(size)).m28490()) {
                return true;
            }
        }
        return false;
    }
}
