package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4488 implements InterfaceC9028 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f16042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f16043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f16044;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f16045;

    @Override // l.InterfaceC9028
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo14201() {
        return "Dex2Smali";
    }

    public C4488(ViewOnClickListenerC19404 viewOnClickListenerC19404, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, AbstractActivityC17204 abstractActivityC17204) {
        this.f16042 = viewOnClickListenerC19404;
        this.f16043 = abstractC22044;
        this.f16045 = abstractC22045;
        this.f16044 = abstractActivityC17204;
    }

    @Override // l.InterfaceC9028
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo14203() {
        return this.f16043;
    }

    @Override // l.InterfaceC9028
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo14199() {
        return this.f16045;
    }

    @Override // l.InterfaceC9028
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 mo14202() {
        return this.f16044;
    }

    @Override // l.InterfaceC9028
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14200(AbstractC22044 abstractC22044) {
        String strMo4294 = abstractC22044.mo4294();
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f16042;
        new C21642(viewOnClickListenerC19404, (AbstractActivityC17204) viewOnClickListenerC19404.requireActivity(), strMo4294, new ArrayList(), true).m8197();
    }
}
