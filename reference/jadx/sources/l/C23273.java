package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23273 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75495;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15512 f75496;

    public C23273(C15512 c15512, String str) {
        this.f75496 = c15512;
        this.f75495 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f75496.f50515.m47980(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C15512 c15512 = this.f75496;
        AbstractC12233 abstractC12233 = c15512.f50518;
        InterfaceC2557 interfaceC2557 = c15512.f50517;
        String path = interfaceC2557.getPath();
        String parent = interfaceC2557.getParent();
        String str = this.f75495;
        String strM18162 = C6730.m18162(parent, str);
        if (c15512.f50520 && str.equalsIgnoreCase(c15512.f50519)) {
            String strM18163 = C6730.m18162(interfaceC2557.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC12233.mo10265(path, strM18163);
            abstractC12233.mo10265(strM18163, strM18162);
            return;
        }
        abstractC12233.mo10265(path, strM18162);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15512 c15512 = this.f75496;
        c15512.f50515.m47971(this.f75495);
        c15512.m40364();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f75496.f50515.m47980().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47529(this.f75496.f50518.mo10276());
    }
}
