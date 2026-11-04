package l;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: l.ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes2.dex */
public class C5665 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AccessibilityNodeProvider f19548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19835 mo16652(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo16653(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19835 mo16654(int i) {
        return null;
    }

    public C5665() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19548 = new C13122(this);
        } else {
            this.f19548 = new C15359(this);
        }
    }

    public C5665(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f19548 = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m16651() {
        return this.f19548;
    }
}
