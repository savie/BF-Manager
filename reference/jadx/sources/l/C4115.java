package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4115 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C13289();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15076;

    public C4115(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15075 = parcel.readInt();
        this.f15076 = parcel.readInt() != 0;
    }

    public C4115(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15075);
        parcel.writeInt(this.f15076 ? 1 : 0);
    }
}
