package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22297 extends AbstractC17470 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f72838;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22297(ActivityC13125 activityC13125, ActivityC13125 activityC13126) {
        super(R.layout.MT_Protector, activityC13126, "arsc_search_resource");
        this.f72838 = activityC13125;
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ */
    public final void mo35373(String str, String str2, boolean z) {
        ActivityC13125 activityC13125 = this.f72838;
        activityC13125.f43713.f5089 = str2;
        if (z) {
            String lowerCase = str.toLowerCase();
            Iterator it = activityC13125.f43713.f5091.mo17615().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C7262) it.next()).mo19112().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((C0206) it2.next()).mo25271().iterator();
                    while (it3.hasNext()) {
                        for (C18551 c18551 : ((C21373) it3.next()).mo31746()) {
                            for (C16435 c16435 : c18551.values()) {
                                if (c16435.mo25185() && c16435.mo25187().getValue().toLowerCase().contains(lowerCase)) {
                                    activityC13125.f43713.f5081.add(new C8892(c18551, c16435));
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
        Iterator it4 = activityC13125.f43713.f5091.mo17615().iterator();
        while (it4.hasNext()) {
            for (C0206 c0206 : ((C7262) it4.next()).mo19112()) {
                boolean zEquals = c0206.getTypeName().equals("style");
                Iterator it5 = c0206.mo25271().iterator();
                while (it5.hasNext()) {
                    for (C18551 c18552 : ((C21373) it5.next()).mo31746()) {
                        boolean zMo7644 = c18552.mo7644();
                        if (zEquals && zMo7644 && c18552.getParent() == i) {
                            C8892 c8892 = new C8892(c18552, null);
                            c8892.f30482 = activityC13125.getString(R.string.MT_Protector) + ": " + String.format("%08X", Integer.valueOf(i));
                            activityC13125.f43713.f5081.add(c8892);
                        }
                        Iterator it6 = c18552.values().iterator();
                        while (it6.hasNext()) {
                            C16435 c16436 = (C16435) it6.next();
                            int iMo25192 = c16436.mo25192();
                            Iterator it7 = it6;
                            if ((iMo25192 == 2 || iMo25192 == 1 || iMo25192 == 8 || iMo25192 == 7 || (iMo25192 >= 16 && iMo25192 <= 31)) && c16436.getValue() == i) {
                                activityC13125.f43713.f5081.add(new C8892(c18552, c16436));
                                break;
                            }
                            if (zMo7644 && c16436.mo25193() == i) {
                                C8892 c8893 = new C8892(c18552, null);
                                c8893.f30482 = activityC13125.getString(R.string.arsc_value_id) + ": " + String.format("%08X", Integer.valueOf(i));
                                activityC13125.f43713.f5081.add(c8893);
                                break;
                            }
                            it6 = it7;
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC17470
    /* JADX INFO: renamed from: ۙ */
    public final void mo35372() {
        ActivityC13125 activityC13125 = this.f72838;
        activityC13125.setTitle(activityC13125.f43713.f5089);
        activityC13125.m32482(EnumC16653.SEARCH_VALUE);
    }
}
