package l;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ܰ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14924 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Uri f48748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f48749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f48750;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f48751;

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C4484 {
        Uri uri = c25368.f81907;
        long j = c25368.f81909;
        this.f48748 = uri;
        m22621(c25368);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f48750 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c25368.f81910;
                if (length == -1) {
                    length = this.f48750.length() - j;
                }
                this.f48751 = length;
                if (length < 0) {
                    throw new C4484(null, null, 2008);
                }
                this.f48749 = true;
                m22619(c25368);
                return this.f48751;
            } catch (IOException e) {
                throw new C4484(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C4484(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM10406 = C3188.m10406("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM10406.append(fragment);
            throw new C4484(sbM10406.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C4484(2006, e3);
        } catch (RuntimeException e4) {
            throw new C4484(2000, e4);
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C4484 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f48751;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f48750;
            String str = C7116.f23455;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f48751 -= (long) i3;
                m22622(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C4484(2000, e);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f48748;
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
            r5.f48748 = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f48750     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f48750 = r0
            boolean r0 = r5.f48749
            if (r0 == 0) goto L16
            r5.f48749 = r1
            r5.m22620()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            l.ۘ᩺ۙ r3 = new l.ۘ᩺ۙ     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f48750 = r0
            boolean r0 = r5.f48749
            if (r0 == 0) goto L2d
            r5.f48749 = r1
            r5.m22620()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14924.close():void");
    }
}
