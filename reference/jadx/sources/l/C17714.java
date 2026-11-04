package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ܽܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17714 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58201;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f58202;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58203;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58204;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17714(ViewOnClickListenerC20698 viewOnClickListenerC20698, AbstractActivityC17204 abstractActivityC17204, String str, String str2, String str3) {
        super(abstractActivityC17204, -1);
        this.f58202 = viewOnClickListenerC20698;
        this.f58204 = str;
        this.f58201 = str2;
        this.f58203 = str3;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String str = this.f58201;
        ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f58202;
        String strM22914 = m22914();
        String str2 = this.f58204;
        if (!strM22914.startsWith(str2)) {
            m22925(d.O);
            return;
        }
        try {
            String str3 = str + "/" + str2 + C20500.m47000(strM22914.substring(str2.length()), viewOnClickListenerC20698.f66350.m29990(str)).m47027();
            if (viewOnClickListenerC20698.f66350.m30009(str3)) {
                m22952(R.string.MT_Protector);
                return;
            }
            try {
                viewOnClickListenerC20698.f66350.m29973(str3, this.f58203);
                viewOnClickListenerC20698.m47363();
                viewOnClickListenerC20698.m47364(str3);
                m22951();
            } catch (Exception e) {
                viewOnClickListenerC20698.f66353.m51299(e);
            }
        } catch (Exception e2) {
            viewOnClickListenerC20698.f66353.m51299(e2);
        }
    }
}
