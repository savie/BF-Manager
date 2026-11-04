package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10884 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f34456;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10884 m27635(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new C10884(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    public C10884(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f34456 = collectionItemInfo;
    }
}
