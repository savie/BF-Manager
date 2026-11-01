package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16187 extends C23948 {
    public static final Parcelable.Creator CREATOR = new C21125();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f52281;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f52281.size());
        HashSet hashSet = this.f52281;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C16187(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f52281 = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f52281, strArr);
    }

    public C16187() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
