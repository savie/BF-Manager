package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22413 implements InterfaceC19425 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Collection f73143;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Map f73144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f73145;

    /* JADX INFO: renamed from: ۖ */
    public abstract Collection mo29508();

    /* JADX INFO: renamed from: ۨ */
    public abstract Set mo29511();

    /* JADX INFO: renamed from: ܰ */
    public abstract Map mo29513();

    /* JADX INFO: renamed from: ۙ */
    public boolean mo44700(Object obj) {
        Iterator it = mo44465().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Set m49698() {
        Set set = this.f73145;
        if (set != null) {
            return set;
        }
        Set setMo29511 = mo29511();
        this.f73145 = setMo29511;
        return setMo29511;
    }

    @Override // l.InterfaceC19425
    public Collection values() {
        Collection collection = this.f73143;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo29508 = mo29508();
        this.f73143 = collectionMo29508;
        return collectionMo29508;
    }

    @Override // l.InterfaceC19425
    /* JADX INFO: renamed from: ۙ */
    public Map mo44465() {
        Map map = this.f73144;
        if (map != null) {
            return map;
        }
        Map mapMo29513 = mo29513();
        this.f73144 = mapMo29513;
        return mapMo29513;
    }

    public int hashCode() {
        return mo44465().hashCode();
    }

    public String toString() {
        return mo44465().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC19425) {
            return mo44465().equals(((InterfaceC19425) obj).mo44465());
        }
        return false;
    }
}
