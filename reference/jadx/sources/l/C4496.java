package l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4496 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1423 f16001;

    public /* synthetic */ C4496(InterfaceC1423 interfaceC1423, int i) {
        this.f16000 = i;
        this.f16001 = interfaceC1423;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f16000) {
            case 0:
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f16001;
                if (((EnumC9493) obj).m24320() && dialogInterfaceC19356.m44375()) {
                    dialogInterfaceC19356.dismiss();
                    break;
                }
                break;
            case 1:
                ((ActivityC11632) this.f16001).m31002((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
            default:
                C15601.m37261((C15601) this.f16001, (List) obj);
                break;
        }
    }
}
