package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2177 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5906();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f7165;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f7166;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f7168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7169;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7166);
        parcel.writeInt(this.f7169);
        parcel.writeInt(this.f7165);
        parcel.writeInt(this.f7168);
        parcel.writeInt(this.f7167);
    }
}
