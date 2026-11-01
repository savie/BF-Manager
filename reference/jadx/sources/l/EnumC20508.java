package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9J1 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20508 {
    UNKNOWN(0),
    SMB_2_0_2(514),
    SMB_2_1(528),
    SMB_2XX(767),
    SMB_3_0(768),
    SMB_3_0_2(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB_3_1_1(785);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f66483;

    EnumC20508(int i) {
        this.f66483 = i;
    }

    public int getValue() {
        return this.f66483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m46306() {
        return this == SMB_3_0 || this == SMB_3_0_2 || this == SMB_3_1_1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46304(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((EnumC20508) it.next()).m46306()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20508 m46303(int i) {
        for (EnumC20508 enumC20508 : values()) {
            if (enumC20508.getValue() == i) {
                return enumC20508;
            }
        }
        throw new IllegalStateException(C8479.m22141(i, "Unknown SMB2 Dialect: "));
    }
}
