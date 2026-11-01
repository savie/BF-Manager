package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۧ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11287 implements InterfaceC14815 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f38113;

    public C11287(IBinder iBinder) {
        this.f38113 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38113;
    }

    @Override // l.InterfaceC14815
    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f38113.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC14815
    public final boolean c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f38113.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
