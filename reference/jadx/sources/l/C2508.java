package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIXM */
/* JADX INFO: loaded from: classes3.dex */
public final class C2508 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f8025;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36000;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9219 m8391(C17467 c17467) {
        HashMap map = this.f8025;
        if (map == null) {
            return null;
        }
        return (C9219) map.get(c17467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8392(C17467 c17467, Integer num, C17467 c17468) {
        C9219 c9219M8391 = m8391(c17467);
        if (c9219M8391 == null) {
            c9219M8391 = new C9219();
            if (this.f8025 == null) {
                this.f8025 = new HashMap();
            }
            this.f8025.put(c17467, c9219M8391);
        }
        c9219M8391.m24396(num, c17468);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8393() {
        HashMap map = this.f8025;
        return map == null || map.isEmpty();
    }

    public final String toString() {
        return "Enum fields map: " + this.f8025;
    }
}
