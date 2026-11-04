package l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IVS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20736 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20736 f66463 = new C20736(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f66464;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36011;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20736 m47430(Set set) {
        if (C4123.m13229(set)) {
            return f66463;
        }
        return new C20736(set);
    }

    public C20736(Set set) {
        this.f66464 = set;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m47431() {
        return this.f66464;
    }

    public final String toString() {
        if (this == f66463) {
            return "TYPE_VARS: EMPTY";
        }
        return "TYPE_VARS: " + this.f66464;
    }
}
