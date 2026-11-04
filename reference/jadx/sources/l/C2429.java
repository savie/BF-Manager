package l;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۖۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2429 implements InterfaceC5392, InterfaceC17544, InterfaceC21100, InterfaceC22491, InterfaceC0073 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7770;

    public /* synthetic */ C2429(Object obj) {
        this.f7770 = obj;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo1127() {
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC15610) this.f7770).mo1659(i);
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public void mo1128(String str) {
        ViewOnClickListenerC20698 viewOnClickListenerC20698 = (ViewOnClickListenerC20698) this.f7770;
        viewOnClickListenerC20698.m47341(new Runnable() { // from class: l.ۙܽۧ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20698 viewOnClickListenerC20699 = viewOnClickListenerC20698;
                new C11747(viewOnClickListenerC20699, (AbstractActivityC17204) viewOnClickListenerC20699.requireActivity(), str).m8197();
            }
        });
    }

    @Override // l.InterfaceC22491
    public C3977 onApplyWindowInsets(View view, C3977 c3977) {
        ViewGroup viewGroup = (ViewGroup) this.f7770;
        int i = ViewOnClickListenerC13408.f42716;
        C13275 c13275M12817 = c3977.m12817(1);
        C13275 c13275M12818 = c3977.m12817(2);
        C13275 c13275M12819 = c3977.m12817(8);
        viewGroup.setPadding(0, c13275M12817.f42408, 0, 0);
        view.setPadding(0, 0, 0, Math.max(c13275M12818.f42405, c13275M12819.f42405));
        return c3977;
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C3259.m10633((C8614) this.f7770, new String[]{abstractC22044.mo4294()}, null, false, true);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22351((InterfaceC0817) this.f7770);
    }
}
