package l;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۜ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public final class C7019 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15179 f23149;

    public C7019(C15179 c15179) {
        this.f23149 = c15179;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC6274 abstractC6274;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(C15179.class.getName());
        C15179 c15179 = this.f23149;
        AbstractC6274 abstractC6275 = c15179.f49541;
        if (abstractC6275 != null) {
            z = abstractC6275.mo3000() > 1;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC6274 = c15179.f49541) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC6274.mo3000());
        accessibilityEvent.setFromIndex(c15179.f49522);
        accessibilityEvent.setToIndex(c15179.f49522);
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(view, c19835);
        c19835.m45639((CharSequence) C15179.class.getName());
        C15179 c15179 = this.f23149;
        AbstractC6274 abstractC6274 = c15179.f49541;
        c19835.m45670(abstractC6274 != null && abstractC6274.mo3000() > 1);
        if (c15179.canScrollHorizontally(1)) {
            c19835.m45633(4096);
        }
        if (c15179.canScrollHorizontally(-1)) {
            c19835.m45633(8192);
        }
    }

    @Override // l.C22687
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C15179 c15179 = this.f23149;
        if (i == 4096) {
            if (!c15179.canScrollHorizontally(1)) {
                return false;
            }
            c15179.m36527(c15179.f49522 + 1);
            return true;
        }
        if (i != 8192 || !c15179.canScrollHorizontally(-1)) {
            return false;
        }
        c15179.m36527(c15179.f49522 - 1);
        return true;
    }
}
