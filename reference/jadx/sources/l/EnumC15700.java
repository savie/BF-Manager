package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9J1 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15700 {
    UNKNOWN(0),
    SMB_2_0_2(514),
    SMB_2_1(528),
    SMB_2XX(767),
    SMB_3_0(768),
    SMB_3_0_2(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB_3_1_1(785);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51024;

    EnumC15700(int i) {
        this.f51024 = i;
    }

    public int getValue() {
        return this.f51024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m37476() {
        return this == SMB_3_0 || this == SMB_3_0_2 || this == SMB_3_1_1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37474(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((EnumC15700) it.next()).m37476()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15700 m37473(int i) {
        for (EnumC15700 enumC15700 : values()) {
            if (enumC15700.getValue() == i) {
                return enumC15700;
            }
        }
        throw new IllegalStateException(C13645.m33382(i, "Unknown SMB2 Dialect: "));
    }
}
