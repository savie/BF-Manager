package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8717 extends AbstractC22343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC2731 f28382;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f28383;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f28384;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f28385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f28386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f28387;

    public C8717(InterfaceC15344 interfaceC15344, InterfaceC2731 interfaceC2731, String str, ArrayList arrayList) throws C10186 {
        C20500 c20500Mo9073;
        super((AbstractC14883) interfaceC15344);
        this.f28386 = new HashMap();
        this.f28383 = new HashMap();
        this.f28387 = new HashSet();
        this.f28382 = interfaceC2731;
        try {
            if (interfaceC2731 == null) {
                c20500Mo9073 = C20500.m47000("default".equals(str) ? "" : str, ((AbstractC16375) ((AbstractC14883) interfaceC15344).mo4332()).mo27606());
            } else {
                c20500Mo9073 = interfaceC2731.mo9073();
            }
            this.f72322 = c20500Mo9073;
            if (!C10208.m26337(this).equals(str)) {
                throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch variant is not canonical.");
            }
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C1260 c1260 = (C1260) it.next();
                if (c1260.m4579()) {
                    z = true;
                } else if (c1260.m4580()) {
                    this.f28387.add(Integer.valueOf(c1260.f4547 & 65535));
                }
            }
            this.f28384 = z;
            this.f28385 = interfaceC2731 == null ? -1 : interfaceC2731.mo9069();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1260 c1261 = (C1260) it2.next();
                if (!c1261.m4579()) {
                    int i = c1261.f4547 & 65535;
                    this.f28385 = Math.max(this.f28385, i);
                    if (c1261.m4580()) {
                        continue;
                    } else {
                        this.f28383.put(Integer.valueOf(i), c1261.f4551);
                        if ((!this.f28384 && !this.f28387.contains(Integer.valueOf(i)) && interfaceC2731 != null && interfaceC2731.mo9075(i)) || this.f28386.containsKey(Integer.valueOf(i))) {
                            throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Added resource variant already exists.");
                        }
                        this.f28386.put(Integer.valueOf(i), C4287.m13664(this, i, c1261.f4545));
                    }
                }
            }
        } catch (Exception unused) {
            throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch variant is invalid.");
        }
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۛ */
    public final int mo9069() {
        return this.f28385;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo9075(int i) {
        InterfaceC2731 interfaceC2731;
        if (this.f28386.containsKey(Integer.valueOf(i))) {
            return true;
        }
        return (this.f28384 || this.f28387.contains(Integer.valueOf(i)) || (interfaceC2731 = this.f28382) == null || !interfaceC2731.mo9075(i)) ? false : true;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۨۙ */
    public final boolean mo9072() {
        InterfaceC2731 interfaceC2731 = this.f28382;
        return interfaceC2731 != null && interfaceC2731.mo9072();
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ֫᩷ */
    public final boolean mo9067() {
        InterfaceC2731 interfaceC2731 = this.f28382;
        return interfaceC2731 != null && interfaceC2731.mo9067();
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final String mo9070(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f28383;
        if (map.containsKey(numValueOf)) {
            return (String) map.get(Integer.valueOf(i));
        }
        InterfaceC2731 interfaceC2731 = this.f28382;
        if (interfaceC2731 == null) {
            return null;
        }
        return interfaceC2731.mo9070(i);
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8697 mo9076(int i) {
        if (!mo9075(i)) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f28386;
        return map.containsKey(numValueOf) ? (InterfaceC8697) map.get(Integer.valueOf(i)) : this.f28382.mo9076(i);
    }
}
