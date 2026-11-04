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

/* JADX INFO: renamed from: l.ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes2.dex */
public final class C4679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16511;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f16512;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16513;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21833 f16514;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f16515;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f16516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f16518;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f16520;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Menu f16521;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f16522;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f16523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16524;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16525;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC15227 f16526;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f16527;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f16528;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f16529;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f16530;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16531;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char f16532;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f16533;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f16534;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f16535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16536;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f16537;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f16538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16539;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16541;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ColorStateList f16519 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f16540 = null;

    public C4679(C21833 c21833, Menu menu) {
        this.f16514 = c21833;
        this.f16521 = menu;
        m14546();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m14546() {
        this.f16538 = 0;
        this.f16517 = 0;
        this.f16534 = 0;
        this.f16537 = 0;
        this.f16528 = true;
        this.f16523 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14542(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f16514.f69588.obtainStyledAttributes(attributeSet, C10401.f33069);
        this.f16538 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f16517 = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f16534 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f16537 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f16528 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f16523 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14545(AttributeSet attributeSet) {
        C21833 c21833 = this.f16514;
        C5204 c5204M15648 = C5204.m15648(c21833.f69588, attributeSet, C10401.f33063);
        this.f16516 = c5204M15648.m15660(2, 0);
        this.f16531 = (c5204M15648.m15657(5, this.f16517) & (-65536)) | (c5204M15648.m15657(6, this.f16534) & 65535);
        this.f16520 = c5204M15648.m15659(7);
        this.f16533 = c5204M15648.m15659(8);
        this.f16525 = c5204M15648.m15660(0, 0);
        String strM15661 = c5204M15648.m15661(9);
        this.f16530 = strM15661 == null ? (char) 0 : strM15661.charAt(0);
        this.f16541 = c5204M15648.m15657(16, 4096);
        String strM15662 = c5204M15648.m15661(10);
        this.f16532 = strM15662 == null ? (char) 0 : strM15662.charAt(0);
        this.f16536 = c5204M15648.m15657(20, 4096);
        if (c5204M15648.m15655(11)) {
            this.f16529 = c5204M15648.m15654(11, false) ? 1 : 0;
        } else {
            this.f16529 = this.f16537;
        }
        this.f16539 = c5204M15648.m15654(3, false);
        this.f16512 = c5204M15648.m15654(4, this.f16528);
        this.f16535 = c5204M15648.m15654(1, this.f16523);
        this.f16511 = c5204M15648.m15657(21, -1);
        this.f16527 = c5204M15648.m15661(12);
        this.f16513 = c5204M15648.m15660(13, 0);
        this.f16518 = c5204M15648.m15661(15);
        String strM15663 = c5204M15648.m15661(14);
        if (strM15663 != null && this.f16513 == 0 && this.f16518 == null) {
            this.f16526 = (AbstractC15227) m14539(strM15663, C21833.f69586, c21833.f69587);
        } else {
            this.f16526 = null;
        }
        this.f16515 = c5204M15648.m15659(17);
        this.f16522 = c5204M15648.m15659(22);
        if (c5204M15648.m15655(19)) {
            this.f16540 = C21414.m48720(c5204M15648.m15657(19, -1), this.f16540);
        } else {
            this.f16540 = null;
        }
        if (c5204M15648.m15655(18)) {
            this.f16519 = c5204M15648.m15666(18);
        } else {
            this.f16519 = null;
        }
        c5204M15648.m15664();
        this.f16524 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14540(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f16539).setVisible(this.f16512).setEnabled(this.f16535).setCheckable(this.f16529 >= 1).setTitleCondensed(this.f16533).setIcon(this.f16525);
        int i = this.f16511;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f16527;
        C21833 c21833 = this.f16514;
        if (str != null) {
            if (c21833.f69588.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC13845(c21833.m49503(), this.f16527));
        }
        if (this.f16529 >= 2) {
            if (menuItem instanceof C8407) {
                ((C8407) menuItem).m22592(true);
            } else if (menuItem instanceof MenuItemC10534) {
                ((MenuItemC10534) menuItem).m26994();
            }
        }
        String str2 = this.f16518;
        if (str2 != null) {
            menuItem.setActionView((View) m14539(str2, C21833.f69585, c21833.f69589));
            z = true;
        }
        int i2 = this.f16513;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        AbstractC15227 abstractC15227 = this.f16526;
        if (abstractC15227 != null && (menuItem instanceof InterfaceMenuItemC22709)) {
            ((InterfaceMenuItemC22709) menuItem).mo6058(abstractC15227);
        }
        C2549.m8484(menuItem, this.f16515);
        C2549.m8486(menuItem, this.f16522);
        C2549.m8481(menuItem, this.f16530, this.f16541);
        C2549.m8485(menuItem, this.f16532, this.f16536);
        PorterDuff.Mode mode = this.f16540;
        if (mode != null) {
            C2549.m8483(menuItem, mode);
        }
        ColorStateList colorStateList = this.f16519;
        if (colorStateList != null) {
            C2549.m8482(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14541() {
        this.f16524 = true;
        m14540(this.f16521.add(this.f16538, this.f16516, this.f16531, this.f16520));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SubMenu m14544() {
        this.f16524 = true;
        SubMenu subMenuAddSubMenu = this.f16521.addSubMenu(this.f16538, this.f16516, this.f16531, this.f16520);
        m14540(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14543() {
        return this.f16524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m14539(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f16514.f69588.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
