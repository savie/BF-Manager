package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes4.dex */
public final class C14876 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4436();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final IntentSender f48608;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Intent f48609;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f48610;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f48611;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C14876(IntentSender intentSender, Intent intent, int i, int i2) {
        C15243.m36590(intentSender, "intentSender");
        this.f48608 = intentSender;
        this.f48609 = intent;
        this.f48611 = i;
        this.f48610 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C15243.m36590(parcel, "dest");
        parcel.writeParcelable(this.f48608, i);
        parcel.writeParcelable(this.f48609, i);
        parcel.writeInt(this.f48611);
        parcel.writeInt(this.f48610);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final IntentSender m35817() {
        return this.f48608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent m35814() {
        return this.f48609;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35816() {
        return this.f48611;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35815() {
        return this.f48610;
    }
}
