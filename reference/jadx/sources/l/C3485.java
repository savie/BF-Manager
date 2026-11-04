package l;

import android.text.Selection;
import android.view.View;

/* JADX INFO: renamed from: l.ۗܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3485 extends C19147 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C23623 f12037 = new C23623();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12038;

    @Override // l.C19147
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo11457() {
        return true;
    }

    public C3485(String str) {
        super(0);
        C17359.requireNonNull(str);
        this.f12038 = str;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo11454() {
        return this.f12038;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11456(View view, C23255 c23255) {
        int[] iArrM11453 = m11453(c23255.m54021());
        if (iArrM11453 != null) {
            c23255.mo52316(iArrM11453[0], iArrM11453[1]);
            return;
        }
        int iM53968 = c23255.m53968();
        int iM53882 = c23255.m53882();
        if (iM53968 != iM53882) {
            c23255.mo52339(iM53882);
        }
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11455(View view, InterfaceC7960 interfaceC7960) {
        C24132 c24132Mo10928 = interfaceC7960.mo10928();
        if (c24132Mo10928 == null) {
            return;
        }
        int[] iArrM11453 = m11453(c24132Mo10928.m54021());
        if (iArrM11453 != null) {
            c24132Mo10928.mo52316(iArrM11453[0], iArrM11453[1]);
            c24132Mo10928.m54065();
        } else {
            int iM53968 = c24132Mo10928.m53968();
            int iM53882 = c24132Mo10928.m53882();
            if (iM53968 != iM53882) {
                c24132Mo10928.mo52339(iM53882);
            }
        }
        c24132Mo10928.m53931(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m11453(InterfaceC19106 interfaceC19106) {
        StringBuilder sb = new StringBuilder();
        int selectionEnd = Selection.getSelectionEnd(interfaceC19106);
        int[] iArr = {Selection.getSelectionStart(interfaceC19106), selectionEnd};
        int i = iArr[0];
        if (i > selectionEnd) {
            iArr[0] = selectionEnd;
            iArr[1] = i;
        }
        InterfaceC8360 interfaceC8360M25642 = C9851.m25642(this.f12038.toCharArray());
        int[] iArr2 = null;
        while (interfaceC8360M25642.hasNext()) {
            char cMo5320 = interfaceC8360M25642.mo5320();
            if (cMo5320 == '$' && interfaceC8360M25642.hasNext()) {
                char cMo5321 = interfaceC8360M25642.mo5320();
                if (cMo5321 == '$') {
                    sb.append('$');
                } else if (cMo5321 != 'E') {
                    if (cMo5321 == 'S') {
                        iArr2 = new int[]{sb.length(), sb.length()};
                    } else if (cMo5321 == 'T') {
                        sb.append(interfaceC19106.subSequence(iArr[0], iArr[1]).toString());
                    }
                } else if (iArr2 != null) {
                    iArr2[1] = sb.length();
                } else {
                    iArr2 = new int[]{sb.length(), sb.length()};
                }
            } else {
                sb.append(cMo5320);
            }
        }
        interfaceC19106.replace(iArr[0], iArr[1], sb.toString());
        if (iArr2 != null) {
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[0];
        }
        return iArr2;
    }
}
