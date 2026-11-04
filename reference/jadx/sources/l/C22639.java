package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes.dex */
public final class C22639 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C10704();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Parcelable f73540;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73541;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ClassLoader f73542;

    public C22639(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f73541);
        parcel.writeParcelable(this.f73540, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return C12669.m31437(this.f73541, l.d, sb);
    }

    public C22639(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C22639.class.getClassLoader() : classLoader;
        this.f73541 = parcel.readInt();
        this.f73540 = parcel.readParcelable(classLoader);
        this.f73542 = classLoader;
    }
}
