package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import l.AbstractC0414;
import l.AbstractC3236;
import l.C0976;
import l.C10405;
import l.C16082;
import l.C17492;
import l.C18616;
import l.C2271;
import l.C2387;
import l.C7603;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends AbstractC3236 {
    public static final int DEF_STYLE_RES = C18616.f59268;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int color;
    public Drawable dividerDrawable;
    public int insetEnd;
    public int insetStart;
    public boolean lastItemDecorated;
    public int orientation;
    public final Rect tempRect;
    public int thickness;

    public boolean shouldDrawDivider(int i, AbstractC0414 abstractC0414) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C2387.f8657, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C8033.f28042, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f27458).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27723, context.getResources().getDimensionPixelSize(C0976.f4150));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f27670, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f27935, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C8033.f26926, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C2271.m6966(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setDividerThickness(int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(Context context, int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(int i) {
        this.color = i;
        Drawable drawableM20139 = C7603.m20139(this.dividerDrawable);
        this.dividerDrawable = drawableM20139;
        C7603.m20138(drawableM20139, i);
    }

    public void setDividerColorResource(Context context, int i) {
        setDividerColor(C10405.m26299(context, i));
    }

    public int getDividerColor() {
        return this.color;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(Context context, int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(Context context, int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // l.AbstractC3236
    public void onDraw(Canvas canvas, C17492 c17492, C16082 c16082) {
        if (c17492.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, c17492);
        } else {
            drawForHorizontalOrientation(canvas, c17492);
        }
    }

    private void drawForVerticalOrientation(Canvas canvas, C17492 c17492) {
        int width;
        int paddingLeft;
        canvas.save();
        if (c17492.getClipToPadding()) {
            paddingLeft = c17492.getPaddingLeft();
            width = c17492.getWidth() - c17492.getPaddingRight();
            canvas.clipRect(paddingLeft, c17492.getPaddingTop(), width, c17492.getHeight() - c17492.getPaddingBottom());
        } else {
            width = c17492.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c17492);
        int i = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i2 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = c17492.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c17492.getChildAt(i3);
            if (shouldDrawDivider(c17492, childAt)) {
                c17492.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i, iRound - this.thickness, i2, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(Canvas canvas, C17492 c17492) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (c17492.getClipToPadding()) {
            paddingTop = c17492.getPaddingTop();
            height = c17492.getHeight() - c17492.getPaddingBottom();
            canvas.clipRect(c17492.getPaddingLeft(), paddingTop, c17492.getWidth() - c17492.getPaddingRight(), height);
        } else {
            height = c17492.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.insetStart;
        int i4 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c17492);
        int childCount = c17492.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = c17492.getChildAt(i5);
            if (shouldDrawDivider(c17492, childAt)) {
                c17492.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i2 = this.tempRect.left + iRound;
                    i = this.thickness + i2;
                } else {
                    i = iRound + this.tempRect.right;
                    i2 = i - this.thickness;
                }
                this.dividerDrawable.setBounds(i2, i3, i, i4);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // l.AbstractC3236
    public void getItemOffsets(Rect rect, View view, C17492 c17492, C16082 c16082) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(c17492, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(c17492)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(C17492 c17492, View view) {
        int childAdapterPosition = c17492.getChildAdapterPosition(view);
        AbstractC0414 adapter = c17492.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
    }
}
