package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC13456 extends Binder implements InterfaceC11339 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11339 m32938(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC11339.f38263);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC11339)) {
            return (InterfaceC11339) iInterfaceQueryLocalInterface;
        }
        return new C4282(iBinder);
    }
}
