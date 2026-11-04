package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5854 implements InterfaceC23229 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Map f20090;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Collection f20091;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f20092;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract Set mo17040();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract Map mo17042();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract Collection mo17043();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo17039(Object obj) {
        Iterator it = mo17038().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Set m17041() {
        Set set = this.f20092;
        if (set != null) {
            return set;
        }
        Set setMo17040 = mo17040();
        this.f20092 = setMo17040;
        return setMo17040;
    }

    @Override // l.InterfaceC23229
    public Collection values() {
        Collection collection = this.f20091;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo17043 = mo17043();
        this.f20091 = collectionMo17043;
        return collectionMo17043;
    }

    @Override // l.InterfaceC23229
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map mo17038() {
        Map map = this.f20090;
        if (map != null) {
            return map;
        }
        Map mapMo17042 = mo17042();
        this.f20090 = mapMo17042;
        return mapMo17042;
    }

    public int hashCode() {
        return mo17038().hashCode();
    }

    public final String toString() {
        return mo17038().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC23229) {
            return mo17038().equals(((InterfaceC23229) obj).mo17038());
        }
        return false;
    }
}
