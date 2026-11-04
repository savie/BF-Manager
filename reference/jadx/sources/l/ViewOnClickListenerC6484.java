package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC6484 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f21797;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f21798;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21400 f21799;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21800;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC6484(C21400 c21400, View view) {
        super(view);
        this.f21799 = c21400;
        this.f21798 = (ImageView) view.findViewById(R.id.icon);
        this.f21797 = (TextView) view.findViewById(R.id.title);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int i = this.f21800;
        C21400 c21400 = this.f21799;
        if (i == 0) {
            ((ActivityC0848) c21400.requireActivity()).m3436(new Runnable() { // from class: l.᩹ܶۧ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC19184(this.f76681.f21799, null).m44459();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC0848) c21400.requireActivity()).m3436(new Runnable() { // from class: l.ۗܶۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C21400 c21401 = this.f12073.f21799;
                    ViewOnClickListenerC19184 viewOnClickListenerC19184 = new ViewOnClickListenerC19184(c21401, null);
                    viewOnClickListenerC19184.m44460((C1878) c21401.f68165.peek());
                    viewOnClickListenerC19184.m44459();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC0848) c21400.requireActivity()).m3436(new Runnable() { // from class: l.᩵ܶۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C21400 c21401 = this.f66238.f21799;
                    ViewOnClickListenerC21422 viewOnClickListenerC21422 = new ViewOnClickListenerC21422((ActivityC0848) c21401.requireActivity(), c21401.f68169);
                    viewOnClickListenerC21422.m48728((C1878) c21401.f68165.peek());
                    viewOnClickListenerC21422.m48727();
                }
            });
            return;
        }
        if (i == 3) {
            c21400.f68165.pop();
            c21400.m48668();
            c21400.m48666();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c21400.requireContext();
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(contextRequireContext);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨܶۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C21400.m48664(this.f40011.f21799);
                }
            });
            c2361.m8016();
        }
    }
}
