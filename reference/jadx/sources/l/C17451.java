package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܽ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F993 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17451 implements InterfaceC23419 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f56761;

    public C17451(IBinder iBinder) {
        this.f56761 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f56761;
    }

    @Override // l.InterfaceC23419
    /* JADX INFO: renamed from: ۙ */
    public final int mo25846() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            this.f56761.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC23419
    /* JADX INFO: renamed from: ۙ */
    public final Bundle mo25847(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            parcelObtain.writeString("sh");
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.f56761.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
