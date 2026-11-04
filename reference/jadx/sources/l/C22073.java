package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes.dex */
public final class C22073 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f71167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22073 m49904(int i, int i2, int i3, boolean z) {
        return new C22073(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22073 m49903(int i) {
        return new C22073(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }

    public C22073(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f71167 = collectionInfo;
    }
}
