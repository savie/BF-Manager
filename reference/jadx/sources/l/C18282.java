package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ᩳ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18282 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C21810();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f58330;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58331;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58332;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f58330);
        parcel.writeInt(this.f58332);
        parcel.writeInt(this.f58331);
    }

    public C18282(Parcel parcel) {
        super(parcel);
        this.f58330 = parcel.readInt();
        this.f58332 = parcel.readInt();
        this.f58331 = parcel.readInt();
    }

    public C18282() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
