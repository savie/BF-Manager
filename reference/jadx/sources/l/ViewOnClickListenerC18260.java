package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18260 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59580;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59581;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59582;

    public /* synthetic */ ViewOnClickListenerC18260(int i, Object obj, Object obj2) {
        this.f59580 = i;
        this.f59582 = obj;
        this.f59581 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f59580) {
            case 0:
                final AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f59582;
                final RunnableC21244 runnableC21244 = (RunnableC21244) this.f59581;
                View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                final InterfaceC5344 interfaceC5344M39156 = C16530.m39156(abstractActivityC17204, viewM40395, C9881.m25692());
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8005(viewM40395);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                final DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                interfaceC5344M39156.mo3998(new RunnableC2598(textView, interfaceC5344M39156, dialogInterfaceC8327M23911, 0));
                final C12801 c12801 = new C12801(viewM40395);
                dialogInterfaceC8327M23911.m22440().setOnClickListener(new ViewOnClickListenerC4425(2, abstractActivityC17204));
                dialogInterfaceC8327M23911.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.۠ۤۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M23911;
                        if (dialogInterfaceC8327.m22434()) {
                            InterfaceC5344 interfaceC5344 = interfaceC5344M39156;
                            if (interfaceC5344.mo3999()) {
                                return;
                            }
                            C10737 c10737Mo3997 = interfaceC5344.mo3997();
                            AbstractC14806 abstractC14806M39159 = C16530.m39159(c10737Mo3997.m27351());
                            if (abstractC14806M39159 == null) {
                                abstractC14806M39159 = (AbstractC14806) C16530.f53509.get(0);
                            }
                            boolean z = abstractC14806M39159 instanceof C12569;
                            C12801 c12802 = c12801;
                            if (!z || c12802.m31749(dialogInterfaceC8327)) {
                                RunnableC21244 runnableC21245 = runnableC21244;
                                TextView textView2 = textView;
                                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                                C0938.m3747(abstractActivityC17205, c10737Mo3997, true, (InterfaceC18837) new C3695(z, c12802, dialogInterfaceC8327, c10737Mo3997, runnableC21245, textView2, abstractActivityC17205));
                            }
                        }
                    }
                });
                break;
            default:
                ((C13903) this.f59582).f44085.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", ((C2717) this.f59581).f9075, null)));
                break;
        }
    }
}
