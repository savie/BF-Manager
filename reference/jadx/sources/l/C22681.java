package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U16Z */
/* JADX INFO: loaded from: classes.dex */
public final class C22681 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f73863;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f73861 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f73864 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f73862 = new ArrayList();

    public C22681(String str) {
        this.f73863 = str.replace('/', ' ').replace('\\', ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50241(JSONObject jSONObject) {
        ArrayList arrayList = this.f73861;
        arrayList.clear();
        ArrayList arrayList2 = this.f73864;
        arrayList2.clear();
        ArrayList arrayList3 = this.f73862;
        arrayList3.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(am.av);
        for (int i = 0; i < jSONArray.length(); i++) {
            C3629 c3629 = new C3629();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C7864 c7864 = c3629.f13333;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("b");
            c7864.f25879.m7427(jSONObject3, 'a');
            c7864.f25880.m7427(jSONObject3, 'd');
            c7864.f25883.m7427(jSONObject3, 'g');
            c7864.f25877.m7427(jSONObject3, 'j');
            c7864.f25878 = jSONObject3.getInt("m") != 0;
            c7864.f25882 = jSONObject3.getInt("n") != 0;
            c7864.f25881 = jSONObject3.getInt("o") != 0;
            if (jSONObject2.has("e")) {
                C0807 c0807 = c3629.f13332;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("e");
                c0807.f3416.m7427(jSONObject4, 'a');
                c0807.f3414.m7427(jSONObject4, 'd');
                c0807.f3420.m7427(jSONObject4, 'g');
                c0807.f3419 = jSONObject4.getInt("j") != 0;
                c0807.f3415 = jSONObject4.getInt("k") != 0;
                c0807.f3418 = jSONObject4.getInt("l") != 0;
                c0807.f3417 = jSONObject4.getInt("m") != 0;
            }
            c3629.f13334 = jSONObject2.getInt(am.aF);
            c3629.f13331 = jSONObject2.getInt("d");
            int i2 = c3629.f13334;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                c3629.f13334 = 0;
            }
            arrayList.add(c3629);
            if (c3629.f13334 != 2) {
                arrayList2.add(c3629);
            } else {
                arrayList3.add(c3629);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final JSONObject m50242() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f73861.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C3629) it.next()).m10731());
            }
            jSONObject.put(am.av, jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50243() {
        for (C3629 c3629 : this.f73861) {
            if (c3629.f13334 != 2) {
                C7864 c7864 = c3629.f13333;
                c7864.f25879.m7430();
                c7864.f25880.m7430();
                c7864.f25883.m7430();
                c7864.f25877.m7430();
            } else {
                C0807 c0807 = c3629.f13332;
                c0807.f3416.m7430();
                c0807.f3420.m7430();
                c0807.f3414.m7430();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50240() {
        C2446 c2446;
        for (C3629 c3629 : this.f73861) {
            if (c3629.f13334 != 2) {
                C7864 c7864 = c3629.f13333;
                c7864.f25879.f9760 = null;
                c7864.f25880.f9760 = null;
                c7864.f25883.f9760 = null;
                c2446 = c7864.f25877;
            } else {
                C0807 c0807 = c3629.f13332;
                c0807.f3416.f9760 = null;
                c0807.f3420.f9760 = null;
                c2446 = c0807.f3414;
            }
            c2446.f9760 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18447 m50239(AbstractC3384 abstractC3384) {
        EnumC18057 enumC18057;
        boolean z;
        EnumC18057 enumC18058;
        boolean z2;
        EnumC10297 enumC10297Mo5435 = abstractC3384.mo5435();
        ArrayList<C3629> arrayList = this.f73864;
        C18447 c18447 = null;
        if (!arrayList.isEmpty() && (((enumC18058 = enumC10297Mo5435.f35328) == EnumC18057.Format35c || enumC18058 == EnumC18057.Format3rc) && enumC10297Mo5435.f35329 == 3)) {
            InterfaceC8858 interfaceC8858 = (InterfaceC8858) ((InterfaceC13859) abstractC3384).getReference();
            for (C3629 c3629 : arrayList) {
                C7864 c7864 = c3629.f13333;
                C2446 c2446 = c7864.f25883;
                boolean z3 = c7864.f25878 && (enumC10297Mo5435 == EnumC10297.f35236 || enumC10297Mo5435 == EnumC10297.f35113 || enumC10297Mo5435 == EnumC10297.f35252 || enumC10297Mo5435 == EnumC10297.f35260);
                if (!z3 && c7864.f25882) {
                    z3 = enumC10297Mo5435 == EnumC10297.f35308 || enumC10297Mo5435 == EnumC10297.f35292;
                }
                if (!z3 && c7864.f25881) {
                    z3 = enumC10297Mo5435 == EnumC10297.f35162 || enumC10297Mo5435 == EnumC10297.f35129;
                }
                if (!z3 || !c7864.f25879.m7429(interfaceC8858.mo9700()) || !c7864.f25880.m7429(interfaceC8858.getName())) {
                    z2 = false;
                } else if (!c2446.f9758) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC8858.mo9699().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    if (!c2446.m7429(sb.toString())) {
                        z2 = false;
                    } else if (c7864.f25877.m7429(interfaceC8858.mo9698())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (c7864.f25877.m7429(interfaceC8858.mo9698())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (c18447 == null) {
                        c18447 = new C18447();
                    }
                    int i = c3629.f13334;
                    if (i == 0) {
                        c18447.f58809 = true;
                    } else if (i == 1) {
                        if (interfaceC8858.getName().equals("<init>")) {
                            int i2 = c3629.f13331;
                            if ((i2 & 1) != 0) {
                                c18447.f58808 = true;
                                c18447.f58804 = 1;
                            }
                            int i3 = i2 & (-2);
                            if (i3 != 0) {
                                c18447.f58807 = true;
                                c18447.f58806 = i3 | c18447.f58806;
                            }
                        } else {
                            c18447.f58807 = true;
                            c18447.f58806 = c3629.f13331 | c18447.f58806;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            return c18447;
        }
        ArrayList arrayList2 = this.f73862;
        if (!arrayList2.isEmpty() && (((enumC18057 = enumC10297Mo5435.f35328) == EnumC18057.Format22c || enumC18057 == EnumC18057.Format21c) && enumC10297Mo5435.f35329 == 2)) {
            InterfaceC18735 interfaceC18735 = (InterfaceC18735) ((InterfaceC13859) abstractC3384).getReference();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C0807 c0807 = ((C3629) it2.next()).f13332;
                if (c0807.f3419) {
                    switch (C21975.f71283[enumC10297Mo5435.ordinal()]) {
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
                if (!z && c0807.f3415) {
                    switch (C21975.f71283[enumC10297Mo5435.ordinal()]) {
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
                if (!z && c0807.f3418) {
                    switch (C21975.f71283[enumC10297Mo5435.ordinal()]) {
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
                if (!z && c0807.f3417) {
                    switch (C21975.f71283[enumC10297Mo5435.ordinal()]) {
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
                if (z && c0807.f3416.m7429(interfaceC18735.mo1183()) && c0807.f3420.m7429(interfaceC18735.getName()) && c0807.f3414.m7429(interfaceC18735.getType())) {
                    C18447 c18448 = new C18447();
                    c18448.f58805 = true;
                    return c18448;
                }
            }
        }
        return null;
    }
}
