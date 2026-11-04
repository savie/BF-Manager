package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14961 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21675 f48872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12724 f48873;

    public RunnableC14961(C21675 c21675, C12724 c12724) {
        this.f48872 = c21675;
        this.f48873 = c12724;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Rect bounds;
        C21675 c21675 = this.f48872;
        C12724 c12724 = this.f48873;
        String strM31534 = c12724.m31534();
        Drawable drawableMo9838 = null;
        try {
            String scheme = Uri.parse(strM31534).getScheme();
            if (scheme == null || scheme.length() == 0) {
                throw new IllegalStateException("No scheme is found: " + strM31534);
            }
            AbstractC13228 abstractC13228 = (AbstractC13228) ((HashMap) c21675.f69195).get(scheme);
            if (abstractC13228 != null) {
                C8995 c8995Mo31020 = abstractC13228.mo31020(strM31534);
                try {
                    AbstractC15465 abstractC15465 = (AbstractC15465) ((HashMap) c21675.f69198).get(c8995Mo31020.m23991());
                    if (abstractC15465 == null) {
                        abstractC15465 = c21675.f69193;
                    }
                    if (abstractC15465 != null) {
                        drawableMo9838 = abstractC15465.mo9838(c8995Mo31020.m23992());
                        c8995Mo31020.m23992().close();
                    } else {
                        throw new IllegalStateException("No media-decoder is found: " + strM31534);
                    }
                } catch (Throwable th) {
                    try {
                        c8995Mo31020.m23992().close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("No scheme-handler is found: " + strM31534);
            }
        } catch (Throwable unused2) {
        }
        if (drawableMo9838 != null && ((bounds = drawableMo9838.getBounds()) == null || bounds.isEmpty())) {
            drawableMo9838.setBounds(new Rect(0, 0, drawableMo9838.getIntrinsicWidth(), drawableMo9838.getIntrinsicHeight()));
        }
        c21675.f69194.postAtTime(new RunnableC4521(this, drawableMo9838), c12724, SystemClock.uptimeMillis());
    }
}
