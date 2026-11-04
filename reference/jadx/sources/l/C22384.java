package l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩷᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22384 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentResolver f72469;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f72470;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Uri f72471;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FileInputStream f72472;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f72473;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f72474;

    public C22384(Context context) {
        super(false);
        this.f72469 = context.getContentResolver();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C5230 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c25368.f81907;
                long j = c25368.f81910;
                long j2 = c25368.f81909;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f72471 = uriNormalizeScheme;
                m22621(c25368);
                boolean zEquals = C17359.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f72469;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f72474 = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C5230(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new C5230(i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f72472 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C5230(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C5230(2008, null);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.f72473 = -1L;
                    } else {
                        long jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f72473 = jPosition;
                        if (jPosition < 0) {
                            throw new C5230(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f72473 = j3;
                    if (j3 < 0) {
                        throw new C5230(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.f72473;
                    this.f72473 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f72470 = true;
                m22619(c25368);
                return j != -1 ? j : this.f72473;
            } catch (C5230 e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C5230 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f72473;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C5230(2000, e);
                }
            }
            FileInputStream fileInputStream = this.f72472;
            String str = C7116.f23455;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f72473;
                if (j2 != -1) {
                    this.f72473 = j2 - ((long) i3);
                }
                m22622(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f72471;
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
            r5.f72471 = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f72472     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f72472 = r0
            android.content.res.AssetFileDescriptor r3 = r5.f72474     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f72474 = r0
            boolean r0 = r5.f72470
            if (r0 == 0) goto L21
            r5.f72470 = r2
            r5.m22620()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            l.ۙ᩺ۙ r4 = new l.ۙ᩺ۙ     // Catch: java.lang.Throwable -> L22
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f72474 = r0
            boolean r0 = r5.f72470
            if (r0 == 0) goto L36
            r5.f72470 = r2
            r5.m22620()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            l.ۙ᩺ۙ r4 = new l.ۙ᩺ۙ     // Catch: java.lang.Throwable -> L37
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f72472 = r0
            android.content.res.AssetFileDescriptor r4 = r5.f72474     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f72474 = r0
            boolean r0 = r5.f72470
            if (r0 == 0) goto L54
            r5.f72470 = r2
            r5.m22620()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            l.ۙ᩺ۙ r4 = new l.ۙ᩺ۙ     // Catch: java.lang.Throwable -> L55
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f72474 = r0
            boolean r0 = r5.f72470
            if (r0 == 0) goto L69
            r5.f72470 = r2
            r5.m22620()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22384.close():void");
    }
}
