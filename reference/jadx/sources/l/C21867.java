package l;

/* JADX INFO: renamed from: l.᩷ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9HO */
/* JADX INFO: loaded from: classes.dex */
public final class C21867 extends C10678 {
    @Override // l.C10678, l.AbstractC12916
    /* JADX INFO: renamed from: ۙ */
    public final void mo27220(C18115 c18115) throws C15153 {
        if (c18115.m42236().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM42235 = c18115.m42235();
        if (iM42235 == 0) {
            m27223(c18115.m42236());
            return;
        }
        if (iM42235 != 1) {
            if (iM42235 == 2) {
                m27224(c18115.m42236());
            } else {
                if (iM42235 == 3 || iM42235 == 4) {
                    return;
                }
                throw new C15153("Unknown Object Tag " + c18115.m42235() + " encountered.");
            }
        }
    }
}
