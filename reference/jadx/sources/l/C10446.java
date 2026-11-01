package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10446 extends AbstractC3000 {
    public static final Parcelable.Creator CREATOR = new C9035();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35671;

    public C10446(Parcelable parcelable) {
        super(parcelable);
    }

    public C10446(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35671 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // l.AbstractC3000, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f35671));
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f35671 + l.d;
    }
}
