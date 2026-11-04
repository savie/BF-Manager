package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I1AI */
/* JADX INFO: loaded from: classes5.dex */
public class C17048 extends AbstractC13143 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f55692;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f55693;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f55694;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f55695;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f55696;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f55697;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f55698;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f55699;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f55700;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f55701;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f55702;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f55703;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f55704;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public View[] f55705;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f55706;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f55707;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C16872 f55708;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f55709;

    public C17048(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55701 = Float.NaN;
        this.f55695 = Float.NaN;
        this.f55706 = Float.NaN;
        this.f55692 = 1.0f;
        this.f55700 = 1.0f;
        this.f55697 = Float.NaN;
        this.f55696 = Float.NaN;
        this.f55702 = Float.NaN;
        this.f55694 = Float.NaN;
        this.f55707 = Float.NaN;
        this.f55699 = Float.NaN;
        this.f55703 = true;
        this.f55705 = null;
        this.f55709 = 0.0f;
        this.f55704 = 0.0f;
    }

    public C17048(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55701 = Float.NaN;
        this.f55695 = Float.NaN;
        this.f55706 = Float.NaN;
        this.f55692 = 1.0f;
        this.f55700 = 1.0f;
        this.f55697 = Float.NaN;
        this.f55696 = Float.NaN;
        this.f55702 = Float.NaN;
        this.f55694 = Float.NaN;
        this.f55707 = Float.NaN;
        this.f55699 = Float.NaN;
        this.f55703 = true;
        this.f55705 = null;
        this.f55709 = 0.0f;
        this.f55704 = 0.0f;
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo19751(AttributeSet attributeSet) {
        super.mo19751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f55693 = true;
                } else if (index == 13) {
                    this.f55698 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC13143, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55708 = (C16872) getParent();
        if (this.f55693 || this.f55698) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f42035; i++) {
                View viewById = this.f55708.getViewById(this.f42036[i]);
                if (viewById != null) {
                    if (this.f55693) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f55698 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۤ */
    public final void mo32675(C16872 c16872) {
        this.f55708 = c16872;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (Float.isNaN(this.f55706)) {
                return;
            }
            this.f55706 = rotation;
            return;
        }
        this.f55706 = rotation;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        this.f55706 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        this.f55692 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        this.f55700 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setPivotX(float f) {
        this.f55701 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setPivotY(float f) {
        this.f55695 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.f55709 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.f55704 = f;
        m40172();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m32668();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m32668();
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2278() {
        m40173();
        this.f55697 = Float.NaN;
        this.f55696 = Float.NaN;
        C10445 c10445M29332 = ((C11651) getLayoutParams()).m29332();
        c10445M29332.m26805(0);
        c10445M29332.m26824(0);
        m40174();
        layout(((int) this.f55707) - getPaddingLeft(), ((int) this.f55699) - getPaddingTop(), getPaddingRight() + ((int) this.f55702), getPaddingBottom() + ((int) this.f55694));
        m40172();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m40173() {
        int i;
        if (this.f55708 == null || (i = this.f42035) == 0) {
            return;
        }
        View[] viewArr = this.f55705;
        if (viewArr == null || viewArr.length != i) {
            this.f55705 = new View[i];
        }
        for (int i2 = 0; i2 < this.f42035; i2++) {
            this.f55705[i2] = this.f55708.getViewById(this.f42036[i2]);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40174() {
        if (this.f55708 == null) {
            return;
        }
        if (this.f55703 || Float.isNaN(this.f55697) || Float.isNaN(this.f55696)) {
            if (Float.isNaN(this.f55701) || Float.isNaN(this.f55695)) {
                View[] viewArrM32677 = m32677(this.f55708);
                int left = viewArrM32677[0].getLeft();
                int top = viewArrM32677[0].getTop();
                int right = viewArrM32677[0].getRight();
                int bottom = viewArrM32677[0].getBottom();
                for (int i = 0; i < this.f42035; i++) {
                    View view = viewArrM32677[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f55702 = right;
                this.f55694 = bottom;
                this.f55707 = left;
                this.f55699 = top;
                if (Float.isNaN(this.f55701)) {
                    this.f55697 = (left + right) / 2;
                } else {
                    this.f55697 = this.f55701;
                }
                if (Float.isNaN(this.f55695)) {
                    this.f55696 = (top + bottom) / 2;
                    return;
                } else {
                    this.f55696 = this.f55695;
                    return;
                }
            }
            this.f55696 = this.f55695;
            this.f55697 = this.f55701;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m40172() {
        if (this.f55708 == null) {
            return;
        }
        if (this.f55705 == null) {
            m40173();
        }
        m40174();
        double radians = Float.isNaN(this.f55706) ? 0.0d : Math.toRadians(this.f55706);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f55692;
        float f2 = f * fCos;
        float f3 = this.f55700;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f42035; i++) {
            View view = this.f55705[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f55697;
            float f8 = bottom - this.f55696;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f55709;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f55704;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f55700);
            view.setScaleX(this.f55692);
            if (!Float.isNaN(this.f55706)) {
                view.setRotation(this.f55706);
            }
        }
    }
}
