package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44QG */
/* JADX INFO: loaded from: classes.dex */
public final class C24558 extends AbstractC14425 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f79598;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f79599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f79600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24975 f79601;

    public C24558(C24975 c24975, int i) {
        this.f79601 = c24975;
        C8565 c8565M8724 = c24975.m55818().m8724(i);
        this.f79599 = c8565M8724.m22997();
        this.f79598 = c8565M8724.m22996();
        this.f79600 = c8565M8724.m23001();
        c8565M8724.m22995();
    }

    @Override // l.InterfaceC7886
    public final int getVisibility() {
        return this.f79599;
    }

    @Override // l.InterfaceC7886
    public final String getType() {
        return this.f79601.m55822(this.f79598);
    }

    @Override // l.InterfaceC7886
    public final Set getElements() {
        C24975 c24975 = this.f79601;
        C8565 c8565M8724 = c24975.m55818().m8724(this.f79600);
        int iM22996 = c8565M8724.m22996();
        int iM23001 = c8565M8724.m23001();
        c8565M8724.m22995();
        return new C6658(this, c24975, iM23001, iM22996);
    }
}
