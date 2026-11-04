package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 022A */
/* JADX INFO: loaded from: classes3.dex */
public final class C3937 extends AbstractC13213 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11721 f13432 = new C24075();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f13437;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HashMap f13434 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f13438 = new HashMap();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashMap f13435 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13436 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13433 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3937 m12638(C23656 c23656) {
        return (C3937) new C16196(c23656, f13432).m38422(C3937.class);
    }

    public C3937(boolean z) {
        this.f13437 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12642(boolean z) {
        this.f13433 = z;
    }

    @Override // l.AbstractC13213
    /* JADX INFO: renamed from: ۤ */
    public final void mo6417() {
        if (AbstractC3191.m10427(3)) {
            toString();
        }
        this.f13436 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m12646() {
        return this.f13436;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12641(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (this.f13433) {
            AbstractC3191.m10427(2);
            return;
        }
        String str = componentCallbacksC11612.mWho;
        HashMap map = this.f13434;
        if (map.containsKey(str)) {
            return;
        }
        map.put(componentCallbacksC11612.mWho, componentCallbacksC11612);
        if (AbstractC3191.m10427(2)) {
            componentCallbacksC11612.toString();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m12647(String str) {
        return (ComponentCallbacksC11612) this.f13434.get(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m12649() {
        return new ArrayList(this.f13434.values());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m12644(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (this.f13434.containsKey(componentCallbacksC11612.mWho) && this.f13437) {
            return this.f13436;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12645(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (this.f13433) {
            AbstractC3191.m10427(2);
        } else {
            if (this.f13434.remove(componentCallbacksC11612.mWho) == null || !AbstractC3191.m10427(2)) {
                return;
            }
            componentCallbacksC11612.toString();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3937 m12643(ComponentCallbacksC11612 componentCallbacksC11612) {
        String str = componentCallbacksC11612.mWho;
        HashMap map = this.f13438;
        C3937 c3937 = (C3937) map.get(str);
        if (c3937 != null) {
            return c3937;
        }
        C3937 c3938 = new C3937(this.f13437);
        map.put(componentCallbacksC11612.mWho, c3938);
        return c3938;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23656 m12650(ComponentCallbacksC11612 componentCallbacksC11612) {
        String str = componentCallbacksC11612.mWho;
        HashMap map = this.f13435;
        C23656 c23656 = (C23656) map.get(str);
        if (c23656 != null) {
            return c23656;
        }
        C23656 c23657 = new C23656();
        map.put(componentCallbacksC11612.mWho, c23657);
        return c23657;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12648(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (AbstractC3191.m10427(3)) {
            C17359.toString(componentCallbacksC11612);
        }
        m12639(componentCallbacksC11612.mWho);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12640(String str) {
        AbstractC3191.m10427(3);
        m12639(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m12639(String str) {
        HashMap map = this.f13438;
        C3937 c3937 = (C3937) map.get(str);
        if (c3937 != null) {
            c3937.mo6417();
            map.remove(str);
        }
        HashMap map2 = this.f13435;
        C23656 c23656 = (C23656) map2.get(str);
        if (c23656 != null) {
            c23656.m52890();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3937.class == obj.getClass()) {
            C3937 c3937 = (C3937) obj;
            if (this.f13434.equals(c3937.f13434) && this.f13438.equals(c3937.f13438) && this.f13435.equals(c3937.f13435)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13435.hashCode() + ((this.f13438.hashCode() + (this.f13434.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f13434.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f13438.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f13435.keySet().iterator();
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
