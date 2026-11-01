package l;

import android.view.Menu;
import android.view.MenuItem;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1529 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f6230;

    public C1529(C16195 c16195, String str, boolean z) {
        Menu menuM38298;
        this.f6230 = str;
        String strM32189 = C13012.m32189(30, C6730.m18175(str));
        String strM321810 = C13012.m32189(30, str.replace('/', '.'));
        CharSequence charSequenceM32189 = C13012.m32189(30, str);
        CharSequence charSequenceM321810 = C13012.m32189(30, "L" + str + l.b);
        if (z) {
            menuM38298 = c16195.m38298().addSubMenu(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            menuM38298 = c16195.m38298();
        }
        menuM38298.add(R.string.MT_Protector, 0, 0, strM32189);
        if (!strM32189.equals(strM321810)) {
            menuM38298.add(R.string.MT_Protector, 1, 0, strM321810);
        }
        if (!strM321810.equals(charSequenceM32189)) {
            menuM38298.add(R.string.MT_Protector, 2, 0, charSequenceM32189);
        }
        menuM38298.add(R.string.MT_Protector, 3, 0, charSequenceM321810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5303(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            return true;
        }
        if (menuItem.getGroupId() != R.string.MT_Protector) {
            return false;
        }
        int itemId = menuItem.getItemId();
        String str = this.f6230;
        if (itemId == 0) {
            C16737.m39272((CharSequence) C6730.m18175(str));
        } else if (itemId == 1) {
            C16737.m39272((CharSequence) str.replace('/', '.'));
        } else if (itemId == 2) {
            C16737.m39272((CharSequence) str);
        } else if (itemId == 3) {
            C16737.m39272((CharSequence) ("L" + str + l.b));
        }
        return true;
    }
}
