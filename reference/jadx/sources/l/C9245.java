package l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9245 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public char f31407;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC5674 f31408;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31409;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31410;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31411;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f31412;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence f31413;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f31414;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence f31416;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f31419;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f31420;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f31421;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f31422;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31423;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2893 f31424;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public char f31425;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f31426;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31427;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f31428;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31430;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f31431;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31435;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31436;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Menu f31437;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ColorStateList f31418 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f31415 = null;

    public C9245(C2893 c2893, Menu menu) {
        this.f31424 = c2893;
        this.f31437 = menu;
        m23757();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23757() {
        this.f31409 = 0;
        this.f31411 = 0;
        this.f31412 = 0;
        this.f31423 = 0;
        this.f31435 = true;
        this.f31420 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23759(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f31424.f10922.obtainStyledAttributes(attributeSet, C12108.f40521);
        this.f31409 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f31411 = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f31412 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f31423 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f31435 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f31420 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23762(AttributeSet attributeSet) {
        C2893 c2893 = this.f31424;
        C1977 c1977M6352 = C1977.m6352(c2893.f10922, attributeSet, C12108.f40522);
        this.f31433 = c1977M6352.m6387(2, 0);
        this.f31434 = (c1977M6352.m6381(5, this.f31411) & (-65536)) | (c1977M6352.m6381(6, this.f31412) & 65535);
        this.f31421 = c1977M6352.m6368(7);
        this.f31428 = c1977M6352.m6368(8);
        this.f31417 = c1977M6352.m6387(0, 0);
        String strM6388 = c1977M6352.m6388(9);
        this.f31425 = strM6388 == null ? (char) 0 : strM6388.charAt(0);
        this.f31436 = c1977M6352.m6381(16, 4096);
        String strM6389 = c1977M6352.m6388(10);
        this.f31407 = strM6389 == null ? (char) 0 : strM6389.charAt(0);
        this.f31432 = c1977M6352.m6381(20, 4096);
        if (c1977M6352.m6383(11)) {
            this.f31429 = c1977M6352.m6376(11, false) ? 1 : 0;
        } else {
            this.f31429 = this.f31423;
        }
        this.f31430 = c1977M6352.m6376(3, false);
        this.f31419 = c1977M6352.m6376(4, this.f31435);
        this.f31431 = c1977M6352.m6376(1, this.f31420);
        this.f31427 = c1977M6352.m6381(21, -1);
        this.f31426 = c1977M6352.m6388(12);
        this.f31410 = c1977M6352.m6387(13, 0);
        this.f31422 = c1977M6352.m6388(15);
        String strM63810 = c1977M6352.m6388(14);
        if (strM63810 != null && this.f31410 == 0 && this.f31422 == null) {
            this.f31408 = (AbstractC5674) m23755(strM63810, C2893.f10918, c2893.f10921);
        } else {
            this.f31408 = null;
        }
        this.f31416 = c1977M6352.m6368(17);
        this.f31413 = c1977M6352.m6368(22);
        if (c1977M6352.m6383(19)) {
            this.f31415 = C20946.m47119(c1977M6352.m6381(19, -1), this.f31415);
        } else {
            this.f31415 = null;
        }
        if (c1977M6352.m6383(18)) {
            this.f31418 = c1977M6352.m6385(18);
        } else {
            this.f31418 = null;
        }
        c1977M6352.m6379();
        this.f31414 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23756(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f31430).setVisible(this.f31419).setEnabled(this.f31431).setCheckable(this.f31429 >= 1).setTitleCondensed(this.f31428).setIcon(this.f31417);
        int i = this.f31427;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f31426;
        C2893 c2893 = this.f31424;
        if (str != null) {
            if (c2893.f10922.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1482(c2893.m8702(), this.f31426));
        }
        if (this.f31429 >= 2) {
            if (menuItem instanceof C23707) {
                ((C23707) menuItem).m52178(true);
            } else if (menuItem instanceof MenuItemC4386) {
                ((MenuItemC4386) menuItem).m12236();
            }
        }
        String str2 = this.f31422;
        if (str2 != null) {
            menuItem.setActionView((View) m23755(str2, C2893.f10919, c2893.f10923));
            z = true;
        }
        int i2 = this.f31410;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        AbstractC5674 abstractC5674 = this.f31408;
        if (abstractC5674 != null && (menuItem instanceof InterfaceMenuItemC9720)) {
            ((InterfaceMenuItemC9720) menuItem).mo4157(abstractC5674);
        }
        C24019.m52859(menuItem, this.f31416);
        C24019.m52861(menuItem, this.f31413);
        C24019.m52856(menuItem, this.f31425, this.f31436);
        C24019.m52860(menuItem, this.f31407, this.f31432);
        PorterDuff.Mode mode = this.f31415;
        if (mode != null) {
            C24019.m52858(menuItem, mode);
        }
        ColorStateList colorStateList = this.f31418;
        if (colorStateList != null) {
            C24019.m52857(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23758() {
        this.f31414 = true;
        m23756(this.f31437.add(this.f31409, this.f31433, this.f31434, this.f31421));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final SubMenu m23761() {
        this.f31414 = true;
        SubMenu subMenuAddSubMenu = this.f31437.addSubMenu(this.f31409, this.f31433, this.f31434, this.f31421);
        m23756(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m23760() {
        return this.f31414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m23755(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f31424.f10922.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
