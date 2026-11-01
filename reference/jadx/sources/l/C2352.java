package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2352 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C11526();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f8300;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8300);
    }
}
