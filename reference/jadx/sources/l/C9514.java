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

/* JADX INFO: renamed from: l.ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9514 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f32166;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f32167;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f32168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f32170;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f32171;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f32172;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f32173;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f32174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f32175;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f32178;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f32179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f32180;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f32181;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f32182;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32183;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32184;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f32185;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10884 f32186;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final float[][] f32165 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final float[][] f32164 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32176 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f32169 = new float[2];

    public C9514(Context context, C10884 c10884, XmlResourceParser xmlResourceParser) {
        this.f32181 = 0;
        this.f32183 = 0;
        this.f32184 = 0;
        this.f32180 = -1;
        this.f32172 = -1;
        this.f32177 = -1;
        this.f32182 = 0.5f;
        this.f32173 = 0.5f;
        this.f32174 = 0.0f;
        this.f32175 = 1.0f;
        this.f32171 = 4.0f;
        this.f32168 = 1.2f;
        this.f32179 = true;
        this.f32178 = 1.0f;
        this.f32170 = 0;
        this.f32167 = 10.0f;
        this.f32186 = c10884;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51883);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.f32180 = typedArrayObtainStyledAttributes.getResourceId(index, this.f32180);
            } else if (index == 10) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f32181);
                this.f32181 = i2;
                float[] fArr = f32165[i2];
                this.f32173 = fArr[0];
                this.f32182 = fArr[1];
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f32183);
                this.f32183 = i3;
                float[] fArr2 = f32164[i3];
                this.f32174 = fArr2[0];
                this.f32175 = fArr2[1];
            } else if (index == 5) {
                this.f32171 = typedArrayObtainStyledAttributes.getFloat(index, this.f32171);
            } else if (index == 4) {
                this.f32168 = typedArrayObtainStyledAttributes.getFloat(index, this.f32168);
            } else if (index == 6) {
                this.f32179 = typedArrayObtainStyledAttributes.getBoolean(index, this.f32179);
            } else if (index == 1) {
                this.f32178 = typedArrayObtainStyledAttributes.getFloat(index, this.f32178);
            } else if (index == 2) {
                this.f32167 = typedArrayObtainStyledAttributes.getFloat(index, this.f32167);
            } else if (index == 11) {
                this.f32172 = typedArrayObtainStyledAttributes.getResourceId(index, this.f32172);
            } else if (index == 8) {
                this.f32184 = typedArrayObtainStyledAttributes.getInt(index, this.f32184);
            } else if (index == 7) {
                this.f32170 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f32177 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24354(boolean z) {
        float[][] fArr = f32165;
        float[][] fArr2 = f32164;
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
        float[] fArr3 = fArr[this.f32181];
        this.f32173 = fArr3[0];
        this.f32182 = fArr3[1];
        float[] fArr4 = fArr2[this.f32183];
        this.f32174 = fArr4[0];
        this.f32175 = fArr4[1];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24363(float f, float f2) {
        this.f32185 = f;
        this.f32166 = f2;
        this.f32176 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24353(MotionEvent motionEvent, InterfaceC0299 interfaceC0299) {
        int i;
        C10884 c10884;
        char c;
        float f;
        C16528 c16528 = (C16528) interfaceC0299;
        VelocityTracker velocityTracker = c16528.f53100;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32185 = motionEvent.getRawX();
            this.f32166 = motionEvent.getRawY();
            this.f32176 = false;
            return;
        }
        float[] fArr = this.f32169;
        C10884 c10885 = this.f32186;
        if (action == 1) {
            this.f32176 = false;
            VelocityTracker velocityTracker2 = c16528.f53100;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = c16528.f53100;
            float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
            VelocityTracker velocityTracker4 = c16528.f53100;
            float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
            float f2 = c10885.f37028;
            int i2 = this.f32180;
            if (i2 != -1) {
                c10885.m27280(i2, f2, this.f32173, this.f32182, fArr);
            } else {
                float fMin = Math.min(c10885.getWidth(), c10885.getHeight());
                fArr[1] = this.f32175 * fMin;
                fArr[0] = fMin * this.f32174;
            }
            float f3 = this.f32174 != 0.0f ? xVelocity / fArr[0] : yVelocity / fArr[1];
            float f4 = !Float.isNaN(f3) ? (f3 / 3.0f) + f2 : f2;
            if (f4 == 0.0f || f4 == 1.0f || (i = this.f32184) == 3) {
                if (0.0f >= f4 || 1.0f <= f4) {
                    c10885.m27282(EnumC5944.FINISHED);
                    return;
                }
                return;
            }
            c10885.m27277(((double) f4) < 0.5d ? 0.0f : 1.0f, f3, i);
            if (0.0f >= f2 || 1.0f <= f2) {
                c10885.m27282(EnumC5944.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f32166;
        float rawX = motionEvent.getRawX() - this.f32185;
        if (Math.abs((this.f32175 * rawY) + (this.f32174 * rawX)) > this.f32167 || this.f32176) {
            float f5 = c10885.f37028;
            if (!this.f32176) {
                this.f32176 = true;
                c10885.m27289(f5);
            }
            int i3 = this.f32180;
            if (i3 != -1) {
                c = 1;
                c10884 = c10885;
                this.f32186.m27280(i3, f5, this.f32173, this.f32182, fArr);
            } else {
                c10884 = c10885;
                c = 1;
                float fMin2 = Math.min(c10884.getWidth(), c10884.getHeight());
                fArr[1] = this.f32175 * fMin2;
                fArr[0] = fMin2 * this.f32174;
            }
            if (Math.abs(((this.f32175 * fArr[c]) + (this.f32174 * fArr[0])) * this.f32178) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[c] = 0.01f;
            }
            if (this.f32174 != 0.0f) {
                f = rawX / fArr[0];
            } else {
                f = rawY / fArr[c];
            }
            float fMax = Math.max(Math.min(f5 + f, 1.0f), 0.0f);
            if (fMax != c10884.f37028) {
                c10884.m27289(fMax);
                VelocityTracker velocityTracker5 = c16528.f53100;
                if (velocityTracker5 != null) {
                    velocityTracker5.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker6 = c16528.f53100;
                float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                VelocityTracker velocityTracker7 = c16528.f53100;
                c10884.f37037 = this.f32174 != 0.0f ? xVelocity2 / fArr[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / fArr[c];
            } else {
                c10884.f37037 = 0.0f;
            }
            this.f32185 = motionEvent.getRawX();
            this.f32166 = motionEvent.getRawY();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24356(float f, float f2) {
        this.f32185 = f;
        this.f32166 = f2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24348(float f, float f2) {
        this.f32176 = false;
        C10884 c10884 = this.f32186;
        float f3 = c10884.f37028;
        c10884.m27280(this.f32180, f3, this.f32173, this.f32182, this.f32169);
        float f4 = this.f32174;
        float[] fArr = this.f32169;
        float f5 = f4 != 0.0f ? (f * f4) / fArr[0] : (f2 * this.f32175) / fArr[1];
        if (!Float.isNaN(f5)) {
            f3 += f5 / 3.0f;
        }
        if (f3 != 0.0f) {
            boolean z = f3 != 1.0f;
            int i = this.f32184;
            if (z && (i != 3)) {
                this.f32186.m27277(((double) f3) >= 0.5d ? 1.0f : 0.0f, f5, i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24362() {
        View viewFindViewById;
        int i = this.f32180;
        if (i != -1) {
            C10884 c10884 = this.f32186;
            viewFindViewById = c10884.findViewById(i);
            if (viewFindViewById == null) {
                C19660.m44788(c10884.getContext(), this.f32180);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C19229) {
            C19229 c19229 = (C19229) viewFindViewById;
            c19229.setOnTouchListener(new ViewOnTouchListenerC14453());
            c19229.m44177(new C1751());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m24359() {
        return this.f32168;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m24357() {
        return this.f32171;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m24349() {
        return this.f32179;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF m24361(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f32172;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m24355() {
        return this.f32172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RectF m24352(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f32177;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m24350(float f, float f2) {
        return (f2 * this.f32175) + (f * this.f32174);
    }

    public final String toString() {
        return this.f32174 + " , " + this.f32175;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24351() {
        return this.f32170;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24358(float f, float f2) {
        float f3;
        C10884 c10884 = this.f32186;
        float f4 = c10884.f37028;
        if (!this.f32176) {
            this.f32176 = true;
            c10884.m27289(f4);
        }
        float f5 = this.f32173;
        float f6 = this.f32182;
        C10884 c10885 = this.f32186;
        int i = this.f32180;
        float[] fArr = this.f32169;
        c10885.m27280(i, f4, f5, f6, fArr);
        if (Math.abs((this.f32175 * fArr[1]) + (this.f32174 * fArr[0])) < 0.01d) {
            fArr[0] = 0.01f;
            fArr[1] = 0.01f;
        }
        float f7 = this.f32174;
        if (f7 != 0.0f) {
            f3 = (f * f7) / fArr[0];
        } else {
            f3 = (f2 * this.f32175) / fArr[1];
        }
        float fMax = Math.max(Math.min(f4 + f3, 1.0f), 0.0f);
        if (fMax != c10884.f37028) {
            c10884.m27289(fMax);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m24360(float f, float f2) {
        C10884 c10884 = this.f32186;
        c10884.m27280(this.f32180, c10884.f37028, this.f32173, this.f32182, this.f32169);
        float f3 = this.f32174;
        float[] fArr = this.f32169;
        if (f3 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f2 * this.f32175) / fArr[1];
    }
}
