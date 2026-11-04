package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8KN */
/* JADX INFO: loaded from: classes3.dex */
public final class C2467 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Uri f7915;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f7916;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InputStream f7917;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f7918;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AssetManager f7919;

    public C2467(Context context) {
        super(false);
        this.f7919 = context.getAssets();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo8326(C25368 c25368) throws C9178 {
        try {
            Uri uri = c25368.f81907;
            long j = c25368.f81909;
            this.f7915 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m22621(c25368);
            InputStream inputStreamOpen = this.f7919.open(path, 1);
            this.f7917 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C9178(2008, null);
            }
            long j2 = c25368.f81910;
            if (j2 != -1) {
                this.f7918 = j2;
            } else {
                long jAvailable = this.f7917.available();
                this.f7918 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f7918 = -1L;
                }
            }
            this.f7916 = true;
            m22619(c25368);
            return this.f7918;
        } catch (C9178 e) {
            throw e;
        } catch (IOException e2) {
            throw new C9178(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C9178 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7918;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C9178(2000, e);
                }
            }
            InputStream inputStream = this.f7917;
            String str = C7116.f23455;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f7918;
                if (j2 != -1) {
                    this.f7918 = j2 - ((long) i3);
                }
                m22622(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri mo8327() {
        return this.f7915;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // l.InterfaceC13433
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f7915 = r0
            r1 = 0
            java.io.InputStream r2 = r5.f7917     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f7917 = r0
            boolean r0 = r5.f7916
            if (r0 == 0) goto L16
            r5.f7916 = r1
            r5.m22620()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            l.ۡۛۙ r3 = new l.ۡۛۙ     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f7917 = r0
            boolean r0 = r5.f7916
            if (r0 == 0) goto L2d
            r5.f7916 = r1
            r5.m22620()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2467.close():void");
    }
}
