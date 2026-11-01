package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.۠ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8248 implements InterfaceC8954 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f28696;

    public C8248(IBinder iBinder) {
        this.f28696 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28696;
    }

    @Override // l.InterfaceC8954
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean mo21638() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f28696.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC8954
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f28696.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
