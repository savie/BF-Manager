package l;

import android.view.MenuItem;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14168 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46489;

    public /* synthetic */ C14168(int i) {
        this.f46489 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f46489) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                MenuItem menuItem2 = (MenuItem) obj2;
                if (menuItem.getItemId() == 16908353) {
                    if (menuItem2.getItemId() == 16908353) {
                        return 0;
                    }
                    return -1;
                }
                if (menuItem2.getItemId() == 16908353) {
                    return 1;
                }
                InterfaceMenuItemC9720 interfaceMenuItemC9720 = (InterfaceMenuItemC9720) menuItem;
                if (!interfaceMenuItemC9720.mo4159()) {
                    InterfaceMenuItemC9720 interfaceMenuItemC9721 = (InterfaceMenuItemC9720) menuItem2;
                    if (interfaceMenuItemC9721.mo4159()) {
                        return 1;
                    }
                    if (interfaceMenuItemC9720.mo4158()) {
                        return 1 ^ (interfaceMenuItemC9721.mo4158() ? 1 : 0);
                    }
                    if (!interfaceMenuItemC9721.mo4158()) {
                        return menuItem.getOrder() - menuItem2.getOrder();
                    }
                } else if (((InterfaceMenuItemC9720) menuItem2).mo4159()) {
                    return 0;
                }
                return -1;
            default:
                return ((C19147) obj).f61848.compareTo(((C19147) obj2).f61848);
        }
    }
}
