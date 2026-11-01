package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ܿ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17210 extends AbstractViewOnClickListenerC10549 implements InterfaceC10861 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14600 f54852;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f54853;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23561 f54854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54855;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f54856;

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ */
    public final int mo13629() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17210(C23561 c23561, Main main, AbstractC11462 abstractC11462) {
        super(main);
        this.f54854 = c23561;
        C6086 c6086Mo13045 = abstractC11462.mo13045();
        this.f54856 = c6086Mo13045.m16495();
        this.f54855 = c6086Mo13045.m16497();
        this.f54852 = c6086Mo13045.m16496().f2944;
        this.f54853 = abstractC11462.m28617();
    }

    @Override // l.InterfaceC10861
    /* JADX INFO: renamed from: ۙ */
    public final int mo27216() {
        return this.f54853;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23561 c23561 = this.f54854;
        if (c23561.f21343.m31494() || AbstractViewOnClickListenerC10549.f36130.m50803()) {
            return;
        }
        Main main = this.f47137;
        main.m134();
        C6936 c6936M125 = main.m125();
        if (c6936M125 == null || c6936M125.m18645(this.f54853)) {
            return;
        }
        c23561.m51922();
    }
}
