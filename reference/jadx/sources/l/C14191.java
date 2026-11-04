package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.۬᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14191 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C7480();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f44867;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f44867);
    }

    public C14191(Parcel parcel) {
        super(parcel);
        this.f44867 = parcel.readString();
    }

    public C14191() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
