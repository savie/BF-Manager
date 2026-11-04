package l;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25028 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80982;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f80983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f80984;

    public /* synthetic */ RunnableC25028(int i, Object obj, Object obj2) {
        this.f80982 = i;
        this.f80984 = obj;
        this.f80983 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f80982;
        Object obj = this.f80983;
        Object obj2 = this.f80984;
        switch (i) {
            case 0:
                InputStream inputStream = (InputStream) obj2;
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) obj;
                String str = C17568.f57086;
                try {
                    try {
                        try {
                            C21298.m48534(inputStream, autoCloseOutputStream, -1L, null);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            autoCloseOutputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        break;
                    }
                    throw th3;
                }
            case 1:
                DialogInterfaceOnClickListenerC14300.m34716((DialogInterfaceOnClickListenerC14300) obj2, (C13511) obj);
                return;
            default:
                int i2 = C22479.f72748;
                ((AbstractC22044) obj2).mo2942(((AbstractC6662) obj).m18627());
                return;
        }
    }
}
