package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15097 implements InterfaceC1674 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f49283;

    public C15097(IBinder iBinder) {
        this.f49283 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f49283;
    }

    @Override // l.InterfaceC1674
    /* JADX INFO: renamed from: ܶ */
    public final void mo6016() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f49283.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC1674
    /* JADX INFO: renamed from: ۙ */
    public final void mo6013(C3668 c3668) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c3668 != null) {
                parcelObtain.writeInt(1);
                c3668.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f49283.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC1674
    /* JADX INFO: renamed from: ۙ */
    public final void mo6014(C21811 c21811) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c21811 != null) {
                parcelObtain.writeInt(1);
                c21811.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f49283.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
