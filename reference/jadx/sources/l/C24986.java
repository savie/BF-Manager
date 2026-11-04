package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 58MT */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C24986 extends AbstractC9395 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f80911;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C15288 f80913;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f80914;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C15648 f80915;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C25368 f80916;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14902 f80918;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4639 f80919;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f80912 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean f80917 = true;

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16154() {
    }

    public C24986(C4462 c4462, InterfaceC15670 interfaceC15670, InterfaceC4365 interfaceC4365) {
        this.f80911 = interfaceC15670;
        this.f80914 = interfaceC4365;
        C2225 c2225 = new C2225();
        c2225.m7571(Uri.EMPTY);
        c2225.m7573(c4462.f15963.toString());
        c2225.m7574((List) AbstractC1928.of((Object) c4462));
        c2225.m7572((Object) null);
        C14902 c14902M7570 = c2225.m7570();
        this.f80918 = c14902M7570;
        C20124 c20124 = new C20124();
        c20124.m46315((String) C20333.m46713(c4462.f15967, "text/x-unknown"));
        c20124.m46321(c4462.f15962);
        c20124.m46294(c4462.f15964);
        c20124.m46311(c4462.f15965);
        c20124.m46330(c4462.f15966);
        String str = c4462.f15961;
        c20124.m46309(str != null ? str : null);
        this.f80915 = c20124.m46295();
        C11941 c11941 = new C11941();
        c11941.m29911(c4462.f15963);
        c11941.m29909(1);
        this.f80916 = c11941.m29908();
        this.f80913 = new C15288(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c14902M7570, null);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final C14902 mo30717() {
        return this.f80918;
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ۙ */
    public final void mo16151(InterfaceC4639 interfaceC4639) {
        this.f80919 = interfaceC4639;
        m24728(this.f80913);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9147 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        return new C1865(this.f80916, this.f80911, this.f80919, this.f80915, this.f80912, this.f80914, m24734(c8402), this.f80917, null);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        ((C1865) interfaceC9147).f6286.m5083((InterfaceC8094) null);
    }
}
