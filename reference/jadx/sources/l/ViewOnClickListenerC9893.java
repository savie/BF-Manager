package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9893 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f33770;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TextView f33771;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11780 f33772;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TextView f33773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f33774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f33775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f33776;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC9893(ActivityC3541 activityC3541, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC3541).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f33775 = activityC3541;
        this.f33776 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f33773 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f33770 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f33774 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f33771 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܺ᩺ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f52386;
                C8067 c8067BuildDialog = viewOnClickListenerC9893.f33775.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩺ۜ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        new C2130(viewOnClickListenerC9893).m10243();
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                return true;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C11780 c11780 = this.f33772;
        int i = c11780.f39566;
        ActivityC3541 activityC3541 = this.f33775;
        if (i == -4) {
            C8067 c8067BuildDialog = activityC3541.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩺ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    new C2130(this.f63525).m10243();
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (i == -3) {
            C8067 c8067BuildDialog2 = activityC3541.buildDialog();
            c8067BuildDialog2.m21274(R.string.MT_Protector);
            c8067BuildDialog2.m21253(R.string.MT_Protector);
            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩺ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f25642;
                    ServiceC23069.m51045(viewOnClickListenerC9893.f33772);
                    C11780 c11781 = viewOnClickListenerC9893.f33772;
                    c11781.f39566 = -2;
                    ActivityC3541.m10450(viewOnClickListenerC9893.f33775, c11781, viewOnClickListenerC9893.f33774);
                }
            });
            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog2.m21269();
            return;
        }
        if (i == 2) {
            m25036(c11780.f39572);
            return;
        }
        if (i != 3) {
            return;
        }
        C8067 c8067BuildDialog3 = activityC3541.buildDialog();
        c8067BuildDialog3.m21274(R.string.MT_Protector);
        c8067BuildDialog3.m21253(R.string.MT_Protector);
        c8067BuildDialog3.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩺ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C14832(this.f68966).m10243();
            }
        });
        c8067BuildDialog3.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog3.m21269();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25036(final String str) {
        final AbstractC20745 abstractC20745M15001 = C5429.m15001(this.f33772);
        boolean zMo33975 = abstractC20745M15001.mo33975();
        ActivityC3541 activityC3541 = this.f33775;
        if (zMo33975) {
            C8067 c8067BuildDialog = activityC3541.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(activityC3541.getString(R.string.MT_Protector, abstractC20745M15001.mo33986()));
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩺ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f2997;
                    C3872.m11210(viewOnClickListenerC9893.f33775, abstractC20745M15001, viewOnClickListenerC9893.f33772.f39572);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩺ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC3541 activityC3542 = this.f54181.f33775;
                    String strMo33986 = abstractC20745M15001.mo33986();
                    int i2 = ActivityC3541.f13037;
                    activityC3542.getClass();
                    Main.m67(activityC3542, strMo33986);
                }
            });
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫᩺ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC9893.m25038(this.f42412, abstractC20745M15001, str);
                }
            });
            c8067BuildDialog.m21269();
            return;
        }
        View viewM30995 = activityC3541.m30995(R.layout.MT_Protector);
        final InterfaceC13175 interfaceC13175M50994 = C23053.m50994(activityC3541, viewM30995, str);
        C8067 c8067BuildDialog2 = activityC3541.buildDialog();
        c8067BuildDialog2.m21258(viewM30995);
        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
        c8067BuildDialog2.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩺ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                interfaceC13175M50994.mo6721();
            }
        });
        c8067BuildDialog2.m21256(new DialogInterface.OnCancelListener() { // from class: l.ۛ᩺ۜ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                interfaceC13175M50994.mo6721();
            }
        });
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog2.m21269();
        C23250.m51309(dialogInterfaceC19356M21269);
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        interfaceC13175M50994.mo4315(new Runnable() { // from class: l.ۡ᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC13175 interfaceC13175 = interfaceC13175M50994;
                C23053.m50998(textView, interfaceC13175.mo4316());
                dialogInterfaceC19356M21269.m44373().setEnabled(!interfaceC13175.mo4313());
            }
        });
        final C22347 c22347 = new C22347(viewM30995);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩺ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                if (dialogInterfaceC19356.m44375()) {
                    InterfaceC13175 interfaceC13175 = interfaceC13175M50994;
                    if (interfaceC13175.mo4317()) {
                        return;
                    }
                    C11392 c11392Mo4314 = interfaceC13175.mo4314();
                    C14558 c14558M50995 = C23053.m50995(c11392Mo4314);
                    boolean zMo1457 = c14558M50995.m35031().mo1457();
                    ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f36250;
                    String str2 = str;
                    if (zMo1457) {
                        boolean z = c14558M50995.m35031() instanceof C19954;
                        C22347 c22348 = c22347;
                        if (!z || c22348.m49556(dialogInterfaceC19356)) {
                            C23053.m50999(new C11304(viewOnClickListenerC9893, z, c22348, dialogInterfaceC19356, interfaceC13175, c11392Mo4314, str2, c14558M50995, textView), c14558M50995.m35031(), viewOnClickListenerC9893.f33775);
                            return;
                        }
                        return;
                    }
                    interfaceC13175.mo6719(c11392Mo4314);
                    dialogInterfaceC19356.dismiss();
                    new C24004(viewOnClickListenerC9893, c14558M50995, str2).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25038(ViewOnClickListenerC9893 viewOnClickListenerC9893, AbstractC20745 abstractC20745, String str) {
        abstractC20745.mo24647();
        viewOnClickListenerC9893.m25036(str);
    }
}
