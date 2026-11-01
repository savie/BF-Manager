package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes2.dex */
public final class C7168 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9991();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f23952;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Intent f23953;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IntentSender f23954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23955;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C7168(IntentSender intentSender, Intent intent, int i, int i2) {
        C13465.m32966(intentSender, "intentSender");
        this.f23954 = intentSender;
        this.f23953 = intent;
        this.f23955 = i;
        this.f23952 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C13465.m32966(parcel, "dest");
        parcel.writeParcelable(this.f23954, i);
        parcel.writeParcelable(this.f23953, i);
        parcel.writeInt(this.f23955);
        parcel.writeInt(this.f23952);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final IntentSender m19097() {
        return this.f23954;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent m19098() {
        return this.f23953;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m19100() {
        return this.f23955;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19099() {
        return this.f23952;
    }
}
