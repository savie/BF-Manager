package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public final class C22576 extends AbstractC23282 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f73582;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73583;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f73584;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 f73585;

    public C22576(ArrayList arrayList, ArrayList arrayList2, AbstractC23282 abstractC23282, ArrayList arrayList3) {
        this.f73582 = arrayList;
        this.f73583 = arrayList2;
        this.f73585 = abstractC23282;
        this.f73584 = arrayList3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC23282.m51359(sb, "<", this.f73582, "> ");
        sb.append(this.f73585);
        AbstractC23282.m51358(sb, " (", this.f73583, MotionUtils.EASING_TYPE_FORMAT_END);
        AbstractC23282.m51359(sb, " throws ", this.f73584, "");
        return sb.toString();
    }
}
