package l;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17938 extends AbstractC9077 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Method f57373;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f57374;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f57376;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Method f57382;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f57390 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f57383 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f57385 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f57378 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f57388 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57380 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public View f57377 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f57387 = 0.1f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f57381 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f57391 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f57389 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f57384 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f57386 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public RectF f57375 = new RectF();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public RectF f57379 = new RectF();

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11120(HashMap map) {
        throw null;
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo18025(HashSet hashSet) {
    }

    public C17938() {
        this.f30944 = new HashMap();
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11119(Context context, AttributeSet attributeSet) {
        C21466.m48089(this, context.obtainStyledAttributes(attributeSet, C16029.f51901));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41748(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41759(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f57380 != -1) {
            if (this.f57377 == null) {
                this.f57377 = ((ViewGroup) view.getParent()).findViewById(this.f57380);
            }
            View view2 = this.f57377;
            boolean z6 = this.f57386;
            RectF rectF = this.f57375;
            m41748(rectF, view2, z6);
            boolean z7 = this.f57386;
            RectF rectF2 = this.f57379;
            m41748(rectF2, view, z7);
            if (rectF.intersect(rectF2)) {
                if (this.f57381) {
                    this.f57381 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f57389) {
                    this.f57389 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f57391 = true;
            } else {
                if (this.f57381) {
                    z = false;
                } else {
                    this.f57381 = true;
                    z = true;
                }
                if (this.f57391) {
                    this.f57391 = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f57389 = true;
                z3 = false;
            }
        } else {
            if (this.f57381) {
                float f6 = this.f57384;
                if ((this.f57374 - f6) * (f - f6) < 0.0f) {
                    this.f57381 = false;
                    z = true;
                }
                if (this.f57391) {
                    f4 = this.f57384;
                    f5 = f - f4;
                    if ((this.f57374 - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f57391 = false;
                        z2 = true;
                    }
                    if (this.f57389) {
                        f2 = this.f57384;
                        f3 = f - f2;
                        if ((this.f57374 - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f57389 = false;
                        }
                        z3 = z4;
                    } else {
                        if (Math.abs(f - this.f57384) > this.f57387) {
                            this.f57389 = true;
                        }
                        z3 = false;
                    }
                    z5 = z2;
                } else if (Math.abs(f - this.f57384) > this.f57387) {
                    this.f57391 = true;
                }
                z2 = false;
                if (this.f57389) {
                    f2 = this.f57384;
                    f3 = f - f2;
                    if ((this.f57374 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f57384) > this.f57387) {
                        this.f57389 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f57384) > this.f57387) {
                this.f57381 = true;
            }
            z = false;
            if (this.f57391) {
                f4 = this.f57384;
                f5 = f - f4;
                if ((this.f57374 - f4) * f5 >= 0.0f) {
                }
                if (this.f57389) {
                    f2 = this.f57384;
                    f3 = f - f2;
                    if ((this.f57374 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f57384) > this.f57387) {
                        this.f57389 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f57384) > this.f57387) {
                this.f57391 = true;
            }
            z2 = false;
            if (this.f57389) {
                f2 = this.f57384;
                f3 = f - f2;
                if ((this.f57374 - f2) * f3 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                z3 = z4;
            } else {
                if (Math.abs(f - this.f57384) > this.f57387) {
                    this.f57389 = true;
                }
                z3 = false;
            }
            z5 = z2;
        }
        this.f57374 = f;
        if (z5 || z || z3) {
            ((C10884) view.getParent()).m27278(f, z3, this.f57388);
        }
        if (this.f57383 != -1) {
            view = ((C10884) view.getParent()).findViewById(this.f57383);
        }
        if (z5 && this.f57385 != null) {
            if (this.f57376 == null) {
                try {
                    this.f57376 = view.getClass().getMethod(this.f57385, null);
                } catch (NoSuchMethodException unused) {
                    view.getClass();
                    C19660.m44790(view);
                }
            }
            try {
                this.f57376.invoke(view, null);
            } catch (Exception unused2) {
                view.getClass();
                C19660.m44790(view);
            }
        }
        if (z3 && this.f57378 != null) {
            if (this.f57382 == null) {
                try {
                    this.f57382 = view.getClass().getMethod(this.f57378, null);
                } catch (NoSuchMethodException unused3) {
                    view.getClass();
                    C19660.m44790(view);
                }
            }
            try {
                this.f57382.invoke(view, null);
            } catch (Exception unused4) {
                view.getClass();
                C19660.m44790(view);
            }
        }
        if (!z || this.f57390 == null) {
            return;
        }
        if (this.f57373 == null) {
            try {
                this.f57373 = view.getClass().getMethod(this.f57390, null);
            } catch (NoSuchMethodException unused5) {
                view.getClass();
                C19660.m44790(view);
            }
        }
        try {
            this.f57373.invoke(view, null);
        } catch (Exception unused6) {
            view.getClass();
            C19660.m44790(view);
        }
    }
}
