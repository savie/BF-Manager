package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.ܿۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17307 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C12369();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f55087;

    public C17307(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f55087 = z;
    }

    public C17307(Parcel parcel) {
        super(parcel);
        this.f55087 = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f55087 ? (byte) 1 : (byte) 0);
    }
}
