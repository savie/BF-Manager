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

/* JADX INFO: renamed from: l.᩷ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes.dex */
public final class C21799 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f69521;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f69522;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f69523;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f69524;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f69525;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f69526;

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return "FTP";
    }

    public C21799(int i) {
        super(i);
        this.f69525 = "";
        this.f69524 = 21;
        this.f69523 = "anonymous";
        this.f69526 = "";
        this.f69521 = a.D;
        this.f69522 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21799(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "4");
        AbstractC0148.m1322(jSONObject, "ip", "7");
        AbstractC0148.m1316(jSONObject, "hs", am.av);
        AbstractC0148.m1316(jSONObject, "mt", "b");
        this.f69525 = "";
        this.f69524 = 21;
        this.f69523 = "anonymous";
        this.f69526 = "";
        this.f69521 = a.D;
        this.f69522 = true;
        this.f69525 = jSONObject.getString("2");
        this.f69524 = jSONObject.getInt("3");
        this.f69523 = jSONObject.getString("5");
        this.f69526 = jSONObject.getString("6");
        this.f69521 = jSONObject.getString("8");
        this.f69522 = jSONObject.getBoolean("9");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        if (this.f69524 == 21) {
            return "ftp://" + this.f69523 + "@" + this.f69525;
        }
        return "ftp://" + this.f69523 + "@" + this.f69525 + ":" + this.f69524;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("2", this.f69525);
        jSONObjectMo1331.put("3", this.f69524);
        jSONObjectMo1331.put("5", this.f69523);
        jSONObjectMo1331.put("6", this.f69526);
        jSONObjectMo1331.put("8", this.f69521);
        jSONObjectMo1331.put("9", this.f69522);
        return jSONObjectMo1331;
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        String str = "ftp://" + this.f69523 + "@" + this.f69525;
        return str.endsWith("/") ? C1402.m5124(1, 0, str) : str;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C21799) {
            C21799 c21799 = (C21799) abstractC0148;
            this.f69525 = c21799.f69525;
            this.f69524 = c21799.f69524;
            this.f69523 = c21799.f69523;
            this.f69526 = c21799.f69526;
            this.f69521 = c21799.f69521;
            this.f69522 = c21799.f69522;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21799.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C21799 c21799 = (C21799) obj;
        return this.f69524 == c21799.f69524 && this.f69522 == c21799.f69522 && C17359.equals(this.f69525, c21799.f69525) && C17359.equals(this.f69523, c21799.f69523) && C17359.equals(this.f69526, c21799.f69526) && C17359.equals(this.f69521, c21799.f69521);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return C24966.m55771(C24966.m55771(C24966.m55771((C24966.m55771(super.hashCode() * 31, 31, this.f69525) + this.f69524) * 31, 31, this.f69523), 31, this.f69526), 31, this.f69521) + (this.f69522 ? 1231 : 1237);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C18815(i, clone());
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66083;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        return C8947.m23910(new StringBuilder("ftp@"), this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m49447(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49448(AbstractActivityC17204 abstractActivityC17204) {
        m49447(abstractActivityC17204, new C21799(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49447(final AbstractActivityC17204 abstractActivityC17204, C21799 c21799) {
        View viewM40395;
        if (abstractActivityC17204.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        } else {
            viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1257 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c21799);
        View view = viewM40395;
        textView.setText(C21576.m49088(c21799.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTP"));
        c23255.mo52335((CharSequence) c21799.f69525);
        c23256.mo52335((CharSequence) String.valueOf(c21799.f69524));
        c23257.mo52335((CharSequence) (c21799.f69523.equals("anonymous") ? "" : c21799.f69523));
        c23258.mo52335((CharSequence) c21799.f69526);
        c23259.mo52335((CharSequence) c21799.f1128);
        c232510.mo52335((CharSequence) c21799.f1122);
        c232511.mo52335((CharSequence) c21799.f69521);
        radioButton.setChecked(c21799.f69522);
        radioButton2.setChecked(!c21799.f69522);
        c1255.setChecked(c21799.f1129);
        c1256.setChecked(c21799.f1123);
        c1257.setChecked(c21799.f1125);
        c1256.setOnCheckedChangeListener(new C16555());
        AbstractC0148.m1317(c232511, abstractActivityC17204);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖ᩺۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton3 = radioButton;
                if (compoundButton == radioButton3) {
                    radioButton3 = radioButton2;
                }
                if (radioButton3.isChecked() == z) {
                    radioButton3.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        view.findViewById(R.id.MT_Protector).setVisibility(8);
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
        final C8964 c8964 = new C8964(c23255, c232511, c23256, c23257, c23258, c23259, c232510, radioButton, c1255, c1256, c1257, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC6657(c8964, c21799, dialogInterfaceC8327M8016, 2));
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ᩺۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C21799 c217910 = (C21799) c8964.get();
                if (c217910 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c217910)) {
                    new C14184(abstractActivityC17205, c217910).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21799 m49445(C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C23255 c232511, RadioButton radioButton, C1255 c1255, C1255 c1256, C1255 c1257, C18047 c18047) {
        int i;
        if (!AbstractC0148.m1324(c23255) || !AbstractC0148.m1320(c23256)) {
            return null;
        }
        C21799 c21799 = new C21799(-1);
        c21799.f69525 = c23255.m54021().toString();
        try {
            i = Integer.parseInt(c23257.m54021().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c21799.f69524 = i;
        c21799.f69523 = AbstractC0148.m1315(c23258, "anonymous");
        c21799.f69526 = c23259.m54021().toString();
        c21799.f1128 = c232510.m54021().toString();
        c21799.f1122 = AbstractC0148.m1315(c232511, c21799.f69525);
        c21799.f69521 = AbstractC0148.m1315(c23256, a.D);
        c21799.f69522 = radioButton.isChecked();
        c21799.f1129 = c1255.isChecked();
        c21799.f1123 = c1256.isChecked();
        c21799.f1125 = c1257.isChecked();
        c21799.m1334(c18047);
        return c21799;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49446(C8964 c8964, C21799 c21799, DialogInterfaceC8327 dialogInterfaceC8327) {
        C21799 c217910 = (C21799) c8964.get();
        if (c217910 == null) {
            return;
        }
        if (c21799.f1127 == -1) {
            C21799 c217911 = new C21799(AbstractC0148.m1313());
            c217911.mo1327(c217910);
            C7606.m20787(c217911);
        } else {
            c21799.mo1327(c217910);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }
}
