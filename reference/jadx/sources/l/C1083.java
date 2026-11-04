package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 143X */
/* JADX INFO: loaded from: classes2.dex */
public class C1083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumSet f3875;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumSet f3876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC5075 f3877;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC5075 m4083() {
        return this.f3877;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo4085(EnumC19876 enumC19876) {
        this.f3875.add(enumC19876);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4082(EnumC19876 enumC19876) {
        this.f3876.add(enumC19876);
    }

    public C1083(InterfaceC5075 interfaceC5075) {
        this.f3877 = null;
        this.f3875 = EnumSet.noneOf(EnumC19876.class);
        this.f3876 = EnumSet.noneOf(EnumC19876.class);
        this.f3877 = interfaceC5075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4081(EnumC19876 enumC19876) {
        return this.f3876.contains(enumC19876) || this.f3875.contains(enumC19876);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4084(EnumC19876 enumC19876) {
        return this.f3875.contains(enumC19876);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4080() {
        this.f3875.clear();
        this.f3876.clear();
    }

    public C1083() {
        this(null);
    }
}
