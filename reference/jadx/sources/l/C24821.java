package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩻ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes.dex */
public final class C24821 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C16615 c16615 = new C16615();
        c16615.f53736 = parcel.readString();
        c16615.f53735 = parcel.readInt();
        return c16615;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C16615[i];
    }
}
