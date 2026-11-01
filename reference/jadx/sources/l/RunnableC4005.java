package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4005 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6828 f14850;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5417 f14851;

    public RunnableC4005(C6828 c6828, C5417 c5417) {
        this.f14850 = c6828;
        this.f14851 = c5417;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Rect bounds;
        C6828 c6828 = this.f14850;
        C5417 c5417 = this.f14851;
        String strM14990 = c5417.m14990();
        Drawable drawableMo23247 = null;
        try {
            String scheme = Uri.parse(strM14990).getScheme();
            if (scheme == null || scheme.length() == 0) {
                throw new IllegalStateException("No scheme is found: " + strM14990);
            }
            AbstractC6123 abstractC6123 = (AbstractC6123) ((HashMap) c6828.f23010).get(scheme);
            if (abstractC6123 != null) {
                C10357 c10357Mo9808 = abstractC6123.mo9808(strM14990);
                try {
                    AbstractC17412 abstractC17412 = (AbstractC17412) ((HashMap) c6828.f23005).get(c10357Mo9808.m26255());
                    if (abstractC17412 == null) {
                        abstractC17412 = c6828.f23006;
                    }
                    if (abstractC17412 != null) {
                        drawableMo23247 = abstractC17412.mo23247(c10357Mo9808.m26256());
                        c10357Mo9808.m26256().close();
                    } else {
                        throw new IllegalStateException("No media-decoder is found: " + strM14990);
                    }
                } catch (Throwable th) {
                    try {
                        c10357Mo9808.m26256().close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("No scheme-handler is found: " + strM14990);
            }
        } catch (Throwable unused2) {
        }
        if (drawableMo23247 != null && ((bounds = drawableMo23247.getBounds()) == null || bounds.isEmpty())) {
            drawableMo23247.setBounds(new Rect(0, 0, drawableMo23247.getIntrinsicWidth(), drawableMo23247.getIntrinsicHeight()));
        }
        c6828.f23008.postAtTime(new RunnableC13179(this, drawableMo23247), c5417, SystemClock.uptimeMillis());
    }
}
