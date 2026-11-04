package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20130 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f64689;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64690;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f64691;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f64692;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64693;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f64694;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20130(Main main, String str, boolean z, Map map, InterfaceC2386 interfaceC2386, C12915 c12915, AbstractC18881 abstractC18881) {
        super(main, -1);
        this.f64693 = str;
        this.f64689 = z;
        this.f64690 = map;
        this.f64692 = interfaceC2386;
        this.f64691 = c12915;
        this.f64694 = abstractC18881;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        final String strM22914 = m22914();
        String str = this.f64693;
        if (strM22914.equals(str) || strM22914.length() == 0) {
            m22951();
            return;
        }
        if (strM22914.contains("\\") || strM22914.contains("/")) {
            m22952(R.string.MT_Protector);
            return;
        }
        if (!this.f64689 || !strM22914.equalsIgnoreCase(str)) {
            ?? r0 = this.f64690;
            if (r0.containsKey(strM22914)) {
                if (((Boolean) r0.get(strM22914)).booleanValue()) {
                    m22952(R.string.MT_Protector);
                    return;
                }
                m22952(R.string.MT_Protector);
                final InterfaceC2386 interfaceC2386 = this.f64692;
                if (interfaceC2386.mo8090()) {
                    final C12915 c12915 = this.f64691;
                    final Main mainM31979 = c12915.m31979();
                    View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                    viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
                    textView.setText(mainM31979.getString(R.string.MT_Protector, interfaceC2386.getName(), strM22914));
                    byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, "rcon");
                    byte b = (bMo7901 < 0 || bMo7901 > 2) ? (byte) 0 : bMo7901;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC6407 viewOnClickListenerC6407 = new ViewOnClickListenerC6407(2, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC6407);
                    }
                    C2361 c2361BuildDialog = mainM31979.buildDialog();
                    c2361BuildDialog.m8005(viewM40395);
                    final AbstractC18881 abstractC18881 = this.f64694;
                    final byte b2 = b;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ᩹۫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 3) {
                                    i3 = 0;
                                    break;
                                } else {
                                    if (radioButtonArr[i4].isChecked()) {
                                        i3 = i4;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (b2 != i3) {
                                ApplicationC17729.f58258.edit().mo3485((byte) i3, "rcon").apply();
                            }
                            InterfaceC2386 interfaceC2387 = interfaceC2386;
                            String path = interfaceC2387.getPath();
                            String parent = interfaceC2387.getParent();
                            String str2 = strM22914;
                            new C13417(mainM31979, i3, parent, abstractC18881, C11293.m28549(parent, str2), path, c12915, str2, this).m8197();
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8012(false);
                    c2361BuildDialog.m8016();
                    return;
                }
                return;
            }
        }
        new C23114(this, strM22914).m8197();
    }
}
