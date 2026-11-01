package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20882 implements InterfaceC17354 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17354 f67819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f67820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f67821;

    public C20882(InterfaceC17354 interfaceC17354, AbstractActivityC12483 abstractActivityC12483, String str) {
        this.f67819 = interfaceC17354;
        this.f67820 = abstractActivityC12483;
        this.f67821 = str;
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final void mo6536(C14558 c14558, boolean z) {
        this.f67819.mo6536(c14558, z);
    }

    @Override // l.InterfaceC17354
    public final void onCanceled() {
        this.f67819.onCanceled();
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6537(Exception exc) {
        final AbstractActivityC12483 abstractActivityC12483;
        boolean z = exc instanceof C15721;
        final InterfaceC17354 interfaceC17354 = this.f67819;
        if (z && (abstractActivityC12483 = this.f67820) != null) {
            final String str = this.f67821;
            C16737.m39273(new Runnable() { // from class: l.۟۫᩹
                @Override // java.lang.Runnable
                public final void run() {
                    final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                    boolean zIsFinishing = abstractActivityC12484.isFinishing();
                    final InterfaceC17354 interfaceC17355 = interfaceC17354;
                    if (zIsFinishing || abstractActivityC12484.getLifecycle().mo9170() == EnumC9414.DESTROYED) {
                        interfaceC17355.onCanceled();
                        return;
                    }
                    View viewM30995 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                    ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    final InterfaceC13175 interfaceC13175M50994 = C23053.m50994(abstractActivityC12484, viewM30995, str);
                    C8067 c8067BuildDialog = abstractActivityC12484.buildDialog();
                    c8067BuildDialog.m21258(viewM30995);
                    c8067BuildDialog.m21251(R.string.MT_Protector, null);
                    c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19471(0, interfaceC17355));
                    c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ۡ۫᩹
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            interfaceC17355.onCanceled();
                        }
                    });
                    final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
                    if (!dialogInterfaceC19356M21269.m44375()) {
                        interfaceC17355.onCanceled();
                        return;
                    }
                    final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                    interfaceC13175M50994.mo4315(new Runnable() { // from class: l.ۤ۫᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC13175 interfaceC13175 = interfaceC13175M50994;
                            C23053.m50998(textView, interfaceC13175.mo4316());
                            dialogInterfaceC19356M21269.m44373().setEnabled(!interfaceC13175.mo4313());
                        }
                    });
                    final C22347 c22347 = new C22347(viewM30995);
                    dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC22999(abstractActivityC12484, 0));
                    dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۫᩹
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
                                InterfaceC17354 interfaceC17356 = interfaceC17355;
                                if (zMo1457) {
                                    boolean z2 = c14558M50995.m35031() instanceof C19954;
                                    C22347 c22348 = c22347;
                                    if (!z2 || c22348.m49556(dialogInterfaceC19356)) {
                                        C23053.m50999(new C20177(z2, c22348, dialogInterfaceC19356, interfaceC17356, interfaceC13175, c11392Mo4314, c14558M50995, textView), c14558M50995.m35031(), abstractActivityC12484);
                                        return;
                                    }
                                    return;
                                }
                                interfaceC13175.mo6719(c11392Mo4314);
                                dialogInterfaceC19356.dismiss();
                                interfaceC17356.mo6536(c14558M50995, false);
                            }
                        }
                    });
                }
            });
            return true;
        }
        return interfaceC17354.mo6537(exc);
    }
}
