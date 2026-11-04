package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14858 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C4418();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f48563;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f48564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48565;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48567;

    public C14858(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f48564 = 0;
        this.f48564 = parcel.readInt();
        this.f48567 = parcel.readInt();
        this.f48566 = parcel.readInt();
        this.f48563 = parcel.readInt();
        this.f48565 = parcel.readInt();
    }

    public C14858(Parcelable parcelable) {
        super(parcelable);
        this.f48564 = 0;
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f48564);
        parcel.writeInt(this.f48567);
        parcel.writeInt(this.f48566);
        parcel.writeInt(this.f48563);
        parcel.writeInt(this.f48565);
    }
}
