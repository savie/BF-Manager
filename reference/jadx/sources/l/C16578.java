package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16578 extends AbstractC9781 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53652;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14340 f53653;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6138 f53654;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16578(ActivityC6138 activityC6138, ActivityC6138 activityC6139, int i, C14340 c14340) {
        super(activityC6139);
        this.f53654 = activityC6138;
        this.f53652 = i;
        this.f53653 = c14340;
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        int iM19160;
        C1626 c1626M25516 = m25516(0);
        C1626 c1626M25517 = m25516(1);
        C23255 c23255M5756 = c1626M25516.m5756();
        C17359.requireNonNull(c23255M5756);
        C23255 c23255M5757 = c1626M25517.m5756();
        C17359.requireNonNull(c23255M5757);
        String string = c23255M5756.m54021().toString();
        String string2 = c23255M5757.m54021().toString();
        if (string.isEmpty() && string2.isEmpty()) {
            return true;
        }
        boolean zIsEmpty = string.isEmpty();
        ActivityC6138 activityC6138 = this.f53654;
        if (zIsEmpty) {
            c1626M25516.m5768(activityC6138.getString(R.string.MT_Protector));
            iM19160 = C6907.m19160(8.0f);
        } else {
            int size = activityC6138.f20956.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (string.equals(((C14340) activityC6138.f20956.get(i)).f45235)) {
                    break;
                }
                i++;
            }
            int i2 = this.f53652;
            if (i != -1 && i != i2) {
                c1626M25516.m5768(activityC6138.getString(R.string.MT_Protector));
                iM19160 = C6907.m19160(8.0f);
            } else {
                if (i2 == -1) {
                    activityC6138.f20956.add(new C14340(string, string2));
                    activityC6138.f20958.notifyItemInserted(activityC6138.f20956.size() - 1);
                } else {
                    C14340 c14340 = this.f53653;
                    c14340.f45235 = string;
                    c14340.f45234 = string2;
                    activityC6138.f20958.notifyItemChanged(i2);
                }
                C21054.m48116();
                return true;
            }
        }
        C0385.m2188(c1626M25517, -1, iM19160, -1, -1);
        return false;
    }
}
