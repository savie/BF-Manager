package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19403 implements InterfaceC17544, InterfaceC17614, InterfaceC25265, InterfaceC18006 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62703;

    public /* synthetic */ C19403(int i, Object obj) {
        this.f62702 = i;
        this.f62703 = obj;
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ۙ */
    public View mo1858() {
        return ((AbstractActivityC17204) this.f62703).m40418(R.id.MT_Protector);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        AbstractC18900 abstractC18900;
        switch (this.f62702) {
            case 0:
                abstractC18900 = (C10452) this.f62703;
                break;
            default:
                abstractC18900 = (C8744) this.f62703;
                break;
        }
        abstractC18900.mo16839(i);
    }

    @Override // l.InterfaceC25265
    /* JADX INFO: renamed from: ۙ */
    public void mo40719(long j, long j2) {
        C17059.m40195((C17059) this.f62703, j, j2);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((C18372) this.f62703).m42858((C21532) obj, false);
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ۤ */
    public /* synthetic */ void mo1859() {
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ᩷ */
    public /* synthetic */ InterfaceC23097 mo1861() {
        return null;
    }
}
