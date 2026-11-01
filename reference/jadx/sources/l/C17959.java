package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C17959 extends C10199 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static Field f57439;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Method f57440;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Class f57441;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f57442;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Field f57443;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13954 f57444;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final WindowInsets f57445;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13954 f57446;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13954[] f57447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15844 f57448;

    public C17959(C15844 c15844, WindowInsets windowInsets) {
        super(c15844);
        this.f57444 = null;
        this.f57445 = windowInsets;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ᩺ */
    public boolean mo25985() {
        return this.f57445.isRound();
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public C13954 mo22858(int i) {
        return m41785(i, false);
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ܰ */
    public C13954 mo22861(int i) {
        return m41785(i, true);
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۨ */
    public boolean mo22860(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0 && !m41789(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C13954 m41785(int i, boolean z) {
        C13954 c13954M33795 = C13954.f45911;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c13954M33795 = C13954.m33795(c13954M33795, m41790(i2, z));
            }
        }
        return c13954M33795;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13954 m41790(int i, boolean z) {
        C13954 c13954M37680;
        int i2;
        C9203 c9203Mo21289;
        if (i == 1) {
            if (z) {
                return C13954.m33793(0, Math.max(m41787().f45912, mo25982().f45912), 0, 0);
            }
            return C13954.m33793(0, mo25982().f45912, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C13954 c13954M41787 = m41787();
                C13954 c13954Mo25984 = mo25984();
                return C13954.m33793(Math.max(c13954M41787.f45915, c13954Mo25984.f45915), 0, Math.max(c13954M41787.f45914, c13954Mo25984.f45914), Math.max(c13954M41787.f45913, c13954Mo25984.f45913));
            }
            C13954 c13954Mo25982 = mo25982();
            C15844 c15844 = this.f57448;
            c13954M37680 = c15844 != null ? c15844.m37680() : null;
            int iMin = c13954Mo25982.f45913;
            if (c13954M37680 != null) {
                iMin = Math.min(iMin, c13954M37680.f45913);
            }
            return C13954.m33793(c13954Mo25982.f45915, 0, c13954Mo25982.f45914, iMin);
        }
        C13954 c13954 = C13954.f45911;
        if (i == 8) {
            C13954[] c13954Arr = this.f57447;
            c13954M37680 = c13954Arr != null ? c13954Arr[C7376.m19642(8)] : null;
            if (c13954M37680 != null) {
                return c13954M37680;
            }
            C13954 c13954Mo25983 = mo25982();
            C13954 c13954M41788 = m41787();
            int i3 = c13954Mo25983.f45913;
            if (i3 > c13954M41788.f45913) {
                return C13954.m33793(0, 0, 0, i3);
            }
            C13954 c13955 = this.f57446;
            return (c13955 == null || c13955.equals(c13954) || (i2 = this.f57446.f45913) <= c13954M41788.f45913) ? c13954 : C13954.m33793(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo25973();
        }
        if (i == 32) {
            return mo25979();
        }
        if (i == 64) {
            return mo25974();
        }
        if (i != 128) {
            return c13954;
        }
        C15844 c15845 = this.f57448;
        if (c15845 != null) {
            c9203Mo21289 = c15845.m37671();
        } else {
            c9203Mo21289 = mo21289();
        }
        return c9203Mo21289 != null ? C13954.m33793(c9203Mo21289.m23669(), c9203Mo21289.m23666(), c9203Mo21289.m23668(), c9203Mo21289.m23667()) : c13954;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m41789(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m41790(i, false).equals(C13954.f45911);
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۬ */
    public final C13954 mo25982() {
        if (this.f57444 == null) {
            WindowInsets windowInsets = this.f57445;
            this.f57444 = C13954.m33793(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f57444;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public C15844 mo25975(int i, int i2, int i3, int i4) {
        C1025 c1025 = new C1025(C15844.m37669(null, this.f57445));
        c1025.m3872(C15844.m37668(mo25982(), i, i2, i3, i4));
        c1025.m3871(C15844.m37668(mo25984(), i, i2, i3, i4));
        return c1025.m3869();
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public void mo25977(C15844 c15844) {
        this.f57448 = c15844;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m41791(C13954 c13954) {
        this.f57446 = c13954;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private C13954 m41787() {
        C15844 c15844 = this.f57448;
        if (c15844 != null) {
            return c15844.m37680();
        }
        return C13954.f45911;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public void mo22859(View view) {
        C13954 c13954M41786 = m41786(view);
        if (c13954M41786 == null) {
            c13954M41786 = C13954.f45911;
        }
        m41791(c13954M41786);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C13954 m41786(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f57442) {
            m41788();
        }
        Method method = f57440;
        if (method != null && f57441 != null && f57443 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f57443.get(f57439.get(objInvoke));
                    if (rect != null) {
                        return C13954.m33793(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public void mo25978(C13954[] c13954Arr) {
        this.f57447 = c13954Arr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m41788() {
        try {
            f57440 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f57441 = cls;
            f57443 = cls.getDeclaredField("mVisibleInsets");
            f57439 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f57443.setAccessible(true);
            f57439.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f57442 = true;
    }

    @Override // l.C10199
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return C13638.equals(this.f57446, ((C17959) obj).f57446);
        }
        return false;
    }
}
