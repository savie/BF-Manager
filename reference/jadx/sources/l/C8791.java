package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۡۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8791 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f30216;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30217;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30218;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30219;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8791(ViewOnClickListenerC15847 viewOnClickListenerC15847, AbstractActivityC12483 abstractActivityC12483, String str, String str2, String str3) {
        super(abstractActivityC12483, -1);
        this.f30216 = viewOnClickListenerC15847;
        this.f30218 = str;
        this.f30219 = str2;
        this.f30217 = str3;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String str = this.f30219;
        ViewOnClickListenerC15847 viewOnClickListenerC15847 = this.f30216;
        String strM40352 = m40352();
        String str2 = this.f30218;
        if (!strM40352.startsWith(str2)) {
            m40347(d.O);
            return;
        }
        try {
            String str3 = str + "/" + str2 + C15916.m37840(strM40352.substring(str2.length()), viewOnClickListenerC15847.f51287.m21596(str)).m37865();
            if (viewOnClickListenerC15847.f51287.m21609(str3)) {
                m40365(R.string.MT_Protector);
                return;
            }
            try {
                viewOnClickListenerC15847.f51287.m21576(str3, this.f30217);
                viewOnClickListenerC15847.m37734();
                viewOnClickListenerC15847.m37735(str3);
                m40364();
            } catch (Exception e) {
                viewOnClickListenerC15847.f51295.m42627((Throwable) e);
            }
        } catch (Exception e2) {
            viewOnClickListenerC15847.f51295.m42627((Throwable) e2);
        }
    }
}
