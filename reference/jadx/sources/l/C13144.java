package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13144 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C3970 c3970 = new C3970();
        c3970.f14734 = parcel.readInt();
        c3970.f14737 = parcel.readInt();
        c3970.f14736 = parcel.readInt();
        c3970.f14733 = parcel.readInt();
        c3970.f14735 = parcel.readInt();
        return c3970;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C3970[i];
    }
}
