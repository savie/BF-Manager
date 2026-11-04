package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C17401 extends C12180 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field f56572;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Class f56573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f56574;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f56575;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Field f56576;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13275[] f56577;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13275 f56578;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3977 f56579;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13275 f56580;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WindowInsets f56581;

    public C17401(C3977 c3977, WindowInsets windowInsets) {
        super(c3977);
        this.f56578 = null;
        this.f56581 = windowInsets;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo30454() {
        return this.f56581.isRound();
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public C13275 mo30442(int i) {
        return m40868(i, false);
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ᩷ */
    public C13275 mo30452(int i) {
        return m40868(i, true);
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۤ */
    public boolean mo30448(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0 && !m40872(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C13275 m40868(int i, boolean z) {
        C13275 c13275M32821 = C13275.f42404;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c13275M32821 = C13275.m32821(c13275M32821, m40870(i2, z));
            }
        }
        return c13275M32821;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13275 m40870(int i, boolean z) {
        C13275 c13275M12830;
        int i2;
        C6279 c6279Mo30453;
        if (i == 1) {
            if (z) {
                return C13275.m32819(0, Math.max(m40866().f42408, mo30446().f42408), 0, 0);
            }
            return C13275.m32819(0, mo30446().f42408, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C13275 c13275M40866 = m40866();
                C13275 c13275Mo30450 = mo30450();
                return C13275.m32819(Math.max(c13275M40866.f42407, c13275Mo30450.f42407), 0, Math.max(c13275M40866.f42406, c13275Mo30450.f42406), Math.max(c13275M40866.f42405, c13275Mo30450.f42405));
            }
            C13275 c13275Mo30446 = mo30446();
            C3977 c3977 = this.f56579;
            c13275M12830 = c3977 != null ? c3977.m12830() : null;
            int iMin = c13275Mo30446.f42405;
            if (c13275M12830 != null) {
                iMin = Math.min(iMin, c13275M12830.f42405);
            }
            return C13275.m32819(c13275Mo30446.f42407, 0, c13275Mo30446.f42406, iMin);
        }
        C13275 c13275 = C13275.f42404;
        if (i == 8) {
            C13275[] c13275Arr = this.f56577;
            c13275M12830 = c13275Arr != null ? c13275Arr[C6215.m17849(8)] : null;
            if (c13275M12830 != null) {
                return c13275M12830;
            }
            C13275 c13275Mo30447 = mo30446();
            C13275 c13275M40867 = m40866();
            int i3 = c13275Mo30447.f42405;
            if (i3 > c13275M40867.f42405) {
                return C13275.m32819(0, 0, 0, i3);
            }
            C13275 c13276 = this.f56580;
            return (c13276 == null || c13276.equals(c13275) || (i2 = this.f56580.f42405) <= c13275M40867.f42405) ? c13275 : C13275.m32819(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo10578();
        }
        if (i == 32) {
            return mo10579();
        }
        if (i == 64) {
            return mo10575();
        }
        if (i != 128) {
            return c13275;
        }
        C3977 c3978 = this.f56579;
        if (c3978 != null) {
            c6279Mo30453 = c3978.m12833();
        } else {
            c6279Mo30453 = mo30453();
        }
        return c6279Mo30453 != null ? C13275.m32819(c6279Mo30453.m17954(), c6279Mo30453.m17955(), c6279Mo30453.m17953(), c6279Mo30453.m17952()) : c13275;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m40872(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m40870(i, false).equals(C13275.f42404);
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۚ */
    public final C13275 mo30446() {
        if (this.f56578 == null) {
            WindowInsets windowInsets = this.f56581;
            this.f56578 = C13275.m32819(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f56578;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public C3977 mo10576(int i, int i2, int i3, int i4) {
        C15163 c15163 = new C15163(C3977.m12812(null, this.f56581));
        c15163.m36480(C3977.m12813(mo30446(), i, i2, i3, i4));
        c15163.m36479(C3977.m12813(mo30450(), i, i2, i3, i4));
        return c15163.m36477();
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public void mo30444(C3977 c3977) {
        this.f56579 = c3977;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m40871(C13275 c13275) {
        this.f56580 = c13275;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private C13275 m40866() {
        C3977 c3977 = this.f56579;
        if (c3977 != null) {
            return c3977.m12830();
        }
        return C13275.f42404;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public void mo30443(View view) {
        C13275 c13275M40869 = m40869(view);
        if (c13275M40869 == null) {
            c13275M40869 = C13275.f42404;
        }
        m40871(c13275M40869);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C13275 m40869(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f56575) {
            m40867();
        }
        Method method = f56574;
        if (method != null && f56573 != null && f56576 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f56576.get(f56572.get(objInvoke));
                    if (rect != null) {
                        return C13275.m32819(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public void mo30445(C13275[] c13275Arr) {
        this.f56577 = c13275Arr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m40867() {
        try {
            f56574 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f56573 = cls;
            f56576 = cls.getDeclaredField("mVisibleInsets");
            f56572 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f56576.setAccessible(true);
            f56572.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f56575 = true;
    }

    @Override // l.C12180
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return C17359.equals(this.f56580, ((C17401) obj).f56580);
        }
        return false;
    }
}
