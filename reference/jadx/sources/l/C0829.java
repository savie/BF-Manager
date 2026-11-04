package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.֨֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0829 extends AbstractViewOnClickListenerC21206 implements InterfaceC2321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f3121;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8287 f3122;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f3123;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11983 f3124;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f3125;

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo3322() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829(C8287 c8287, Main main, AbstractC7364 abstractC7364) {
        super(main);
        this.f3122 = c8287;
        C21535 c21535Mo10171 = abstractC7364.mo10171();
        this.f3125 = c21535Mo10171.m48980();
        this.f3121 = c21535Mo10171.m48981();
        this.f3124 = c21535Mo10171.m48979().f66117;
        this.f3123 = abstractC7364.m20191();
    }

    @Override // l.InterfaceC2321
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3321() {
        return this.f3123;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8287 c8287 = this.f3122;
        if (c8287.f27860.m24482() || AbstractViewOnClickListenerC21206.f67690.m55200()) {
            return;
        }
        Main main = this.f22654;
        main.m127();
        C20065 c20065M117 = main.m117();
        if (c20065M117 == null || c20065M117.m46160(this.f3123)) {
            return;
        }
        c8287.m22380();
    }
}
