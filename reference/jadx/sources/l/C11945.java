package l;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ۨ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11945 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f40062;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f40063;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Uri f40064;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f40065;

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C14062 {
        Uri uri = c12257.f41015;
        long j = c12257.f41009;
        this.f40064 = uri;
        m48019(c12257);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f40065 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c12257.f41017;
                if (length == -1) {
                    length = this.f40065.length() - j;
                }
                this.f40063 = length;
                if (length < 0) {
                    throw new C14062(null, null, 2008);
                }
                this.f40062 = true;
                m48018(c12257);
                return this.f40063;
            } catch (IOException e) {
                throw new C14062(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C14062(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM30515 = C12278.m30515("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM30515.append(fragment);
            throw new C14062(sbM30515.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C14062(2006, e3);
        } catch (RuntimeException e4) {
            throw new C14062(2000, e4);
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C14062 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f40063;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f40065;
            String str = C17983.f57504;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f40063 -= (long) i3;
                m48017(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C14062(2000, e);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f40064;
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
            r5.f40064 = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f40065     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f40065 = r0
            boolean r0 = r5.f40062
            if (r0 == 0) goto L16
            r5.f40062 = r1
            r5.m48020()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            l.ܰ᩷ۙ r3 = new l.ܰ᩷ۙ     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f40065 = r0
            boolean r0 = r5.f40062
            if (r0 == 0) goto L2d
            r5.f40062 = r1
            r5.m48020()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11945.close():void");
    }
}
