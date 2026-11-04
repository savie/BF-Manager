package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C21851 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f69617;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21851(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(R.layout.MT_Protector, activityC22598, "arsc_search_resource");
        this.f69617 = activityC22597;
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo975(String str, String str2, boolean z) {
        ActivityC22597 activityC22597 = this.f69617;
        activityC22597.f73046.f33809 = str2;
        if (z) {
            String lowerCase = str.toLowerCase();
            Iterator it = activityC22597.f73046.f33797.mo15672().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C25239) it.next()).mo19822().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((C23747) it2.next()).mo33925().iterator();
                    while (it3.hasNext()) {
                        for (C13304 c13304 : ((C20017) it3.next()).mo9078()) {
                            for (C3609 c3609 : c13304.values()) {
                                if (c3609.mo16636() && c3609.mo11710().getValue().toLowerCase().contains(lowerCase)) {
                                    activityC22597.f73046.f33802.add(new C15883(c13304, c3609));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        int i = (int) Long.parseLong(str);
        Iterator it4 = activityC22597.f73046.f33797.mo15672().iterator();
        while (it4.hasNext()) {
            for (C23747 c23747 : ((C25239) it4.next()).mo19822()) {
                boolean zEquals = c23747.getTypeName().equals("style");
                Iterator it5 = c23747.mo33925().iterator();
                while (it5.hasNext()) {
                    for (C13304 c13305 : ((C20017) it5.next()).mo9078()) {
                        boolean zMo18155 = c13305.mo18155();
                        if (zEquals && zMo18155 && c13305.getParent() == i) {
                            C15883 c15883 = new C15883(c13305, null);
                            c15883.f51649 = activityC22597.getString(R.string.MT_Protector) + ": " + String.format("%08X", Integer.valueOf(i));
                            activityC22597.f73046.f33802.add(c15883);
                        }
                        Iterator it6 = c13305.values().iterator();
                        while (it6.hasNext()) {
                            C3609 c36010 = (C3609) it6.next();
                            int iMo16635 = c36010.mo16635();
                            Iterator it7 = it6;
                            if ((iMo16635 == 2 || iMo16635 == 1 || iMo16635 == 8 || iMo16635 == 7 || (iMo16635 >= 16 && iMo16635 <= 31)) && c36010.getValue() == i) {
                                activityC22597.f73046.f33802.add(new C15883(c13305, c36010));
                                break;
                            }
                            if (zMo18155 && c36010.mo16637() == i) {
                                C15883 c15884 = new C15883(c13305, null);
                                c15884.f51649 = activityC22597.getString(R.string.arsc_value_id) + ": " + String.format("%08X", Integer.valueOf(i));
                                activityC22597.f73046.f33802.add(c15884);
                                break;
                            }
                            it6 = it7;
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC0057
    /* JADX INFO: renamed from: ۙ */
    public final void mo974() {
        ActivityC22597 activityC22597 = this.f69617;
        activityC22597.setTitle(activityC22597.f73046.f33809);
        activityC22597.m50915(EnumC3951.SEARCH_VALUE);
    }
}
