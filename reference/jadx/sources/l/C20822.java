package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20822 implements InterfaceC6652 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f66690;

    public C20822(IBinder iBinder) {
        this.f66690 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f66690;
    }

    @Override // l.InterfaceC6652
    /* JADX INFO: renamed from: ۙ */
    public final void mo14033(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC6652.f22187);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f66690.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
