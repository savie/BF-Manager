package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.᩻ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes.dex */
public final class C25095 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C11668();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f81155;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f81155);
    }

    public C25095(Parcel parcel) {
        super(parcel);
        this.f81155 = parcel.readInt();
    }

    public C25095(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f81155 = i;
    }
}
