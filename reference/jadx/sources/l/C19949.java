package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19949 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15716 f63900;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f63901;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f63902;

    public C19949(List list, C15716 c15716, List list2) {
        this.f63901 = AbstractC22433.copyOf((Collection) list);
        this.f63900 = c15716;
        this.f63902 = AbstractC22433.copyOf((Collection) list2);
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final C15716 mo37335() {
        return this.f63900;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC20608 mo37335() {
        return this.f63900;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22433 mo37337() {
        return this.f63901;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC22433 mo37336() {
        return this.f63902;
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f63900, "tok");
        c23244M37072.m51284(this.f63901, "toksBefore");
        c23244M37072.m51284(this.f63902, "toksAfter");
        return c23244M37072.toString();
    }
}
