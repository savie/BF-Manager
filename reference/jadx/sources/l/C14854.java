package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes4.dex */
public class C14854 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24552();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC6652 f48561;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo34505(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35782(int i, Bundle bundle) {
        InterfaceC6652 interfaceC6652 = this.f48561;
        if (interfaceC6652 != null) {
            try {
                interfaceC6652.mo14033(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f48561 == null) {
                this.f48561 = new BinderC4414(this);
            }
            parcel.writeStrongBinder(this.f48561.asBinder());
        }
    }
}
