package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K1CL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15666 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f50934;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f50935;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f50936;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50938;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f50939;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f50941;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f50942;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f50943;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f50944;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f50945;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50946;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50947;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f50948;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f50949;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f50950;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f50951;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50952;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f50953;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21855 f50954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final float[][] f50933 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final float[][] f50932 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f50940 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f50937 = new float[2];

    public C15666(Context context, C21855 c21855, XmlResourceParser xmlResourceParser) {
        this.f50952 = 0;
        this.f50936 = 0;
        this.f50947 = 0;
        this.f50945 = -1;
        this.f50953 = -1;
        this.f50938 = -1;
        this.f50949 = 0.5f;
        this.f50935 = 0.5f;
        this.f50942 = 0.0f;
        this.f50939 = 1.0f;
        this.f50941 = 4.0f;
        this.f50934 = 1.2f;
        this.f50946 = true;
        this.f50950 = 1.0f;
        this.f50948 = 0;
        this.f50951 = 10.0f;
        this.f50954 = c21855;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4442);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.f50945 = typedArrayObtainStyledAttributes.getResourceId(index, this.f50945);
            } else if (index == 10) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f50952);
                this.f50952 = i2;
                float[] fArr = f50933[i2];
                this.f50935 = fArr[0];
                this.f50949 = fArr[1];
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f50936);
                this.f50936 = i3;
                float[] fArr2 = f50932[i3];
                this.f50942 = fArr2[0];
                this.f50939 = fArr2[1];
            } else if (index == 5) {
                this.f50941 = typedArrayObtainStyledAttributes.getFloat(index, this.f50941);
            } else if (index == 4) {
                this.f50934 = typedArrayObtainStyledAttributes.getFloat(index, this.f50934);
            } else if (index == 6) {
                this.f50946 = typedArrayObtainStyledAttributes.getBoolean(index, this.f50946);
            } else if (index == 1) {
                this.f50950 = typedArrayObtainStyledAttributes.getFloat(index, this.f50950);
            } else if (index == 2) {
                this.f50951 = typedArrayObtainStyledAttributes.getFloat(index, this.f50951);
            } else if (index == 11) {
                this.f50953 = typedArrayObtainStyledAttributes.getResourceId(index, this.f50953);
            } else if (index == 8) {
                this.f50947 = typedArrayObtainStyledAttributes.getInt(index, this.f50947);
            } else if (index == 7) {
                this.f50948 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f50938 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37432(boolean z) {
        float[][] fArr = f50933;
        float[][] fArr2 = f50932;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f50952];
        this.f50935 = fArr3[0];
        this.f50949 = fArr3[1];
        float[] fArr4 = fArr2[this.f50936];
        this.f50942 = fArr4[0];
        this.f50939 = fArr4[1];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37436(float f, float f2) {
        this.f50944 = f;
        this.f50943 = f2;
        this.f50940 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37431(MotionEvent motionEvent, InterfaceC2637 interfaceC2637) {
        int i;
        C21855 c21855;
        char c;
        float f;
        C8603 c8603 = (C8603) interfaceC2637;
        VelocityTracker velocityTracker = c8603.f28101;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f50944 = motionEvent.getRawX();
            this.f50943 = motionEvent.getRawY();
            this.f50940 = false;
            return;
        }
        float[] fArr = this.f50937;
        C21855 c21856 = this.f50954;
        if (action == 1) {
            this.f50940 = false;
            VelocityTracker velocityTracker2 = c8603.f28101;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = c8603.f28101;
            float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
            VelocityTracker velocityTracker4 = c8603.f28101;
            float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
            float f2 = c21856.f69653;
            int i2 = this.f50945;
            if (i2 != -1) {
                c21856.m49545(i2, f2, this.f50935, this.f50949, fArr);
            } else {
                float fMin = Math.min(c21856.getWidth(), c21856.getHeight());
                fArr[1] = this.f50939 * fMin;
                fArr[0] = fMin * this.f50942;
            }
            float f3 = this.f50942 != 0.0f ? xVelocity / fArr[0] : yVelocity / fArr[1];
            float f4 = !Float.isNaN(f3) ? (f3 / 3.0f) + f2 : f2;
            if (f4 == 0.0f || f4 == 1.0f || (i = this.f50947) == 3) {
                if (0.0f >= f4 || 1.0f <= f4) {
                    c21856.m49547(EnumC4701.FINISHED);
                    return;
                }
                return;
            }
            c21856.m49542(((double) f4) < 0.5d ? 0.0f : 1.0f, f3, i);
            if (0.0f >= f2 || 1.0f <= f2) {
                c21856.m49547(EnumC4701.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f50943;
        float rawX = motionEvent.getRawX() - this.f50944;
        if (Math.abs((this.f50939 * rawY) + (this.f50942 * rawX)) > this.f50951 || this.f50940) {
            float f5 = c21856.f69653;
            if (!this.f50940) {
                this.f50940 = true;
                c21856.m49554(f5);
            }
            int i3 = this.f50945;
            if (i3 != -1) {
                c = 1;
                c21855 = c21856;
                this.f50954.m49545(i3, f5, this.f50935, this.f50949, fArr);
            } else {
                c21855 = c21856;
                c = 1;
                float fMin2 = Math.min(c21855.getWidth(), c21855.getHeight());
                fArr[1] = this.f50939 * fMin2;
                fArr[0] = fMin2 * this.f50942;
            }
            if (Math.abs(((this.f50939 * fArr[c]) + (this.f50942 * fArr[0])) * this.f50950) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[c] = 0.01f;
            }
            if (this.f50942 != 0.0f) {
                f = rawX / fArr[0];
            } else {
                f = rawY / fArr[c];
            }
            float fMax = Math.max(Math.min(f5 + f, 1.0f), 0.0f);
            if (fMax != c21855.f69653) {
                c21855.m49554(fMax);
                VelocityTracker velocityTracker5 = c8603.f28101;
                if (velocityTracker5 != null) {
                    velocityTracker5.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker6 = c8603.f28101;
                float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                VelocityTracker velocityTracker7 = c8603.f28101;
                c21855.f69665 = this.f50942 != 0.0f ? xVelocity2 / fArr[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / fArr[c];
            } else {
                c21855.f69665 = 0.0f;
            }
            this.f50944 = motionEvent.getRawX();
            this.f50943 = motionEvent.getRawY();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m37438(float f, float f2) {
        this.f50944 = f;
        this.f50943 = f2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m37442(float f, float f2) {
        this.f50940 = false;
        C21855 c21855 = this.f50954;
        float f3 = c21855.f69653;
        c21855.m49545(this.f50945, f3, this.f50935, this.f50949, this.f50937);
        float f4 = this.f50942;
        float[] fArr = this.f50937;
        float f5 = f4 != 0.0f ? (f * f4) / fArr[0] : (f2 * this.f50939) / fArr[1];
        if (!Float.isNaN(f5)) {
            f3 += f5 / 3.0f;
        }
        if (f3 != 0.0f) {
            boolean z = f3 != 1.0f;
            int i = this.f50947;
            if (z && (i != 3)) {
                this.f50954.m49542(((double) f3) >= 0.5d ? 1.0f : 0.0f, f5, i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37435() {
        View viewFindViewById;
        int i = this.f50945;
        if (i != -1) {
            C21855 c21855 = this.f50954;
            viewFindViewById = c21855.findViewById(i);
            if (viewFindViewById == null) {
                C18540.m43116(c21855.getContext(), this.f50945);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C23307) {
            C23307 c23307 = (C23307) viewFindViewById;
            c23307.setOnTouchListener(new ViewOnTouchListenerC23126());
            c23307.m52437(new C20142());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m37439() {
        return this.f50934;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m37433() {
        return this.f50941;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37443() {
        return this.f50946;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF m37441(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f50953;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m37437() {
        return this.f50953;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RectF m37430(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f50938;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m37428(float f, float f2) {
        return (f2 * this.f50939) + (f * this.f50942);
    }

    public final String toString() {
        return this.f50942 + " , " + this.f50939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37429() {
        return this.f50948;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37434(float f, float f2) {
        float f3;
        C21855 c21855 = this.f50954;
        float f4 = c21855.f69653;
        if (!this.f50940) {
            this.f50940 = true;
            c21855.m49554(f4);
        }
        float f5 = this.f50935;
        float f6 = this.f50949;
        C21855 c21856 = this.f50954;
        int i = this.f50945;
        float[] fArr = this.f50937;
        c21856.m49545(i, f4, f5, f6, fArr);
        if (Math.abs((this.f50939 * fArr[1]) + (this.f50942 * fArr[0])) < 0.01d) {
            fArr[0] = 0.01f;
            fArr[1] = 0.01f;
        }
        float f7 = this.f50942;
        if (f7 != 0.0f) {
            f3 = (f * f7) / fArr[0];
        } else {
            f3 = (f2 * this.f50939) / fArr[1];
        }
        float fMax = Math.max(Math.min(f4 + f3, 1.0f), 0.0f);
        if (fMax != c21855.f69653) {
            c21855.m49554(fMax);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m37440(float f, float f2) {
        C21855 c21855 = this.f50954;
        c21855.m49545(this.f50945, c21855.f69653, this.f50935, this.f50949, this.f50937);
        float f3 = this.f50942;
        float[] fArr = this.f50937;
        if (f3 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f2 * this.f50939) / fArr[1];
    }
}
