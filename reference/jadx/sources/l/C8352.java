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

/* JADX INFO: renamed from: l.۠ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAKT */
/* JADX INFO: loaded from: classes3.dex */
public class C8352 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ViewGroup f27385;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15688 f27386;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f27387;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f27388;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5752 f27389;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f27390;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C5752 f27391;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f27392;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f27393;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5752 f27394;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f27395;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27396;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f27397;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5752 f27398;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f27399;

    public C8352(Context context) {
        super(context);
        this.f27390 = false;
        m22477();
    }

    public C8352(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27390 = false;
        m22477();
    }

    public C8352(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27390 = false;
        m22477();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22477() {
        ColorStateList colorStateListValueOf;
        ColorStateList colorStateListValueOf2;
        Context context = getContext();
        float f = context.getResources().getDisplayMetrics().density;
        this.f27387 = (int) ((32.0f * f) + 0.5f);
        this.f27393 = (int) ((3.0f * f) + 0.5f);
        this.f27399 = (int) ((4.0f * f) + 0.5f);
        this.f27392 = (int) ((2.0f * f) + 0.5f);
        this.f27396 = (int) ((f * 5.0f) + 0.5f);
        this.f27395 = new View(context);
        this.f27386 = new C15688(context);
        this.f27389 = new C5752(context);
        this.f27391 = new C5752(context);
        this.f27398 = new C5752(context);
        this.f27394 = new C5752(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f27385 = viewGroup;
        this.f27397 = (TextView) viewGroup.getChildAt(1);
        this.f27385.setVisibility(8);
        this.f27395.setId(R.id.MT_Protector);
        this.f27386.setId(R.id.MT_Protector);
        this.f27389.setId(R.id.file_name);
        this.f27391.setId(R.id.MT_Protector);
        this.f27398.setId(R.id.MT_Protector);
        this.f27394.setId(R.id.MT_Protector);
        this.f27389.setEllipsize(TextUtils.TruncateAt.END);
        this.f27389.setMaxLines(2);
        this.f27391.setText("->");
        this.f27389.setTextSize(13.0f);
        this.f27391.setTextSize(10.0f);
        this.f27398.setTextSize(10.0f);
        this.f27394.setTextSize(10.0f);
        if (isInEditMode()) {
            colorStateListValueOf = ColorStateList.valueOf(-288304944);
            colorStateListValueOf2 = ColorStateList.valueOf(-1715157820);
            this.f27386.setImageResource(R.drawable.MT_Protector);
            this.f27389.setText("文件名");
            this.f27398.setText("2020-11-11 20:30");
            this.f27394.setText("16.9MB");
        } else {
            colorStateListValueOf = C3296.f10751;
            colorStateListValueOf2 = C3296.f10779;
        }
        this.f27389.setTextColor(colorStateListValueOf);
        this.f27391.setTextColor(colorStateListValueOf2);
        this.f27398.setTextColor(colorStateListValueOf2);
        this.f27394.setTextColor(colorStateListValueOf2);
        this.f27388 = C3296.f10776;
        addView(this.f27395);
        addView(this.f27386);
        addView(this.f27389);
        addView(this.f27391);
        addView(this.f27398);
        addView(this.f27394);
        addView(this.f27385);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22480(boolean z) {
        if (this.f27390 != z) {
            this.f27390 = z;
            if (z) {
                this.f27395.setVisibility(8);
                this.f27386.setVisibility(8);
                this.f27389.setVisibility(8);
                this.f27391.setVisibility(8);
                this.f27398.setVisibility(8);
                this.f27394.setVisibility(8);
                this.f27385.setVisibility(0);
            } else {
                this.f27395.setVisibility(0);
                this.f27386.setVisibility(0);
                this.f27389.setVisibility(0);
                this.f27391.setVisibility(0);
                this.f27398.setVisibility(0);
                this.f27394.setVisibility(0);
                this.f27385.setVisibility(8);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22479() {
        if (this.f27388 != C3296.f10776) {
            ColorStateList colorStateList = C3296.f10751;
            ColorStateList colorStateList2 = C3296.f10779;
            this.f27389.setTextColor(colorStateList);
            this.f27391.setTextColor(colorStateList2);
            this.f27398.setTextColor(colorStateList2);
            this.f27394.setTextColor(colorStateList2);
            this.f27397.setTextColor(colorStateList2);
            this.f27385.getChildAt(0).setBackgroundColor(C3296.f10757);
            this.f27385.getChildAt(2).setBackgroundColor(C3296.f10757);
            this.f27388 = C3296.f10776;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f27390) {
            this.f27385.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            setMeasuredDimension(size, this.f27385.getMeasuredHeight());
            return;
        }
        int i3 = this.f27393;
        int i4 = this.f27387;
        int i5 = size - (((i3 + i4) + this.f27392) + i3);
        int i6 = size2 - (this.f27399 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.f27386.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.f27391.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f27398.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f27394.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f27389.measure(View.MeasureSpec.makeMeasureSpec(i5 - this.f27391.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        setMeasuredDimension(size, Math.max(this.f27387, this.f27398.getMeasuredHeight() + this.f27389.getMeasuredHeight()) + (this.f27399 * 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f27390) {
            this.f27385.layout(0, 0, i5, i6);
            return;
        }
        int i7 = this.f27387;
        int i8 = this.f27393;
        C5752 c5752 = this.f27389;
        C5752 c5753 = this.f27398;
        C5752 c5754 = this.f27394;
        C5752 c5755 = this.f27391;
        this.f27395.layout(0, 0, i5, i6);
        int i9 = (i6 - i7) / 2;
        int i10 = i8 + i7;
        this.f27386.layout(i8, i9, i10, i7 + i9);
        if (c5753.getVisibility() == 8) {
            measuredHeight = (i6 - c5752.getMeasuredHeight()) / 2;
        } else {
            measuredHeight = ((i6 - c5752.getMeasuredHeight()) - c5753.getMeasuredHeight()) / 2;
        }
        int measuredWidth = i10 + this.f27392;
        c5752.layout(measuredWidth, measuredHeight, c5752.getMeasuredWidth() + measuredWidth, c5752.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = c5752.getMeasuredHeight() + measuredHeight;
        c5753.layout(measuredWidth, measuredHeight2, c5753.getMeasuredWidth() + measuredWidth, c5753.getMeasuredHeight() + measuredHeight2);
        if (c5753.getMeasuredWidth() != 0) {
            measuredWidth = c5753.getMeasuredWidth() + measuredWidth + this.f27396;
        }
        c5754.layout(measuredWidth, measuredHeight2, c5754.getMeasuredWidth() + measuredWidth, c5753.getMeasuredHeight() + measuredHeight2);
        int i11 = i5 - i8;
        int baseline = (c5752.getBaseline() + measuredHeight) - c5755.getBaseline();
        c5755.layout(i11 - c5755.getMeasuredWidth(), baseline, i11, c5755.getMeasuredHeight() + baseline);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m22486() {
        return this.f27395;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15688 m22485() {
        return this.f27386;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5752 m22483() {
        return this.f27389;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5752 m22484() {
        return this.f27391;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5752 m22482() {
        return this.f27398;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5752 m22481() {
        return this.f27394;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView m22487() {
        return this.f27397;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22478() {
        this.f27393 = 0;
        requestLayout();
    }
}
