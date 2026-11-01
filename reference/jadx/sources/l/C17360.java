package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܿ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17360 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12422();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f55229;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bundle f55230;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f55231;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f55232;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f55233;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f55234;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f55235;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f55236;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bundle f55237;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f55238;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f55239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f55240;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f55241;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C17360(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f55240 = componentCallbacksC22654.getClass().getName();
        this.f55231 = componentCallbacksC22654.mWho;
        this.f55239 = componentCallbacksC22654.mFromLayout;
        this.f55235 = componentCallbacksC22654.mFragmentId;
        this.f55229 = componentCallbacksC22654.mContainerId;
        this.f55233 = componentCallbacksC22654.mTag;
        this.f55236 = componentCallbacksC22654.mRetainInstance;
        this.f55241 = componentCallbacksC22654.mRemoving;
        this.f55238 = componentCallbacksC22654.mDetached;
        this.f55237 = componentCallbacksC22654.mArguments;
        this.f55232 = componentCallbacksC22654.mHidden;
        this.f55234 = componentCallbacksC22654.mMaxState.ordinal();
    }

    public C17360(Parcel parcel) {
        this.f55240 = parcel.readString();
        this.f55231 = parcel.readString();
        this.f55239 = parcel.readInt() != 0;
        this.f55235 = parcel.readInt();
        this.f55229 = parcel.readInt();
        this.f55233 = parcel.readString();
        this.f55236 = parcel.readInt() != 0;
        this.f55241 = parcel.readInt() != 0;
        this.f55238 = parcel.readInt() != 0;
        this.f55237 = parcel.readBundle();
        this.f55232 = parcel.readInt() != 0;
        this.f55230 = parcel.readBundle();
        this.f55234 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(128, "FragmentState{");
        sbM40152.append(this.f55240);
        sbM40152.append(" (");
        sbM40152.append(this.f55231);
        sbM40152.append(")}:");
        if (this.f55239) {
            sbM40152.append(" fromLayout");
        }
        int i = this.f55229;
        if (i != 0) {
            sbM40152.append(" id=0x");
            sbM40152.append(Integer.toHexString(i));
        }
        String str = this.f55233;
        if (str != null && !str.isEmpty()) {
            sbM40152.append(" tag=");
            sbM40152.append(str);
        }
        if (this.f55236) {
            sbM40152.append(" retainInstance");
        }
        if (this.f55241) {
            sbM40152.append(" removing");
        }
        if (this.f55238) {
            sbM40152.append(" detached");
        }
        if (this.f55232) {
            sbM40152.append(" hidden");
        }
        return sbM40152.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55240);
        parcel.writeString(this.f55231);
        parcel.writeInt(this.f55239 ? 1 : 0);
        parcel.writeInt(this.f55235);
        parcel.writeInt(this.f55229);
        parcel.writeString(this.f55233);
        parcel.writeInt(this.f55236 ? 1 : 0);
        parcel.writeInt(this.f55241 ? 1 : 0);
        parcel.writeInt(this.f55238 ? 1 : 0);
        parcel.writeBundle(this.f55237);
        parcel.writeInt(this.f55232 ? 1 : 0);
        parcel.writeBundle(this.f55230);
        parcel.writeInt(this.f55234);
    }
}
