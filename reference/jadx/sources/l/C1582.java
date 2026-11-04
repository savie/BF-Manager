package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.֫֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1582 extends C10375 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24703 f5479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582(C24703 c24703, InterfaceC19106 interfaceC19106) {
        super(interfaceC19106);
        this.f5479 = c24703;
    }

    @Override // l.C10375
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5600() {
        C24703 c24703 = this.f5479;
        if (c24703.f79919.f78013) {
            return;
        }
        if (!c24703.f79922 || m26684() > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            c24703.f79919.m53996();
        }
    }
}
