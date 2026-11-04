package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8072 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0614();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f26709;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f26710;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f26711;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f26712;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f26713;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f26714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f26716;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f26717;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26718;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26718);
        parcel.writeInt(this.f26711);
        parcel.writeInt(this.f26713);
        if (this.f26713 > 0) {
            parcel.writeIntArray(this.f26710);
        }
        parcel.writeInt(this.f26714);
        if (this.f26714 > 0) {
            parcel.writeIntArray(this.f26717);
        }
        parcel.writeInt(this.f26712 ? 1 : 0);
        parcel.writeInt(this.f26715 ? 1 : 0);
        parcel.writeInt(this.f26709 ? 1 : 0);
        parcel.writeList(this.f26716);
    }
}
