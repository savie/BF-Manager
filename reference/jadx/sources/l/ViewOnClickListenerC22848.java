package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22848 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f74225;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextView f74226;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f74227;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74228;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f74229;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22848(C1965 c1965, View view) {
        super(view);
        this.f74225 = c1965;
        this.f74229 = (ImageView) view.findViewById(R.id.icon);
        this.f74226 = (TextView) view.findViewById(R.id.title);
        this.f74227 = view.findViewById(R.id.MT_Protector);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int i = this.f74228;
        final C1965 c1965 = this.f74225;
        if (i == 0) {
            Context contextRequireContext = c1965.requireContext();
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(contextRequireContext);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܰۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    new C9116(this.f71241.f74225, R.string.MT_Protector).m8197();
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        if (i == 1) {
            C1965.m6762(c1965);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ActivityC0848) c1965.requireActivity()).m3436(new Runnable() { // from class: l.ۤܰۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C1965.m6763(c1965);
                }
            });
        } else {
            ViewOnClickListenerC0234 viewOnClickListenerC0234 = new ViewOnClickListenerC0234((ActivityC0848) c1965.requireActivity(), c1965.f6588);
            viewOnClickListenerC0234.m1711(c1965);
            viewOnClickListenerC0234.m1709();
        }
    }
}
