package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۡۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9156 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C2445 c2445 = new C2445(parcel);
        c2445.f7829 = parcel.readString();
        return c2445;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2445[i];
    }
}
