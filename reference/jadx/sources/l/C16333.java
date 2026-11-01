package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܽ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W23P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16333 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C12100(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C12100[i];
    }
}
