package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۟ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7379 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24475;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f24476;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24477;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24478;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7379(ViewOnClickListenerC15847 viewOnClickListenerC15847, AbstractActivityC12483 abstractActivityC12483, String str, String str2, String str3, String str4) {
        super(abstractActivityC12483, -1);
        this.f24476 = viewOnClickListenerC15847;
        this.f24477 = str;
        this.f24475 = str2;
        this.f24478 = str3;
        this.f24479 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (this.f24477.equals(strM40352)) {
            m40365(R.string.MT_Protector);
            return;
        }
        if (!strM40352.startsWith(this.f24475)) {
            m40347(d.O);
            return;
        }
        try {
            String strM37865 = C15916.m37840(strM40352.substring(this.f24475.length()), this.f24476.f51287.m21596(this.f24478)).m37865();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24479);
            String strM50267 = C22697.m50267(sb, this.f24475, strM37865);
            if (this.f24476.f51287.m21609(strM50267)) {
                m40365(R.string.MT_Protector);
                return;
            }
            try {
                C8229 c8229 = this.f24476.f51287;
                String str = this.f24478;
                synchronized (c8229) {
                    c8229.m21576(strM50267, c8229.m21568(str));
                }
                this.f24476.m37734();
                this.f24476.m37735(strM50267);
                m40364();
            } catch (Exception e) {
                this.f24476.f51295.m42627((Throwable) e);
            }
        } catch (Exception e2) {
            this.f24476.f51295.m42627((Throwable) e2);
        }
    }
}
