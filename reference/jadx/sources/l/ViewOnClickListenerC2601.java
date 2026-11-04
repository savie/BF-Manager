package l;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۖۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2601 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20106 f8358;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13558 f8359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f8360;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f8361;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f8362;

    public /* synthetic */ ViewOnClickListenerC2601(AbstractActivityC17204 abstractActivityC17204, C9312 c9312, ImageView imageView, InterfaceC20106 interfaceC20106, C13558 c13558) {
        this.f8360 = abstractActivityC17204;
        this.f8362 = c9312;
        this.f8361 = imageView;
        this.f8358 = interfaceC20106;
        this.f8359 = c13558;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractActivityC17204 abstractActivityC17204 = this.f8360;
        C25227 c25227 = new C25227(abstractActivityC17204);
        c25227.setMotionEventSplittingEnabled(false);
        c25227.setLayoutManager(new C19458((Context) abstractActivityC17204, 5));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(c25227);
        c25227.setAdapter(new C15630(new C22344(this.f8362, this.f8361, this.f8358, this.f8359, c2361BuildDialog.m8016())));
    }
}
