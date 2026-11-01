package l;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.֫᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2043 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f7611;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f7612;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f7613;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f7614;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f7615;

    public /* synthetic */ ViewOnClickListenerC2043(AbstractActivityC12483 abstractActivityC12483, C14745 c14745, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148) {
        this.f7613 = abstractActivityC12483;
        this.f7615 = c14745;
        this.f7611 = imageView;
        this.f7614 = interfaceC21926;
        this.f7612 = c16148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractActivityC12483 abstractActivityC12483 = this.f7613;
        C17492 c17492 = new C17492(abstractActivityC12483);
        c17492.setMotionEventSplittingEnabled(false);
        c17492.setLayoutManager(new C16062((Context) abstractActivityC12483, 5));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(c17492);
        c17492.setAdapter(new C0758(new C2169(this.f7615, this.f7611, this.f7614, this.f7612, c8067BuildDialog.m21269())));
    }
}
