package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֡ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0208 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18107();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f1400;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f1401;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f1402;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f1403;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f1404;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Bundle f1405;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f1406;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f1407;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f1408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f1409;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f1410;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f1411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f1412;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C0208(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f1412 = componentCallbacksC11612.getClass().getName();
        this.f1408 = componentCallbacksC11612.mWho;
        this.f1411 = componentCallbacksC11612.mFromLayout;
        this.f1404 = componentCallbacksC11612.mFragmentId;
        this.f1410 = componentCallbacksC11612.mContainerId;
        this.f1403 = componentCallbacksC11612.mTag;
        this.f1402 = componentCallbacksC11612.mRetainInstance;
        this.f1406 = componentCallbacksC11612.mRemoving;
        this.f1400 = componentCallbacksC11612.mDetached;
        this.f1409 = componentCallbacksC11612.mArguments;
        this.f1407 = componentCallbacksC11612.mHidden;
        this.f1401 = componentCallbacksC11612.mMaxState.ordinal();
    }

    public C0208(Parcel parcel) {
        this.f1412 = parcel.readString();
        this.f1408 = parcel.readString();
        this.f1411 = parcel.readInt() != 0;
        this.f1404 = parcel.readInt();
        this.f1410 = parcel.readInt();
        this.f1403 = parcel.readString();
        this.f1402 = parcel.readInt() != 0;
        this.f1406 = parcel.readInt() != 0;
        this.f1400 = parcel.readInt() != 0;
        this.f1409 = parcel.readBundle();
        this.f1407 = parcel.readInt() != 0;
        this.f1405 = parcel.readBundle();
        this.f1401 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(128, "FragmentState{");
        sbM3018.append(this.f1412);
        sbM3018.append(" (");
        sbM3018.append(this.f1408);
        sbM3018.append(")}:");
        if (this.f1411) {
            sbM3018.append(" fromLayout");
        }
        int i = this.f1410;
        if (i != 0) {
            sbM3018.append(" id=0x");
            sbM3018.append(Integer.toHexString(i));
        }
        String str = this.f1403;
        if (str != null && !str.isEmpty()) {
            sbM3018.append(" tag=");
            sbM3018.append(str);
        }
        if (this.f1402) {
            sbM3018.append(" retainInstance");
        }
        if (this.f1406) {
            sbM3018.append(" removing");
        }
        if (this.f1400) {
            sbM3018.append(" detached");
        }
        if (this.f1407) {
            sbM3018.append(" hidden");
        }
        return sbM3018.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1412);
        parcel.writeString(this.f1408);
        parcel.writeInt(this.f1411 ? 1 : 0);
        parcel.writeInt(this.f1404);
        parcel.writeInt(this.f1410);
        parcel.writeString(this.f1403);
        parcel.writeInt(this.f1402 ? 1 : 0);
        parcel.writeInt(this.f1406 ? 1 : 0);
        parcel.writeInt(this.f1400 ? 1 : 0);
        parcel.writeBundle(this.f1409);
        parcel.writeInt(this.f1407 ? 1 : 0);
        parcel.writeBundle(this.f1405);
        parcel.writeInt(this.f1401);
    }
}
