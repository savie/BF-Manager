package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۡܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes4.dex */
public final class C9423 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f30575;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f30576;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f30577;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f30578;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f30579;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f30580;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f30581;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9423(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "6");
        AbstractC0148.m1322(jSONObject, "ip", "7");
        AbstractC0148.m1316(jSONObject, "hs", "8");
        this.f30577 = jSONObject.getInt("1", 0);
        this.f30575 = jSONObject.getString("2");
        this.f30578 = jSONObject.getString("3");
        this.f30581 = jSONObject.getString("4");
        this.f30580 = jSONObject.getString("5");
        this.f30576 = jSONObject.getString("9", "");
        this.f30579 = jSONObject.getBoolean(am.av, false);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        return AbstractC24342.m54383(this.f30577).mo18225() + "://" + this.f30581 + ":" + this.f30580;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("1", this.f30577);
        jSONObjectMo1331.put("2", this.f30575);
        jSONObjectMo1331.put("3", this.f30578);
        jSONObjectMo1331.put("4", this.f30581);
        jSONObjectMo1331.put("5", this.f30580);
        jSONObjectMo1331.put("9", this.f30576);
        jSONObjectMo1331.put(am.av, this.f30579);
        return jSONObjectMo1331;
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
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        return AbstractC24342.m54383(this.f30577).mo18225() + "://" + this.f30580;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C9423) {
            C9423 c9423 = (C9423) abstractC0148;
            this.f30577 = c9423.f30577;
            this.f30575 = c9423.f30575;
            this.f30578 = c9423.f30578;
            this.f30581 = c9423.f30581;
            this.f30580 = c9423.f30580;
            this.f30576 = c9423.f30576;
            this.f30579 = c9423.f30579;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9423.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C9423 c9423 = (C9423) obj;
        return this.f30577 == c9423.f30577 && C17359.equals(this.f30575, c9423.f30575) && C17359.equals(this.f30578, c9423.f30578) && C17359.equals(this.f30581, c9423.f30581) && C17359.equals(this.f30580, c9423.f30580) && C17359.equals(this.f30576, c9423.f30576) && Boolean.valueOf(this.f30579).equals(Boolean.valueOf(c9423.f30579));
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return Boolean.valueOf(this.f30579).hashCode() + C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771(((super.hashCode() * 31) + this.f30577) * 31, 31, this.f30575), 31, this.f30578), 31, this.f30581), 31, this.f30580), 31, this.f30576);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C22302(i, clone());
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66059;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC24342.m54383(this.f30577).mo18225());
        sb.append("@");
        return C8947.m23910(sb, this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m24798(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24800(AbstractActivityC17204 abstractActivityC17204) {
        m24798(abstractActivityC17204, new C9423(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24798(final AbstractActivityC17204 abstractActivityC17204, final C9423 c9423) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232511 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1257 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c9423);
        ((C1626) viewM40395.findViewById(R.id.MT_Protector)).m5759(new ViewOnClickListenerC0305(abstractActivityC17204, 2));
        StringBuilder sb = new StringBuilder();
        sb.append(C21576.m49088(c9423.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C21576.m49088(R.string.MT_Protector));
        textView.setText(sb.toString());
        c23257.mo52335((CharSequence) c9423.f30580);
        c23258.mo52335((CharSequence) c9423.f30581);
        c23259.mo52335((CharSequence) c9423.f30576);
        c23255.mo52335((CharSequence) c9423.f30575);
        c23256.mo52335((CharSequence) c9423.f30578);
        c232510.mo52335((CharSequence) c9423.f1128);
        c232511.mo52335((CharSequence) c9423.f1122);
        c1256.setChecked(c9423.f1129);
        c1257.setChecked(c9423.f1123);
        c1255.setChecked(c9423.f30579);
        c1257.setOnCheckedChangeListener(new C16555());
        AbstractC0148.m1318(c23257, c232511);
        viewM40395.findViewById(R.id.help).setOnClickListener(new ViewOnClickListenerC12025(abstractActivityC17204, 3));
        final C21358 c21358 = new C21358(c1255, autoCompleteTextView, (C1626) viewM40395.findViewById(R.id.MT_Protector), (C1626) viewM40395.findViewById(R.id.MT_Protector), (C1626) viewM40395.findViewById(R.id.MT_Protector), abstractActivityC17204, c23255, c23256, c23257, c23258, c232511);
        final AbstractC24342[] abstractC24342Arr = {C6442.f21680, C23596.f76606, C11661.f37791, C16136.f52423, C25088.f81124, C12407.f39903};
        autoCompleteTextView.setAdapter(new C3054(abstractActivityC17204, abstractC24342Arr));
        AbstractC24342 abstractC24342M54383 = AbstractC24342.m54383(c9423.f30577);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ܿܰ۫
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                c21358.accept(abstractC24342Arr[i]);
            }
        });
        autoCompleteTextView.setText((CharSequence) abstractC24342M54383.mo18223(), false);
        autoCompleteTextView.setKeyListener(null);
        c21358.accept(abstractC24342M54383);
        autoCompleteTextView.setPadding(autoCompleteTextView.getPaddingLeft(), autoCompleteTextView.getPaddingTop() + C6907.m19160(6.0f), autoCompleteTextView.getPaddingRight(), autoCompleteTextView.getPaddingBottom());
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        C21576.m49090(c23255);
        final C0475 c0475 = new C0475(c23257, c23258, c23255, c23256, autoCompleteTextView, c23259, c232510, c232511, c1256, c1257, c1255, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.۟ܰ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9423.m24797(c0475, c9423, dialogInterfaceC8327M8016);
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳܰ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9423 c9424 = (C9423) c0475.get();
                if (c9424 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c9424)) {
                    new C1221(abstractActivityC17205, c9424).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9423 m24799(C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, AutoCompleteTextView autoCompleteTextView, C23255 c23259, C23255 c232510, C23255 c232511, C1255 c1255, C1255 c1256, C1255 c1257, C18047 c18047) {
        if (!AbstractC0148.m1321(c23255, R.string.MT_Protector) || !AbstractC0148.m1321(c23256, R.string.MT_Protector) || !AbstractC0148.m1321(c23257, R.string.MT_Protector) || !AbstractC0148.m1321(c23258, R.string.MT_Protector)) {
            return null;
        }
        C9423 c9423 = new C9423(-1);
        c9423.f30577 = ((AbstractC24342) autoCompleteTextView.getTag()).mo18227();
        c9423.f30580 = c23255.m54021().toString();
        c9423.f30581 = c23256.m54021().toString();
        c9423.f30576 = c23259.m54021().toString();
        c9423.f30575 = c23257.m54021().toString();
        c9423.f30578 = c23258.m54021().toString();
        c9423.f1128 = c232510.m54021().toString();
        c9423.f1122 = AbstractC0148.m1315(c232511, c9423.f30580);
        c9423.f1129 = c1255.isChecked();
        c9423.f1123 = c1256.isChecked();
        c9423.f30579 = c1257.getVisibility() == 0 && c1257.isChecked();
        c9423.m1334(c18047);
        return c9423;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24797(C0475 c0475, C9423 c9423, DialogInterfaceC8327 dialogInterfaceC8327) {
        C9423 c9424 = (C9423) c0475.get();
        if (c9424 == null) {
            return;
        }
        if (c9423.f1127 == -1) {
            C9423 c9425 = new C9423(AbstractC0148.m1313());
            c9425.mo1327(c9424);
            C7606.m20787(c9425);
        } else {
            c9423.mo1327(c9424);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24795(String str, ClientConfiguration clientConfiguration) {
        if (str.toLowerCase().startsWith("https://")) {
            clientConfiguration.m163(Protocol.HTTPS);
            str = str.substring(8);
        } else if (str.toLowerCase().startsWith("http://")) {
            clientConfiguration.m163(Protocol.HTTP);
            str = str.substring(7);
        } else {
            clientConfiguration.m163(Protocol.HTTPS);
        }
        return str.endsWith("/") ? C1402.m5124(1, 0, str) : str;
    }
}
