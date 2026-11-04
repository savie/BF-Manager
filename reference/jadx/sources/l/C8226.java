package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.۟᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8226 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C0768();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f27076;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27076);
    }

    public C8226(Parcel parcel) {
        super(parcel);
        this.f27076 = parcel.readString();
    }

    public C8226() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
