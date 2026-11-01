package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18065 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C21593();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f57775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f57776;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C18065(String str, int i) {
        this.f57776 = str;
        this.f57775 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57776);
        parcel.writeInt(this.f57775);
    }
}
