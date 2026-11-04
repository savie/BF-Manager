package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܿ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6HZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18170 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumSet f59399 = EnumSet.noneOf(EnumC21154.class);

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m42340(C2551 c2551, EnumC21154 enumC21154) {
        C18170 c18170 = (C18170) c2551.mo17862((InterfaceC2157) C11457.f36024);
        if (c18170 == null) {
            return false;
        }
        return c18170.f59399.contains(enumC21154);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42339(C2551 c2551, EnumC21154 enumC21154) {
        C18170 c18170 = (C18170) c2551.mo17862(C11457.f36024);
        if (c18170 == null) {
            c18170 = new C18170();
            c2551.mo17864(c18170);
        }
        c18170.f59399.add(enumC21154);
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return "CodeFeatures{" + this.f59399 + '}';
    }

    public final String toString() {
        return mo1790();
    }
}
