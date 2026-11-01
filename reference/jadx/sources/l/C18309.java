package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩳ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18309 extends AbstractViewOnClickListenerC10549 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11897 f58399;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8432 f58400;

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ */
    public final int mo13629() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18309(C8432 c8432, Main main, C11897 c11897) {
        super(main);
        this.f58400 = c8432;
        this.f58399 = c11897;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14600 m42525() {
        C11897 c11897 = this.f58399;
        C0690 c0690M29661 = c11897.m29661();
        if (c0690M29661 == null) {
            C5546 c5546M29659 = c11897.m29659();
            if (c5546M29659 != null) {
                C0690 c0690M48181 = c5546M29659.m15295() ? C0690.f2900 : C21512.m48160(c11897.m29678(), true).m48181();
                c11897.m29665(c0690M48181);
                return c0690M48181.f2944;
            }
            return C21512.m48160(c11897.m29678(), true).m48181().f2944;
        }
        return c0690M29661.f2944;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f58400.f21343.m31494() || AbstractViewOnClickListenerC10549.f36130.m50803()) {
            return;
        }
        C11897 c11897 = this.f58399;
        C5546 c5546M29659 = c11897.m29659();
        Main main = this.f47137;
        if (c5546M29659 == null) {
            main.m134();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(c11897.m29678(), new String[0]);
            C6936 c6936M125 = main.m125();
            C13638.requireNonNull(c6936M125);
            C11545 c11545M18646 = c6936M125.m18646();
            boolean zMo33974 = abstractC20745M15313.mo33974();
            if (!zMo33974) {
                c11545M18646.m28763(abstractC20745M15313.getName());
            }
            c11545M18646.m28812(zMo33974 ? abstractC20745M15313.mo33986() : abstractC20745M15313.getParent(), true);
            return;
        }
        if (main.m132(c5546M29659.m15296(), c11897.m29678(), c5546M29659.m15295())) {
            main.m134();
        }
    }
}
