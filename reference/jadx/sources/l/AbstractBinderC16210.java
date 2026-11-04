package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: renamed from: l.ܶܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinderC16210 extends Binder implements InterfaceC23670 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52692 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            return true;
        }
        if (i == 1) {
            boolean zMo18392 = ((BinderC6516) this).mo18392();
            parcel2.writeNoException();
            parcel2.writeInt(zMo18392 ? 1 : 0);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                ((BinderC6516) this).exit();
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ServiceC24416 serviceC24416 = ((BinderC6516) this).f21921;
        String[] strArr = null;
        if (serviceC24416.f79283 != null) {
            String message = serviceC24416.f79283.getMessage();
            if (message == null || message.isEmpty()) {
                message = serviceC24416.f79283.toString();
            }
            String stackTraceString = Log.getStackTraceString(serviceC24416.f79283);
            serviceC24416.f79283 = null;
            strArr = new String[]{message, stackTraceString};
        }
        parcel2.writeNoException();
        parcel2.writeStringArray(strArr);
        return true;
    }
}
