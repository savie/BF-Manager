package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22715 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f73996;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f73997;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f73998;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f73999;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f74000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22715(C7898 c7898, View view) {
        super(view);
        this.f73999 = c7898;
        this.f74000 = (ImageView) view.findViewById(R.id.icon);
        this.f73997 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f73998 = view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int i = this.f73996;
        final C7898 c7898 = this.f73999;
        if (i != 0) {
            if (i == 1) {
                C7898.m20897(c7898);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((ActivityC5677) c7898.requireActivity()).m15669(new Runnable() { // from class: l.ۜۗۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7898.m20896(c7898);
                    }
                });
                return;
            } else {
                ViewOnClickListenerC23380 viewOnClickListenerC23380 = new ViewOnClickListenerC23380((ActivityC5677) c7898.requireActivity(), c7898.f25970);
                viewOnClickListenerC23380.m51519(c7898);
                viewOnClickListenerC23380.m51518();
                return;
            }
        }
        if (((ActivityC5677) c7898.requireActivity()).m15665()) {
            c7898.m20903(R.string.MT_Protector);
            return;
        }
        Context contextRequireContext = c7898.requireContext();
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۗۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f13407.f73999.m20903(R.string.MT_Protector);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }
}
