package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7809 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C0351();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26017;

    public C7809(Parcelable parcelable) {
        super(parcelable);
    }

    public C7809(Parcel parcel) {
        super(parcel, null);
        this.f26016 = parcel.readInt() != 0;
        this.f26017 = parcel.readInt();
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f26016 ? 1 : 0);
        parcel.writeInt(this.f26017);
    }
}
