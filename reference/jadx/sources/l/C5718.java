package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5718 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f19484;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5718(ActivityC13125 activityC13125, ActivityC13125 activityC13126) {
        super(activityC13126, -1);
        this.f19484 = activityC13125;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC13125.f43709 = m40352();
        String strTrim = ActivityC13125.f43709.toLowerCase().trim();
        if (strTrim.length() > 0) {
            if (strTrim.startsWith("@") || strTrim.startsWith("?")) {
                strTrim = strTrim.substring(1);
            } else if (strTrim.startsWith("0x")) {
                strTrim = strTrim.substring(2);
            }
            if (!C6461.m17648(strTrim)) {
                m40365(R.string.MT_Protector);
                return;
            }
            int iM17654 = C6461.m17654(strTrim);
            int i = (iM17654 >>> 24) & 255;
            int i2 = (iM17654 >>> 16) & 255;
            int i3 = iM17654 & 65535;
            ActivityC13125 activityC13125 = this.f19484;
            for (InterfaceC17721 interfaceC17721 : activityC13125.f43713.f5091.mo17615()) {
                if (interfaceC17721.mo19106() == i) {
                    for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                        if (interfaceC19133.mo26942() == i2) {
                            Iterator it = interfaceC19133.mo25271().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC3609 interfaceC3609 : ((InterfaceC12783) it.next()).mo31746()) {
                                    if (interfaceC3609.mo10691() == i3) {
                                        activityC13125.f43713.f5096.add((C18551) interfaceC3609);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            activityC13125.setTitle(ActivityC13125.f43709);
            activityC13125.m32482(EnumC16653.SEARCH_BY_ID);
            m40364();
        }
    }
}
