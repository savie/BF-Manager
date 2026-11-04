package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.۫᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13358 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C15595();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42592;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f42592 ? 1 : 0);
    }

    public C13358(Parcel parcel) {
        super(parcel);
        this.f42592 = parcel.readInt() == 1;
    }

    public C13358() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
