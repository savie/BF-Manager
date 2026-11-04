package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12957 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f41526;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f41527;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f41528;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f41529;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f41530;

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return "SMB";
    }

    public C12957(int i) {
        super(i);
        this.f41529 = "";
        this.f41530 = 445;
        this.f41526 = "";
        this.f41528 = "";
        this.f41527 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12957(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "7");
        AbstractC0148.m1322(jSONObject, "ip", "6");
        AbstractC0148.m1316(jSONObject, "hs", "8");
        AbstractC0148.m1316(jSONObject, "mt", "9");
        this.f41529 = "";
        this.f41530 = 445;
        this.f41526 = "";
        this.f41528 = "";
        this.f41527 = "";
        this.f41529 = jSONObject.getString("1");
        this.f41530 = jSONObject.getInt("2");
        this.f41526 = jSONObject.getString("3");
        this.f41528 = jSONObject.getString("4");
        this.f41527 = jSONObject.getString("5");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        StringBuilder sb = new StringBuilder("smb://");
        sb.append(this.f41528);
        if (!TextUtils.isEmpty(this.f41526)) {
            sb.append(":");
            sb.append(this.f41526);
        }
        sb.append("@");
        sb.append(this.f41529);
        if (this.f41530 != 445) {
            sb.append(":");
            sb.append(this.f41530);
        }
        return sb.toString();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("1", this.f41529);
        jSONObjectMo1331.put("2", this.f41530);
        jSONObjectMo1331.put("3", this.f41526);
        jSONObjectMo1331.put("4", this.f41528);
        jSONObjectMo1331.put("5", this.f41527);
        return jSONObjectMo1331;
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        String str = "smb://" + this.f41528 + "@" + this.f41529;
        return str.endsWith("/") ? C1402.m5124(1, 0, str) : str;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C12957) {
            C12957 c12957 = (C12957) abstractC0148;
            this.f41529 = c12957.f41529;
            this.f41530 = c12957.f41530;
            this.f41526 = c12957.f41526;
            this.f41528 = c12957.f41528;
            this.f41527 = c12957.f41527;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12957.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C12957 c12957 = (C12957) obj;
        return this.f41530 == c12957.f41530 && C17359.equals(this.f41529, c12957.f41529) && C17359.equals(this.f41526, c12957.f41526) && C17359.equals(this.f41528, c12957.f41528) && C17359.equals(this.f41527, c12957.f41527);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return C17359.hashCode(this.f41527) + C24966.m55771(C24966.m55771((C24966.m55771(super.hashCode() * 31, 31, this.f41529) + this.f41530) * 31, 31, this.f41526), 31, this.f41528);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C18924(i, clone());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23032 m32345(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return C10351.m26627().mo22002();
        }
        if (!str2.equals("guest") || !TextUtils.isEmpty(str3)) {
            C19982 c19982 = new C19982(str, str2, str3, EnumC22966.USER);
            C10351 c10351M26627 = C10351.m26627();
            c10351M26627.getClass();
            return new C8115(c10351M26627, c19982);
        }
        return C10351.m26627().m43135();
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66055;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        return C8947.m23910(new StringBuilder("smb@"), this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m32347(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32348(AbstractActivityC17204 abstractActivityC17204) {
        m32347(abstractActivityC17204, new C12957(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32347(final AbstractActivityC17204 abstractActivityC17204, final C12957 c12957) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        ((C1626) viewM40395.findViewById(R.id.MT_Protector)).m5759(new View.OnClickListener() { // from class: l.᩷۟۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3262.m10653(abstractActivityC17204, new C25286(c23255, c23256, c232511, 1));
            }
        });
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c12957);
        textView.setText(C21576.m49088(c12957.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SMB"));
        c23255.mo52335((CharSequence) c12957.f41529);
        c23256.mo52335((CharSequence) String.valueOf(c12957.f41530));
        c23257.mo52335((CharSequence) c12957.f41526);
        c23258.mo52335((CharSequence) c12957.f41528);
        c23259.mo52335((CharSequence) c12957.f41527);
        c232510.mo52335((CharSequence) c12957.f1128);
        c232511.mo52335((CharSequence) c12957.f1122);
        c1255.setChecked(c12957.f1129);
        c1256.setChecked(c12957.f1123);
        c1256.setOnCheckedChangeListener(new C16555());
        int i = 1;
        AbstractC0148.m1319(c23255, c232511, new C19603(i, c23257));
        AbstractC0148.m1319(c23257, c232511, new C2085(i, c23255));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        C21576.m49090(c23255);
        final C10719 c10719 = new C10719(c23255, c23256, c23257, c23258, c23259, c232510, c232511, c1255, c1256, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩸۟۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12957.m32346(c10719, c12957, dialogInterfaceC8327M8016);
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ۟۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12957 c12958 = (C12957) c10719.get();
                if (c12958 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c12958)) {
                    new C15194(abstractActivityC17205, c12958, c23258).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12957 m32344(C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C23255 c232511, C1255 c1255, C1255 c1256, C18047 c18047) {
        int i;
        if (!AbstractC0148.m1324(c23255)) {
            return null;
        }
        C12957 c12957 = new C12957(-1);
        c12957.f41529 = c23255.m54021().toString();
        try {
            i = Integer.parseInt(c23256.m54021().toString());
        } catch (NumberFormatException unused) {
            i = 445;
        }
        c12957.f41530 = i;
        c12957.f41526 = c23257.m54021().toString();
        c12957.f41528 = c23258.m54021().toString();
        c12957.f41527 = c23259.m54021().toString();
        c12957.f1128 = c232510.m54021().toString();
        c12957.f1122 = AbstractC0148.m1315(c232511, TextUtils.isEmpty(c12957.f41526) ? c12957.f41529 : c12957.f41526);
        c12957.f1129 = c1255.isChecked();
        c12957.f1123 = c1256.isChecked();
        c12957.m1334(c18047);
        return c12957;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32346(C10719 c10719, C12957 c12957, DialogInterfaceC8327 dialogInterfaceC8327) {
        C12957 c12958 = (C12957) c10719.get();
        if (c12958 == null) {
            return;
        }
        if (c12957.f1127 == -1) {
            C12957 c12959 = new C12957(AbstractC0148.m1313());
            c12959.mo1327(c12958);
            C7606.m20787(c12959);
        } else {
            c12957.mo1327(c12958);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }
}
