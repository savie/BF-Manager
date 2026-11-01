package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֫۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1837 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C9600 c9600 = new C9600(parcel);
        c9600.f32347 = parcel.readString();
        return c9600;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C9600[i];
    }
}
