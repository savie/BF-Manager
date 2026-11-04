package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.۫ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13263 extends AbstractC0148 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f42372;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f42373;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f42374;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f42375;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public String f42376;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42377;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f42378;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f42379;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f42380;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f42381;

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo1329() {
        return true;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return "SFTP";
    }

    public C13263(int i) {
        super(i);
        this.f42380 = "";
        this.f42372 = 22;
        this.f42376 = "root";
        this.f42374 = "";
        this.f42379 = "";
        this.f42378 = "";
        this.f42377 = false;
        this.f42373 = a.D;
        this.f42381 = -1;
        this.f42375 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13263(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "3");
        AbstractC0148.m1322(jSONObject, "ip", "8");
        AbstractC0148.m1316(jSONObject, "hs", am.av);
        AbstractC0148.m1316(jSONObject, "mt", "b");
        this.f42380 = "";
        this.f42372 = 22;
        this.f42376 = "root";
        this.f42374 = "";
        this.f42379 = "";
        this.f42378 = "";
        this.f42377 = false;
        this.f42373 = a.D;
        this.f42381 = -1;
        this.f42375 = "";
        this.f42380 = jSONObject.getString("1");
        this.f42372 = jSONObject.getInt("2");
        this.f42376 = jSONObject.getString("4");
        this.f42374 = jSONObject.getString("5");
        this.f42379 = jSONObject.getString("6");
        this.f42378 = jSONObject.getString(am.aF, "");
        this.f42377 = jSONObject.getBoolean("7");
        this.f42373 = jSONObject.getString("9");
        if (jSONObject.contains("e")) {
            this.f42381 = jSONObject.getInt("e");
            this.f42375 = jSONObject.getString("f", "");
        }
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        if (this.f42372 == 22) {
            return "sftp://" + this.f42376 + "@" + this.f42380;
        }
        return "sftp://" + this.f42376 + "@" + this.f42380 + ":" + this.f42372;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("1", this.f42380);
        jSONObjectMo1331.put("2", this.f42372);
        jSONObjectMo1331.put("4", this.f42376);
        jSONObjectMo1331.put("5", this.f42374);
        jSONObjectMo1331.put("6", this.f42379);
        jSONObjectMo1331.put(am.aF, this.f42378);
        jSONObjectMo1331.put("7", this.f42377);
        jSONObjectMo1331.put("9", this.f42373);
        int i = this.f42381;
        if (i != -1) {
            jSONObjectMo1331.put("e", i);
            jSONObjectMo1331.put("f", this.f42375);
        }
        return jSONObjectMo1331;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23794 m32816() {
        C23794 c23794M11614 = C3568.m11614(this.f42381, this.f42375);
        int i = this.f42381;
        int i2 = c23794M11614.f1127;
        if (i != i2) {
            this.f42381 = i2;
        }
        return c23794M11614;
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        String str = "sftp://" + this.f42376 + "@" + this.f42380;
        return str.endsWith("/") ? C1402.m5124(1, 0, str) : str;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C13263) {
            C13263 c13263 = (C13263) abstractC0148;
            this.f42380 = c13263.f42380;
            this.f42372 = c13263.f42372;
            this.f42376 = c13263.f42376;
            this.f42374 = c13263.f42374;
            this.f42379 = c13263.f42379;
            this.f42378 = c13263.f42378;
            this.f42377 = c13263.f42377;
            this.f42373 = c13263.f42373;
            this.f42381 = c13263.f42381;
            this.f42375 = c13263.f42375;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13263.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C13263 c13263 = (C13263) obj;
        return this.f42372 == c13263.f42372 && this.f42377 == c13263.f42377 && C17359.equals(this.f42380, c13263.f42380) && C17359.equals(this.f42376, c13263.f42376) && C17359.equals(this.f42374, c13263.f42374) && C17359.equals(this.f42379, c13263.f42379) && C17359.equals(this.f42378, c13263.f42378) && C17359.equals(this.f42373, c13263.f42373) && Integer.valueOf(this.f42381).equals(Integer.valueOf(c13263.f42381)) && C17359.equals(this.f42375, c13263.f42375);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return C17359.hashCode(this.f42375) + ((C24966.m55771((C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771((C24966.m55771(super.hashCode() * 31, 31, this.f42380) + this.f42372) * 31, 31, this.f42376), 31, this.f42374), 31, this.f42379), 31, this.f42378) + (this.f42377 ? 1231 : 1237)) * 31, 31, this.f42373) + this.f42381) * 31);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C23706(i, clone());
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66110;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        return C8947.m23910(new StringBuilder("sftp@"), this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m32814(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32815(AbstractActivityC17204 abstractActivityC17204) {
        m32814(abstractActivityC17204, new C13263(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32814(final AbstractActivityC17204 abstractActivityC17204, C13263 c13263) {
        C23794 c23794M20802;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C12605 c12605 = (C12605) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c232512 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232513 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1257 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1258 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        ((C1626) viewM40395.findViewById(R.id.MT_Protector)).m5759(new View.OnClickListener() { // from class: l.ۡ᩶۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C23255 c232514 = c23255;
                final C23255 c232515 = c23256;
                final C23255 c232516 = c232512;
                C11771.m29547(abstractActivityC17204, new InterfaceC0818() { // from class: l.ۙܿ۫
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        C2077 c2077 = (C2077) obj;
                        c232514.mo52335((CharSequence) c2077.m7154());
                        c232515.mo52335((CharSequence) String.valueOf(c2077.m7155()));
                        c232516.mo52335((CharSequence) c2077.m7156());
                    }
                });
            }
        });
        int i = c13263.f42381;
        if (i != -1) {
            c23794M20802 = C7606.m20802(i);
            if (c23794M20802 == null) {
                c23794M20802 = C7606.m20798(c13263.f42375);
            }
        } else {
            c23794M20802 = null;
        }
        c12605.m31317(c23794M20802);
        c12605.setPadding(c12605.getPaddingLeft(), c12605.getPaddingTop() + C6907.m19160(6.0f), c12605.getPaddingRight(), c12605.getPaddingBottom());
        View viewFindViewById = viewM40395.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM40395.findViewById(R.id.textInputLayout4);
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c13263);
        textView.setText(C21576.m49088(c13263.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SFTP"));
        c23255.mo52335((CharSequence) c13263.f42380);
        c23256.mo52335((CharSequence) String.valueOf(c13263.f42372));
        c23257.mo52335((CharSequence) c13263.f42376);
        c23258.mo52335((CharSequence) c13263.f42374);
        c23259.mo52335((CharSequence) c13263.f42379);
        c232510.mo52335((CharSequence) c13263.f42378);
        c1256.setChecked(c13263.f1129);
        c1257.setChecked(c13263.f1123);
        c1258.setChecked(c13263.f1125);
        c1257.setOnCheckedChangeListener(new C16555());
        AbstractC0148.m1317(c232513, abstractActivityC17204);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖ᩶۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                View view = viewFindViewById2;
                View view2 = viewFindViewById3;
                if (z) {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(0);
                }
            }
        };
        onCheckedChangeListener.onCheckedChanged(c1255, c13263.f42377);
        c1255.setChecked(c13263.f42377);
        c1255.setOnCheckedChangeListener(onCheckedChangeListener);
        c232511.mo52335((CharSequence) c13263.f1128);
        c232512.mo52335((CharSequence) c13263.f1122);
        c232513.mo52335((CharSequence) c13263.f42373);
        AbstractC0148.m1318(c23255, c232512);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        if (abstractActivityC17204 instanceof Main) {
            Main main = (Main) abstractActivityC17204;
            C17930 c17930M107 = main.m107();
            C20956 c20956M112 = main.m112();
            c17930M107.m40349((InterfaceC11217) dialogInterfaceC8327M8016);
            c17930M107.mo40353((Object) null);
            c17930M107.m40350(dialogInterfaceC8327M8016, new InterfaceC16438() { // from class: l.۠᩶۫
                @Override // l.InterfaceC16438
                /* JADX INFO: renamed from: ۙ */
                public final void mo1486(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C22214(abstractActivityC17204, str, c23259).m8197();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3238(4, c20956M112));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C21576.m49090(c23255);
        final C7385 c7385 = new C7385(c23255, c23257, c1255, c23259, c23258, c232513, c23256, c232510, c232511, c232512, c12605, c1256, c1257, c1258, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC12848(c7385, c13263, dialogInterfaceC8327M8016, 1));
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.۬᩶۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13263 c13264 = (C13263) c7385.get();
                if (c13264 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c13264)) {
                    new C15500(abstractActivityC17205, c13264).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13263 m32812(C23255 c23255, C23255 c23256, C1255 c1255, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C23255 c232511, C23255 c232512, C23255 c232513, C12605 c12605, C1255 c1256, C1255 c1257, C1255 c1258, C18047 c18047) {
        int i;
        if (!AbstractC0148.m1324(c23255) || !AbstractC0148.m1321(c23256, R.string.MT_Protector)) {
            return null;
        }
        if (c1255.isChecked()) {
            if (!AbstractC0148.m1321(c23257, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC0148.m1321(c23258, R.string.MT_Protector)) {
            return null;
        }
        if (!AbstractC0148.m1320(c23259)) {
            return null;
        }
        C13263 c13263 = new C13263(-1);
        c13263.f42380 = c23255.m54021().toString();
        try {
            i = Integer.parseInt(c232510.m54021().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c13263.f42372 = i;
        c13263.f42376 = c23256.m54021().toString();
        c13263.f42374 = c23258.m54021().toString();
        c13263.f42379 = c23257.m54021().toString();
        c13263.f42378 = c232511.m54021().toString();
        if (c13263.f42379.length() > 20480) {
            c13263.f42379 = c13263.f42379.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c13263.f42377 = c1255.isChecked();
        c13263.f1128 = c232512.m54021().toString();
        c13263.f1122 = AbstractC0148.m1315(c232513, c13263.f42380);
        c13263.f42373 = AbstractC0148.m1315(c23259, a.D);
        C23794 c23794M31316 = c12605.m31316();
        if (c23794M31316 != null) {
            c13263.f42381 = c23794M31316.f1127;
            c13263.f42375 = c23794M31316.mo1325();
        }
        c13263.f1129 = c1256.isChecked();
        c13263.f1123 = c1257.isChecked();
        c13263.f1125 = c1258.isChecked();
        c13263.m1334(c18047);
        return c13263;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32813(C7385 c7385, C13263 c13263, DialogInterfaceC8327 dialogInterfaceC8327) {
        C13263 c13264 = (C13263) c7385.get();
        if (c13264 == null) {
            return;
        }
        if (c13263.f1127 == -1) {
            C13263 c13265 = new C13263(AbstractC0148.m1313());
            c13265.mo1327(c13264);
            C7606.m20787(c13265);
        } else {
            c13263.mo1327(c13264);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }
}
