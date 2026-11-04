package l;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4524 implements InterfaceC10489 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f16109;

    public C4524(IBinder iBinder) {
        this.f16109 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16109;
    }

    @Override // l.InterfaceC10489
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14246(String str, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC10489.f33381);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1006);
            parcelObtain.writeString(null);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f16109.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
