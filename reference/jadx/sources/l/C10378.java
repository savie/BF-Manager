package l;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۢ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public class C10378 extends C8147 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33014 = 0;

    /* JADX INFO: renamed from: ܽ᩸ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f33015;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f33016;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static native void m26696();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26694(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C10378) {
                ((C10378) parent).f33016 = true;
                return;
            }
        }
    }

    static {
        ApplicationC23172.m52091(90);
        f33015 = new short[]{1030, -27850, -27847, -27853, -27867, -27848, -27842, -27853, -27783, -27852, -27848, -27847, -27869, -27854, -27847, -27869, -27783, -27865, -27846, -27783, -27897, -27850, -27852, -27844, -27850, -27856, -27854, -27874, -27847, -27855, -27848, -27789, -27802, -27850, -27847, -27853, -27867, -27848, -27842, -27853, -27783, -27852, -27848, -27847, -27869, -27854, -27847, -27869, -27783, -27865, -27846, -27783, -27897, -27850, -27852, -27844, -27850, -27856, -27854, -27874, -27847, -27855, -27848, -27884, -27899, -27886, -27882, -27901, -27880, -27899, -27868, -27897, -27850, -27852, -27844, -27850, -27856, -27854, -27874, -27847, -27855, -27848, -27884, -27850, -27852, -27841, -27854, -27868, -27897, -27850, -27842, -27867, -27854, -27853, -27884, -27867, -27854, -27850, -27869, -27848, -27867, -27868, -27846, -27884, -27867, -27854, -27850, -27869, -27848, -27867, -27868, -27868, -27897, -27850, -27842, -27867, -27854, -27853, -27884, -27867, -27854, -27850, -27869, -27848, -27867, -27868, -27852, -27845, -27854, -27850, -27867, -27851, -27842, -27847, -27783, -27846, -27869, -27783, -27865, -27845, -27870, -27868, -27850, -27847, -27853, -27867, -27848, -27842, -27853, -27783, -27852, -27848, -27847, -27869, -27854, -27847, -27869, -27783, -27865, -27846, -27783, -27897, -27850, -27852, -27844, -27850, -27856, -27854, -27874, -27847, -27855, -27848};
        C5261.f18540.execute(new RunnableC8142(0));
        new Matrix();
    }

    public C10378(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C10378(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        if (j == 160) {
            return false;
        }
        return super.postDelayed(runnable, j);
    }

    @Override // l.C8147, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                mode2 = 1073741824;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, mode2);
        }
        super.onMeasure(i, i2);
    }

    @Override // l.C8147, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33016) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f33016 = false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // l.C8147, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33016) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f33016 = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
