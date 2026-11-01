package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8KN */
/* JADX INFO: loaded from: classes5.dex */
public final class C15079 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InputStream f49160;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Uri f49161;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AssetManager f49162;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f49163;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f49164;

    public C15079(Context context) {
        super(false);
        this.f49162 = context.getAssets();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C22840 {
        try {
            Uri uri = c12257.f41015;
            long j = c12257.f41009;
            this.f49161 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m48019(c12257);
            InputStream inputStreamOpen = this.f49162.open(path, 1);
            this.f49160 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C22840(2008, null);
            }
            long j2 = c12257.f41017;
            if (j2 != -1) {
                this.f49164 = j2;
            } else {
                long jAvailable = this.f49160.available();
                this.f49164 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f49164 = -1L;
                }
            }
            this.f49163 = true;
            m48018(c12257);
            return this.f49164;
        } catch (C22840 e) {
            throw e;
        } catch (IOException e2) {
            throw new C22840(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C22840 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f49164;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C22840(2000, e);
                }
            }
            InputStream inputStream = this.f49160;
            String str = C17983.f57504;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f49164;
                if (j2 != -1) {
                    this.f49164 = j2 - ((long) i3);
                }
                m48017(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f49161;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // l.InterfaceC15785
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f49161 = r0
            r1 = 0
            java.io.InputStream r2 = r5.f49160     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f49160 = r0
            boolean r0 = r5.f49163
            if (r0 == 0) goto L16
            r5.f49163 = r1
            r5.m48020()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            l.᩺۟ۙ r3 = new l.᩺۟ۙ     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f49160 = r0
            boolean r0 = r5.f49163
            if (r0 == 0) goto L2d
            r5.f49163 = r1
            r5.m48020()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15079.close():void");
    }
}
