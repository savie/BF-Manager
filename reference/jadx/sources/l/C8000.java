package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8000 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5655 f26239;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f26235 = new HashSet();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f26237 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f26236 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26238 = 0;

    public C8000(C5655 c5655) {
        this.f26239 = c5655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21065(C10124 c10124) {
        m21060(c10124, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21060(InterfaceC8858 interfaceC8858, int i) {
        C10124 c10124;
        String string = interfaceC8858.toString();
        HashSet hashSet = this.f26235;
        if (hashSet.contains(string)) {
            return;
        }
        hashSet.add(string);
        this.f26237.add(interfaceC8858);
        if (interfaceC8858.getName().equals("<clinit>")) {
            this.f26236.add(interfaceC8858.mo9700());
        }
        C19213 c19213 = (C19213) this.f26239.f19322.get(interfaceC8858.mo9700());
        if (c19213 == null) {
            return;
        }
        if (i > this.f26238) {
            this.f26238 = i;
        }
        if (!interfaceC8858.getName().equals("<clinit>")) {
            m21061(c19213, i);
        }
        Iterator it = c19213.getMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                c10124 = null;
                break;
            }
            c10124 = (C10124) it.next();
            if (c10124.equals(interfaceC8858)) {
                InterfaceC7945 interfaceC7945Mo25747 = c10124.mo25747();
                if (interfaceC7945Mo25747 == null) {
                    break;
                }
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    int i2 = interfaceC1594.mo5435().f35329;
                    if (i2 == 1) {
                        m21059(i + 1, ((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType());
                    } else if (i2 == 2) {
                        m21059(i + 1, ((InterfaceC18735) ((InterfaceC13859) interfaceC1594).getReference()).mo1183());
                    } else if (i2 == 3) {
                        m21060((InterfaceC8858) ((InterfaceC13859) interfaceC1594).getReference(), i + 1);
                    }
                }
                break;
            }
        }
        if (c10124 == null || !(EnumC15236.STATIC.m36501(c10124.mo25750()) || EnumC15236.PRIVATE.m36501(c10124.mo25750()))) {
            String strM49465 = C22304.m49465(interfaceC8858, true);
            m21062(c19213, strM49465, i);
            m21063(c19213, strM49465, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21062(C19213 c19213, String str, int i) {
        String type = c19213.getType();
        for (C19213 c19214 : this.f26239.f19322.values()) {
            if (type.equals(c19214.mo20494())) {
                for (C10124 c10124 : c19214.getMethods()) {
                    if (str.equals(C22304.m49465((InterfaceC8858) c10124, true))) {
                        m21060(c10124, i);
                        break;
                    }
                }
                m21062(c19214, str, i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m21063(C19213 c19213, String str, int i) {
        C19213 c19214 = (C19213) this.f26239.f19322.get(c19213.mo20494());
        if (c19214 != null) {
            for (C10124 c10124 : c19214.getMethods()) {
                if (str.equals(C22304.m49465((InterfaceC8858) c10124, true))) {
                    m21060(c10124, i);
                    break;
                }
            }
            m21063(c19214, str, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21061(C19213 c19213, int i) {
        if (this.f26236.contains(c19213.getType())) {
            return;
        }
        for (C10124 c10124 : c19213.mo20495()) {
            if (c10124.getName().equals("<clinit>")) {
                m21060(c10124, i);
                break;
            }
        }
        String strMo20494 = c19213.mo20494();
        if (strMo20494 != null) {
            m21059(i, strMo20494);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21059(int i, String str) {
        HashSet hashSet = this.f26236;
        if (hashSet.contains(str)) {
            return;
        }
        C19213 c19213 = (C19213) this.f26239.f19322.get(str);
        if (c19213 != null) {
            m21061(c19213, i);
        } else {
            hashSet.add(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m21064() {
        return this.f26237;
    }
}
