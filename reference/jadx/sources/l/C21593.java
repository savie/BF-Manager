package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩸۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21593 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C18065 c18065 = new C18065();
        c18065.f57776 = parcel.readString();
        c18065.f57775 = parcel.readInt();
        return c18065;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C18065[i];
    }
}
