package l;

import java.util.Date;

/* JADX INFO: renamed from: l.᩷ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21835 {
    public static Date from(C0358 c0358) {
        try {
            return new Date(c0358.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
