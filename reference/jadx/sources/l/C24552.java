package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes.dex */
public final class C24552 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC6652 c20822;
        C14854 c14854 = new C14854();
        IBinder strongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC12617.f40479;
        if (strongBinder == null) {
            c20822 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC6652.f22187);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC6652)) {
                c20822 = (InterfaceC6652) iInterfaceQueryLocalInterface;
            } else {
                c20822 = new C20822(strongBinder);
            }
        }
        c14854.f48561 = c20822;
        return c14854;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C14854[i];
    }
}
