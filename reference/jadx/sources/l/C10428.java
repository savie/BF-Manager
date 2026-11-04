package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1480 f33156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26781(C3717 c3717) {
        int i = c3717.f12781;
        int i2 = c3717.f12778;
        C1480 c1480 = this.f33156;
        ArrayList arrayList = c1480.f5146;
        if (c1480.f5145 == null) {
            CharSequence charSequence = c3717.f12779;
            c1480.f5145 = charSequence instanceof String ? c3717 : new C3717(c3717.f12776, i2, i, charSequence.toString());
        }
        c1480.f5147++;
        if (arrayList.size() >= 2) {
            c1480.f5148 = true;
            return;
        }
        CharSequence charSequence2 = c3717.f12779;
        int iCodePointCount = i - i2 > 240 ? UMErrorCode.E_UM_BE_EMPTY_URL_PATH : Character.codePointCount(charSequence2, i2, i);
        int iM4324 = iCodePointCount > 120 ? C1173.m4324(i2, 0, charSequence2) : C1173.m4324(i2, -((120 - iCodePointCount) / 2), charSequence2);
        String strM4317 = C1173.m4317(iM4324, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, charSequence2);
        arrayList.add(new C3214(strM4317, iM4324, c3717.f12778, c3717.f12781, iM4324 > 0 || strM4317.length() + iM4324 < charSequence2.length()));
    }
}
