package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܳ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15578 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11103 f50657;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f50658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f50660;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50661;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50662;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect f50663;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50664;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f50665;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f50666;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50668;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f50669;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f50670;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50671;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50672;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50673;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f50674;

    public C15578() {
        super(-2, -2);
        this.f50662 = false;
        this.f50661 = 0;
        this.f50659 = 0;
        this.f50669 = -1;
        this.f50664 = -1;
        this.f50672 = 0;
        this.f50671 = 0;
        this.f50663 = new Rect();
    }

    public C15578(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50662 = false;
        this.f50661 = 0;
        this.f50659 = 0;
        this.f50669 = -1;
        this.f50664 = -1;
        this.f50672 = 0;
        this.f50671 = 0;
        this.f50663 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13888.f44044);
        this.f50661 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f50664 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f50659 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f50669 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f50672 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f50671 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f50662 = zHasValue;
        if (zHasValue) {
            this.f50657 = C25276.m56415(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC11103 abstractC11103 = this.f50657;
        if (abstractC11103 != null) {
            abstractC11103.onAttachedToLayoutParams(this);
        }
    }

    public C15578(C15578 c15578) {
        super((ViewGroup.MarginLayoutParams) c15578);
        this.f50662 = false;
        this.f50661 = 0;
        this.f50659 = 0;
        this.f50669 = -1;
        this.f50664 = -1;
        this.f50672 = 0;
        this.f50671 = 0;
        this.f50663 = new Rect();
    }

    public C15578(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f50662 = false;
        this.f50661 = 0;
        this.f50659 = 0;
        this.f50669 = -1;
        this.f50664 = -1;
        this.f50672 = 0;
        this.f50671 = 0;
        this.f50663 = new Rect();
    }

    public C15578(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f50662 = false;
        this.f50661 = 0;
        this.f50659 = 0;
        this.f50669 = -1;
        this.f50664 = -1;
        this.f50672 = 0;
        this.f50671 = 0;
        this.f50663 = new Rect();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37310() {
        return this.f50664;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11103 m37307() {
        return this.f50657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37302(AbstractC11103 abstractC11103) {
        AbstractC11103 abstractC11104 = this.f50657;
        if (abstractC11104 != abstractC11103) {
            if (abstractC11104 != null) {
                abstractC11104.onDetachedFromLayoutParams();
            }
            this.f50657 = abstractC11103;
            this.f50674 = null;
            this.f50662 = true;
            if (abstractC11103 != null) {
                abstractC11103.onAttachedToLayoutParams(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37304() {
        if (this.f50657 == null) {
            this.f50666 = false;
        }
        return this.f50666;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37306(C25276 c25276, View view) {
        boolean z = this.f50666;
        if (z) {
            return true;
        }
        AbstractC11103 abstractC11103 = this.f50657;
        boolean zBlocksInteractionBelow = (abstractC11103 != null ? abstractC11103.blocksInteractionBelow(c25276, view) : false) | z;
        this.f50666 = zBlocksInteractionBelow;
        return zBlocksInteractionBelow;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37308() {
        this.f50666 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37301(int i, boolean z) {
        if (i == 0) {
            this.f50668 = z;
        } else {
            if (i != 1) {
                return;
            }
            this.f50667 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37305(int i) {
        if (i == 0) {
            return this.f50668;
        }
        if (i != 1) {
            return false;
        }
        return this.f50667;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37311() {
        return this.f50673;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37303(boolean z) {
        this.f50673 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m37309() {
        this.f50673 = false;
    }
}
