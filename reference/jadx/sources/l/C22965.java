package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.᩸ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes.dex */
public class C22965 extends AbstractC22044 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f74595;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8136 f74596;

    @Override // l.AbstractC22044
    public String getParent() {
        return null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֡ */
    public boolean mo4274() {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۖ */
    public final void mo49834() {
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۗۙ */
    public final boolean mo42886() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۘ */
    public boolean mo4277() {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ */
    public boolean mo37325() {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۢۙ */
    public final boolean mo49854() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4293() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo4297() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo4301(AbstractC22044 abstractC22044) {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo49880() {
        return this instanceof C15593;
    }

    public C22965(Uri uri) {
        this.f74596 = new C8136(uri);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7464(Uri uri, boolean z) {
        this.f74596 = new C8136(uri);
        mo2952();
    }

    /* JADX INFO: renamed from: ܿ᩷ */
    public void mo2952() {
        this.f74595 = null;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۟ */
    public boolean mo4283() {
        try {
            mo4289(false).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC22044
    public String getName() {
        if (this.f74595 == null) {
            String strM46199 = C20069.m46199(this.f74596.m22013());
            this.f74595 = strM46199;
            if (strM46199 == null) {
                String path = this.f74596.m22013().getPath();
                if (path == null) {
                    throw new RuntimeException("Can't get name from uri: " + this.f74596.m22013());
                }
                this.f74595 = new File(path).getName();
            }
        }
        return this.f74595;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ */
    public String mo4294() {
        return this.f74596.toString();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤۙ */
    public final Uri mo42888() {
        return this.f74596.m22013();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo4296() {
        return C20069.m46196(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2934() {
        if (C22415.m50557()) {
            return ((Boolean) m51826(new Callable() { // from class: l.ۡ᩶ᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C20069.m46201(this.f31137.f74596.m22013()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C20069.m46201(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ */
    public boolean mo4304() {
        if (C22415.m50557()) {
            return ((Boolean) m51826(new CallableC19323(0, this), Boolean.FALSE, 500)).booleanValue();
        }
        return C20069.m46197(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ */
    public boolean mo4281() {
        if (C22415.m50557()) {
            return ((Boolean) m51826(new Callable() { // from class: l.ۙܿᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C20069.m46198(this.f17650.f74596.m22013()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C20069.m46198(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ */
    public long mo4285() {
        if (C22415.m50557()) {
            return ((Long) m51826((Callable) new CallableC2915(0, this), (Object) (-1L), 500)).longValue();
        }
        return C20069.m46189(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ */
    public long mo4286() {
        if (C22415.m50557()) {
            return ((Long) m51826((Callable) new CallableC14101(0, this), (Object) 0L, 500)).longValue();
        }
        return C20069.m46195(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo4302() {
        if (C22415.m50557()) {
            return ((Boolean) m51826(new Callable() { // from class: l.ۢ᩶ᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C20069.m46194(this.f32994.f74596.m22013()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C20069.m46194(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo4303() {
        if (C22415.m50557()) {
            return ((Boolean) m51826(new Callable() { // from class: l.ۤܿᩴ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C20069.m46200(this.f34819.f74596.m22013()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C20069.m46200(this.f74596.m22013());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public List mo4299(boolean z) {
        return new ArrayList();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۜۙ */
    public final List mo4282() {
        return (List) C1170.stream(mo4299(true)).map(new C3398(0)).collect(C2025.toList());
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۧ᩷ */
    public final InputStream mo4290() {
        return (InputStream) m51825(new Callable() { // from class: l.۠᩶ᩴ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22965.m51829(this.f29004);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m51829(C22965 c22965) throws IOException {
        try {
            return C21576.m49091().openInputStream(c22965.f74596.m22013());
        } catch (Error | RuntimeException e) {
            throw new IOException(c22965.mo4294(), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ */
    public OutputStream mo4289(final boolean z) {
        return (OutputStream) m51825(new Callable() { // from class: l.֨᩶ᩴ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22965.m51823(this.f5013, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ OutputStream m51823(C22965 c22965, boolean z) throws IOException {
        try {
            return C21576.m49091().openOutputStream(c22965.f74596.m22013(), z ? "wa" : "wt");
        } catch (Error | RuntimeException e) {
            throw new IOException(c22965.mo4294(), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ᩷ */
    public final FileChannel mo4280() throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15475 mo4276(final String str) {
        return (InterfaceC15475) m51825(new Callable() { // from class: l.ۜ᩶ᩴ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C11746.m29496(this.f24361.f74596.m22013(), str);
            }
        });
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ */
    public final ParcelFileDescriptor mo4279(final String str) {
        return (ParcelFileDescriptor) m51825(new Callable() { // from class: l.᩷ܿᩴ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22965.m51834(this.f71571, str);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ParcelFileDescriptor m51834(C22965 c22965, String str) throws IOException {
        try {
            return C21576.m49091().openFileDescriptor(c22965.f74596.m22013(), str);
        } catch (Error | RuntimeException e) {
            throw new IOException(c22965.mo4294(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m51832(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C25272.m56409("Invalid mode: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51825(Callable callable) throws IOException {
        Future futureSubmit = C5261.f18540.submit(callable);
        try {
            return futureSubmit.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (cause instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) cause;
                C22327.m50389(runtimeException);
                throw runtimeException;
            }
            if (cause instanceof Error) {
                Error error = (Error) cause;
                C22327.m50389(error);
                throw error;
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            throw new IOException("Timeout", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m51826(Callable callable, Object obj, int i) {
        Future futureSubmit = C5261.f18540.submit(callable);
        try {
            return futureSubmit.get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) cause;
                C22327.m50389(runtimeException);
                throw runtimeException;
            }
            if (cause instanceof Error) {
                Error error = (Error) cause;
                C22327.m50389(error);
                throw error;
            }
            return obj;
        } catch (TimeoutException unused2) {
            futureSubmit.cancel(true);
            return obj;
        }
    }
}
