package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۘۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3672 extends C17492 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21312 f13432;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3672(C21312 c21312, Context context) {
        super(context);
        this.f13432 = c21312;
    }

    @Override // l.C17492, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f13432.f69351.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C21312 c21312 = this.f13432;
        accessibilityEvent.setFromIndex(c21312.f69354);
        accessibilityEvent.setToIndex(c21312.f69354);
        accessibilityEvent.setSource(c21312.f69351.f3495);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // l.C17492, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13432.m47805() && super.onTouchEvent(motionEvent);
    }

    @Override // l.C17492, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13432.m47805() && super.onInterceptTouchEvent(motionEvent);
    }
}
