package l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18788 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18082();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60905;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f60906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f60907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f60908;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C18788(Parcel parcel) {
        this.f60906 = parcel.readString();
        this.f60907 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f60905 = parcel.readInt();
        this.f60908 = parcel.readBundle(C1148.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60906);
        TextUtils.writeToParcel(this.f60907, parcel, i);
        parcel.writeInt(this.f60905);
        parcel.writeBundle(this.f60908);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PlaybackState.CustomAction m43354() {
        PlaybackState.CustomAction.Builder builderM50926 = C23022.m50926(this.f60906, this.f60907, this.f60905);
        C23022.m50934(builderM50926, this.f60908);
        return C23022.m50927(builderM50926);
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f60907) + ", mIcon=" + this.f60905 + ", mExtras=" + this.f60908;
    }
}
