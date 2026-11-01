package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۫֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W23P */
/* JADX INFO: loaded from: classes3.dex */
public class C12100 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16333();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23389 f40471;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C12100(InterfaceC23389 interfaceC23389) {
        this.f40471 = interfaceC23389;
    }

    public C12100(Parcel parcel) {
        this.f40471 = new C10689(parcel).m15816();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23389 m30089() {
        return this.f40471;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C10689(parcel).m15832(this.f40471);
    }
}
