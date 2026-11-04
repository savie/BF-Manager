package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6IUK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f15532;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f15533;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15534;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14716[] f15535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f15536;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12479 f15537;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f15538;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12479 f15539;

    public C4276(C12479 c12479, int i, int i2) {
        this.f15537 = c12479;
        this.f15539 = c12479.m30987();
        this.f15535 = new C14716[i];
        this.f15534 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13631(int i, List list) {
        if (list.isEmpty()) {
            this.f15538 = Collections.EMPTY_LIST;
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = size - 1; i2 >= 0; i2--) {
            char cCharAt = ((String) list.get(i2)).charAt(0);
            i -= (cCharAt == 'D' || cCharAt == 'J') ? 2 : 1;
            iArr[i2] = i;
        }
        this.f15532 = iArr;
        this.f15538 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19310 m13630(int i) {
        C12479 c12479;
        int iM31011;
        C12479 c124710 = this.f15537;
        c124710.m30988(i);
        this.f15533 = new ArrayList();
        this.f15536 = new HashMap();
        int iM50647 = C22463.m50647(c124710);
        int iM50648 = C22463.m50647(c124710);
        int size = this.f15538.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            c12479 = this.f15539;
            if (i2 >= iM50648) {
                break;
            }
            String strM30998 = c12479.m30998(C22463.m50647(c124710) - 1);
            if (strM30998 != null && i2 < size) {
                C14716 c14716 = new C14716(strM30998, this.f15532[i2], (String) this.f15538.get(i2), null);
                m13629(c14716, 0);
                c14716.m35404();
                z = true;
            }
            i2++;
        }
        int iMin = 0;
        while (true) {
            int iM31002 = c124710.m31002();
            int i3 = this.f15534;
            C14716[] c14716Arr = this.f15535;
            if (iM31002 == 0) {
                if (z) {
                    for (C14716 c14717 : c14716Arr) {
                        if (c14717 != null && !c14717.m35406() && c14717.m35403(i3 - 1)) {
                            this.f15533.add(c14717);
                        }
                    }
                }
                return new C19310(this.f15536, this.f15533);
            }
            switch (iM31002) {
                case 1:
                    iMin = Math.min(C22463.m50647(c124710) + iMin, i3 - 1);
                    break;
                case 2:
                    iM31011 = c124710.m31011() + iM50647;
                    iM50647 = iM31011;
                    break;
                case 3:
                    m13629(new C14716(this.f15539, C22463.m50647(c124710), C22463.m50647(c124710) - 1, C22463.m50647(c124710) - 1, -1), iMin);
                    z = true;
                    break;
                case 4:
                    m13629(new C14716(this.f15539, C22463.m50647(c124710), C22463.m50647(c124710) - 1, C22463.m50647(c124710) - 1, C22463.m50647(c124710) - 1), iMin);
                    z = true;
                    break;
                case 5:
                    C14716 c14718 = c14716Arr[C22463.m50647(c124710)];
                    if (c14718 != null && c14718.m35403(iMin)) {
                        this.f15533.add(c14718);
                    }
                    z = true;
                    break;
                case 6:
                    int iM50649 = C22463.m50647(c124710);
                    C14716 c14719 = c14716Arr[iM50649];
                    if (c14719 != null) {
                        if (c14719.m35403(iMin)) {
                            this.f15533.add(c14719);
                        }
                        m13629(new C14716(c14719.getName(), iM50649, c14719.getType(), c14719.getSignature()), iMin);
                    }
                    z = true;
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    c12479.m30998(C22463.m50647(c124710) - 1);
                    break;
                default:
                    int i4 = iM31002 - 10;
                    iMin = Math.min((i4 / 15) + iMin, i3 - 1);
                    iM31011 = ((i4 % 15) - 4) + iM50647;
                    this.f15536.put(Integer.valueOf(iMin), Integer.valueOf(iM31011));
                    iM50647 = iM31011;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13629(C14716 c14716, int i) {
        int iMo24789 = c14716.mo24789();
        C14716[] c14716Arr = this.f15535;
        C14716 c14717 = c14716Arr[iMo24789];
        if (c14717 != null && c14717.m35403(i)) {
            this.f15533.add(c14717);
        }
        c14716.m35405(i);
        c14716Arr[iMo24789] = c14716;
    }
}
