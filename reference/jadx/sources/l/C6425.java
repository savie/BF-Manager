package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes2.dex */
public final class C6425 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3602();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bundle f21764;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C6425(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f21764 = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f21764);
    }
}
