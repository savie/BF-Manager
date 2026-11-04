package l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC24795 extends Binder implements InterfaceC17335 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17335 m55315(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC17335)) {
            return (InterfaceC17335) iInterfaceQueryLocalInterface;
        }
        return new C11368(iBinder);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC1674 c15097 = null;
        switch (i) {
            case 1:
                mo40688(parcel.readString(), (Bundle) C16589.m39259(parcel, Bundle.CREATOR), (C23060) C16589.m39259(parcel, C23060.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo28673 = mo28673((KeyEvent) C16589.m39259(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo28673 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1674)) {
                        c15097 = (InterfaceC1674) iInterfaceQueryLocalInterface;
                    } else {
                        c15097 = new C15097(strongBinder);
                    }
                }
                mo28672(c15097);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC1674)) {
                        c15097 = (InterfaceC1674) iInterfaceQueryLocalInterface2;
                    } else {
                        c15097 = new C15097(strongBinder2);
                    }
                }
                mo40713(c15097);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo40718 = mo40718();
                parcel2.writeNoException();
                parcel2.writeInt(zMo40718 ? 1 : 0);
                return true;
            case 6:
                String packageName = getPackageName();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent pendingIntentMo40679 = mo40679();
                parcel2.writeNoException();
                C16589.m39260(parcel2, pendingIntentMo40679, 1);
                return true;
            case 9:
                long jMo40699 = mo40699();
                parcel2.writeNoException();
                parcel2.writeLong(jMo40699);
                return true;
            case 10:
                C2177 c2177Mo40695 = mo40695();
                parcel2.writeNoException();
                C16589.m39260(parcel2, c2177Mo40695, 1);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readString();
                mo40684(i3, i4);
                parcel2.writeNoException();
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo40710(i5, i6);
                parcel2.writeNoException();
                return true;
            case 13:
                mo40704();
                parcel2.writeNoException();
                return true;
            case 14:
                mo40712((Bundle) C16589.m39259(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo40716((Bundle) C16589.m39259(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                mo40711((Uri) C16589.m39259(parcel, Uri.CREATOR), (Bundle) C16589.m39259(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo40685(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                mo40707();
                parcel2.writeNoException();
                return true;
            case 23:
                mo40701();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo40691((C19573) C16589.m39259(parcel, C19573.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo40687((Bundle) C16589.m39259(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                C21811 c21811Mo40700 = mo40700();
                parcel2.writeNoException();
                C16589.m39260(parcel2, c21811Mo40700, 1);
                return true;
            case 28:
                C3668 c3668Mo40715 = mo40715();
                parcel2.writeNoException();
                C16589.m39260(parcel2, c3668Mo40715, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo40681 = mo40681();
                parcel2.writeNoException();
                if (charSequenceMo40681 != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceMo40681, parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 31:
                Bundle bundleMo40706 = mo40706();
                parcel2.writeNoException();
                C16589.m39260(parcel2, bundleMo40706, 1);
                return true;
            case 32:
                mo40698();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo40708();
                parcel2.writeNoException();
                return true;
            case 34:
                mo40697((Bundle) C16589.m39259(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                mo40705((Bundle) C16589.m39259(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                mo40686((Uri) C16589.m39259(parcel, Uri.CREATOR), (Bundle) C16589.m39259(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo40694 = mo40694();
                parcel2.writeNoException();
                parcel2.writeInt(iMo40694);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo40683(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo40714((C6762) C16589.m39259(parcel, C6762.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo40690((C6762) C16589.m39259(parcel, C6762.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo40689((C6762) C16589.m39259(parcel, C6762.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo40709(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                mo40680();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo40693(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo40717 = mo40717();
                parcel2.writeNoException();
                parcel2.writeInt(iMo40717);
                return true;
            case 48:
                mo40696(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo40682(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo40702 = mo40702();
                parcel2.writeNoException();
                C16589.m39260(parcel2, bundleMo40702, 1);
                return true;
            case 51:
                mo40692((C19573) C16589.m39259(parcel, C19573.CREATOR), (Bundle) C16589.m39259(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
