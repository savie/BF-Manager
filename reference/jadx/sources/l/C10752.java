package l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10752 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22687 f34151;

    public C10752(C22687 c22687) {
        this.f34151 = c22687;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f34151.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f34151.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C19835 c19835M45619 = C19835.m45619(accessibilityNodeInfo);
        int i = C22666.f73603;
        Boolean bool = (Boolean) new C23983(R.id.MT_Protector, 0, 28, Boolean.class).m1249(view);
        c19835M45619.m45668(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new C20999(R.id.MT_Protector, 0, 28, Boolean.class).m1249(view);
        c19835M45619.m45656(bool2 != null && bool2.booleanValue());
        c19835M45619.m45664(C22666.m51124(view));
        c19835M45619.m45660((CharSequence) new C14285(R.id.MT_Protector, 64, 30, CharSequence.class).m1249(view));
        this.f34151.onInitializeAccessibilityNodeInfo(view, c19835M45619);
        c19835M45619.m45638(view, accessibilityNodeInfo.getText());
        List listM51166 = C22687.m51166(view);
        for (int i2 = 0; i2 < listM51166.size(); i2++) {
            c19835M45619.m45641((C8451) listM51166.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f34151.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f34151.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f34151.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f34151.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C5665 accessibilityNodeProvider = this.f34151.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.m16651();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f34151.performAccessibilityAction(view, i, bundle);
    }
}
