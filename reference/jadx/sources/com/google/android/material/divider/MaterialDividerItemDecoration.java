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
import l.AbstractC12218;
import l.AbstractC12964;
import l.C0597;
import l.C11642;
import l.C14442;
import l.C14625;
import l.C15529;
import l.C17609;
import l.C25227;
import l.C4185;
import l.C7508;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends AbstractC12218 {
    public static final int DEF_STYLE_RES = C4185.f14981;
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

    public boolean shouldDrawDivider(int i, AbstractC12964 abstractC12964) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C11642.f36717, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C14625.f47830, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C14625.f47244).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14625.f47724, context.getResources().getDimensionPixelSize(C17609.f57339));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14625.f47191, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14625.f47297, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C14625.f46287, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C14442.m34864(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
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
        Drawable drawableM2697 = C0597.m2697(this.dividerDrawable);
        this.dividerDrawable = drawableM2697;
        C0597.m2700(drawableM2697, i);
    }

    public void setDividerColorResource(Context context, int i) {
        setDividerColor(C7508.m20558(context, i));
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

    @Override // l.AbstractC12218
    public void onDraw(Canvas canvas, C25227 c25227, C15529 c15529) {
        if (c25227.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, c25227);
        } else {
            drawForHorizontalOrientation(canvas, c25227);
        }
    }

    private void drawForVerticalOrientation(Canvas canvas, C25227 c25227) {
        int width;
        int paddingLeft;
        canvas.save();
        if (c25227.getClipToPadding()) {
            paddingLeft = c25227.getPaddingLeft();
            width = c25227.getWidth() - c25227.getPaddingRight();
            canvas.clipRect(paddingLeft, c25227.getPaddingTop(), width, c25227.getHeight() - c25227.getPaddingBottom());
        } else {
            width = c25227.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c25227);
        int i = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i2 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = c25227.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c25227.getChildAt(i3);
            if (shouldDrawDivider(c25227, childAt)) {
                c25227.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i, iRound - this.thickness, i2, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(Canvas canvas, C25227 c25227) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (c25227.getClipToPadding()) {
            paddingTop = c25227.getPaddingTop();
            height = c25227.getHeight() - c25227.getPaddingBottom();
            canvas.clipRect(c25227.getPaddingLeft(), paddingTop, c25227.getWidth() - c25227.getPaddingRight(), height);
        } else {
            height = c25227.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.insetStart;
        int i4 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c25227);
        int childCount = c25227.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = c25227.getChildAt(i5);
            if (shouldDrawDivider(c25227, childAt)) {
                c25227.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
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

    @Override // l.AbstractC12218
    public void getItemOffsets(Rect rect, View view, C25227 c25227, C15529 c15529) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(c25227, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(c25227)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(C25227 c25227, View view) {
        int childAdapterPosition = c25227.getChildAdapterPosition(view);
        AbstractC12964 adapter = c25227.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
    }
}
