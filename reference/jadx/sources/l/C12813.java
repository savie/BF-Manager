package l;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes3.dex */
public final class C12813 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0817();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Intent f42664;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f42665;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C12813(Intent intent, int i) {
        this.f42665 = i;
        this.f42664 = intent;
    }

    public C12813(Parcel parcel) {
        this.f42665 = parcel.readInt();
        this.f42664 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31806() {
        return this.f42665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent m31805() {
        return this.f42664;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f42665;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f42664);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42665);
        Intent intent = this.f42664;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
