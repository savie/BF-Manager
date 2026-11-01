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

/* JADX INFO: renamed from: l.᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC22753 extends Binder implements InterfaceC21341 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21341 m50413(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC21341)) {
            return (InterfaceC21341) iInterfaceQueryLocalInterface;
        }
        return new C6524(iBinder);
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
        InterfaceC3701 c22047 = null;
        switch (i) {
            case 1:
                mo39939(parcel.readString(), (Bundle) C14992.m35974(parcel, Bundle.CREATOR), (C2559) C14992.m35974(parcel, C2559.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo17729 = mo17729((KeyEvent) C14992.m35974(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo17729 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC3701)) {
                        c22047 = (InterfaceC3701) iInterfaceQueryLocalInterface;
                    } else {
                        c22047 = new C22047(strongBinder);
                    }
                }
                mo17728(c22047);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC3701)) {
                        c22047 = (InterfaceC3701) iInterfaceQueryLocalInterface2;
                    } else {
                        c22047 = new C22047(strongBinder2);
                    }
                }
                mo39959(c22047);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo39948 = mo39948();
                parcel2.writeNoException();
                parcel2.writeInt(zMo39948 ? 1 : 0);
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
                PendingIntent pendingIntentMo39932 = mo39932();
                parcel2.writeNoException();
                C14992.m35975(parcel2, pendingIntentMo39932, 1);
                return true;
            case 9:
                long jMo39929 = mo39929();
                parcel2.writeNoException();
                parcel2.writeLong(jMo39929);
                return true;
            case 10:
                C3970 c3970Mo39952 = mo39952();
                parcel2.writeNoException();
                C14992.m35975(parcel2, c3970Mo39952, 1);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readString();
                mo39935(i3, i4);
                parcel2.writeNoException();
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo39956(i5, i6);
                parcel2.writeNoException();
                return true;
            case 13:
                mo39945();
                parcel2.writeNoException();
                return true;
            case 14:
                mo39958((Bundle) C14992.m35974(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo39931((Bundle) C14992.m35974(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                mo39957((Uri) C14992.m35974(parcel, Uri.CREATOR), (Bundle) C14992.m35974(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo39936(parcel.readLong());
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
                mo39966();
                parcel2.writeNoException();
                return true;
            case 23:
                mo39968();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo39940((C5113) C14992.m35974(parcel, C5113.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo39938((Bundle) C14992.m35974(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                C13581 c13581Mo39962 = mo39962();
                parcel2.writeNoException();
                C14992.m35975(parcel2, c13581Mo39962, 1);
                return true;
            case 28:
                C8205 c8205Mo39930 = mo39930();
                parcel2.writeNoException();
                C14992.m35975(parcel2, c8205Mo39930, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo39967 = mo39967();
                parcel2.writeNoException();
                if (charSequenceMo39967 != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceMo39967, parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 31:
                Bundle bundleMo39965 = mo39965();
                parcel2.writeNoException();
                C14992.m35975(parcel2, bundleMo39965, 1);
                return true;
            case 32:
                mo39947();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo39954();
                parcel2.writeNoException();
                return true;
            case 34:
                mo39951((Bundle) C14992.m35974(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                mo39946((Bundle) C14992.m35974(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                mo39937((Uri) C14992.m35974(parcel, Uri.CREATOR), (Bundle) C14992.m35974(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo39953 = mo39953();
                parcel2.writeNoException();
                parcel2.writeInt(iMo39953);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo39934(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo39960((C9223) C14992.m35974(parcel, C9223.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo39943((C9223) C14992.m35974(parcel, C9223.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo39942((C9223) C14992.m35974(parcel, C9223.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo39955(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                mo39949();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo39944(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo39964 = mo39964();
                parcel2.writeNoException();
                parcel2.writeInt(iMo39964);
                return true;
            case 48:
                mo39950(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo39933(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo39961 = mo39961();
                parcel2.writeNoException();
                C14992.m35975(parcel2, bundleMo39961, 1);
                return true;
            case 51:
                mo39941((C5113) C14992.m35974(parcel, C5113.CREATOR), (Bundle) C14992.m35974(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
