package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0922 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3691;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1423 f3693;

    public /* synthetic */ ViewOnClickListenerC0922(EditText editText, AbstractActivityC12483 abstractActivityC12483) {
        this.f3692 = 2;
        this.f3691 = editText;
        this.f3693 = abstractActivityC12483;
    }

    public /* synthetic */ ViewOnClickListenerC0922(InterfaceC1423 interfaceC1423, Object obj, int i) {
        this.f3692 = i;
        this.f3693 = interfaceC1423;
        this.f3691 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3692) {
            case 0:
                final AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f3693;
                final RunnableC22090 runnableC22090 = (RunnableC22090) this.f3691;
                View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                final InterfaceC1179 interfaceC1179M50992 = C23053.m50992(abstractActivityC12483, viewM30995, C0403.m2140());
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21258(viewM30995);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                interfaceC1179M50992.mo4315(new Runnable() { // from class: l.ۡۛ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1179 interfaceC1179 = interfaceC1179M50992;
                        C23053.m50998(textView, interfaceC1179.mo4316());
                        dialogInterfaceC19356M52499.m44373().setEnabled(!interfaceC1179.mo4313());
                    }
                });
                final C22347 c22347 = new C22347(viewM30995);
                dialogInterfaceC19356M52499.m44361().setOnClickListener(new ViewOnClickListenerC17982(abstractActivityC12483, 1));
                dialogInterfaceC19356M52499.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۛ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M52499;
                        if (dialogInterfaceC19356.m44375()) {
                            InterfaceC1179 interfaceC1179 = interfaceC1179M50992;
                            if (interfaceC1179.mo4317()) {
                                return;
                            }
                            C11392 c11392Mo4314 = interfaceC1179.mo4314();
                            AbstractC17131 abstractC17131M50996 = C23053.m50996(c11392Mo4314.m28501());
                            if (abstractC17131M50996 == null) {
                                abstractC17131M50996 = (AbstractC17131) C23053.f74904.get(0);
                            }
                            boolean z = abstractC17131M50996 instanceof C19954;
                            C22347 c22348 = c22347;
                            if (!z || c22348.m49556(dialogInterfaceC19356)) {
                                RunnableC22090 runnableC22091 = runnableC22090;
                                TextView textView2 = textView;
                                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                                C11005.m27758(abstractActivityC12484, c11392Mo4314, true, (InterfaceC17354) new C13769(z, c22348, dialogInterfaceC19356, c11392Mo4314, runnableC22091, textView2, abstractActivityC12484));
                            }
                        }
                    }
                });
                break;
            case 1:
                ActivityC21135.m47565((ActivityC21135) this.f3693, (DialogInterfaceC19356) this.f3691);
                break;
            case 2:
                EditText editText = (EditText) this.f3691;
                AbstractActivityC12483 abstractActivityC12484 = (AbstractActivityC12483) this.f3693;
                String string = editText.getText().toString();
                ArrayList arrayList = new ArrayList(C22037.f71434 - 1);
                int size = -1;
                for (int i = 0; i < C22037.f71434; i++) {
                    String strM48955 = C22037.m48955(i);
                    if (!strM48955.equals("UTF-8-BOM")) {
                        if (strM48955.equalsIgnoreCase(string)) {
                            size = arrayList.size();
                        }
                        arrayList.add(strM48955);
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C8067 c8067BuildDialog2 = abstractActivityC12484.buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21266(strArr, size, new DialogInterfaceOnClickListenerC9699(2, editText, strArr));
                c8067BuildDialog2.m21251(R.string.MT_Protector, null);
                c8067BuildDialog2.m21269();
                break;
            default:
                C3589.m10665((DialogInterfaceC19356) this.f3693, (C22959) this.f3691);
                break;
        }
    }
}
