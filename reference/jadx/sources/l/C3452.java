package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3452 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f12698;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12699;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0756 f12700;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12701;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12702;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f12703;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f12704;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f12705;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12706;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3452(C0756 c0756, Main main, String str, InterfaceC2557 interfaceC2557, List list, C21422 c21422, boolean z, String str2, AbstractC20745 abstractC20745, boolean z2) {
        super(main, -1);
        this.f12700 = c0756;
        this.f12702 = str;
        this.f12703 = interfaceC2557;
        this.f12705 = list;
        this.f12698 = c21422;
        this.f12701 = z;
        this.f12706 = str2;
        this.f12704 = abstractC20745;
        this.f12699 = z2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        final String strM40352 = m40352();
        while (strM40352.endsWith("/")) {
            strM40352 = C20630.m46498(1, 0, strM40352);
        }
        final String str = this.f12702;
        if (strM40352.equals(str)) {
            m40364();
            return;
        }
        boolean zMo7985 = this.f12703.mo7985();
        final AbstractC20745 abstractC20745 = this.f12704;
        List list = this.f12705;
        final C21422 c21422 = this.f12698;
        if (zMo7985) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (strM40352.equals(((C12107) it.next()).getName())) {
                    m40365(R.string.MT_Protector);
                    final Main mainM47980 = c21422.m47980();
                    View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
                    viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
                    textView.setText(mainM47980.getString(R.string.MT_Protector, C6730.m18175(str), C6730.m18175(strM40352)));
                    byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, "rcoz");
                    byte b = (bMo16345 < 0 || bMo16345 > 2) ? (byte) 0 : bMo16345;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC10198 viewOnClickListenerC10198 = new ViewOnClickListenerC10198(2, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC10198);
                    }
                    C8067 c8067BuildDialog = mainM47980.buildDialog();
                    c8067BuildDialog.m21258(viewM30995);
                    final C0756 c0756 = this.f12700;
                    final List list2 = this.f12705;
                    final boolean z = this.f12701;
                    final String str2 = this.f12706;
                    final byte b2 = b;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩶֨
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C0756.m3254(c0756, radioButtonArr, b2, strM40352, str, list2, z, mainM47980, str2, this, c21422, abstractC20745);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21269();
                    return;
                }
            }
        } else {
            String strConcat = strM40352.concat("/");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C12107) it2.next()).getName().startsWith(strConcat)) {
                    m40365(R.string.MT_Protector);
                    return;
                }
            }
        }
        final C2167 c2167 = new C2167(str, strM40352, this.f12699, true);
        if (this.f12701) {
            C11005.m27761(new InterfaceC17354() { // from class: l.ۢ᩶֨
                @Override // l.InterfaceC17354
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo6537(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final void mo6536(C14558 c14558, boolean z2) {
                    this.f33539.m40364();
                    List listSingletonList = Collections.singletonList(c2167);
                    List list3 = Collections.EMPTY_LIST;
                    C0756.m3255(c21422, abstractC20745, "", listSingletonList, Collections.EMPTY_LIST, c14558, z2);
                }
            }, c21422.m47980(), this.f12706);
            return;
        }
        m40364();
        List listSingletonList = Collections.singletonList(c2167);
        List list3 = Collections.EMPTY_LIST;
        C0756.m3255(c21422, abstractC20745, "", listSingletonList, Collections.EMPTY_LIST, null, false);
    }
}
