package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public class C6919 extends AbstractC8956 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23262;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9186 f23263;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23264;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9186 f23265;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C20409 f23266;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23267;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23268;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C9186 f23269;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f23270;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9186 f23271;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9186 f23272;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23273;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23274;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23275;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23276;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9186 f23277;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23279;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9186 f23280;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23281;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23282;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23283;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f23284;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9186 f23285;

    public C6919() {
        Boolean bool = Boolean.FALSE;
        this.f23273 = new C9186(bool);
        this.f23279 = true;
        this.f23280 = new C9186(bool);
        this.f23271 = new C9186(bool);
        this.f23263 = new C9186(bool);
        this.f23278 = new C9186(bool);
        this.f23272 = new C9186(bool);
        this.f23284 = new C9186(bool);
        this.f23282 = new C9186(bool);
        this.f23268 = new C9186(bool);
        this.f23265 = new C9186(bool);
        this.f23281 = new C9186(Boolean.TRUE);
        this.f23262 = new C9186(bool);
        this.f23277 = new C9186(bool);
        this.f23264 = new C9186(bool);
        this.f23269 = new C9186(bool);
        this.f23285 = new C9186(bool);
        this.f23276 = new C9186();
        this.f23267 = new C9186(0);
        this.f23283 = new C9186();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18546(C20409 c20409) {
        C20409 c204010 = this.f23266;
        if (c204010 == c20409) {
            return;
        }
        boolean z = c204010 != null;
        this.f23266 = c20409;
        this.f23275 = false;
        this.f23270 = false;
        this.f23280.mo23642(Boolean.valueOf(this.f23274));
        if (z) {
            this.f23279 = true;
            this.f23273.mo23642(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18553(C20409 c20409, boolean z) {
        if (this.f23266 == c20409) {
            if (!z) {
                this.f23275 = false;
            }
            this.f23270 = false;
            this.f23280.mo23642(Boolean.valueOf(this.f23274));
            this.f23279 = true;
            this.f23273.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18560(C20409 c20409) {
        if (this.f23266 == c20409 && m18540()) {
            this.f23270 = true;
            Boolean bool = Boolean.TRUE;
            this.f23273.mo23642(bool);
            this.f23280.mo23642(bool);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18567(C20409 c20409) {
        if (this.f23266 == c20409) {
            this.f23275 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18549(C20409 c20409, View view, C6111 c6111) {
        this.f23273.m44959(c20409.getViewLifecycleOwner(), new C13270(this, c6111, view, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18545(C15471 c15471) {
        this.f23273.m44961((InterfaceC10597) c15471);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18566(C15471 c15471) {
        this.f23273.m44963((InterfaceC10597) c15471);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m18540() {
        return this.f23275 || ((Boolean) this.f23273.m44956()).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18550(C20409 c20409, ProgressBar progressBar) {
        this.f23280.m44959(c20409.getViewLifecycleOwner(), new C22442(0, progressBar));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18555(boolean z) {
        this.f23274 = z;
        this.f23280.mo23642(Boolean.valueOf(z || this.f23270));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18554(C20409 c20409, MenuItem... menuItemArr) {
        this.f23271.m44959(c20409.getViewLifecycleOwner(), new C5508(0, menuItemArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18571(C20409 c20409, final MenuItem... menuItemArr) {
        this.f23271.m44959(c20409.getViewLifecycleOwner(), new InterfaceC10597() { // from class: l.ۘᩳۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : menuItemArr) {
                    menuItem.setVisible(bool.booleanValue());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18552(C20409 c20409, C3869 c3869) {
        this.f23271.m44959(c20409.getViewLifecycleOwner(), c3869);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m18537(boolean z) {
        this.f23271.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18556(C20409 c20409, MenuItem menuItem) {
        m18535(c20409, menuItem, this.f23263);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m18578(boolean z) {
        this.f23263.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m18541(C20409 c20409, MenuItem menuItem) {
        m18535(c20409, menuItem, this.f23278);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18576(boolean z) {
        this.f23278.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18568(C20409 c20409, MenuItem menuItem) {
        m18535(c20409, menuItem, this.f23272);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18562(boolean z) {
        this.f23272.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m18563(C20409 c20409, MenuItem menuItem) {
        m18535(c20409, menuItem, this.f23284);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m18573(boolean z) {
        this.f23284.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m18558(C20409 c20409, MenuItem menuItem) {
        m18534(c20409, menuItem, this.f23282);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18574(boolean z) {
        C9186 c9186 = this.f23282;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m18577(C20409 c20409, MenuItem menuItem) {
        m18534(c20409, menuItem, this.f23268);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m18559(boolean z) {
        C9186 c9186 = this.f23268;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18548(C20409 c20409, final MenuItem menuItem, final MenuItem menuItem2) {
        InterfaceC10597 interfaceC10597 = new InterfaceC10597() { // from class: l.֨ᩳۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C6919.m18532(this.f5508, menuItem, menuItem2);
            }
        };
        this.f23265.m44959(c20409.getViewLifecycleOwner(), interfaceC10597);
        this.f23281.m44959(c20409.getViewLifecycleOwner(), interfaceC10597);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18532(C6919 c6919, MenuItem menuItem, MenuItem menuItem2) {
        C9186 c9186 = c6919.f23281;
        C9186 c9187 = c6919.f23265;
        boolean z = false;
        boolean z2 = ((Boolean) c9187.m44956()).booleanValue() && ((Boolean) c9186.m44956()).booleanValue();
        if (menuItem.isVisible() != z2) {
            menuItem.setVisible(z2);
        }
        if (((Boolean) c9187.m44956()).booleanValue() && !((Boolean) c9186.m44956()).booleanValue()) {
            z = true;
        }
        if (menuItem2.isVisible() != z) {
            menuItem2.setVisible(z);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m18564(boolean z) {
        this.f23265.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18575(boolean z) {
        this.f23281.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m18536(C20409 c20409, MenuItem menuItem) {
        m18534(c20409, menuItem, this.f23262);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m18579(boolean z) {
        C9186 c9186 = this.f23262;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18557(boolean z) {
        C9186 c9186 = this.f23277;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18569(C20409 c20409, MenuItem menuItem, MenuItem menuItem2) {
        this.f23264.m44959(c20409.getViewLifecycleOwner(), new C2685(0, menuItem, menuItem2));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m18542(boolean z) {
        C9186 c9186 = this.f23264;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18547(C20409 c20409, MenuItem menuItem) {
        m18534(c20409, menuItem, this.f23269);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18572(boolean z) {
        C9186 c9186 = this.f23269;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18561(C20409 c20409, MenuItem menuItem) {
        m18534(c20409, menuItem, this.f23285);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18539(boolean z) {
        C9186 c9186 = this.f23285;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18551(C20409 c20409, TextView textView) {
        InterfaceC1423 viewLifecycleOwner = c20409.getViewLifecycleOwner();
        C13638.requireNonNull(textView);
        this.f23276.m44959(viewLifecycleOwner, new C22092(1, textView));
        this.f23267.m44959(c20409.getViewLifecycleOwner(), new C3765(textView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18544(String str) {
        C9186 c9186 = this.f23276;
        if (C13638.equals(c9186.m44956(), str)) {
            return;
        }
        c9186.mo23642(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18543(int i) {
        C9186 c9186 = this.f23267;
        if (((Integer) c9186.m44956()).intValue() != i) {
            c9186.mo23642(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18570(C20409 c20409, TextView textView) {
        InterfaceC1423 viewLifecycleOwner = c20409.getViewLifecycleOwner();
        C13638.requireNonNull(textView);
        this.f23283.m44959(viewLifecycleOwner, new C22092(1, textView));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18565(String str) {
        C9186 c9186 = this.f23283;
        if (C13638.equals(c9186.m44956(), str)) {
            return;
        }
        c9186.mo23642(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m18535(C20409 c20409, MenuItem menuItem, C9186 c9186) {
        InterfaceC1423 viewLifecycleOwner = c20409.getViewLifecycleOwner();
        C13638.requireNonNull(menuItem);
        c9186.m44959(viewLifecycleOwner, new C7905(menuItem));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18534(C20409 c20409, MenuItem menuItem, C9186 c9186) {
        InterfaceC1423 viewLifecycleOwner = c20409.getViewLifecycleOwner();
        C13638.requireNonNull(menuItem);
        c9186.m44959(viewLifecycleOwner, new C11528(0, menuItem));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18538(C20409 c20409, MenuItem menuItem) {
        InterfaceC1423 viewLifecycleOwner = c20409.getViewLifecycleOwner();
        C13638.requireNonNull(menuItem);
        this.f23277.m44959(viewLifecycleOwner, new C20137(1, menuItem));
    }
}
