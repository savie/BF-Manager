package l;

import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۠ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes3.dex */
public final class C7903 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f25978;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C24027 f25980;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C24027 f25983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18111 f25985;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C24027 f25986;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f25979 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25984 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25981 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC1965 f25982 = EnumC1965.UNKNOWN_TYPE;

    public C7903(C18111 c18111, boolean z) {
        this.f25985 = c18111;
        this.f25978 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20914(C7903 c7903) {
        this.f25981 = c7903 == null ? this.f25984 : (this.f25984 - c7903.f25984) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20911(int i) {
        this.f25981 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20918(int i) {
        this.f25984 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20913(String str) {
        C13638.requireNonNull(str, new Supplier() { // from class: l.ܶۗۡ
            @Override // java.util.function.Supplier
            public final Object get() {
                Object[] objArr = {"String stackFrameType"};
                ((C8878) this.f48852.f25985.m2163()).getClass();
                return AbstractC9584.m24455("Fatal Error: Object reference \"{0}\" is null", objArr);
            }
        });
        EnumC1965 enumC1965M6334 = EnumC1965.m6334(str);
        this.f25982 = enumC1965M6334;
        if (enumC1965M6334 == EnumC1965.UNKNOWN_TYPE) {
            this.f25985.mo2149(this.f25979, "Unknown entry type \"{0}\" of the StackMapTable", str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20917(int i) {
        EnumC1965 enumC1965M6335 = EnumC1965.m6335(i);
        this.f25982 = enumC1965M6335;
        if (enumC1965M6335 == EnumC1965.SAME_FRAME) {
            this.f25981 = i;
            return;
        }
        EnumC1965 enumC1965 = EnumC1965.SAME_LOCALS_1_STACK_ITEM_FRAME;
        if (enumC1965M6335 == enumC1965) {
            this.f25981 = i - enumC1965.m6339();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20912(long j) {
        this.f25979 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m20909() {
        if (this.f25978) {
            return this.f25982 != EnumC1965.UNKNOWN_TYPE;
        }
        return this.f25984 != -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20915() {
        return this.f25978 && this.f25982 == EnumC1965.EARLY_LARVAL;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2342() {
        return !m20915();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20934 m20910() {
        switch (C21308.f69330[this.f25982.ordinal()]) {
            case 2:
                if (m20908(this.f25980)) {
                    return null;
                }
                return EnumC20934.f68051;
            case 3:
                if (m20908(this.f25986)) {
                    return null;
                }
                return EnumC20934.f68174;
            case 4:
                if (this.f25981 == -1) {
                    return EnumC20934.f68049;
                }
                if (m20908(this.f25980)) {
                    return null;
                }
                return EnumC20934.f68051;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f25981 == -1) {
                    return EnumC20934.f68049;
                }
                return null;
            case 9:
                if (this.f25981 == -1) {
                    return EnumC20934.f68049;
                }
                if (m20908(this.f25983)) {
                    return null;
                }
                return EnumC20934.f68068;
            case 10:
                if (this.f25981 == -1) {
                    return EnumC20934.f68049;
                }
                if (!m20908(this.f25983)) {
                    return EnumC20934.f68068;
                }
                if (m20908(this.f25980)) {
                    return null;
                }
                return EnumC20934.f68051;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20908(C24027... c24027Arr) {
        for (C24027 c24027 : c24027Arr) {
            if (c24027 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        int iM52873;
        int iM52874;
        boolean zM20909 = m20909();
        boolean z = this.f25978;
        if (!zM20909 || !z) {
            this.f25982 = EnumC1965.FULL_FRAME;
        }
        int i = 0;
        switch (C21308.f69330[this.f25982.ordinal()]) {
            case 2:
                iM52873 = this.f25980.m52873() - 2;
                return iM52873 + (z ? 1 : 0);
            case 3:
                C24027 c24027 = this.f25986;
                if (c24027 != null) {
                    iM52874 = c24027.m52873();
                    i = iM52874 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 4:
                iM52873 = this.f25980.m52873();
                return iM52873 + (z ? 1 : 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return (z ? 1 : 0) + 2;
            case 9:
                C24027 c24028 = this.f25983;
                if (c24028 != null) {
                    iM52874 = c24028.m52873();
                    i = iM52874 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 10:
                int i2 = (z ? 1 : 0) + 2;
                C24027 c24029 = this.f25983;
                int iM52875 = i2 + (c24029 == null ? 2 : c24029.m52873());
                C24027 c240210 = this.f25980;
                return iM52875 + (c240210 != null ? c240210.m52873() : 2);
            default:
                return z ? 1 : 0;
        }
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        boolean z;
        boolean z2 = this.f25978;
        if (!z2) {
            this.f25982 = EnumC1965.FULL_FRAME;
        }
        int i = C21308.f69330[this.f25982.ordinal()];
        boolean z3 = true;
        C18111 c18111 = this.f25985;
        switch (i) {
            case 1:
                if (!EnumC1965.SAME_FRAME.m6340(this.f25981)) {
                    c18111.mo2149(this.f25979, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(this.f25981), this.f25982.m6338());
                } else {
                    ((C23509) interfaceC19275).m51765(this.f25981);
                }
                break;
            case 2:
                C24027 c24027 = this.f25980;
                if (c24027 == null) {
                    c18111.mo2149(this.f25979, "Stack map element for the \"{0}\" entry type is absent", this.f25982.m6338());
                } else if (c24027.f77846.size() != 1) {
                    c18111.mo2149(this.f25979, "Should be only one stack map element for the \"{0}\" entry type", this.f25982.m6338());
                } else {
                    int i2 = this.f25981;
                    if (i2 >= 64) {
                        c18111.mo2149(this.f25979, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(i2), this.f25982.m6338());
                    } else {
                        C23509 c23509 = (C23509) interfaceC19275;
                        c23509.m51765(this.f25982.m6339() + this.f25981);
                        this.f25980.m52874(c23509);
                    }
                }
                break;
            case 3:
                C23509 c235010 = (C23509) interfaceC19275;
                c235010.m51765(this.f25982.m6339());
                C24027 c24028 = this.f25986;
                if (c24028 == null) {
                    c235010.m51770(0);
                } else {
                    c24028.m52872(c235010);
                }
                break;
            case 4:
                C24027 c24029 = this.f25980;
                if (c24029 == null) {
                    c18111.mo2149(this.f25979, "Locals map element for the \"{0}\" entry type is absent", this.f25982.m6338());
                } else if (c24029.f77846.size() != 1) {
                    c18111.mo2149(this.f25979, "Should be only one stack map element for the \"{0}\" entry type", this.f25982.m6338());
                } else {
                    C23509 c235011 = (C23509) interfaceC19275;
                    c235011.m51765(this.f25982.m6339());
                    c235011.m51770(this.f25981);
                    this.f25980.m52874(c235011);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f25980 != null) {
                    c18111.mo2149(this.f25979, "There are unexpected stack maps for the \"{0}\" entry type", this.f25982.m6338());
                    z = true;
                } else {
                    z = false;
                }
                if (this.f25983 != null) {
                    c18111.mo2149(this.f25979, "There are unexpected locals maps for the \"{0}\" entry type", this.f25982.m6338());
                } else {
                    z3 = z;
                }
                if (!z3) {
                    C23509 c235012 = (C23509) interfaceC19275;
                    c235012.m51765(this.f25982.m6339());
                    c235012.m51770(this.f25981);
                    break;
                }
                break;
            case 9:
                C24027 c240210 = this.f25983;
                if (c240210 == null) {
                    c18111.mo2149(this.f25979, "Locals map element for the \"{0}\" entry type is absent", this.f25982.m6338());
                } else if (c240210.f77846.size() > 3) {
                    c18111.mo2149(this.f25979, "There are more than locals map elements for the \"append_frame\" entry type", new Object[0]);
                } else {
                    C23509 c235013 = (C23509) interfaceC19275;
                    c235013.m51765((this.f25983.f77846.size() + this.f25982.m6339()) - 1);
                    c235013.m51770(this.f25981);
                    this.f25983.m52874(c235013);
                }
                break;
            case 10:
                if (z2) {
                    C23509 c235014 = (C23509) interfaceC19275;
                    c235014.m51765(this.f25982.m6339());
                    c235014.m51770(this.f25981);
                } else {
                    ((C23509) interfaceC19275).m51770(this.f25984);
                }
                C24027 c240211 = this.f25983;
                if (c240211 == null) {
                    ((C23509) interfaceC19275).m51770(0);
                } else {
                    c240211.m52872(interfaceC19275);
                }
                C24027 c240212 = this.f25980;
                if (c240212 == null) {
                    ((C23509) interfaceC19275).m51770(0);
                } else {
                    c240212.m52872(interfaceC19275);
                }
                break;
            default:
                c18111.mo2149(this.f25979, "StackMap entry type is not set", Integer.valueOf(this.f25982.m6339()));
                break;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC1965 m20916() {
        return this.f25982;
    }
}
