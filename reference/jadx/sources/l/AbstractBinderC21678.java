package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC21678 extends Binder implements InterfaceC10489 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10489 m49219(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC10489.f33381);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC10489)) {
            return (InterfaceC10489) iInterfaceQueryLocalInterface;
        }
        return new C4524(iBinder);
    }
}
