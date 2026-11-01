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

/* JADX INFO: renamed from: l.ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10032 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f34244;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C8621 f34245;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20554 f34246;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22815 f34247;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5175 f34248;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f34249;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Context f34250;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34251;

    public AbstractC10032(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC10032(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34245 = new C8621(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true) && typedValue.resourceId != 0) {
            this.f34250 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f34250 = context;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C12108.f40515, R.attr.MT_Protector, 0);
        mo25318(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C5175 c5175 = this.f34248;
        if (c5175 != null) {
            c5175.m14341();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f34249 = false;
        }
        if (!this.f34249) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f34249 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f34249 = false;
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f34244 = false;
        }
        if (!this.f34244) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f34244 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f34244 = false;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo25318(int i) {
        this.f34251 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C20554 c20554 = this.f34246;
            if (c20554 != null) {
                c20554.m46322();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25315(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25314(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM9602 = C3184.m9602(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iM9602, i, measuredHeight + iM9602);
        } else {
            view.layout(i, iM9602, i + measuredWidth, measuredHeight + iM9602);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
