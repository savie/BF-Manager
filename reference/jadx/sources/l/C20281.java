package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩶ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20281 extends AbstractViewOnClickListenerC10549 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f65725;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f65726;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18295 f65727;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f65728;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0690 f65729;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16753 f65730;

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ */
    public final int mo13629() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20281(C16753 c16753, Main main, int i, String str, String str2, C0690 c0690) {
        super(main);
        this.f65730 = c16753;
        this.f65726 = C16737.m39288(i);
        this.f65728 = str;
        this.f65727 = null;
        this.f65725 = str2 != null ? str2 : str;
        this.f65729 = c0690;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20281(C16753 c16753, Main main, String str, String str2, C0690 c0690, C18295 c18295) {
        super(main);
        this.f65730 = c16753;
        this.f65726 = str;
        this.f65728 = str2;
        this.f65727 = c18295;
        this.f65725 = str2;
        this.f65729 = c0690;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f65730.f21343.m31494() || AbstractViewOnClickListenerC10549.f36130.m50803()) {
            return;
        }
        Main main = this.f47137;
        main.m134();
        main.m125().m18646().m28812(this.f65728, true);
    }
}
