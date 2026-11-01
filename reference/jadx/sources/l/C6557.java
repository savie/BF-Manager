package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6557 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22786 f22099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17782(C4440 c4440) {
        int i = c4440.f15812;
        int i2 = c4440.f15806;
        C22786 c22786 = this.f22099;
        ArrayList arrayList = c22786.f74170;
        if (c22786.f74169 == null) {
            CharSequence charSequence = c4440.f15813;
            c22786.f74169 = charSequence instanceof String ? c4440 : new C4440(c4440.f15811, i2, i, charSequence.toString());
        }
        c22786.f74171++;
        if (arrayList.size() >= 2) {
            c22786.f74168 = true;
            return;
        }
        CharSequence charSequence2 = c4440.f15813;
        int iCodePointCount = i - i2 > 240 ? UMErrorCode.E_UM_BE_EMPTY_URL_PATH : Character.codePointCount(charSequence2, i2, i);
        int iM20043 = iCodePointCount > 120 ? C7521.m20043(i2, 0, charSequence2) : C7521.m20043(i2, -((120 - iCodePointCount) / 2), charSequence2);
        String strM20036 = C7521.m20036(iM20043, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, charSequence2);
        arrayList.add(new C10313(strM20036, iM20043, c4440.f15806, c4440.f15812, iM20043 > 0 || strM20036.length() + iM20043 < charSequence2.length()));
    }
}
