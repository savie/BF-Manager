package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9X6 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC25270 {
    SMB1,
    SMB202(514),
    SMB210(528),
    SMB300(768),
    SMB302(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB311(785);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f81608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f81609;

    EnumC25270() {
        this.f81609 = false;
        this.f81608 = -1;
    }

    EnumC25270(int i) {
        this.f81609 = true;
        this.f81608 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m56408() {
        return this.f81609;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56405() {
        if (!this.f81609) {
            throw new UnsupportedOperationException();
        }
        return this.f81608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m56406(EnumC25270 enumC25270) {
        return ordinal() >= enumC25270.ordinal();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m56407(EnumC25270 enumC25270) {
        return ordinal() <= enumC25270.ordinal();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC25270 m56404(EnumC25270 enumC25270, EnumC25270 enumC25271) {
        return enumC25270.m56407(enumC25271) ? enumC25270 : enumC25271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC25270 m56401(EnumC25270 enumC25270, EnumC25270 enumC25271) {
        return enumC25270.m56406(enumC25271) ? enumC25270 : enumC25271;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Set m56402(EnumC25270 enumC25270, EnumC25270 enumC25271) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC25270.class);
        for (EnumC25270 enumC25272 : values()) {
            if ((enumC25270 == null || enumC25272.m56406(enumC25270)) && (enumC25271 == null || enumC25272.m56407(enumC25271))) {
                enumSetNoneOf.add(enumC25272);
            }
        }
        return enumSetNoneOf;
    }
}
