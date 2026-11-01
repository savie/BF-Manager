package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5824 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19785;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19787;

    public /* synthetic */ RunnableC5824(int i, Object obj, Object obj2) {
        this.f19786 = i;
        this.f19787 = obj;
        this.f19785 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l.ܺ᩻ۙ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19786) {
            case 0:
                InterfaceC3800 interfaceC3800 = (InterfaceC3800) this.f19787;
                AbstractC20745 abstractC20745 = (AbstractC20745) this.f19785;
                try {
                    if (C5212.exists(interfaceC3800, new EnumC22146[0])) {
                        C1254.m4508(interfaceC3800);
                    }
                    abstractC20745.mo24647();
                    return;
                } catch (IOException e) {
                    throw new C17013(e);
                }
            default:
                C21200 c21200 = (C21200) this.f19787;
                this.f19785.mo2625(c21200.f69000, c21200.f69001);
                return;
        }
    }
}
