package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܶᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15417 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean[] f50255;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f50257;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f50258;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f50259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f50261;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50262;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f50253 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f50260 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f50256 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f50254 = new int[128];

    public C15417(int i, boolean z) {
        this.f50258 = i;
        this.f50261 = z;
        this.f50255 = new boolean[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36885(C23595 c23595) {
        if (c23595 == null) {
            throw new UnsupportedOperationException("Regex program encountered a missing node");
        }
        IdentityHashMap identityHashMap = this.f50256;
        Integer num = (Integer) identityHashMap.get(c23595);
        if (num != null) {
            return num.intValue();
        }
        ArrayList arrayList = this.f50253;
        if (arrayList.size() >= 268435454) {
            throw new UnsupportedOperationException("Regex program is too large");
        }
        int size = arrayList.size() * 8;
        arrayList.add(c23595);
        identityHashMap.put(c23595, Integer.valueOf(size));
        int i = size + 8;
        int[] iArr = this.f50254;
        if (i > iArr.length) {
            this.f50254 = Arrays.copyOf(this.f50254, (int) Math.min(2147483639L, Math.max(i, ((long) iArr.length) * 2)));
        }
        this.f50254[size + 1] = -1;
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36886(C23595 c23595, int i) {
        Class<?> cls = c23595.getClass();
        if (cls == C20772.class) {
            this.f50254[i] = 0;
            return;
        }
        if (c23595 == C22141.f71668) {
            this.f50254[i] = 23;
            return;
        }
        if (cls == C0310.class) {
            this.f50254[i] = 24;
            return;
        }
        if (cls == C9484.class) {
            m36883(i, c23595, ((C9484) c23595).f32081, 0, 0, 0, false);
            return;
        }
        if (cls == C10895.class) {
            m36883(i, c23595, ((C10895) c23595).f37077, 1, 0, 0, false);
            return;
        }
        if (cls == C10499.class || cls == C7676.class || cls == C14423.class || cls == C1721.class) {
            C10499 c10499 = (C10499) c23595;
            m36883(i, c23595, c10499.f35966, cls == C10499.class || cls == C7676.class ? 2 : 3, c10499.f35964, c10499.f35965, cls == C7676.class || cls == C1721.class);
            return;
        }
        if (cls == C13758.class) {
            C13758 c13758 = (C13758) c23595;
            if (c13758.f45370 == EnumC4584.INDEPENDENT) {
                m36883(i, c23595, c13758.f45371, 4, 0, 0, false);
                return;
            }
        }
        if (cls == C13758.class) {
            C13758 c13759 = (C13758) c23595;
            m36884(i, c23595, c13759.f45371, new C22847(c13759.f45370, 0, 1, -1, 0, true, false));
            return;
        }
        if (cls == C3837.class) {
            C3837 c3837 = (C3837) c23595;
            m36884(i, c23595, c3837.f14308, new C22847(c3837.f14306, c3837.f14305, c3837.f14307, -1, 0, false, false));
            return;
        }
        if (cls == C19361.class) {
            C19361 c19361 = (C19361) c23595;
            int i2 = c19361.f62408;
            m36877(i2);
            this.f50255[i2] = true;
            m36884(i, c23595, c19361.f62413, new C22847(c19361.f62412, c19361.f62410, c19361.f62409, c19361.f62408, c19361.f62414, false, c19361.f62411));
            return;
        }
        if (cls == C19671.class) {
            m36881(i, 34, c23595.f76439);
            int[] iArr = this.f50254;
            iArr[i + 2] = ((C19671) c23595).f63153;
            iArr[i + 3] = 0;
            return;
        }
        if (cls == C9793.class) {
            C9793 c9793 = (C9793) c23595;
            m36881(i, 34, c23595.f76439);
            int[] iArr2 = this.f50254;
            iArr2[i + 2] = c9793.f33516;
            iArr2[i + 3] = c9793.f33517 ? 2 : 1;
            return;
        }
        if (cls == C20067.class) {
            m36881(i, 35, c23595.f76439);
            return;
        }
        if (cls == C5207.class) {
            m36881(i, 36, c23595.f76439);
            return;
        }
        if (cls == C8072.class) {
            m36881(i, 37, c23595.f76439);
            return;
        }
        if (cls == C2384.class) {
            m36881(i, 39, c23595.f76439);
            return;
        }
        boolean z = this.f50261;
        if (cls == C23904.class) {
            C23904 c23904 = (C23904) c23595;
            Object objM40163 = z ? null : C17223.m40163(c23904);
            if (objM40163 != null) {
                int[] iArr3 = this.f50254;
                iArr3[i] = 17;
                iArr3[i + 2] = m36876(objM40163);
                return;
            } else {
                m36881(i, 15, c23595.f76439);
                this.f50254[i + 2] = m36876(new C12285(c23904.f77456, c23904.f77455));
                return;
            }
        }
        if (cls == C9088.class) {
            m36882(i, c23595, 0, false);
            this.f50257 = true;
            return;
        }
        if (cls == C21477.class) {
            m36882(i, c23595, 1, false);
            return;
        }
        if (cls == C3441.class) {
            m36882(i, c23595, 2, false);
            return;
        }
        if (cls == C3173.class) {
            m36882(i, c23595, 3, false);
            return;
        }
        if (cls == C6660.class) {
            m36882(i, c23595, 4, ((C6660) c23595).f22511);
            return;
        }
        if (cls == C4501.class) {
            m36882(i, c23595, 5, ((C4501) c23595).f16008);
            return;
        }
        if (cls == C7366.class) {
            m36882(i, c23595, 6, false);
            return;
        }
        if (cls == C12306.class) {
            m36881(i, 42, c23595.f76439);
            this.f50254[i + 2] = m36876(C22141.m49102(c23595));
            return;
        }
        if (cls == C0619.class) {
            C1015 c1015 = (C1015) c23595;
            m36881(i, 1, c1015.f76439);
            this.f50254[i + 2] = m36876(c1015.f4704);
            return;
        }
        if (cls == C5955.class) {
            m36881(i, 38, c23595.f76439);
            this.f50254[i + 2] = m36876(C22141.m49108(c23595));
            return;
        }
        if (cls == C1015.class || cls == C22889.class || cls == C13675.class || cls == C21787.class) {
            C1015 c1016 = (C1015) c23595;
            m36881(i, 2, c1016.f76439);
            this.f50254[i + 2] = m36876(c1016.f4704);
            return;
        }
        if (cls == C6701.class) {
            m36881(i, 3, c23595.f76439);
            this.f50254[i + 2] = m36876(((C6701) c23595).f69912.clone());
            return;
        }
        if (cls == C22930.class) {
            m36880(i, 28, (C21518) c23595, 1);
            return;
        }
        if (cls == C18696.class) {
            m36880(i, 29, (C21518) c23595, 2);
            return;
        }
        if (cls == C17990.class) {
            m36880(i, 30, (C21518) c23595, 3);
            return;
        }
        if (cls == C15169.class) {
            m36880(i, 31, (C21518) c23595, 4);
            return;
        }
        if (cls == C8113.class) {
            m36880(i, 32, (C21518) c23595, 5);
            return;
        }
        if (cls == C16848.class) {
            m36878(i, 4, (C13011) c23595);
            return;
        }
        if (cls == C13011.class || cls == C15128.class || cls == C11558.class) {
            m36878(i, 5, (C13011) c23595);
            return;
        }
        if (cls == C18259.class) {
            m36878(i, 33, (C13011) c23595);
            return;
        }
        if (cls == C14732.class) {
            C14732 c14732 = (C14732) c23595;
            int i3 = c14732.f48160;
            int[] iArr4 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                C23595 c23596 = c14732.f48161[i4];
                if (c23596 == null) {
                    c23596 = c14732.f48159.f76439;
                }
                iArr4[i4] = m36885(c23596);
            }
            int[] iArr5 = this.f50254;
            iArr5[i] = 6;
            iArr5[i + 2] = m36876(iArr4);
            return;
        }
        if (cls == C2030.class) {
            m36881(i, 11, c23595.f76439);
            return;
        }
        if (cls == C8778.class || cls == C17553.class) {
            C8778 c8778 = (C8778) c23595;
            m36881(i, c8778.f30196 ? 7 : 11, c23595.f76439);
            if (c8778.f30196) {
                int i5 = c8778.f30197;
                m36877(i5);
                this.f50254[i + 2] = i5;
                return;
            }
            return;
        }
        if (cls == C10189.class) {
            C10189 c10189 = (C10189) c23595;
            m36881(i, c10189.f34813 ? 8 : 11, c23595.f76439);
            if (c10189.f34813) {
                int i6 = c10189.f34814;
                m36877(i6);
                this.f50254[i + 2] = i6;
                this.f50254[i + 3] = c10189.f34815;
                return;
            }
            return;
        }
        if (cls != C3132.class) {
            if (cls == C15834.class) {
                m36879(i, 27, (C17244) c23595);
                return;
            } else {
                if (cls == C17244.class) {
                    m36879(i, 10, (C17244) c23595);
                    return;
                }
                throw new UnsupportedOperationException("Regex program does not support node: ".concat(cls.getName()));
            }
        }
        C17244 c17244 = ((C3132) c23595).f11790;
        if (c17244.getClass() == C15834.class) {
            m36879(i, 26, c17244);
            return;
        }
        if (z) {
            m36879(i, 9, c17244);
            return;
        }
        Object objM27243 = C10874.m27243(c17244);
        if (objM27243 != null) {
            int[] iArr6 = this.f50254;
            iArr6[i] = 21;
            iArr6[i + 2] = m36876(objM27243);
            return;
        }
        Object objM8344 = C2736.m8344(c17244);
        if (objM8344 == null) {
            Object objM41596 = C17907.m41596(c17244);
            if (objM41596 == null) {
                m36879(i, 9, c17244);
                return;
            }
            int[] iArr7 = this.f50254;
            iArr7[i] = 20;
            iArr7[i + 2] = m36876(objM41596);
            return;
        }
        m36881(i, 14, c17244.f76439);
        this.f50254[i + 2] = m36876(objM8344);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36884(int i, C23595 c23595, C23595 c23596, C22847 c22847) {
        m36881(i, 25, c23595.f76439);
        int iM36885 = m36885(c23596);
        this.f50254[i + 2] = m36876(c22847);
        this.f50254[i + 3] = iM36885;
        this.f50262 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36882(int i, C23595 c23595, int i2, boolean z) {
        m36881(i, 16, c23595.f76439);
        int[] iArr = this.f50254;
        iArr[i + 2] = i2;
        iArr[i + 3] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36883(int i, C23595 c23595, C23595 c23596, int i2, int i3, int i4, boolean z) {
        m36881(i, 22, c23595.f76439);
        this.f50254[i + 2] = i2;
        int iM36885 = m36885(c23596);
        int[] iArr = this.f50254;
        iArr[i + 3] = iM36885;
        iArr[i + 4] = i3;
        iArr[i + 5] = i4;
        iArr[i + 6] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36880(int i, int i2, C21518 c21518, int i3) {
        m36881(i, i2, c21518.f76439);
        this.f50254[i + 2] = m36876(c21518.f69912.clone());
        this.f50254[i + 3] = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36878(int i, int i2, C13011 c13011) {
        m36881(i, i2, c13011.f76439);
        this.f50254[i + 2] = m36876(c13011.f43382);
        this.f50254[i + 3] = c13011.f43383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36879(int i, int i2, C17244 c17244) {
        if ((c17244.getClass() != C17244.class && c17244.getClass() != C15834.class) || c17244.f54940 < -1) {
            throw new UnsupportedOperationException("Regex program does not support this loop kind");
        }
        if (c17244.getClass() == C17244.class && c17244.f54940 >= 0) {
            i2 = i2 == 9 ? 18 : 19;
        }
        m36881(i, i2, c17244.f76439);
        int i3 = c17244.f54945;
        m36877(i3);
        this.f50254[i + 2] = i3;
        int i4 = c17244.f54944;
        m36877(i4);
        this.f50254[i + 3] = i4;
        int[] iArr = this.f50254;
        iArr[i + 4] = c17244.f54942;
        iArr[i + 5] = c17244.f54941;
        int iM36885 = m36885(c17244.f54943);
        int[] iArr2 = this.f50254;
        iArr2[i + 6] = iM36885;
        int i5 = c17244.f54940;
        if (i5 >= 0) {
            iArr2[i + 7] = i5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36877(int i) {
        if (i < 0 || i >= this.f50258) {
            throw new UnsupportedOperationException("Regex program encountered an invalid local register");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m36876(Object obj) {
        ArrayList arrayList = this.f50260;
        int size = arrayList.size();
        arrayList.add(obj);
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36881(int i, int i2, C23595 c23595) {
        int iM36885 = m36885(c23595);
        int[] iArr = this.f50254;
        iArr[i] = i2;
        iArr[i + 1] = iM36885;
    }
}
