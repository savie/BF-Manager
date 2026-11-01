package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes4.dex */
public class C15967 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7499();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC10322 f51730;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo37211(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37948(int i, Bundle bundle) {
        InterfaceC10322 interfaceC10322 = this.f51730;
        if (interfaceC10322 != null) {
            try {
                interfaceC10322.mo26137(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f51730 == null) {
                this.f51730 = new BinderC20905(this);
            }
            parcel.writeStrongBinder(this.f51730.asBinder());
        }
    }
}
