package l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes.dex */
public final class C23595 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19865 f76600;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76602;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Integer f76603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f76604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f76605;

    public C23595(ArrayList arrayList, C14228 c14228) {
        Integer numValueOf = Integer.valueOf(BasicLabelFormatter.MILLION);
        this.f76600 = new C19865();
        ArrayList arrayList2 = new ArrayList();
        this.f76602 = arrayList2;
        this.f76601 = 0;
        this.f76604 = true;
        this.f76605 = arrayList;
        arrayList2.add(c14228);
        this.f76603 = numValueOf;
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo22279() {
        return this.f76604;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f76600;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        CharSequence charSequenceM34537 = interfaceC4753.getLine().m34537();
        int iM18955 = C6790.m18955('|', charSequenceM34537, interfaceC4753.mo14654());
        if (iM18955 == -1) {
            return null;
        }
        if (iM18955 == interfaceC4753.mo14654() && C6790.m18956(iM18955 + 1, charSequenceM34537.length(), charSequenceM34537) == charSequenceM34537.length()) {
            this.f76604 = false;
            return null;
        }
        return C7932.m21504(interfaceC4753.getIndex());
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo7445(C14228 c14228) {
        this.f76602.add(c14228);
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo22277(InterfaceC23180 interfaceC23180) {
        C19865 c19865 = this.f76600;
        List listM14263 = c19865.m14263();
        C5280 c5280 = !listM14263.isEmpty() ? (C5280) listM14263.get(0) : null;
        C1966 c1966 = new C1966();
        if (c5280 != null) {
            c1966.m14257(c5280);
        }
        c19865.m14256(c1966);
        C11660 c11660 = new C11660();
        c11660.m14255(c1966.m14263());
        c1966.m14256(c11660);
        ArrayList arrayList = this.f76602;
        ArrayList arrayListM52834 = m52834((C14228) arrayList.get(0));
        int size = arrayListM52834.size();
        for (int i = 0; i < size; i++) {
            C5695 c5695M52833 = m52833((C14228) arrayListM52834.get(i), i, interfaceC23180);
            c5695M52833.m16722();
            c11660.m14256(c5695M52833);
        }
        int i2 = 2;
        C15389 c15389 = null;
        while (i2 < arrayList.size()) {
            C14228 c14228 = (C14228) arrayList.get(i2);
            C5280 c5281 = i2 < listM14263.size() ? (C5280) listM14263.get(i2) : null;
            ArrayList arrayListM52835 = m52834(c14228);
            C11660 c11661 = new C11660();
            if (c5281 != null) {
                c11661.m14257(c5281);
            }
            int i3 = 0;
            while (i3 < size) {
                c11661.m14256(m52833(i3 < arrayListM52835.size() ? (C14228) arrayListM52835.get(i3) : C14228.m34536("", (C5280) null), i3, interfaceC23180));
                i3++;
            }
            if (c15389 == null) {
                c15389 = new C15389();
                c19865.m14256(c15389);
            }
            c15389.m14256(c11661);
            c15389.m14257(c5281);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5695 m52833(C14228 c14228, int i, InterfaceC23180 interfaceC23180) {
        Integer num = this.f76603;
        if (num != null) {
            if (this.f76601 >= num.intValue()) {
                throw new IllegalArgumentException("Aborting parsing because maximum number of cells reached (maxCells = " + num + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            this.f76601++;
        }
        C5695 c5695 = new C5695();
        C5280 c5280M34539 = c14228.m34539();
        if (c5280M34539 != null) {
            c5695.m14257(c5280M34539);
        }
        ArrayList arrayList = this.f76605;
        if (i < arrayList.size()) {
            c5695.m16720(((C16135) arrayList.get(i)).m38316());
        }
        CharSequence charSequenceM34537 = c14228.m34537();
        int iM18956 = C6790.m18956(0, charSequenceM34537.length(), charSequenceM34537);
        C14228 c14228M34538 = c14228.m34538(iM18956, C6790.m18973(charSequenceM34537.length() - 1, iM18956, charSequenceM34537) + 1);
        C20942 c20942 = new C20942();
        c20942.m47874(c14228M34538);
        interfaceC23180.mo11851(c20942, c5695);
        return c5695;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52834(C14228 c14228) {
        CharSequence charSequenceM34537 = c14228.m34537();
        int iM18956 = C6790.m18956(0, charSequenceM34537.length(), charSequenceM34537);
        int length = charSequenceM34537.length();
        if (charSequenceM34537.charAt(iM18956) == '|') {
            iM18956++;
            length = C6790.m18973(charSequenceM34537.length() - 1, iM18956, charSequenceM34537) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iM18956;
        while (iM18956 < length) {
            char cCharAt = charSequenceM34537.charAt(iM18956);
            if (cCharAt == '\\') {
                int i2 = iM18956 + 1;
                if (i2 < length && charSequenceM34537.charAt(i2) == '|') {
                    sb.append('|');
                    iM18956 = i2;
                } else {
                    sb.append('\\');
                }
            } else if (cCharAt == '|') {
                arrayList.add(C14228.m34536(sb.toString(), c14228.m34538(i, iM18956).m34539()));
                sb.setLength(0);
                i = iM18956 + 1;
            } else {
                sb.append(cCharAt);
            }
            iM18956++;
        }
        if (sb.length() > 0) {
            arrayList.add(C14228.m34536(sb.toString(), c14228.m34538(i, c14228.m34537().length()).m34539()));
        }
        return arrayList;
    }
}
