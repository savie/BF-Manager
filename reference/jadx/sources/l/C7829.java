package l;

/* JADX INFO: renamed from: l.۠֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G5PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7829 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20654(C13825 c13825, C18412 c18412) {
        int i;
        boolean z;
        while (true) {
            int iM33639 = c13825.m33639();
            boolean z2 = false;
            switch (c13825.m33645()) {
                case 0:
                    c18412.getClass();
                    EnumC19118 enumC19118 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, 1);
                    return;
                case 1:
                    c13825.m33647();
                    int iM336310 = c13825.m33639() - iM33639;
                    c18412.getClass();
                    EnumC19118 enumC19119 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, iM336310);
                    break;
                case 2:
                    c13825.m33641();
                    int iM336311 = c13825.m33639() - iM33639;
                    c18412.getClass();
                    EnumC19118 enumC191110 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, iM336311);
                    break;
                case 3:
                    int iM33637 = c13825.m33637();
                    if (iM33637 < 0) {
                        iM33637 = ~iM33637;
                        z2 = true;
                    }
                    c18412.mo19018(iM33637, c13825.m33647() - 1, c13825.m33647() - 1, z2);
                    break;
                case 4:
                    int iM33638 = c13825.m33637();
                    if (iM33638 < 0) {
                        i = ~iM33638;
                        z = true;
                    } else {
                        i = iM33638;
                        z = false;
                    }
                    c18412.mo19017(i, c13825.m33647() - 1, c13825.m33647() - 1, c13825.m33647() - 1, z);
                    break;
                case 5:
                    c13825.m33637();
                    int iM336312 = c13825.m33639() - iM33639;
                    c18412.getClass();
                    EnumC19118 enumC191111 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, iM336312);
                    break;
                case 6:
                    c13825.m33637();
                    int iM336313 = c13825.m33639() - iM33639;
                    c18412.getClass();
                    EnumC19118 enumC191112 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, iM336313);
                    break;
                case 7:
                    c18412.getClass();
                    EnumC19118 enumC191113 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, 1);
                    break;
                case 8:
                    c18412.getClass();
                    EnumC19118 enumC191114 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, 1);
                    break;
                case 9:
                    c18412.mo19015(c13825.m33647());
                    break;
                default:
                    c18412.getClass();
                    EnumC19118 enumC191115 = EnumC19118.DBG_END_SEQUENCE;
                    c18412.mo19016(iM33639, 1);
                    break;
            }
        }
    }
}
