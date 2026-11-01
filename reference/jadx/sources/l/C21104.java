package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.᩷᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21104 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C7699();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68745;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f68745 ? 1 : 0);
    }

    public C21104(Parcel parcel) {
        super(parcel);
        this.f68745 = parcel.readInt() == 1;
    }

    public C21104() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
