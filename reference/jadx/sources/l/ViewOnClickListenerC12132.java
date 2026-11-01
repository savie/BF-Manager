package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12132 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23421 f40623;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ImageView f40624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f40625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40626;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12132(C23421 c23421, View view) {
        super(view);
        this.f40623 = c23421;
        this.f40624 = (ImageView) view.findViewById(R.id.icon);
        this.f40625 = (TextView) view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int i = this.f40626;
        C23421 c23421 = this.f40623;
        if (i == 0) {
            ((ActivityC5677) c23421.requireActivity()).m15669(new Runnable() { // from class: l.ܺۗۘ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC2917(this.f50868.f40623, null).m8741();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC5677) c23421.requireActivity()).m15669(new Runnable() { // from class: l.᩶ۗۘ
                @Override // java.lang.Runnable
                public final void run() {
                    C23421 c23422 = this.f63784.f40623;
                    ViewOnClickListenerC2917 viewOnClickListenerC2917 = new ViewOnClickListenerC2917(c23422, null);
                    viewOnClickListenerC2917.m8742((C10617) c23422.f75831.peek());
                    viewOnClickListenerC2917.m8741();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC5677) c23421.requireActivity()).m15669(new Runnable() { // from class: l.֡ۗۘ
                @Override // java.lang.Runnable
                public final void run() {
                    C23421 c23422 = this.f1158.f40623;
                    ViewOnClickListenerC23380 viewOnClickListenerC23380 = new ViewOnClickListenerC23380((ActivityC5677) c23422.requireActivity(), c23422.f75837);
                    viewOnClickListenerC23380.m51520((C10617) c23422.f75831.peek());
                    viewOnClickListenerC23380.m51518();
                }
            });
            return;
        }
        if (i == 3) {
            c23421.f75831.pop();
            c23421.m51566();
            c23421.m51577();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c23421.requireContext();
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(contextRequireContext);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽۗۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C23421.m51572(this.f52672.f40623);
                }
            });
            c8067.m21269();
        }
    }
}
