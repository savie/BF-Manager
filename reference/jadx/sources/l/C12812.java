package l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.۫ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6J6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12812 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f41046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22687 f41047;

    public C12812(C1626 c1626, C22687 c22687) {
        this.f41046 = c1626;
        this.f41047 = c22687;
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        this.f41047.onInitializeAccessibilityNodeInfo(view, c19835);
        C1626 c1626 = this.f41046;
        CharSequence charSequence = c1626.m5736() ? c1626.f5624 : c1626.f5607.f78022.f43673;
        c19835.m45688(charSequence);
        c19835.m45690(c1626.f5607.m54099() == 0 && !TextUtils.isEmpty(charSequence));
        c19835.m45675(c1626.m5770());
        c19835.m45654(c1626.m5770() ? c1626.f5619 : null);
    }

    @Override // l.C22687
    public final void sendAccessibilityEvent(View view, int i) {
        this.f41047.sendAccessibilityEvent(view, i);
    }

    @Override // l.C22687
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f41047.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f41047.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f41047.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f41047.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f41047.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // l.C22687
    public final C5665 getAccessibilityNodeProvider(View view) {
        return this.f41047.getAccessibilityNodeProvider(view);
    }

    @Override // l.C22687
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f41047.performAccessibilityAction(view, i, bundle);
    }
}
