package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13566 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22032 f44753;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ImageView f44754;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f44755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC13566(C22032 c22032, View view) {
        super(view);
        this.f44753 = c22032;
        this.f44754 = (ImageView) view.findViewById(R.id.icon);
        this.f44755 = (TextView) view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int i = this.f44756;
        C22032 c22032 = this.f44753;
        if (i == 0) {
            ((ActivityC5677) c22032.requireActivity()).m15669(new Runnable() { // from class: l.֫۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC11989(this.f7036.f44753, null).m29855();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC5677) c22032.requireActivity()).m15669(new Runnable() { // from class: l.ۢ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C22032 c22033 = this.f32350.f44753;
                    ViewOnClickListenerC11989 viewOnClickListenerC11989 = new ViewOnClickListenerC11989(c22033, null);
                    viewOnClickListenerC11989.m29856((C10617) c22033.f71403.peek());
                    viewOnClickListenerC11989.m29855();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC5677) c22032.requireActivity()).m15669(new Runnable() { // from class: l.ۗ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C22032 c22033 = this.f12088.f44753;
                    ViewOnClickListenerC10786 viewOnClickListenerC10786 = new ViewOnClickListenerC10786((ActivityC5677) c22033.requireActivity(), c22033.f71407);
                    viewOnClickListenerC10786.m27086((C10617) c22033.f71403.peek());
                    viewOnClickListenerC10786.m27085();
                }
            });
            return;
        }
        if (i == 3) {
            c22032.f71403.pop();
            c22032.m48922();
            c22032.m48937();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c22032.requireContext();
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(contextRequireContext);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۘۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C22032.m48931(this.f15649.f44753);
                }
            });
            c8067.m21269();
        }
    }
}
