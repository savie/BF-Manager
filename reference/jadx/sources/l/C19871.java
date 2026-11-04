package l;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ᩴܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes5.dex */
public final class C19871 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f63901;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0884 f63903 = new C0884(25);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63902 = new HashMap();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f63901 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45731(C17328 c17328, ImageView imageView, C25093 c25093) {
        if (c25093.f81151 || !c25093.f81140.m22434()) {
            m45730(imageView);
            return;
        }
        int iM19160 = C6907.m19160(50.0f);
        String str = c17328.m40678() + ':' + iM19160;
        Drawable drawable = (Drawable) f63903.m3588(str);
        if (drawable != null) {
            m45730(imageView);
            imageView.setImageDrawable(drawable);
            return;
        }
        HashMap map = f63902;
        RunnableC22855 runnableC22855 = (RunnableC22855) map.get(str);
        if (runnableC22855 == null || imageView.getTag() != runnableC22855) {
            m45730(imageView);
        }
        imageView.setImageDrawable(null);
        boolean z = runnableC22855 == null;
        if (z) {
            runnableC22855 = new RunnableC22855(str, c17328, iM19160);
            map.put(str, runnableC22855);
        }
        runnableC22855.f74267.put(imageView, new WeakReference(c25093));
        imageView.setTag(runnableC22855);
        if (z) {
            try {
                f63901.execute(runnableC22855);
            } catch (RuntimeException unused) {
                runnableC22855.m51573((BitmapDrawable) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45730(ImageView imageView) {
        Object tag = imageView.getTag();
        imageView.setTag(null);
        if (tag instanceof RunnableC22855) {
            RunnableC22855 runnableC22855 = (RunnableC22855) tag;
            String str = runnableC22855.f74270;
            WeakHashMap weakHashMap = runnableC22855.f74267;
            weakHashMap.remove(imageView);
            runnableC22855.m51574((C25093) null);
            if (weakHashMap.isEmpty()) {
                HashMap map = f63902;
                if (map.get(str) == runnableC22855 && f63901.remove(runnableC22855)) {
                    map.remove(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45732(C25093 c25093) {
        Iterator it = f63902.values().iterator();
        while (it.hasNext()) {
            RunnableC22855 runnableC22855 = (RunnableC22855) it.next();
            runnableC22855.m51574(c25093);
            if (runnableC22855.f74267.isEmpty() && f63901.remove(runnableC22855)) {
                it.remove();
            }
        }
    }
}
