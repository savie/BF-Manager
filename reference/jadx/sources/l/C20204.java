package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩶ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20204 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C15971();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65559;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65560;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f65561;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65562;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65563;

    public C20204(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f65560 = 0;
        this.f65560 = parcel.readInt();
        this.f65563 = parcel.readInt();
        this.f65559 = parcel.readInt();
        this.f65562 = parcel.readInt();
        this.f65561 = parcel.readInt();
    }

    public C20204(Parcelable parcelable) {
        super(parcelable);
        this.f65560 = 0;
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f65560);
        parcel.writeInt(this.f65563);
        parcel.writeInt(this.f65559);
        parcel.writeInt(this.f65562);
        parcel.writeInt(this.f65561);
    }
}
