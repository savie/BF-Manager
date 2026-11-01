package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58MT */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C16623 extends AbstractC6537 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7648 f53329;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13689 f53330;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C7450 f53331;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f53332;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f53333;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19706 f53335;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12257 f53337;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f53336 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53334 = true;

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public final void mo4104() {
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ */
    public final void mo4111() {
    }

    public C16623(C4515 c4515, InterfaceC20723 interfaceC20723, InterfaceC14113 interfaceC14113) {
        this.f53333 = interfaceC20723;
        this.f53332 = interfaceC14113;
        C20348 c20348 = new C20348();
        c20348.m45916(Uri.EMPTY);
        c20348.m45918(c4515.f16065.toString());
        c20348.m45919((List) AbstractC22433.of((Object) c4515));
        c20348.m45917((Object) null);
        C13689 c13689M45915 = c20348.m45915();
        this.f53330 = c13689M45915;
        C10471 c10471 = new C10471();
        c10471.m26533((String) C15483.m37071(c4515.f16066, "text/x-unknown"));
        c10471.m26509(c4515.f16069);
        c10471.m26530(c4515.f16071);
        c10471.m26513(c4515.f16068);
        c10471.m26495(c4515.f16070);
        String str = c4515.f16067;
        c10471.m26516(str != null ? str : null);
        this.f53329 = c10471.m26497();
        C16490 c16490 = new C16490();
        c16490.m38756(c4515.f16065);
        c16490.m38754(1);
        this.f53337 = c16490.m38753();
        this.f53331 = new C7450(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c13689M45915, null);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final C13689 mo4106() {
        return this.f53330;
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۙ */
    public final void mo4110(InterfaceC19706 interfaceC19706) {
        this.f53335 = interfaceC19706;
        m17759(this.f53331);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6806 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        return new C20151(this.f53337, this.f53333, this.f53335, this.f53329, this.f53336, this.f53332, m17767(c15274), this.f53334, null);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        ((C20151) interfaceC6806).f65454.m51369((InterfaceC13407) null);
    }
}
