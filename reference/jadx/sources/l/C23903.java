package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 667N */
/* JADX INFO: loaded from: classes.dex */
public class C23903 extends C4511 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f77386;

    public C23903() {
        this.f77386 = 0;
    }

    public C23903(int i, InterfaceC17189 interfaceC17189) {
        super(interfaceC17189);
        this.f77386 = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("MismatchedTokenException(");
        sb.append(m14235());
        sb.append("!=");
        return C12669.m31437(this.f77386, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
