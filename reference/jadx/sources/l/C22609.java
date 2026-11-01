package l;

import bin.mt.json.JSONObject;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes.dex */
public final class C22609 extends C14475 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73678 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C10947 f73679 = C10947.m27462("2025-06-18", "2025-03-26");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8964 f73680;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7845 f73681;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f73682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7845 m50120(C18375 c18375) {
        C22609 c22609 = ServiceC8498.f29453;
        if (c22609 == null) {
            return null;
        }
        return c22609.f73681;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7845 m50121(C21903 c21903) {
        C22609 c22609 = ServiceC8498.f29453;
        if (c22609 == null) {
            return null;
        }
        return c22609.f73681;
    }

    public C22609(int i) {
        C7845 c7845 = new C7845();
        C8964 c8964 = new C8964(new C2800(C20119.m45481(), C20119.m45482()));
        JSONObject jSONObjectM9603 = C3184.m9603("name", "MT MCP", "version", "0.2.0");
        ArrayList arrayList = new ArrayList(30);
        C17141 c17141 = new C17141();
        C11995 c11995 = new C11995(c7845);
        C5644 c5644 = new C5644(c7845);
        C21872 c21872 = new C21872(c7845);
        C9173 c9173 = new C9173(c7845);
        C2115 c2115 = new C2115(c7845);
        C19050 c19050 = new C19050(c7845);
        C1160 c1160 = new C1160(c7845);
        C20917 c20917 = new C20917(c7845);
        arrayList.add(new C2821(c7845));
        arrayList.add(c17141);
        arrayList.add(new C23989(c7845));
        arrayList.add(c11995);
        arrayList.add(c9173);
        arrayList.add(new C23284(c21872));
        arrayList.add(new C1410(c21872));
        arrayList.add(c5644);
        arrayList.add(c2115);
        arrayList.add(new C4232(c21872));
        arrayList.add(c19050);
        arrayList.add(new C0891(c7845));
        arrayList.add(c1160);
        arrayList.add(new C10065(c7845));
        arrayList.add(c20917);
        arrayList.add(new C23419(c7845));
        arrayList.add(new C2302(c7845));
        arrayList.add(new C23492(c7845, c11995, c5644, c21872, c9173, c2115, c19050, c17141, c1160, c20917));
        arrayList.add(new C9381(c7845));
        arrayList.add(new C14112(c7845));
        arrayList.add(new C14320(c7845));
        arrayList.add(new C4938(c7845));
        arrayList.add(new C0207(c7845));
        arrayList.add(new C22578(c7845));
        arrayList.add(new C1597(c7845));
        arrayList.add(new C2571(c7845));
        arrayList.add(new C1618(c7845));
        arrayList.add(new C5852(c7845));
        arrayList.add(new C10792(c7845));
        arrayList.add(new C7055(c7845));
        ArrayList arrayList2 = new ArrayList(arrayList);
        C2800 c2800 = new C2800(C20119.m45481(), C20119.m45482());
        C17617 c17617 = new C17617(c2800);
        C1201 c1201 = new C1201(c2800);
        C17659 c17659 = new C17659(c2800);
        C21187 c21187 = new C21187(c2800);
        C13427 c13427 = new C13427(c2800);
        C19777 c19777 = new C19777(c2800);
        ArrayList arrayList3 = new ArrayList(19);
        arrayList3.add(new C20335(new C16621(c2800)));
        arrayList3.add(new C4127(c1201));
        arrayList3.add(new C6244(c1201));
        arrayList3.add(new C10479(c2800));
        arrayList3.add(new C8362(c2800));
        arrayList3.add(new C1305(c17617));
        arrayList3.add(new C3421(c17617));
        arrayList3.add(new C21767(c17617));
        arrayList3.add(new C1989(c17617));
        arrayList3.add(new C23179(c17659));
        arrayList3.add(new C2716(c21187));
        arrayList3.add(new C3400(c13427));
        arrayList3.add(new C14007(c19777));
        arrayList3.add(new C17533(new C21663(c2800, c1201)));
        arrayList3.add(new C20356(c17617));
        arrayList3.add(new C2010(c17617));
        arrayList3.add(new C16807(c17617));
        arrayList3.add(new C6223(c17617));
        arrayList3.add(new C16828(c8964));
        arrayList2.addAll(arrayList3);
        arrayList2.add(new C20710(new C5893(c17617, c7845)));
        arrayList2.addAll(C1326.m4724(c2800, c17617));
        super(i, f73679, jSONObjectM9603, new C6380(arrayList2), new C12026(i), C8716.m22551());
        this.f73680 = c8964;
        this.f73682 = i;
        this.f73681 = c7845;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m50122() {
        return this.f73682;
    }

    @Override // l.AbstractC16940
    /* JADX INFO: renamed from: ۖ */
    public final void mo39649() {
        C7845 c7845 = this.f73681;
        C8964 c8964 = this.f73680;
        C0577.m2747("MT MCP server stop requested: port=" + this.f73682 + ", wasStarted=" + m39651() + ", alive=" + m39653() + ", listeningPort=" + m39650(), new Throwable("MT MCP server stop trace"));
        try {
            super.mo39649();
        } finally {
            c8964.close();
            try {
                c7845.m20721();
            } catch (Exception e) {
                C0577.m2747("MT MCP smali cache shutdown failed", e);
            }
        }
    }
}
