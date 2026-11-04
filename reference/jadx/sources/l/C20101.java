package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ᩴ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20101 extends C3036 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f64589;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18609 f64590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6633 f64591;

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        this.f9840 = c7926;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        this.f9840 = c16327;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        boolean z = c11018.f34795 == null;
        if (this.f64589 && !z) {
            C18609 c18609 = this.f64590;
            AbstractC22712 abstractC22712 = c18609.f60496.f49864;
            abstractC22712.getClass();
            char[] charArray = "$loc".toCharArray();
            this.f9840 = c18609.f60514.m37506(0L, C14769.of((Object) c18609.f60514.m37523(new C5816(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC22712.mo2069(charArray, charArray.length), c11018.f34795.f26659, this.f64591.f22152), c11018.f34795), (Object) c18609.f60514.m37553((AbstractC22295) null)));
            return;
        }
        this.f9840 = c11018;
    }

    public C20101(C18609 c18609, boolean z, C6633 c6633) {
        this.f64590 = c18609;
        this.f64589 = z;
        this.f64591 = c6633;
    }
}
