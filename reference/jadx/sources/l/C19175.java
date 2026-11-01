package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19175 extends AbstractC12824 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f61919;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61920;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12783 f61921;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f61922;

    public C19175(InterfaceC19133 interfaceC19133, InterfaceC12783 interfaceC12783, String str, ArrayList arrayList) throws C12731 {
        C15916 c15916Mo31747;
        super((AbstractC10708) interfaceC19133);
        this.f61919 = new HashMap();
        this.f61922 = new HashMap();
        this.f61921 = interfaceC12783;
        try {
            if (interfaceC12783 == null) {
                c15916Mo31747 = C15916.m37840("default".equals(str) ? "" : str, ((AbstractC7179) ((AbstractC10708) interfaceC19133).mo1537()).mo19107());
            } else {
                c15916Mo31747 = interfaceC12783.mo31747();
            }
            this.f42695 = c15916Mo31747;
            if (!C21291.m47741(this).equals(str)) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch variant is not canonical.");
            }
            this.f61920 = interfaceC12783 == null ? -1 : interfaceC12783.mo31751();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C17763 c17763 = (C17763) it.next();
                int i = c17763.f56352 & 65535;
                if ((interfaceC12783 != null && interfaceC12783.mo31756(i)) || this.f61922.put(Integer.valueOf(i), c17763.f56351) != null) {
                    throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Added resource variant already exists.");
                }
                this.f61920 = Math.max(this.f61920, i);
                this.f61919.put(Integer.valueOf(i), C1098.m4100(this, i, c17763.f56349));
            }
        } catch (Exception unused) {
            throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch variant is invalid.");
        }
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۤ */
    public final int mo31751() {
        return this.f61920;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo31756(int i) {
        if (this.f61919.containsKey(Integer.valueOf(i))) {
            return true;
        }
        InterfaceC12783 interfaceC12783 = this.f61921;
        return interfaceC12783 != null && interfaceC12783.mo31756(i);
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo31750() {
        InterfaceC12783 interfaceC12783 = this.f61921;
        return interfaceC12783 != null && interfaceC12783.mo31750();
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۘܰ */
    public final boolean mo31748() {
        InterfaceC12783 interfaceC12783 = this.f61921;
        return interfaceC12783 != null && interfaceC12783.mo31748();
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۨ */
    public final String mo31752(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f61922;
        if (map.containsKey(numValueOf)) {
            return (String) map.get(Integer.valueOf(i));
        }
        InterfaceC12783 interfaceC12783 = this.f61921;
        if (interfaceC12783 == null) {
            return null;
        }
        return interfaceC12783.mo31752(i);
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC3609 mo31753(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f61919;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC3609) map.get(Integer.valueOf(i));
        }
        InterfaceC12783 interfaceC12783 = this.f61921;
        if (interfaceC12783 == null) {
            return null;
        }
        return interfaceC12783.mo31753(i);
    }
}
