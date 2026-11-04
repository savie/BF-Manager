package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7033 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12803 f23202;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f23203;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23204;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9269[] f23205;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C8524[] f23206;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12275 f23207;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC24188[] f23208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23209;

    public C7033(C24738 c24738, int i, int i2, int i3, AbstractC24188[] abstractC24188Arr, C8524[] c8524Arr, C9269[] c9269Arr) {
        super(c24738);
        this.f23204 = i;
        this.f23209 = i2;
        this.f23203 = i3;
        this.f23202 = null;
        this.f23208 = abstractC24188Arr;
        this.f23206 = c8524Arr;
        this.f23205 = c9269Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7033 m19356(C24738 c24738, int i, ArrayList arrayList) {
        AbstractC24188[] abstractC24188Arr;
        if (arrayList.size() > 0) {
            AbstractC24188[] abstractC24188Arr2 = new AbstractC24188[arrayList.size()];
            arrayList.toArray(abstractC24188Arr2);
            abstractC24188Arr = abstractC24188Arr2;
        } else {
            abstractC24188Arr = null;
        }
        return (C7033) c24738.f80103.m38079(new C7033(c24738, i, 1, 0, abstractC24188Arr, null, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7033 m19358(C24738 c24738) {
        int i;
        C8524[] c8524Arr;
        C9269 c9269;
        C12231 c12231 = this.f23207.f39463.f19208.f53973;
        if (c12231 == null) {
            i = 0;
        } else {
            int iM46864 = 0;
            for (C20436 c20436 : c12231.f39367) {
                iM46864 += c20436.m46864();
            }
            i = iM46864;
        }
        if ((this.f23207.f39462 & EnumC6266.STATIC.getValue()) == 0) {
            i++;
        }
        this.f23209 = i;
        ArrayList arrayList = new ArrayList(3);
        C8524[] c8524Arr2 = this.f23206;
        C9269[] c9269Arr = null;
        if (c8524Arr2 == null) {
            c8524Arr = null;
        } else {
            C8524[] c8524Arr3 = new C8524[c8524Arr2.length];
            int i2 = 0;
            while (true) {
                C8524[] c8524Arr4 = this.f23206;
                if (i2 >= c8524Arr4.length) {
                    break;
                }
                C8524 c8524 = c8524Arr4[i2];
                C9269 c92610 = c8524.f27851;
                C2558[] c2558Arr = c92610.f30150;
                if (c2558Arr == null) {
                    c9269 = null;
                } else {
                    C2558[] c2558Arr2 = new C2558[c2558Arr.length];
                    int i3 = 0;
                    while (true) {
                        C2558[] c2558Arr3 = c92610.f30150;
                        if (i3 >= c2558Arr3.length) {
                            break;
                        }
                        C2558 c2558 = c2558Arr3[i3];
                        c2558Arr2[i3] = new C2558(C20436.m46859(c2558.f8225.m46860(), c24738), c2558.m8593());
                        i3++;
                    }
                    c9269 = new C9269(c2558Arr2, c92610.m24459());
                }
                arrayList.add(c9269);
                c8524Arr3[i2] = new C8524(c8524.m22837(), c8524.m22838(), c9269);
                i2++;
            }
            c8524Arr = c8524Arr3;
        }
        if (arrayList.size() > 0) {
            c9269Arr = new C9269[arrayList.size()];
            arrayList.toArray(c9269Arr);
        }
        C9269[] c9269Arr2 = c9269Arr;
        int i4 = this.f23204;
        int i5 = this.f23209;
        int i6 = this.f23203;
        AbstractC24188[] abstractC24188Arr = this.f23208;
        for (AbstractC24188 abstractC24188 : abstractC24188Arr) {
            switch (C1067.f3827[abstractC24188.mo2083().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC14490 abstractC14490 = (AbstractC14490) abstractC24188;
                    int i7 = C1067.f3828[abstractC24188.f78334.f25843.ordinal()];
                    if (i7 == 1) {
                        abstractC14490.m35001(((C13548) abstractC14490.m35002()).m33265(c24738));
                    } else if (i7 == 2) {
                        abstractC14490.m35001(((C5520) abstractC14490.m35002()).m16436(c24738));
                    } else if (i7 == 3) {
                        abstractC14490.m35001(C20436.m46859(((C20436) abstractC14490.m35002()).m46860(), c24738));
                    } else if (i7 == 4) {
                        abstractC14490.m35001(C3282.m10820(((C3282) abstractC14490.m35002()).m10827(), c24738));
                    }
                    break;
            }
        }
        return (C7033) c24738.f80103.m38079(new C7033(c24738, i4, i5, i6, abstractC24188Arr, c8524Arr, c9269Arr2));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738;
        AbstractC24188 abstractC24188Mo1149;
        this.f23204 = c4028.m13002();
        this.f23209 = c4028.m13002();
        this.f23203 = c4028.m13002();
        int iM13002 = c4028.m13002();
        C12803 c12803 = (C12803) c17452.m40955(EnumC15214.TYPE_DEBUG_INFO_ITEM, c4028.m12995());
        this.f23202 = c12803;
        if (c12803 != null) {
            c12803.m31754(this);
        }
        int iM12995 = c4028.m12995();
        ArrayList arrayList = new ArrayList();
        byte[] bArrM13001 = c4028.m13001(iM12995 * 2);
        int iMo2082 = 0;
        while (true) {
            int length = bArrM13001.length;
            c24738 = this.f34102;
            if (iMo2082 >= length) {
                break;
            }
            try {
                EnumC7779 enumC7779M21152 = EnumC7779.m21152(bArrM13001[iMo2082]);
                if (enumC7779M21152 == null) {
                    System.err.println("Unknown opcode  address: " + C14301.m34740(iMo2082));
                    break;
                }
                EnumC7779 enumC7779 = EnumC7779.f25668;
                if (enumC7779M21152 == enumC7779) {
                    byte b = bArrM13001[iMo2082 + 1];
                    if (b == 0) {
                        abstractC24188Mo1149 = new C9291(enumC7779, 0);
                    } else if (b == 1) {
                        abstractC24188Mo1149 = new C23442(bArrM13001, iMo2082);
                    } else if (b == 2) {
                        abstractC24188Mo1149 = new C12253(bArrM13001, iMo2082);
                    } else {
                        abstractC24188Mo1149 = b != 3 ? null : new C0343(bArrM13001, iMo2082);
                    }
                } else {
                    abstractC24188Mo1149 = enumC7779M21152.f25847.f25942.mo1149(c24738, enumC7779M21152, bArrM13001, iMo2082);
                }
                arrayList.add(abstractC24188Mo1149);
                iMo2082 += abstractC24188Mo1149.mo2082(iMo2082 / 2) * 2;
            } catch (Exception e) {
                throw C14468.m34931("Error occurred at code address " + (iMo2082 * 2), e);
            }
        }
        AbstractC24188[] abstractC24188Arr = new AbstractC24188[arrayList.size()];
        this.f23208 = abstractC24188Arr;
        arrayList.toArray(abstractC24188Arr);
        if (iM13002 > 0) {
            c4028.m12993(4);
            int iM12992 = c4028.m12992();
            c4028.m12996((iM13002 * 8) + iM12992);
            int iM12993 = c4028.m12992();
            int iM12998 = c4028.m12998();
            C7757 c7757 = new C7757(iM12998);
            this.f23205 = new C9269[iM12998];
            for (int i = 0; i < iM12998; i++) {
                try {
                    int iM12994 = c4028.m12992() - iM12993;
                    this.f23205[i] = new C9269(c24738, c4028);
                    c7757.m21126(iM12994, this.f23205[i]);
                } catch (Exception e2) {
                    throw C14468.m34931("Error while reading EncodedCatchHandler at index " + i, e2);
                }
            }
            int iM12996 = c4028.m12992();
            c4028.m12996(iM12992);
            this.f23206 = new C8524[iM13002];
            for (int i2 = 0; i2 < iM13002; i2++) {
                try {
                    this.f23206[i2] = new C8524(c4028, c7757);
                } catch (Exception e3) {
                    throw C14468.m34931("Error while reading TryItem at index " + i2, e3);
                }
            }
            c4028.m12996(iM12996);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        if (this.f23207 == null) {
            return C4791.m14766(new StringBuilder("code_item @0x"), this.f34103);
        }
        return "code_item @0x" + Integer.toHexString(this.f34103) + " (" + this.f23207.f39463.m16437() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C7033 c7033) {
        C12275 c12275 = this.f23207;
        if (c12275 == null) {
            return c7033.f23207 == null ? 0 : -1;
        }
        C12275 c12276 = c7033.f23207;
        if (c12276 == null) {
            return 1;
        }
        return c12275.f39463.compareTo(c12276.f39463);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19359(C12275 c12275) {
        this.f23207 = c12275;
    }

    public final C12275 getParent() {
        return this.f23207;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        int iMo2082 = 0;
        for (AbstractC24188 abstractC24188 : this.f23208) {
            iMo2082 += abstractC24188.mo2082(iMo2082);
        }
        int iM31436 = C12669.m31436(iMo2082, 2, 16, i);
        C8524[] c8524Arr = this.f23206;
        if (c8524Arr != null && c8524Arr.length > 0) {
            int length = (c8524Arr.length * 8) + ((iM31436 + 3) & (-4));
            iM31436 = C6929.m19213(this.f23205.length) + length;
            for (C9269 c9269 : this.f23205) {
                iM31436 = C9269.m24456(iM31436, length, c9269);
            }
        }
        return iM31436;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        int iMo2082 = 0;
        for (AbstractC24188 abstractC24188 : this.f23208) {
            iMo2082 += abstractC24188.mo2082(iMo2082);
        }
        c24166.m54139(this.f23204);
        c24166.m54139(this.f23209);
        c24166.m54139(this.f23203);
        C8524[] c8524Arr = this.f23206;
        if (c8524Arr == null) {
            c24166.m54139(0);
        } else {
            c24166.m54139(c8524Arr.length);
        }
        C12803 c12803 = this.f23202;
        if (c12803 == null) {
            c24166.m54134(0);
        } else {
            c24166.m54134(c12803.f34103);
        }
        c24166.m54134(iMo2082);
        int iM54171 = 0;
        for (AbstractC24188 abstractC24189 : this.f23208) {
            iM54171 = abstractC24189.m54171(c24166, iM54171);
        }
        C8524[] c8524Arr2 = this.f23206;
        if (c8524Arr2 == null || c8524Arr2.length <= 0) {
            return;
        }
        if (iM54171 % 2 != 0) {
            c24166.m54139(0);
        }
        for (C8524 c8524 : this.f23206) {
            C8524.m22836(c8524, c24166);
        }
        c24166.m54135(this.f23205.length);
        for (C9269 c9269 : this.f23205) {
            C9269.m24458(c9269, c24166);
        }
    }
}
