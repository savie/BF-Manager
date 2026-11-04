package l;

import java.time.Duration;

/* JADX INFO: renamed from: l.ۜۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C7070 {
    public static C18257 convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return C18257.ofSeconds(duration.getSeconds(), duration.getNano());
    }
}
