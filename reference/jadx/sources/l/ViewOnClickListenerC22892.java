package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22892 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f74370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextView f74371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f74372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74373;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f74374;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22892(C2009 c2009, View view) {
        super(view);
        this.f74370 = c2009;
        this.f74374 = (ImageView) view.findViewById(R.id.icon);
        this.f74371 = (TextView) view.findViewById(R.id.title);
        this.f74372 = view.findViewById(R.id.MT_Protector);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int i = this.f74373;
        final C2009 c2009 = this.f74370;
        if (i != 0) {
            if (i == 1) {
                C2009.m6881(c2009);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((ActivityC0848) c2009.requireActivity()).m3436(new Runnable() { // from class: l.ۤܶۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2009.m6882(c2009);
                    }
                });
                return;
            } else {
                ViewOnClickListenerC21422 viewOnClickListenerC21422 = new ViewOnClickListenerC21422((ActivityC0848) c2009.requireActivity(), c2009.f6692);
                viewOnClickListenerC21422.m48729(c2009);
                viewOnClickListenerC21422.m48727();
                return;
            }
        }
        if (((ActivityC0848) c2009.requireActivity()).m3439()) {
            c2009.m6889(R.string.MT_Protector);
            return;
        }
        Context contextRequireContext = c2009.requireContext();
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8000(R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܶۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f71338.f74370.m6889(R.string.MT_Protector);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }
}
