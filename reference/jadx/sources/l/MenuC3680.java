package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5UF */
/* JADX INFO: loaded from: classes2.dex */
public class MenuC3680 extends AbstractC15240 implements Menu {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuC1957 f13445;

    public MenuC3680(Context context, InterfaceMenuC1957 interfaceMenuC1957) {
        super(context);
        if (interfaceMenuC1957 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f13445 = interfaceMenuC1957;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m36508(this.f13445.add(charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m36508(this.f13445.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m36508(this.f13445.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m36508(this.f13445.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m36509(this.f13445.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m36509(this.f13445.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m36509(this.f13445.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m36509(this.f13445.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f13445.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m36508(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        m36511(i);
        this.f13445.removeItem(i);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        m36510(i);
        this.f13445.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        m36507();
        this.f13445.clear();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f13445.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f13445.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f13445.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f13445.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m36508(this.f13445.findItem(i));
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13445.size();
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m36508(this.f13445.getItem(i));
    }

    @Override // android.view.Menu
    public final void close() {
        this.f13445.close();
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f13445.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f13445.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f13445.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f13445.setQwertyMode(z);
    }
}
