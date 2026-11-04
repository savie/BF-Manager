package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes.dex */
public final class C21497 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C14783();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68717;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68718;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68719;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f68720;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68717);
        parcel.writeInt(this.f68718);
        parcel.writeInt(this.f68719 ? 1 : 0);
        int[] iArr = this.f68720;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f68720);
        } else {
            parcel.writeInt(0);
        }
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f68717 + ", mGapDir=" + this.f68718 + ", mHasUnwantedGapAfter=" + this.f68719 + ", mGapPerSpan=" + Arrays.toString(this.f68720) + '}';
    }
}
