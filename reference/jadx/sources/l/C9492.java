package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۡܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9492 implements InterfaceC25138, InterfaceC16025, InterfaceC17544, InterfaceC14722, InterfaceC3543 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30739;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30740;

    public /* synthetic */ C9492(int i, Object obj) {
        this.f30739 = i;
        this.f30740 = obj;
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        return (FutureC23690) this.f30740;
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        ActivityC18143.m42262((ActivityC18143) this.f30740, i, intent);
    }

    @Override // l.InterfaceC14722
    /* JADX INFO: renamed from: ۙ */
    public void mo18051(C18452 c18452) {
        switch (this.f30739) {
            case 5:
                ViewOnClickListenerC19404.m44891((ViewOnClickListenerC19404) this.f30740);
                break;
            default:
                ((C18372) this.f30740).f59867.suppressLayout(false);
                break;
        }
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        switch (this.f30739) {
            case 3:
                ((C11003) this.f30740).mo16839(i);
                break;
            default:
                ((InterfaceC4115) this.f30740).mo13205(((int) (i * 0.9f)) + 10);
                break;
        }
    }

    @Override // l.InterfaceC3543
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC15475 mo1860(int i) {
        return ((AbstractC22044[]) this.f30740)[i].mo4276("r");
    }
}
