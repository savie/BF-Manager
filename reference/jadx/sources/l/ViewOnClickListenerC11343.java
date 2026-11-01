package l;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۨ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11343 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f38275;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f38276;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f38277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f38278;

    public /* synthetic */ ViewOnClickListenerC11343(C14745 c14745, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148) {
        this.f38276 = c14745;
        this.f38278 = imageView;
        this.f38275 = interfaceC21926;
        this.f38277 = c16148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorStateList imageTintList = ((ImageView) view).getImageTintList();
        C13638.requireNonNull(imageTintList);
        int defaultColor = imageTintList.getDefaultColor();
        EnumC23917 enumC23917 = EnumC23917.IMMUTABLE;
        C14745 c14745 = this.f38276;
        c14745.f48224 = defaultColor;
        c14745.f48225 = enumC23917;
        this.f38278.setImageBitmap(this.f38275.mo40846(c14745));
        C16148 c16148 = this.f38277;
        if (c16148.mo38231()) {
            c16148.m38232();
            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
        }
    }
}
