package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8T8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18294 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f58367;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public FileInputStream f58368;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Context f58369;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f58370;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12257 f58371;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f58372;

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public C18294(Context context) {
        super(false);
        this.f58369 = context.getApplicationContext();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C21822 {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f58371 = c12257;
        m48019(c12257);
        Uri uri = c12257.f41015;
        long j = c12257.f41017;
        long j2 = c12257.f41009;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f58369;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C21822("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C21822("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C21822("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C21822("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C21822("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(C1679.m5594(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new C21822("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C21822("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f58372 = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f58372.getFileDescriptor());
            this.f58368 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C21822(null, null, 2008);
                }
                long startOffset = this.f58372.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C21822(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C6001.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                        this.f58367 = -1L;
                    } else {
                        long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f58367 = size;
                        if (size < 0) {
                            throw new C21822(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f58367 = j3;
                    if (j3 < 0) {
                        throw new C20018(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f58367;
                    this.f58367 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f58370 = true;
                m48018(c12257);
                return j != -1 ? j : this.f58367;
            } catch (C21822 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C21822(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C21822(null, e4, 2005);
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C21822 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f58367;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C21822(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f58368;
            String str = C17983.f57504;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f58367;
                if (j2 != -1) {
                    this.f58367 = j2 - ((long) i3);
                }
                m48017(i3);
                return i3;
            }
            if (this.f58367 != -1) {
                throw new C21822("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        C12257 c12257 = this.f58371;
        if (c12257 != null) {
            return c12257.f41015;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // l.InterfaceC15785
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f58371 = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f58368     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f58368 = r0
            android.content.res.AssetFileDescriptor r3 = r5.f58372     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f58372 = r0
            boolean r0 = r5.f58370
            if (r0 == 0) goto L21
            r5.f58370 = r2
            r5.m48020()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            l.᩸᩷ۙ r4 = new l.᩸᩷ۙ     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f58372 = r0
            boolean r0 = r5.f58370
            if (r0 == 0) goto L36
            r5.f58370 = r2
            r5.m48020()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            l.᩸᩷ۙ r4 = new l.᩸᩷ۙ     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f58368 = r0
            android.content.res.AssetFileDescriptor r4 = r5.f58372     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f58372 = r0
            boolean r0 = r5.f58370
            if (r0 == 0) goto L54
            r5.f58370 = r2
            r5.m48020()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            l.᩸᩷ۙ r4 = new l.᩸᩷ۙ     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f58372 = r0
            boolean r0 = r5.f58370
            if (r0 == 0) goto L69
            r5.f58370 = r2
            r5.m48020()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18294.close():void");
    }
}
