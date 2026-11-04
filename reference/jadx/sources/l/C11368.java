package l;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11368 implements InterfaceC17335 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f35780;

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28673(KeyEvent keyEvent) {
        throw null;
    }

    public C11368(IBinder iBinder) {
        this.f35780 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f35780;
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28672(InterfaceC1674 interfaceC1674) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1674);
            this.f35780.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
