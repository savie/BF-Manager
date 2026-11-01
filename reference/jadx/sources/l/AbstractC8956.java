package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۡܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 163F */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8956 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f30684 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f30683 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f30685 = false;

    /* JADX INFO: renamed from: ۨ */
    public void mo17355() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23251() {
        this.f30685 = true;
        HashMap map = this.f30684;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f30684.values().iterator();
                while (it.hasNext()) {
                    m23250(it.next());
                }
            }
        }
        LinkedHashSet linkedHashSet = this.f30683;
        if (linkedHashSet != null) {
            synchronized (linkedHashSet) {
                Iterator it2 = this.f30683.iterator();
                while (it2.hasNext()) {
                    m23250((Closeable) it2.next());
                }
            }
        }
        mo17355();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l.ۖܶۙ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23252(C2604 c2604) {
        Object obj;
        synchronized (this.f30684) {
            obj = this.f30684.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj == null) {
                this.f30684.put("androidx.lifecycle.savedstate.vm.tag", c2604);
            }
        }
        if (obj != null) {
            c2604 = obj;
        }
        if (this.f30685) {
            m23250((Object) c2604);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m23253() {
        Object obj;
        HashMap map = this.f30684;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f30684.get("androidx.lifecycle.savedstate.vm.tag");
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23250(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
