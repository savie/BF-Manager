package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۛ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R6JT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6741 implements InterfaceC21012, AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f22463 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m18844(String str) throws C1587 {
        int iIndexOf = str.indexOf(44);
        if (!str.startsWith("data:") || iIndexOf < 12 || !str.regionMatches(iIndexOf - 7, ";base64", 0, 7)) {
            throw new C1587("SVG image must be a Base64 data URL");
        }
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf2 <= 5 || !str.substring(5, iIndexOf2).equalsIgnoreCase("image/svg+xml")) {
            return iIndexOf + 1;
        }
        throw new C1587("Nested SVG images are not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6741 m18841(LinkedHashSet linkedHashSet, C2442 c2442, long j, C4108 c4108) {
        C6741 c6741 = new C6741();
        try {
            long jMin = Math.min(j, (c2442.m8241() - c2442.m8244()) / 2);
            int size = linkedHashSet.size();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m18843(c4108);
                C12706 c12706M18842 = m18842(str, c2442, jMin / ((long) size), c4108);
                try {
                    c6741.f22463.put(str, c12706M18842);
                    jMin -= c12706M18842.f40697.m24287();
                    size--;
                } catch (Throwable th) {
                    c12706M18842.close();
                    throw th;
                }
            }
            m18843(c4108);
            return c6741;
        } catch (Throwable th2) {
            c6741.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12706 m18842(String str, C2442 c2442, long j, C4108 c4108) throws IOException {
        int iM18844 = m18844(str);
        for (int i = iM18844; i < str.length(); i++) {
            if ((i & 4095) == 0) {
                m18843(c4108);
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '/' || cCharAt == '=' || cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n'))) {
                throw new IOException("Invalid SVG image Base64 data");
            }
        }
        C9153 c9153M8242 = c2442.m8242(((((long) str.length()) - ((long) iM18844)) * 5) + 65536);
        try {
            if (c9153M8242 == null) {
                throw new C18740("SVG image workspace exceeds budget");
            }
            try {
                byte[] bArrDecode = Base64.decode(str.substring(iM18844), 0);
                m18843(c4108);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                C6808.f22671.m18989(i2, i3);
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inScaled = false;
                long jMin = Math.min(j, c2442.m8241() - c2442.m8244());
                for (int i4 = 1; i4 > 0; i4 *= 2) {
                    long jM33204 = C13519.m33204(i2, i3, i4);
                    if (jM33204 <= jMin) {
                        m18843(c4108);
                        C9153 c9153M8243 = c2442.m8242(jM33204);
                        if (c9153M8243 == null) {
                            throw new C18740("SVG image workspace exceeds budget");
                        }
                        Bitmap bitmap = null;
                        try {
                            options.inSampleSize = i4;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                            if (bitmapDecodeByteArray == null) {
                                throw new IOException("SVG image could not be decoded");
                            }
                            m18843(c4108);
                            long allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
                            if (allocationByteCount <= jMin && c9153M8243.m24288(allocationByteCount)) {
                                C12706 c12706 = new C12706(new C10743(bitmapDecodeByteArray, i2, i3), c9153M8243);
                                c9153M8242.close();
                                return c12706;
                            }
                            bitmapDecodeByteArray.recycle();
                            c9153M8243.close();
                        } catch (Throwable th) {
                            if (0 != 0) {
                                bitmap.recycle();
                            }
                            c9153M8243.close();
                            throw th;
                        }
                    }
                    if (i4 >= Math.max(i2, i3)) {
                        break;
                    }
                }
                throw new C18740("SVG embedded image exceeds budget");
            } catch (IllegalArgumentException e) {
                throw new IOException("Invalid SVG image Base64 data", e);
            }
        } catch (Throwable th2) {
            try {
                c9153M8242.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // l.InterfaceC21012
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10743 mo18846(String str) {
        C12706 c12706 = (C12706) this.f22463.get(str);
        if (c12706 == null) {
            throw new IllegalStateException("SVG image was not prepared");
        }
        return c12706.f40696;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18845() {
        Iterator it = this.f22463.values().iterator();
        long jM24287 = 0;
        while (it.hasNext()) {
            jM24287 += ((C12706) it.next()).f40697.m24287();
        }
        return jM24287;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        HashMap map = this.f22463;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C12706) it.next()).close();
        }
        map.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18843(C4108 c4108) throws InterruptedIOException {
        if (c4108.mo924()) {
            throw new InterruptedIOException("SVG image decode cancelled");
        }
    }
}
