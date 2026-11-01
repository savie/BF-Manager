package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAKT */
/* JADX INFO: loaded from: classes2.dex */
public class C5380 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18594;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22357 f18595;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22357 f18596;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f18597;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f18598;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22357 f18599;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2830 f18600;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f18601;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f18602;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18603;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View f18604;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ViewGroup f18605;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f18606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22357 f18607;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18608;

    public C5380(Context context) {
        super(context);
        this.f18601 = false;
        m14930();
    }

    public C5380(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18601 = false;
        m14930();
    }

    public C5380(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18601 = false;
        m14930();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m14930() {
        ColorStateList colorStateListValueOf;
        ColorStateList colorStateListValueOf2;
        Context context = getContext();
        float f = context.getResources().getDisplayMetrics().density;
        this.f18603 = (int) ((32.0f * f) + 0.5f);
        this.f18598 = (int) ((3.0f * f) + 0.5f);
        this.f18602 = (int) ((4.0f * f) + 0.5f);
        this.f18608 = (int) ((2.0f * f) + 0.5f);
        this.f18594 = (int) ((f * 5.0f) + 0.5f);
        this.f18604 = new View(context);
        this.f18600 = new C2830(context);
        this.f18599 = new C22357(context);
        this.f18595 = new C22357(context);
        this.f18607 = new C22357(context);
        this.f18596 = new C22357(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f18605 = viewGroup;
        this.f18606 = (TextView) viewGroup.getChildAt(1);
        this.f18605.setVisibility(8);
        this.f18604.setId(R.id.MT_Protector);
        this.f18600.setId(R.id.MT_Protector);
        this.f18599.setId(R.id.file_name);
        this.f18595.setId(R.id.MT_Protector);
        this.f18607.setId(R.id.MT_Protector);
        this.f18596.setId(R.id.MT_Protector);
        this.f18599.setEllipsize(TextUtils.TruncateAt.END);
        this.f18599.setMaxLines(2);
        this.f18595.setText("->");
        this.f18599.setTextSize(13.0f);
        this.f18595.setTextSize(10.0f);
        this.f18607.setTextSize(10.0f);
        this.f18596.setTextSize(10.0f);
        if (isInEditMode()) {
            colorStateListValueOf = ColorStateList.valueOf(-288304944);
            colorStateListValueOf2 = ColorStateList.valueOf(-1715157820);
            this.f18600.setImageResource(R.drawable.MT_Protector);
            this.f18599.setText("文件名");
            this.f18607.setText("2020-11-11 20:30");
            this.f18596.setText("16.9MB");
        } else {
            colorStateListValueOf = C20368.f65976;
            colorStateListValueOf2 = C20368.f66009;
        }
        this.f18599.setTextColor(colorStateListValueOf);
        this.f18595.setTextColor(colorStateListValueOf2);
        this.f18607.setTextColor(colorStateListValueOf2);
        this.f18596.setTextColor(colorStateListValueOf2);
        this.f18597 = C20368.f66000;
        addView(this.f18604);
        addView(this.f18600);
        addView(this.f18599);
        addView(this.f18595);
        addView(this.f18607);
        addView(this.f18596);
        addView(this.f18605);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14935(boolean z) {
        if (this.f18601 != z) {
            this.f18601 = z;
            if (z) {
                this.f18604.setVisibility(8);
                this.f18600.setVisibility(8);
                this.f18599.setVisibility(8);
                this.f18595.setVisibility(8);
                this.f18607.setVisibility(8);
                this.f18596.setVisibility(8);
                this.f18605.setVisibility(0);
            } else {
                this.f18604.setVisibility(0);
                this.f18600.setVisibility(0);
                this.f18599.setVisibility(0);
                this.f18595.setVisibility(0);
                this.f18607.setVisibility(0);
                this.f18596.setVisibility(0);
                this.f18605.setVisibility(8);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14934() {
        if (this.f18597 != C20368.f66000) {
            ColorStateList colorStateList = C20368.f65976;
            ColorStateList colorStateList2 = C20368.f66009;
            this.f18599.setTextColor(colorStateList);
            this.f18595.setTextColor(colorStateList2);
            this.f18607.setTextColor(colorStateList2);
            this.f18596.setTextColor(colorStateList2);
            this.f18606.setTextColor(colorStateList2);
            this.f18605.getChildAt(0).setBackgroundColor(C20368.f66006);
            this.f18605.getChildAt(2).setBackgroundColor(C20368.f66006);
            this.f18597 = C20368.f66000;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f18601) {
            this.f18605.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            setMeasuredDimension(size, this.f18605.getMeasuredHeight());
            return;
        }
        int i3 = this.f18598;
        int i4 = this.f18603;
        int i5 = size - (((i3 + i4) + this.f18608) + i3);
        int i6 = size2 - (this.f18602 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.f18600.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.f18595.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f18607.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f18596.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f18599.measure(View.MeasureSpec.makeMeasureSpec(i5 - this.f18595.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        setMeasuredDimension(size, Math.max(this.f18603, this.f18607.getMeasuredHeight() + this.f18599.getMeasuredHeight()) + (this.f18602 * 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f18601) {
            this.f18605.layout(0, 0, i5, i6);
            return;
        }
        int i7 = this.f18603;
        int i8 = this.f18598;
        C22357 c22357 = this.f18599;
        C22357 c22358 = this.f18607;
        C22357 c22359 = this.f18596;
        C22357 c223510 = this.f18595;
        this.f18604.layout(0, 0, i5, i6);
        int i9 = (i6 - i7) / 2;
        int i10 = i8 + i7;
        this.f18600.layout(i8, i9, i10, i7 + i9);
        if (c22358.getVisibility() == 8) {
            measuredHeight = (i6 - c22357.getMeasuredHeight()) / 2;
        } else {
            measuredHeight = ((i6 - c22357.getMeasuredHeight()) - c22358.getMeasuredHeight()) / 2;
        }
        int measuredWidth = i10 + this.f18608;
        c22357.layout(measuredWidth, measuredHeight, c22357.getMeasuredWidth() + measuredWidth, c22357.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = c22357.getMeasuredHeight() + measuredHeight;
        c22358.layout(measuredWidth, measuredHeight2, c22358.getMeasuredWidth() + measuredWidth, c22358.getMeasuredHeight() + measuredHeight2);
        if (c22358.getMeasuredWidth() != 0) {
            measuredWidth = c22358.getMeasuredWidth() + measuredWidth + this.f18594;
        }
        c22359.layout(measuredWidth, measuredHeight2, c22359.getMeasuredWidth() + measuredWidth, c22358.getMeasuredHeight() + measuredHeight2);
        int i11 = i5 - i8;
        int baseline = (c22357.getBaseline() + measuredHeight) - c223510.getBaseline();
        c223510.layout(i11 - c223510.getMeasuredWidth(), baseline, i11, c223510.getMeasuredHeight() + baseline);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m14939() {
        return this.f18604;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2830 m14936() {
        return this.f18600;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22357 m14931() {
        return this.f18599;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22357 m14940() {
        return this.f18595;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22357 m14937() {
        return this.f18607;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22357 m14938() {
        return this.f18596;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView m14932() {
        return this.f18606;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14933() {
        this.f18598 = 0;
        requestLayout();
    }
}
