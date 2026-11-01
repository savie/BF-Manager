package l;

import java.time.Duration;

/* JADX INFO: renamed from: l.᩵᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C19697 {
    public static C21813 convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return C21813.s(duration.getSeconds(), duration.getNano());
    }

    public static Duration convert(C21813 c21813) {
        if (c21813 == null) {
            return null;
        }
        return Duration.ofSeconds(c21813.a, c21813.b);
    }
}
