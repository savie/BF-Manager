package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۜۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22702 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0884 f22703 = new C0884(200);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9069 m19041(AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386, int i) {
        boolean z = abstractC7629 instanceof AbstractC18881;
        if (z || (abstractC7629 instanceof C11969)) {
            String str = "hls-corrupt:" + C3603.m11683(abstractC7629, interfaceC2386, "short-lived");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C0884 c0884 = f22703;
            synchronized (c0884) {
                Long l2 = (Long) c0884.m3588(str);
                if (l2 != null) {
                    if (jElapsedRealtime < l2.longValue() || jElapsedRealtime - l2.longValue() >= 30000) {
                        c0884.m3593(str);
                    } else {
                        return new C9069(EnumC2358.CORRUPT, null);
                    }
                }
                ExecutorService executorService = z ? C5261.f18538 : C5261.f18537;
                final C14290 c14290 = new C14290(interfaceC2386, abstractC7629);
                Future futureSubmit = executorService.submit(new Callable() { // from class: l.᩹ۖۚ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c14290.m34699();
                    }
                });
                try {
                    C9069 c9069 = (C9069) futureSubmit.get(Math.max(1, i), TimeUnit.SECONDS);
                    if (c9069.m24206() == EnumC2358.CORRUPT) {
                        m19046(str);
                    }
                    return c9069;
                } catch (InterruptedException unused) {
                    futureSubmit.cancel(true);
                    c14290.m34698();
                    Thread.currentThread().interrupt();
                    return new C9069(EnumC2358.CANCELED, null);
                } catch (ExecutionException unused2) {
                    futureSubmit.cancel(true);
                    c14290.m34698();
                    return new C9069(EnumC2358.TRANSIENT_FAILURE, null);
                } catch (TimeoutException unused3) {
                    futureSubmit.cancel(true);
                    c14290.m34698();
                    return new C9069(EnumC2358.TIMEOUT, null);
                }
            }
        }
        return new C9069(EnumC2358.UNSUPPORTED, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19046(String str) {
        C0884 c0884 = f22703;
        synchronized (c0884) {
            c0884.m3589(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9069 m19042(AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386, C23988 c23988) {
        C9069 c9069;
        try {
            try {
                try {
                    C18766 c18766M43559 = C18766.m43559(interfaceC2386, abstractC7629);
                    try {
                        c23988.m53538(c18766M43559);
                        try {
                            c23988.m53539();
                            C9815 c9815M19043 = m19043(c18766M43559.f60948, c18766M43559.f60949, c18766M43559.f60952, c23988);
                            Bitmap bitmapM1666 = C0217.m1666(c9815M19043.f31620);
                            if (bitmapM1666 != null) {
                                c23988.m53539();
                                c9069 = new C9069(EnumC2358.SUCCESS, bitmapM1666);
                            } else {
                                c23988.m53539();
                                Bitmap bitmapM19040 = m19040(c9815M19043, c18766M43559.m43560(), C6907.m19160(32.0f), c23988);
                                if (bitmapM19040 != null) {
                                    c23988.m53539();
                                    C0217.m1668(c9815M19043.f31620, bitmapM19040);
                                    c9069 = new C9069(EnumC2358.SUCCESS, bitmapM19040);
                                } else {
                                    c9069 = new C9069(EnumC2358.TRANSIENT_FAILURE, null);
                                }
                            }
                            c23988.m53540(c18766M43559);
                            c18766M43559.close();
                            return c9069;
                        } catch (Throwable th) {
                            c23988.m53540(c18766M43559);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            c18766M43559.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (C0121 | C8324 | C20510 unused) {
                    return new C9069(EnumC2358.UNSUPPORTED, null);
                }
            } catch (IOException | RuntimeException unused2) {
                return new C9069(EnumC2358.TRANSIENT_FAILURE, null);
            }
        } catch (InterruptedIOException unused3) {
            return new C9069(EnumC2358.CANCELED, null);
        } catch (C2970 unused4) {
            return new C9069(EnumC2358.CORRUPT, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9815 m19043(InterfaceC15670 interfaceC15670, C7579 c7579, Uri uri, C23988 c23988) throws IOException {
        C24907 c24907;
        String str;
        C18020 c18020M19044;
        m19049(uri);
        C18020 c18020M19045 = m19044(interfaceC15670, uri, new C12226(), c23988);
        AbstractC23415 abstractC23415 = c18020M19045.f59011;
        if (abstractC23415 instanceof C15955) {
            C15955 c15955 = (C15955) abstractC23415;
            if (!c15955.f51802.isEmpty() || !c15955.f51796.isEmpty()) {
                throw new C8324("External video renditions or session DRM are unsupported");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C17447 c17447 : c15955.f51801) {
                C15648 c15648 = c17447.f56742;
                String str2 = c15648.f50836;
                if ((c15648.f50834 & 16384) == 0 && c17447.f56743 == null) {
                    String strM25259 = C9681.m25259(str2);
                    String strM25252 = C9681.m25252(str2);
                    boolean z = c15648.f50814 > 0 || c15648.f50852 > 0;
                    if (strM25259 != null || z) {
                        arrayList.add(c17447);
                    } else if (strM25252 == null) {
                        arrayList2.add(c17447);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            C17447 c17448 = (C17447) C1170.stream(arrayList).min(C8627.thenComparing(C8627.thenComparingLong(C2661.comparingLong(new C16528()), new C17274(0)), new C22255(2))).orElseThrow(new C15782());
            Uri uri2 = c17448.f56744;
            m19049(uri2);
            c18020M19044 = m19044(interfaceC15670, uri2, new C12226(c15955, null), c23988);
            AbstractC23415 abstractC23416 = c18020M19044.f59011;
            if (!(abstractC23416 instanceof C24907)) {
                throw new C8324("Nested multivariant playlists are unsupported");
            }
            c24907 = (C24907) abstractC23416;
            C15648 c15649 = c17448.f56742;
            str = uri2 + "|" + c15649.f50836 + "|" + c15649.f50828 + "|" + c15649.f50815 + "|" + c15649.f50814 + "x" + c15649.f50852;
        } else {
            AbstractC23415 abstractC23417 = c18020M19045.f59011;
            if (!(abstractC23417 instanceof C24907)) {
                throw new C8324("Unsupported HLS playlist type");
            }
            c24907 = (C24907) abstractC23417;
            str = "direct";
            c18020M19044 = c18020M19045;
        }
        for (C5515 c5515 : c24907.f80607) {
            if (!c5515.f6099) {
                EnumC7029 enumC7029M49299 = C21750.m49299(c24907, c5515);
                if (enumC7029M49299 == null) {
                    throw new C8324("HLS playlist is not eligible for thumbnails");
                }
                C5515 c5516 = c5515.f6094;
                C0867 c0867M20757 = c5516 != null ? c7579.m20757(c24907, c5516) : null;
                C0867 c0867M20758 = c7579.m20757(c24907, c5515);
                if (enumC7029M49299 == EnumC7029.FRAGMENTED_MP4 && c0867M20757 == null) {
                    throw new C8324("Fragmented MP4 initialization is missing");
                }
                if (c0867M20757 != null && c0867M20757.f3246 > C25227.FOREVER_NS - c0867M20758.f3246) {
                    throw new C8324("HLS thumbnail resource length overflows");
                }
                MessageDigest messageDigestM36179 = C15022.m36179();
                m19047(messageDigestM36179, "hls-thumb-v1");
                m19047(messageDigestM36179, c18020M19045.f59012.toString());
                m19047(messageDigestM36179, c18020M19045.f59010);
                m19047(messageDigestM36179, c18020M19044.f59012.toString());
                m19047(messageDigestM36179, c18020M19044.f59010);
                m19047(messageDigestM36179, str);
                m19047(messageDigestM36179, enumC7029M49299.name());
                m19048(messageDigestM36179, c0867M20757);
                m19048(messageDigestM36179, c0867M20758);
                return new C9815(enumC7029M49299, c0867M20757, c0867M20758, "hls_thumb_v1_".concat(C15022.m36182(messageDigestM36179.digest())));
            }
        }
        throw new C8324("HLS media segment is missing");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18020 m19044(InterfaceC15670 interfaceC15670, Uri uri, C12226 c12226, C23988 c23988) throws IOException {
        m19049(uri);
        InterfaceC13433 interfaceC13433Mo3996 = interfaceC15670.mo3996();
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        c11941.m29909(1);
        C2247 c2247 = new C2247(interfaceC13433Mo3996, c11941.m29908());
        MessageDigest messageDigestM36179 = C15022.m36179();
        C12053 c12053M53536 = c23988.m53536(c2247);
        try {
            c23988.m53539();
            c2247.m7664();
            Uri uriMo8327 = interfaceC13433Mo3996.mo8327();
            if (uriMo8327 != null) {
                uri = uriMo8327;
            }
            m19049(uri);
            AbstractC23415 abstractC23415M30514 = c12226.m30514(uri, new C21004(new DigestInputStream(new C3850(c2247), messageDigestM36179)));
            c23988.m53539();
            C18020 c18020 = new C18020(abstractC23415M30514, uri, C15022.m36182(messageDigestM36179.digest()));
            c12053M53536.close();
            return c18020;
        } catch (Throwable th) {
            try {
                c12053M53536.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m19040(final C9815 c9815, final InterfaceC15670 interfaceC15670, int i, final C23988 c23988) throws Throwable {
        Throwable th;
        int width;
        Bitmap frameAtTime;
        int iMin;
        if (c9815.f31622 == EnumC7029.MPEG_TS) {
            C6044 c6044M17538 = C6044.m17538(c9815.f31623.f3244, new InterfaceC3806() { // from class: l.ۗۖۚ
                @Override // l.InterfaceC3806
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final InterfaceC1278 mo10127() {
                    C8889 c8889M3535 = c9815.f31623.m3535(interfaceC15670);
                    return new C6088(c8889M3535, c23988.m53536(c8889M3535));
                }
            }, true);
            C17359.requireNonNull(c23988);
            return C22823.m51453(c6044M17538, i, new C20258(c23988));
        }
        if (Build.VERSION.SDK_INT < 23 || c9815.f31621 == null) {
            throw new C8324("Fragmented MP4 thumbnails require Android M");
        }
        C0867 c0867 = c9815.f31621;
        if (c0867 == null) {
            throw new C8324("Fragmented MP4 initialization is missing");
        }
        C0867 c0868 = c9815.f31623;
        C8889 c8889M3535 = c0867.m3535(interfaceC15670);
        C8889 c8889 = null;
        bitmapM22340 = null;
        Bitmap bitmapM22340 = null;
        C9026 c9026 = null;
        try {
            C8889 c8889M3536 = c0868.m3535(interfaceC15670);
            try {
                C21946 c21946 = new C21946(c8889M3535, c8889M3536);
                C6088 c6088 = new C6088(c21946, c23988.m53536(c21946));
                long j = c0867.f3246;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    c23988.m53539();
                    C17707 c17707M39975 = C16961.m39975(c6088, j);
                    if (c17707M39975.m41464() != 0) {
                        C9026 c9027 = new C9026(c6088, j, c17707M39975.m41466(0), c17707M39975.m41467(0));
                        try {
                            mediaMetadataRetriever.setDataSource(c9027);
                            c23988.m53539();
                            int height = -1;
                            try {
                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                width = strExtractMetadata == null ? -1 : Integer.parseInt(strExtractMetadata);
                                if (width <= 0) {
                                    width = -1;
                                }
                            } catch (RuntimeException unused) {
                            }
                            try {
                                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                int i2 = strExtractMetadata2 == null ? -1 : Integer.parseInt(strExtractMetadata2);
                                if (i2 > 0) {
                                    height = i2;
                                }
                            } catch (RuntimeException unused2) {
                            }
                            if (width <= 0 || height <= 0) {
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(c17707M39975.m41468(), 2);
                            } else {
                                int iMax = Math.max(1, i);
                                double d = ((double) width) / ((double) height);
                                if (d >= 1.0d) {
                                    int iMin2 = Math.min(iMax * 3, Math.max(iMax, (int) Math.ceil(((double) iMax) * d)));
                                    iMin = iMax;
                                    iMax = iMin2;
                                } else {
                                    iMin = Math.min(iMax * 3, Math.max(iMax, (int) Math.ceil(((double) iMax) / d)));
                                }
                                int[] iArr = {iMax, iMin};
                                frameAtTime = C23438.m52634(mediaMetadataRetriever, c17707M39975.m41468(), iArr[0], iArr[1]);
                            }
                            c23988.m53539();
                            if (frameAtTime != null) {
                                if (width <= 0) {
                                    width = frameAtTime.getWidth();
                                }
                                if (height <= 0) {
                                    height = frameAtTime.getHeight();
                                }
                                bitmapM22340 = C8275.m22340(frameAtTime, i, width, height);
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused3) {
                            }
                            C20244.m46520(c9027);
                        } catch (Throwable th2) {
                            th = th2;
                            c6088 = null;
                            c9026 = c9027;
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused4) {
                            }
                            if (c9026 != null) {
                                C20244.m46520(c9026);
                                throw th;
                            }
                            C20244.m46520(c6088);
                            throw th;
                        }
                    } else {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused5) {
                        }
                        C20244.m46520(c6088);
                    }
                    return bitmapM22340;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c8889 = c8889M3536;
                if (c8889 != null) {
                    try {
                        c8889.close();
                    } catch (IOException e2) {
                        th.addSuppressed(e2);
                    }
                }
                try {
                    c8889M3535.close();
                    throw th;
                } catch (IOException e3) {
                    th.addSuppressed(e3);
                    throw th;
                }
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19048(MessageDigest messageDigest, C0867 c0867) {
        if (c0867 == null) {
            m19047(messageDigest, "none");
            return;
        }
        m19047(messageDigest, c0867.f3247.toString());
        m19047(messageDigest, c0867.f3244);
        m19047(messageDigest, Long.toString(c0867.f3245));
        m19047(messageDigest, Long.toString(c0867.f3246));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19047(MessageDigest messageDigest, String str) {
        if (str != null) {
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        }
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19049(Uri uri) throws C8324 {
        String scheme = uri.getScheme();
        if (scheme == null || !"mt_media".equals(scheme.toLowerCase(Locale.ROOT)) || uri.getAuthority() != null) {
            throw new C8324("HLS thumbnail URI must stay in the current visitor");
        }
    }
}
