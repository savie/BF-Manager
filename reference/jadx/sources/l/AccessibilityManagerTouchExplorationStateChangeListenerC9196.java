package l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC9196 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0994 f30006;

    public AccessibilityManagerTouchExplorationStateChangeListenerC9196(InterfaceC0994 interfaceC0994) {
        this.f30006 = interfaceC0994;
    }

    public final int hashCode() {
        return this.f30006.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC9196) {
            return this.f30006.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC9196) obj).f30006);
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f30006.onTouchExplorationStateChanged(z);
    }
}
