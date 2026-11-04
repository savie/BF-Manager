package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B1T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6017 extends Binder implements InterfaceC23917 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC11982 c20187;
        String str = InterfaceC23917.f77427;
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
                c20187 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC11982.f38602);
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC11982)) {
                    c20187 = (InterfaceC11982) iInterfaceQueryLocalInterface;
                } else {
                    c20187 = new C20187(strongBinder);
                }
            }
            mo14641(c20187);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
