package l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC14433 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23605 f47312;

    public AccessibilityManagerTouchExplorationStateChangeListenerC14433(InterfaceC23605 interfaceC23605) {
        this.f47312 = interfaceC23605;
    }

    public final int hashCode() {
        return this.f47312.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC14433) {
            return this.f47312.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC14433) obj).f47312);
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f47312.onTouchExplorationStateChanged(z);
    }
}
