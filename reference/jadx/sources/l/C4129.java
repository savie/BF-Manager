package l;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4129 extends AbstractC0641 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f14000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Method f14005;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Method f14007;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Method f14011;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f14009 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14008 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f14016 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f14001 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f14002 = -1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f14004 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public View f14017 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f14015 = 0.1f;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f14003 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f14018 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f14012 = true;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f14010 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f14014 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public RectF f14013 = new RectF();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public RectF f14006 = new RectF();

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2827(HashMap map) {
        throw null;
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2828(HashSet hashSet) {
    }

    public C4129() {
        this.f2497 = new HashMap();
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2826(Context context, AttributeSet attributeSet) {
        C24267.m54268(this, context.obtainStyledAttributes(attributeSet, C1211.f4443));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13240(RectF rectF, View view, boolean z) {
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
    public final void m13252(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f14004 != -1) {
            if (this.f14017 == null) {
                this.f14017 = ((ViewGroup) view.getParent()).findViewById(this.f14004);
            }
            View view2 = this.f14017;
            boolean z6 = this.f14014;
            RectF rectF = this.f14013;
            m13240(rectF, view2, z6);
            boolean z7 = this.f14014;
            RectF rectF2 = this.f14006;
            m13240(rectF2, view, z7);
            if (rectF.intersect(rectF2)) {
                if (this.f14003) {
                    this.f14003 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f14012) {
                    this.f14012 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f14018 = true;
            } else {
                if (this.f14003) {
                    z = false;
                } else {
                    this.f14003 = true;
                    z = true;
                }
                if (this.f14018) {
                    this.f14018 = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f14012 = true;
                z3 = false;
            }
        } else {
            if (this.f14003) {
                float f6 = this.f14010;
                if ((this.f14000 - f6) * (f - f6) < 0.0f) {
                    this.f14003 = false;
                    z = true;
                }
                if (this.f14018) {
                    f4 = this.f14010;
                    f5 = f - f4;
                    if ((this.f14000 - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f14018 = false;
                        z2 = true;
                    }
                    if (this.f14012) {
                        f2 = this.f14010;
                        f3 = f - f2;
                        if ((this.f14000 - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f14012 = false;
                        }
                        z3 = z4;
                    } else {
                        if (Math.abs(f - this.f14010) > this.f14015) {
                            this.f14012 = true;
                        }
                        z3 = false;
                    }
                    z5 = z2;
                } else if (Math.abs(f - this.f14010) > this.f14015) {
                    this.f14018 = true;
                }
                z2 = false;
                if (this.f14012) {
                    f2 = this.f14010;
                    f3 = f - f2;
                    if ((this.f14000 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f14010) > this.f14015) {
                        this.f14012 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f14010) > this.f14015) {
                this.f14003 = true;
            }
            z = false;
            if (this.f14018) {
                f4 = this.f14010;
                f5 = f - f4;
                if ((this.f14000 - f4) * f5 >= 0.0f) {
                }
                if (this.f14012) {
                    f2 = this.f14010;
                    f3 = f - f2;
                    if ((this.f14000 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                } else {
                    if (Math.abs(f - this.f14010) > this.f14015) {
                        this.f14012 = true;
                    }
                    z3 = false;
                }
                z5 = z2;
            } else if (Math.abs(f - this.f14010) > this.f14015) {
                this.f14018 = true;
            }
            z2 = false;
            if (this.f14012) {
                f2 = this.f14010;
                f3 = f - f2;
                if ((this.f14000 - f2) * f3 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                z3 = z4;
            } else {
                if (Math.abs(f - this.f14010) > this.f14015) {
                    this.f14012 = true;
                }
                z3 = false;
            }
            z5 = z2;
        }
        this.f14000 = f;
        if (z5 || z || z3) {
            ((C21855) view.getParent()).m49543(f, z3, this.f14002);
        }
        if (this.f14008 != -1) {
            view = ((C21855) view.getParent()).findViewById(this.f14008);
        }
        if (z5 && this.f14016 != null) {
            if (this.f14005 == null) {
                try {
                    this.f14005 = view.getClass().getMethod(this.f14016, null);
                } catch (NoSuchMethodException unused) {
                    view.getClass();
                    C18540.m43118(view);
                }
            }
            try {
                this.f14005.invoke(view, null);
            } catch (Exception unused2) {
                view.getClass();
                C18540.m43118(view);
            }
        }
        if (z3 && this.f14001 != null) {
            if (this.f14011 == null) {
                try {
                    this.f14011 = view.getClass().getMethod(this.f14001, null);
                } catch (NoSuchMethodException unused3) {
                    view.getClass();
                    C18540.m43118(view);
                }
            }
            try {
                this.f14011.invoke(view, null);
            } catch (Exception unused4) {
                view.getClass();
                C18540.m43118(view);
            }
        }
        if (!z || this.f14009 == null) {
            return;
        }
        if (this.f14007 == null) {
            try {
                this.f14007 = view.getClass().getMethod(this.f14009, null);
            } catch (NoSuchMethodException unused5) {
                view.getClass();
                C18540.m43118(view);
            }
        }
        try {
            this.f14007.invoke(view, null);
        } catch (Exception unused6) {
            view.getClass();
            C18540.m43118(view);
        }
    }
}
