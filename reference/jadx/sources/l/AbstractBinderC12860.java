package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC12860 extends Binder implements InterfaceC1674 {
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
                ((BinderC23303) this).m52423();
                return true;
            case 2:
                mo6016();
                return true;
            case 3:
                ((BinderC23303) this).mo6013((C3668) C5403.m16081(parcel, C3668.CREATOR));
                return true;
            case 4:
                mo6014((C21811) C5403.m16081(parcel, C21811.CREATOR));
                return true;
            case 5:
                parcel.createTypedArrayList(C22314.CREATOR);
                mo6011();
                return true;
            case 6:
                mo6015();
                return true;
            case 7:
                mo6017();
                return true;
            case 8:
                mo6012((C2177) C5403.m16081(parcel, C2177.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                ((BinderC23303) this).m52420();
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                ((BinderC23303) this).m52424();
                return true;
            case 12:
                parcel.readInt();
                ((BinderC23303) this).m52421();
                return true;
            case 13:
                ((BinderC23303) this).m52422();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
