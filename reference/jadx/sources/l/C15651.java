package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܳ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15651 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f50859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f50862;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50863;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f50865;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50866;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f50867;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f50864 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50861 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f50860 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f50868 = new int[128];

    public C15651(int i, boolean z) {
        this.f50863 = i;
        this.f50867 = z;
        this.f50859 = new boolean[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37409(C0407 c0407) {
        if (c0407 == null) {
            throw new UnsupportedOperationException("Regex program encountered a missing node");
        }
        IdentityHashMap identityHashMap = this.f50860;
        Integer num = (Integer) identityHashMap.get(c0407);
        if (num != null) {
            return num.intValue();
        }
        ArrayList arrayList = this.f50864;
        if (arrayList.size() >= 268435454) {
            throw new UnsupportedOperationException("Regex program is too large");
        }
        int size = arrayList.size() * 8;
        arrayList.add(c0407);
        identityHashMap.put(c0407, Integer.valueOf(size));
        int i = size + 8;
        int[] iArr = this.f50868;
        if (i > iArr.length) {
            this.f50868 = Arrays.copyOf(this.f50868, (int) Math.min(2147483639L, Math.max(i, ((long) iArr.length) * 2)));
        }
        this.f50868[size + 1] = -1;
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37410(C0407 c0407, int i) {
        Class<?> cls = c0407.getClass();
        if (cls == C3390.class) {
            this.f50868[i] = 0;
            return;
        }
        if (c0407 == C5233.f18438) {
            this.f50868[i] = 23;
            return;
        }
        if (cls == C6374.class) {
            this.f50868[i] = 24;
            return;
        }
        if (cls == C10101.class) {
            m37407(i, c0407, ((C10101) c0407).f32356, 0, 0, 0, false);
            return;
        }
        if (cls == C18306.class) {
            m37407(i, c0407, ((C18306) c0407).f59698, 1, 0, 0, false);
            return;
        }
        if (cls == C16309.class || cls == C23769.class || cls == C7865.class || cls == C19052.class) {
            C16309 c16309 = (C16309) c0407;
            m37407(i, c0407, c16309.f52952, cls == C16309.class || cls == C23769.class ? 2 : 3, c16309.f52953, c16309.f52951, cls == C23769.class || cls == C19052.class);
            return;
        }
        if (cls == C2644.class) {
            C2644 c2644 = (C2644) c0407;
            if (c2644.f8451 == EnumC9355.INDEPENDENT) {
                m37407(i, c0407, c2644.f8452, 4, 0, 0, false);
                return;
            }
        }
        if (cls == C2644.class) {
            C2644 c2645 = (C2644) c0407;
            m37408(i, c0407, c2645.f8452, new C15673(c2645.f8451, 0, 1, -1, 0, true, false));
            return;
        }
        if (cls == C22782.class) {
            C22782 c22782 = (C22782) c0407;
            m37408(i, c0407, c22782.f73901, new C15673(c22782.f73900, c22782.f73902, c22782.f73899, -1, 0, false, false));
            return;
        }
        if (cls == C16814.class) {
            C16814 c16814 = (C16814) c0407;
            int i2 = c16814.f54248;
            m37401(i2);
            this.f50859[i2] = true;
            m37408(i, c0407, c16814.f54251, new C15673(c16814.f54246, c16814.f54250, c16814.f54252, c16814.f54248, c16814.f54249, false, c16814.f54247));
            return;
        }
        if (cls == C17055.class) {
            m37402(i, 34, c0407.f1952);
            int[] iArr = this.f50868;
            iArr[i + 2] = ((C17055) c0407).f55715;
            iArr[i + 3] = 0;
            return;
        }
        if (cls == C10342.class) {
            C10342 c10342 = (C10342) c0407;
            m37402(i, 34, c0407.f1952);
            int[] iArr2 = this.f50868;
            iArr2[i + 2] = c10342.f32949;
            iArr2[i + 3] = c10342.f32950 ? 2 : 1;
            return;
        }
        if (cls == C12339.class) {
            m37402(i, 35, c0407.f1952);
            return;
        }
        if (cls == C13656.class) {
            m37402(i, 36, c0407.f1952);
            return;
        }
        if (cls == C25020.class) {
            m37402(i, 37, c0407.f1952);
            return;
        }
        if (cls == C6945.class) {
            m37402(i, 39, c0407.f1952);
            return;
        }
        boolean z = this.f50867;
        if (cls == C0648.class) {
            C0648 c0648 = (C0648) c0407;
            Object objM34749 = z ? null : C14314.m34749(c0648);
            if (objM34749 != null) {
                int[] iArr3 = this.f50868;
                iArr3[i] = 17;
                iArr3[i + 2] = m37400(objM34749);
                return;
            } else {
                m37402(i, 15, c0407.f1952);
                this.f50868[i + 2] = m37400(new C3874(c0648.f2512, c0648.f2511));
                return;
            }
        }
        if (cls == C17801.class) {
            m37406(i, c0407, 0, false);
            this.f50866 = true;
            return;
        }
        if (cls == C5628.class) {
            m37406(i, c0407, 1, false);
            return;
        }
        if (cls == C1394.class) {
            m37406(i, c0407, 2, false);
            return;
        }
        if (cls == C0979.class) {
            m37406(i, c0407, 3, false);
            return;
        }
        if (cls == C19798.class) {
            m37406(i, c0407, 4, ((C19798) c0407).f63659);
            return;
        }
        if (cls == C9181.class) {
            m37406(i, c0407, 5, ((C9181) c0407).f29783);
            return;
        }
        if (cls == C23528.class) {
            m37406(i, c0407, 6, false);
            return;
        }
        if (cls == C4136.class) {
            m37402(i, 42, c0407.f1952);
            this.f50868[i + 2] = m37400(C5233.m15731(c0407));
            return;
        }
        if (cls == C6615.class) {
            C22036 c22036 = (C22036) c0407;
            m37402(i, 1, c22036.f1952);
            this.f50868[i + 2] = m37400(c22036.f71066);
            return;
        }
        if (cls == C21290.class) {
            m37402(i, 38, c0407.f1952);
            this.f50868[i + 2] = m37400(C5233.m15735(c0407));
            return;
        }
        if (cls == C22036.class || cls == C15322.class || cls == C2470.class || cls == C5869.class) {
            C22036 c22037 = (C22036) c0407;
            m37402(i, 2, c22037.f1952);
            this.f50868[i + 2] = m37400(c22037.f71066);
            return;
        }
        if (cls == C19624.class) {
            m37402(i, 3, c0407.f1952);
            this.f50868[i + 2] = m37400(((C19624) c0407).f19048.clone());
            return;
        }
        if (cls == C15148.class) {
            m37403(i, 28, (C5454) c0407, 1);
            return;
        }
        if (cls == C11419.class) {
            m37403(i, 29, (C5454) c0407, 2);
            return;
        }
        if (cls == C1725.class) {
            m37403(i, 30, (C5454) c0407, 3);
            return;
        }
        if (cls == C12911.class) {
            m37403(i, 31, (C5454) c0407, 4);
            return;
        }
        if (cls == C24846.class) {
            m37403(i, 32, (C5454) c0407, 5);
            return;
        }
        if (cls == C24515.class) {
            m37404(i, 4, (C10847) c0407);
            return;
        }
        if (cls == C10847.class || cls == C13085.class || cls == C8436.class) {
            m37404(i, 5, (C10847) c0407);
            return;
        }
        if (cls == C2140.class) {
            m37404(i, 33, (C10847) c0407);
            return;
        }
        if (cls == C8106.class) {
            C8106 c8106 = (C8106) c0407;
            int i3 = c8106.f26769;
            int[] iArr4 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                C0407 c0408 = c8106.f26768[i4];
                if (c0408 == null) {
                    c0408 = c8106.f26771.f1952;
                }
                iArr4[i4] = m37409(c0408);
            }
            int[] iArr5 = this.f50868;
            iArr5[i] = 6;
            iArr5[i + 2] = m37400(iArr4);
            return;
        }
        if (cls == C19293.class) {
            m37402(i, 11, c0407.f1952);
            return;
        }
        if (cls == C17560.class || cls == C14817.class) {
            C17560 c17560 = (C17560) c0407;
            m37402(i, c17560.f57061 ? 7 : 11, c0407.f1952);
            if (c17560.f57061) {
                int i5 = c17560.f57062;
                m37401(i5);
                this.f50868[i + 2] = i5;
                return;
            }
            return;
        }
        if (cls == C16068.class) {
            C16068 c16068 = (C16068) c0407;
            m37402(i, c16068.f52070 ? 8 : 11, c0407.f1952);
            if (c16068.f52070) {
                int i6 = c16068.f52068;
                m37401(i6);
                this.f50868[i + 2] = i6;
                this.f50868[i + 3] = c16068.f52069;
                return;
            }
            return;
        }
        if (cls != C1153.class) {
            if (cls == C20544.class) {
                m37405(i, 27, (C14576) c0407);
                return;
            } else {
                if (cls == C14576.class) {
                    m37405(i, 10, (C14576) c0407);
                    return;
                }
                throw new UnsupportedOperationException("Regex program does not support node: ".concat(cls.getName()));
            }
        }
        C14576 c14576 = ((C1153) c0407).f4259;
        if (c14576.getClass() == C20544.class) {
            m37405(i, 26, c14576);
            return;
        }
        if (z) {
            m37405(i, 9, c14576);
            return;
        }
        Object objM42052 = C18044.m42052(c14576);
        if (objM42052 != null) {
            int[] iArr6 = this.f50868;
            iArr6[i] = 21;
            iArr6[i + 2] = m37400(objM42052);
            return;
        }
        Object objM19090 = C6857.m19090(c14576);
        if (objM19090 == null) {
            Object objM7666 = C2250.m7666(c14576);
            if (objM7666 == null) {
                m37405(i, 9, c14576);
                return;
            }
            int[] iArr7 = this.f50868;
            iArr7[i] = 20;
            iArr7[i + 2] = m37400(objM7666);
            return;
        }
        m37402(i, 14, c14576.f1952);
        this.f50868[i + 2] = m37400(objM19090);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37408(int i, C0407 c0407, C0407 c0408, C15673 c15673) {
        m37402(i, 25, c0407.f1952);
        int iM37409 = m37409(c0408);
        this.f50868[i + 2] = m37400(c15673);
        this.f50868[i + 3] = iM37409;
        this.f50865 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37406(int i, C0407 c0407, int i2, boolean z) {
        m37402(i, 16, c0407.f1952);
        int[] iArr = this.f50868;
        iArr[i + 2] = i2;
        iArr[i + 3] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37407(int i, C0407 c0407, C0407 c0408, int i2, int i3, int i4, boolean z) {
        m37402(i, 22, c0407.f1952);
        this.f50868[i + 2] = i2;
        int iM37409 = m37409(c0408);
        int[] iArr = this.f50868;
        iArr[i + 3] = iM37409;
        iArr[i + 4] = i3;
        iArr[i + 5] = i4;
        iArr[i + 6] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37403(int i, int i2, C5454 c5454, int i3) {
        m37402(i, i2, c5454.f1952);
        this.f50868[i + 2] = m37400(c5454.f19048.clone());
        this.f50868[i + 3] = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37404(int i, int i2, C10847 c10847) {
        m37402(i, i2, c10847.f1952);
        this.f50868[i + 2] = m37400(c10847.f34347);
        this.f50868[i + 3] = c10847.f34348;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37405(int i, int i2, C14576 c14576) {
        if ((c14576.getClass() != C14576.class && c14576.getClass() != C20544.class) || c14576.f45930 < -1) {
            throw new UnsupportedOperationException("Regex program does not support this loop kind");
        }
        if (c14576.getClass() == C14576.class && c14576.f45930 >= 0) {
            i2 = i2 == 9 ? 18 : 19;
        }
        m37402(i, i2, c14576.f1952);
        int i3 = c14576.f45931;
        m37401(i3);
        this.f50868[i + 2] = i3;
        int i4 = c14576.f45933;
        m37401(i4);
        this.f50868[i + 3] = i4;
        int[] iArr = this.f50868;
        iArr[i + 4] = c14576.f45932;
        iArr[i + 5] = c14576.f45934;
        int iM37409 = m37409(c14576.f45929);
        int[] iArr2 = this.f50868;
        iArr2[i + 6] = iM37409;
        int i5 = c14576.f45930;
        if (i5 >= 0) {
            iArr2[i + 7] = i5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37401(int i) {
        if (i < 0 || i >= this.f50863) {
            throw new UnsupportedOperationException("Regex program encountered an invalid local register");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m37400(Object obj) {
        ArrayList arrayList = this.f50861;
        int size = arrayList.size();
        arrayList.add(obj);
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37402(int i, int i2, C0407 c0407) {
        int iM37409 = m37409(c0407);
        int[] iArr = this.f50868;
        iArr[i] = i2;
        iArr[i + 1] = iM37409;
    }
}
