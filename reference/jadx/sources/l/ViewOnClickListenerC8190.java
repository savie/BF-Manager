package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8190 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f28545;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f28546;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f28547;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f28548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f28549;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8190(C20890 c20890, View view) {
        super(view);
        this.f28548 = c20890;
        this.f28549 = (ImageView) view.findViewById(R.id.icon);
        this.f28546 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28547 = view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int i = this.f28545;
        final C20890 c20890 = this.f28548;
        if (i == 0) {
            Context contextRequireContext = c20890.requireContext();
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(contextRequireContext);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ۬ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    new C13129(this.f57779.f28548, R.string.MT_Protector).m10243();
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        if (i == 1) {
            C20890.m46990(c20890);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ActivityC5677) c20890.requireActivity()).m15669(new Runnable() { // from class: l.ᩴ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C20890.m46989(c20890);
                }
            });
        } else {
            ViewOnClickListenerC10786 viewOnClickListenerC10786 = new ViewOnClickListenerC10786((ActivityC5677) c20890.requireActivity(), c20890.f67871);
            viewOnClickListenerC10786.m27087(c20890);
            viewOnClickListenerC10786.m27085();
        }
    }
}
