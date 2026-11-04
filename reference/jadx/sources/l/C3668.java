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

/* JADX INFO: renamed from: l.ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3668 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C11871();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f12603;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f12604;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f12605;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f12606;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f12607;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PlaybackState f12608;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float f12609;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Bundle f12610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f12611;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f12612;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f12613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f12614;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C3668(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f12605 = i;
        this.f12604 = j;
        this.f12612 = j2;
        this.f12609 = f;
        this.f12611 = j3;
        this.f12607 = i2;
        this.f12613 = charSequence;
        this.f12606 = j4;
        this.f12603 = new ArrayList(arrayList);
        this.f12614 = j5;
        this.f12610 = bundle;
    }

    public C3668(Parcel parcel) {
        this.f12605 = parcel.readInt();
        this.f12604 = parcel.readLong();
        this.f12609 = parcel.readFloat();
        this.f12606 = parcel.readLong();
        this.f12612 = parcel.readLong();
        this.f12611 = parcel.readLong();
        this.f12613 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12603 = parcel.createTypedArrayList(C23806.CREATOR);
        this.f12614 = parcel.readLong();
        this.f12610 = parcel.readBundle(C13363.class.getClassLoader());
        this.f12607 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f12605);
        sb.append(", position=");
        sb.append(this.f12604);
        sb.append(", buffered position=");
        sb.append(this.f12612);
        sb.append(", speed=");
        sb.append(this.f12609);
        sb.append(", updated=");
        sb.append(this.f12606);
        sb.append(", actions=");
        sb.append(this.f12611);
        sb.append(", error code=");
        sb.append(this.f12607);
        sb.append(", error message=");
        sb.append(this.f12613);
        sb.append(", custom actions=");
        sb.append(this.f12603);
        sb.append(", active item id=");
        return C2764.m9137(sb, this.f12614, l.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12605);
        parcel.writeLong(this.f12604);
        parcel.writeFloat(this.f12609);
        parcel.writeLong(this.f12606);
        parcel.writeLong(this.f12612);
        parcel.writeLong(this.f12611);
        TextUtils.writeToParcel(this.f12613, parcel, i);
        parcel.writeTypedList(this.f12603);
        parcel.writeLong(this.f12614);
        parcel.writeBundle(this.f12610);
        parcel.writeInt(this.f12607);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PlaybackState m11924() {
        if (this.f12608 == null) {
            PlaybackState.Builder builderM56488 = C25298.m56488();
            C25298.m56492(builderM56488, this.f12605, this.f12604, this.f12609, this.f12606);
            C25298.m56497(builderM56488, this.f12612);
            C25298.m56493(builderM56488, this.f12611);
            C25298.m56495(builderM56488, this.f12613);
            Iterator it = this.f12603.iterator();
            while (it.hasNext()) {
                C25298.m56494(builderM56488, ((C23806) it.next()).m53106());
            }
            C25298.m56498(builderM56488, this.f12614);
            if (Build.VERSION.SDK_INT >= 22) {
                C17092.m40258(builderM56488, this.f12610);
            }
            this.f12608 = C25298.m56491(builderM56488);
        }
        return this.f12608;
    }
}
