package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC24340 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f78950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f78951;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18372 f78952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f78953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC24340(C18372 c18372, View view) {
        super(view);
        this.f78952 = c18372;
        this.f78951 = (ImageView) view.findViewById(R.id.icon);
        this.f78950 = (TextView) view.findViewById(R.id.title);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        int i = this.f78953;
        C18372 c18372 = this.f78952;
        if (i == 0) {
            ((ActivityC0848) c18372.requireActivity()).m3436(new Runnable() { // from class: l.ۗܰۧ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC13657(this.f11862.f78952, null).m33441();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC0848) c18372.requireActivity()).m3436(new Runnable() { // from class: l.᩵ܰۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C18372 c18373 = this.f66035.f78952;
                    ViewOnClickListenerC13657 viewOnClickListenerC13657 = new ViewOnClickListenerC13657(c18373, null);
                    viewOnClickListenerC13657.m33442((C1878) c18373.f59864.peek());
                    viewOnClickListenerC13657.m33441();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC0848) c18372.requireActivity()).m3436(new Runnable() { // from class: l.ۨܰۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C18372 c18373 = this.f39902.f78952;
                    ViewOnClickListenerC0234 viewOnClickListenerC0234 = new ViewOnClickListenerC0234((ActivityC0848) c18373.requireActivity(), c18373.f59861);
                    viewOnClickListenerC0234.m1710((C1878) c18373.f59864.peek());
                    viewOnClickListenerC0234.m1709();
                }
            });
            return;
        }
        if (i == 3) {
            c18372.f59864.pop();
            c18372.m42870();
            c18372.m42867();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c18372.requireContext();
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(contextRequireContext);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛܰۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C18372.m42865(this.f21678.f78952);
                }
            });
            c2361.m8016();
        }
    }
}
