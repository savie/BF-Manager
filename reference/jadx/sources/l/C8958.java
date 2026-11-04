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

/* JADX INFO: renamed from: l.۠᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8T8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8958 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FileInputStream f29215;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C25368 f29216;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f29217;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f29218;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f29219;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Context f29220;

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public C8958(Context context) {
        super(false);
        this.f29220 = context.getApplicationContext();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C2992 {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f29216 = c25368;
        m22621(c25368);
        Uri uri = c25368.f81907;
        long j = c25368.f81910;
        long j2 = c25368.f81909;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f29220;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C2992("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C2992("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C2992("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
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
                    throw new C2992("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C2992("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(C20196.m46451(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new C2992("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C2992("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f29219 = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f29219.getFileDescriptor());
            this.f29215 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C2992(null, null, 2008);
                }
                long startOffset = this.f29219.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C2992(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                        this.f29218 = -1L;
                    } else {
                        long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f29218 = size;
                        if (size < 0) {
                            throw new C2992(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f29218 = j3;
                    if (j3 < 0) {
                        throw new C5976(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f29218;
                    this.f29218 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f29217 = true;
                m22619(c25368);
                return j != -1 ? j : this.f29218;
            } catch (C2992 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C2992(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C2992(null, e4, 2005);
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C2992 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29218;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C2992(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f29215;
            String str = C7116.f23455;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f29218;
                if (j2 != -1) {
                    this.f29218 = j2 - ((long) i3);
                }
                m22622(i3);
                return i3;
            }
            if (this.f29218 != -1) {
                throw new C2992("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        C25368 c25368 = this.f29216;
        if (c25368 != null) {
            return c25368.f81907;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // l.InterfaceC13433
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f29216 = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f29215     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f29215 = r0
            android.content.res.AssetFileDescriptor r3 = r5.f29219     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f29219 = r0
            boolean r0 = r5.f29217
            if (r0 == 0) goto L21
            r5.f29217 = r2
            r5.m22620()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            l.ۖ᩺ۙ r4 = new l.ۖ᩺ۙ     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f29219 = r0
            boolean r0 = r5.f29217
            if (r0 == 0) goto L36
            r5.f29217 = r2
            r5.m22620()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            l.ۖ᩺ۙ r4 = new l.ۖ᩺ۙ     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f29215 = r0
            android.content.res.AssetFileDescriptor r4 = r5.f29219     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f29219 = r0
            boolean r0 = r5.f29217
            if (r0 == 0) goto L54
            r5.f29217 = r2
            r5.m22620()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            l.ۖ᩺ۙ r4 = new l.ۖ᩺ۙ     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f29219 = r0
            boolean r0 = r5.f29217
            if (r0 == 0) goto L69
            r5.f29217 = r2
            r5.m22620()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8958.close():void");
    }
}
