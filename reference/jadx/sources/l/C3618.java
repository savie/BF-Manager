package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 26G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17042 f12397;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 f12398;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12567 f12399 = new C12567();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12400;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f12401;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16296 f12402;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18293 f12403;

    public C3618(C2551 c2551) {
        this.f12398 = c2551;
        C17042 c17042 = new C17042(c2551, this);
        this.f12397 = c17042;
        this.f12402 = new C16296(c2551, this, c17042);
        this.f12403 = new C18293(c2551);
        this.f12400 = c2551.m8508().size() * 400;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12050 m11738() {
        return m11737(this.f12398.m8535());
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12050 m11737(C21943 c21943) {
        C21943 c21943M52207;
        C17359.requireNonNull(c21943);
        C12567 c12567 = this.f12399;
        C12050 c12050 = new C12050(c12567.m31278());
        if (!c12567.m31281(c21943)) {
            boolean zM42627 = this.f12403.m42627(c21943);
            C2551 c2551 = this.f12398;
            if (zM42627) {
                EnumC1763 enumC1763 = EnumC1763.DUPLICATED;
                if (!c21943.mo17865(enumC1763)) {
                    c2551.m31138("Code duplicated, block: " + c21943 + ' ' + c21943.m39420());
                    c21943.mo17866(enumC1763);
                }
            }
            C21943 c21944 = c21943;
            while (c21944 != null) {
                if (c21944.mo17865(EnumC1763.MTH_EXIT_BLOCK)) {
                    c21944 = null;
                } else {
                    List listMo17861 = c21944.mo17861(C11457.f36019);
                    int size = listMo17861.size();
                    boolean z = false;
                    if (size == 0 || !c21944.mo17865(EnumC1763.LOOP_START)) {
                        c21943M52207 = null;
                    } else {
                        C16296 c16296 = this.f12402;
                        if (size == 1) {
                            c21943M52207 = c16296.m38657(c12050, (C11785) listMo17861.get(0), c12567);
                        } else {
                            Iterator it = listMo17861.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C11785 c11785 = (C11785) it.next();
                                    if (c11785.m29616() == c21944) {
                                        c21943M52207 = c16296.m38657(c12050, c11785, c12567);
                                    }
                                } else {
                                    c21943M52207 = null;
                                }
                            }
                        }
                        z = true;
                    }
                    C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21944);
                    if (!z && c18959M52200 != null) {
                        int i = C23756.f76982[c18959M52200.getType().ordinal()];
                        if (i == 1) {
                            c21943M52207 = this.f12397.m40164(c12050, c21944, (C17489) c18959M52200, c12567);
                        } else if (i == 2) {
                            c21943M52207 = new C14804(c2551, this).m35649(c12050, c21944, (C1082) c18959M52200, c12567);
                        } else if (i == 3) {
                            c21943M52207 = new C21518(c2551, this).m48923(c12050, c21944, c18959M52200, c12567);
                        }
                        z = true;
                    }
                    if (!z) {
                        c12050.m30228((InterfaceC6281) c21944);
                        c21943M52207 = C23231.m52207(c21944);
                    }
                    if (c21943M52207 == null || c12567.m31281(c21944) || c12567.m31281(c21943M52207)) {
                        c21944 = null;
                    } else {
                        c21944 = c21943M52207;
                    }
                }
                int i2 = this.f12401 + 1;
                this.f12401 = i2;
                if (i2 > this.f12400) {
                    throw new C2631("Regions count limit reached at block " + c21943);
                }
            }
        } else {
            List listMo17862 = c21943.mo17861(C11457.f36017);
            if (!listMo17862.isEmpty()) {
                ArrayList arrayList = new ArrayList(listMo17862.size());
                EnumC24203 enumC24203 = EnumC24203.BREAK;
                Iterator it2 = listMo17862.iterator();
                while (it2.hasNext()) {
                    C18959 c18959M43923 = ((C18916) it2.next()).m43923();
                    if (c18959M43923.getType() == enumC24203) {
                        arrayList.add(c18959M43923);
                        break;
                    }
                }
                EnumC24203 enumC24204 = EnumC24203.CONTINUE;
                Iterator it3 = listMo17862.iterator();
                while (it3.hasNext()) {
                    C18959 c18959M43924 = ((C18916) it3.next()).m43923();
                    if (c18959M43924.getType() == enumC24204) {
                        arrayList.add(c18959M43924);
                        break;
                    }
                }
                c12050.m30228((InterfaceC6281) new C0314(arrayList));
                return c12050;
            }
        }
        return c12050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12567 m11735() {
        return this.f12399;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11739(C21943 c21943) {
        return this.f12403.m42625(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11736(C21943 c21943) {
        this.f12403.m42628(c21943);
    }
}
