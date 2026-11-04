package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩶֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes5.dex */
public final class C20950 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C17966 c17966 = new C17966();
        c17966.f58885 = parcel.readInt();
        c17966.f58886 = parcel.readInt();
        c17966.f58884 = parcel.readInt() == 1;
        return c17966;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C17966[i];
    }
}
