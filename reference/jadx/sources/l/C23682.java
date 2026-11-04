package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩹ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final class C23682 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76788;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f76789;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76790;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76791;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76792;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23682(ViewOnClickListenerC20698 viewOnClickListenerC20698, AbstractActivityC17204 abstractActivityC17204, String str, String str2, String str3, String str4) {
        super(abstractActivityC17204, -1);
        this.f76789 = viewOnClickListenerC20698;
        this.f76791 = str;
        this.f76790 = str2;
        this.f76792 = str3;
        this.f76788 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (this.f76791.equals(strM22914)) {
            m22952(R.string.MT_Protector);
            return;
        }
        if (!strM22914.startsWith(this.f76790)) {
            m22925(d.O);
            return;
        }
        try {
            String strM47027 = C20500.m47000(strM22914.substring(this.f76790.length()), this.f76789.f66350.m29990(this.f76792)).m47027();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f76788);
            String strM23910 = C8947.m23910(sb, this.f76790, strM47027);
            if (this.f76789.f66350.m30009(strM23910)) {
                m22952(R.string.MT_Protector);
                return;
            }
            try {
                C11967 c11967 = this.f76789.f66350;
                String str = this.f76792;
                synchronized (c11967) {
                    c11967.m29973(strM23910, c11967.m29993(str));
                }
                this.f76789.m47363();
                this.f76789.m47364(strM23910);
                m22951();
            } catch (Exception e) {
                this.f76789.f66353.m51299(e);
            }
        } catch (Exception e2) {
            this.f76789.f66353.m51299(e2);
        }
    }
}
