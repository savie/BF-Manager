package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5072 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f17672;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5072 m14143(float f, float f2, float f3) {
        return new C5072(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public C5072(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        this.f17672 = rangeInfo;
    }
}
