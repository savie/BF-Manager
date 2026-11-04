package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8542 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9287 m22859(AbstractC22044 abstractC22044) {
        C9287 c9287M22863;
        if (m22862(abstractC22044.getName())) {
            try {
                C9287 c9287M22864 = m22863(abstractC22044);
                if (c9287M22864 != null) {
                    return c9287M22864;
                }
            } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                return new C9287(EnumC2576.RETRYABLE, null);
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                if (abstractC22044.m49870()) {
                    mediaMetadataRetriever.setDataSource(abstractC22044.mo4278());
                } else {
                    if (!abstractC22044.mo42886()) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            C9287 c9287M22860 = m22860(abstractC22044, mediaMetadataRetriever);
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused2) {
                            }
                            return c9287M22860;
                        }
                        C9287 c9287 = new C9287(EnumC2576.RETRYABLE, null);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception unused3) {
                        }
                        return c9287;
                    }
                    mediaMetadataRetriever.setDataSource(C21576.m49084(), abstractC22044.mo42888());
                }
                byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                if (embeddedPicture == null) {
                    String name = abstractC22044.getName();
                    if (name.regionMatches(true, name.length() - 4, ".wav", 0, 4)) {
                        final C13961 c13961M49855 = abstractC22044.m49855("r");
                        try {
                            C9287 c9287M22856 = m22856(c13961M49855.length(), new InterfaceC12227() { // from class: l.᩶ۢۚ
                                @Override // l.InterfaceC12227
                                /* JADX INFO: renamed from: ۙ */
                                public final int mo2073(long j, byte[] bArr, int i, int i2) {
                                    C13961 c13961 = c13961M49855;
                                    c13961.seek(j);
                                    return c13961.read(bArr, i, i2);
                                }
                            });
                            c13961M49855.close();
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused4) {
                            }
                            return c9287M22856;
                        } catch (Throwable th) {
                            try {
                                c13961M49855.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                C9287 c9287M22865 = m22864(embeddedPicture);
                if (c9287M22865.m24500() == EnumC2576.SUCCESS || !m22865(abstractC22044.getName()) || (c9287M22863 = m22863(abstractC22044)) == null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused5) {
                    }
                    return c9287M22865;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused6) {
                }
                return c9287M22863;
            } catch (IOException | OutOfMemoryError | RuntimeException unused7) {
                C9287 c9288 = new C9287(EnumC2576.RETRYABLE, null);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused8) {
                }
                return c9288;
            }
        } catch (Throwable th3) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused9) {
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:3:0x0005, B:5:0x0012, B:9:0x001f, B:11:0x0034, B:13:0x0046, B:15:0x004e, B:17:0x0058, B:12:0x0042, B:23:0x0070), top: B:34:0x0005 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9287 m22860(AbstractC22044 abstractC22044, MediaMetadataRetriever mediaMetadataRetriever) {
        C9287 c9287M22864;
        C9287 c9287M22858;
        final C18984 c18984 = new C18984(abstractC22044);
        try {
            mediaMetadataRetriever.setDataSource(c18984);
            byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
            if (!c18984.f61530 && !Thread.currentThread().isInterrupted()) {
                if (embeddedPicture == null) {
                    String name = abstractC22044.getName();
                    if (name.regionMatches(true, name.length() - 4, ".wav", 0, 4)) {
                        c9287M22864 = m22856(c18984.getSize(), new InterfaceC12227() { // from class: l.ܿۢۚ
                            @Override // l.InterfaceC12227
                            /* JADX INFO: renamed from: ۙ */
                            public final int mo2073(long j, byte[] bArr, int i, int i2) {
                                return c18984.readAt(j, bArr, i, i2);
                            }
                        });
                    } else {
                        c9287M22864 = m22864(embeddedPicture);
                    }
                } else {
                    c9287M22864 = m22864(embeddedPicture);
                }
                if (c9287M22864.m24500() == EnumC2576.SUCCESS || !m22865(abstractC22044.getName()) || (c9287M22858 = m22858(new InterfaceC12227() { // from class: l.ܿۢۚ
                    @Override // l.InterfaceC12227
                    /* JADX INFO: renamed from: ۙ */
                    public final int mo2073(long j, byte[] bArr, int i, int i2) {
                        return c18984.readAt(j, bArr, i, i2);
                    }
                }, c18984.getSize(), true)) == null) {
                    c18984.close();
                    return c9287M22864;
                }
                c18984.close();
                return c9287M22858;
            }
            C9287 c9287 = new C9287(EnumC2576.RETRYABLE, null);
            c18984.close();
            return c9287;
        } catch (Throwable th) {
            try {
                c18984.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9287 m22857(final MediaDataSource mediaDataSource, String str) {
        if (m22862(str)) {
            try {
                C9287 c9287M22858 = m22858(new InterfaceC12227() { // from class: l.۟ۢۚ
                    @Override // l.InterfaceC12227
                    /* JADX INFO: renamed from: ۙ */
                    public final int mo2073(long j, byte[] bArr, int i, int i2) {
                        return mediaDataSource.readAt(j, bArr, i, i2);
                    }
                }, mediaDataSource.getSize(), false);
                if (c9287M22858 != null) {
                    return c9287M22858;
                }
            } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                return new C9287(EnumC2576.RETRYABLE, null);
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C1085 c1085 = new C1085(mediaDataSource);
                mediaMetadataRetriever.setDataSource(c1085);
                byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                if (!c1085.f3879 && !Thread.currentThread().isInterrupted()) {
                    C9287 c9287M22864 = m22864(embeddedPicture);
                    if (c9287M22864.m24500() != EnumC2576.SUCCESS && m22865(str)) {
                        C9287 c9287M22859 = m22858(new InterfaceC12227() { // from class: l.۟ۢۚ
                            @Override // l.InterfaceC12227
                            /* JADX INFO: renamed from: ۙ */
                            public final int mo2073(long j, byte[] bArr, int i, int i2) {
                                return mediaDataSource.readAt(j, bArr, i, i2);
                            }
                        }, mediaDataSource.getSize(), true);
                        if (c9287M22859 != null) {
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused2) {
                            }
                            return c9287M22859;
                        }
                    } else if (embeddedPicture == null) {
                        return m22856(mediaDataSource.getSize(), new InterfaceC12227() { // from class: l.۟ۢۚ
                            @Override // l.InterfaceC12227
                            /* JADX INFO: renamed from: ۙ */
                            public final int mo2073(long j, byte[] bArr, int i, int i2) {
                                return mediaDataSource.readAt(j, bArr, i, i2);
                            }
                        });
                    }
                    return c9287M22864;
                }
                return new C9287(EnumC2576.RETRYABLE, null);
            } catch (IOException | OutOfMemoryError | RuntimeException unused3) {
                return new C9287(EnumC2576.RETRYABLE, null);
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9287 m22863(AbstractC22044 abstractC22044) {
        try {
            final C13961 c13961M49855 = abstractC22044.m49855("r");
            try {
                C9287 c9287M22858 = m22858(new InterfaceC12227() { // from class: l.֡ۢۚ
                    @Override // l.InterfaceC12227
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final int mo2073(long j, byte[] bArr, int i, int i2) {
                        C13961 c13961 = c13961M49855;
                        c13961.seek(j);
                        return c13961.read(bArr, i, i2);
                    }
                }, c13961M49855.length(), m22865(abstractC22044.getName()));
                c13961M49855.close();
                return c9287M22858;
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9287 m22858(InterfaceC12227 interfaceC12227, long j, boolean z) {
        C10033 c10033 = new C10033();
        if (z) {
            C14508.m35029(interfaceC12227, j, c10033);
        } else {
            C14508.m35024(interfaceC12227, j, c10033);
        }
        return Thread.currentThread().isInterrupted() ? new C9287(EnumC2576.RETRYABLE, null) : c10033.f32164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22862(String str) {
        return str.regionMatches(true, str.length() + (-5), ".flac", 0, 5) || str.regionMatches(true, str.length() + (-4), ".ogg", 0, 4) || str.regionMatches(true, str.length() + (-4), ".oga", 0, 4) || str.regionMatches(true, str.length() + (-5), ".opus", 0, 5);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22865(String str) {
        return str.regionMatches(true, str.length() + (-4), ".mp3", 0, 4) || str.regionMatches(true, str.length() + (-4), ".mp2", 0, 4) || str.regionMatches(true, str.length() + (-5), ".mpga", 0, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9287 m22856(long j, InterfaceC12227 interfaceC12227) {
        C10033 c10033 = new C10033();
        C20342.m46732(interfaceC12227, j, c10033);
        if (Thread.currentThread().isInterrupted()) {
            return new C9287(EnumC2576.RETRYABLE, null);
        }
        if (c10033.f32164 != null) {
            return c10033.f32164;
        }
        return c10033.f32163 != null ? c10033.f32163 : new C9287(EnumC2576.NO_COVER, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9287 m22864(byte[] bArr) {
        if (Thread.currentThread().isInterrupted()) {
            return new C9287(EnumC2576.RETRYABLE, null);
        }
        if (bArr == null) {
            return new C9287(EnumC2576.NO_COVER, null);
        }
        if (bArr.length == 0 || bArr.length > 8388608) {
            return new C9287(EnumC2576.INVALID_COVER, null);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0 || Math.max(i, i2) > 16384 || ((long) i) * ((long) i2) > 16777216 || Math.max(i, i2) > ((long) Math.min(i, i2)) * 32) {
            return new C9287(EnumC2576.INVALID_COVER, null);
        }
        Bitmap bitmapM22342 = C8275.m22342(new C18716(bArr));
        return new C9287(bitmapM22342 == null ? EnumC2576.INVALID_COVER : EnumC2576.SUCCESS, bitmapM22342);
    }
}
