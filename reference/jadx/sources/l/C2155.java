package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.֫᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C2155 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C5884();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SparseArray f7106;

    public C2155(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f7106 = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f7106.append(iArr[i2], parcelableArray[i2]);
        }
    }

    public C2155(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f7106;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f7106.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f7106.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
