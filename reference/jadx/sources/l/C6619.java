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

/* JADX INFO: renamed from: l.ۜ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6619 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22317 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C10157 f22318 = new C10157(200);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0974 m17955(AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557, int i) {
        boolean z = abstractC9677 instanceof AbstractC12233;
        if (z || (abstractC9677 instanceof C21611)) {
            String str = "hls-corrupt:" + C4085.m11620(abstractC9677, interfaceC2557, "short-lived");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C10157 c10157 = f22318;
            synchronized (c10157) {
                Long l2 = (Long) c10157.m25800(str);
                if (l2 != null) {
                    if (jElapsedRealtime < l2.longValue() || jElapsedRealtime - l2.longValue() >= 30000) {
                        c10157.m25804(str);
                    } else {
                        return new C0974(EnumC12970.CORRUPT, null);
                    }
                }
                ExecutorService executorService = z ? C4716.f16635 : C4716.f16633;
                final C9526 c9526 = new C9526(interfaceC2557, abstractC9677);
                Future futureSubmit = executorService.submit(new Callable() { // from class: l.۫ۤ۬
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c9526.m24374();
                    }
                });
                try {
                    C0974 c0974 = (C0974) futureSubmit.get(Math.max(1, i), TimeUnit.SECONDS);
                    if (c0974.m3766() == EnumC12970.CORRUPT) {
                        m17960(str);
                    }
                    return c0974;
                } catch (InterruptedException unused) {
                    futureSubmit.cancel(true);
                    c9526.m24373();
                    Thread.currentThread().interrupt();
                    return new C0974(EnumC12970.CANCELED, null);
                } catch (ExecutionException unused2) {
                    futureSubmit.cancel(true);
                    c9526.m24373();
                    return new C0974(EnumC12970.TRANSIENT_FAILURE, null);
                } catch (TimeoutException unused3) {
                    futureSubmit.cancel(true);
                    c9526.m24373();
                    return new C0974(EnumC12970.TIMEOUT, null);
                }
            }
        }
        return new C0974(EnumC12970.UNSUPPORTED, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17960(String str) {
        C10157 c10157 = f22318;
        synchronized (c10157) {
            c10157.m25801(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0974 m17956(AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557, C14465 c14465) {
        C0974 c0974;
        try {
            try {
                try {
                    C2385 c2385M7249 = C2385.m7249(interfaceC2557, abstractC9677);
                    try {
                        c14465.m34867(c2385M7249);
                        try {
                            c14465.m34868();
                            C5208 c5208M17958 = m17958(c2385M7249.f8417, c2385M7249.f8415, c2385M7249.f8418, c14465);
                            Bitmap bitmapM40091 = C17169.m40091(c5208M17958.f18048);
                            if (bitmapM40091 != null) {
                                c14465.m34868();
                                c0974 = new C0974(EnumC12970.SUCCESS, bitmapM40091);
                            } else {
                                c14465.m34868();
                                Bitmap bitmapM17954 = m17954(c5208M17958, c2385M7249.m7250(), C13932.m33769(32.0f), c14465);
                                if (bitmapM17954 != null) {
                                    c14465.m34868();
                                    C17169.m40093(c5208M17958.f18048, bitmapM17954);
                                    c0974 = new C0974(EnumC12970.SUCCESS, bitmapM17954);
                                } else {
                                    c0974 = new C0974(EnumC12970.TRANSIENT_FAILURE, null);
                                }
                            }
                            c14465.m34869(c2385M7249);
                            c2385M7249.close();
                            return c0974;
                        } catch (Throwable th) {
                            c14465.m34869(c2385M7249);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            c2385M7249.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (C3796 | C13676 | C14507 unused) {
                    return new C0974(EnumC12970.UNSUPPORTED, null);
                }
            } catch (IOException | RuntimeException unused2) {
                return new C0974(EnumC12970.TRANSIENT_FAILURE, null);
            }
        } catch (InterruptedIOException unused3) {
            return new C0974(EnumC12970.CANCELED, null);
        } catch (C22861 unused4) {
            return new C0974(EnumC12970.CORRUPT, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5208 m17958(InterfaceC20723 interfaceC20723, C11559 c11559, Uri uri, C14465 c14465) throws IOException {
        C16325 c16325;
        String str;
        C4502 c4502M17957;
        m17963(uri);
        C4502 c4502M17958 = m17957(interfaceC20723, uri, new C1507(), c14465);
        AbstractC10681 abstractC10681 = c4502M17958.f16010;
        if (abstractC10681 instanceof C5741) {
            C5741 c5741 = (C5741) abstractC10681;
            if (!c5741.f19533.isEmpty() || !c5741.f19528.isEmpty()) {
                throw new C3796("External video renditions or session DRM are unsupported");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C17030 c17030 : c5741.f19532) {
                C7648 c7648 = c17030.f54409;
                String str2 = c7648.f25277;
                if ((c7648.f25244 & 16384) == 0 && c17030.f54411 == null) {
                    String strM17988 = C6632.m17988(str2);
                    String strM17979 = C6632.m17979(str2);
                    boolean z = c7648.f25246 > 0 || c7648.f25253 > 0;
                    if (strM17988 != null || z) {
                        arrayList.add(c17030);
                    } else if (strM17979 == null) {
                        arrayList2.add(c17030);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            C17030 c17031 = (C17030) C9030.stream(arrayList).min(C21023.thenComparing(C21023.thenComparingLong(C7618.comparingLong(new C15876()), new C20109()), new C0352())).orElseThrow(new C16581());
            Uri uri2 = c17031.f54408;
            m17963(uri2);
            c4502M17957 = m17957(interfaceC20723, uri2, new C1507(c5741, null), c14465);
            AbstractC10681 abstractC10682 = c4502M17957.f16010;
            if (!(abstractC10682 instanceof C16325)) {
                throw new C3796("Nested multivariant playlists are unsupported");
            }
            c16325 = (C16325) abstractC10682;
            C7648 c7649 = c17031.f54409;
            str = uri2 + "|" + c7649.f25277 + "|" + c7649.f25259 + "|" + c7649.f25266 + "|" + c7649.f25246 + "x" + c7649.f25253;
        } else {
            AbstractC10681 abstractC10683 = c4502M17958.f16010;
            if (!(abstractC10683 instanceof C16325)) {
                throw new C3796("Unsupported HLS playlist type");
            }
            c16325 = (C16325) abstractC10683;
            str = "direct";
            c4502M17957 = c4502M17958;
        }
        for (C15620 c15620 : c16325.f52586) {
            if (!c15620.f63675) {
                EnumC3879 enumC3879M36384 = C15170.m36384(c16325, c15620);
                if (enumC3879M36384 == null) {
                    throw new C3796("HLS playlist is not eligible for thumbnails");
                }
                C15620 c15621 = c15620.f63676;
                C22142 c22142M28861 = c15621 != null ? c11559.m28861(c16325, c15621) : null;
                C22142 c22142M28862 = c11559.m28861(c16325, c15620);
                if (enumC3879M36384 == EnumC3879.FRAGMENTED_MP4 && c22142M28861 == null) {
                    throw new C3796("Fragmented MP4 initialization is missing");
                }
                if (c22142M28861 != null && c22142M28861.f71672 > C17492.FOREVER_NS - c22142M28862.f71672) {
                    throw new C3796("HLS thumbnail resource length overflows");
                }
                MessageDigest messageDigestM49421 = C22253.m49421();
                m17961(messageDigestM49421, "hls-thumb-v1");
                m17961(messageDigestM49421, c4502M17958.f16011.toString());
                m17961(messageDigestM49421, c4502M17958.f16009);
                m17961(messageDigestM49421, c4502M17957.f16011.toString());
                m17961(messageDigestM49421, c4502M17957.f16009);
                m17961(messageDigestM49421, str);
                m17961(messageDigestM49421, enumC3879M36384.name());
                m17962(messageDigestM49421, c22142M28861);
                m17962(messageDigestM49421, c22142M28862);
                return new C5208(enumC3879M36384, c22142M28861, c22142M28862, "hls_thumb_v1_".concat(C22253.m49424(messageDigestM49421.digest())));
            }
        }
        throw new C3796("HLS media segment is missing");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4502 m17957(InterfaceC20723 interfaceC20723, Uri uri, C1507 c1507, C14465 c14465) throws IOException {
        m17963(uri);
        InterfaceC15785 interfaceC15785Mo4000 = interfaceC20723.mo4000();
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        c16490.m38754(1);
        C0261 c0261 = new C0261(interfaceC15785Mo4000, c16490.m38753());
        MessageDigest messageDigestM49421 = C22253.m49421();
        C10937 c10937M34865 = c14465.m34865(c0261);
        try {
            c14465.m34868();
            c0261.m1760();
            Uri uriMo9274 = interfaceC15785Mo4000.mo9274();
            if (uriMo9274 != null) {
                uri = uriMo9274;
            }
            m17963(uri);
            AbstractC10681 abstractC10681M5208 = c1507.m5208(uri, new C3174(new DigestInputStream(new C1763(c0261), messageDigestM49421)));
            c14465.m34868();
            C4502 c4502 = new C4502(abstractC10681M5208, uri, C22253.m49424(messageDigestM49421.digest()));
            c10937M34865.close();
            return c4502;
        } catch (Throwable th) {
            try {
                c10937M34865.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m17954(final C5208 c5208, final InterfaceC20723 interfaceC20723, int i, final C14465 c14465) throws Throwable {
        Throwable th;
        int width;
        Bitmap frameAtTime;
        int iMin;
        if (c5208.f18050 == EnumC3879.MPEG_TS) {
            C6265 c6265M17334 = C6265.m17334(c5208.f18047.f71670, new InterfaceC23905() { // from class: l.ܿۤ۬
                @Override // l.InterfaceC23905
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC3153 mo32704() {
                    C16291 c16291M49114 = c5208.f18047.m49114(interfaceC20723);
                    return new C23637(c16291M49114, c14465.m34865(c16291M49114));
                }
            }, true);
            C13638.requireNonNull(c14465);
            return C2073.m6583(c6265M17334, i, new InterfaceC0413() { // from class: l.ۛۤ۬
                @Override // l.InterfaceC0413
                /* JADX INFO: renamed from: ۙ */
                public final void mo2170() throws InterruptedIOException {
                    c14465.m34868();
                }
            });
        }
        if (Build.VERSION.SDK_INT < 23 || c5208.f18049 == null) {
            throw new C3796("Fragmented MP4 thumbnails require Android M");
        }
        C22142 c22142 = c5208.f18049;
        if (c22142 == null) {
            throw new C3796("Fragmented MP4 initialization is missing");
        }
        C22142 c22143 = c5208.f18047;
        C16291 c16291M49114 = c22142.m49114(interfaceC20723);
        C16291 c16291 = null;
        bitmapM15046 = null;
        Bitmap bitmapM15046 = null;
        C5250 c5250 = null;
        try {
            C16291 c16291M49115 = c22143.m49114(interfaceC20723);
            try {
                C22890 c22890 = new C22890(c16291M49114, c16291M49115);
                C23637 c23637 = new C23637(c22890, c14465.m34865(c22890));
                long j = c22142.f71672;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    c14465.m34868();
                    C8612 c8612M44065 = C19195.m44065(c23637, j);
                    if (c8612M44065.m22386() != 0) {
                        C5250 c5251 = new C5250(c23637, j, c8612M44065.m22388(0), c8612M44065.m22389(0));
                        try {
                            mediaMetadataRetriever.setDataSource(c5251);
                            c14465.m34868();
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
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(c8612M44065.m22390(), 2);
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
                                frameAtTime = C16540.m38919(mediaMetadataRetriever, c8612M44065.m22390(), iArr[0], iArr[1]);
                            }
                            c14465.m34868();
                            if (frameAtTime != null) {
                                if (width <= 0) {
                                    width = frameAtTime.getWidth();
                                }
                                if (height <= 0) {
                                    height = frameAtTime.getHeight();
                                }
                                bitmapM15046 = C5443.m15046(frameAtTime, i, width, height);
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused3) {
                            }
                            C19431.m44468(c5251);
                        } catch (Throwable th2) {
                            th = th2;
                            c23637 = null;
                            c5250 = c5251;
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused4) {
                            }
                            if (c5250 != null) {
                                C19431.m44468(c5250);
                                throw th;
                            }
                            C19431.m44468(c23637);
                            throw th;
                        }
                    } else {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused5) {
                        }
                        C19431.m44468(c23637);
                    }
                    return bitmapM15046;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c16291 = c16291M49115;
                if (c16291 != null) {
                    try {
                        c16291.close();
                    } catch (IOException e2) {
                        th.addSuppressed(e2);
                    }
                }
                try {
                    c16291M49114.close();
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
    public static void m17962(MessageDigest messageDigest, C22142 c22142) {
        if (c22142 == null) {
            m17961(messageDigest, "none");
            return;
        }
        m17961(messageDigest, c22142.f71669.toString());
        m17961(messageDigest, c22142.f71670);
        m17961(messageDigest, Long.toString(c22142.f71671));
        m17961(messageDigest, Long.toString(c22142.f71672));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17961(MessageDigest messageDigest, String str) {
        if (str != null) {
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        }
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m17963(Uri uri) throws C3796 {
        String scheme = uri.getScheme();
        if (scheme == null || !"mt_media".equals(scheme.toLowerCase(Locale.ROOT)) || uri.getAuthority() != null) {
            throw new C3796("HLS thumbnail URI must stay in the current visitor");
        }
    }
}
