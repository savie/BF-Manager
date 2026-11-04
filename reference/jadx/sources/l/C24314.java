package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩺۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes.dex */
public final class C24314 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6414();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f78708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f78709;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C24314(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C20782.m47565(j >= 0);
        C20782.m47565(j2 >= 0 || j2 == -1);
        this.f78709 = j;
        this.f78708 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24314)) {
            return false;
        }
        C24314 c24314 = (C24314) obj;
        return this.f78709 == c24314.f78709 && this.f78708 == c24314.f78708;
    }

    public final int hashCode() {
        return (((int) this.f78709) * 961) + ((int) this.f78708);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f78709);
        parcel.writeLong(this.f78708);
    }
}
