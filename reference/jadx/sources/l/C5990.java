package l;

import android.content.ComponentName;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ۛۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q13J */
/* JADX INFO: loaded from: classes3.dex */
public final class C5990 implements InterfaceC23898 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f20363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20364;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20365;

    public C5990(ComponentName componentName, boolean z, boolean z2) {
        this.f20363 = componentName;
        this.f20364 = z;
        this.f20365 = z2;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ComponentName mo16277() {
        return this.f20363;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo16278() {
        return this.f20364;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo16276() {
        return this.f20365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16275(final C11545 c11545, final InterfaceC2557 interfaceC2557) {
        if (C10930.m27411(c11545, interfaceC2557)) {
            C6936.m18602(interfaceC2557, OpenAuthTask.Duplex);
            C10930.m27410(c11545, interfaceC2557, this.f20363);
        } else {
            C8265.m21677(c11545, interfaceC2557, new InterfaceC18848() { // from class: l.ܿۤۚ
                @Override // l.InterfaceC18848
                /* JADX INFO: renamed from: ܰ */
                public final void mo4355(AbstractC20745 abstractC20745) {
                    InterfaceC2557 interfaceC2558 = interfaceC2557;
                    C6936.m18602(interfaceC2558, OpenAuthTask.Duplex);
                    C23630.m52095(c11545.m28824(), abstractC20745, interfaceC2558.mo7967()).m52101(this.f55028);
                }
            });
        }
    }
}
