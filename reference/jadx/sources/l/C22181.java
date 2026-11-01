package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C22181 extends EnumC1719 {
    public /* synthetic */ C22181() {
        this("InTableText", 9);
    }

    public C22181(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.f69910 == EnumC15167.Character) {
            C5288 c5288 = (C5288) abstractC21516;
            if (c5288.m14653().equals(EnumC1719.f6819)) {
                c5247.m14466(this);
                return false;
            }
            ((ArrayList) c5247.m14497()).add(c5288.m14653());
            return true;
        }
        if (((ArrayList) c5247.m14497()).size() > 0) {
            for (String str : (ArrayList) c5247.m14497()) {
                if (!EnumC1719.m5735(str)) {
                    c5247.m14466(this);
                    if (C4145.m11787(c5247.m44834().m2833(), C14421.f47264)) {
                        c5247.m14487(true);
                        C5288 c5289 = new C5288();
                        c5289.m14654(str);
                        c5247.m14470(c5289, EnumC1719.f6813);
                        c5247.m14487(false);
                    } else {
                        C5288 c52810 = new C5288();
                        c52810.m14654(str);
                        c5247.m14470(c52810, EnumC1719.f6813);
                    }
                } else {
                    C5288 c52811 = new C5288();
                    c52811.m14654(str);
                    c5247.m14467(c52811);
                }
            }
            c5247.m14482();
        }
        c5247.m14486(c5247.m14504());
        return c5247.mo14473(abstractC21516);
    }
}
