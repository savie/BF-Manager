package l;

import android.widget.ListAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14994 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10055 f48922;

    public C14994(ActivityC10055 activityC10055) {
        this.f48922 = activityC10055;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f48922, R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C2292 c2292;
        Iterator it;
        Iterator it2;
        Map map;
        InterfaceC12078 interfaceC12078;
        C11466 c11466;
        ActivityC10055.f34354.mo24647();
        ActivityC10055.f34354.m46739();
        ActivityC10055 activityC10055 = this.f48922;
        byte[] bArrM44470 = C19431.m44470(activityC10055.f34360.mo33970(), 0);
        C1493 c1493 = new C1493(bArrM44470);
        c1493.m5143();
        ActivityC10055.f34354.m46690("arsc").m46703(bArrM44470);
        C2292 c2293 = new C2292(c1493);
        Iterator it3 = c1493.mo17615().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC17721) it3.next()).mo19112().iterator();
            while (it4.hasNext()) {
                InterfaceC19133 interfaceC19133 = (InterfaceC19133) it4.next();
                String typeName = interfaceC19133.getTypeName();
                if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                    Iterator it5 = interfaceC19133.mo25271().iterator();
                    while (it5.hasNext()) {
                        InterfaceC12783 interfaceC12783 = (InterfaceC12783) it5.next();
                        String string = interfaceC12783.mo31747().toString();
                        C4409 c4409M7006 = c2293.m7006(string);
                        C7232 c7232 = (C7232) activityC10055.f34362.get(string);
                        String typeName2 = interfaceC12783.getType().getTypeName();
                        Iterator it6 = interfaceC12783.mo31746().iterator();
                        while (it6.hasNext()) {
                            InterfaceC3609 interfaceC3609 = (InterfaceC3609) it6.next();
                            int i = -1;
                            for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
                                int i2 = i + 1;
                                if (interfaceC9961.mo25185()) {
                                    c2292 = c2293;
                                    if (typeName2.equals("plurals")) {
                                        it = it3;
                                        int iMo25193 = interfaceC9961.mo25193();
                                        if (iMo25193 < 16777220 || iMo25193 > 16777225) {
                                        }
                                        string = string;
                                        it3 = it;
                                        string = string;
                                        c2293 = c2292;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC12783 = interfaceC12783;
                                        i = i2;
                                    } else {
                                        it = it3;
                                    }
                                    InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                                    if (interfaceC12078Mo25187.mo11445() || C6493.m17688(interfaceC12078Mo25187.getValue())) {
                                        it2 = it4;
                                        it5 = it5;
                                        it6 = it6;
                                    } else {
                                        it2 = it4;
                                        Map map2 = c4409M7006.f15703;
                                        if (!(map2 == null ? false : map2.containsKey(new C13583(interfaceC3609.mo10693(), i2)))) {
                                            string = string;
                                        }
                                        it3 = it;
                                        string = string;
                                        c2293 = c2292;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC12783 = interfaceC12783;
                                        i = i2;
                                    }
                                    if (c7232 == null) {
                                        activityC10055.f34361.add(string);
                                        c7232 = new C7232(interfaceC12783.mo31747().m37865());
                                        activityC10055.f34362.put(string, c7232);
                                    }
                                    C20638 c20638 = new C20638();
                                    c20638.f67202 = interfaceC3609.mo10693();
                                    c20638.f67203 = i2;
                                    c20638.f67204 = interfaceC3609.mo7645();
                                    if (typeName2.equals("array")) {
                                        c20638.f67204 = "array:" + c20638.f67204 + "[" + i2 + "]";
                                    } else {
                                        if (typeName2.equals("plurals")) {
                                            int iMo25194 = interfaceC9961.mo25193() - 16777220;
                                            StringBuilder sb = new StringBuilder("plurals:");
                                            sb.append(c20638.f67204);
                                            sb.append("[");
                                            c20638.f67204 = C22697.m50267(sb, InterfaceC9961.f34034[iMo25194], "]");
                                        }
                                        if (c4409M7006.f15703 != null) {
                                            c11466 = (C11466) c4409M7006.f15703.get(new C13583(interfaceC3609.mo10693(), i2));
                                            if (c11466 == null && interfaceC12078Mo25187.equals(c11466.f38604)) {
                                                interfaceC12078 = c11466.f38603;
                                            } else {
                                                interfaceC12078 = null;
                                            }
                                        } else {
                                            map = c4409M7006.f15704;
                                            if (map != null) {
                                                interfaceC12078 = (InterfaceC12078) map.get(interfaceC12078Mo25187);
                                            } else {
                                                interfaceC12078 = null;
                                            }
                                        }
                                        if (interfaceC12078 != null) {
                                            c20638.f67205 = new C19933(interfaceC12078).m45231();
                                            c20638.f67201 = new C19933(interfaceC12078Mo25187).m45231();
                                        } else {
                                            c20638.f67205 = new C19933(interfaceC12078Mo25187).m45231();
                                        }
                                        c7232.add(c20638);
                                        it3 = it;
                                        string = string;
                                        c2293 = c2292;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC12783 = interfaceC12783;
                                        i = i2;
                                    }
                                    if (c4409M7006.f15703 != null) {
                                        c11466 = (C11466) c4409M7006.f15703.get(new C13583(interfaceC3609.mo10693(), i2));
                                        if (c11466 == null) {
                                            interfaceC12078 = null;
                                        } else {
                                            interfaceC12078 = null;
                                        }
                                    } else {
                                        map = c4409M7006.f15704;
                                        if (map != null) {
                                            interfaceC12078 = (InterfaceC12078) map.get(interfaceC12078Mo25187);
                                        } else {
                                            interfaceC12078 = null;
                                        }
                                    }
                                    if (interfaceC12078 != null) {
                                        c20638.f67205 = new C19933(interfaceC12078).m45231();
                                        c20638.f67201 = new C19933(interfaceC12078Mo25187).m45231();
                                    } else {
                                        c20638.f67205 = new C19933(interfaceC12078Mo25187).m45231();
                                    }
                                    c7232.add(c20638);
                                    it3 = it;
                                    string = string;
                                    c2293 = c2292;
                                    it4 = it2;
                                    it5 = it5;
                                    it6 = it6;
                                    interfaceC12783 = interfaceC12783;
                                    i = i2;
                                } else {
                                    c2292 = c2293;
                                    it = it3;
                                }
                                it2 = it4;
                                it5 = it5;
                                it6 = it6;
                                string = string;
                                it3 = it;
                                string = string;
                                c2293 = c2292;
                                it4 = it2;
                                it5 = it5;
                                it6 = it6;
                                interfaceC12783 = interfaceC12783;
                                i = i2;
                            }
                        }
                    }
                }
                it3 = it3;
                c2293 = c2293;
                it4 = it4;
            }
        }
        Collections.sort(activityC10055.f34361);
        Iterator it7 = activityC10055.f34362.values().iterator();
        int i3 = 0;
        while (it7.hasNext()) {
            ((C7232) it7.next()).m19263(ActivityC10055.f34354.m46690(String.valueOf(i3)));
            i3++;
        }
        activityC10055.f34355 = activityC10055.m25451();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC10055 activityC10055 = this.f48922;
        activityC10055.f34357.setAdapter((ListAdapter) new C7938(activityC10055));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f48922.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
