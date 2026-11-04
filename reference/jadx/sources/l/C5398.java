package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۚۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5398 extends C3160 {
    public static final Parcelable.Creator CREATOR = new C12855();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f18890;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f18890.size());
        HashSet hashSet = this.f18890;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C5398(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f18890 = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f18890, strArr);
    }

    public C5398() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
