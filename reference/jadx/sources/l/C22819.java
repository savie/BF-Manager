package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes.dex */
public final class C22819 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f73950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22819 m51446(float f, float f2, float f3) {
        return new C22819(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public C22819(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        this.f73950 = rangeInfo;
    }
}
