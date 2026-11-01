package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7499 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC10322 c19494;
        C15967 c15967 = new C15967();
        IBinder strongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC8911.f30562;
        if (strongBinder == null) {
            c19494 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC10322.f35390);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC10322)) {
                c19494 = (InterfaceC10322) iInterfaceQueryLocalInterface;
            } else {
                c19494 = new C19494(strongBinder);
            }
        }
        c15967.f51730 = c19494;
        return c15967;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C15967[i];
    }
}
