package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9RQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5340 implements IBinder {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final IBinder f18764;

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }

    public C5340(IBinder iBinder) {
        C17359.requireNonNull(iBinder);
        this.f18764 = iBinder;
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = !C12797.m31698() && C12797.m31699() >= 13;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(this.f18764);
            parcelObtain.writeInt(i);
            if (z) {
                parcelObtain.writeInt(i2);
            }
            parcelObtain.appendFrom(parcel, 0, parcel.dataSize());
            if (z) {
                try {
                    C12797.m31693().asBinder().transact(1, parcelObtain, parcel2, 0);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    C12797.m31693().asBinder().transact(1, parcelObtain, parcel2, i2);
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            }
            parcelObtain.recycle();
            return true;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.f18764.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return this.f18764.pingBinder();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.f18764.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f18764.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f18764.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.f18764.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f18764.unlinkToDeath(deathRecipient, i);
    }
}
