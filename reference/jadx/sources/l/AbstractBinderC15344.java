package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B1T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC15344 extends Binder implements InterfaceC21693 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC23105 c6876;
        String str = InterfaceC21693.f70373;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c6876 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC23105.f75061);
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23105)) {
                    c6876 = (InterfaceC23105) iInterfaceQueryLocalInterface;
                } else {
                    c6876 = new C6876(strongBinder);
                }
            }
            mo28009(c6876);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
