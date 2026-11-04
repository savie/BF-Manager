package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.۬ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13905 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C7194();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44109;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44110;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44111;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f44110);
        parcel.writeInt(this.f44111);
        parcel.writeInt(this.f44109);
    }

    public C13905(Parcel parcel) {
        super(parcel);
        this.f44110 = parcel.readInt();
        this.f44111 = parcel.readInt();
        this.f44109 = parcel.readInt();
    }

    public C13905() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
