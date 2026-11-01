package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֨۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes2.dex */
public final class C1119 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C22287();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5043;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f5044;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f5045;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5043);
        parcel.writeInt(this.f5045);
        parcel.writeInt(this.f5044 ? 1 : 0);
    }
}
