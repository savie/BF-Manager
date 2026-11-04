package l;

import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20003 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8815 f64271 = EnumC8815.values()[C21576.f68931.getInt("fmst", EnumC8815.PREFER_SHOW_ICON_ONLY.ordinal())];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2849 f64274;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f64275;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22987 f64276;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9898 f64279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64272 = 3500;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Rect f64278 = new Rect();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f64273 = new int[2];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22241 f64277 = new C22241();

    public C20003(View view) {
        this.f64275 = view;
        this.f64279 = new C9898(view.getContext()).setDefaultShowAsAction(1);
        C2849 c2849 = new C2849(view.getContext(), view);
        this.f64274 = c2849;
        EnumC8815 enumC8815 = f64271;
        EnumC8815 enumC8816 = EnumC8815.PREFER_SHOW_TITLE_ONLY;
        if (enumC8815 == enumC8816) {
            c2849.m9404(enumC8816, enumC8816);
        } else {
            c2849.m9404(f64271, EnumC8815.PREFER_SHOW_ALL);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46011(int i) {
        this.f64272 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46007(C0134 c0134) {
        C2849 c2849 = this.f64274;
        if (c0134 == null) {
            c2849.m9403((C5087) null);
        } else {
            c2849.m9403(new C5087(this, c0134));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46008(InterfaceC22987 interfaceC22987) {
        this.f64276 = interfaceC22987;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46012() {
        this.f64279.clear();
        C2849 c2849 = this.f64274;
        c2849.m9399();
        c2849.m9406();
        EnumC8815 enumC8815 = f64271;
        EnumC8815 enumC8816 = EnumC8815.PREFER_SHOW_TITLE_ONLY;
        if (enumC8815 == enumC8816) {
            c2849.m9404(enumC8816, enumC8816);
        } else {
            c2849.m9404(f64271, EnumC8815.PREFER_SHOW_ALL);
        }
        m46004(1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45999(EnumC8815 enumC8815) {
        f64271 = enumC8815;
        C21576.f68931.edit().mo3486(enumC8815.ordinal(), "fmst").apply();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static EnumC8815 m46001() {
        return f64271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46005(int i) {
        new C9978(this.f64279.add(0, i, 0, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9978 m46002(C10549 c10549, int i) {
        return new C9978(this.f64279.add(0, 0, i, c10549));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m46009() {
        return this.f64279.size() == 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46010() {
        return this.f64274.m9407();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46004(float f) {
        this.f64274.m9400(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46006(int i, int i2) {
        ArrayList arrayListM45998 = m45998(this.f64279);
        C12884.sort(arrayListM45998, this.f64277);
        if (arrayListM45998.isEmpty()) {
            return;
        }
        Rect rect = this.f64278;
        rect.set(i, i2, i, i2);
        View view = this.f64275;
        int[] iArr = this.f64273;
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: l.۬۟ᩴ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C20003.m46000(this.f43511, menuItem);
                return true;
            }
        };
        C2849 c2849 = this.f64274;
        c2849.m9402(arrayListM45998, onMenuItemClickListener, rect);
        int i3 = this.f64272;
        if (i3 > 0) {
            c2849.m9401(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46000(C20003 c20003, MenuItem menuItem) {
        InterfaceC22987 interfaceC22987 = c20003.f64276;
        if (interfaceC22987 != null) {
            interfaceC22987.onMenuItemClick(menuItem);
        }
        c20003.f64274.m9399();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45998(Menu menu) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(m45998(subMenu));
                } else {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46003() {
        this.f64274.m9399();
    }
}
