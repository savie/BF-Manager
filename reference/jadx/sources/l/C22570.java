package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AKI */
/* JADX INFO: loaded from: classes.dex */
public final class C22570 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5636();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f73553;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f73554;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73555;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f73556;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f73557;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73558;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f73559;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f73560;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f73561;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f73562;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f73563;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f73565;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f73566;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C22570(C2813 c2813) {
        int size = c2813.f38515.size();
        this.f73561 = new int[size * 6];
        if (!c2813.f38513) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f73564 = new ArrayList(size);
        this.f73566 = new int[size];
        this.f73560 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13564 c13564 = (C13564) c2813.f38515.get(i2);
            int i3 = i + 1;
            this.f73561[i] = c13564.f44745;
            ArrayList arrayList = this.f73564;
            ComponentCallbacksC22654 componentCallbacksC22654 = c13564.f44746;
            arrayList.add(componentCallbacksC22654 != null ? componentCallbacksC22654.mWho : null);
            int[] iArr = this.f73561;
            iArr[i3] = c13564.f44750 ? 1 : 0;
            iArr[i + 2] = c13564.f44747;
            iArr[i + 3] = c13564.f44743;
            int i4 = i + 5;
            iArr[i + 4] = c13564.f44748;
            i += 6;
            iArr[i4] = c13564.f44744;
            this.f73566[i2] = c13564.f44742.ordinal();
            this.f73560[i2] = c13564.f44749.ordinal();
        }
        this.f73556 = c2813.f38516;
        this.f73559 = c2813.f38512;
        this.f73557 = c2813.f10689;
        this.f73553 = c2813.f38514;
        this.f73563 = c2813.f38524;
        this.f73562 = c2813.f38517;
        this.f73565 = c2813.f38511;
        this.f73558 = c2813.f38521;
        this.f73555 = c2813.f38522;
        this.f73554 = c2813.f38523;
    }

    public C22570(Parcel parcel) {
        this.f73561 = parcel.createIntArray();
        this.f73564 = parcel.createStringArrayList();
        this.f73566 = parcel.createIntArray();
        this.f73560 = parcel.createIntArray();
        this.f73556 = parcel.readInt();
        this.f73559 = parcel.readString();
        this.f73557 = parcel.readInt();
        this.f73553 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f73563 = (CharSequence) creator.createFromParcel(parcel);
        this.f73562 = parcel.readInt();
        this.f73565 = (CharSequence) creator.createFromParcel(parcel);
        this.f73558 = parcel.createStringArrayList();
        this.f73555 = parcel.createStringArrayList();
        this.f73554 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f73561);
        parcel.writeStringList(this.f73564);
        parcel.writeIntArray(this.f73566);
        parcel.writeIntArray(this.f73560);
        parcel.writeInt(this.f73556);
        parcel.writeString(this.f73559);
        parcel.writeInt(this.f73557);
        parcel.writeInt(this.f73553);
        TextUtils.writeToParcel(this.f73563, parcel, 0);
        parcel.writeInt(this.f73562);
        TextUtils.writeToParcel(this.f73565, parcel, 0);
        parcel.writeStringList(this.f73558);
        parcel.writeStringList(this.f73555);
        parcel.writeInt(this.f73554 ? 1 : 0);
    }
}
