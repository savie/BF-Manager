package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܽܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17702 implements InterfaceC23670 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f58183;

    public C17702(IBinder iBinder) {
        this.f58183 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f58183;
    }

    @Override // l.InterfaceC23670
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo18392() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f58183.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC23670
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f58183.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
