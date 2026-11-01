package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ᩳ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18303 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C21831();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f58395;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f58395);
    }

    public C18303(Parcel parcel) {
        super(parcel);
        this.f58395 = parcel.readString();
    }

    public C18303() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
