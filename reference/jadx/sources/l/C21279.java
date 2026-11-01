package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21279 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7874 f69268;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69269;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15636 f69270;

    public C21279(AbstractC7874 abstractC7874, String str, AbstractC15636 abstractC15636) {
        this.f69268 = abstractC7874;
        this.f69269 = str;
        this.f69270 = abstractC15636;
    }

    @Override // l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo17659(Object obj) throws Exception {
        AbstractC7874 abstractC7874 = this.f69268;
        HashMap map = abstractC7874.f25907;
        String str = this.f69269;
        Integer num = (Integer) map.get(str);
        AbstractC15636 abstractC15636 = this.f69270;
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC15636 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        abstractC7874.f25904.add(str);
        try {
            abstractC7874.mo20783(num.intValue(), abstractC15636, obj);
        } catch (Exception e) {
            abstractC7874.f25904.remove(str);
            throw e;
        }
    }

    @Override // l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo17658() {
        this.f69268.m20785(this.f69269);
    }
}
