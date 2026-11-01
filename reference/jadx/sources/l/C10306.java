package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10306 extends C15818 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26121() {
        ArrayList arrayList = new ArrayList(values());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            return ((C8895) arrayList.get(0)).m23145();
        }
        StringBuilder sb = new StringBuilder("(?:");
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            String strM23145 = ((C8895) it.next()).m23145();
            if (strM23145.isEmpty()) {
                z = true;
            } else {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append('|');
                }
                sb.append(strM23145);
            }
        }
        sb.append(z ? ")?" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
