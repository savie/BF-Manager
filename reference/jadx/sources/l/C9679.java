package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9679 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f32624;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f32625;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC23790 f32626;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32627;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f32628;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f32629;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f32630;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Rect f32631;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32632;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f32633;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32634;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f32635;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32636;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f32637;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f32638;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f32639;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f32640;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Object f32641;

    public C9679() {
        super(-2, -2);
        this.f32629 = false;
        this.f32632 = 0;
        this.f32627 = 0;
        this.f32628 = -1;
        this.f32624 = -1;
        this.f32625 = 0;
        this.f32634 = 0;
        this.f32631 = new Rect();
    }

    public C9679(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32629 = false;
        this.f32632 = 0;
        this.f32627 = 0;
        this.f32628 = -1;
        this.f32624 = -1;
        this.f32625 = 0;
        this.f32634 = 0;
        this.f32631 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17439.f55540);
        this.f32632 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f32624 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f32627 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f32628 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f32625 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f32634 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f32629 = zHasValue;
        if (zHasValue) {
            this.f32626 = C2746.m8364(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC23790 abstractC23790 = this.f32626;
        if (abstractC23790 != null) {
            abstractC23790.onAttachedToLayoutParams(this);
        }
    }

    public C9679(C9679 c9679) {
        super((ViewGroup.MarginLayoutParams) c9679);
        this.f32629 = false;
        this.f32632 = 0;
        this.f32627 = 0;
        this.f32628 = -1;
        this.f32624 = -1;
        this.f32625 = 0;
        this.f32634 = 0;
        this.f32631 = new Rect();
    }

    public C9679(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f32629 = false;
        this.f32632 = 0;
        this.f32627 = 0;
        this.f32628 = -1;
        this.f32624 = -1;
        this.f32625 = 0;
        this.f32634 = 0;
        this.f32631 = new Rect();
    }

    public C9679(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f32629 = false;
        this.f32632 = 0;
        this.f32627 = 0;
        this.f32628 = -1;
        this.f32624 = -1;
        this.f32625 = 0;
        this.f32634 = 0;
        this.f32631 = new Rect();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24631() {
        return this.f32624;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23790 m24630() {
        return this.f32626;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24624(AbstractC23790 abstractC23790) {
        AbstractC23790 abstractC23791 = this.f32626;
        if (abstractC23791 != abstractC23790) {
            if (abstractC23791 != null) {
                abstractC23791.onDetachedFromLayoutParams();
            }
            this.f32626 = abstractC23790;
            this.f32641 = null;
            this.f32629 = true;
            if (abstractC23790 != null) {
                abstractC23790.onAttachedToLayoutParams(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24626() {
        if (this.f32626 == null) {
            this.f32636 = false;
        }
        return this.f32636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24628(C2746 c2746, View view) {
        boolean z = this.f32636;
        if (z) {
            return true;
        }
        AbstractC23790 abstractC23790 = this.f32626;
        boolean zBlocksInteractionBelow = (abstractC23790 != null ? abstractC23790.blocksInteractionBelow(c2746, view) : false) | z;
        this.f32636 = zBlocksInteractionBelow;
        return zBlocksInteractionBelow;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24632() {
        this.f32636 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24623(int i, boolean z) {
        if (i == 0) {
            this.f32639 = z;
        } else {
            if (i != 1) {
                return;
            }
            this.f32635 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24627(int i) {
        if (i == 0) {
            return this.f32639;
        }
        if (i != 1) {
            return false;
        }
        return this.f32635;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m24622() {
        return this.f32637;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24625(boolean z) {
        this.f32637 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24629() {
        this.f32637 = false;
    }
}
