package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ᩳܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinderC18125 extends Binder implements InterfaceC18831 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57950 = 0;

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
                boolean zMo32596 = ((BinderC13187) this).mo32596(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo32596 ? 1 : 0);
                return true;
            case 2:
                ((BinderC13187) this).exit();
                parcel2.writeNoException();
                return true;
            case 3:
                String[] strArrMo32601 = ((BinderC13187) this).mo32601();
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo32601);
                return true;
            case 4:
                String strMo32594 = ((BinderC13187) this).mo32594(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo32594);
                return true;
            case 5:
                String strMo32608 = ((BinderC13187) this).mo32608(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo32608);
                return true;
            case 6:
                byte[] bArrMo32606 = ((BinderC13187) this).mo32606(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo32606);
                return true;
            case 7:
                int[] iArrMo32600 = ((BinderC13187) this).mo32600(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32600);
                return true;
            case 8:
                int[] iArrMo32604 = ((BinderC13187) this).mo32604(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32604);
                return true;
            case 9:
                int[] iArrMo32598 = ((BinderC13187) this).mo32598(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32598);
                return true;
            case 10:
                int iMo32605 = ((BinderC13187) this).mo32605(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo32605);
                return true;
            case 11:
                String strMo32607 = ((BinderC13187) this).mo32607(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo32607);
                return true;
            case 12:
                int[] iArrMo32597 = ((BinderC13187) this).mo32597(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32597);
                return true;
            case 13:
                int[] iArrMo32595 = ((BinderC13187) this).mo32595(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32595);
                return true;
            case 14:
                int[] iArrMo32603 = ((BinderC13187) this).mo32603(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo32603);
                return true;
            case 15:
                C20948.m47124(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                int i3 = ((BinderC13187) this).f43895.f49862;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
