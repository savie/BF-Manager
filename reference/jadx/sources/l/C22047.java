package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22047 implements InterfaceC3701 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f71465;

    public C22047(IBinder iBinder) {
        this.f71465 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f71465;
    }

    @Override // l.InterfaceC3701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10872() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f71465.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC3701
    /* JADX INFO: renamed from: ۙ */
    public final void mo10868(C8205 c8205) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c8205 != null) {
                parcelObtain.writeInt(1);
                c8205.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f71465.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC3701
    /* JADX INFO: renamed from: ۙ */
    public final void mo10869(C13581 c13581) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c13581 != null) {
                parcelObtain.writeInt(1);
                c13581.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f71465.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
