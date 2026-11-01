package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩵ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19610 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C8321();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Parcelable f62961;

    public C19610(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f62961 = parcel.readParcelable(classLoader == null ? AbstractC5498.class.getClassLoader() : classLoader);
    }

    public C19610(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f62961, 0);
    }
}
