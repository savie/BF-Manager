package l;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes4.dex */
public class C15359 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5665 f50113;

    public C15359(C5665 c5665) {
        this.f50113 = c5665;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C19835 c19835Mo16652 = this.f50113.mo16652(i);
        if (c19835Mo16652 == null) {
            return null;
        }
        return c19835Mo16652.m45662();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f50113.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f50113.mo16653(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C19835 c19835Mo16654 = this.f50113.mo16654(i);
        if (c19835Mo16654 == null) {
            return null;
        }
        return c19835Mo16654.m45662();
    }
}
