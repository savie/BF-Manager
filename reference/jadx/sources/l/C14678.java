package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14678 extends AbstractC6898 {
    public static final Parcelable.Creator CREATOR = new C4238();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f47982;

    public C14678(Parcelable parcelable) {
        super(parcelable);
    }

    public C14678(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f47982 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // l.AbstractC6898, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f47982));
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f47982 + l.d;
    }
}
