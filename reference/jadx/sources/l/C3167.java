package l;

import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ۗۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3167 implements InterfaceC15080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f11915;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f11916;

    public C3167(C11545 c11545, InterfaceC2557 interfaceC2557) {
        this.f11916 = c11545;
        this.f11915 = interfaceC2557;
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9566(C23630 c23630, InterfaceC23898 interfaceC23898, C6695 c6695) {
        C11545 c11545 = this.f11916;
        InterfaceC2557 interfaceC2557 = this.f11915;
        if (c6695 != null) {
            c6695.m18080(c11545, interfaceC2557);
        } else if (C10930.m27411(c11545, interfaceC2557)) {
            C6936.m18602(interfaceC2557, OpenAuthTask.Duplex);
            C10930.m27410(c11545, interfaceC2557, interfaceC23898.mo16277());
        } else {
            C8265.m21677(c11545, interfaceC2557, new C4155(interfaceC2557, c23630, interfaceC23898));
        }
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9565(View view, final C23630 c23630, final InterfaceC23898 interfaceC23898, final C6695 c6695) {
        final String strMo7970 = this.f11915.mo7970();
        C16195 c16195 = new C16195(this.f11916.m28824(), view, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!strMo7970.isEmpty());
        if (interfaceC23898 != null) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        final C11545 c11545 = this.f11916;
        c16195.m38296(new InterfaceC21133() { // from class: l.ۢۤۚ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                InterfaceC23898 interfaceC23899 = interfaceC23898;
                if (itemId != R.string.MT_Protector) {
                    if (itemId != R.string.MT_Protector) {
                        return true;
                    }
                    c23630.m52099(interfaceC23899);
                    return true;
                }
                C6695 c6696 = c6695;
                String str = strMo7970;
                if (c6696 != null) {
                    C21512.m48166(str, c6696);
                } else {
                    C21512.m48167(str, interfaceC23899);
                }
                C11545 c11546 = c11545;
                c11546.m28793();
                c11546.m28833().m28793();
                C15829.m37611(R.string.MT_Protector);
                return true;
            }
        });
        c16195.m38297();
    }
}
