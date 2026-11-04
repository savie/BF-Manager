package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C0690 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f2586;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f2587;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24778 f2588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0690(C8893 c8893, AbstractActivityC17204 abstractActivityC17204, C24778 c24778, DialogInterfaceC8327 dialogInterfaceC8327) {
        super(abstractActivityC17204, -1);
        this.f2587 = c8893;
        this.f2588 = c24778;
        this.f2586 = dialogInterfaceC8327;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩶᩷ۚ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ܿ᩷ۚ] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        final String strTrim = m22914().trim();
        try {
            C15826.m37763(strTrim);
            C8893 c8893 = this.f2587;
            if (c8893.f29058) {
                return;
            }
            final C24778 c24778 = this.f2588;
            ?? r2 = new InterfaceC19335() { // from class: l.᩶᩷ۚ
                @Override // l.InterfaceC19335
                public final C11351 run() {
                    C8893 c8894 = this.f68922.f2587;
                    C24778 c24779 = c24778;
                    String str = strTrim;
                    if (c24779 == null) {
                        return c8894.f29059.m37764(str);
                    }
                    c8894.f29059.m37767(c24779.f80214, str);
                    return null;
                }
            };
            final DialogInterfaceC8327 dialogInterfaceC8327 = this.f2586;
            c8893.m23794((InterfaceC19335) r2, (Runnable) new Runnable() { // from class: l.ܿ᩷ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceC8327 dialogInterfaceC8328 = dialogInterfaceC8327;
                    if (dialogInterfaceC8328 == null || !dialogInterfaceC8328.m22434()) {
                        return;
                    }
                    dialogInterfaceC8328.m22439(strTrim);
                }
            });
            m22951();
        } catch (IllegalArgumentException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
