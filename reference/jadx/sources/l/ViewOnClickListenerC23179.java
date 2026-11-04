package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23179 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f75110;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6025 f75111;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public TextView f75112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f75113;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f75114;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f75115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f75116;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC23179(ActivityC3041 activityC3041, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC3041).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f75115 = activityC3041;
        this.f75116 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f75113 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f75114 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f75110 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f75112 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܳ֡ۧ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f48889;
                C2361 c2361BuildDialog = viewOnClickListenerC23179.f75115.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫֡ۧ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        new C15719(viewOnClickListenerC23179).m8197();
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                return true;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6025 c6025 = this.f75111;
        int i = c6025.f20612;
        ActivityC3041 activityC3041 = this.f75115;
        if (i == -4) {
            C2361 c2361BuildDialog = activityC3041.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ֡ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    new C15719(this.f16122).m8197();
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (i == -3) {
            C2361 c2361BuildDialog2 = activityC3041.buildDialog();
            c2361BuildDialog2.m8021(R.string.MT_Protector);
            c2361BuildDialog2.m8000(R.string.MT_Protector);
            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸֡ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f72632;
                    ServiceC18703.m43500(viewOnClickListenerC23179.f75111);
                    C6025 c6026 = viewOnClickListenerC23179.f75111;
                    c6026.f20612 = -2;
                    ActivityC3041.m9882(viewOnClickListenerC23179.f75115, c6026, viewOnClickListenerC23179.f75110);
                }
            });
            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog2.m8016();
            return;
        }
        if (i == 2) {
            m52096(c6025.f20615);
            return;
        }
        if (i != 3) {
            return;
        }
        C2361 c2361BuildDialog3 = activityC3041.buildDialog();
        c2361BuildDialog3.m8021(R.string.MT_Protector);
        c2361BuildDialog3.m8000(R.string.MT_Protector);
        c2361BuildDialog3.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ֡ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C17211(this.f62819).m8197();
            }
        });
        c2361BuildDialog3.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog3.m8016();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52096(final String str) {
        final AbstractC22044 abstractC22044M12318 = C3787.m12318(this.f75111);
        boolean zMo2934 = abstractC22044M12318.mo2934();
        int i = 1;
        ActivityC3041 activityC3041 = this.f75115;
        if (zMo2934) {
            C2361 c2361BuildDialog = activityC3041.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(activityC3041.getString(R.string.MT_Protector, abstractC22044M12318.mo4294()));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ֡ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f18589;
                    C8224.m22123(viewOnClickListenerC23179.f75115, abstractC22044M12318, viewOnClickListenerC23179.f75111.f20615);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫֡ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ActivityC3041 activityC3042 = this.f5354.f75115;
                    String strMo4294 = abstractC22044M12318.mo4294();
                    int i3 = ActivityC3041.f9847;
                    activityC3042.getClass();
                    Main.m54(activityC3042, strMo4294);
                }
            });
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ֡ۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC23179.m52098(this.f35507, abstractC22044M12318, str);
                }
            });
            c2361BuildDialog.m8016();
            return;
        }
        View viewM40395 = activityC3041.m40395(R.layout.MT_Protector);
        final InterfaceC1615 interfaceC1615M39155 = C16530.m39155(activityC3041, viewM40395, str);
        C2361 c2361BuildDialog2 = activityC3041.buildDialog();
        c2361BuildDialog2.m8005(viewM40395);
        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
        c2361BuildDialog2.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3866(i, interfaceC1615M39155));
        c2361BuildDialog2.m8003(new DialogInterfaceOnCancelListenerC12124(1, interfaceC1615M39155));
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog2.m8016();
        C5416.m16144(dialogInterfaceC8327M8016);
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        interfaceC1615M39155.mo3998(new Runnable() { // from class: l.᩷֡ۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1615 interfaceC1615 = interfaceC1615M39155;
                C16530.m39161(textView, interfaceC1615.mo4000());
                dialogInterfaceC8327M8016.m22436().setEnabled(!interfaceC1615.mo4001());
            }
        });
        final C12801 c12801 = new C12801(viewM40395);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ֡ۧ
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
                    ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f33403;
                    String str2 = str;
                    if (zMo18538) {
                        boolean z = c9651M39158.m25168() instanceof C12569;
                        C12801 c12802 = c12801;
                        if (!z || c12802.m31749(dialogInterfaceC8327)) {
                            C16530.m39163(new C24671(viewOnClickListenerC23179, z, c12802, dialogInterfaceC8327, interfaceC1615, c10737Mo3997, str2, c9651M39158, textView), c9651M39158.m25168(), viewOnClickListenerC23179.f75115);
                            return;
                        }
                        return;
                    }
                    interfaceC1615.mo5707(c10737Mo3997);
                    dialogInterfaceC8327.dismiss();
                    new C16465(viewOnClickListenerC23179, c9651M39158, str2).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52098(ViewOnClickListenerC23179 viewOnClickListenerC23179, AbstractC22044 abstractC22044, String str) {
        abstractC22044.mo4296();
        viewOnClickListenerC23179.m52096(str);
    }
}
