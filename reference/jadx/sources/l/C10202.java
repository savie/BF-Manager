package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10202 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34847;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f34848;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34849;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34850;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34851;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10202(ViewOnClickListenerC15847 viewOnClickListenerC15847, AbstractActivityC12483 abstractActivityC12483, String str, String str2, String str3, String str4) {
        super(abstractActivityC12483, -1);
        this.f34848 = viewOnClickListenerC15847;
        this.f34849 = str;
        this.f34847 = str2;
        this.f34850 = str3;
        this.f34851 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (this.f34849.equals(strM40352)) {
            m40364();
            return;
        }
        if (!strM40352.startsWith(this.f34847)) {
            m40347(d.O);
            return;
        }
        try {
            String strM37865 = C15916.m37840(strM40352.substring(this.f34847.length()), this.f34848.f51287.m21596(this.f34850)).m37865();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f34851);
            String strM50267 = C22697.m50267(sb, this.f34847, strM37865);
            if (this.f34848.f51287.m21609(strM50267)) {
                m40365(R.string.MT_Protector);
                return;
            }
            try {
                C8229 c8229 = this.f34848.f51287;
                String str = this.f34850;
                synchronized (c8229) {
                    String strM21568 = c8229.m21568(str);
                    c8229.m21577(Collections.singleton(str));
                    c8229.m21576(strM50267, strM21568);
                }
                this.f34848.m37734();
                this.f34848.m37735(strM50267);
                m40364();
            } catch (Exception e) {
                this.f34848.f51295.m42627((Throwable) e);
            }
        } catch (Exception e2) {
            this.f34848.f51295.m42627((Throwable) e2);
        }
    }
}
