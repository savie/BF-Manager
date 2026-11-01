package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10427 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f35615;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18593 f35616;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f35617;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10427(C12543 c12543, AbstractActivityC12483 abstractActivityC12483, C18593 c18593, DialogInterfaceC19356 dialogInterfaceC19356) {
        super(abstractActivityC12483, -1);
        this.f35615 = c12543;
        this.f35616 = c18593;
        this.f35617 = dialogInterfaceC19356;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩵ܿ֨] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۡܿ֨] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        final String strTrim = m40352().trim();
        try {
            C8716.m22550(strTrim);
            C12543 c12543 = this.f35615;
            if (c12543.f41988) {
                return;
            }
            final C18593 c18593 = this.f35616;
            ?? r2 = new InterfaceC21009() { // from class: l.᩵ܿ֨
                @Override // l.InterfaceC21009
                public final C17887 run() {
                    C12543 c12544 = this.f62931.f35615;
                    C18593 c18594 = c18593;
                    String str = strTrim;
                    if (c18594 == null) {
                        return c12544.f41983.m22554(str);
                    }
                    c12544.f41983.m22556(c18594.f59153, str);
                    return null;
                }
            };
            final DialogInterfaceC19356 dialogInterfaceC19356 = this.f35617;
            c12543.m31191((InterfaceC21009) r2, (Runnable) new Runnable() { // from class: l.ۡܿ֨
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceC19356 dialogInterfaceC19357 = dialogInterfaceC19356;
                    if (dialogInterfaceC19357 == null || !dialogInterfaceC19357.m44375()) {
                        return;
                    }
                    dialogInterfaceC19357.m44377(strTrim);
                }
            });
            m40364();
        } catch (IllegalArgumentException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
