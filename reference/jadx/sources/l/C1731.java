package l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1731 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5743(AccessibilityManager accessibilityManager, InterfaceC23605 interfaceC23605) {
        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC14433(interfaceC23605));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5744(AccessibilityManager accessibilityManager, InterfaceC23605 interfaceC23605) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC14433(interfaceC23605));
    }
}
