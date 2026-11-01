package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6840 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4017();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f23039;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f23040;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f23041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f23042;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13897 f23043;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C6840(C11780 c11780) {
        this.f23042 = c11780.f39567;
        this.f23041 = c11780.f39570;
        this.f23039 = c11780.f39572;
        this.f23040 = c11780.f39565;
        this.f23043 = c11780.f39573;
    }

    public C6840(Parcel parcel) {
        String string = parcel.readString();
        C13638.requireNonNull(string);
        this.f23042 = string;
        String string2 = parcel.readString();
        C13638.requireNonNull(string2);
        this.f23041 = string2;
        String string3 = parcel.readString();
        C13638.requireNonNull(string3);
        this.f23039 = string3;
        String string4 = parcel.readString();
        C13638.requireNonNull(string4);
        this.f23040 = string4;
        String string5 = parcel.readString();
        C13897 c13897 = new C13897();
        c13897.m33734(string5);
        this.f23043 = c13897;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23042);
        parcel.writeString(this.f23041);
        parcel.writeString(this.f23039);
        parcel.writeString(this.f23040);
        parcel.writeString(this.f23043.m33733());
    }
}
