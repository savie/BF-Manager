package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18339 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f59808;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18339(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(activityC22598, -1);
        this.f59808 = activityC22597;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC22597.f73045 = m22914();
        String strTrim = ActivityC22597.f73045.toLowerCase().trim();
        if (strTrim.length() > 0) {
            if (strTrim.startsWith("@") || strTrim.startsWith("?")) {
                strTrim = strTrim.substring(1);
            } else if (strTrim.startsWith("0x")) {
                strTrim = strTrim.substring(2);
            }
            if (!C11730.m29453(strTrim)) {
                m22952(R.string.MT_Protector);
                return;
            }
            int iM29456 = C11730.m29456(strTrim);
            int i = (iM29456 >>> 24) & 255;
            int i2 = (iM29456 >>> 16) & 255;
            int i3 = iM29456 & 65535;
            ActivityC22597 activityC22597 = this.f59808;
            for (InterfaceC10869 interfaceC10869 : activityC22597.f73046.f33797.mo15672()) {
                if (interfaceC10869.mo27607() == i) {
                    for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                        if (interfaceC15344.mo35833() == i2) {
                            Iterator it = interfaceC15344.mo33925().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC8697 interfaceC8697 : ((InterfaceC2731) it.next()).mo9078()) {
                                    if (interfaceC8697.mo23383() == i3) {
                                        activityC22597.f73046.f33799.add((C13304) interfaceC8697);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            activityC22597.setTitle(ActivityC22597.f73045);
            activityC22597.m50915(EnumC3951.SEARCH_BY_ID);
            m22951();
        }
    }
}
