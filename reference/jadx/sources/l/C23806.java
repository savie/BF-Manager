package l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes.dex */
public final class C23806 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16346();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f77110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f77111;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f77112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f77113;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C23806(Parcel parcel) {
        this.f77111 = parcel.readString();
        this.f77110 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f77112 = parcel.readInt();
        this.f77113 = parcel.readBundle(C13363.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f77111);
        TextUtils.writeToParcel(this.f77110, parcel, i);
        parcel.writeInt(this.f77112);
        parcel.writeBundle(this.f77113);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PlaybackState.CustomAction m53106() {
        PlaybackState.CustomAction.Builder builderM56489 = C25298.m56489(this.f77111, this.f77110, this.f77112);
        C25298.m56496(builderM56489, this.f77113);
        return C25298.m56490(builderM56489);
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f77110) + ", mIcon=" + this.f77112 + ", mExtras=" + this.f77113;
    }
}
