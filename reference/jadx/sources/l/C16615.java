package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܺۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16615 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24821();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f53736;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C16615(String str, int i) {
        this.f53736 = str;
        this.f53735 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f53736);
        parcel.writeInt(this.f53735);
    }
}
