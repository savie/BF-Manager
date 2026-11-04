package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩳۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18772 extends AbstractViewOnClickListenerC21206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20613 f60972;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C25291 f60973;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f60974;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f60975;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f60976;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0873 f60977;

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3322() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18772(C0873 c0873, Main main, int i, String str, String str2, C20613 c20613) {
        super(main);
        this.f60977 = c0873;
        this.f60975 = C21576.m49088(i);
        this.f60974 = str;
        this.f60973 = null;
        this.f60976 = str2 != null ? str2 : str;
        this.f60972 = c20613;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18772(C0873 c0873, Main main, String str, String str2, C20613 c20613, C25291 c25291) {
        super(main);
        this.f60977 = c0873;
        this.f60975 = str;
        this.f60974 = str2;
        this.f60973 = c25291;
        this.f60976 = str2;
        this.f60972 = c20613;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f60977.f27860.m24482() || AbstractViewOnClickListenerC21206.f67690.m55200()) {
            return;
        }
        Main main = this.f22654;
        main.m127();
        main.m117().m46155().m23226(this.f60974, true);
    }
}
