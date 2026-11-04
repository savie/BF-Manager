package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5906 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C2177 c2177 = new C2177();
        c2177.f7166 = parcel.readInt();
        c2177.f7169 = parcel.readInt();
        c2177.f7165 = parcel.readInt();
        c2177.f7168 = parcel.readInt();
        c2177.f7167 = parcel.readInt();
        return c2177;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2177[i];
    }
}
