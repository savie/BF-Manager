package l;

import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2877 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static EnumC17465 f10854 = EnumC17465.values()[C16737.f53607.getInt("fmst", EnumC17465.PREFER_SHOW_ICON_ONLY.ordinal())];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public View f10855;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12418 f10856;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12527 f10859;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC9229 f10862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10857 = 3500;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Rect f10861 = new Rect();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f10860 = new int[2];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14168 f10858 = new C14168(0);

    public C2877(View view) {
        this.f10855 = view;
        this.f10856 = new C12418(view.getContext()).setDefaultShowAsAction(1);
        C12527 c12527 = new C12527(view.getContext(), view);
        this.f10859 = c12527;
        EnumC17465 enumC17465 = f10854;
        EnumC17465 enumC17466 = EnumC17465.PREFER_SHOW_TITLE_ONLY;
        if (enumC17465 == enumC17466) {
            c12527.m31129(enumC17466, enumC17466);
        } else {
            c12527.m31129(f10854, EnumC17465.PREFER_SHOW_ALL);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8673(int i) {
        this.f10857 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8670(C23648 c23648) {
        C12527 c12527 = this.f10859;
        if (c23648 == null) {
            c12527.m31130((C23340) null);
        } else {
            c12527.m31130(new C23340(this, c23648));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8669(InterfaceC9229 interfaceC9229) {
        this.f10862 = interfaceC9229;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m8663() {
        this.f10856.clear();
        C12527 c12527 = this.f10859;
        c12527.m31125();
        c12527.m31131();
        EnumC17465 enumC17465 = f10854;
        EnumC17465 enumC17466 = EnumC17465.PREFER_SHOW_TITLE_ONLY;
        if (enumC17465 == enumC17466) {
            c12527.m31129(enumC17466, enumC17466);
        } else {
            c12527.m31129(f10854, EnumC17465.PREFER_SHOW_ALL);
        }
        m8666(1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8661(EnumC17465 enumC17465) {
        f10854 = enumC17465;
        C16737.f53607.edit().mo4065(enumC17465.ordinal(), "fmst").apply();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC17465 m8662() {
        return f10854;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8667(int i) {
        new C5700(this.f10856.add(0, i, 0, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5700 m8664(C14894 c14894, int i) {
        return new C5700(this.f10856.add(0, 0, i, c14894));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m8671() {
        return this.f10856.size() == 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m8672() {
        return this.f10859.m31132();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8666(float f) {
        this.f10859.m31126(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8668(int i, int i2) {
        ArrayList arrayListM8659 = m8659(this.f10856);
        C23846.sort(arrayListM8659, this.f10858);
        if (arrayListM8659.isEmpty()) {
            return;
        }
        Rect rect = this.f10861;
        rect.set(i, i2, i, i2);
        View view = this.f10855;
        int[] iArr = this.f10860;
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        MenuItemOnMenuItemClickListenerC10640 menuItemOnMenuItemClickListenerC10640 = new MenuItemOnMenuItemClickListenerC10640(this);
        C12527 c12527 = this.f10859;
        c12527.m31128(arrayListM8659, menuItemOnMenuItemClickListenerC10640, rect);
        int i3 = this.f10857;
        if (i3 > 0) {
            c12527.m31127(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8660(C2877 c2877, MenuItem menuItem) {
        InterfaceC9229 interfaceC9229 = c2877.f10862;
        if (interfaceC9229 != null) {
            interfaceC9229.onMenuItemClick(menuItem);
        }
        c2877.f10859.m31125();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8659(Menu menu) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(m8659(subMenu));
                } else {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8665() {
        this.f10859.m31125();
    }
}
