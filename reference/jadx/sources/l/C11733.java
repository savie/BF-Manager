package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: l.ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11733 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C2559 c2559 = new C2559();
        c2559.f10109 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return c2559;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2559[i];
    }
}
