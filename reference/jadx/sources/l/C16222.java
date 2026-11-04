package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܶܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16222 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52710;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f52711;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52712;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52713;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16222(ViewOnClickListenerC20698 viewOnClickListenerC20698, AbstractActivityC17204 abstractActivityC17204, String str, String str2, String str3, String str4) {
        super(abstractActivityC17204, -1);
        this.f52711 = viewOnClickListenerC20698;
        this.f52713 = str;
        this.f52712 = str2;
        this.f52714 = str3;
        this.f52710 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (this.f52713.equals(strM22914)) {
            m22951();
            return;
        }
        if (!strM22914.startsWith(this.f52712)) {
            m22925(d.O);
            return;
        }
        try {
            String strM47027 = C20500.m47000(strM22914.substring(this.f52712.length()), this.f52711.f66350.m29990(this.f52714)).m47027();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f52710);
            String strM23910 = C8947.m23910(sb, this.f52712, strM47027);
            if (this.f52711.f66350.m30009(strM23910)) {
                m22952(R.string.MT_Protector);
                return;
            }
            try {
                C11967 c11967 = this.f52711.f66350;
                String str = this.f52714;
                synchronized (c11967) {
                    String strM29993 = c11967.m29993(str);
                    c11967.m29974(Collections.singleton(str));
                    c11967.m29973(strM23910, strM29993);
                }
                this.f52711.m47363();
                this.f52711.m47364(strM23910);
                m22951();
            } catch (Exception e) {
                this.f52711.f66353.m51299(e);
            }
        } catch (Exception e2) {
            this.f52711.f66353.m51299(e2);
        }
    }
}
