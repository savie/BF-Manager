package l;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8205 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6793();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f28565;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PlaybackState f28566;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Bundle f28567;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f28568;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f28569;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f28570;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f28571;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f28572;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f28573;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f28574;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f28575;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f28576;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C8205(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f28571 = i;
        this.f28569 = j;
        this.f28565 = j2;
        this.f28576 = f;
        this.f28572 = j3;
        this.f28570 = i2;
        this.f28574 = charSequence;
        this.f28568 = j4;
        this.f28573 = new ArrayList(arrayList);
        this.f28575 = j5;
        this.f28567 = bundle;
    }

    public C8205(Parcel parcel) {
        this.f28571 = parcel.readInt();
        this.f28569 = parcel.readLong();
        this.f28576 = parcel.readFloat();
        this.f28568 = parcel.readLong();
        this.f28565 = parcel.readLong();
        this.f28572 = parcel.readLong();
        this.f28574 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f28573 = parcel.createTypedArrayList(C18788.CREATOR);
        this.f28575 = parcel.readLong();
        this.f28567 = parcel.readBundle(C1148.class.getClassLoader());
        this.f28570 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f28571);
        sb.append(", position=");
        sb.append(this.f28569);
        sb.append(", buffered position=");
        sb.append(this.f28565);
        sb.append(", speed=");
        sb.append(this.f28576);
        sb.append(", updated=");
        sb.append(this.f28568);
        sb.append(", actions=");
        sb.append(this.f28572);
        sb.append(", error code=");
        sb.append(this.f28570);
        sb.append(", error message=");
        sb.append(this.f28574);
        sb.append(", custom actions=");
        sb.append(this.f28573);
        sb.append(", active item id=");
        return C15037.m36023(sb, this.f28575, l.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28571);
        parcel.writeLong(this.f28569);
        parcel.writeFloat(this.f28576);
        parcel.writeLong(this.f28568);
        parcel.writeLong(this.f28565);
        parcel.writeLong(this.f28572);
        TextUtils.writeToParcel(this.f28574, parcel, i);
        parcel.writeTypedList(this.f28573);
        parcel.writeLong(this.f28575);
        parcel.writeBundle(this.f28567);
        parcel.writeInt(this.f28570);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PlaybackState m21493() {
        if (this.f28566 == null) {
            PlaybackState.Builder builderM50925 = C23022.m50925();
            C23022.m50930(builderM50925, this.f28571, this.f28569, this.f28576, this.f28568);
            C23022.m50938(builderM50925, this.f28565);
            C23022.m50931(builderM50925, this.f28572);
            C23022.m50933(builderM50925, this.f28574);
            Iterator it = this.f28573.iterator();
            while (it.hasNext()) {
                C23022.m50932(builderM50925, ((C18788) it.next()).m43354());
            }
            C23022.m50942(builderM50925, this.f28575);
            if (Build.VERSION.SDK_INT >= 22) {
                C15261.m36538(builderM50925, this.f28567);
            }
            this.f28566 = C23022.m50928(builderM50925);
        }
        return this.f28566;
    }
}
