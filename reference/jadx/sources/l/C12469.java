package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.۫ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12469 extends C1052 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23195 f41582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22680 f41584;

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        this.f4871 = c8753;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        this.f4871 = c22489;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        boolean z = c11200.f37914 == null;
        if (this.f41583 && !z) {
            C22680 c22680 = this.f41584;
            AbstractC6302 abstractC6302 = c22680.f73845.f77631;
            abstractC6302.getClass();
            char[] charArray = "$loc".toCharArray();
            this.f4871 = c22680.f73854.m14617(0L, C21825.of((Object) c22680.f73854.m14594(new C6263(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC6302.mo17390(charArray, charArray.length), c11200.f37914.f30190, this.f41582.f75263), c11200.f37914), (Object) c22680.f73854.m14635((AbstractC5930) null)));
            return;
        }
        this.f4871 = c11200;
    }

    public C12469(C22680 c22680, boolean z, C23195 c23195) {
        this.f41584 = c22680;
        this.f41583 = z;
        this.f41582 = c23195;
    }
}
