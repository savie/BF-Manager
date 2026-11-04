package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19769 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C15293 c15293 = new C15293();
        c15293.f50002 = parcel.readInt();
        return c15293;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C15293[i];
    }
}
