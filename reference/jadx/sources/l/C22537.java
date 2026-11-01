package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.᩹᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes.dex */
public final class C22537 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C5603();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f73507;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f73507);
    }

    public C22537(Parcel parcel) {
        super(parcel);
        this.f73507 = parcel.readString();
    }

    public C22537() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
