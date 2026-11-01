package l;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: BAG5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1229 extends AbstractC5609 {
    @Override // l.AbstractViewOnClickListenerC6314, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f21343.m31494()) {
            return false;
        }
        C16195 c16195 = new C16195(this.f47137, view, 8388693);
        C2995.m8960(view);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        SubMenu subMenuAddSubMenu = c12418M38298.addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
        m4426(subMenuAddSubMenu);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.᩹ܺ᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Main main = this.f73104.f47137;
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return C1229.m4427(main, menuItem.getItemId());
                }
                AbstractC5609.m15482(main);
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4426(SubMenu subMenu) {
        subMenu.add(0, R.id.MT_Protector, 0, "FTP");
        if (C1709.m5693()) {
            subMenu.add(0, R.id.MT_Protector, 0, "FTPS");
            subMenu.add(0, R.id.MT_Protector, 0, "SFTP");
            subMenu.add(0, R.id.MT_Protector, 0, "SMB");
            subMenu.add(0, R.id.MT_Protector, 0, "WebDav");
            subMenu.add(0, R.id.MT_Protector, 0, C16737.m39288(R.string.MT_Protector));
            return;
        }
        subMenu.add(0, R.id.MT_Protector, 0, "FTPS (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SFTP (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SMB (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "WebDav (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, C16737.m39288(R.string.MT_Protector).concat(" (VIP)")).setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4427(AbstractActivityC12483 abstractActivityC12483, int i) {
        if (i == R.id.MT_Protector) {
            C4718.m13080(abstractActivityC12483);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C13186.m32592(abstractActivityC12483);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C22462.m49961(abstractActivityC12483);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C8768.m22824(abstractActivityC12483);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C1315.m4698(abstractActivityC12483);
            return true;
        }
        if (i != R.id.MT_Protector) {
            return false;
        }
        C17606.m40931(abstractActivityC12483);
        return true;
    }
}
