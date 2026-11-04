package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܳۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18JT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15332 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f50085;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7688 f50086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024[] f50087;

    public C15332(List list) {
        this.f50085 = list;
        this.f50087 = new InterfaceC22024[list.size()];
        C7688 c7688 = new C7688(new InterfaceC0230() { // from class: l.ᩴۨ᩷
            @Override // l.InterfaceC0230
            /* JADX INFO: renamed from: ۙ */
            public final void mo1704(long j, C21287 c21287) {
                C7679.m20918(j, c21287, this.f63680.f50087);
            }
        });
        this.f50086 = c7688;
        c7688.m20960(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36781(InterfaceC12789 interfaceC12789, C10857 c10857) {
        int i = 0;
        while (true) {
            InterfaceC22024[] interfaceC22024Arr = this.f50087;
            if (i >= interfaceC22024Arr.length) {
                return;
            }
            c10857.m27594();
            InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 3);
            C15648 c15648 = (C15648) this.f50085.get(i);
            String str = c15648.f50848;
            C20782.m47564("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C20124 c20124 = new C20124();
            c20124.m46309(c10857.m27596());
            c20124.m46327("video/mp2t");
            c20124.m46315(str);
            c20124.m46294(c15648.f50850);
            c20124.m46321(c15648.f50811);
            c20124.m46297(c15648.f50818);
            c20124.m46301(c15648.f50835);
            interfaceC22024Mo16658.mo14384(c20124.m46295());
            interfaceC22024Arr[i] = interfaceC22024Mo16658;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36780(long j, C21287 c21287) {
        if (c21287.m48486() < 9) {
            return;
        }
        int iM48500 = c21287.m48500();
        int iM48501 = c21287.m48500();
        int iM48493 = c21287.m48493();
        if (iM48500 == 434 && iM48501 == 1195456820 && iM48493 == 3) {
            this.f50086.m20961(j, c21287);
        }
    }
}
