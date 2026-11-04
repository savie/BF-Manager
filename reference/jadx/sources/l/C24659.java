package l;

import android.content.res.Resources;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩺᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P8ZS */
/* JADX INFO: loaded from: classes.dex */
public final class C24659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3029 f79819;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f79820;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ExecutorService f79822;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f79821 = new HashMap(3);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f79823 = new HashMap(3);

    public C24659() {
        m55014(C17703.m41463());
        m55014(new C12482());
        C6517 c6517M18393 = C6517.m18393();
        if (this.f79820) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        c6517M18393.getClass();
        Iterator it = Collections.singleton("image/svg+xml").iterator();
        while (it.hasNext()) {
            this.f79823.put((String) it.next(), c6517M18393);
        }
        if (AbstractC20687.m47325()) {
            C3533 c3533M11560 = C3533.m11560();
            if (this.f79820) {
                throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
            }
            c3533M11560.getClass();
            Iterator it2 = Collections.singleton("image/gif").iterator();
            while (it2.hasNext()) {
                this.f79823.put((String) it2.next(), c3533M11560);
            }
        }
        this.f79819 = new C3029(Resources.getSystem());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55014(AbstractC13228 abstractC13228) {
        if (!this.f79820) {
            Iterator it = abstractC13228.mo31019().iterator();
            while (it.hasNext()) {
                this.f79821.put((String) it.next(), abstractC13228);
            }
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }
}
