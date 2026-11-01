package l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14142 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12025 f46413;

    public C14142(C12025 c12025) {
        this.f46413 = c12025;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f46413.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46413.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C22006 c22006M48820 = C22006.m48820(accessibilityNodeInfo);
        int i = C5031.f17539;
        Boolean bool = (Boolean) new C10343(R.id.MT_Protector, 0, 28, Boolean.class).m2320(view);
        c22006M48820.m48891(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new C15988(R.id.MT_Protector, 0, 28, Boolean.class).m2320(view);
        c22006M48820.m48835(bool2 != null && bool2.booleanValue());
        c22006M48820.m48853(C5031.m13972(view));
        c22006M48820.m48889((CharSequence) new C20926(R.id.MT_Protector, 64, 30, CharSequence.class).m2320(view));
        this.f46413.onInitializeAccessibilityNodeInfo(view, c22006M48820);
        c22006M48820.m48843(view, accessibilityNodeInfo.getText());
        List listM29922 = C12025.m29922(view);
        for (int i2 = 0; i2 < listM29922.size(); i2++) {
            c22006M48820.m48848((C9494) listM29922.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46413.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f46413.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f46413.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f46413.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C3660 accessibilityNodeProvider = this.f46413.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.m10792();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f46413.performAccessibilityAction(view, i, bundle);
    }
}
