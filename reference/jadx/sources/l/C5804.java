package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۛۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5804 implements InterfaceC9018 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC5677 f19719;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19720;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f19721;

    public C5804(ActivityC5677 activityC5677, C23444 c23444, boolean z) {
        this.f19721 = c23444;
        this.f19719 = activityC5677;
        this.f19720 = z;
        if (c23444.f75896 == null) {
            C6094 c6094 = (C6094) ((C18377) new C16717(activityC5677).m39205(C18377.class)).m42622().m44956();
            C13638.requireNonNull(c6094);
            c23444.f75896 = c6094;
        }
        if (c23444.f75912 == null) {
            c23444.f75912 = (C6382) new C16717(activityC5677).m39205(C6382.class);
        }
    }

    @Override // l.InterfaceC9018
    public final String getTitle() {
        return this.f19721.mo3620();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15975() {
        if (this.f19721.f75898) {
            C6111 c6111 = this.f19721.f75915;
            m15973(c6111.m17000().toString());
            if (this.f19720) {
                this.f19721.f73689.putBoolean("changed", false);
                C23444 c23444 = this.f19721;
                c23444.m50128(c23444.f75896.m47183());
                InterfaceC19083 interfaceC19083Mo19340 = this.f19721.mo19340();
                if (interfaceC19083Mo19340 != null) {
                    C20621 c20621 = (C20621) interfaceC19083Mo19340;
                    c20621.mo30475();
                    c20621.mo30474();
                }
            }
            c6111.m17009();
            return;
        }
        this.f19721.f75912.m17521();
        C23444 c23445 = this.f19721;
        C13626 c13626M50132 = c23445.m50132(c23445.f75896.m47183());
        C17367 c17367M40441 = C17367.m40441(c13626M50132.m33327());
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253409);
        int i = c17367M40441.readInt();
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253409);
        if (i == this.f19721.f75896.m16564(this.f19721.m51659())) {
            C23444 c23446 = this.f19721;
            m15973(C13167.m32559(c17367M40441, c23446.m50130(c23446.f75896.m47183()).m33318()));
        } else {
            m15973(this.f19721.f75896.m16578(this.f19721.m51659()));
        }
        if (this.f19720) {
            this.f19721.f73689.putBoolean("changed", false);
            C23444 c23447 = this.f19721;
            c23447.m50128(c23447.f75896.m47183());
            C13167.m32556(c17367M40441);
            C15157.m36338(4, this.f19721.f75896.m16564(this.f19721.m51659()), c17367M40441.f55260);
            synchronized (this.f19721) {
                byte[] bArr = c17367M40441.f55260;
                int i2 = C18019.f57618;
                c13626M50132.m33322(C18019.m41968(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15973(String str) throws Exception {
        C23444 c23444 = this.f19721;
        C8255 c8255M16574 = c23444.f75896.m16574(c23444.f75896.m16526(c23444.m51659()));
        if (C6843.m18449(str, c8255M16574.m21646(), c8255M16574) == null) {
            throw new Exception("Unknown error");
        }
        c23444.f75896.m16561(c23444.m51659(), str);
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Exception mo15974(Exception exc) {
        C23444 c23444 = this.f19721;
        if (!c23444.f75898) {
            return exc instanceof C22085 ? new C4682(c23444.m51659(), (C22085) exc) : exc;
        }
        ActivityC5677 activityC5677 = this.f19719;
        activityC5677.m31002(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C22085) {
            C22085 c22085 = (C22085) exc;
            activityC5677.m15667();
            C8500 c8500M22223 = C8500.m22223(c22085.f71538, c22085.f71540);
            c8500M22223.f29474 = false;
            activityC5677.m15660(c23444.m51659(), c8500M22223);
            c23444.f75896.m16532(c23444.m51659());
        }
        return null;
    }
}
