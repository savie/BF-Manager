package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10059 implements InterfaceC9018 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC5677 f34380;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f34381;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f34382;

    public C10059(ActivityC5677 activityC5677, C7236 c7236, boolean z) {
        this.f34382 = c7236;
        this.f34380 = activityC5677;
        this.f34381 = z;
        if (c7236.f24113 == null) {
            C8229 c8229 = (C8229) ((C18377) new C16717(activityC5677).m39205(C18377.class)).m42658().m44956();
            C13638.requireNonNull(c8229);
            c7236.f24113 = c8229;
        }
        if (c7236.f24120 == null) {
            c7236.f24120 = (C6382) new C16717(activityC5677).m39205(C6382.class);
        }
    }

    @Override // l.InterfaceC9018
    public final String getTitle() {
        return this.f34382.mo3620();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo15975() {
        if (this.f34382.f24116) {
            C6111 c6111 = this.f34382.f24106;
            m25471(c6111.m17000().toString());
            if (this.f34381) {
                this.f34382.f73689.putBoolean("changed", false);
                C7236 c7236 = this.f34382;
                c7236.m50128(c7236.f24113.m47183());
                InterfaceC19083 interfaceC19083Mo19340 = this.f34382.mo19340();
                if (interfaceC19083Mo19340 != null) {
                    C22759 c22759 = (C22759) interfaceC19083Mo19340;
                    c22759.mo30475();
                    c22759.mo30474();
                }
            }
            c6111.m17009();
            return;
        }
        this.f34382.f24120.m17521();
        C7236 c7237 = this.f34382;
        C13626 c13626M50132 = c7237.m50132(c7237.f24113.m47183());
        C17367 c17367M40441 = C17367.m40441(c13626M50132.m33327());
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253410);
        int i = c17367M40441.readInt();
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253410);
        if (i == this.f34382.f24113.m21597(this.f34382.m19346())) {
            C7236 c7238 = this.f34382;
            m25471(C13167.m32559(c17367M40441, c7238.m50130(c7238.f24113.m47183()).m33318()));
        } else {
            m25471(this.f34382.f24113.m21568(this.f34382.m19346()));
        }
        if (this.f34381) {
            this.f34382.f73689.putBoolean("changed", false);
            C7236 c7239 = this.f34382;
            c7239.m50128(c7239.f24113.m47183());
            C13167.m32556(c17367M40441);
            C15157.m36338(4, this.f34382.f24113.m21597(this.f34382.m19346()), c17367M40441.f55260);
            synchronized (this.f34382) {
                byte[] bArr = c17367M40441.f55260;
                int i2 = C18019.f57618;
                c13626M50132.m33322(C18019.m41968(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25471(String str) throws IOException {
        C7236 c7236 = this.f34382;
        String strM19346 = c7236.m19346();
        c7236.f24113.m21591(strM19346, str);
        if (strM19346.endsWith("package-info") || strM19346.endsWith("type-info")) {
            this.f34380.m15653().m42657();
        }
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final Exception mo15974(Exception exc) {
        int iM29578;
        C7236 c7236 = this.f34382;
        if (!c7236.f24116) {
            return exc instanceof C4811 ? new C8563(c7236.m19346(), (C4811) exc) : exc;
        }
        this.f34380.m31002(exc, (DialogInterface.OnDismissListener) null);
        if ((exc instanceof C4811) && (iM29578 = ((C4811) exc).m13367().m29578()) != -1) {
            c7236.f24106.m17023(iM29578 - 1);
        }
        return null;
    }
}
