package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5614 extends C7043 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16594() {
        ArrayList arrayList = new ArrayList(values());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            return ((C13071) arrayList.get(0)).m32550();
        }
        StringBuilder sb = new StringBuilder("(?:");
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            String strM32550 = ((C13071) it.next()).m32550();
            if (strM32550.isEmpty()) {
                z = true;
            } else {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append('|');
                }
                sb.append(strM32550);
            }
        }
        sb.append(z ? ")?" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
