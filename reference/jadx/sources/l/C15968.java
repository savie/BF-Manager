package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܶ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W23P */
/* JADX INFO: loaded from: classes4.dex */
public class C15968 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12239 f51843;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C15968(InterfaceC12239 interfaceC12239) {
        this.f51843 = interfaceC12239;
    }

    public C15968(Parcel parcel) {
        this.f51843 = new C20444(parcel).m10837();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12239 m38084() {
        return this.f51843;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C20444(parcel).m10853(this.f51843);
    }
}
