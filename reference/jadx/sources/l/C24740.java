package l;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAG5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24740 extends AbstractC13001 {
    @Override // l.AbstractViewOnClickListenerC8526, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f27860.m24482()) {
            return false;
        }
        C18452 c18452 = new C18452(this.f22654, view, 8388693);
        C10378.m26694(view);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        SubMenu subMenuAddSubMenu = c9898M42995.addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
        m55248(subMenuAddSubMenu);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۧۖܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Main main = this.f35660.f22654;
                if (menuItem.getItemId() != R.string.MT_Protector) {
                    return C24740.m55249(main, menuItem.getItemId());
                }
                AbstractC13001.m32417(main);
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55248(SubMenu subMenu) {
        subMenu.add(0, R.id.MT_Protector, 0, "FTP");
        if (C18978.m44078()) {
            subMenu.add(0, R.id.MT_Protector, 0, "FTPS");
            subMenu.add(0, R.id.MT_Protector, 0, "SFTP");
            subMenu.add(0, R.id.MT_Protector, 0, "SMB");
            subMenu.add(0, R.id.MT_Protector, 0, "WebDav");
            subMenu.add(0, R.id.MT_Protector, 0, C21576.m49088(R.string.MT_Protector));
            return;
        }
        subMenu.add(0, R.id.MT_Protector, 0, "FTPS (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SFTP (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "SMB (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, "WebDav (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector, 0, C21576.m49088(R.string.MT_Protector).concat(" (VIP)")).setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55249(AbstractActivityC17204 abstractActivityC17204, int i) {
        if (i == R.id.MT_Protector) {
            C21799.m49448(abstractActivityC17204);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C11356.m28668(abstractActivityC17204);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C13263.m32815(abstractActivityC17204);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C6574.m18495(abstractActivityC17204);
            return true;
        }
        if (i == R.id.MT_Protector) {
            C12957.m32348(abstractActivityC17204);
            return true;
        }
        if (i != R.id.MT_Protector) {
            return false;
        }
        C9423.m24800(abstractActivityC17204);
        return true;
    }
}
