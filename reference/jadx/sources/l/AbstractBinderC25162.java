package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩻ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC25162 extends Binder implements InterfaceC16956 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81353 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            return true;
        }
        switch (i) {
            case 1:
                boolean zMo29468 = ((BinderC19940) this).mo29468(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo29468 ? 1 : 0);
                return true;
            case 2:
                ((BinderC19940) this).exit();
                parcel2.writeNoException();
                return true;
            case 3:
                String[] strArrMo29474 = ((BinderC19940) this).mo29474();
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo29474);
                return true;
            case 4:
                String strMo29481 = ((BinderC19940) this).mo29481(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo29481);
                return true;
            case 5:
                String strMo29476 = ((BinderC19940) this).mo29476(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo29476);
                return true;
            case 6:
                byte[] bArrMo29480 = ((BinderC19940) this).mo29480(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo29480);
                return true;
            case 7:
                int[] iArrMo29478 = ((BinderC19940) this).mo29478(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29478);
                return true;
            case 8:
                int[] iArrMo29473 = ((BinderC19940) this).mo29473(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29473);
                return true;
            case 9:
                int[] iArrMo29470 = ((BinderC19940) this).mo29470(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29470);
                return true;
            case 10:
                int iMo29479 = ((BinderC19940) this).mo29479(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo29479);
                return true;
            case 11:
                String strMo29475 = ((BinderC19940) this).mo29475(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo29475);
                return true;
            case 12:
                int[] iArrMo29469 = ((BinderC19940) this).mo29469(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29469);
                return true;
            case 13:
                int[] iArrMo29482 = ((BinderC19940) this).mo29482(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29482);
                return true;
            case 14:
                int[] iArrMo29472 = ((BinderC19940) this).mo29472(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo29472);
                return true;
            case 15:
                C12481.m31014(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                int i3 = ((BinderC19940) this).f64134.f6791;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
