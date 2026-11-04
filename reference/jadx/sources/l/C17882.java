package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17882 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C17136();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f58609;

    public C17882(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f58608 = parcel.readInt();
        this.f58609 = parcel.readInt() != 0;
    }

    public C17882(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f58608);
        parcel.writeInt(this.f58609 ? 1 : 0);
    }
}
