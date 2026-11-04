package l;

import android.view.Menu;
import android.view.MenuItem;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0408 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f1953;

    public C0408(C18452 c18452, String str, boolean z) {
        Menu menuM42995;
        this.f1953 = str;
        String strM44060 = C18969.m44060(30, C11293.m28558(str));
        String strM44061 = C18969.m44060(30, str.replace('/', '.'));
        CharSequence charSequenceM44060 = C18969.m44060(30, str);
        CharSequence charSequenceM44061 = C18969.m44060(30, "L" + str + l.b);
        if (z) {
            menuM42995 = c18452.m42995().addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            menuM42995 = c18452.m42995();
        }
        menuM42995.add(R.string.MT_Protector, 0, 0, strM44060);
        if (!strM44060.equals(strM44061)) {
            menuM42995.add(R.string.MT_Protector, 1, 0, strM44061);
        }
        if (!strM44061.equals(charSequenceM44060)) {
            menuM42995.add(R.string.MT_Protector, 2, 0, charSequenceM44060);
        }
        menuM42995.add(R.string.MT_Protector, 3, 0, charSequenceM44061);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2214(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            return true;
        }
        if (menuItem.getGroupId() != R.string.MT_Protector) {
            return false;
        }
        int itemId = menuItem.getItemId();
        String str = this.f1953;
        if (itemId == 0) {
            C21576.m49067((CharSequence) C11293.m28558(str));
        } else if (itemId == 1) {
            C21576.m49067((CharSequence) str.replace('/', '.'));
        } else if (itemId == 2) {
            C21576.m49067((CharSequence) str);
        } else if (itemId == 3) {
            C21576.m49067((CharSequence) ("L" + str + l.b));
        }
        return true;
    }
}
