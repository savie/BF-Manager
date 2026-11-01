package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0879 extends Binder implements InterfaceC3701 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                ((BinderC18519) this).m42913();
                return true;
            case 2:
                mo10872();
                return true;
            case 3:
                ((BinderC18519) this).mo10868((C8205) C12875.m31910(parcel, C8205.CREATOR));
                return true;
            case 4:
                mo10869((C13581) C12875.m31910(parcel, C13581.CREATOR));
                return true;
            case 5:
                parcel.createTypedArrayList(C13850.CREATOR);
                mo10871();
                return true;
            case 6:
                mo10870();
                return true;
            case 7:
                mo10873();
                return true;
            case 8:
                mo10867((C3970) C12875.m31910(parcel, C3970.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                ((BinderC18519) this).m42914();
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                ((BinderC18519) this).m42916();
                return true;
            case 12:
                parcel.readInt();
                ((BinderC18519) this).m42915();
                return true;
            case 13:
                ((BinderC18519) this).m42917();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
