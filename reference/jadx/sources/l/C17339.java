package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܽۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17339 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C15847 c15847 = new C15847(parcel);
        c15847.f51542 = parcel.readInt();
        return c15847;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C15847[i];
    }
}
