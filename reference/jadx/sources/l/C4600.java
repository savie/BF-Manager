package l;

/* JADX INFO: renamed from: l.ۙۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4600 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14407(C4028 c4028, C13744 c13744) {
        int i;
        boolean z;
        while (true) {
            int iM12992 = c4028.m12992();
            boolean z2 = false;
            switch (c4028.m13000()) {
                case 0:
                    c13744.getClass();
                    EnumC21754 enumC21754 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, 1);
                    return;
                case 1:
                    c4028.m12998();
                    int iM12993 = c4028.m12992() - iM12992;
                    c13744.getClass();
                    EnumC21754 enumC21755 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, iM12993);
                    break;
                case 2:
                    c4028.m12999();
                    int iM12994 = c4028.m12992() - iM12992;
                    c13744.getClass();
                    EnumC21754 enumC21756 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, iM12994);
                    break;
                case 3:
                    int iM12997 = c4028.m12997();
                    if (iM12997 < 0) {
                        iM12997 = ~iM12997;
                        z2 = true;
                    }
                    c13744.mo27027(iM12997, c4028.m12998() - 1, c4028.m12998() - 1, z2);
                    break;
                case 4:
                    int iM12998 = c4028.m12997();
                    if (iM12998 < 0) {
                        i = ~iM12998;
                        z = true;
                    } else {
                        i = iM12998;
                        z = false;
                    }
                    c13744.mo27026(i, c4028.m12998() - 1, c4028.m12998() - 1, c4028.m12998() - 1, z);
                    break;
                case 5:
                    c4028.m12997();
                    int iM12995 = c4028.m12992() - iM12992;
                    c13744.getClass();
                    EnumC21754 enumC21757 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, iM12995);
                    break;
                case 6:
                    c4028.m12997();
                    int iM12996 = c4028.m12992() - iM12992;
                    c13744.getClass();
                    EnumC21754 enumC21758 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, iM12996);
                    break;
                case 7:
                    c13744.getClass();
                    EnumC21754 enumC21759 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, 1);
                    break;
                case 8:
                    c13744.getClass();
                    EnumC21754 enumC217510 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, 1);
                    break;
                case 9:
                    c13744.mo27025(c4028.m12998());
                    break;
                default:
                    c13744.getClass();
                    EnumC21754 enumC217511 = EnumC21754.DBG_END_SEQUENCE;
                    c13744.mo33592(iM12992, 1);
                    break;
            }
        }
    }
}
