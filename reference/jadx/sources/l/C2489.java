package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۖۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2489 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C11663();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f9890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9891;

    public C2489(Parcelable parcelable) {
        super(parcelable);
    }

    public C2489(Parcel parcel) {
        super(parcel, null);
        this.f9890 = parcel.readInt() != 0;
        this.f9891 = parcel.readInt();
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9890 ? 1 : 0);
        parcel.writeInt(this.f9891);
    }
}
