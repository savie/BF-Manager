package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۛۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6290 extends AbstractViewOnClickListenerC21206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4052 f21354;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9622 f21355;

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3322() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6290(C4052 c4052, Main main, C9622 c9622) {
        super(main);
        this.f21354 = c4052;
        this.f21355 = c9622;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11983 m17972() {
        C9622 c9622 = this.f21355;
        C20613 c20613M25104 = c9622.m25104();
        if (c20613M25104 == null) {
            C8877 c8877M25121 = c9622.m25121();
            if (c8877M25121 != null) {
                C20613 c20613M23976 = c8877M25121.m23754() ? C20613.f66109 : C8969.m23952(c9622.m25117(), true).m23976();
                c9622.m25113(c20613M23976);
                return c20613M23976.f66117;
            }
            return C8969.m23952(c9622.m25117(), true).m23976().f66117;
        }
        return c20613M25104.f66117;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f21354.f27860.m24482() || AbstractViewOnClickListenerC21206.f67690.m55200()) {
            return;
        }
        C9622 c9622 = this.f21355;
        C8877 c8877M25121 = c9622.m25121();
        Main main = this.f22654;
        if (c8877M25121 == null) {
            main.m127();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(c9622.m25117(), new String[0]);
            C20065 c20065M117 = main.m117();
            C17359.requireNonNull(c20065M117);
            C8614 c8614M46155 = c20065M117.m46155();
            boolean zMo4281 = abstractC22044M35193.mo4281();
            if (!zMo4281) {
                c8614M46155.m23230(abstractC22044M35193.getName());
            }
            c8614M46155.m23226(zMo4281 ? abstractC22044M35193.mo4294() : abstractC22044M35193.getParent(), true);
            return;
        }
        if (main.m126(c8877M25121.m23755(), c9622.m25117(), c8877M25121.m23754())) {
            main.m127();
        }
    }
}
