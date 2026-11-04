package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24059 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77800;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77801;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77802;

    public /* synthetic */ RunnableC24059(Object obj, Object obj2, Object obj3, int i) {
        this.f77800 = i;
        this.f77802 = obj;
        this.f77801 = obj2;
        this.f77799 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77800) {
            case 0:
                final AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f77802;
                String str = (String) this.f77801;
                final InterfaceC18837 interfaceC18837 = (InterfaceC18837) this.f77799;
                if (abstractActivityC17204.isFinishing() || abstractActivityC17204.getLifecycle().mo23076() == EnumC2619.DESTROYED) {
                    interfaceC18837.mo1268();
                } else {
                    View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
                    ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                    final InterfaceC1615 interfaceC1615M39155 = C16530.m39155(abstractActivityC17204, viewM40395, str);
                    C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                    c2361BuildDialog.m8005(viewM40395);
                    c2361BuildDialog.m8026(R.string.MT_Protector, null);
                    c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۙ۫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            interfaceC18837.mo1268();
                        }
                    });
                    c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8003(new DialogInterfaceOnCancelListenerC12124(0, interfaceC18837));
                    final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
                    if (!dialogInterfaceC8327M8016.m22434()) {
                        interfaceC18837.mo1268();
                    } else {
                        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                        interfaceC1615M39155.mo3998(new Runnable() { // from class: l.ۛۙ۫
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC1615 interfaceC1615 = interfaceC1615M39155;
                                C16530.m39161(textView, interfaceC1615.mo4000());
                                dialogInterfaceC8327M8016.m22436().setEnabled(!interfaceC1615.mo4001());
                            }
                        });
                        final C12801 c12801 = new C12801(viewM40395);
                        dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC1342(3, abstractActivityC17204));
                        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܺۙ۫
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                                if (dialogInterfaceC8327.m22434()) {
                                    InterfaceC1615 interfaceC1615 = interfaceC1615M39155;
                                    if (interfaceC1615.mo3999()) {
                                        return;
                                    }
                                    C10737 c10737Mo3997 = interfaceC1615.mo3997();
                                    C9651 c9651M39158 = C16530.m39158(c10737Mo3997);
                                    boolean zMo18538 = c9651M39158.m25168().mo18538();
                                    InterfaceC18837 interfaceC18838 = interfaceC18837;
                                    if (zMo18538) {
                                        boolean z = c9651M39158.m25168() instanceof C12569;
                                        C12801 c12802 = c12801;
                                        if (!z || c12802.m31749(dialogInterfaceC8327)) {
                                            C16530.m39163(new C21075(z, c12802, dialogInterfaceC8327, interfaceC18838, interfaceC1615, c10737Mo3997, c9651M39158, textView), c9651M39158.m25168(), abstractActivityC17204);
                                            return;
                                        }
                                        return;
                                    }
                                    interfaceC1615.mo5707(c10737Mo3997);
                                    dialogInterfaceC8327.dismiss();
                                    interfaceC18838.mo1269(c9651M39158, false);
                                }
                            }
                        });
                    }
                }
                break;
            default:
                C8614 c8614 = (C8614) this.f77802;
                C18379 c18379 = (C18379) this.f77801;
                C9097 c9097 = (C9097) this.f77799;
                C23618.m52860(c8614.m23233(), c18379.mo4294(), C6790.m18977(c9097.m24247()), c9097.m24241(), c9097.m24237());
                break;
        }
    }
}
