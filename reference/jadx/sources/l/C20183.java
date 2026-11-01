package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 022A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20183 extends AbstractC8956 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20950 f65513 = new C15950();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f65515;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f65514 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f65517 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f65519 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f65516 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65518 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20183 m45618(C12484 c12484) {
        return (C20183) new C16717(c12484, f65513).m39205(C20183.class);
    }

    public C20183(boolean z) {
        this.f65515 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45624(boolean z) {
        this.f65518 = z;
    }

    @Override // l.AbstractC8956
    /* JADX INFO: renamed from: ۨ */
    public final void mo17355() {
        if (AbstractC8894.m23060(3)) {
            toString();
        }
        this.f65516 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m45626() {
        return this.f65516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45623(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (this.f65518) {
            AbstractC8894.m23060(2);
            return;
        }
        String str = componentCallbacksC22654.mWho;
        HashMap map = this.f65514;
        if (map.containsKey(str)) {
            return;
        }
        map.put(componentCallbacksC22654.mWho, componentCallbacksC22654);
        if (AbstractC8894.m23060(2)) {
            componentCallbacksC22654.toString();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m45628(String str) {
        return (ComponentCallbacksC22654) this.f65514.get(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45620() {
        return new ArrayList(this.f65514.values());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m45630(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (this.f65514.containsKey(componentCallbacksC22654.mWho) && this.f65515) {
            return this.f65516;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45625(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (this.f65518) {
            AbstractC8894.m23060(2);
        } else {
            if (this.f65514.remove(componentCallbacksC22654.mWho) == null || !AbstractC8894.m23060(2)) {
                return;
            }
            componentCallbacksC22654.toString();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20183 m45627(ComponentCallbacksC22654 componentCallbacksC22654) {
        String str = componentCallbacksC22654.mWho;
        HashMap map = this.f65517;
        C20183 c20183 = (C20183) map.get(str);
        if (c20183 != null) {
            return c20183;
        }
        C20183 c20184 = new C20183(this.f65515);
        map.put(componentCallbacksC22654.mWho, c20184);
        return c20184;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12484 m45621(ComponentCallbacksC22654 componentCallbacksC22654) {
        String str = componentCallbacksC22654.mWho;
        HashMap map = this.f65519;
        C12484 c12484 = (C12484) map.get(str);
        if (c12484 != null) {
            return c12484;
        }
        C12484 c12485 = new C12484();
        map.put(componentCallbacksC22654.mWho, c12485);
        return c12485;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45629(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (AbstractC8894.m23060(3)) {
            C13638.toString(componentCallbacksC22654);
        }
        m45619(componentCallbacksC22654.mWho);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45622(String str) {
        AbstractC8894.m23060(3);
        m45619(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m45619(String str) {
        HashMap map = this.f65517;
        C20183 c20183 = (C20183) map.get(str);
        if (c20183 != null) {
            c20183.mo17355();
            map.remove(str);
        }
        HashMap map2 = this.f65519;
        C12484 c12484 = (C12484) map2.get(str);
        if (c12484 != null) {
            c12484.m31027();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20183.class == obj.getClass()) {
            C20183 c20183 = (C20183) obj;
            if (this.f65514.equals(c20183.f65514) && this.f65517.equals(c20183.f65517) && this.f65519.equals(c20183.f65519)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f65519.hashCode() + ((this.f65517.hashCode() + (this.f65514.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f65514.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f65517.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f65519.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
