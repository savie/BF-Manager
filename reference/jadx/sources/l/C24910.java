package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U16Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24910 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f80623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f80625 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f80624 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f80622 = new ArrayList();

    public C24910(String str) {
        this.f80623 = str.replace('/', ' ').replace('\\', ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55496(JSONObject jSONObject) {
        ArrayList arrayList = this.f80625;
        arrayList.clear();
        ArrayList arrayList2 = this.f80624;
        arrayList2.clear();
        ArrayList arrayList3 = this.f80622;
        arrayList3.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(am.av);
        for (int i = 0; i < jSONArray.length(); i++) {
            C1789 c1789 = new C1789();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C3280 c3280 = c1789.f6106;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("b");
            c3280.f10689.m50979(jSONObject3, 'a');
            c3280.f10693.m50979(jSONObject3, 'd');
            c3280.f10692.m50979(jSONObject3, 'g');
            c3280.f10691.m50979(jSONObject3, 'j');
            c3280.f10695 = jSONObject3.getInt("m") != 0;
            c3280.f10694 = jSONObject3.getInt("n") != 0;
            c3280.f10690 = jSONObject3.getInt("o") != 0;
            if (jSONObject2.has("e")) {
                C12975 c12975 = c1789.f6105;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("e");
                c12975.f41599.m50979(jSONObject4, 'a');
                c12975.f41601.m50979(jSONObject4, 'd');
                c12975.f41602.m50979(jSONObject4, 'g');
                c12975.f41604 = jSONObject4.getInt("j") != 0;
                c12975.f41605 = jSONObject4.getInt("k") != 0;
                c12975.f41600 = jSONObject4.getInt("l") != 0;
                c12975.f41603 = jSONObject4.getInt("m") != 0;
            }
            c1789.f6107 = jSONObject2.getInt(am.aF);
            c1789.f6108 = jSONObject2.getInt("d");
            int i2 = c1789.f6107;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                c1789.f6107 = 0;
            }
            arrayList.add(c1789);
            if (c1789.f6107 != 2) {
                arrayList2.add(c1789);
            } else {
                arrayList3.add(c1789);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JSONObject m55497() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f80625.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1789) it.next()).m6251());
            }
            jSONObject.put(am.av, jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55498() {
        for (C1789 c1789 : this.f80625) {
            if (c1789.f6107 != 2) {
                C3280 c3280 = c1789.f6106;
                c3280.f10689.m50982();
                c3280.f10693.m50982();
                c3280.f10692.m50982();
                c3280.f10691.m50982();
            } else {
                C12975 c12975 = c1789.f6105;
                c12975.f41599.m50982();
                c12975.f41602.m50982();
                c12975.f41601.m50982();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55495() {
        C22629 c22629;
        for (C1789 c1789 : this.f80625) {
            if (c1789.f6107 != 2) {
                C3280 c3280 = c1789.f6106;
                c3280.f10689.f73226 = null;
                c3280.f10693.f73226 = null;
                c3280.f10692.f73226 = null;
                c22629 = c3280.f10691;
            } else {
                C12975 c12975 = c1789.f6105;
                c12975.f41599.f73226 = null;
                c12975.f41602.f73226 = null;
                c22629 = c12975.f41601;
            }
            c22629.f73226 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23418 m55494(AbstractC12384 abstractC12384) {
        EnumC7011 enumC7011;
        boolean z;
        EnumC7011 enumC7012;
        boolean z2;
        EnumC22631 enumC22631Mo30864 = abstractC12384.mo30864();
        ArrayList<C1789> arrayList = this.f80624;
        C23418 c23418 = null;
        if (!arrayList.isEmpty() && (((enumC7012 = enumC22631Mo30864.f73508) == EnumC7011.Format35c || enumC7012 == EnumC7011.Format3rc) && enumC22631Mo30864.f73513 == 3)) {
            InterfaceC4859 interfaceC4859 = (InterfaceC4859) ((InterfaceC6177) abstractC12384).getReference();
            for (C1789 c1789 : arrayList) {
                C3280 c3280 = c1789.f6106;
                C22629 c22629 = c3280.f10692;
                boolean z3 = c3280.f10695 && (enumC22631Mo30864 == EnumC22631.f73238 || enumC22631Mo30864 == EnumC22631.f73347 || enumC22631Mo30864 == EnumC22631.f73411 || enumC22631Mo30864 == EnumC22631.f73491);
                if (!z3 && c3280.f10694) {
                    z3 = enumC22631Mo30864 == EnumC22631.f73507 || enumC22631Mo30864 == EnumC22631.f73427;
                }
                if (!z3 && c3280.f10690) {
                    z3 = enumC22631Mo30864 == EnumC22631.f73304 || enumC22631Mo30864 == EnumC22631.f73499;
                }
                if (!z3 || !c3280.f10689.m50981(interfaceC4859.mo6804()) || !c3280.f10693.m50981(interfaceC4859.getName())) {
                    z2 = false;
                } else if (!c22629.f73224) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC4859.mo6805().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    if (!c22629.m50981(sb.toString())) {
                        z2 = false;
                    } else if (c3280.f10691.m50981(interfaceC4859.mo6802())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (c3280.f10691.m50981(interfaceC4859.mo6802())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (c23418 == null) {
                        c23418 = new C23418();
                    }
                    int i = c1789.f6107;
                    if (i == 0) {
                        c23418.f75802 = true;
                    } else if (i == 1) {
                        if (interfaceC4859.getName().equals("<init>")) {
                            int i2 = c1789.f6108;
                            if ((i2 & 1) != 0) {
                                c23418.f75804 = true;
                                c23418.f75805 = 1;
                            }
                            int i3 = i2 & (-2);
                            if (i3 != 0) {
                                c23418.f75801 = true;
                                c23418.f75803 = i3 | c23418.f75803;
                            }
                        } else {
                            c23418.f75801 = true;
                            c23418.f75803 = c1789.f6108 | c23418.f75803;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            return c23418;
        }
        ArrayList arrayList2 = this.f80622;
        if (!arrayList2.isEmpty() && (((enumC7011 = enumC22631Mo30864.f73508) == EnumC7011.Format22c || enumC7011 == EnumC7011.Format21c) && enumC22631Mo30864.f73513 == 2)) {
            InterfaceC8304 interfaceC8304 = (InterfaceC8304) ((InterfaceC6177) abstractC12384).getReference();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C12975 c12975 = ((C1789) it2.next()).f6105;
                if (c12975.f41604) {
                    switch (C15212.f49646[enumC22631Mo30864.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = false;
                }
                if (!z && c12975.f41605) {
                    switch (C15212.f49646[enumC22631Mo30864.ordinal()]) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            z = true;
                            break;
                    }
                }
                if (!z && c12975.f41600) {
                    switch (C15212.f49646[enumC22631Mo30864.ordinal()]) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            z = true;
                            break;
                    }
                }
                if (!z && c12975.f41603) {
                    switch (C15212.f49646[enumC22631Mo30864.ordinal()]) {
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            z = true;
                            break;
                    }
                }
                if (z && c12975.f41599.m50981(interfaceC8304.mo4500()) && c12975.f41602.m50981(interfaceC8304.getName()) && c12975.f41601.m50981(interfaceC8304.getType())) {
                    C23418 c23419 = new C23418();
                    c23419.f75800 = true;
                    return c23419;
                }
            }
        }
        return null;
    }
}
