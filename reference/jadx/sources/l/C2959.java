package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۗۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2959 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9311();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f11088;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f11089;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C2959(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C2023.m6507(j >= 0);
        C2023.m6507(j2 >= 0 || j2 == -1);
        this.f11089 = j;
        this.f11088 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2959)) {
            return false;
        }
        C2959 c2959 = (C2959) obj;
        return this.f11089 == c2959.f11089 && this.f11088 == c2959.f11088;
    }

    public final int hashCode() {
        return (((int) this.f11089) * 961) + ((int) this.f11088);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11089);
        parcel.writeLong(this.f11088);
    }
}
