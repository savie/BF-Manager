package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩷᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22344 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f72323;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20106 f72324;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f72325;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f72326;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13558 f72327;

    public /* synthetic */ C22344(C9312 c9312, ImageView imageView, InterfaceC20106 interfaceC20106, C13558 c13558, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f72323 = c9312;
        this.f72326 = imageView;
        this.f72324 = interfaceC20106;
        this.f72327 = c13558;
        this.f72325 = dialogInterfaceC8327;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        C9312 c9312 = this.f72323;
        c9312.f30256 = (EnumC3459) obj;
        this.f72326.setImageBitmap(this.f72324.mo21304(c9312));
        C13558 c13558 = this.f72327;
        if (c13558.mo14758()) {
            c13558.m33269();
            ((DialogInterfaceC8327) c13558.mo2556()).m22431(false);
        }
        this.f72325.dismiss();
    }
}
