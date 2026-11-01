package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes3.dex */
public final class C7482 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C20888 c20888 = new C20888();
        c20888.f67840 = null;
        c20888.f67841 = new ArrayList();
        c20888.f67844 = new ArrayList();
        c20888.f67842 = parcel.createStringArrayList();
        c20888.f67845 = parcel.createStringArrayList();
        c20888.f67838 = (C22570[]) parcel.createTypedArray(C22570.CREATOR);
        c20888.f67843 = parcel.readInt();
        c20888.f67840 = parcel.readString();
        c20888.f67841 = parcel.createStringArrayList();
        c20888.f67844 = parcel.createTypedArrayList(C13398.CREATOR);
        c20888.f67839 = parcel.createTypedArrayList(C18065.CREATOR);
        return c20888;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C20888[i];
    }
}
