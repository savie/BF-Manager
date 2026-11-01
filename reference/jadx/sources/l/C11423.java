package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11423 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f38465;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11423 m28533(int i, int i2, int i3, boolean z) {
        return new C11423(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11423 m28532(int i) {
        return new C11423(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }

    public C11423(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f38465 = collectionInfo;
    }
}
