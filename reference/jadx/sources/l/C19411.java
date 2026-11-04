package l;

import android.graphics.Bitmap;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩳ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19411 implements InterfaceC19795, InterfaceC5392, InterfaceC21436, InterfaceC21100, InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62744;

    public /* synthetic */ C19411(int i, Object obj) {
        this.f62743 = i;
        this.f62744 = obj;
    }

    public /* synthetic */ C19411(C11041 c11041, C17074 c17074) {
        this.f62743 = 1;
        this.f62744 = c17074;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C19714.m45406((C19714) this.f62744, menuItem);
        return true;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public void mo11629(AbstractC11781 abstractC11781) {
        ((InterfaceC14852) this.f62744).mo11629(abstractC11781);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public /* synthetic */ boolean mo11630() {
        return false;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).mo45986((C17074) this.f62744);
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        new C2368(((C8614) this.f62744).m23233(), abstractC22044).m8051();
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        switch (this.f62743) {
            case 3:
                return C8275.m22342((InterfaceC0817) this.f62744);
            default:
                return C8275.m22343((AbstractC22044) this.f62744);
        }
    }
}
