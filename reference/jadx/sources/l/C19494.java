package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19494 implements InterfaceC10322 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f62723;

    public C19494(IBinder iBinder) {
        this.f62723 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f62723;
    }

    @Override // l.InterfaceC10322
    /* JADX INFO: renamed from: ۙ */
    public final void mo26137(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC10322.f35390);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f62723.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
