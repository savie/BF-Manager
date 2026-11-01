package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩷۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20744 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C7338();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67492;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f67493;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67494;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20744 c20744 = (C20744) obj;
        int i = this.f67494 - c20744.f67494;
        if (i != 0) {
            return i;
        }
        int i2 = this.f67493 - c20744.f67493;
        return i2 == 0 ? this.f67492 - c20744.f67492 : i2;
    }

    public C20744(Parcel parcel) {
        this.f67494 = parcel.readInt();
        this.f67493 = parcel.readInt();
        this.f67492 = parcel.readInt();
    }

    public final String toString() {
        return this.f67494 + "." + this.f67493 + "." + this.f67492;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20744.class == obj.getClass()) {
            C20744 c20744 = (C20744) obj;
            if (this.f67494 == c20744.f67494 && this.f67493 == c20744.f67493 && this.f67492 == c20744.f67492) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f67494 * 31) + this.f67493) * 31) + this.f67492;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67494);
        parcel.writeInt(this.f67493);
        parcel.writeInt(this.f67492);
    }

    static {
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(2);
    }
}
