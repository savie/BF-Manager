package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13594 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4420();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f44822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f44823;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C13594(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C2023.m6507(j2 >= 0 || j2 == -9223372036854775807L);
        this.f44823 = j;
        this.f44822 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13594)) {
            return false;
        }
        C13594 c13594 = (C13594) obj;
        return this.f44823 == c13594.f44823 && this.f44822 == c13594.f44822;
    }

    public final int hashCode() {
        return (((int) this.f44823) * 961) + ((int) this.f44822);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f44823);
        parcel.writeLong(this.f44822);
    }
}
