package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5167 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2344();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f17933;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17934;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17935;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f17936;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17935);
        parcel.writeInt(this.f17934);
        parcel.writeInt(this.f17933 ? 1 : 0);
        int[] iArr = this.f17936;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f17936);
        } else {
            parcel.writeInt(0);
        }
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f17935 + ", mGapDir=" + this.f17934 + ", mHasUnwantedGapAfter=" + this.f17933 + ", mGapPerSpan=" + Arrays.toString(this.f17936) + '}';
    }
}
