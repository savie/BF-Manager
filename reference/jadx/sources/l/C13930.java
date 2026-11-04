package l;

import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final class C13930 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11562 f44163;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11562 f44164;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11562 f44166;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f44169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1122 f44171;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f44167 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44170 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f44165 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC16110 f44168 = EnumC16110.UNKNOWN_TYPE;

    public C13930(C1122 c1122, boolean z) {
        this.f44171 = c1122;
        this.f44169 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33916(C13930 c13930) {
        this.f44165 = c13930 == null ? this.f44170 : (this.f44170 - c13930.f44170) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33913(int i) {
        this.f44165 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33921(int i) {
        this.f44170 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33915(String str) {
        C17359.requireNonNull(str, new Supplier() { // from class: l.ۡܳ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                Object[] objArr = {"String stackFrameType"};
                ((C4728) this.f30656.f44171.m32312()).getClass();
                return AbstractC3236.m10580("Fatal Error: Object reference \"{0}\" is null", objArr);
            }
        });
        EnumC16110 enumC16110M38270 = EnumC16110.m38270(str);
        this.f44168 = enumC16110M38270;
        if (enumC16110M38270 == EnumC16110.UNKNOWN_TYPE) {
            this.f44171.mo4159(this.f44167, "Unknown entry type \"{0}\" of the StackMapTable", str);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33917(int i) {
        EnumC16110 enumC16110M38271 = EnumC16110.m38271(i);
        this.f44168 = enumC16110M38271;
        if (enumC16110M38271 == EnumC16110.SAME_FRAME) {
            this.f44165 = i;
            return;
        }
        EnumC16110 enumC16110 = EnumC16110.SAME_LOCALS_1_STACK_ITEM_FRAME;
        if (enumC16110M38271 == enumC16110) {
            this.f44165 = i - enumC16110.m38275();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33914(long j) {
        this.f44167 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m33918() {
        if (this.f44169) {
            return this.f44168 != EnumC16110.UNKNOWN_TYPE;
        }
        return this.f44170 != -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m33919() {
        return this.f44169 && this.f44168 == EnumC16110.EARLY_LARVAL;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6416() {
        return !m33919();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5202 m33912() {
        switch (C2744.f9103[this.f44168.ordinal()]) {
            case 2:
                if (m33911(this.f44164)) {
                    return null;
                }
                return EnumC5202.f18260;
            case 3:
                if (m33911(this.f44166)) {
                    return null;
                }
                return EnumC5202.f18143;
            case 4:
                if (this.f44165 == -1) {
                    return EnumC5202.f18262;
                }
                if (m33911(this.f44164)) {
                    return null;
                }
                return EnumC5202.f18260;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f44165 == -1) {
                    return EnumC5202.f18262;
                }
                return null;
            case 9:
                if (this.f44165 == -1) {
                    return EnumC5202.f18262;
                }
                if (m33911(this.f44163)) {
                    return null;
                }
                return EnumC5202.f18310;
            case 10:
                if (this.f44165 == -1) {
                    return EnumC5202.f18262;
                }
                if (!m33911(this.f44163)) {
                    return EnumC5202.f18310;
                }
                if (m33911(this.f44164)) {
                    return null;
                }
                return EnumC5202.f18260;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33911(C11562... c11562Arr) {
        for (C11562 c11562 : c11562Arr) {
            if (c11562 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        int iM29083;
        int iM29084;
        boolean zM33918 = m33918();
        boolean z = this.f44169;
        if (!zM33918 || !z) {
            this.f44168 = EnumC16110.FULL_FRAME;
        }
        int i = 0;
        switch (C2744.f9103[this.f44168.ordinal()]) {
            case 2:
                iM29083 = this.f44164.m29083() - 2;
                return iM29083 + (z ? 1 : 0);
            case 3:
                C11562 c11562 = this.f44166;
                if (c11562 != null) {
                    iM29084 = c11562.m29083();
                    i = iM29084 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 4:
                iM29083 = this.f44164.m29083();
                return iM29083 + (z ? 1 : 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return (z ? 1 : 0) + 2;
            case 9:
                C11562 c11563 = this.f44163;
                if (c11563 != null) {
                    iM29084 = c11563.m29083();
                    i = iM29084 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 10:
                int i2 = (z ? 1 : 0) + 2;
                C11562 c11564 = this.f44163;
                int iM29085 = i2 + (c11564 == null ? 2 : c11564.m29083());
                C11562 c11565 = this.f44164;
                return iM29085 + (c11565 != null ? c11565.m29083() : 2);
            default:
                return z ? 1 : 0;
        }
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        boolean z;
        boolean z2 = this.f44169;
        if (!z2) {
            this.f44168 = EnumC16110.FULL_FRAME;
        }
        int i = C2744.f9103[this.f44168.ordinal()];
        boolean z3 = true;
        C1122 c1122 = this.f44171;
        switch (i) {
            case 1:
                if (!EnumC16110.SAME_FRAME.m38276(this.f44165)) {
                    c1122.mo4159(this.f44167, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(this.f44165), this.f44168.m38274());
                } else {
                    ((C11388) interfaceC9397).m28735(this.f44165);
                }
                break;
            case 2:
                C11562 c11562 = this.f44164;
                if (c11562 == null) {
                    c1122.mo4159(this.f44167, "Stack map element for the \"{0}\" entry type is absent", this.f44168.m38274());
                } else if (c11562.f36349.size() != 1) {
                    c1122.mo4159(this.f44167, "Should be only one stack map element for the \"{0}\" entry type", this.f44168.m38274());
                } else {
                    int i2 = this.f44165;
                    if (i2 >= 64) {
                        c1122.mo4159(this.f44167, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(i2), this.f44168.m38274());
                    } else {
                        C11388 c11388 = (C11388) interfaceC9397;
                        c11388.m28735(this.f44168.m38275() + this.f44165);
                        this.f44164.m29084(c11388);
                    }
                }
                break;
            case 3:
                C11388 c11389 = (C11388) interfaceC9397;
                c11389.m28735(this.f44168.m38275());
                C11562 c11563 = this.f44166;
                if (c11563 == null) {
                    c11389.m28740(0);
                } else {
                    c11563.m29082(c11389);
                }
                break;
            case 4:
                C11562 c11564 = this.f44164;
                if (c11564 == null) {
                    c1122.mo4159(this.f44167, "Locals map element for the \"{0}\" entry type is absent", this.f44168.m38274());
                } else if (c11564.f36349.size() != 1) {
                    c1122.mo4159(this.f44167, "Should be only one stack map element for the \"{0}\" entry type", this.f44168.m38274());
                } else {
                    C11388 c113810 = (C11388) interfaceC9397;
                    c113810.m28735(this.f44168.m38275());
                    c113810.m28740(this.f44165);
                    this.f44164.m29084(c113810);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f44164 != null) {
                    c1122.mo4159(this.f44167, "There are unexpected stack maps for the \"{0}\" entry type", this.f44168.m38274());
                    z = true;
                } else {
                    z = false;
                }
                if (this.f44163 != null) {
                    c1122.mo4159(this.f44167, "There are unexpected locals maps for the \"{0}\" entry type", this.f44168.m38274());
                } else {
                    z3 = z;
                }
                if (!z3) {
                    C11388 c113811 = (C11388) interfaceC9397;
                    c113811.m28735(this.f44168.m38275());
                    c113811.m28740(this.f44165);
                    break;
                }
                break;
            case 9:
                C11562 c11565 = this.f44163;
                if (c11565 == null) {
                    c1122.mo4159(this.f44167, "Locals map element for the \"{0}\" entry type is absent", this.f44168.m38274());
                } else if (c11565.f36349.size() > 3) {
                    c1122.mo4159(this.f44167, "There are more than locals map elements for the \"append_frame\" entry type", new Object[0]);
                } else {
                    C11388 c113812 = (C11388) interfaceC9397;
                    c113812.m28735((this.f44163.f36349.size() + this.f44168.m38275()) - 1);
                    c113812.m28740(this.f44165);
                    this.f44163.m29084(c113812);
                }
                break;
            case 10:
                if (z2) {
                    C11388 c113813 = (C11388) interfaceC9397;
                    c113813.m28735(this.f44168.m38275());
                    c113813.m28740(this.f44165);
                } else {
                    ((C11388) interfaceC9397).m28740(this.f44170);
                }
                C11562 c11566 = this.f44163;
                if (c11566 == null) {
                    ((C11388) interfaceC9397).m28740(0);
                } else {
                    c11566.m29082(interfaceC9397);
                }
                C11562 c11567 = this.f44164;
                if (c11567 == null) {
                    ((C11388) interfaceC9397).m28740(0);
                } else {
                    c11567.m29082(interfaceC9397);
                }
                break;
            default:
                c1122.mo4159(this.f44167, "StackMap entry type is not set", Integer.valueOf(this.f44168.m38275()));
                break;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16110 m33920() {
        return this.f44168;
    }
}
