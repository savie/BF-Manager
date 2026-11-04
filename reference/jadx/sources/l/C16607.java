package l;

import android.widget.ListAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16607 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6167 f53712;

    public C16607(ActivityC6167 activityC6167) {
        this.f53712 = activityC6167;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f53712, R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C22575 c22575;
        Iterator it;
        Iterator it2;
        Map map;
        InterfaceC16090 interfaceC16090;
        C10640 c10640;
        ActivityC6167.f21006.mo4296();
        ActivityC6167.f21006.m49853();
        ActivityC6167 activityC6167 = this.f53712;
        byte[] bArrM46522 = C20244.m46522(activityC6167.f21008.mo4290(), 0);
        C24296 c24296 = new C24296(bArrM46522);
        c24296.m54314();
        ActivityC6167.f21006.m49876("arsc").m49849(bArrM46522);
        C22575 c22576 = new C22575(c24296);
        Iterator it3 = c24296.mo15672().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC10869) it3.next()).mo19822().iterator();
            while (it4.hasNext()) {
                InterfaceC15344 interfaceC15344 = (InterfaceC15344) it4.next();
                String typeName = interfaceC15344.getTypeName();
                if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                    Iterator it5 = interfaceC15344.mo33925().iterator();
                    while (it5.hasNext()) {
                        InterfaceC2731 interfaceC2731 = (InterfaceC2731) it5.next();
                        String string = interfaceC2731.mo9073().toString();
                        C4675 c4675M50897 = c22576.m50897(string);
                        C24067 c24067 = (C24067) activityC6167.f21014.get(string);
                        String typeName2 = interfaceC2731.getType().getTypeName();
                        Iterator it6 = interfaceC2731.mo9078().iterator();
                        while (it6.hasNext()) {
                            InterfaceC8697 interfaceC8697 = (InterfaceC8697) it6.next();
                            int i = -1;
                            for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
                                int i2 = i + 1;
                                if (interfaceC5650.mo16636()) {
                                    c22575 = c22576;
                                    if (typeName2.equals("plurals")) {
                                        it = it3;
                                        int iMo16637 = interfaceC5650.mo16637();
                                        if (iMo16637 < 16777220 || iMo16637 > 16777225) {
                                        }
                                        string = string;
                                        it3 = it;
                                        string = string;
                                        c22576 = c22575;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC2731 = interfaceC2731;
                                        i = i2;
                                    } else {
                                        it = it3;
                                    }
                                    InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                                    if (interfaceC16090Mo11710.mo8825() || C1942.m6727(interfaceC16090Mo11710.getValue())) {
                                        it2 = it4;
                                        it5 = it5;
                                        it6 = it6;
                                    } else {
                                        it2 = it4;
                                        Map map2 = c4675M50897.f16503;
                                        if (!(map2 == null ? false : map2.containsKey(new C21829(interfaceC8697.mo23384(), i2)))) {
                                            string = string;
                                        }
                                        it3 = it;
                                        string = string;
                                        c22576 = c22575;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC2731 = interfaceC2731;
                                        i = i2;
                                    }
                                    if (c24067 == null) {
                                        activityC6167.f21011.add(string);
                                        c24067 = new C24067(interfaceC2731.mo9073().m47027());
                                        activityC6167.f21014.put(string, c24067);
                                    }
                                    C3929 c3929 = new C3929();
                                    c3929.f13415 = interfaceC8697.mo23384();
                                    c3929.f13417 = i2;
                                    c3929.f13416 = interfaceC8697.mo18156();
                                    if (typeName2.equals("array")) {
                                        c3929.f13416 = "array:" + c3929.f13416 + "[" + i2 + "]";
                                    } else {
                                        if (typeName2.equals("plurals")) {
                                            int iMo16638 = interfaceC5650.mo16637() - 16777220;
                                            StringBuilder sb = new StringBuilder("plurals:");
                                            sb.append(c3929.f13416);
                                            sb.append("[");
                                            c3929.f13416 = C8947.m23910(sb, InterfaceC5650.f19517[iMo16638], "]");
                                        }
                                        if (c4675M50897.f16503 != null) {
                                            c10640 = (C10640) c4675M50897.f16503.get(new C21829(interfaceC8697.mo23384(), i2));
                                            if (c10640 == null && interfaceC16090Mo11710.equals(c10640.f33745)) {
                                                interfaceC16090 = c10640.f33744;
                                            } else {
                                                interfaceC16090 = null;
                                            }
                                        } else {
                                            map = c4675M50897.f16504;
                                            if (map != null) {
                                                interfaceC16090 = (InterfaceC16090) map.get(interfaceC16090Mo11710);
                                            } else {
                                                interfaceC16090 = null;
                                            }
                                        }
                                        if (interfaceC16090 != null) {
                                            c3929.f13418 = new C21083(interfaceC16090).m48145();
                                            c3929.f13419 = new C21083(interfaceC16090Mo11710).m48145();
                                        } else {
                                            c3929.f13418 = new C21083(interfaceC16090Mo11710).m48145();
                                        }
                                        c24067.add(c3929);
                                        it3 = it;
                                        string = string;
                                        c22576 = c22575;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC2731 = interfaceC2731;
                                        i = i2;
                                    }
                                    if (c4675M50897.f16503 != null) {
                                        c10640 = (C10640) c4675M50897.f16503.get(new C21829(interfaceC8697.mo23384(), i2));
                                        if (c10640 == null) {
                                            interfaceC16090 = null;
                                        } else {
                                            interfaceC16090 = null;
                                        }
                                    } else {
                                        map = c4675M50897.f16504;
                                        if (map != null) {
                                            interfaceC16090 = (InterfaceC16090) map.get(interfaceC16090Mo11710);
                                        } else {
                                            interfaceC16090 = null;
                                        }
                                    }
                                    if (interfaceC16090 != null) {
                                        c3929.f13418 = new C21083(interfaceC16090).m48145();
                                        c3929.f13419 = new C21083(interfaceC16090Mo11710).m48145();
                                    } else {
                                        c3929.f13418 = new C21083(interfaceC16090Mo11710).m48145();
                                    }
                                    c24067.add(c3929);
                                    it3 = it;
                                    string = string;
                                    c22576 = c22575;
                                    it4 = it2;
                                    it5 = it5;
                                    it6 = it6;
                                    interfaceC2731 = interfaceC2731;
                                    i = i2;
                                } else {
                                    c22575 = c22576;
                                    it = it3;
                                }
                                it2 = it4;
                                it5 = it5;
                                it6 = it6;
                                string = string;
                                it3 = it;
                                string = string;
                                c22576 = c22575;
                                it4 = it2;
                                it5 = it5;
                                it6 = it6;
                                interfaceC2731 = interfaceC2731;
                                i = i2;
                            }
                        }
                    }
                }
                it3 = it3;
                c22576 = c22576;
                it4 = it4;
            }
        }
        Collections.sort(activityC6167.f21011);
        Iterator it7 = activityC6167.f21014.values().iterator();
        int i3 = 0;
        while (it7.hasNext()) {
            ((C24067) it7.next()).m53618(ActivityC6167.f21006.m49876(String.valueOf(i3)));
            i3++;
        }
        activityC6167.f21010 = activityC6167.m17762();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC6167 activityC6167 = this.f53712;
        activityC6167.f21007.setAdapter((ListAdapter) new C3183(activityC6167));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f53712.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
