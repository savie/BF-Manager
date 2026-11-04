package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۗᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3603 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C8367 f12353;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f12354 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4046 f12352 = new C4046();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static EnumC23741 f12355 = EnumC23741.UNINITIALIZED;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11685(ContextWrapper contextWrapper) {
        synchronized (f12354) {
            if (f12355 != EnumC23741.UNINITIALIZED) {
                return;
            }
            f12355 = EnumC23741.INITIALIZING;
            final Context applicationContext = contextWrapper.getApplicationContext();
            C5261.f18540.execute(new Runnable() { // from class: l.ܺᩴ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C3603.m11684(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11684(Context context) {
        C8367 c8367;
        try {
            c8367 = new C8367(new File(context.getCacheDir(), "video_media_cache"), new C0910(), new C9924(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
            try {
                Object obj = f12354;
                synchronized (obj) {
                    f12353 = c8367;
                    f12355 = EnumC23741.READY;
                    obj.notifyAll();
                }
            } catch (Throwable unused) {
                if (c8367 != null) {
                    c8367.m22528();
                }
                Object obj2 = f12354;
                synchronized (obj2) {
                    f12353 = null;
                    f12355 = EnumC23741.DISABLED;
                    obj2.notifyAll();
                }
                f12352.close();
            }
        } catch (Throwable unused2) {
            c8367 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16281 m11690(ContextWrapper contextWrapper) {
        C8367 c8367;
        boolean z;
        synchronized (f12354) {
            c8367 = f12355 == EnumC23741.READY ? f12353 : null;
            z = f12355 == EnumC23741.UNINITIALIZED || f12355 == EnumC23741.INITIALIZING;
        }
        if (z) {
            m11685(contextWrapper);
        }
        return new C16281(c8367, z, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C4046 m11688() {
        return f12352;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11682(Uri uri, InterfaceC15670 interfaceC15670) {
        if (interfaceC15670 instanceof C11543) {
            C11543 c11543 = (C11543) interfaceC15670;
            if (!c11543.m29051().isEmpty()) {
                String str = uri.buildUpon().fragment(null).build() + "\n" + c11543.m29051();
                MessageDigest messageDigestM36179 = C15022.m36179();
                m11686(messageDigestM36179, str);
                return "http:".concat(C15022.m36182(messageDigestM36179.digest()));
            }
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        MessageDigest messageDigestM361710 = C15022.m36179();
        m11686(messageDigestM361710, string);
        return "http:".concat(C15022.m36182(messageDigestM361710.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11683(AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386, String str) {
        MessageDigest messageDigestM36179 = C15022.m36179();
        abstractC7629.mo20833(messageDigestM36179);
        m11686(messageDigestM36179, interfaceC2386.getPath());
        long size = interfaceC2386.getSize();
        long time = interfaceC2386.getTime();
        m11686(messageDigestM36179, Long.toString(size));
        m11686(messageDigestM36179, Long.toString(time));
        if (size < 0 || time <= 0) {
            m11686(messageDigestM36179, str);
        }
        return "visitor:".concat(C15022.m36182(messageDigestM36179.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11686(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m11691() {
        Object obj = f12354;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
