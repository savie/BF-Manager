package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: l.᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C23060 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C11125();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ResultReceiver f74811;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f74811.writeToParcel(parcel, i);
    }
}
