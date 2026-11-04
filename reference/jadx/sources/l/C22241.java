package l;

import android.view.MenuItem;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22241 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MenuItem menuItem = (MenuItem) obj;
        MenuItem menuItem2 = (MenuItem) obj2;
        if (menuItem.getItemId() == 16908353) {
            return menuItem2.getItemId() == 16908353 ? 0 : -1;
        }
        if (menuItem2.getItemId() != 16908353) {
            InterfaceMenuItemC22709 interfaceMenuItemC22709 = (InterfaceMenuItemC22709) menuItem;
            if (interfaceMenuItemC22709.mo6060()) {
                return ((InterfaceMenuItemC22709) menuItem2).mo6060() ? 0 : -1;
            }
            InterfaceMenuItemC22709 interfaceMenuItemC227010 = (InterfaceMenuItemC22709) menuItem2;
            if (!interfaceMenuItemC227010.mo6060()) {
                if (interfaceMenuItemC22709.mo6059()) {
                    return !interfaceMenuItemC227010.mo6059() ? 1 : 0;
                }
                if (interfaceMenuItemC227010.mo6059()) {
                    return -1;
                }
                return menuItem.getOrder() - menuItem2.getOrder();
            }
        }
        return 1;
    }
}
