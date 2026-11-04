package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14616 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4176();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f46032;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f46033;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C14616(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C20782.m47565(j2 >= 0 || j2 == -9223372036854775807L);
        this.f46033 = j;
        this.f46032 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14616)) {
            return false;
        }
        C14616 c14616 = (C14616) obj;
        return this.f46033 == c14616.f46033 && this.f46032 == c14616.f46032;
    }

    public final int hashCode() {
        return (((int) this.f46033) * 961) + ((int) this.f46032);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f46033);
        parcel.writeLong(this.f46032);
    }
}
