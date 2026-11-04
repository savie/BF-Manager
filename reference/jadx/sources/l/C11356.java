package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۧۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11356 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f35760;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f35761;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f35762;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35763;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f35764;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f35765;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35766;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35767;

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo1329() {
        return true;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return "FTPS";
    }

    public C11356(int i) {
        super(i);
        this.f35762 = "";
        this.f35764 = 21;
        this.f35761 = "anonymous";
        this.f35765 = "";
        this.f35760 = a.D;
        this.f35767 = true;
        this.f35766 = true;
        this.f35763 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11356(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "4");
        AbstractC0148.m1322(jSONObject, "ip", "7");
        AbstractC0148.m1316(jSONObject, "hs", "b");
        AbstractC0148.m1316(jSONObject, "mt", am.aF);
        this.f35762 = "";
        this.f35764 = 21;
        this.f35761 = "anonymous";
        this.f35765 = "";
        this.f35760 = a.D;
        this.f35767 = true;
        this.f35766 = true;
        this.f35763 = true;
        this.f35762 = jSONObject.getString("2");
        this.f35764 = jSONObject.getInt("3");
        this.f35761 = jSONObject.getString("5");
        this.f35765 = jSONObject.getString("6");
        this.f35760 = jSONObject.getString("8");
        this.f35767 = jSONObject.getBoolean("9");
        this.f35766 = jSONObject.getBoolean(am.av);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        if (this.f35764 == 21) {
            return "ftps://" + this.f35761 + "@" + this.f35762;
        }
        return "ftps://" + this.f35761 + "@" + this.f35762 + ":" + this.f35764;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("2", this.f35762);
        jSONObjectMo1331.put("3", this.f35764);
        jSONObjectMo1331.put("5", this.f35761);
        jSONObjectMo1331.put("6", this.f35765);
        jSONObjectMo1331.put("8", this.f35760);
        jSONObjectMo1331.put("9", this.f35767);
        jSONObjectMo1331.put(am.av, this.f35766);
        return jSONObjectMo1331;
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        String str = "ftps://" + this.f35761 + "@" + this.f35762;
        return str.endsWith("/") ? C1402.m5124(1, 0, str) : str;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C11356) {
            C11356 c11356 = (C11356) abstractC0148;
            this.f35762 = c11356.f35762;
            this.f35764 = c11356.f35764;
            this.f35761 = c11356.f35761;
            this.f35765 = c11356.f35765;
            this.f35760 = c11356.f35760;
            this.f35767 = c11356.f35767;
            this.f35766 = c11356.f35766;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11356.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C11356 c11356 = (C11356) obj;
        return this.f35764 == c11356.f35764 && this.f35767 == c11356.f35767 && this.f35766 == c11356.f35766 && this.f35763 == c11356.f35763 && C17359.equals(this.f35762, c11356.f35762) && C17359.equals(this.f35761, c11356.f35761) && C17359.equals(this.f35765, c11356.f35765) && C17359.equals(this.f35760, c11356.f35760);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return ((((C24966.m55771(C24966.m55771(C24966.m55771((C24966.m55771(super.hashCode() * 31, 31, this.f35762) + this.f35764) * 31, 31, this.f35761), 31, this.f35765), 31, this.f35760) + (this.f35767 ? 1231 : 1237)) * 31) + (this.f35766 ? 1231 : 1237)) * 31) + (this.f35763 ? 1231 : 1237);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C18815(i, clone());
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66101;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        return C8947.m23910(new StringBuilder("ftps@"), this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m28667(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28668(AbstractActivityC17204 abstractActivityC17204) {
        m28667(abstractActivityC17204, new C11356(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28667(final AbstractActivityC17204 abstractActivityC17204, C11356 c11356) {
        View viewM40395;
        if (abstractActivityC17204.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        } else {
            viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM40395.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM40395.findViewById(R.id.radioButton4);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1257 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c11356);
        View view = viewM40395;
        textView.setText(C21576.m49088(c11356.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTPS"));
        c23255.mo52335((CharSequence) c11356.f35762);
        c23256.mo52335((CharSequence) String.valueOf(c11356.f35764));
        c23257.mo52335((CharSequence) (c11356.f35761.equals("anonymous") ? "" : c11356.f35761));
        c23258.mo52335((CharSequence) c11356.f35765);
        c23259.mo52335((CharSequence) c11356.f1128);
        c232510.mo52335((CharSequence) c11356.f1122);
        c232511.mo52335((CharSequence) c11356.f35760);
        radioButton.setChecked(c11356.f35767);
        radioButton2.setChecked(!c11356.f35767);
        radioButton3.setChecked(c11356.f35766);
        radioButton4.setChecked(!c11356.f35766);
        c1255.setChecked(c11356.f1129);
        c1256.setChecked(c11356.f1123);
        c1257.setChecked(c11356.f1125);
        c1256.setOnCheckedChangeListener(new C16555());
        AbstractC0148.m1317(c232511, abstractActivityC17204);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ۘ۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton;
                if (compoundButton == radioButton5) {
                    radioButton5 = radioButton2;
                }
                if (radioButton5.isChecked() == z) {
                    radioButton5.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩴۘ۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton3;
                RadioButton radioButton6 = compoundButton == radioButton5 ? radioButton4 : radioButton5;
                if (radioButton6.isChecked() == z) {
                    radioButton6.setChecked(!z);
                    boolean zIsChecked = radioButton5.isChecked();
                    C23255 c232512 = c23256;
                    if (zIsChecked) {
                        if (c232512.m54021().toString().equals("990")) {
                            c232512.mo52335((CharSequence) "21");
                        }
                    } else if (c232512.m54021().toString().equals("21")) {
                        c232512.mo52335((CharSequence) "990");
                    }
                }
            }
        };
        radioButton3.setOnCheckedChangeListener(onCheckedChangeListener2);
        radioButton4.setOnCheckedChangeListener(onCheckedChangeListener2);
        AbstractC0148.m1318(c23255, c232510);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(view);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        C21576.m49090(c23255);
        final C15085 c15085 = new C15085(c23255, c232511, c23256, c23257, c23258, c23259, c232510, radioButton, radioButton3, c1255, c1256, c1257, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC12848(c15085, c11356, dialogInterfaceC8327M8016, 0));
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۚۘ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C11356 c11357 = (C11356) c15085.get();
                if (c11357 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c11357)) {
                    new C1662(abstractActivityC17205, c11357).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11356 m28665(C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C23255 c232511, RadioButton radioButton, RadioButton radioButton2, C1255 c1255, C1255 c1256, C1255 c1257, C18047 c18047) {
        int i;
        if (!AbstractC0148.m1324(c23255) || !AbstractC0148.m1320(c23256)) {
            return null;
        }
        C11356 c11356 = new C11356(-1);
        c11356.f35762 = c23255.m54021().toString();
        try {
            i = Integer.parseInt(c23257.m54021().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c11356.f35764 = i;
        c11356.f35761 = AbstractC0148.m1315(c23258, "anonymous");
        c11356.f35765 = c23259.m54021().toString();
        c11356.f1128 = c232510.m54021().toString();
        c11356.f1122 = AbstractC0148.m1315(c232511, c11356.f35762);
        c11356.f35760 = AbstractC0148.m1315(c23256, a.D);
        c11356.f35767 = radioButton.isChecked();
        c11356.f35766 = radioButton2.isChecked();
        c11356.f1129 = c1255.isChecked();
        c11356.f1123 = c1256.isChecked();
        c11356.f1125 = c1257.isChecked();
        c11356.m1334(c18047);
        return c11356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28666(C15085 c15085, C11356 c11356, DialogInterfaceC8327 dialogInterfaceC8327) {
        C11356 c11357 = (C11356) c15085.get();
        if (c11357 == null) {
            return;
        }
        if (c11356.f1127 == -1) {
            C11356 c11358 = new C11356(AbstractC0148.m1313());
            c11358.mo1327(c11357);
            C7606.m20787(c11358);
        } else {
            c11356.mo1327(c11357);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }
}
