package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7516 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0058();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f24830;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f24831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f24832;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f24833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11990 f24834;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C7516(C6025 c6025) {
        this.f24830 = c6025.f20607;
        this.f24832 = c6025.f20613;
        this.f24833 = c6025.f20615;
        this.f24831 = c6025.f20610;
        this.f24834 = c6025.f20616;
    }

    public C7516(Parcel parcel) {
        String string = parcel.readString();
        C17359.requireNonNull(string);
        this.f24830 = string;
        String string2 = parcel.readString();
        C17359.requireNonNull(string2);
        this.f24832 = string2;
        String string3 = parcel.readString();
        C17359.requireNonNull(string3);
        this.f24833 = string3;
        String string4 = parcel.readString();
        C17359.requireNonNull(string4);
        this.f24831 = string4;
        String string5 = parcel.readString();
        C11990 c11990 = new C11990();
        c11990.m30128(string5);
        this.f24834 = c11990;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24830);
        parcel.writeString(this.f24832);
        parcel.writeString(this.f24833);
        parcel.writeString(this.f24831);
        parcel.writeString(this.f24834.m30127());
    }
}
