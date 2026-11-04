package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ᩴܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19964 implements InterfaceC13251 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public IBinder f64166;

    public C19964(IBinder iBinder) {
        this.f64166 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f64166;
    }

    @Override // l.InterfaceC13251
    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f64166.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC13251
    public final boolean c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f64166.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
