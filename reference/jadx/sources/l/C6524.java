package l;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6524 implements InterfaceC21341 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f21979;

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo17729(KeyEvent keyEvent) {
        throw null;
    }

    public C6524(IBinder iBinder) {
        this.f21979 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21979;
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17728(InterfaceC3701 interfaceC3701) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC3701);
            this.f21979.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
