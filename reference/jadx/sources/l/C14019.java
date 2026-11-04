package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.۬ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U14P */
/* JADX INFO: loaded from: classes4.dex */
public class C14019 extends C15179 {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44411;

    public C14019(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44411 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34140(boolean z) {
        this.f44411 = z;
    }

    @Override // l.C15179, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44411) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // l.C15179, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f44411) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
