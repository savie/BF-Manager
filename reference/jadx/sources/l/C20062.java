package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAQ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20062 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64213;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f64214 = Collections.EMPTY_LIST;

    public C20062() {
        this.f64213 = C6696.m18084() && !C6983.m18764();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45431() {
        if (this.f64213) {
            this.f64214 = C2462.m7539();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45432(AbstractC20745 abstractC20745, EnumC11636 enumC11636) {
        C4579 c4579M12724 = C4579.m12724(abstractC20745, enumC11636);
        if (c4579M12724 == null) {
            return;
        }
        m45434(c4579M12724);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45433(AbstractC20745 abstractC20745, EnumC11636 enumC11636, AbstractC20745 abstractC20746, EnumC11636 enumC11637) {
        C4579 c4579M12724 = C4579.m12724(abstractC20745, enumC11636);
        C4579 c4579M12725 = C4579.m12724(abstractC20746, enumC11637);
        if (c4579M12724 == null && c4579M12725 == null) {
            return;
        }
        m45434(c4579M12724, c4579M12725);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45434(C4579... c4579Arr) {
        C13753 c13753M45430;
        String strM18172;
        C13753 c13753M45431;
        if (this.f64213) {
            HashSet<C13753> hashSet = new HashSet(c4579Arr.length);
            HashSet<C13753> hashSet2 = new HashSet(c4579Arr.length);
            for (C4579 c4579 : c4579Arr) {
                if (c4579 != null) {
                    String strM956 = c4579.f16231;
                    EnumC11636 enumC11636 = c4579.f16232;
                    if (enumC11636.f39090) {
                        ArrayList arrayList = C2462.f9811;
                        try {
                            strM956 = C0055.m956(strM956);
                        } catch (IOException unused) {
                        }
                    }
                    String strM45052 = C19812.m45052(strM956);
                    if (C2462.m7544(C5553.m15313(strM45052, new String[0])) && (c13753M45430 = m45430(strM45052)) != null && !c13753M45430.f45345) {
                        hashSet.add(c13753M45430);
                        if (enumC11636.f39091 && (strM18172 = C6730.m18172(strM45052)) != null && (c13753M45431 = m45430(strM18172)) != null && !c13753M45431.f45345 && !c13753M45431.equals(c13753M45430)) {
                            hashSet2.add(c13753M45431);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            for (C13753 c13753 : hashSet) {
                C6696.m18091(c13753);
                c13753.f45345 = true;
            }
            for (C13753 c13754 : hashSet2) {
                C6696.m18091(c13754);
                c13754.f45345 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13753 m45430(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C13753 c13753 : this.f64214) {
            if (lowerCase.startsWith(c13753.f45346)) {
                return c13753;
            }
        }
        return null;
    }
}
