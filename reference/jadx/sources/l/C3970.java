package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3970 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C13144();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f14733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f14734;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f14735;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14737;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14734);
        parcel.writeInt(this.f14737);
        parcel.writeInt(this.f14736);
        parcel.writeInt(this.f14733);
        parcel.writeInt(this.f14735);
    }
}
