package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۫ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12820 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C15057();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f41059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41060;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f41061;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C12820 c12820 = (C12820) obj;
        int i = this.f41061 - c12820.f41061;
        if (i != 0) {
            return i;
        }
        int i2 = this.f41059 - c12820.f41059;
        return i2 == 0 ? this.f41060 - c12820.f41060 : i2;
    }

    public C12820(Parcel parcel) {
        this.f41061 = parcel.readInt();
        this.f41059 = parcel.readInt();
        this.f41060 = parcel.readInt();
    }

    public final String toString() {
        return this.f41061 + "." + this.f41059 + "." + this.f41060;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12820.class == obj.getClass()) {
            C12820 c12820 = (C12820) obj;
            if (this.f41061 == c12820.f41061 && this.f41059 == c12820.f41059 && this.f41060 == c12820.f41060) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f41061 * 31) + this.f41059) * 31) + this.f41060;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41061);
        parcel.writeInt(this.f41059);
        parcel.writeInt(this.f41060);
    }

    static {
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(2);
    }
}
