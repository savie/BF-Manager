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

/* JADX INFO: renamed from: l.ܳۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public final class C15172 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f49471;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17410 f49472;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49473;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f49474;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49475;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f49476;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49477;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f49478;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15172(C17410 c17410, Main main, String str, InterfaceC2386 interfaceC2386, List list, C12915 c12915, boolean z, String str2, AbstractC22044 abstractC22044, boolean z2) {
        super(main, -1);
        this.f49472 = c17410;
        this.f49479 = str;
        this.f49478 = interfaceC2386;
        this.f49471 = list;
        this.f49476 = c12915;
        this.f49475 = z;
        this.f49477 = str2;
        this.f49474 = abstractC22044;
        this.f49473 = z2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        final String strM22914 = m22914();
        while (strM22914.endsWith("/")) {
            strM22914 = C1402.m5124(1, 0, strM22914);
        }
        final String str = this.f49479;
        if (strM22914.equals(str)) {
            m22951();
            return;
        }
        boolean zMo8090 = this.f49478.mo8090();
        final AbstractC22044 abstractC22044 = this.f49474;
        List list = this.f49471;
        final C12915 c12915 = this.f49476;
        if (zMo8090) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (strM22914.equals(((C8002) it.next()).getName())) {
                    m22952(R.string.MT_Protector);
                    final Main mainM31979 = c12915.m31979();
                    View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
                    viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
                    textView.setText(mainM31979.getString(R.string.MT_Protector, C11293.m28558(str), C11293.m28558(strM22914)));
                    byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, "rcoz");
                    final byte b = (bMo7901 < 0 || bMo7901 > 2) ? (byte) 0 : bMo7901;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC4425 viewOnClickListenerC4425 = new ViewOnClickListenerC4425(1, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC4425);
                    }
                    C2361 c2361BuildDialog = mainM31979.buildDialog();
                    c2361BuildDialog.m8005(viewM40395);
                    final C17410 c17410 = this.f49472;
                    final List list2 = this.f49471;
                    final boolean z = this.f49475;
                    final String str2 = this.f49477;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤۜ۫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C17410.m40885(c17410, radioButtonArr, b, strM22914, str, list2, z, mainM31979, str2, this, c12915, abstractC22044);
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8012(false);
                    c2361BuildDialog.m8016();
                    return;
                }
            }
        } else {
            String strConcat = strM22914.concat("/");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C8002) it2.next()).getName().startsWith(strConcat)) {
                    m22952(R.string.MT_Protector);
                    return;
                }
            }
        }
        final C11443 c11443 = new C11443(str, strM22914, this.f49473, true);
        if (this.f49475) {
            C0938.m3749(new InterfaceC18837() { // from class: l.ᩴۜ۫
                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo1268() {
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo1270(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final void mo1269(C9651 c9651, boolean z2) {
                    this.f63292.m22951();
                    List listSingletonList = Collections.singletonList(c11443);
                    List list3 = Collections.EMPTY_LIST;
                    C17410.m40882(c12915, abstractC22044, "", listSingletonList, Collections.EMPTY_LIST, c9651, z2);
                }
            }, c12915.m31979(), this.f49477);
            return;
        }
        m22951();
        List listSingletonList = Collections.singletonList(c11443);
        List list3 = Collections.EMPTY_LIST;
        C17410.m40882(c12915, abstractC22044, "", listSingletonList, Collections.EMPTY_LIST, null, false);
    }
}
