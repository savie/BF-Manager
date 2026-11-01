package l;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes2.dex */
public class C0838 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3660 f3468;

    public C0838(C3660 c3660) {
        this.f3468 = c3660;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C22006 c22006Mo10793 = this.f3468.mo10793(i);
        if (c22006Mo10793 == null) {
            return null;
        }
        return c22006Mo10793.m48885();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f3468.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f3468.mo10794(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C22006 c22006Mo10795 = this.f3468.mo10795(i);
        if (c22006Mo10795 == null) {
            return null;
        }
        return c22006Mo10795.m48885();
    }
}
