package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۖ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2169 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f7871;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f7872;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f7873;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f7874;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f7875;

    public /* synthetic */ C2169(C14745 c14745, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f7872 = c14745;
        this.f7875 = imageView;
        this.f7874 = interfaceC21926;
        this.f7871 = c16148;
        this.f7873 = dialogInterfaceC19356;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        C14745 c14745 = this.f7872;
        c14745.f48226 = (EnumC20447) obj;
        this.f7875.setImageBitmap(this.f7874.mo40846(c14745));
        C16148 c16148 = this.f7871;
        if (c16148.mo38231()) {
            c16148.m38232();
            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
        }
        this.f7873.dismiss();
    }
}
