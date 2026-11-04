package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܶۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15916 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51721;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51722;

    public /* synthetic */ C15916(int i, Object obj) {
        this.f51721 = i;
        this.f51722 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f51721) {
            case 0:
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f51722;
                if (((EnumC8514) obj).m22827() && dialogInterfaceC8327.m22434()) {
                    dialogInterfaceC8327.dismiss();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : (MenuItem[]) this.f51722) {
                    menuItem.setVisible(bool.booleanValue());
                }
                break;
            case 2:
                C21400.m48657((C21400) this.f51722, (C11967) obj);
                break;
            default:
                C13831.m33762((C13831) this.f51722, (String) obj);
                break;
        }
    }
}
