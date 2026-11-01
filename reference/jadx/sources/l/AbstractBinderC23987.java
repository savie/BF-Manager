package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩻᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC23987 extends Binder implements InterfaceC14815 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14815 m52822(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC14815)) {
            return (InterfaceC14815) iInterfaceQueryLocalInterface;
        }
        return new C11287(iBinder);
    }
}
