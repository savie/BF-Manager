package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C11526 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C2352 c2352 = new C2352();
        c2352.f8300 = parcel.readInt();
        return c2352;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2352[i];
    }
}
