package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21861 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f70939;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC17341 f70940;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f70941;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f70942;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f70943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f70944;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f70945;

    public C21861(InterfaceC2557 interfaceC2557, C21422 c21422, AbstractC12233 abstractC12233, AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341) {
        this.f70941 = interfaceC2557;
        this.f70945 = c21422;
        this.f70943 = abstractC12233;
        this.f70940 = abstractDialogInterfaceOnClickListenerC17341;
        String path = interfaceC2557.getPath();
        this.f70944 = path;
        this.f70939 = C20630.m46498(4, 0, path);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f70945.m47980(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC12233 abstractC12233 = this.f70943;
        String str = this.f70939;
        boolean zMo10261 = abstractC12233.mo10261(str);
        String str2 = this.f70944;
        if (zMo10261) {
            String strM18162 = C6730.m18162(this.f70941.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC12233.mo10265(str, strM18162);
            abstractC12233.mo10265(str2, str);
            abstractC12233.mo10265(strM18162, str2);
            this.f70942 = true;
            return;
        }
        abstractC12233.mo10265(str2, str);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f70940.m40364();
        String str = this.f70939;
        String strM18175 = C6730.m18175(str);
        C21422 c21422 = this.f70945;
        c21422.m47971(strM18175);
        if (this.f70942) {
            DialogInterfaceOnClickListenerC14147.m34221(c21422.m47980(), "restore_backup", C16737.m39264(R.string.MT_Protector, C6730.m18175(str)), true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f70945.m47980().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        this.f70945.m47969();
        C21094.m47529(this.f70943.mo10276());
    }
}
