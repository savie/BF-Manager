package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۙᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5089 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C13709();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Parcelable f17781;

    public C5089(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17781 = parcel.readParcelable(classLoader == null ? AbstractC21169.class.getClassLoader() : classLoader);
    }

    public C5089(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f17781, 0);
    }
}
