package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ܽܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16747 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C0518();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53626;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f53626);
    }

    public C16747(Parcel parcel) {
        super(parcel);
        this.f53626 = parcel.readInt();
    }

    public C16747(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f53626 = i;
    }
}
