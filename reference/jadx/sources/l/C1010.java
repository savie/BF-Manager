package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.֨ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1010 extends C25227 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6976 f3675;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010(C6976 c6976, Context context) {
        super(context);
        this.f3675 = c6976;
    }

    @Override // l.C25227, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f3675.f23024.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C6976 c6976 = this.f3675;
        accessibilityEvent.setFromIndex(c6976.f23027);
        accessibilityEvent.setToIndex(c6976.f23027);
        accessibilityEvent.setSource(c6976.f23024.f61358);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // l.C25227, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3675.m19285() && super.onTouchEvent(motionEvent);
    }

    @Override // l.C25227, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3675.m19285() && super.onInterceptTouchEvent(motionEvent);
    }
}
