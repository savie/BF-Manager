package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8094 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C18677();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f28355;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Parcelable f28356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ClassLoader f28357;

    public C8094(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f28355);
        parcel.writeParcelable(this.f28356, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return C12441.m30911(this.f28355, l.d, sb);
    }

    public C8094(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C8094.class.getClassLoader() : classLoader;
        this.f28355 = parcel.readInt();
        this.f28356 = parcel.readParcelable(classLoader);
        this.f28357 = classLoader;
    }
}
