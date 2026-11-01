package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9X6 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16245 {
    SMB1,
    SMB202(514),
    SMB210(528),
    SMB300(768),
    SMB302(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB311(785);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f52398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f52399;

    EnumC16245() {
        this.f52399 = false;
        this.f52398 = -1;
    }

    EnumC16245(int i) {
        this.f52399 = true;
        this.f52398 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38367() {
        return this.f52399;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38365() {
        if (!this.f52399) {
            throw new UnsupportedOperationException();
        }
        return this.f52398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m38366(EnumC16245 enumC16245) {
        return ordinal() >= enumC16245.ordinal();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m38368(EnumC16245 enumC16245) {
        return ordinal() <= enumC16245.ordinal();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC16245 m38364(EnumC16245 enumC16245, EnumC16245 enumC16246) {
        return enumC16245.m38368(enumC16246) ? enumC16245 : enumC16246;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16245 m38361(EnumC16245 enumC16245, EnumC16245 enumC16246) {
        return enumC16245.m38366(enumC16246) ? enumC16245 : enumC16246;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Set m38363(EnumC16245 enumC16245, EnumC16245 enumC16246) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC16245.class);
        for (EnumC16245 enumC16247 : values()) {
            if ((enumC16245 == null || enumC16247.m38366(enumC16245)) && (enumC16246 == null || enumC16247.m38368(enumC16246))) {
                enumSetNoneOf.add(enumC16247);
            }
        }
        return enumSetNoneOf;
    }
}
