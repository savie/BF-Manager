package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3823 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13034;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C24158 f13035;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C17531 f13036;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23961 f13037;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13056 f13038;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13039;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f13040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13041;

    public AbstractC3823(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC3823(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13037 = new C23961(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true) && typedValue.resourceId != 0) {
            this.f13040 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f13040 = context;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C10401.f33061, R.attr.MT_Protector, 0);
        mo1183(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C13056 c13056 = this.f13038;
        if (c13056 != null) {
            c13056.m32539();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13034 = false;
        }
        if (!this.f13034) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f13034 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f13034 = false;
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13039 = false;
        }
        if (!this.f13039) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f13039 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f13039 = false;
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1183(int i) {
        this.f13041 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C24158 c24158 = this.f13035;
            if (c24158 != null) {
                c24158.m54119();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12360(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12359(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM18182 = C6421.m18182(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iM18182, i, measuredHeight + iM18182);
        } else {
            view.layout(i, iM18182, i + measuredWidth, measuredHeight + iM18182);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
