package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AKI */
/* JADX INFO: loaded from: classes.dex */
public final class C22866 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10931();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f74307;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f74308;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f74309;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f74310;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74311;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int[] f74312;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f74313;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f74314;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f74315;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f74316;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74317;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f74318;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f74320;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C22866(C22120 c22120) {
        int size = c22120.f16266.size();
        this.f74309 = new int[size * 6];
        if (!c22120.f16263) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f74319 = new ArrayList(size);
        this.f74314 = new int[size];
        this.f74312 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13631 c13631 = (C13631) c22120.f16266.get(i2);
            int i3 = i + 1;
            this.f74309[i] = c13631.f43284;
            ArrayList arrayList = this.f74319;
            ComponentCallbacksC11612 componentCallbacksC11612 = c13631.f43289;
            arrayList.add(componentCallbacksC11612 != null ? componentCallbacksC11612.mWho : null);
            int[] iArr = this.f74309;
            iArr[i3] = c13631.f43288 ? 1 : 0;
            iArr[i + 2] = c13631.f43286;
            iArr[i + 3] = c13631.f43291;
            int i4 = i + 5;
            iArr[i + 4] = c13631.f43285;
            i += 6;
            iArr[i4] = c13631.f43283;
            this.f74314[i2] = c13631.f43287.ordinal();
            this.f74312[i2] = c13631.f43290.ordinal();
        }
        this.f74310 = c22120.f16262;
        this.f74308 = c22120.f16261;
        this.f74315 = c22120.f71290;
        this.f74318 = c22120.f16272;
        this.f74307 = c22120.f16268;
        this.f74317 = c22120.f16265;
        this.f74320 = c22120.f16274;
        this.f74311 = c22120.f16269;
        this.f74316 = c22120.f16275;
        this.f74313 = c22120.f16271;
    }

    public C22866(Parcel parcel) {
        this.f74309 = parcel.createIntArray();
        this.f74319 = parcel.createStringArrayList();
        this.f74314 = parcel.createIntArray();
        this.f74312 = parcel.createIntArray();
        this.f74310 = parcel.readInt();
        this.f74308 = parcel.readString();
        this.f74315 = parcel.readInt();
        this.f74318 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f74307 = (CharSequence) creator.createFromParcel(parcel);
        this.f74317 = parcel.readInt();
        this.f74320 = (CharSequence) creator.createFromParcel(parcel);
        this.f74311 = parcel.createStringArrayList();
        this.f74316 = parcel.createStringArrayList();
        this.f74313 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f74309);
        parcel.writeStringList(this.f74319);
        parcel.writeIntArray(this.f74314);
        parcel.writeIntArray(this.f74312);
        parcel.writeInt(this.f74310);
        parcel.writeString(this.f74308);
        parcel.writeInt(this.f74315);
        parcel.writeInt(this.f74318);
        TextUtils.writeToParcel(this.f74307, parcel, 0);
        parcel.writeInt(this.f74317);
        TextUtils.writeToParcel(this.f74320, parcel, 0);
        parcel.writeStringList(this.f74311);
        parcel.writeStringList(this.f74316);
        parcel.writeInt(this.f74313 ? 1 : 0);
    }
}
