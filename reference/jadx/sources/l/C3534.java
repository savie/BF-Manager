package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3534 extends AbstractC4280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f12134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 f12135;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f12136;

    public C3534(ArrayList arrayList, ArrayList arrayList2, AbstractC4280 abstractC4280, ArrayList arrayList3) {
        this.f12136 = arrayList;
        this.f12133 = arrayList2;
        this.f12135 = abstractC4280;
        this.f12134 = arrayList3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC4280.m13642(sb, "<", this.f12136, "> ");
        sb.append(this.f12135);
        AbstractC4280.m13641(sb, " (", this.f12133, MotionUtils.EASING_TYPE_FORMAT_END);
        AbstractC4280.m13642(sb, " throws ", this.f12134, "");
        return sb.toString();
    }
}
