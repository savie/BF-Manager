package l;

import android.content.res.Resources;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.֨ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8ZS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1183 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8946 f5257;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f5259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ExecutorService f5260;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f5258 = new HashMap(3);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f5256 = new HashMap(3);

    public C1183() {
        m4321(C3300.m9806());
        m4321(new C5045());
        C21979 c21979M48800 = C21979.m48800();
        if (this.f5259) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        c21979M48800.getClass();
        Iterator it = Collections.singleton("image/svg+xml").iterator();
        while (it.hasNext()) {
            this.f5256.put((String) it.next(), c21979M48800);
        }
        if (AbstractC2222.m6843()) {
            C11396 c11396M28503 = C11396.m28503();
            if (this.f5259) {
                throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
            }
            c11396M28503.getClass();
            Iterator it2 = Collections.singleton("image/gif").iterator();
            while (it2.hasNext()) {
                this.f5256.put((String) it2.next(), c11396M28503);
            }
        }
        this.f5257 = new C8946(Resources.getSystem());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4321(AbstractC6123 abstractC6123) {
        if (!this.f5259) {
            Iterator it = abstractC6123.mo9807().iterator();
            while (it.hasNext()) {
                this.f5258.put((String) it.next(), abstractC6123);
            }
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }
}
