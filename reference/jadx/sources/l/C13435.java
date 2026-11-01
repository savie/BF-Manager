package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.۬᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U14P */
/* JADX INFO: loaded from: classes4.dex */
public class C13435 extends C19383 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f44476;

    public C13435(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44476 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32931(boolean z) {
        this.f44476 = z;
    }

    @Override // l.C19383, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44476) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // l.C19383, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f44476) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
