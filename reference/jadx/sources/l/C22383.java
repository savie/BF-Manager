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

/* JADX INFO: renamed from: l.᩹ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes.dex */
public class C22383 extends AbstractC20745 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f73083;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6300 f73084;

    @Override // l.AbstractC20745
    public String getParent() {
        return null;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo46709() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۠ۙ */
    public final boolean mo40126() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤ */
    public boolean mo32856() {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public boolean mo24646(AbstractC20745 abstractC20745) {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܳ */
    public final void mo46720() {
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo33985() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܽ */
    public boolean mo33987() {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo33988() {
        return true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo32858() {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩺ */
    public boolean mo46736() {
        return this instanceof C13357;
    }

    public C22383(Uri uri) {
        this.f73084 = new C6300(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo49659(Uri uri, boolean z) {
        this.f73084 = new C6300(uri);
        mo40897();
    }

    /* JADX INFO: renamed from: ֡ܰ */
    public void mo40897() {
        this.f73083 = null;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۫ */
    public boolean mo33978() {
        try {
            mo33976(false).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC20745
    public String getName() {
        if (this.f73083 == null) {
            String strM4806 = C1361.m4806(this.f73084.m17383());
            this.f73083 = strM4806;
            if (strM4806 == null) {
                String path = this.f73084.m17383().getPath();
                if (path == null) {
                    throw new RuntimeException("Can't get name from uri: " + this.f73084.m17383());
                }
                this.f73083 = new File(path).getName();
            }
        }
        return this.f73083;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ */
    public String mo33986() {
        return this.f73084.toString();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨۙ */
    public final Uri mo40127() {
        return this.f73084.m17383();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܿ */
    public boolean mo24647() {
        return C1361.m4807(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public boolean mo33975() {
        if (C13890.m33728()) {
            return ((Boolean) m49650(new Callable() { // from class: l.֫᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C1361.m4800(this.f7662.f73084.m17383()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C1361.m4800(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ */
    public boolean mo33971() {
        if (C13890.m33728()) {
            return ((Boolean) m49650(new Callable() { // from class: l.ۧ᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C1361.m4799(this.f38029.f73084.m17383()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C1361.m4799(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ */
    public boolean mo33974() {
        if (C13890.m33728()) {
            return ((Boolean) m49650(new Callable() { // from class: l.ۖܺۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C1361.m4810(this.f10253.f73084.m17383()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C1361.m4810(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ */
    public long mo33964() {
        if (C13890.m33728()) {
            return ((Long) m49650(new Callable() { // from class: l.ۗ᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C1361.m4801(this.f12765.f73084.m17383()));
                }
            }, (Object) (-1L), 500)).longValue();
        }
        return C1361.m4801(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ */
    public long mo33991() {
        if (C13890.m33728()) {
            return ((Long) m49650(new Callable() { // from class: l.ۨܺۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C1361.m4808(this.f39669.f73084.m17383()));
                }
            }, (Object) 0L, 500)).longValue();
        }
        return C1361.m4808(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo8449() {
        if (C13890.m33728()) {
            return ((Boolean) m49650(new CallableC9829(0, this), Boolean.FALSE, 500)).booleanValue();
        }
        return C1361.m4805(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8447() {
        if (C13890.m33728()) {
            return ((Boolean) m49650(new Callable() { // from class: l.᩻᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C1361.m4809(this.f77529.f73084.m17383()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C1361.m4809(this.f73084.m17383());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public List mo33983(boolean z) {
        return new ArrayList();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۢۙ */
    public final List mo33973() {
        return (List) C9030.stream(mo33983(true)).map(new C3105(0)).collect(C1890.toList());
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۜܰ */
    public final InputStream mo33970() {
        return (InputStream) m49649(new Callable() { // from class: l.ۙܺۚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22383.m49653(this.f16690);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m49653(C22383 c22383) throws IOException {
        try {
            return C16737.m39259().openInputStream(c22383.f73084.m17383());
        } catch (Error | RuntimeException e) {
            throw new IOException(c22383.mo33986(), e);
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ */
    public OutputStream mo33976(final boolean z) {
        return (OutputStream) m49649(new Callable() { // from class: l.ܳ᩷ۚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22383.m49647(this.f48290, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ OutputStream m49647(C22383 c22383, boolean z) throws IOException {
        try {
            return C16737.m39259().openOutputStream(c22383.f73084.m17383(), z ? "wa" : "wt");
        } catch (Error | RuntimeException e) {
            throw new IOException(c22383.mo33986(), e);
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ܰ */
    public final FileChannel mo33982() {
        throw new IOException("Unsupported");
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۘ */
    public InterfaceC21850 mo33966(final String str) {
        return (InterfaceC21850) m49649(new Callable() { // from class: l.ܰܺۚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C19734.m44888(this.f45846.f73084.m17383(), str);
            }
        });
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ */
    public final ParcelFileDescriptor mo33981(String str) {
        return (ParcelFileDescriptor) m49649(new CallableC5449(0, this, str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ParcelFileDescriptor m49655(C22383 c22383, String str) throws IOException {
        try {
            return C16737.m39259().openFileDescriptor(c22383.f73084.m17383(), str);
        } catch (Error | RuntimeException e) {
            throw new IOException(c22383.mo33986(), e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m49657(String str) {
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
        throw new IllegalArgumentException(C0252.m1693("Invalid mode: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49649(Callable callable) throws IOException {
        Future futureSubmit = C4716.f16636.submit(callable);
        try {
            return futureSubmit.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            throw new IOException("Timeout", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49650(Callable callable, Object obj, int i) {
        Future futureSubmit = C4716.f16636.submit(callable);
        try {
            return futureSubmit.get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            return obj;
        } catch (TimeoutException unused2) {
            futureSubmit.cancel(true);
            return obj;
        }
    }
}
