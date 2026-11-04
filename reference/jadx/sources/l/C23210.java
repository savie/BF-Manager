package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.᩹֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes.dex */
public final class C23210 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C15750();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f75193;

    public C23210(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f75193 = z;
    }

    public C23210(Parcel parcel) {
        super(parcel);
        this.f75193 = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f75193 ? (byte) 1 : (byte) 0);
    }
}
