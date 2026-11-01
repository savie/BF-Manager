package l;

import android.text.Selection;
import android.view.View;

/* JADX INFO: renamed from: l.ܽۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16346 extends C13607 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C0117 f52632 = new C0117();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f52633;

    @Override // l.C13607
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo33244() {
        return true;
    }

    public C16346(String str) {
        super(0);
        C13638.requireNonNull(str);
        this.f52633 = str;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final String mo33246() {
        return this.f52633;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final void mo33248(View view, C10948 c10948) {
        int[] iArrM38513 = m38513(c10948.m17000());
        if (iArrM38513 != null) {
            c10948.mo16839(iArrM38513[0], iArrM38513[1]);
            return;
        }
        int iM16916 = c10948.m16916();
        int iM17020 = c10948.m17020();
        if (iM16916 != iM17020) {
            c10948.mo17029(iM17020);
        }
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final void mo33247(View view, InterfaceC4433 interfaceC4433) {
        C6111 c6111Mo11315 = interfaceC4433.mo11315();
        if (c6111Mo11315 == null) {
            return;
        }
        int[] iArrM38513 = m38513(c6111Mo11315.m17000());
        if (iArrM38513 != null) {
            c6111Mo11315.mo16839(iArrM38513[0], iArrM38513[1]);
            c6111Mo11315.m17033();
        } else {
            int iM16916 = c6111Mo11315.m16916();
            int iM17020 = c6111Mo11315.m17020();
            if (iM16916 != iM17020) {
                c6111Mo11315.mo17029(iM17020);
            }
        }
        c6111Mo11315.m16886(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m38513(InterfaceC2916 interfaceC2916) {
        StringBuilder sb = new StringBuilder();
        int selectionEnd = Selection.getSelectionEnd(interfaceC2916);
        int[] iArr = {Selection.getSelectionStart(interfaceC2916), selectionEnd};
        int i = iArr[0];
        if (i > selectionEnd) {
            iArr[0] = selectionEnd;
            iArr[1] = i;
        }
        InterfaceC20921 interfaceC20921M44571 = C19510.m44571(this.f52633.toCharArray());
        int[] iArr2 = null;
        while (interfaceC20921M44571.hasNext()) {
            char cMo1416 = interfaceC20921M44571.mo1416();
            if (cMo1416 == '$' && interfaceC20921M44571.hasNext()) {
                char cMo1417 = interfaceC20921M44571.mo1416();
                if (cMo1417 == '$') {
                    sb.append('$');
                } else if (cMo1417 != 'E') {
                    if (cMo1417 == 'S') {
                        iArr2 = new int[]{sb.length(), sb.length()};
                    } else if (cMo1417 == 'T') {
                        sb.append(interfaceC2916.subSequence(iArr[0], iArr[1]).toString());
                    }
                } else if (iArr2 != null) {
                    iArr2[1] = sb.length();
                } else {
                    iArr2 = new int[]{sb.length(), sb.length()};
                }
            } else {
                sb.append(cMo1416);
            }
        }
        interfaceC2916.replace(iArr[0], iArr[1], sb.toString());
        if (iArr2 != null) {
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[0];
        }
        return iArr2;
    }
}
