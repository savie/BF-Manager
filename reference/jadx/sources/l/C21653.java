package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩸ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21653 implements InterfaceC18831 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IBinder f70197;

    public C21653(IBinder iBinder) {
        this.f70197 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f70197;
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32596(String str, boolean z, boolean z2, boolean z3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            parcelObtain.writeInt(z3 ? 1 : 0);
            this.f70197.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f70197.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۡ */
    public final String[] mo32601() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f70197.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۖ */
    public final String mo32594(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ᩹ */
    public final String mo32608(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo32606(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۚ */
    public final int[] mo32600(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۨ */
    public final int[] mo32604(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo32598(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f70197.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ܰ */
    public final int mo32605(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ᩹ */
    public final String mo32607(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo32597(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۖ */
    public final int[] mo32595(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۨ */
    public final int[] mo32603(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۚ */
    public final void mo32599(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f70197.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18831
    /* JADX INFO: renamed from: ۤ */
    public final int mo32602() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f70197.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
