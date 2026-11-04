package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.᩹᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes.dex */
public final class C23794 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f77073;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f77074;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public String f77075;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f77076;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f77077;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f77078;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77079;

    public C23794(int i) {
        super(i);
        this.f77073 = "";
        this.f77076 = 22;
        this.f77075 = "root";
        this.f77077 = "";
        this.f77078 = "";
        this.f77074 = "";
        this.f77079 = false;
    }

    public C23794(JSONObject jSONObject) {
        super(jSONObject);
        this.f77073 = "";
        this.f77076 = 22;
        this.f77075 = "root";
        this.f77077 = "";
        this.f77078 = "";
        this.f77074 = "";
        this.f77079 = false;
        this.f77073 = jSONObject.getString("1");
        this.f77076 = jSONObject.getInt("2");
        this.f77075 = jSONObject.getString("3");
        this.f77077 = jSONObject.getString("4");
        this.f77078 = jSONObject.getString("5");
        this.f77074 = jSONObject.getString("6", "");
        this.f77079 = jSONObject.getBoolean("7");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        if (this.f77076 == 22) {
            return "sshj://" + this.f77075 + "@" + this.f77073;
        }
        return "sshj://" + this.f77075 + "@" + this.f77073 + ":" + this.f77076;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("1", this.f77073);
        jSONObjectMo1331.put("2", this.f77076);
        jSONObjectMo1331.put("3", this.f77075);
        jSONObjectMo1331.put("4", this.f77077);
        jSONObjectMo1331.put("5", this.f77078);
        jSONObjectMo1331.put("6", this.f77074);
        jSONObjectMo1331.put("7", this.f77079);
        return jSONObjectMo1331;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m53076() {
        if (this.f77074.isEmpty()) {
            return null;
        }
        return this.f77074;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C23794) {
            C23794 c23794 = (C23794) abstractC0148;
            this.f77073 = c23794.f77073;
            this.f77076 = c23794.f77076;
            this.f77075 = c23794.f77075;
            this.f77077 = c23794.f77077;
            this.f77078 = c23794.f77078;
            this.f77074 = c23794.f77074;
            this.f77079 = c23794.f77079;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23794.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C23794 c23794 = (C23794) obj;
        return this.f77076 == c23794.f77076 && this.f77079 == c23794.f77079 && C17359.equals(this.f77073, c23794.f77073) && C17359.equals(this.f77075, c23794.f77075) && C17359.equals(this.f77077, c23794.f77077) && C17359.equals(this.f77078, c23794.f77078) && C17359.equals(this.f77074, c23794.f77074);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771((C24966.m55771(super.hashCode() * 31, 31, this.f77073) + this.f77076) * 31, 31, this.f77075), 31, this.f77077), 31, this.f77078), 31, this.f77074) + (this.f77079 ? 1231 : 1237);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m53074(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53072(ActivityC0673 activityC0673) {
        m53074(activityC0673, new C23794(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53074(final AbstractActivityC17204 abstractActivityC17204, final C23794 c23794) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        ((C1626) viewM40395.findViewById(R.id.MT_Protector)).m5759(new View.OnClickListener() { // from class: l.ᩴ᩶۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11771.m29547(abstractActivityC17204, new C25286(c23255, c23256, c232511, 0));
            }
        });
        View viewFindViewById = viewM40395.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM40395.findViewById(R.id.textInputLayout4);
        StringBuilder sb = new StringBuilder();
        sb.append(C21576.m49088(c23794.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C21576.m49088(R.string.MT_Protector));
        textView.setText(sb.toString());
        c23255.mo52335((CharSequence) c23794.f77073);
        c23256.mo52335((CharSequence) String.valueOf(c23794.f77076));
        c23257.mo52335((CharSequence) c23794.f77075);
        c23258.mo52335((CharSequence) c23794.f77077);
        c23259.mo52335((CharSequence) c23794.f77078);
        c232510.mo52335((CharSequence) c23794.f77074);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܳ᩶۫
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
        onCheckedChangeListener.onCheckedChanged(c1255, c23794.f77079);
        c1255.setChecked(c23794.f77079);
        c1255.setOnCheckedChangeListener(onCheckedChangeListener);
        c232511.mo52335((CharSequence) c23794.f1122);
        AbstractC0148.m1318(c23255, c232511);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        if (abstractActivityC17204 instanceof ActivityC0673) {
            ActivityC0673 activityC0673 = (ActivityC0673) abstractActivityC17204;
            C17930 c17930M2915 = activityC0673.m2915();
            C20956 c20956M2917 = activityC0673.m2917();
            c17930M2915.m40349((InterfaceC11217) dialogInterfaceC8327M8016);
            c17930M2915.mo40353((Object) null);
            c17930M2915.m40350(dialogInterfaceC8327M8016, new InterfaceC16438() { // from class: l.۫᩶۫
                @Override // l.InterfaceC16438
                /* JADX INFO: renamed from: ۙ */
                public final void mo1486(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C17080(abstractActivityC17204, str, c23259).m8197();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC24936(1, c20956M2917));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C21576.m49090(c23255);
        final C5894 c5894 = new C5894(c23255, c23257, c1255, c23259, c23258, c23256, c232510, c232511);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.֫᩶۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23794.m53075(c5894, c23794, abstractActivityC17204, dialogInterfaceC8327M8016);
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩶۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23794 c23795 = (C23794) c5894.get();
                if (c23795 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c23795)) {
                    new C16334(abstractActivityC17205, c23795).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23794 m53071(C23255 c23255, C23255 c23256, C1255 c1255, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C23255 c232511) {
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
        C23794 c23794 = new C23794(-1);
        c23794.f77073 = c23255.m54021().toString();
        try {
            i = Integer.parseInt(c23259.m54021().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c23794.f77076 = i;
        c23794.f77075 = c23256.m54021().toString();
        c23794.f77077 = c23258.m54021().toString();
        c23794.f77078 = c23257.m54021().toString();
        c23794.f77074 = c232510.m54021().toString();
        if (c23794.f77078.length() > 20480) {
            c23794.f77078 = c23794.f77078.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c23794.f77079 = c1255.isChecked();
        c23794.f1122 = AbstractC0148.m1315(c232511, c23794.f77073);
        return c23794;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53075(C5894 c5894, C23794 c23794, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        C23794 c23795 = (C23794) c5894.get();
        if (c23795 == null) {
            return;
        }
        if (c23794.f1127 == -1) {
            C23794 c23796 = new C23794(AbstractC0148.m1313());
            c23796.mo1327(c23795);
            C7606.m20787(c23796);
            if (abstractActivityC17204 instanceof ActivityC0673) {
                ((ActivityC0673) abstractActivityC17204).m2918();
            }
        } else {
            c23794.mo1327(c23795);
            C7606.m20783();
            if (abstractActivityC17204 instanceof ActivityC0673) {
                ((ActivityC0673) abstractActivityC17204).m2916();
            }
        }
        dialogInterfaceC8327.dismiss();
    }
}
