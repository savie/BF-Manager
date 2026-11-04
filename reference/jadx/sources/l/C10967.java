package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۤܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10967 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34650;

    public /* synthetic */ C10967(int i, Object obj) {
        this.f34649 = i;
        this.f34650 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f34649) {
            case 0:
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : (MenuItem[]) this.f34650) {
                    menuItem.setVisible(!bool.booleanValue());
                }
                break;
            default:
                C7941 c7941 = (C7941) this.f34650;
                if (((EnumC8514) obj).m22827() && c7941.m19927()) {
                    c7941.m21621(-1, false, false);
                    break;
                }
                break;
        }
    }
}
