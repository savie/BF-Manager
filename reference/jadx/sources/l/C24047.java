package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes.dex */
public final class C24047 extends AbstractC9874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f77784;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14106 f77785;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 f77786;

    public C24047(C14106 c14106, C14769 c14769) {
        this(c14106, c14769, EnumSet.noneOf(EnumC3909.class));
    }

    public C24047(C14106 c14106, C14769 c14769, EnumSet enumSet) {
        this.f77785 = c14106;
        this.f77786 = c14769;
        this.f77784 = enumSet;
    }

    public final String toString() {
        C14106 c14106 = this.f77785;
        C14769 c14769 = this.f77786;
        if (c14769 == null) {
            return "Exports[" + c14106 + "]";
        }
        return "Exports[" + c14106 + ":" + c14769 + "]";
    }

    @Override // l.InterfaceC16482
    /* JADX INFO: renamed from: ۙ */
    public final void mo1476(InterfaceC15736 interfaceC15736) {
        interfaceC15736.mo19138(this);
    }
}
