package l;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes3.dex */
public final class C11893 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2199();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Intent f38315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38316;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C11893(Intent intent, int i) {
        this.f38316 = i;
        this.f38315 = intent;
    }

    public C11893(Parcel parcel) {
        this.f38316 = parcel.readInt();
        this.f38315 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29771() {
        return this.f38316;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent m29770() {
        return this.f38315;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f38316;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f38315);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38316);
        Intent intent = this.f38315;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
