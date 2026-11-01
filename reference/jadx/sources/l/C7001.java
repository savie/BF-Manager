package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7001 extends AbstractC7707 {
    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11825() {
        return false;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۨ */
    public final void mo11823() {
        this.f25506 = null;
        this.f25501.m15462();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18809(C5590 c5590) {
        C5590 c5591 = this.f25501;
        c5591.f19195.add(c5590);
        c5590.f19189.add(c5591);
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۙ */
    public final void mo11821() {
        C20719 c20719 = this.f25504;
        if (c20719 instanceof C21424) {
            C5590 c5590 = this.f25501;
            c5590.f19190 = true;
            ArrayList arrayList = c5590.f19189;
            C21424 c21424 = (C21424) c20719;
            int iM47994 = c21424.m47994();
            boolean zM47993 = c21424.m47993();
            int i = 0;
            if (iM47994 == 0) {
                c5590.f19192 = EnumC2767.LEFT;
                while (i < c21424.f54816) {
                    C20719 c207110 = c21424.f54815[i];
                    if (zM47993 || c207110.m46606() != 8) {
                        C5590 c5591 = c207110.f67376.f25501;
                        c5591.f19195.add(c5590);
                        arrayList.add(c5591);
                    }
                    i++;
                }
                m18809(this.f25504.f67376.f25501);
                m18809(this.f25504.f67376.f25505);
                return;
            }
            if (iM47994 == 1) {
                c5590.f19192 = EnumC2767.RIGHT;
                while (i < c21424.f54816) {
                    C20719 c207111 = c21424.f54815[i];
                    if (zM47993 || c207111.m46606() != 8) {
                        C5590 c5592 = c207111.f67376.f25505;
                        c5592.f19195.add(c5590);
                        arrayList.add(c5592);
                    }
                    i++;
                }
                m18809(this.f25504.f67376.f25501);
                m18809(this.f25504.f67376.f25505);
                return;
            }
            if (iM47994 == 2) {
                c5590.f19192 = EnumC2767.TOP;
                while (i < c21424.f54816) {
                    C20719 c207112 = c21424.f54815[i];
                    if (zM47993 || c207112.m46606() != 8) {
                        C5590 c5593 = c207112.f67409.f25501;
                        c5593.f19195.add(c5590);
                        arrayList.add(c5593);
                    }
                    i++;
                }
                m18809(this.f25504.f67409.f25501);
                m18809(this.f25504.f67409.f25505);
                return;
            }
            if (iM47994 != 3) {
                return;
            }
            c5590.f19192 = EnumC2767.BOTTOM;
            while (i < c21424.f54816) {
                C20719 c207113 = c21424.f54815[i];
                if (zM47993 || c207113.m46606() != 8) {
                    C5590 c5594 = c207113.f67409.f25505;
                    c5594.f19195.add(c5590);
                    arrayList.add(c5594);
                }
                i++;
            }
            m18809(this.f25504.f67409.f25501);
            m18809(this.f25504.f67409.f25505);
        }
    }

    @Override // l.AbstractC7707, l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
        C21424 c21424 = (C21424) this.f25504;
        int iM47994 = c21424.m47994();
        C5590 c5590 = this.f25501;
        Iterator it = c5590.f19189.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C5590) it.next()).f19196;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iM47994 == 0 || iM47994 == 2) {
            c5590.mo15463(c21424.m48001() + i2);
        } else {
            c5590.mo15463(c21424.m48001() + i);
        }
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ܰ */
    public final void mo11824() {
        C20719 c20719 = this.f25504;
        if (c20719 instanceof C21424) {
            int iM47994 = ((C21424) c20719).m47994();
            C5590 c5590 = this.f25501;
            if (iM47994 == 0 || iM47994 == 1) {
                this.f25504.m46638(c5590.f19196);
            } else {
                this.f25504.m46610(c5590.f19196);
            }
        }
    }
}
