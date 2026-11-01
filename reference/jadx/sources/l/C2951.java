package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 667N */
/* JADX INFO: loaded from: classes2.dex */
public class C2951 extends C22085 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f11055;

    public C2951() {
        this.f11055 = 0;
    }

    public C2951(int i, InterfaceC14242 interfaceC14242) {
        super(interfaceC14242);
        this.f11055 = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("MismatchedTokenException(");
        sb.append(m49026());
        sb.append("!=");
        return C12441.m30911(this.f11055, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
