package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۘܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes2.dex */
public final class C4085 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C15327 f15001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f15002 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14424 f15000 = new C14424();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static EnumC13259 f14999 = EnumC13259.UNINITIALIZED;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11622(ContextWrapper contextWrapper) {
        synchronized (f15002) {
            if (f14999 != EnumC13259.UNINITIALIZED) {
                return;
            }
            f14999 = EnumC13259.INITIALIZING;
            final Context applicationContext = contextWrapper.getApplicationContext();
            C4716.f16636.execute(new Runnable() { // from class: l.ۚܿ۬
                @Override // java.lang.Runnable
                public final void run() {
                    C4085.m11621(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11621(Context context) {
        C15327 c15327;
        try {
            c15327 = new C15327(new File(context.getCacheDir(), "video_media_cache"), new C4036(), new C3788(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
            try {
                Object obj = f15002;
                synchronized (obj) {
                    f15001 = c15327;
                    f14999 = EnumC13259.READY;
                    obj.notifyAll();
                }
            } catch (Throwable unused) {
                if (c15327 != null) {
                    c15327.m36708();
                }
                Object obj2 = f15002;
                synchronized (obj2) {
                    f15001 = null;
                    f14999 = EnumC13259.DISABLED;
                    obj2.notifyAll();
                }
                f15000.close();
            }
        } catch (Throwable unused2) {
            c15327 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1263 m11626(ContextWrapper contextWrapper) {
        C15327 c15327;
        boolean z;
        synchronized (f15002) {
            c15327 = f14999 == EnumC13259.READY ? f15001 : null;
            z = f14999 == EnumC13259.UNINITIALIZED || f14999 == EnumC13259.INITIALIZING;
        }
        if (z) {
            m11622(contextWrapper);
        }
        return new C1263(c15327, z, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C14424 m11624() {
        return f15000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11619(Uri uri, InterfaceC20723 interfaceC20723) {
        if (interfaceC20723 instanceof C11828) {
            C11828 c11828 = (C11828) interfaceC20723;
            if (!c11828.m29497().isEmpty()) {
                String str = uri.buildUpon().fragment(null).build() + "\n" + c11828.m29497();
                MessageDigest messageDigestM49421 = C22253.m49421();
                m11623(messageDigestM49421, str);
                return "http:".concat(C22253.m49424(messageDigestM49421.digest()));
            }
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        MessageDigest messageDigestM49422 = C22253.m49421();
        m11623(messageDigestM49422, string);
        return "http:".concat(C22253.m49424(messageDigestM49422.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11620(AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557, String str) {
        MessageDigest messageDigestM49421 = C22253.m49421();
        abstractC9677.mo15074(messageDigestM49421);
        m11623(messageDigestM49421, interfaceC2557.getPath());
        long size = interfaceC2557.getSize();
        long time = interfaceC2557.getTime();
        m11623(messageDigestM49421, Long.toString(size));
        m11623(messageDigestM49421, Long.toString(time));
        if (size < 0 || time <= 0) {
            m11623(messageDigestM49421, str);
        }
        return "visitor:".concat(C22253.m49424(messageDigestM49421.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11623(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m11617() {
        Object obj = f15002;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
